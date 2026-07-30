package com.crrepa.band.my.device.ai.picture;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityAiPictureBinding;
import com.crrepa.band.my.device.ai.asr.o;
import com.crrepa.band.my.device.ai.picture.AIPictureActivity;
import com.crrepa.band.my.device.ai.picture.AIPictureDelegate;
import com.crrepa.band.my.device.ai.picture.adapter.AIPictureStyleAdapter;
import com.crrepa.band.my.device.ai.picture.model.AIPictureHistoryBean;
import com.crrepa.band.my.device.ai.picture.model.AIPictureHistoryEvent;
import com.crrepa.band.my.device.ai.picture.model.AIPictureModel;
import com.crrepa.band.my.device.ai.picture.model.AIPictureStyleBean;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionVBActivity;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class AIPictureActivity extends BaseRequestPermissionVBActivity<ActivityAiPictureBinding> {
    private com.crrepa.band.my.device.ai.debugmodel.d aiDebugModelDelegate;
    private com.crrepa.band.my.device.ai.asr.o asrInputUI;
    private PermissionDescriptionDialog permissionDialog;
    private AIPictureStyleAdapter styleAdapter;

    class a implements AIPictureDelegate.d {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStyleResult$0(List list) {
            AIPictureActivity.this.styleAdapter.setNewData(list);
            AIPictureActivity.this.styleAdapter.setSelectedPosition();
        }

        @Override // com.crrepa.band.my.device.ai.picture.AIPictureDelegate.d
        public void onFail() {
        }

        @Override // com.crrepa.band.my.device.ai.picture.AIPictureDelegate.d
        public void onStyleResult(final List<AIPictureStyleBean> list) {
            ((ActivityAiPictureBinding) ((BaseVBActivity) AIPictureActivity.this).binding).rvPicture.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.f
                @Override // java.lang.Runnable
                public final void run() {
                    AIPictureActivity.a.this.lambda$onStyleResult$0(list);
                }
            });
        }
    }

    class b implements o.b {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInputBoardVisible$0() {
            ((ActivityAiPictureBinding) ((BaseVBActivity) AIPictureActivity.this).binding).includeAsrInput.etInput.requestFocus();
        }

        @Override // com.crrepa.band.my.device.ai.asr.o.b
        public void onInputBoardVisible(boolean z7) {
            if (z7) {
                ((ActivityAiPictureBinding) ((BaseVBActivity) AIPictureActivity.this).binding).scrollView.fullScroll(130);
                ((ActivityAiPictureBinding) ((BaseVBActivity) AIPictureActivity.this).binding).scrollView.postDelayed(new Runnable() { // from class: com.crrepa.band.my.device.ai.picture.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        AIPictureActivity.b.this.lambda$onInputBoardVisible$0();
                    }
                }, 10L);
            }
        }

        @Override // com.crrepa.band.my.device.ai.asr.o.b
        public void onNoPermission() {
            AIPictureActivity.this.showRequestPermissionDialog();
        }

        @Override // com.crrepa.band.my.device.ai.asr.o.b
        public void onTxtCommit(String str) {
            AIPictureStyleBean pictureStyle = AIPictureActivity.this.styleAdapter.getPictureStyle();
            AIPictureResultActivity.start(AIPictureActivity.this, new AIPictureHistoryBean(pictureStyle.getStyle(), AIPictureActivity.this.styleAdapter.getStyleName(pictureStyle), str));
        }

        @Override // com.crrepa.band.my.device.ai.asr.o.b
        public /* bridge */ /* synthetic */ void onVoiceRecording() {
            com.crrepa.band.my.device.ai.asr.p.a(this);
        }
    }

    class c implements PermissionDescriptionDialog.b {
        c() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("麦克风", true);
            h.enableRecordAudioWithPermissionCheck(AIPictureActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("麦克风", false);
        }
    }

    public static Intent getCallingIntent(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, AIPictureActivity.class);
        return intent;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void initAiPictureStyleAdapter() {
        ((ActivityAiPictureBinding) this.binding).rvPicture.setLayoutManager(new GridLayoutManager(this, 4));
        AIPictureStyleAdapter aIPictureStyleAdapter = new AIPictureStyleAdapter(getApplicationContext());
        this.styleAdapter = aIPictureStyleAdapter;
        ((ActivityAiPictureBinding) this.binding).rvPicture.setAdapter(aIPictureStyleAdapter);
        this.styleAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.ai.picture.a
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                AIPictureActivity.this.lambda$initAiPictureStyleAdapter$4(baseQuickAdapter, view, i8);
            }
        });
    }

    private void initAsrInputUI() {
        com.crrepa.band.my.device.ai.asr.o oVar = new com.crrepa.band.my.device.ai.asr.o(this, ((ActivityAiPictureBinding) this.binding).includeAsrInput, 0);
        this.asrInputUI = oVar;
        VB vb = this.binding;
        oVar.initEditTextRoll(((ActivityAiPictureBinding) vb).rlRootView, ((ActivityAiPictureBinding) vb).includeAsrInput.rlAsrInput);
        this.asrInputUI.setShowQuestionTips(false);
        this.asrInputUI.setAsrInputListener(new b());
    }

    private void initDebugModel() {
        this.aiDebugModelDelegate = new com.crrepa.band.my.device.ai.debugmodel.d((ViewGroup) findViewById(R.id.content), ((ActivityAiPictureBinding) this.binding).tvTitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAiPictureStyleAdapter$4(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        this.styleAdapter.setSelectedPosition(i8);
        this.styleAdapter.notifyDataSetChanged();
        this.asrInputUI.hideSoftKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        AIPictureHistoryActivity.start(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initBinding$2(View view, MotionEvent motionEvent) {
        this.asrInputUI.hideSoftKeyboard();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initBinding$3(View view, MotionEvent motionEvent) {
        this.asrInputUI.hideSoftKeyboard();
        return false;
    }

    private void loadAIPictureStyle() {
        if (com.moyoung.dafit.module.common.utils.a0.isNetworkConnected(getApplicationContext())) {
            new AIPictureDelegate().requestPictureStyle(new a());
        } else {
            com.moyoung.dafit.module.common.utils.r0.showShort(getApplicationContext(), com.crrepa.band.aviator.R.string.net_disonnected);
        }
    }

    private void loadLatestSavedPicture() {
        AIPictureHistoryBean latestPictureHistory = AIPictureModel.getLatestPictureHistory();
        if (latestPictureHistory == null) {
            Picasso.get().load(com.crrepa.band.aviator.R.drawable.img_ai_picture_default).into(((ActivityAiPictureBinding) this.binding).ivAiPicture);
            ((ActivityAiPictureBinding) this.binding).tvPictureDescription.setText(com.crrepa.band.aviator.R.string.ai_picture_home_default_example_text);
        } else {
            Picasso.get().load(new File(latestPictureHistory.getPictureFilePath())).into(((ActivityAiPictureBinding) this.binding).ivAiPicture);
            ((ActivityAiPictureBinding) this.binding).tvPictureDescription.setText(latestPictureHistory.getDescription());
        }
    }

    @SuppressLint({"SetTextI18n"})
    private void loadSavedCount() {
        String savedCount = AIPictureModel.getSavedCount();
        if (TextUtils.isEmpty(savedCount)) {
            ((ActivityAiPictureBinding) this.binding).tvHistory.setText(getString(com.crrepa.band.aviator.R.string.ai_picture_history_btn_text));
            return;
        }
        ((ActivityAiPictureBinding) this.binding).tvHistory.setText(getString(com.crrepa.band.aviator.R.string.ai_picture_history_btn_text) + "(" + savedCount + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRequestPermissionDialog() {
        if (this.permissionDialog == null) {
            this.permissionDialog = PermissionDescriptionDialog.builderSinglePermission().setIcon(R$drawable.popup_microphone).setTitle(com.crrepa.band.aviator.R.string.permission_microphone_title).setContent(com.crrepa.band.aviator.R.string.permission_microphone_content).setOnClickListener(new c()).build(this);
        }
        PermissionDescriptionDialog permissionDescriptionDialog = this.permissionDialog;
        if (permissionDescriptionDialog == null || permissionDescriptionDialog.isShowing()) {
            return;
        }
        this.permissionDialog.show();
    }

    void enableRecordAudio() {
        com.crrepa.band.my.home.guidance.c.systemPermission("麦克风", true);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    @SuppressLint({"ClickableViewAccessibility"})
    protected void initBinding() {
        super.initBinding();
        com.moyoung.dafit.module.common.utils.k0.setColorNoTranslucent(this, ContextCompat.getColor(this, com.crrepa.band.aviator.R.color.translucent));
        org.greenrobot.eventbus.c.getDefault().register(this);
        initDebugModel();
        initAsrInputUI();
        initAiPictureStyleAdapter();
        ((ActivityAiPictureBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIPictureActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityAiPictureBinding) this.binding).tvHistory.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIPictureActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityAiPictureBinding) this.binding).scrollView.setOnTouchListener(new View.OnTouchListener() { // from class: com.crrepa.band.my.device.ai.picture.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$initBinding$2;
                lambda$initBinding$2 = AIPictureActivity.this.lambda$initBinding$2(view, motionEvent);
                return lambda$initBinding$2;
            }
        });
        ((ActivityAiPictureBinding) this.binding).rvPicture.setOnTouchListener(new View.OnTouchListener() { // from class: com.crrepa.band.my.device.ai.picture.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$initBinding$3;
                lambda$initBinding$3 = AIPictureActivity.this.lambda$initBinding$3(view, motionEvent);
                return lambda$initBinding$3;
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        Picasso.get().load(com.crrepa.band.aviator.R.drawable.img_ai_picture_default).into(((ActivityAiPictureBinding) this.binding).ivAiPicture);
        loadSavedCount();
        loadLatestSavedPicture();
        loadAIPictureStyle();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onAIPictureHistoryEvent(AIPictureHistoryEvent aIPictureHistoryEvent) {
        loadSavedCount();
        loadLatestSavedPicture();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        com.crrepa.band.my.device.ai.asr.o oVar = this.asrInputUI;
        if (oVar != null) {
            oVar.destroy();
        }
        com.crrepa.band.my.device.ai.debugmodel.d dVar = this.aiDebugModelDelegate;
        if (dVar != null) {
            dVar.destroy();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        h.onRequestPermissionsResult(this, i8, iArr);
    }

    void showDeniedForCall() {
        com.crrepa.band.my.home.guidance.c.systemPermission("麦克风", false);
    }

    void showNeverAskForCall() {
        com.orhanobut.logger.f.d("showNeverAskForCall");
        com.moyoung.dafit.module.common.utils.c0.jumpAppDetailsSetting(this);
    }
}
