package com.crrepa.band.my.device.ai.chat;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.artillery.ctc.base.LargeModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityAiChatBinding;
import com.crrepa.band.my.device.ai.asr.o;
import com.crrepa.band.my.device.ai.chat.AIChatActivity;
import com.crrepa.band.my.device.ai.chat.model.AIChatRecordEntity;
import com.crrepa.band.my.device.ai.chat.model.AIChatRecordProxy;
import com.crrepa.band.my.device.ai.chat.model.ModelChangedEvent;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.tts.AITTSPlayer;
import com.crrepa.band.my.device.ai.tts.model.TtsStopEvent;
import com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog;
import com.moyoung.dafit.module.common.baseui.BaseRequestPermissionVBActivity;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.x0;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class AIChatActivity extends BaseRequestPermissionVBActivity<ActivityAiChatBinding> {
    private AIChatRecordsAdapter aiChatRecordsAdapter;
    private com.crrepa.band.my.device.ai.debugmodel.d aiDebugModelDelegate;
    private com.crrepa.band.my.device.ai.asr.o asrInputUI;
    private final com.crrepa.band.my.device.ai.chat.delegate.c chatDelegate;
    private final com.crrepa.band.my.device.ai.chat.delegate.a chatManager;
    private PermissionDescriptionDialog permissionDialog;
    private final AIChatRecordProxy recordProxy = new AIChatRecordProxy();

    class a implements o.b {
        a() {
        }

        @Override // com.crrepa.band.my.device.ai.asr.o.b
        public void onInputBoardVisible(boolean z7) {
            ((ActivityAiChatBinding) ((BaseVBActivity) AIChatActivity.this).binding).rvRecords.scrollToPosition(AIChatActivity.this.getAdapterLastIndex());
        }

        @Override // com.crrepa.band.my.device.ai.asr.o.b
        public void onNoPermission() {
            AIChatActivity.this.showRequestPermissionDialog();
        }

        @Override // com.crrepa.band.my.device.ai.asr.o.b
        public void onTxtCommit(String str) {
            AIChatActivity.this.addOneChatRecord(true, str);
            AIChatActivity.this.requestChatGPT(str);
            AIChatActivity.this.asrInputUI.isAnswerRequesting = true;
        }

        @Override // com.crrepa.band.my.device.ai.asr.o.b
        public void onVoiceRecording() {
            AITTSPlayer.INSTANCE.stopTts();
        }
    }

    class b implements x {
        final /* synthetic */ int val$index;

        b(int i8) {
            this.val$index = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onEndedSuccess$1(String str, int i8) {
            AIChatActivity.this.addChatRecordToIndex(str, i8, true);
            if (AIChatActivity.this.chatDelegate.isResponseEnded()) {
                AIChatActivity.this.asrInputUI.isAnswerRequesting = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFail$2(String str, int i8) {
            AIChatActivity.this.addChatRecordToIndex(str, i8, true);
            if (AIChatActivity.this.chatDelegate.isResponseEnded()) {
                AIChatActivity.this.asrInputUI.isAnswerRequesting = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSuccess$0(String str, int i8) {
            AIChatActivity.this.addChatRecordToIndex(str, i8, false);
            if (AIChatActivity.this.chatDelegate.isResponseEnded()) {
                AIChatActivity.this.asrInputUI.isAnswerRequesting = false;
            }
        }

        @Override // com.crrepa.band.my.device.ai.chat.x
        public void onEndedSuccess(@NonNull final String str) {
            AIChatActivity aIChatActivity = AIChatActivity.this;
            final int i8 = this.val$index;
            aIChatActivity.runOnUiThread(new Runnable() { // from class: com.crrepa.band.my.device.ai.chat.k
                @Override // java.lang.Runnable
                public final void run() {
                    AIChatActivity.b.this.lambda$onEndedSuccess$1(str, i8);
                }
            });
        }

        @Override // com.crrepa.band.my.device.ai.chat.x
        public void onFail(int i8, @NonNull final String str) {
            AIChatActivity aIChatActivity = AIChatActivity.this;
            final int i9 = this.val$index;
            aIChatActivity.runOnUiThread(new Runnable() { // from class: com.crrepa.band.my.device.ai.chat.j
                @Override // java.lang.Runnable
                public final void run() {
                    AIChatActivity.b.this.lambda$onFail$2(str, i9);
                }
            });
        }

        @Override // com.crrepa.band.my.device.ai.chat.x
        public void onSuccess(@NonNull final String str) {
            AIChatActivity aIChatActivity = AIChatActivity.this;
            final int i8 = this.val$index;
            aIChatActivity.runOnUiThread(new Runnable() { // from class: com.crrepa.band.my.device.ai.chat.l
                @Override // java.lang.Runnable
                public final void run() {
                    AIChatActivity.b.this.lambda$onSuccess$0(str, i8);
                }
            });
        }
    }

    class c implements PermissionDescriptionDialog.b {
        c() {
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onEnable() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("麦克风", true);
            m.enableRecordAudioWithPermissionCheck(AIChatActivity.this);
        }

        @Override // com.crrepa.band.my.home.guidance.permission.dialog.PermissionDescriptionDialog.b
        public void onNotNow() {
            com.crrepa.band.my.home.guidance.c.appPermissionDialog("麦克风", false);
        }
    }

    public AIChatActivity() {
        com.crrepa.band.my.device.ai.chat.delegate.a aVar = new com.crrepa.band.my.device.ai.chat.delegate.a();
        this.chatManager = aVar;
        this.chatDelegate = aVar.getChatDelegate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChatRecordToIndex(String str, int i8, boolean z7) {
        AIChatRecordEntity item = this.aiChatRecordsAdapter.getItem(i8);
        if (item == null) {
            return;
        }
        item.setMsg(str);
        item.setIsResponseEnded(z7);
        this.aiChatRecordsAdapter.setData(i8, item);
        ((ActivityAiChatBinding) this.binding).rvRecords.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.chat.b
            @Override // java.lang.Runnable
            public final void run() {
                AIChatActivity.this.lambda$addChatRecordToIndex$6();
            }
        });
        if (z7) {
            this.aiChatRecordsAdapter.updateRecordForDB(item);
            AIChatRecordsAdapter.scrollToBottom(((ActivityAiChatBinding) this.binding).rvRecords);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneChatRecord(boolean z7, String str) {
        AIChatRecordEntity aIChatRecordEntity = new AIChatRecordEntity();
        aIChatRecordEntity.setMsgType();
        if (z7) {
            aIChatRecordEntity.setUserMsg(str);
        } else {
            aIChatRecordEntity.setAssistantMsg(str);
        }
        this.aiChatRecordsAdapter.addAndSaveNewRecord(aIChatRecordEntity);
        ((ActivityAiChatBinding) this.binding).rvRecords.postDelayed(new Runnable() { // from class: com.crrepa.band.my.device.ai.chat.i
            @Override // java.lang.Runnable
            public final void run() {
                AIChatActivity.this.lambda$addOneChatRecord$7();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getAdapterLastIndex() {
        return this.aiChatRecordsAdapter.getData().size() - 1;
    }

    public static Intent getCallingIntent(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, AIChatActivity.class);
        return intent;
    }

    private void initAsrInputUI() {
        com.crrepa.band.my.device.ai.asr.o oVar = new com.crrepa.band.my.device.ai.asr.o(this, ((ActivityAiChatBinding) this.binding).includeAsrInput, 1);
        this.asrInputUI = oVar;
        VB vb = this.binding;
        oVar.initEditTextRoll(((ActivityAiChatBinding) vb).rlRootView, ((ActivityAiChatBinding) vb).includeAsrInput.rlAsrInput);
        this.asrInputUI.setAsrInputListener(new a());
    }

    private void initDebugModel() {
        this.aiDebugModelDelegate = new com.crrepa.band.my.device.ai.debugmodel.d((ViewGroup) findViewById(R.id.content), ((ActivityAiChatBinding) this.binding).debugView);
    }

    private void initNewTopic() {
        com.crrepa.band.my.device.ai.chat.delegate.a aVar = this.chatManager;
        if (aVar != null) {
            aVar.clearCurrentTopic();
        }
        AIChatRecordsAdapter aIChatRecordsAdapter = this.aiChatRecordsAdapter;
        if (aIChatRecordsAdapter != null) {
            aIChatRecordsAdapter.setNewData(new ArrayList());
            AIChatRecordEntity aIChatRecordEntity = new AIChatRecordEntity();
            aIChatRecordEntity.setMsgType();
            aIChatRecordEntity.setAssistantMsg(getString(com.crrepa.band.aviator.R.string.ai_chat_welcomes));
            aIChatRecordEntity.setIsResponseEnded(true);
            this.aiChatRecordsAdapter.addAndSaveNewRecord(aIChatRecordEntity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addChatRecordToIndex$6() {
        AIChatRecordsAdapter.safeScrollToBottom(((ActivityAiChatBinding) this.binding).rvRecords);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addOneChatRecord$7() {
        AIChatRecordsAdapter.scrollToBottom(((ActivityAiChatBinding) this.binding).rvRecords);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        AITTSPlayer.INSTANCE.stopTts();
        if (this.asrInputUI.isAnswerRequesting) {
            return;
        }
        clearRecordForDB();
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initBinding$1(View view, MotionEvent motionEvent) {
        this.asrInputUI.hideSoftKeyboard();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        showLargeModePop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(View view) {
        showLargeModePop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadData$5() {
        AIChatRecordsAdapter.scrollToBottom(((ActivityAiChatBinding) this.binding).rvRecords);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLargeModePop$8(PopupWindow popupWindow, BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        AIProvider.saveSelectedLargeModel((LargeModel) baseQuickAdapter.getData().get(i8));
        com.crrepa.band.my.device.ai.chat.delegate.a aVar = this.chatManager;
        if (aVar != null) {
            aVar.clearCurrentTopic();
        }
        loadData();
        popupWindow.dismiss();
    }

    private void showLargeModePop() {
        if (this.chatDelegate.isResponseEnded()) {
            final PopupWindow popupWindow = new PopupWindow(this);
            View inflate = getLayoutInflater().inflate(com.crrepa.band.aviator.R.layout.popup_ai_large_mode, (ViewGroup) null);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.crrepa.band.aviator.R.id.rv);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            AILargeModeAdapter aILargeModeAdapter = new AILargeModeAdapter();
            aILargeModeAdapter.setNewData(AIProvider.getLargeModelList());
            recyclerView.setAdapter(aILargeModeAdapter);
            aILargeModeAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.ai.chat.h
                @Override // com.chad.library.adapter.base.listener.OnItemClickListener
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                    AIChatActivity.this.lambda$showLargeModePop$8(popupWindow, baseQuickAdapter, view, i8);
                }
            });
            popupWindow.setContentView(inflate);
            popupWindow.setWidth(com.moyoung.dafit.module.common.utils.o.dp2px(this, 160.0f));
            popupWindow.setHeight(-2);
            popupWindow.setFocusable(true);
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            int[] iArr = new int[2];
            ((ActivityAiChatBinding) this.binding).tvTitle.getLocationOnScreen(iArr);
            popupWindow.showAtLocation(((ActivityAiChatBinding) this.binding).getRoot(), 0, iArr[0] + ((((ActivityAiChatBinding) this.binding).tvTitle.getWidth() - popupWindow.getWidth()) / 2), iArr[1] + ((ActivityAiChatBinding) this.binding).tvTitle.getHeight());
        }
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

    public void clearRecordForDB() {
        if (!com.crrepa.band.my.device.ai.helper.d.isMultipleMode()) {
            this.recordProxy.deleteAll();
        } else {
            this.recordProxy.deleteAllByMsgType(AIProvider.getSelectedLargeModelType());
        }
    }

    void enableRecordAudio() {
        com.crrepa.band.my.home.guidance.c.systemPermission("麦克风", true);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    @SuppressLint({"ClickableViewAccessibility"})
    protected void initBinding() {
        super.initBinding();
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, com.crrepa.band.aviator.R.color.translucent));
        org.greenrobot.eventbus.c.getDefault().register(this);
        initDebugModel();
        initAsrInputUI();
        ((ActivityAiChatBinding) this.binding).rvRecords.setItemAnimator(null);
        ((ActivityAiChatBinding) this.binding).rvRecords.setLayoutManager(new LinearLayoutManager(this));
        AIChatRecordsAdapter aIChatRecordsAdapter = new AIChatRecordsAdapter(this.recordProxy);
        this.aiChatRecordsAdapter = aIChatRecordsAdapter;
        ((ActivityAiChatBinding) this.binding).rvRecords.setAdapter(aIChatRecordsAdapter);
        ((ActivityAiChatBinding) this.binding).tvNewTopic.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.chat.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIChatActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityAiChatBinding) this.binding).rvRecords.setOnTouchListener(new View.OnTouchListener() { // from class: com.crrepa.band.my.device.ai.chat.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$initBinding$1;
                lambda$initBinding$1 = AIChatActivity.this.lambda$initBinding$1(view, motionEvent);
                return lambda$initBinding$1;
            }
        });
        ((ActivityAiChatBinding) this.binding).tvBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.chat.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIChatActivity.this.lambda$initBinding$2(view);
            }
        });
        if (com.crrepa.band.my.device.ai.helper.d.isMultipleMode()) {
            ((ActivityAiChatBinding) this.binding).tvTitle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.chat.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AIChatActivity.this.lambda$initBinding$3(view);
                }
            });
            ((ActivityAiChatBinding) this.binding).ivTitleArrow.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.chat.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AIChatActivity.this.lambda$initBinding$4(view);
                }
            });
            ((ActivityAiChatBinding) this.binding).ivTitleArrow.setVisibility(0);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        List<AIChatRecordEntity> queryAll;
        String str;
        String str2;
        super.loadData();
        LargeModel selectedLargeModel = AIProvider.getSelectedLargeModel();
        if (com.crrepa.band.my.device.ai.helper.d.isMultipleMode()) {
            if (selectedLargeModel == null) {
                this.recordProxy.updateAllToDefaultLargeModel();
                str2 = "文心一言";
                str = com.crrepa.band.my.device.ai.chat.delegate.child.d.DEFAULT_LARGE_MODEL_TYPE;
            } else {
                String str3 = selectedLargeModel.name;
                str = selectedLargeModel.type;
                str2 = str3;
            }
            ((ActivityAiChatBinding) this.binding).tvTitle.setText(str2);
            queryAll = this.recordProxy.queryAllByMsgType(str);
        } else {
            queryAll = this.recordProxy.queryAll();
        }
        if (!x0.isNotEmpty(queryAll)) {
            initNewTopic();
        } else {
            this.aiChatRecordsAdapter.setNewData(queryAll);
            ((ActivityAiChatBinding) this.binding).rvRecords.postDelayed(new Runnable() { // from class: com.crrepa.band.my.device.ai.chat.a
                @Override // java.lang.Runnable
                public final void run() {
                    AIChatActivity.this.lambda$loadData$5();
                }
            }, 100L);
        }
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
        AITTSPlayer.INSTANCE.destroy();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(TtsStopEvent ttsStopEvent) {
        AITTSPlayer.INSTANCE.stopTts();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        m.onRequestPermissionsResult(this, i8, iArr);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseRequestPermissionVBActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        AITTSPlayer.INSTANCE.stopTts();
    }

    public void requestChatGPT(String str) {
        addOneChatRecord(false, "");
        int adapterLastIndex = getAdapterLastIndex();
        this.chatDelegate.setResponseEnded(false);
        this.chatManager.requestChatGPT(str, new b(adapterLastIndex));
    }

    void showDeniedForCall() {
        com.crrepa.band.my.home.guidance.c.systemPermission("麦克风", false);
    }

    void showNeverAskForCall() {
        com.orhanobut.logger.f.d("showNeverAskForCall");
        c0.jumpAppDetailsSetting(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEvent(ModelChangedEvent modelChangedEvent) {
        loadData();
    }
}
