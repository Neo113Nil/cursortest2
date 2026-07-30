package com.crrepa.band.my.device.watchfacenew.video;

import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.watchfacenew.photo.model.event.NewCustomWatchFaceMsgUpdateEvent;
import com.crrepa.band.my.device.watchfacenew.video.model.event.VideoWatchFaceAvailableSizeEvent;
import com.crrepa.ble.conn.callback.CRPWatchFaceTimeStyleCallback;
import com.crrepa.ble.conn.listener.CRPVideoWatchFaceChangeListener;
import com.crrepa.ble.conn.type.CRPVideoWatchFaceDisplayMode;
import com.crrepa.ble.conn.type.CRPWatchFaceTimeStyle;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.moyoung.dafit.module.common.utils.x0;

/* loaded from: classes2.dex */
public class b implements CRPVideoWatchFaceChangeListener {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queryWatchFaceTimeStyle$0(CRPWatchFaceType cRPWatchFaceType, CRPWatchFaceTimeStyle cRPWatchFaceTimeStyle) {
        Log.d("VideoWatchFaceListener", "queryWatchFaceTimeStyle: watchFaceType=" + cRPWatchFaceType + ",timeStyle=" + cRPWatchFaceTimeStyle);
        y1.c.save(cRPWatchFaceType, cRPWatchFaceTimeStyle);
        org.greenrobot.eventbus.c.getDefault().post(new NewCustomWatchFaceMsgUpdateEvent());
    }

    private void queryWatchFaceTimeStyle() {
        Log.d("VideoWatchFaceListener", "queryWatchFaceTimeStyle()");
        i4.getInstance().queryHisiliconWatchFaceTimeStyle(CRPWatchFaceType.VIDEO_WATCH_FACE, new CRPWatchFaceTimeStyleCallback() { // from class: com.crrepa.band.my.device.watchfacenew.video.a
            @Override // com.crrepa.ble.conn.callback.CRPWatchFaceTimeStyleCallback
            public final void onTimeStyle(CRPWatchFaceType cRPWatchFaceType, CRPWatchFaceTimeStyle cRPWatchFaceTimeStyle) {
                b.lambda$queryWatchFaceTimeStyle$0(cRPWatchFaceType, cRPWatchFaceTimeStyle);
            }
        });
    }

    @Override // com.crrepa.ble.conn.listener.CRPVideoWatchFaceChangeListener
    public void onAvailableSize(int i8) {
        Log.d("VideoWatchFaceListener", "onAvailableSize: " + i8);
        v.saveAvailableSize(i8);
        org.greenrobot.eventbus.c.getDefault().post(new VideoWatchFaceAvailableSizeEvent());
        i4.getInstance().queryVideoWatchFaceInfo();
        i4.getInstance().queryHisiliconWatchFaceLayout(CRPWatchFaceType.VIDEO_WATCH_FACE);
        i4.getInstance().queryVideoWatchFaceDisplayMode();
        queryWatchFaceTimeStyle();
    }

    @Override // com.crrepa.ble.conn.listener.CRPVideoWatchFaceChangeListener
    public void onDisplayMode(CRPVideoWatchFaceDisplayMode cRPVideoWatchFaceDisplayMode) {
        Log.d("VideoWatchFaceListener", "onDisplayMode: " + cRPVideoWatchFaceDisplayMode);
        com.crrepa.band.my.device.watchfacenew.delegate.displaymode.a.saveVideoDisplayMode(cRPVideoWatchFaceDisplayMode);
    }

    @Override // com.crrepa.ble.conn.listener.CRPVideoWatchFaceChangeListener
    public void onSavedWatchFace(String str) {
        Log.d("VideoWatchFaceListener", "onSavedWatchFace: " + str);
        String savedVideoWatchFaceName = v.getSavedVideoWatchFaceName();
        if (x0.isEmpty(str) && x0.isNotEmpty(savedVideoWatchFaceName)) {
            v.deleteVideoFiles();
            com.moyoung.dafit.module.common.network.provider.g gVar = com.moyoung.dafit.module.common.network.provider.g.getInstance();
            StringBuilder sb = new StringBuilder();
            sb.append(y1.c.HISILICON_WATCH_FACE_TIME_STYLE);
            CRPWatchFaceType cRPWatchFaceType = CRPWatchFaceType.VIDEO_WATCH_FACE;
            sb.append((int) cRPWatchFaceType.getValue());
            gVar.remove(sb.toString());
            com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(z1.j.HISILICON_WATCH_FACE_LAYOUT_INFO + ((int) cRPWatchFaceType.getValue()));
            com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(com.crrepa.band.my.device.watchfacenew.delegate.displaymode.a.VIDEO_WATCH_FACE_DISPLAY_MODE);
            i4.getInstance().resetHisiliconWatchFace(cRPWatchFaceType);
        }
    }
}
