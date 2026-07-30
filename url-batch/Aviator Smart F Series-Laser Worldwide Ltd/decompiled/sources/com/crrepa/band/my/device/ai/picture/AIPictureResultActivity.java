package com.crrepa.band.my.device.ai.picture;

import android.R;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.crrepa.band.my.databinding.ActivityAiPictureReslutBinding;
import com.crrepa.band.my.device.ai.picture.AIPictureResultActivity;
import com.crrepa.band.my.device.ai.picture.e1;
import com.crrepa.band.my.device.ai.picture.model.AIPictureHistoryBean;
import com.crrepa.band.my.device.ai.picture.model.AIPictureHistoryEvent;
import com.crrepa.band.my.device.ai.picture.model.AIPictureModel;
import com.crrepa.band.my.device.watchfacenew.ai.HisiliconAIWatchFaceEditActivity;
import com.crrepa.band.my.device.watchfacenew.ai.JieliAIWatchFaceEditActivity;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.squareup.picasso.Picasso;
import java.io.File;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class AIPictureResultActivity extends BaseVBActivity<ActivityAiPictureReslutBinding> {
    private com.crrepa.band.my.device.ai.debugmodel.d aiDebugModelDelegate;
    private AIPictureDelegate aiPictureDelegate;
    private AIPictureHistoryBean aiPictureHistoryBean;
    boolean isGifUnLoadedResource = true;

    class a implements d1 {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFail$1() {
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).gifLoading.stop();
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).gifLoading.setVisibility(8);
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).shadowSaveDisable.setVisibility(0);
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).shadowSave.setVisibility(8);
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).btnRetry.setClickable(true);
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).llAiServiceError.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSuccess$0(String str) {
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).gifLoading.setVisibility(8);
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).gifLoading.stop();
            AIPictureResultActivity.this.renderAIPicture(str);
            AIPictureResultActivity.this.aiPictureHistoryBean.setPictureFilePath(str);
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).shadowSaveDisable.setVisibility(8);
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).shadowSave.setVisibility(0);
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).btnRetry.setClickable(true);
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).tvHistory.setVisibility(0);
        }

        @Override // com.crrepa.band.my.device.ai.picture.d1
        public void onFail(String str, String str2) {
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).ivAiPicture.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.y
                @Override // java.lang.Runnable
                public final void run() {
                    AIPictureResultActivity.a.this.lambda$onFail$1();
                }
            });
        }

        @Override // com.crrepa.band.my.device.ai.picture.d1
        public void onSuccess(final String str) {
            ((ActivityAiPictureReslutBinding) ((BaseVBActivity) AIPictureResultActivity.this).binding).ivAiPicture.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.z
                @Override // java.lang.Runnable
                public final void run() {
                    AIPictureResultActivity.a.this.lambda$onSuccess$0(str);
                }
            });
        }
    }

    private void initDebugModel() {
        this.aiDebugModelDelegate = new com.crrepa.band.my.device.ai.debugmodel.d((ViewGroup) findViewById(R.id.content), ((ActivityAiPictureReslutBinding) this.binding).tvTitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        requestAIImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        AIPictureHistoryActivity.start(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(Animator animator) {
        AIPictureModel.save2PictureHistory(this.aiPictureHistoryBean);
        loadSavedCount();
        org.greenrobot.eventbus.c.getDefault().post(new AIPictureHistoryEvent());
        ((ActivityAiPictureReslutBinding) this.binding).shadowEditWatchFace.setVisibility(0);
        ((ActivityAiPictureReslutBinding) this.binding).llOperation.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(View view) {
        ((ActivityAiPictureReslutBinding) this.binding).btnSave.setClickable(false);
        VB vb = this.binding;
        e1.doSaveAnimator(this, ((ActivityAiPictureReslutBinding) vb).ivAiPicture, ((ActivityAiPictureReslutBinding) vb).tvHistory, ((ActivityAiPictureReslutBinding) vb).rlRootView, new e1.c() { // from class: com.crrepa.band.my.device.ai.picture.x
            @Override // com.crrepa.band.my.device.ai.picture.e1.c
            public final void onAnimationEnd(Animator animator) {
                AIPictureResultActivity.this.lambda$initBinding$3(animator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$5(View view) {
        if (TextUtils.isEmpty(this.aiPictureHistoryBean.getPictureFilePath())) {
            return;
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() == null) {
            com.moyoung.dafit.module.common.utils.r0.showShort(this, getString(com.crrepa.band.aviator.R.string.band_setting_send_fail));
            return;
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            HisiliconAIWatchFaceEditActivity.start(this, this.aiPictureHistoryBean.getPictureFilePath());
        } else if (com.crrepa.band.my.ble.band.utils.a.getInstance().isJieli707()) {
            JieliAIWatchFaceEditActivity.start(this, this.aiPictureHistoryBean.getPictureFilePath());
        } else {
            AIWatchFaceEditActivity.start(this, this.aiPictureHistoryBean.getPictureFilePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestAIImage$6() {
        if (this.isGifUnLoadedResource) {
            ((ActivityAiPictureReslutBinding) this.binding).gifLoading.setGifResource(com.crrepa.band.aviator.R.raw.anim_ai_picture_loading);
            this.isGifUnLoadedResource = false;
        }
        ((ActivityAiPictureReslutBinding) this.binding).gifLoading.start();
    }

    @SuppressLint({"SetTextI18n"})
    private void loadSavedCount() {
        String savedCount = AIPictureModel.getSavedCount();
        if (TextUtils.isEmpty(savedCount)) {
            ((ActivityAiPictureReslutBinding) this.binding).tvHistory.setText(getString(com.crrepa.band.aviator.R.string.ai_picture_history_btn_text));
            return;
        }
        ((ActivityAiPictureReslutBinding) this.binding).tvHistory.setText(getString(com.crrepa.band.aviator.R.string.ai_picture_history_btn_text) + "(" + savedCount + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderAIPicture(String str) {
        ((ActivityAiPictureReslutBinding) this.binding).ivAiPicture.setColorFilter(-16777216, PorterDuff.Mode.DST_OVER);
        Picasso.get().load(new File(str)).into(((ActivityAiPictureReslutBinding) this.binding).ivAiPicture);
    }

    private void requestAIImage() {
        String description = this.aiPictureHistoryBean.getDescription();
        String styleCode = this.aiPictureHistoryBean.getStyleCode();
        ((ActivityAiPictureReslutBinding) this.binding).ivAiPicture.setColorFilter(-16777216, PorterDuff.Mode.SRC);
        Picasso.get().load(com.crrepa.band.aviator.R.drawable.img_ai_picture_default).into(((ActivityAiPictureReslutBinding) this.binding).ivAiPicture);
        ((ActivityAiPictureReslutBinding) this.binding).btnRetry.setClickable(false);
        ((ActivityAiPictureReslutBinding) this.binding).shadowSaveDisable.setVisibility(0);
        ((ActivityAiPictureReslutBinding) this.binding).shadowSave.setVisibility(8);
        ((ActivityAiPictureReslutBinding) this.binding).tvHistory.setVisibility(8);
        ((ActivityAiPictureReslutBinding) this.binding).llAiServiceError.setVisibility(8);
        ((ActivityAiPictureReslutBinding) this.binding).gifLoading.setVisibility(0);
        ((ActivityAiPictureReslutBinding) this.binding).gifLoading.postDelayed(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.w
            @Override // java.lang.Runnable
            public final void run() {
                AIPictureResultActivity.this.lambda$requestAIImage$6();
            }
        }, 10L);
        if (this.aiPictureDelegate == null) {
            this.aiPictureDelegate = new AIPictureDelegate();
        }
        this.aiPictureDelegate.requestAIPicture(description, styleCode, new a());
        com.crrepa.band.my.device.ai.helper.d.logPictureImgEvent(false);
    }

    public static void start(Context context, AIPictureHistoryBean aIPictureHistoryBean) {
        start(context, aIPictureHistoryBean, false);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        com.moyoung.dafit.module.common.utils.k0.setColorNoTranslucent(this, ContextCompat.getColor(this, com.crrepa.band.aviator.R.color.translucent));
        org.greenrobot.eventbus.c.getDefault().register(this);
        initDebugModel();
        ((ActivityAiPictureReslutBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIPictureResultActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityAiPictureReslutBinding) this.binding).btnRetry.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIPictureResultActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityAiPictureReslutBinding) this.binding).tvHistory.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIPictureResultActivity.this.lambda$initBinding$2(view);
            }
        });
        ((ActivityAiPictureReslutBinding) this.binding).btnSave.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIPictureResultActivity.this.lambda$initBinding$4(view);
            }
        });
        ((ActivityAiPictureReslutBinding) this.binding).btnEditWatchFace.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIPictureResultActivity.this.lambda$initBinding$5(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    @SuppressLint({"SetTextI18n"})
    protected void loadData() {
        super.loadData();
        loadSavedCount();
        AIPictureHistoryBean aIPictureHistoryBean = (AIPictureHistoryBean) getIntent().getSerializableExtra(AIPictureHistoryBean.class.getSimpleName());
        this.aiPictureHistoryBean = aIPictureHistoryBean;
        ((ActivityAiPictureReslutBinding) this.binding).tvDescription.setText(aIPictureHistoryBean.getDescription());
        if (TextUtils.isEmpty(this.aiPictureHistoryBean.getStyleName())) {
            ((ActivityAiPictureReslutBinding) this.binding).tvDrawingStyle.setVisibility(8);
        } else {
            ((ActivityAiPictureReslutBinding) this.binding).tvDrawingStyle.setText(((Object) ((ActivityAiPictureReslutBinding) this.binding).tvDrawingStyle.getText()) + ":" + this.aiPictureHistoryBean.getStyleName());
        }
        if (!getIntent().getBooleanExtra("isFromHistory", false)) {
            requestAIImage();
            return;
        }
        renderAIPicture(this.aiPictureHistoryBean.getPictureFilePath());
        ((ActivityAiPictureReslutBinding) this.binding).llOperation.setVisibility(8);
        ((ActivityAiPictureReslutBinding) this.binding).shadowEditWatchFace.setVisibility(0);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onAIPictureHistoryEvent(AIPictureHistoryEvent aIPictureHistoryEvent) {
        loadSavedCount();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        com.crrepa.band.my.device.ai.debugmodel.d dVar = this.aiDebugModelDelegate;
        if (dVar != null) {
            dVar.destroy();
        }
    }

    public static void start(Context context, AIPictureHistoryBean aIPictureHistoryBean, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) AIPictureResultActivity.class);
        intent.putExtra(AIPictureHistoryBean.class.getSimpleName(), aIPictureHistoryBean);
        intent.putExtra("isFromHistory", z7);
        context.startActivity(intent);
    }
}
