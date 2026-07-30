package com.crrepa.band.my.device.watchfacenew.ai;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityHisiliconWatchFaceAiEditBinding;
import com.crrepa.band.my.device.ai.picture.AIPictureActivity;
import com.crrepa.band.my.device.ai.picture.AIWatchFaceEditActivity;
import com.crrepa.band.my.device.ai.picture.c1;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.type.CRPWatchFaceType;
import com.moyoung.dafit.module.common.baseui.BaseCustomUploadingDialog;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;
import java.io.File;

/* loaded from: classes2.dex */
public class HisiliconAIWatchFaceEditActivity extends BaseVBActivity<ActivityHisiliconWatchFaceAiEditBinding> {
    private y1.b timeStyleDelegate;
    private BaseCustomUploadingDialog uploadingDialog;
    private final c1 aiWatchFaceUploadDelegate = new c1();
    private final CRPFileTransListener transListener = new a();

    class a implements CRPFileTransListener {
        a() {
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            Log.d("CRPFileTransListener", "onError-" + i8);
            HisiliconAIWatchFaceEditActivity.this.renderTransError();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            Log.d("CRPFileTransListener", "onTransCompleted");
            HisiliconAIWatchFaceEditActivity.this.renderTransCompleted();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            HisiliconAIWatchFaceEditActivity.this.renderTransProgressChanged(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            Log.d("CRPFileTransListener", "onTransProgressStarting");
        }
    }

    private void initDelegate() {
        ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).ivWatchFacePreview.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.ai.g
            @Override // java.lang.Runnable
            public final void run() {
                HisiliconAIWatchFaceEditActivity.this.lambda$initDelegate$2();
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
        this.timeStyleDelegate = new y1.b(((ActivityHisiliconWatchFaceAiEditBinding) vb).includeTimePreview, ((ActivityHisiliconWatchFaceAiEditBinding) vb).includeTimeStyle, CRPWatchFaceType.AI_WATCH_FACE);
        ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).includeTimePreview.rlRoot.setVisibility(0);
        ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).includeTimeStyle.llRoot.setVisibility(0);
        ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).includeTimeStyle.tvTitle.setVisibility(8);
        ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).includeTimeStyle.rgTimeStyle.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderAIPicture$3() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() != null) {
            ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).ivWatchFacePreview.setCornerRadius(r0.getRoundedRadius());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTransCompleted$5() {
        startActivity(AIPictureActivity.getCallingIntent(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTransError$6() {
        r0.showLong(this, getString(R.string.device_watch_face_update_fail_alrt_title));
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
        int width = decodeFile.getWidth();
        int height = decodeFile.getHeight();
        int screenWidth = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenWidth();
        int screenHeight = com.crrepa.band.my.device.watchfacenew.delegate.img.i.getScreenHeight();
        if (width != screenWidth || height != screenHeight) {
            decodeFile = com.moyoung.dafit.module.common.utils.g.changeBitmapSize(decodeFile, screenWidth, screenHeight);
        }
        this.aiWatchFaceUploadDelegate.setPictureFilePath(str);
        this.aiWatchFaceUploadDelegate.setAIBitmap(decodeFile);
        ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).ivWatchFacePreview.setImageBitmap(decodeFile);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isCircleScreen()) {
            ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).ivWatchFacePreview.setOval(true);
        } else {
            ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).ivWatchFacePreview.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.ai.c
                @Override // java.lang.Runnable
                public final void run() {
                    HisiliconAIWatchFaceEditActivity.this.lambda$renderAIPicture$3();
                }
            });
        }
    }

    private void renderDisconnectHint() {
        r0.showLong(getString(R.string.band_setting_send_fail));
    }

    private void renderLowBatteryHint() {
        r0.showLong(getString(R.string.measure_low_battery_hint));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderTransCompleted() {
        ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.ai.d
            @Override // java.lang.Runnable
            public final void run() {
                HisiliconAIWatchFaceEditActivity.this.lambda$renderTransCompleted$5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderTransError() {
        ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.ai.f
            @Override // java.lang.Runnable
            public final void run() {
                HisiliconAIWatchFaceEditActivity.this.lambda$renderTransError$6();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderTransProgressChanged(final int i8) {
        ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.watchfacenew.ai.e
            @Override // java.lang.Runnable
            public final void run() {
                HisiliconAIWatchFaceEditActivity.this.lambda$renderTransProgressChanged$4(i8);
            }
        });
    }

    private void sendAIWatchFace() {
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            renderDisconnectHint();
            return;
        }
        if (BandBatteryProvider.isOtaLowBattery()) {
            renderLowBatteryHint();
            return;
        }
        showUploadDialog();
        this.uploadingDialog.setProgress(0);
        sendWatchFaceLayout();
        sendWatchFaceTimeStyle();
        this.aiWatchFaceUploadDelegate.setHisiliconAIWatchFace();
        this.aiWatchFaceUploadDelegate.sendHisiliconAIWatchFace(this.transListener);
    }

    private void sendWatchFaceLayout() {
        this.timeStyleDelegate.sendWatchFaceLayout();
    }

    private void sendWatchFaceTimeStyle() {
        if (this.timeStyleDelegate.getTimeStyle() == null) {
            return;
        }
        i4 i4Var = i4.getInstance();
        CRPWatchFaceType cRPWatchFaceType = CRPWatchFaceType.AI_WATCH_FACE;
        i4Var.sendHisiliconWatchFaceTimeStyle(cRPWatchFaceType, this.timeStyleDelegate.getTimeStyle());
        y1.c.save(cRPWatchFaceType, this.timeStyleDelegate.getTimeStyle());
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
        intent.setClass(context, HisiliconAIWatchFaceEditActivity.class);
        intent.putExtra(AIWatchFaceEditActivity.AI_PICTURE_FILE_PATH, str);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        initDelegate();
        ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.ai.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HisiliconAIWatchFaceEditActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityHisiliconWatchFaceAiEditBinding) this.binding).shadowApply.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchfacenew.ai.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HisiliconAIWatchFaceEditActivity.this.lambda$initBinding$1(view);
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
        if (baseCustomUploadingDialog == null || !baseCustomUploadingDialog.isShowing()) {
            return;
        }
        this.uploadingDialog.dismiss();
    }
}
