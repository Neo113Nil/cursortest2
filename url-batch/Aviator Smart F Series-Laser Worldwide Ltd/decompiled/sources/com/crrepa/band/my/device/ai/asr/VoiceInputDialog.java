package com.crrepa.band.my.device.ai.asr;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.DialogVoiceInputBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;

/* loaded from: classes2.dex */
public class VoiceInputDialog extends BaseVBDialog<DialogVoiceInputBinding> {
    private String asrResult;
    private b onBtnClickListener;

    public enum Status {
        RECORDING,
        CANCEL_RECORD,
        RECOVER_CANCEL_RECORD,
        CANCELED_RECORD,
        RECOGNIZING,
        RECOGNIZED,
        RECOGNIZE_ERROR
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$band$my$device$ai$asr$VoiceInputDialog$Status;

        static {
            int[] iArr = new int[Status.values().length];
            $SwitchMap$com$crrepa$band$my$device$ai$asr$VoiceInputDialog$Status = iArr;
            try {
                iArr[Status.RECORDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$device$ai$asr$VoiceInputDialog$Status[Status.CANCEL_RECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$device$ai$asr$VoiceInputDialog$Status[Status.RECOVER_CANCEL_RECORD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$device$ai$asr$VoiceInputDialog$Status[Status.CANCELED_RECORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$device$ai$asr$VoiceInputDialog$Status[Status.RECOGNIZING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$device$ai$asr$VoiceInputDialog$Status[Status.RECOGNIZE_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$device$ai$asr$VoiceInputDialog$Status[Status.RECOGNIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface b {
        void onCommit(String str);

        void onDismiss();
    }

    public VoiceInputDialog(Context context) {
        super(context);
        setShowBottom();
        getWindow().setDimAmount(0.6f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        b bVar = this.onBtnClickListener;
        if (bVar != null) {
            bVar.onCommit(this.asrResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        dismiss();
    }

    public void clearTvAsrResult() {
        this.asrResult = "";
        ((DialogVoiceInputBinding) this.binding).tvAsrResult.setText("");
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        b bVar = this.onBtnClickListener;
        if (bVar != null) {
            bVar.onDismiss();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        ((DialogVoiceInputBinding) this.binding).tvAsrResult.setMovementMethod(ScrollingMovementMethod.getInstance());
        ((DialogVoiceInputBinding) this.binding).ivResultSend.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.asr.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceInputDialog.this.lambda$initBinding$0(view);
            }
        });
        ((DialogVoiceInputBinding) this.binding).ivResultCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.asr.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceInputDialog.this.lambda$initBinding$1(view);
            }
        });
        ((DialogVoiceInputBinding) this.binding).ivCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.asr.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceInputDialog.this.lambda$initBinding$2(view);
            }
        });
    }

    public void setOnBtnClickListener(b bVar) {
        this.onBtnClickListener = bVar;
    }

    public void setRecognizedText(String str) {
        this.asrResult = str;
    }

    public void setShowQuestionTips() {
        ((DialogVoiceInputBinding) this.binding).llQuestionTips.setVisibility(0);
    }

    public void updateStatusUI(Status status) {
        switch (a.$SwitchMap$com$crrepa$band$my$device$ai$asr$VoiceInputDialog$Status[status.ordinal()]) {
            case 1:
                clearTvAsrResult();
                ((DialogVoiceInputBinding) this.binding).animAsrRecording.setVisibility(0);
                break;
            case 2:
                ((DialogVoiceInputBinding) this.binding).ivCancel.setImageResource(R$drawable.ic_ai_cancel_h);
                ((DialogVoiceInputBinding) this.binding).ivMicIcon.setImageResource(R$drawable.ic_ai_voice_n);
                ((DialogVoiceInputBinding) this.binding).ivMicIconBg.setBackgroundResource(R$drawable.img_ai_voice_n);
                break;
            case 3:
                ((DialogVoiceInputBinding) this.binding).ivCancel.setImageResource(R$drawable.ic_ai_cancel_n);
                ((DialogVoiceInputBinding) this.binding).ivMicIcon.setImageResource(R$drawable.ic_ai_voice_h);
                ((DialogVoiceInputBinding) this.binding).ivMicIconBg.setBackgroundResource(R$drawable.img_ai_voice_p);
                break;
            case 4:
                clearTvAsrResult();
                dismiss();
                break;
            case 5:
                ((DialogVoiceInputBinding) this.binding).animAsrRecording.setVisibility(4);
                ((DialogVoiceInputBinding) this.binding).tvAsrRecognizing.setVisibility(0);
                ((DialogVoiceInputBinding) this.binding).pbAsrRecognizing.setVisibility(0);
                break;
            case 6:
                ((DialogVoiceInputBinding) this.binding).animAsrRecording.setVisibility(4);
                ((DialogVoiceInputBinding) this.binding).tvAsrRecognizing.setVisibility(4);
                ((DialogVoiceInputBinding) this.binding).pbAsrRecognizing.setVisibility(4);
                ((DialogVoiceInputBinding) this.binding).tvAsrError.setVisibility(0);
                break;
            case 7:
                ((DialogVoiceInputBinding) this.binding).animAsrRecording.setVisibility(4);
                ((DialogVoiceInputBinding) this.binding).tvAsrRecognizing.setVisibility(4);
                ((DialogVoiceInputBinding) this.binding).pbAsrRecognizing.setVisibility(4);
                if (!TextUtils.isEmpty(this.asrResult)) {
                    ((DialogVoiceInputBinding) this.binding).tvAsrResult.setText(this.asrResult);
                    ((DialogVoiceInputBinding) this.binding).ivCancel.setVisibility(4);
                    ((DialogVoiceInputBinding) this.binding).tvAsrResult.setVisibility(0);
                    ((DialogVoiceInputBinding) this.binding).ivResultCancel.setVisibility(0);
                    ((DialogVoiceInputBinding) this.binding).ivResultSend.setVisibility(0);
                    break;
                } else {
                    updateStatusUI(Status.RECOGNIZE_ERROR);
                    break;
                }
        }
    }
}
