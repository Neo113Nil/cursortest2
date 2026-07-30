package com.crrepa.band.my.device.watchfacenew.photo;

import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.watchfacenew.photo.model.event.NewCustomWatchFaceMsgUpdateEvent;
import com.crrepa.ble.conn.bean.CRPHisiliconWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPJieliPhotoWatchFaceInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceConfigInfo;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceLayoutInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceElementInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceScreenInfo;
import com.crrepa.ble.conn.callback.CRPWatchFaceScreenCallback;
import com.crrepa.ble.conn.callback.CRPWatchFaceTimeStyleCallback;
import com.crrepa.ble.conn.listener.CRPPhotoWatchFaceChangeListener;
import com.crrepa.ble.conn.type.CRPPhotoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPWatchFaceTimeStyle;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.utils.x0;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public class b implements CRPPhotoWatchFaceChangeListener {
    private boolean layoutInfoReceived;
    private boolean watchFaceConfigReceived = false;
    private boolean watchFaceInfoReceived;

    public static class a implements CRPWatchFaceScreenCallback {
        @Override // com.crrepa.ble.conn.callback.CRPWatchFaceScreenCallback
        public void onScreenInfo(CRPWatchFaceScreenInfo cRPWatchFaceScreenInfo) {
            if (cRPWatchFaceScreenInfo != null) {
                Log.d("CustomPhotoListener", "crpWatchFaceScreenInfo = " + cRPWatchFaceScreenInfo);
                z1.j.saveCRPWatchFaceScreenInfo(cRPWatchFaceScreenInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queryHisiliconWatchFaceTimeStyle$0(CRPWatchFaceType cRPWatchFaceType, CRPWatchFaceTimeStyle cRPWatchFaceTimeStyle) {
        Log.d("CustomPhotoListener", "queryWatchFaceTimeStyle: watchFaceType=" + cRPWatchFaceType + ",timeStyle=" + cRPWatchFaceTimeStyle);
        y1.c.save(cRPWatchFaceType, cRPWatchFaceTimeStyle);
        org.greenrobot.eventbus.c.getDefault().post(new NewCustomWatchFaceMsgUpdateEvent());
    }

    private void queryHisiliconWatchFaceTimeStyle() {
        Log.d("CustomPhotoListener", "queryWatchFaceTimeStyle()");
        y1.c.save(CRPWatchFaceType.AI_WATCH_FACE, CRPWatchFaceTimeStyle.NUMBER);
        i4.getInstance().queryHisiliconWatchFaceTimeStyle(CRPWatchFaceType.PHOTO_WATCH_FACE, new CRPWatchFaceTimeStyleCallback() { // from class: com.crrepa.band.my.device.watchfacenew.photo.a
            @Override // com.crrepa.ble.conn.callback.CRPWatchFaceTimeStyleCallback
            public final void onTimeStyle(CRPWatchFaceType cRPWatchFaceType, CRPWatchFaceTimeStyle cRPWatchFaceTimeStyle) {
                b.lambda$queryHisiliconWatchFaceTimeStyle$0(cRPWatchFaceType, cRPWatchFaceTimeStyle);
            }
        });
    }

    private void showLayoutInfoUI() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            if (this.watchFaceConfigReceived && this.layoutInfoReceived) {
                org.greenrobot.eventbus.c.getDefault().post(new NewCustomWatchFaceMsgUpdateEvent());
                Log.d("CustomPhotoListener", "showLayoutInfoUI");
                return;
            }
            return;
        }
        if (this.watchFaceInfoReceived && this.layoutInfoReceived && this.watchFaceConfigReceived) {
            org.greenrobot.eventbus.c.getDefault().post(new NewCustomWatchFaceMsgUpdateEvent());
            Log.d("CustomPhotoListener", "showLayoutInfoUI");
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPPhotoWatchFaceChangeListener
    public void onAvailableSize(int i8, int i9) {
        Log.d("CustomPhotoListener", "platform = " + i8 + ",size = " + i9);
        com.crrepa.band.my.device.watchfacenew.delegate.img.m.savePhotoWatchFacePlatform(i8);
        com.crrepa.band.my.device.watchfacenew.delegate.img.m.savePhotoWatchFaceAvailableSize(i9);
        if (i8 != 1) {
            i4.getInstance().queryJieliPhotoWatchFace();
            i4.getInstance().queryJieliPhotoWatchFaceLayout();
            return;
        }
        i4.getInstance().queryHisiliconPhotoWatchFaceInfo();
        i4.getInstance().queryHisiliconPhotoWatchFaceDisplayMode();
        queryHisiliconWatchFaceTimeStyle();
        i4.getInstance().queryHisiliconWatchFaceElementInfo();
        i4.getInstance().queryHisiliconWatchFaceLayout(CRPWatchFaceType.PHOTO_WATCH_FACE);
        i4.getInstance().queryHisiliconWatchFaceScreenInfo(new a());
    }

    @Override // com.crrepa.ble.conn.listener.CRPPhotoWatchFaceChangeListener
    public void onDisplayMode(CRPPhotoWatchFaceDisplayMode cRPPhotoWatchFaceDisplayMode) {
        if (cRPPhotoWatchFaceDisplayMode == null) {
            Log.d("CustomPhotoListener", "CRPPhotoWatchFaceDisplayMode = null");
        } else {
            Log.d("CustomPhotoListener", "displayMode = " + ((int) cRPPhotoWatchFaceDisplayMode.getValue()));
        }
        com.crrepa.band.my.device.watchfacenew.delegate.displaymode.a.savePhotoDisplayMode(cRPPhotoWatchFaceDisplayMode);
    }

    @Override // com.crrepa.ble.conn.listener.CRPPhotoWatchFaceChangeListener
    public void onJieliPhotoWatchFace(CRPJieliPhotoWatchFaceInfo cRPJieliPhotoWatchFaceInfo) {
        if (cRPJieliPhotoWatchFaceInfo == null) {
            Log.d("CustomPhotoListener", "jieliPhotoWatchFaceInfo=null");
            com.crrepa.band.my.device.watchfacenew.delegate.img.m.deletePhoto();
            CRPWatchFaceType cRPWatchFaceType = CRPWatchFaceType.PHOTO_WATCH_FACE;
            com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.deleteSelectedHandId(cRPWatchFaceType);
            com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.deleteSelectedPointerPreviewPath(cRPWatchFaceType);
            org.greenrobot.eventbus.c.getDefault().post(new NewCustomWatchFaceMsgUpdateEvent());
        } else {
            Log.d("CustomPhotoListener", "jieliPhotoWatchFaceInfo= " + cRPJieliPhotoWatchFaceInfo);
            com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.saveSelectedHandId(CRPWatchFaceType.PHOTO_WATCH_FACE, cRPJieliPhotoWatchFaceInfo.getWatchHandID());
        }
        com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.saveJieliPhotoWatchFaceInfo(CRPWatchFaceType.PHOTO_WATCH_FACE, cRPJieliPhotoWatchFaceInfo);
        this.watchFaceInfoReceived = true;
        showLayoutInfoUI();
    }

    @Override // com.crrepa.ble.conn.listener.CRPPhotoWatchFaceChangeListener
    public void onJieliWatchFaceConfig(CRPJieliWatchFaceConfigInfo cRPJieliWatchFaceConfigInfo) {
        int maxPhotoCount;
        if (cRPJieliWatchFaceConfigInfo == null) {
            Log.d("CustomPhotoListener", "onJieliWatchFaceConfig=null");
            maxPhotoCount = 8;
        } else {
            Log.d("CustomPhotoListener", "onJieliWatchFaceConfig= " + cRPJieliWatchFaceConfigInfo);
            maxPhotoCount = cRPJieliWatchFaceConfigInfo.getMaxPhotoCount();
        }
        com.crrepa.band.my.device.watchfacenew.delegate.img.m.savePhotoWatchFaceMaxCount(maxPhotoCount);
        com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.saveJieliWatchFaceConfigInfo(cRPJieliWatchFaceConfigInfo);
        if (!com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.isJieliWatchFaceConfigInfoSynced()) {
            File file = new File(com.crrepa.band.my.device.watchfacenew.delegate.img.i.getPresetImgPath());
            if (file.exists()) {
                file.delete();
            }
        }
        com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.saveJieliWatchFaceConfigInfoSynced(true);
        this.watchFaceConfigReceived = true;
        showLayoutInfoUI();
    }

    @Override // com.crrepa.ble.conn.listener.CRPPhotoWatchFaceChangeListener
    public void onJieliWatchFaceLayout(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo) {
        CRPPhotoWatchFaceDisplayMode cRPPhotoWatchFaceDisplayMode = CRPPhotoWatchFaceDisplayMode.FIXED;
        if (cRPJieliWatchFaceLayoutInfo == null) {
            Log.d("CustomPhotoListener", "jieliWatchFaceLayoutInfo=null");
        } else {
            Log.d("CustomPhotoListener", "jieliWatchFaceLayoutInfo= " + cRPJieliWatchFaceLayoutInfo);
            cRPPhotoWatchFaceDisplayMode = cRPJieliWatchFaceLayoutInfo.getPhotoDisplayMode();
        }
        com.crrepa.band.my.device.watchfacenew.delegate.displaymode.a.savePhotoDisplayMode(cRPPhotoWatchFaceDisplayMode);
        com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.saveJieliWatchFaceLayoutInfo(CRPWatchFaceType.PHOTO_WATCH_FACE, cRPJieliWatchFaceLayoutInfo);
        this.layoutInfoReceived = true;
        showLayoutInfoUI();
    }

    @Override // com.crrepa.ble.conn.listener.CRPPhotoWatchFaceChangeListener
    public void onSavedWatchFace(List<String> list) {
        if (!x0.isEmpty(list)) {
            Log.d("CustomPhotoListener", "onSavedWatchFace = " + new Gson().toJson(list));
            return;
        }
        Log.d("CustomPhotoListener", "onSavedWatchFace = null");
        com.crrepa.band.my.device.watchfacenew.delegate.img.m.deletePhoto();
        com.moyoung.dafit.module.common.network.provider.g gVar = com.moyoung.dafit.module.common.network.provider.g.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append(y1.c.HISILICON_WATCH_FACE_TIME_STYLE);
        CRPWatchFaceType cRPWatchFaceType = CRPWatchFaceType.PHOTO_WATCH_FACE;
        sb.append((int) cRPWatchFaceType.getValue());
        gVar.remove(sb.toString());
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(z1.j.HISILICON_WATCH_FACE_LAYOUT_INFO + ((int) cRPWatchFaceType.getValue()));
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(com.crrepa.band.my.device.watchfacenew.delegate.displaymode.a.PHOTO_WATCH_FACE_DISPLAY_MODE);
        i4.getInstance().resetHisiliconWatchFace(cRPWatchFaceType);
    }

    @Override // com.crrepa.ble.conn.listener.CRPPhotoWatchFaceChangeListener
    public void onWatchFaceElementInfo(CRPWatchFaceElementInfo cRPWatchFaceElementInfo) {
        if (cRPWatchFaceElementInfo == null) {
            Log.d("CustomPhotoListener", "watchFaceElementInfo = null");
        } else {
            Log.d("CustomPhotoListener", "watchFaceElementInfo = " + cRPWatchFaceElementInfo);
        }
        z1.j.saveCRPWatchFaceElementInfo(cRPWatchFaceElementInfo);
        this.watchFaceConfigReceived = true;
        showLayoutInfoUI();
    }

    @Override // com.crrepa.ble.conn.listener.CRPPhotoWatchFaceChangeListener
    public void onWatchFaceLayout(CRPHisiliconWatchFaceLayoutInfo cRPHisiliconWatchFaceLayoutInfo) {
        if (cRPHisiliconWatchFaceLayoutInfo == null) {
            Log.d("CustomPhotoListener", "onWatchFaceLayout=null");
        } else {
            Log.d("CustomPhotoListener", "onWatchFaceLayout= " + cRPHisiliconWatchFaceLayoutInfo);
        }
        z1.j.saveNewWatchFaceLayoutInfo(cRPHisiliconWatchFaceLayoutInfo);
        this.layoutInfoReceived = true;
        showLayoutInfoUI();
    }
}
