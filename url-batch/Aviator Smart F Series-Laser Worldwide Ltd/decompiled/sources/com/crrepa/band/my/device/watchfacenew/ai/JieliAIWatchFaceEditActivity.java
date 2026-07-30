package com.crrepa.band.my.device.watchfacenew.ai;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityJieliWatchFaceAiEditBinding;
import com.crrepa.band.my.device.ai.picture.AIPictureActivity;
import com.crrepa.band.my.device.ai.picture.AIWatchFaceEditActivity;
import com.crrepa.band.my.device.ai.picture.model.AIPictureModel;
import com.crrepa.band.my.device.watchface.model.BandWatchFaceChangeEvent;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.s;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.moyoung.dafit.module.common.baseui.BaseCustomUploadingDialog;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public class JieliAIWatchFaceEditActivity extends BaseVBActivity<ActivityJieliWatchFaceAiEditBinding> implements com.crrepa.band.my.device.watchfacenew.delegate.upload.c {
    private Bitmap aiBitmap;
    private s pointerStyleDelegate;
    private BaseCustomUploadingDialog uploadingDialog;
    private final com.crrepa.band.my.device.watchfacenew.delegate.upload.jieli.b uploadingDialogPresenter = new com.crrepa.band.my.device.watchfacenew.delegate.upload.jieli.b();

    private void initDelegate() {
        ((ActivityJieliWatchFaceAiEditBinding) this.binding).ivWatchFacePreview.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.ai.m
            @Override // java.lang.Runnable
            public final void run() {
                JieliAIWatchFaceEditActivity.this.lambda$initDelegate$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        sendAIWatchFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initDelegate$2() {
        VB vb = this.binding;
        this.pointerStyleDelegate = new s(((ActivityJieliWatchFaceAiEditBinding) vb).includePointerPreview, ((ActivityJieliWatchFaceAiEditBinding) vb).includePointerStyle, CRPWatchFaceType.AI_WATCH_FACE);
        ((ActivityJieliWatchFaceAiEditBinding) this.binding).includePointerPreview.rlPointerLabelRoot.setVisibility(0);
        ((ActivityJieliWatchFaceAiEditBinding) this.binding).includePointerStyle.llRoot.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderAIPicture$3() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() != null) {
            ((ActivityJieliWatchFaceAiEditBinding) this.binding).ivWatchFacePreview.setCornerRadius(r0.getRoundedRadius());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTransCompleted$5() {
        startActivity(AIPictureActivity.getCallingIntent(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTransError$6() {
        r0.showLong(getString(R.string.device_watch_face_update_fail_alrt_title));
        BaseCustomUploadingDialog baseCustomUploadingDialog = this.uploadingDialog;
        if (baseCustomUploadingDialog != null) {
            baseCustomUploadingDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTransProgressChanged$4(int i8) {
        BaseCustomUploadingDialog baseCustomUploadingDialog = this.uploadingDialog;
        if (baseCustomUploadingDialog != null) {
            baseCustomUploadingDialog.setProgress(i8);
        }
    }

    private void renderAIPicture(String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(new File(str).getPath());
        this.aiBitmap = decodeFile;
        int width = decodeFile.getWidth();
        int height = this.aiBitmap.getHeight();
        int screenWidth = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth();
        int screenHeight = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();
        if (width != screenWidth || height != screenHeight) {
            this.aiBitmap = com.moyoung.dafit.module.common.utils.g.changeBitmapSize(this.aiBitmap, screenWidth, screenHeight);
        }
        ((ActivityJieliWatchFaceAiEditBinding) this.binding).ivWatchFacePreview.setImageBitmap(this.aiBitmap);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            ((ActivityJieliWatchFaceAiEditBinding) this.binding).ivWatchFacePreview.setOval(true);
        } else {
            ((ActivityJieliWatchFaceAiEditBinding) this.binding).ivWatchFacePreview.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.ai.j
                @Override // java.lang.Runnable
                public final void run() {
                    JieliAIWatchFaceEditActivity.this.lambda$renderAIPicture$3();
                }
            });
        }
    }

    private void sendAIWatchFace() {
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            renderBandDisconnected();
            return;
        }
        if (BandBatteryProvider.isOtaLowBattery()) {
            renderLowBatteryHint();
            return;
        }
        showUploadDialog();
        this.uploadingDialog.setProgress(0);
        Bitmap changeBitmapSize = com.moyoung.dafit.module.common.utils.g.changeBitmapSize(this.aiBitmap, com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth(), com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight());
        this.aiBitmap = changeBitmapSize;
        this.uploadingDialogPresenter.sendAIWatchFace(changeBitmapSize, this.pointerStyleDelegate.getPointerBean());
    }

    private void showUploadDialog() {
        BaseCustomUploadingDialog baseCustomUploadingDialog = new BaseCustomUploadingDialog(this);
        this.uploadingDialog = baseCustomUploadingDialog;
        baseCustomUploadingDialog.setTitleTxt(R.string.device_custom_watch_face_uploading);
        this.uploadingDialog.hideCancelTv();
        this.uploadingDialog.show();
    }

    public static void start(Context context, String str) {
        Intent intent = new Intent();
        intent.setClass(context, JieliAIWatchFaceEditActivity.class);
        intent.putExtra(AIWatchFaceEditActivity.AI_PICTURE_FILE_PATH, str);
        context.startActivity(intent);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void destroy() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.uploadingDialogPresenter.setView(this);
        initDelegate();
        ((ActivityJieliWatchFaceAiEditBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.ai.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JieliAIWatchFaceEditActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityJieliWatchFaceAiEditBinding) this.binding).shadowApply.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.ai.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JieliAIWatchFaceEditActivity.this.lambda$initBinding$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        String stringExtra = getIntent().getStringExtra(AIWatchFaceEditActivity.AI_PICTURE_FILE_PATH);
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
        } else {
            renderAIPicture(stringExtra);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        BaseCustomUploadingDialog baseCustomUploadingDialog = this.uploadingDialog;
        if (baseCustomUploadingDialog != null && baseCustomUploadingDialog.isShowing()) {
            this.uploadingDialog.dismiss();
        }
        this.pointerStyleDelegate.destroy();
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderBandDisconnected() {
        r0.showLong(getString(R.string.band_setting_send_fail));
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderLowBatteryHint() {
        r0.showLong(getString(R.string.measure_low_battery_hint));
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public /* bridge */ /* synthetic */ void renderLowStorage() {
        com.crrepa.band.my.device.watchfacenew.delegate.upload.b.a(this);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public /* bridge */ /* synthetic */ void renderPointerDownloadFailed() {
        com.crrepa.band.my.device.watchfacenew.delegate.upload.b.b(this);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public /* bridge */ /* synthetic */ void renderThumbTransCompleted() {
        com.crrepa.band.my.device.watchfacenew.delegate.upload.b.c(this);
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderTransCompleted() {
        this.pointerStyleDelegate.saveWatchFaceInfo();
        this.pointerStyleDelegate.sendAIWatchFaceLayout();
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(AIPictureModel.SENT_AI_PICTURE_PATH, com.crrepa.band.my.device.watchfacenew.delegate.upload.jieli.b.getAI707ImgPath());
        org.greenrobot.eventbus.c.getDefault().post(new BandWatchFaceChangeEvent(null));
        ((ActivityJieliWatchFaceAiEditBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.ai.l
            @Override // java.lang.Runnable
            public final void run() {
                JieliAIWatchFaceEditActivity.this.lambda$renderTransCompleted$5();
            }
        });
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderTransError(int i8, List<String> list) {
        ((ActivityJieliWatchFaceAiEditBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.ai.n
            @Override // java.lang.Runnable
            public final void run() {
                JieliAIWatchFaceEditActivity.this.lambda$renderTransError$6();
            }
        });
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderTransProgressChanged(final int i8) {
        ((ActivityJieliWatchFaceAiEditBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.ai.k
            @Override // java.lang.Runnable
            public final void run() {
                JieliAIWatchFaceEditActivity.this.lambda$renderTransProgressChanged$4(i8);
            }
        });
    }

    @Override // com.crrepa.band.my.device.watchfacenew.delegate.upload.c
    public void renderTransProgressStarting() {
        Log.d("CRPFileTransListener", "onTransProgressStarting");
    }
}
