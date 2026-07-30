package com.crrepa.band.my.device.ai.chat;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.artillery.ctc.base.LargeModel;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ai.AIForegroundService;
import com.crrepa.band.my.device.ai.chat.model.ChatCanceledEvent;
import com.crrepa.band.my.device.ai.chat.model.ChatQuestionEvent;
import com.crrepa.band.my.device.ai.chat.model.ModelChangedEvent;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.tts.model.TtsStartEvent;
import com.crrepa.band.my.device.ai.tts.model.TtsStopEvent;
import com.crrepa.ble.conn.listener.CRPChatChangeListener;
import com.crrepa.ble.conn.type.CRPBleRecordingType;
import com.moyoung.dafit.module.common.utils.x0;
import java.util.List;

/* loaded from: classes2.dex */
public class p implements CRPChatChangeListener {
    private com.crrepa.band.my.device.ai.asr.q audioDecoderDelegate;
    private final Context context;
    private final Handler handler = new Handler(Looper.getMainLooper());

    public p(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivateRecording$0() {
        this.audioDecoderDelegate.startRecord();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivateRecording$1() {
        if (this.audioDecoderDelegate == null) {
            AIForegroundService.start(this.context);
            this.audioDecoderDelegate = new com.crrepa.band.my.device.ai.asr.q(1);
        }
        this.handler.postDelayed(new Runnable() { // from class: com.crrepa.band.my.device.ai.chat.n
            @Override // java.lang.Runnable
            public final void run() {
                p.this.lambda$onActivateRecording$0();
            }
        }, 10L);
    }

    @Override // com.crrepa.ble.conn.listener.CRPChatChangeListener
    public void onActivateRecording() {
        org.greenrobot.eventbus.c.getDefault().post(new ChatCanceledEvent());
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onActivateRecord()"));
        Log.d("AIChat", "onActivateRecord");
        this.handler.post(new Runnable() { // from class: com.crrepa.band.my.device.ai.chat.o
            @Override // java.lang.Runnable
            public final void run() {
                p.this.lambda$onActivateRecording$1();
            }
        });
    }

    @Override // com.crrepa.ble.conn.listener.CRPChatChangeListener
    public void onAskQuestion() {
        Log.d("AIChat", "onAskQuestion");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onAskQuestion()"));
        org.greenrobot.eventbus.c.getDefault().post(new ChatQuestionEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPChatChangeListener
    public void onCancel() {
        Log.d("AIChat", "onCancel");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onCancel()"));
        com.crrepa.band.my.device.ai.asr.q qVar = this.audioDecoderDelegate;
        if (qVar != null) {
            qVar.cancelRecord();
        }
        i4.getInstance().abortChat();
        org.greenrobot.eventbus.c.getDefault().post(new ChatCanceledEvent());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.crrepa.ble.conn.listener.CRPChatChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onModelChanged(byte b8) {
        Log.d("AIChat", "onModelChanged=" + ((int) b8));
        List<LargeModel> largeModelList = AIProvider.getLargeModelList();
        if (!x0.isNotEmpty(largeModelList)) {
            return;
        }
        LargeModel largeModel = null;
        if (b8 == 1) {
            for (LargeModel largeModel2 : largeModelList) {
                if (com.crrepa.band.my.device.ai.chat.delegate.child.d.DEFAULT_LARGE_MODEL_TYPE.equals(largeModel2.type)) {
                    largeModel = largeModel2;
                    break;
                }
            }
            if (largeModel != null) {
                AIProvider.saveSelectedLargeModel(largeModelList.get(b8));
                org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.b());
                org.greenrobot.eventbus.c.getDefault().post(new ModelChangedEvent());
                return;
            }
            return;
        }
        if (b8 == 3) {
            for (LargeModel largeModel22 : largeModelList) {
                if ("deepseek".equals(largeModel22.type)) {
                    largeModel = largeModel22;
                    break;
                }
            }
            if (largeModel != null) {
            }
        } else {
            if (b8 == 5) {
                for (LargeModel largeModel222 : largeModelList) {
                    if ("doubao".equals(largeModel222.type)) {
                        largeModel = largeModel222;
                        break;
                    }
                }
            }
            if (largeModel != null) {
            }
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPChatChangeListener
    public void onPauseResponse() {
        Log.d("AIChat", "onPauseResponse");
        org.greenrobot.eventbus.c.getDefault().post(new TtsStopEvent());
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onPauseResponse()"));
    }

    @Override // com.crrepa.ble.conn.listener.CRPChatChangeListener
    public void onPlayResponse() {
        Log.d("AIChat", "onPlayResponse");
        org.greenrobot.eventbus.c.getDefault().post(new TtsStartEvent());
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onPlayResponse()"));
    }

    @Override // com.crrepa.ble.conn.listener.CRPChatChangeListener
    public void onStartRecording(byte[] bArr) {
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onRecording()"));
        com.crrepa.band.my.device.ai.asr.q qVar = this.audioDecoderDelegate;
        if (qVar == null) {
            return;
        }
        qVar.recording(bArr);
    }

    @Override // com.crrepa.ble.conn.listener.CRPChatChangeListener
    public void onStopRecording(CRPBleRecordingType cRPBleRecordingType) {
        Log.d("AIChat", "onStopRecord");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onStopRecord()"));
        com.crrepa.band.my.device.ai.asr.q qVar = this.audioDecoderDelegate;
        if (qVar == null) {
            Log.d("AIChat", "audioDecoderDelegate == null");
        } else {
            qVar.stopRecord();
        }
    }
}
