package com.crrepa.band.my.device.watchfacenew.photo;

import android.view.View;
import android.view.ViewGroup;
import com.crrepa.band.my.databinding.FragmentNewCustomWatchFaceBinding;
import com.crrepa.band.my.databinding.LayoutNewWatchFaceTimePreviewBinding;
import com.crrepa.band.my.databinding.LayoutNewWatchFaceTimeStyleBinding;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.s;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;

/* loaded from: classes2.dex */
public class NewCustomWatchFaceFragment extends BaseVBFragment<FragmentNewCustomWatchFaceBinding> {
    private com.crrepa.band.my.device.watchfacenew.delegate.displaymode.c displayModeDelegate;
    private com.crrepa.band.my.device.watchfacenew.delegate.img.h imgDelegate;
    private final boolean isFromGallery;
    private s pointerStyleDelegate;
    private final String previewUrl;
    private y1.b timeStyleDelegate;
    private com.crrepa.band.my.device.watchfacenew.delegate.upload.a watchFaceUploadDelegate;

    public NewCustomWatchFaceFragment(String str, boolean z7) {
        this.previewUrl = str;
        this.isFromGallery = z7;
    }

    private void initDelegate() {
        VB vb = this.binding;
        this.imgDelegate = new com.crrepa.band.my.device.watchfacenew.delegate.img.h(this, ((FragmentNewCustomWatchFaceBinding) vb).includeImg, ((FragmentNewCustomWatchFaceBinding) vb).ivImgPreview, this.isFromGallery);
        ((FragmentNewCustomWatchFaceBinding) this.binding).ivImgPreview.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.photo.m
            @Override // java.lang.Runnable
            public final void run() {
                NewCustomWatchFaceFragment.this.lambda$initDelegate$0();
            }
        });
    }

    private void initListener() {
        ((FragmentNewCustomWatchFaceBinding) this.binding).btnSetWatchFace.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.photo.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCustomWatchFaceFragment.this.lambda$initListener$1(view);
            }
        });
        ((FragmentNewCustomWatchFaceBinding) this.binding).includeImg.tvFaceEdit.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.photo.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewCustomWatchFaceFragment.this.lambda$initListener$2(view);
            }
        });
    }

    private void initPreviewLayout() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            ((FragmentNewCustomWatchFaceBinding) this.binding).ivImgPreview.setOval(true);
            return;
        }
        ((FragmentNewCustomWatchFaceBinding) this.binding).ivImgPreview.setOval(false);
        int screenWidth = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth();
        int screenHeight = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();
        float measuredHeight = ((FragmentNewCustomWatchFaceBinding) this.binding).ivImgPreview.getMeasuredHeight() / screenHeight;
        ((FragmentNewCustomWatchFaceBinding) this.binding).ivImgPreview.setCornerRadius(measuredHeight * com.crrepa.band.my.device.watchfacenew.delegate.img.i.getCornerRadius());
        ViewGroup.LayoutParams layoutParams = ((FragmentNewCustomWatchFaceBinding) this.binding).rlPreview.getLayoutParams();
        layoutParams.width = (int) (screenWidth * measuredHeight);
        ((FragmentNewCustomWatchFaceBinding) this.binding).rlPreview.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initDelegate$0() {
        initPreviewLayout();
        this.displayModeDelegate = new com.crrepa.band.my.device.watchfacenew.delegate.displaymode.c(((FragmentNewCustomWatchFaceBinding) this.binding).includeDisplayMode);
        VB vb = this.binding;
        LayoutNewWatchFaceTimePreviewBinding layoutNewWatchFaceTimePreviewBinding = ((FragmentNewCustomWatchFaceBinding) vb).includeTimePreview;
        LayoutNewWatchFaceTimeStyleBinding layoutNewWatchFaceTimeStyleBinding = ((FragmentNewCustomWatchFaceBinding) vb).includeTimeStyle;
        CRPWatchFaceType cRPWatchFaceType = CRPWatchFaceType.PHOTO_WATCH_FACE;
        this.timeStyleDelegate = new y1.b(layoutNewWatchFaceTimePreviewBinding, layoutNewWatchFaceTimeStyleBinding, cRPWatchFaceType);
        VB vb2 = this.binding;
        this.pointerStyleDelegate = new s(((FragmentNewCustomWatchFaceBinding) vb2).includePointerPreview, ((FragmentNewCustomWatchFaceBinding) vb2).includePointerStyle, cRPWatchFaceType);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            this.watchFaceUploadDelegate = new com.crrepa.band.my.device.watchfacenew.delegate.upload.hisilicon.a(this, this.imgDelegate, this.displayModeDelegate, this.isFromGallery);
            ((FragmentNewCustomWatchFaceBinding) this.binding).includeTimePreview.rlRoot.setVisibility(0);
            ((FragmentNewCustomWatchFaceBinding) this.binding).includeTimeStyle.llRoot.setVisibility(0);
        } else {
            this.watchFaceUploadDelegate = new com.crrepa.band.my.device.watchfacenew.delegate.upload.jieli.a(this, this.imgDelegate, this.displayModeDelegate, ((FragmentNewCustomWatchFaceBinding) this.binding).ivImgPreview, this.isFromGallery);
            ((FragmentNewCustomWatchFaceBinding) this.binding).includePointerPreview.rlPointerLabelRoot.setVisibility(0);
            ((FragmentNewCustomWatchFaceBinding) this.binding).includePointerStyle.llRoot.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        if (this.imgDelegate.isEditingState()) {
            return;
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            this.watchFaceUploadDelegate.sendPhotoWatchFace(this.timeStyleDelegate);
        } else {
            this.watchFaceUploadDelegate.sendPhotoWatchFace(this.pointerStyleDelegate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$2(View view) {
        this.imgDelegate.updateEditStateUI();
        renderEditState(this.imgDelegate.isNotEditingState());
    }

    private void renderEditState(boolean z7) {
        this.displayModeDelegate.renderEditStatus(z7);
        this.timeStyleDelegate.renderEditStatus(z7);
        this.pointerStyleDelegate.renderEditState(z7);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
        initDelegate();
        initListener();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void loadData() {
        super.loadData();
        this.imgDelegate.showWatchFaceImg(this.previewUrl);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.imgDelegate.destroy();
        this.pointerStyleDelegate.destroy();
        this.watchFaceUploadDelegate.destroy();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.isFromGallery) {
            this.imgDelegate.renderGalleryAddedImgList();
        }
    }

    public void renderDressAddedImgList(String str) {
        this.imgDelegate.renderDressAddedImgList(str);
    }
}
