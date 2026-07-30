package com.crrepa.band.my.device.watchfacenew.delegate.upload.hisilicon;

import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchfacenew.delegate.img.m;
import com.crrepa.band.my.device.watchfacenew.delegate.upload.WatchFaceUploadFailDialog;
import com.crrepa.band.my.device.watchfacenew.photo.model.event.NewCustomWatchFaceMsgUpdateEvent;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.moyoung.dafit.module.common.baseui.BaseCustomUploadingDialog;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.x0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends com.crrepa.band.my.device.watchfacenew.delegate.upload.a implements com.crrepa.band.my.device.watchfacenew.delegate.upload.c {
    private final b uploadPresenter;

    public a(Fragment fragment, com.crrepa.band.my.device.watchfacenew.delegate.img.h hVar, com.crrepa.band.my.device.watchfacenew.delegate.displaymode.c cVar, boolean z7) {
        super(fragment, hVar, cVar, z7);
        b bVar = new b();
        this.uploadPresenter = bVar;
        bVar.setView(this);
    }

    private void sendPhotoWatchFaceDisplayMode() {
        this.displayModeDelegate.sendPhotoWatchFaceDisplayMode();
        m.saveSentToBandSelectedIndex(Math.max(this.imgDelegate.getCheckedIndex(), 0));
    }

    private void sendWatchFaceIndexAndThumb(int i8) {
        String checkedImgPath = this.imgDelegate.getCheckedImgPath();
        if (x0.isEmpty(checkedImgPath)) {
            checkedImgPath = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getPresetImgPath();
            if (!new File(checkedImgPath).exists()) {
                checkedImgPath = null;
            }
        }
        if (x0.isNotEmpty(checkedImgPath)) {
            this.uploadPresenter.sendWatchFaceIndexAndThumb(i8, BitmapFactory.decodeFile(checkedImgPath), this.timeStyleDelegate.isClockStyle());
        } else {
            this.uploadPresenter.sendWatchFaceIndex(i8);
            this.fragment.requireActivity().finish();
        }
    }

    private void sendWatchFaceLayout() {
        this.timeStyleDelegate.sendWatchFaceLayout();
    }

    private void sendWatchFaceTimeStyle() {
        this.timeStyleDelegate.sendWatchFaceTimeStyle();
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
    public void renderThumbTransCompleted() {
        sendWatchFaceTimeStyle();
        BaseCustomUploadingDialog baseCustomUploadingDialog = this.uploadingDialog;
        if (baseCustomUploadingDialog != null) {
            baseCustomUploadingDialog.dismiss();
        }
        this.fragment.requireActivity().finish();
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderTransCompleted() {
        this.uploadPresenter.sendPhotoWatchFaceOrder(this.imgDelegate.getImgNameSuffixlessList());
        sendWatchFaceLayout();
        sendPhotoWatchFaceDisplayMode();
        sendWatchFaceTimeStyle();
        this.imgDelegate.saveSentToBandImgNameList();
        org.greenrobot.eventbus.c.getDefault().post(new NewCustomWatchFaceMsgUpdateEvent());
        int max = Math.max(this.imgDelegate.getCheckedIndex(), 0);
        if (this.displayModeDelegate.isFixedMode()) {
            sendWatchFaceIndexAndThumb(max);
            return;
        }
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
    public void sendPhotoWatchFace(y1.b bVar) {
        super.sendPhotoWatchFace(bVar);
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isDisConnected()) {
            renderBandDisconnected();
            return;
        }
        if (BandBatteryProvider.isOtaLowBattery()) {
            renderLowBatteryHint();
            return;
        }
        boolean z7 = this.isFromGallery == m.getSentToBandIsGallery();
        List<File> imgFileList = this.imgDelegate.getImgFileList();
        boolean isImgListNotChange = com.crrepa.band.my.device.watchfacenew.delegate.img.i.isImgListNotChange(imgFileList, this.isFromGallery);
        int max = Math.max(this.imgDelegate.getCheckedIndex(), 0);
        boolean z8 = max != m.getSentToBandSelectedIndex();
        if (!z7 || !isImgListNotChange) {
            if (x0.isEmpty(imgFileList)) {
                imgFileList = new ArrayList<>();
                imgFileList.add(new File(com.crrepa.band.my.device.watchfacenew.delegate.img.i.getPresetImgPath()));
            }
            this.uploadPresenter.sendNewCustomWatchFace(imgFileList, this.imgDelegate.getCheckedIndex(), bVar.isClockStyle());
            return;
        }
        sendWatchFaceLayout();
        if ((this.displayModeDelegate.isModeChanged() && this.displayModeDelegate.isFixedMode()) || ((this.displayModeDelegate.isFixedMode() && z8) || bVar.isTimeStyleChanged())) {
            sendWatchFaceIndexAndThumb(max);
            sendPhotoWatchFaceDisplayMode();
        } else {
            sendPhotoWatchFaceDisplayMode();
            this.fragment.requireActivity().finish();
        }
    }
}
