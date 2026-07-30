package com.crrepa.band.my.device.watchfacenew.delegate.upload.jieli;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.connect.f;
import com.crrepa.band.my.device.watchfacenew.delegate.img.h;
import com.crrepa.band.my.device.watchfacenew.delegate.img.i;
import com.crrepa.band.my.device.watchfacenew.delegate.img.m;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.s;
import com.crrepa.band.my.device.watchfacenew.delegate.upload.WatchFaceUploadFailDialog;
import com.crrepa.band.my.device.watchfacenew.photo.model.event.NewCustomWatchFaceMsgUpdateEvent;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.band.my.training.utils.l;
import com.crrepa.ble.conn.bean.CRPJieliWatchFaceConfigInfo;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.moyoung.dafit.module.common.baseui.BaseCustomUploadingDialog;
import com.moyoung.dafit.module.common.utils.g;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.x0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends com.crrepa.band.my.device.watchfacenew.delegate.upload.a implements com.crrepa.band.my.device.watchfacenew.delegate.upload.c {
    private final View preview;
    private final b uploadPresenter;

    public a(Fragment fragment, h hVar, com.crrepa.band.my.device.watchfacenew.delegate.displaymode.c cVar, View view, boolean z7) {
        super(fragment, hVar, cVar, z7);
        b bVar = new b();
        this.uploadPresenter = bVar;
        this.preview = view;
        bVar.setView(this);
    }

    public static Bitmap getThumbBitmap(View view) {
        Bitmap bitmapByView = l.getBitmapByView(view);
        CRPJieliWatchFaceConfigInfo jieliWatchFaceConfigInfo = com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.getJieliWatchFaceConfigInfo();
        Bitmap roundBitmap = g.getRoundBitmap(bitmapByView, jieliWatchFaceConfigInfo.getThumbWidth(), jieliWatchFaceConfigInfo.getThumbHeight(), jieliWatchFaceConfigInfo.getThumbCornerRadius());
        if (roundBitmap != null) {
            g.saveBitmap(roundBitmap, new File(g0.getPicturesFilePath(com.moyoung.dafit.module.common.utils.d.get(), "Pointer_WatchFace_Preview.png")));
        }
        return roundBitmap;
    }

    private void sendWatchFaceLayout() {
        this.pointerStyleDelegate.sendCustomWatchFaceLayout(this.displayModeDelegate.getDisplayMode(), Math.max(this.imgDelegate.getCheckedIndex(), 0));
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.a, com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void destroy() {
        this.uploadPresenter.destroy();
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderBandDisconnected() {
        r0.showLong(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.common_device_disconnected_tips));
        BaseCustomUploadingDialog baseCustomUploadingDialog = this.uploadingDialog;
        if (baseCustomUploadingDialog == null || !baseCustomUploadingDialog.isShowing()) {
            return;
        }
        this.fragment.requireActivity().finish();
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderLowBatteryHint() {
        r0.showLong(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.measure_low_battery_hint));
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderLowStorage() {
        r0.showLong(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.device_local_music_out_memory_tips));
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderPointerDownloadFailed() {
        r0.showLong("指针文件下载失败");
        BaseCustomUploadingDialog baseCustomUploadingDialog = this.uploadingDialog;
        if (baseCustomUploadingDialog == null || !baseCustomUploadingDialog.isShowing()) {
            return;
        }
        this.uploadingDialog.dismiss();
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public /* bridge */ /* synthetic */ void renderThumbTransCompleted() {
        com.crrepa.band.my.device.watchfacenew.delegate.upload.b.c(this);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderTransCompleted() {
        this.pointerStyleDelegate.saveWatchFaceInfo();
        this.imgDelegate.saveSentToBandImgNameList();
        sendWatchFaceLayout();
        org.greenrobot.eventbus.c.getDefault().post(new NewCustomWatchFaceMsgUpdateEvent());
        BaseCustomUploadingDialog baseCustomUploadingDialog = this.uploadingDialog;
        if (baseCustomUploadingDialog != null) {
            baseCustomUploadingDialog.dismiss();
        }
        this.fragment.requireActivity().finish();
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderTransError(int i8, List<String> list) {
        r0.showLong(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.device_watch_face_update_fail_alrt_title));
        BaseCustomUploadingDialog baseCustomUploadingDialog = this.uploadingDialog;
        if (baseCustomUploadingDialog != null) {
            baseCustomUploadingDialog.dismiss();
        }
        WatchFaceUploadFailDialog watchFaceUploadFailDialog = new WatchFaceUploadFailDialog(this.fragment.requireActivity());
        watchFaceUploadFailDialog.setCanceledOnTouchOutside(false);
        watchFaceUploadFailDialog.show();
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderTransProgressChanged(int i8) {
        BaseCustomUploadingDialog baseCustomUploadingDialog = this.uploadingDialog;
        if (baseCustomUploadingDialog != null) {
            baseCustomUploadingDialog.setProgress(i8);
        }
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderTransProgressStarting() {
        Log.d("NewCustomWatchFace", "renderTransProgressStarting");
        showUploadDialog();
        this.uploadingDialog.setProgress(0);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.a
    public void sendPhotoWatchFace(s sVar) {
        super.sendPhotoWatchFace(sVar);
        boolean isJieliWatchFaceConfigInfoSynced = com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.isJieliWatchFaceConfigInfoSynced();
        if (f.getInstance().isDisConnected() || !isJieliWatchFaceConfigInfoSynced) {
            renderBandDisconnected();
            return;
        }
        if (BandBatteryProvider.isOtaLowBattery()) {
            renderLowBatteryHint();
            return;
        }
        boolean z7 = this.isFromGallery == m.getSentToBandIsGallery();
        List<File> imgFileList = this.imgDelegate.getImgFileList();
        boolean isImgListNotChange = i.isImgListNotChange(imgFileList, this.isFromGallery);
        int selectedHandId = this.pointerStyleDelegate.getSelectedHandId();
        CRPWatchFaceType cRPWatchFaceType = CRPWatchFaceType.PHOTO_WATCH_FACE;
        boolean z8 = selectedHandId == com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.getSelectedHandId(cRPWatchFaceType);
        if (z7 && isImgListNotChange && z8) {
            sendWatchFaceLayout();
            org.greenrobot.eventbus.c.getDefault().post(new NewCustomWatchFaceMsgUpdateEvent());
            this.fragment.requireActivity().finish();
        } else {
            if (x0.isEmpty(imgFileList)) {
                imgFileList = new ArrayList<>();
                imgFileList.add(new File(i.getPresetImgPath()));
            }
            this.uploadPresenter.sendPhotoWatchFace(imgFileList, getThumbBitmap(this.preview), this.pointerStyleDelegate.getPointerBean(), cRPWatchFaceType);
        }
    }
}
