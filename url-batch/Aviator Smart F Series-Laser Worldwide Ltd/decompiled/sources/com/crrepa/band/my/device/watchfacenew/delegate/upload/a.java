package com.crrepa.band.my.device.watchfacenew.delegate.upload;

import androidx.fragment.app.Fragment;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchfacenew.delegate.img.h;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.s;
import com.moyoung.dafit.module.common.baseui.BaseCustomUploadingDialog;

/* loaded from: classes2.dex */
public abstract class a {
    protected com.crrepa.band.my.device.watchfacenew.delegate.displaymode.c displayModeDelegate;
    protected final Fragment fragment;
    protected h imgDelegate;
    protected final boolean isFromGallery;
    protected s pointerStyleDelegate;
    protected y1.b timeStyleDelegate;
    protected BaseCustomUploadingDialog uploadingDialog;

    public a(Fragment fragment, h hVar, com.crrepa.band.my.device.watchfacenew.delegate.displaymode.c cVar, boolean z7) {
        this.fragment = fragment;
        this.imgDelegate = hVar;
        this.displayModeDelegate = cVar;
        this.isFromGallery = z7;
    }

    public abstract void destroy();

    public void sendPhotoWatchFace(s sVar) {
        this.pointerStyleDelegate = sVar;
    }

    public void showUploadDialog() {
        BaseCustomUploadingDialog baseCustomUploadingDialog = new BaseCustomUploadingDialog(this.fragment.requireActivity());
        this.uploadingDialog = baseCustomUploadingDialog;
        baseCustomUploadingDialog.setTitleTxt(R.string.device_custom_watch_face_uploading);
        this.uploadingDialog.hideCancelTv();
        this.uploadingDialog.show();
    }

    public void sendPhotoWatchFace(y1.b bVar) {
        this.timeStyleDelegate = bVar;
    }
}
