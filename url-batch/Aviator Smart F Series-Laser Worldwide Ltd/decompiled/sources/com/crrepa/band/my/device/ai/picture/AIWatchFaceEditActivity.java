package com.crrepa.band.my.device.ai.picture;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityAiWatchFaceEditBinding;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.picture.model.CRPWatchFaceLayoutInfoEvent;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import java.io.File;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class AIWatchFaceEditActivity extends BaseVBActivity<ActivityAiWatchFaceEditBinding> implements b1 {
    public static final String AI_PICTURE_FILE_PATH = "aiPictureFilePath";
    private final a1 presenter = new a1();
    private final c1 aiWatchFaceUploadDelegate = new c1();
    private boolean isUploading = false;
    private boolean isDateLabelInitialized = false;
    private final CRPFileTransListener transListener = new a();

    class a implements CRPFileTransListener {
        a() {
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            AIWatchFaceEditActivity.this.isUploading = false;
            AIWatchFaceEditActivity.this.renderTransError();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            AIWatchFaceEditActivity.this.isUploading = false;
            AIWatchFaceEditActivity.this.renderTransCompleted();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            AIWatchFaceEditActivity.this.renderTransProgressChanged(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            AIWatchFaceEditActivity.this.isUploading = true;
            AIWatchFaceEditActivity.this.renderTransProgressStarting();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initBinding$1(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            renderDisconnectHint();
        } else {
            if (BandBatteryProvider.isOtaLowBattery()) {
                renderLowBatteryHint();
                return;
            }
            CRPWatchFaceLayoutInfo watchFaceLayoutInfo = this.presenter.getWatchFaceLayoutInfo();
            AIProvider.saveAIWatchFaceLayoutInfo(watchFaceLayoutInfo);
            this.aiWatchFaceUploadDelegate.sendAIWatchFace(watchFaceLayoutInfo, this.transListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initBinding$3(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
        this.presenter.saveWatchFaceTimePosition(i8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(View view) {
        new MaterialDialog.e(this).title(R.string.watch_face_time_position).items(R.array.watch_face_position_array).itemsCallbackSingleChoice(this.presenter.getWatchFaceTimePosition(), new MaterialDialog.j() { // from class: com.crrepa.band.my.device.ai.picture.e0
            @Override // com.afollestad.materialdialogs.MaterialDialog.j
            public final boolean onSelection(MaterialDialog materialDialog, View view2, int i8, CharSequence charSequence) {
                boolean lambda$initBinding$3;
                lambda$initBinding$3 = AIWatchFaceEditActivity.this.lambda$initBinding$3(materialDialog, view2, i8, charSequence);
                return lambda$initBinding$3;
            }
        }).positiveText(R.string.done).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initBinding$5(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
        this.presenter.saveWatchFaceTimeTopContent(i8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$6(View view) {
        new MaterialDialog.e(this).title(R.string.watch_face_time_position_top_content).items(R.array.watch_face_content_array).itemsCallbackSingleChoice(this.presenter.getWatchFaceTimeTopContent(), new MaterialDialog.j() { // from class: com.crrepa.band.my.device.ai.picture.l0
            @Override // com.afollestad.materialdialogs.MaterialDialog.j
            public final boolean onSelection(MaterialDialog materialDialog, View view2, int i8, CharSequence charSequence) {
                boolean lambda$initBinding$5;
                lambda$initBinding$5 = AIWatchFaceEditActivity.this.lambda$initBinding$5(materialDialog, view2, i8, charSequence);
                return lambda$initBinding$5;
            }
        }).positiveText(R.string.done).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initBinding$7(MaterialDialog materialDialog, View view, int i8, CharSequence charSequence) {
        this.presenter.saveWatchFaceTimeBottomContent(i8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$8(View view) {
        new MaterialDialog.e(this).title(R.string.watch_face_time_position_bottom_content).items(R.array.watch_face_content_array).itemsCallbackSingleChoice(this.presenter.getWatchFaceTimeBottomContent(), new MaterialDialog.j() { // from class: com.crrepa.band.my.device.ai.picture.p0
            @Override // com.afollestad.materialdialogs.MaterialDialog.j
            public final boolean onSelection(MaterialDialog materialDialog, View view2, int i8, CharSequence charSequence) {
                boolean lambda$initBinding$7;
                lambda$initBinding$7 = AIWatchFaceEditActivity.this.lambda$initBinding$7(materialDialog, view2, i8, charSequence);
                return lambda$initBinding$7;
            }
        }).positiveText(R.string.done).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderCircleScreen$12() {
        ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFacePreview.setOval(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderRoundedRectangleScreen$13() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() != null) {
            ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFacePreview.setCornerRadius(r0.getRoundedRadius());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTransCompleted$18() {
        startActivity(AIPictureActivity.getCallingIntent(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTransError$19() {
        com.moyoung.dafit.module.common.utils.r0.showLong(this, getString(R.string.watch_face_picture_trans_error_msg));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTransProgressChanged$17(int i8) {
        ((ActivityAiWatchFaceEditBinding) this.binding).pbWatchFace.setProgress(i8);
        ((ActivityAiWatchFaceEditBinding) this.binding).tvUploadProgress.setText(i8 + "%");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTransProgressStarting$16() {
        ((ActivityAiWatchFaceEditBinding) this.binding).shadowApply.setVisibility(8);
        ((ActivityAiWatchFaceEditBinding) this.binding).pbWatchFace.setVisibility(0);
        ((ActivityAiWatchFaceEditBinding) this.binding).tvUploadProgress.setVisibility(0);
        ((ActivityAiWatchFaceEditBinding) this.binding).maskAiPicture.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderWatchFaceRatio$10(float f8) {
        int measuredWidth = ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFaceTime.getMeasuredWidth();
        int measuredHeight = ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFaceTime.getMeasuredHeight();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFaceTime.getLayoutParams();
        layoutParams.width = (int) (measuredWidth * f8);
        layoutParams.height = (int) (measuredHeight * f8);
        ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFaceTime.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderWatchFaceRatio$11(float f8) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFacePreview.getLayoutParams();
        layoutParams.width = (int) (((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFacePreview.getMeasuredHeight() * f8);
        ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFacePreview.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderWatchFaceTimePosition$14(float f8) {
        int measuredHeight = ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFacePreview.getMeasuredHeight();
        int dp2px = ((measuredHeight - ((int) (measuredHeight * f8))) / 2) + com.moyoung.dafit.module.common.utils.o.dp2px(this, f8 * 18.0f);
        com.orhanobut.logger.f.d("ivCircleWatchFaceBg end: " + dp2px);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((ActivityAiWatchFaceEditBinding) this.binding).llWatchFaceContent.getLayoutParams();
        layoutParams.setMarginEnd(dp2px);
        ((ActivityAiWatchFaceEditBinding) this.binding).llWatchFaceContent.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTextColorChooseListener$9(RadioGroup radioGroup, int i8) {
        int i9;
        switch (i8) {
            case R.id.rb_watch_face_text_color_black /* 2131363323 */:
                i9 = 1;
                break;
            case R.id.rb_watch_face_text_color_blue /* 2131363324 */:
                i9 = 6;
                break;
            case R.id.rb_watch_face_text_color_green /* 2131363325 */:
                i9 = 8;
                break;
            case R.id.rb_watch_face_text_color_indigo /* 2131363326 */:
                i9 = 7;
                break;
            case R.id.rb_watch_face_text_color_origin /* 2131363327 */:
                i9 = 3;
                break;
            case R.id.rb_watch_face_text_color_purple /* 2131363328 */:
                i9 = 5;
                break;
            case R.id.rb_watch_face_text_color_red /* 2131363329 */:
                i9 = 4;
                break;
            case R.id.rb_watch_face_text_color_white /* 2131363330 */:
            default:
                i9 = 0;
                break;
            case R.id.rb_watch_face_text_color_yellow /* 2131363331 */:
                i9 = 2;
                break;
        }
        this.presenter.saveWatchFaceTextColor(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setWatchFaceContent$15(ImageView imageView, float f8, int i8) {
        int measuredWidth = imageView.getMeasuredWidth();
        int measuredHeight = imageView.getMeasuredHeight();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = (int) (measuredWidth * f8);
        layoutParams.height = (int) (measuredHeight * f8);
        imageView.setLayoutParams(layoutParams);
        this.isDateLabelInitialized = true;
        renderLabelView(i8, imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTimeoutDialog$21(MaterialDialog materialDialog, DialogAction dialogAction) {
        materialDialog.dismiss();
        ((ActivityAiWatchFaceEditBinding) this.binding).shadowApply.setVisibility(0);
        ((ActivityAiWatchFaceEditBinding) this.binding).pbWatchFace.setVisibility(8);
        ((ActivityAiWatchFaceEditBinding) this.binding).tvUploadProgress.setVisibility(8);
        ((ActivityAiWatchFaceEditBinding) this.binding).maskAiPicture.setVisibility(8);
    }

    private void renderAIPicture(String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(new File(str).getPath());
        int width = decodeFile.getWidth();
        int height = decodeFile.getHeight();
        CRPWatchFaceLayoutInfo watchFaceLayoutInfo = this.presenter.getWatchFaceLayoutInfo();
        if (width != watchFaceLayoutInfo.getWidth() || height != watchFaceLayoutInfo.getHeight()) {
            decodeFile = com.moyoung.dafit.module.common.utils.g.changeBitmapSize(decodeFile, watchFaceLayoutInfo.getWidth(), watchFaceLayoutInfo.getHeight());
        }
        this.aiWatchFaceUploadDelegate.setPictureFilePath(str);
        this.aiWatchFaceUploadDelegate.setAIBitmap(decodeFile);
        ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFacePreview.setImageBitmap(decodeFile);
    }

    private void renderLabelView(int i8, ImageView imageView) {
        int watchFaceContentResources = w1.j.getWatchFaceContentResources(i8);
        if (watchFaceContentResources < 0) {
            imageView.setVisibility(4);
            return;
        }
        imageView.setVisibility(0);
        imageView.setImageResource(watchFaceContentResources);
        setWatchFaceContentTextColor(this.presenter.getWatchFaceLayoutInfo().getTextColor(), imageView);
    }

    @SuppressLint({"NonConstantResourceId"})
    private void setTextColorChooseListener() {
        ((ActivityAiWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.ai.picture.t0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i8) {
                AIWatchFaceEditActivity.this.lambda$setTextColorChooseListener$9(radioGroup, i8);
            }
        });
    }

    private void setWatchFaceContent(final int i8, TextView textView, final ImageView imageView, final float f8) {
        textView.setText(w1.j.getWatchFaceTimeContent(this, i8));
        if (this.isDateLabelInitialized) {
            renderLabelView(i8, imageView);
        } else {
            imageView.setImageResource(w1.j.getWatchFaceDateResources());
            imageView.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.s0
                @Override // java.lang.Runnable
                public final void run() {
                    AIWatchFaceEditActivity.this.lambda$setWatchFaceContent$15(imageView, f8, i8);
                }
            });
        }
    }

    private void setWatchFaceContentTextColor(@ColorInt int i8, ImageView imageView) {
        Drawable drawable;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        DrawableCompat.setTint(DrawableCompat.wrap(drawable).mutate(), i8);
    }

    private void setWatchFaceTextColorCheckIndex(int i8) {
        switch (i8) {
            case 0:
                ((ActivityAiWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_white);
                break;
            case 1:
                ((ActivityAiWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_black);
                break;
            case 2:
                ((ActivityAiWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_yellow);
                break;
            case 3:
                ((ActivityAiWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_origin);
                break;
            case 4:
                ((ActivityAiWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_red);
                break;
            case 5:
                ((ActivityAiWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_purple);
                break;
            case 6:
                ((ActivityAiWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_blue);
                break;
            case 7:
                ((ActivityAiWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_indigo);
                break;
            case 8:
                ((ActivityAiWatchFaceEditBinding) this.binding).rgWatchFaceTextColor.check(R.id.rb_watch_face_text_color_green);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTimeoutDialog() {
        new MaterialDialog.e(this).title(R.string.watch_face_timeout).content(R.string.watch_face_timeout_hint).positiveText(R.string.retry).negativeText(R.string.abort).onPositive(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.ai.picture.q0
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                materialDialog.dismiss();
            }
        }).onNegative(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.ai.picture.r0
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                AIWatchFaceEditActivity.this.lambda$showTimeoutDialog$21(materialDialog, dialogAction);
            }
        }).show();
    }

    public static void start(Context context, String str) {
        Intent intent = new Intent();
        intent.setClass(context, AIWatchFaceEditActivity.class);
        intent.putExtra(AI_PICTURE_FILE_PATH, str);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        this.presenter.setView(this);
        setTextColorChooseListener();
        ((ActivityAiWatchFaceEditBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIWatchFaceEditActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityAiWatchFaceEditBinding) this.binding).maskAiPicture.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIWatchFaceEditActivity.lambda$initBinding$1(view);
            }
        });
        ((ActivityAiWatchFaceEditBinding) this.binding).shadowApply.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIWatchFaceEditActivity.this.lambda$initBinding$2(view);
            }
        });
        ((ActivityAiWatchFaceEditBinding) this.binding).rlWatchFaceTimePosition.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIWatchFaceEditActivity.this.lambda$initBinding$4(view);
            }
        });
        ((ActivityAiWatchFaceEditBinding) this.binding).rlWatchFaceTimePositionTopContent.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIWatchFaceEditActivity.this.lambda$initBinding$6(view);
            }
        });
        ((ActivityAiWatchFaceEditBinding) this.binding).rlWatchFaceTimePositionBottomContent.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIWatchFaceEditActivity.this.lambda$initBinding$8(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        String stringExtra = getIntent().getStringExtra(AI_PICTURE_FILE_PATH);
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            return;
        }
        this.presenter.initWatchFaceLayout();
        if (this.presenter.getWatchFaceLayoutInfo() == null) {
            getPageLoadingUI().show();
            i4.getInstance().queryAIWatchFaceLayout();
        } else {
            this.presenter.showWatchFaceLayout();
            renderAIPicture(stringExtra);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.isUploading) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(CRPWatchFaceLayoutInfoEvent cRPWatchFaceLayoutInfoEvent) {
        getPageLoadingUI().hide();
        if (this.presenter.getWatchFaceLayoutInfo() == null) {
            this.presenter.initWatchFaceLayout();
            this.presenter.showWatchFaceLayout();
            renderAIPicture(getIntent().getStringExtra(AI_PICTURE_FILE_PATH));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    public void renderCircleScreen() {
        ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFacePreview.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.z0
            @Override // java.lang.Runnable
            public final void run() {
                AIWatchFaceEditActivity.this.lambda$renderCircleScreen$12();
            }
        });
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    public void renderDisconnectHint() {
        com.moyoung.dafit.module.common.utils.r0.showLong(this, getString(R.string.band_setting_send_fail));
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    public void renderLowBatteryHint() {
        com.moyoung.dafit.module.common.utils.r0.showLong(this, getString(R.string.measure_low_battery_hint));
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    public void renderRoundedRectangleScreen() {
        ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFacePreview.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.v0
            @Override // java.lang.Runnable
            public final void run() {
                AIWatchFaceEditActivity.this.lambda$renderRoundedRectangleScreen$13();
            }
        });
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    public void renderTransCompleted() {
        ((ActivityAiWatchFaceEditBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.d0
            @Override // java.lang.Runnable
            public final void run() {
                AIWatchFaceEditActivity.this.lambda$renderTransCompleted$18();
            }
        });
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    public void renderTransError() {
        ((ActivityAiWatchFaceEditBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.w0
            @Override // java.lang.Runnable
            public final void run() {
                AIWatchFaceEditActivity.this.lambda$renderTransError$19();
            }
        });
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    @SuppressLint({"SetTextI18n"})
    public void renderTransProgressChanged(final int i8) {
        ((ActivityAiWatchFaceEditBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.y0
            @Override // java.lang.Runnable
            public final void run() {
                AIWatchFaceEditActivity.this.lambda$renderTransProgressChanged$17(i8);
            }
        });
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    public void renderTransProgressStarting() {
        ((ActivityAiWatchFaceEditBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.u0
            @Override // java.lang.Runnable
            public final void run() {
                AIWatchFaceEditActivity.this.lambda$renderTransProgressStarting$16();
            }
        });
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    public void renderTransTimeout() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isRealtek()) {
            return;
        }
        ((ActivityAiWatchFaceEditBinding) this.binding).shadowApply.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.x0
            @Override // java.lang.Runnable
            public final void run() {
                AIWatchFaceEditActivity.this.showTimeoutDialog();
            }
        });
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    public void renderWatchFaceRatio(final float f8) {
        ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFaceTime.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.m0
            @Override // java.lang.Runnable
            public final void run() {
                AIWatchFaceEditActivity.this.lambda$renderWatchFaceRatio$10(f8);
            }
        });
        ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFacePreview.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.n0
            @Override // java.lang.Runnable
            public final void run() {
                AIWatchFaceEditActivity.this.lambda$renderWatchFaceRatio$11(f8);
            }
        });
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    public void renderWatchFaceTextColor(int i8) {
        setWatchFaceTextColorCheckIndex(i8);
        int watchFaceTextColorInt = w1.j.getWatchFaceTextColorInt(i8);
        setWatchFaceContentTextColor(watchFaceTextColorInt, ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFaceTimeTop);
        setWatchFaceContentTextColor(watchFaceTextColorInt, ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFaceTime);
        setWatchFaceContentTextColor(watchFaceTextColorInt, ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFaceTimeBottom);
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    public void renderWatchFaceTimeBottomContent(int i8, float f8) {
        VB vb = this.binding;
        setWatchFaceContent(i8, ((ActivityAiWatchFaceEditBinding) vb).tvWatchFaceTimePositionBottom, ((ActivityAiWatchFaceEditBinding) vb).ivWatchFaceTimeBottom, f8);
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    public void renderWatchFaceTimePosition(int i8, boolean z7, boolean z8, final float f8) {
        ((ActivityAiWatchFaceEditBinding) this.binding).tvWatchFaceTimePosition.setText(w1.j.getWatchFaceTimePosition(this, i8));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((ActivityAiWatchFaceEditBinding) this.binding).llWatchFaceContent.getLayoutParams();
        if (i8 == 0) {
            layoutParams.removeRule(12);
            layoutParams.addRule(10);
        } else {
            layoutParams.removeRule(10);
            layoutParams.addRule(12);
        }
        if (z7) {
            layoutParams.addRule(14, 1);
            ((ActivityAiWatchFaceEditBinding) this.binding).llWatchFaceContent.setGravity(17);
        } else {
            layoutParams.addRule(21);
            ((ActivityAiWatchFaceEditBinding) this.binding).llWatchFaceContent.setGravity(GravityCompat.END);
            com.orhanobut.logger.f.d("ivCircleWatchFaceBg setGravity: 8388613");
            ((ActivityAiWatchFaceEditBinding) this.binding).ivWatchFacePreview.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.o0
                @Override // java.lang.Runnable
                public final void run() {
                    AIWatchFaceEditActivity.this.lambda$renderWatchFaceTimePosition$14(f8);
                }
            });
            if (z8) {
                layoutParams.setMarginEnd(com.moyoung.dafit.module.common.utils.o.dp2px(com.moyoung.dafit.module.common.utils.d.get(), 24.0f));
            }
        }
        ((ActivityAiWatchFaceEditBinding) this.binding).llWatchFaceContent.setLayoutParams(layoutParams);
    }

    @Override // com.crrepa.band.my.device.ai.picture.b1
    public void renderWatchFaceTimeTopContent(int i8, float f8) {
        VB vb = this.binding;
        setWatchFaceContent(i8, ((ActivityAiWatchFaceEditBinding) vb).tvWatchFaceTimePositionTop, ((ActivityAiWatchFaceEditBinding) vb).ivWatchFaceTimeTop, f8);
    }
}
