package com.crrepa.band.my.device.ai.asr;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.LayoutAsrInputBinding;
import com.crrepa.band.my.device.ai.asr.VoiceInputDialog;
import com.crrepa.band.my.device.ai.asr.r;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.r0;

/* loaded from: classes2.dex */
public class o implements r.a {
    private final Activity activity;
    private final int aiType;
    private b asrInputListener;
    private final LayoutAsrInputBinding binding;
    private s pcmRecorder;
    private VoiceInputDialog voiceInputDialog;
    private final r asrDelegate = new g(this);
    public boolean isAnswerRequesting = false;
    private boolean isKeyBoardVisible = false;
    private boolean showQuestionTips = false;

    class a implements VoiceInputDialog.b {
        a() {
        }

        @Override // com.crrepa.band.my.device.ai.asr.VoiceInputDialog.b
        public void onCommit(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (!a0.isNetworkConnected(o.this.activity.getApplicationContext())) {
                r0.showShort(o.this.activity.getApplicationContext(), R.string.net_disonnected);
                return;
            }
            if (o.this.asrInputListener != null) {
                o.this.asrInputListener.onTxtCommit(str);
            }
            o.this.voiceInputDialog.dismiss();
        }

        @Override // com.crrepa.band.my.device.ai.asr.VoiceInputDialog.b
        public void onDismiss() {
            o.this.binding.rlInputVoice.setVisibility(0);
            o.this.asrDelegate.cancel();
        }
    }

    public interface b {
        void onInputBoardVisible(boolean z7);

        void onNoPermission();

        void onTxtCommit(String str);

        void onVoiceRecording();
    }

    public o(@NonNull Activity activity, @NonNull LayoutAsrInputBinding layoutAsrInputBinding, int i8) {
        this.activity = activity;
        this.binding = layoutAsrInputBinding;
        this.aiType = i8;
        initWidgetListener(layoutAsrInputBinding);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initWidgetListener(final LayoutAsrInputBinding layoutAsrInputBinding) {
        layoutAsrInputBinding.ivSwitch2Voice.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.asr.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o.this.lambda$initWidgetListener$0(layoutAsrInputBinding, view);
            }
        });
        layoutAsrInputBinding.ivSwitch2Keyboard.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.asr.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o.this.lambda$initWidgetListener$1(layoutAsrInputBinding, view);
            }
        });
        layoutAsrInputBinding.ivKeyboardSend.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.asr.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o.this.lambda$initWidgetListener$2(layoutAsrInputBinding, view);
            }
        });
        layoutAsrInputBinding.tvVoiceHandle.setOnTouchListener(new View.OnTouchListener() { // from class: com.crrepa.band.my.device.ai.asr.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$initWidgetListener$3;
                lambda$initWidgetListener$3 = o.this.lambda$initWidgetListener$3(layoutAsrInputBinding, view, motionEvent);
                return lambda$initWidgetListener$3;
            }
        });
    }

    private static boolean isCancelRecordingArea(MotionEvent motionEvent) {
        return motionEvent.getY() < 0.0f && Math.abs(motionEvent.getY()) > 500.0f && Math.abs(motionEvent.getY()) < 700.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initEditTextRoll$4(ViewGroup viewGroup, View view) {
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        int height = viewGroup.getRootView().getHeight() - rect.bottom;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (height > 100) {
            if (this.isKeyBoardVisible) {
                return;
            }
            int[] iArr = new int[2];
            this.binding.rlAsrInput.getLocationInWindow(iArr);
            layoutParams.bottomMargin = (iArr[1] + this.binding.rlAsrInput.getHeight()) - rect.bottom;
            this.isKeyBoardVisible = true;
            b bVar = this.asrInputListener;
            if (bVar != null) {
                bVar.onInputBoardVisible(true);
            }
        } else {
            if (!this.isKeyBoardVisible) {
                return;
            }
            layoutParams.bottomMargin = 0;
            this.isKeyBoardVisible = false;
            b bVar2 = this.asrInputListener;
            if (bVar2 != null) {
                bVar2.onInputBoardVisible(false);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWidgetListener$0(LayoutAsrInputBinding layoutAsrInputBinding, View view) {
        layoutAsrInputBinding.rlInputKeyboard.setVisibility(8);
        layoutAsrInputBinding.rlInputVoice.setVisibility(0);
        hideSoftKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWidgetListener$1(LayoutAsrInputBinding layoutAsrInputBinding, View view) {
        layoutAsrInputBinding.rlInputKeyboard.setVisibility(0);
        layoutAsrInputBinding.rlInputVoice.setVisibility(8);
        hideSoftKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWidgetListener$2(LayoutAsrInputBinding layoutAsrInputBinding, View view) {
        String trim = layoutAsrInputBinding.etInput.getText().toString().trim();
        if (TextUtils.isEmpty(trim) || this.isAnswerRequesting) {
            return;
        }
        hideSoftKeyboard();
        if (!a0.isNetworkConnected(this.activity.getApplicationContext())) {
            r0.showShort(this.activity.getApplicationContext(), R.string.net_disonnected);
            return;
        }
        b bVar = this.asrInputListener;
        if (bVar != null) {
            bVar.onTxtCommit(trim);
        }
        layoutAsrInputBinding.etInput.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initWidgetListener$3(LayoutAsrInputBinding layoutAsrInputBinding, View view, MotionEvent motionEvent) {
        if (!q7.b.hasSelfPermissions(this.activity, "android.permission.RECORD_AUDIO")) {
            b bVar = this.asrInputListener;
            if (bVar != null) {
                bVar.onNoPermission();
            }
            return true;
        }
        if (this.isAnswerRequesting) {
            return true;
        }
        b bVar2 = this.asrInputListener;
        if (bVar2 != null) {
            bVar2.onVoiceRecording();
        }
        if (motionEvent.getAction() == 0) {
            resetPCMRecorder();
            resetVoiceInputDialog();
            this.voiceInputDialog.show();
            this.voiceInputDialog.updateStatusUI(VoiceInputDialog.Status.RECORDING);
            layoutAsrInputBinding.rlInputVoice.setVisibility(8);
            this.pcmRecorder.start();
        } else if (motionEvent.getAction() == 2) {
            Log.d("event.getY()", motionEvent.getY() + "");
            if (isCancelRecordingArea(motionEvent)) {
                VoiceInputDialog voiceInputDialog = this.voiceInputDialog;
                if (voiceInputDialog != null) {
                    voiceInputDialog.updateStatusUI(VoiceInputDialog.Status.CANCEL_RECORD);
                }
            } else {
                VoiceInputDialog voiceInputDialog2 = this.voiceInputDialog;
                if (voiceInputDialog2 != null) {
                    voiceInputDialog2.updateStatusUI(VoiceInputDialog.Status.RECOVER_CANCEL_RECORD);
                }
            }
        } else if (motionEvent.getAction() == 1) {
            if (isCancelRecordingArea(motionEvent)) {
                VoiceInputDialog voiceInputDialog3 = this.voiceInputDialog;
                if (voiceInputDialog3 != null) {
                    voiceInputDialog3.updateStatusUI(VoiceInputDialog.Status.CANCELED_RECORD);
                }
                return true;
            }
            if (this.voiceInputDialog != null) {
                if (a0.isNetworkConnected(this.activity.getApplicationContext())) {
                    this.voiceInputDialog.updateStatusUI(VoiceInputDialog.Status.RECOGNIZING);
                } else {
                    r0.showShort(this.activity.getApplicationContext(), R.string.net_disonnected);
                    this.voiceInputDialog.updateStatusUI(VoiceInputDialog.Status.RECOGNIZE_ERROR);
                }
            }
            this.pcmRecorder.stop();
            this.asrDelegate.startRecognize(this.aiType, false);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRecognizeError$6() {
        VoiceInputDialog voiceInputDialog = this.voiceInputDialog;
        if (voiceInputDialog != null) {
            voiceInputDialog.updateStatusUI(VoiceInputDialog.Status.RECOGNIZE_ERROR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRecognizeResult$5(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        VoiceInputDialog voiceInputDialog = this.voiceInputDialog;
        if (voiceInputDialog != null) {
            voiceInputDialog.setRecognizedText(str);
            this.voiceInputDialog.updateStatusUI(VoiceInputDialog.Status.RECOGNIZED);
        }
    }

    private void resetPCMRecorder() {
        s sVar = this.pcmRecorder;
        if (sVar != null) {
            sVar.release();
        }
        this.pcmRecorder = new s(this.activity.getApplicationContext());
    }

    private void resetVoiceInputDialog() {
        VoiceInputDialog voiceInputDialog = this.voiceInputDialog;
        if (voiceInputDialog != null) {
            voiceInputDialog.dismiss();
        }
        VoiceInputDialog voiceInputDialog2 = new VoiceInputDialog(this.activity);
        this.voiceInputDialog = voiceInputDialog2;
        if (this.showQuestionTips) {
            voiceInputDialog2.setShowQuestionTips();
        }
        this.voiceInputDialog.setOnBtnClickListener(new a());
    }

    public void destroy() {
        s sVar = this.pcmRecorder;
        if (sVar != null) {
            sVar.stop();
            this.pcmRecorder.release();
        }
    }

    public void hideSoftKeyboard() {
        com.crrepa.band.my.device.stock.b.hide(this.binding.etInput);
    }

    public void initEditTextRoll(@NonNull final ViewGroup viewGroup, final View view) {
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.crrepa.band.my.device.ai.asr.l
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                o.this.lambda$initEditTextRoll$4(viewGroup, view);
            }
        });
    }

    @Override // com.crrepa.band.my.device.ai.asr.r.a
    public void onRecognizeError(String str) {
        this.binding.tvVoiceHandle.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.asr.m
            @Override // java.lang.Runnable
            public final void run() {
                o.this.lambda$onRecognizeError$6();
            }
        });
    }

    @Override // com.crrepa.band.my.device.ai.asr.r.a
    public void onRecognizeResult(final String str) {
        this.binding.tvVoiceHandle.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.asr.n
            @Override // java.lang.Runnable
            public final void run() {
                o.this.lambda$onRecognizeResult$5(str);
            }
        });
    }

    public void setAsrInputListener(@NonNull b bVar) {
        this.asrInputListener = bVar;
    }

    public void setShowQuestionTips(boolean z7) {
        this.showQuestionTips = z7;
    }
}
