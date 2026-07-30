package u0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ai.AIForegroundService;
import com.crrepa.band.my.device.ai.asr.q;
import com.crrepa.band.my.device.ai.chat.model.FetchCanceledEvent;
import com.crrepa.band.my.device.ai.chat.model.FetchQuestionEvent;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.tts.model.TtsStartEvent;
import com.crrepa.band.my.device.ai.tts.model.TtsStopEvent;
import com.crrepa.ble.conn.listener.CRPAiAgentListener;
import com.crrepa.ble.conn.type.CRPBleRecordingType;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class i implements CRPAiAgentListener {
    private q audioDecoderDelegate;
    private byte fetchType = 0;
    private final Context context = com.moyoung.dafit.module.common.utils.d.get();
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivateRecording$0() {
        this.audioDecoderDelegate.startRecord();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivateRecording$1() {
        if (this.audioDecoderDelegate == null) {
            AIForegroundService.start(this.context);
            this.audioDecoderDelegate = new q(3);
        }
        this.handler.postDelayed(new Runnable() { // from class: u0.g
            @Override // java.lang.Runnable
            public final void run() {
                i.this.lambda$onActivateRecording$0();
            }
        }, 10L);
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiAgentListener
    public void onActivateRecording(byte b8) {
        Log.d("AIFetch", "onActivateRecord" + ((int) b8));
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onActivateRecord()" + ((int) b8)));
        this.fetchType = b8;
        this.handler.post(new Runnable() { // from class: u0.h
            @Override // java.lang.Runnable
            public final void run() {
                i.this.lambda$onActivateRecording$1();
            }
        });
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiAgentListener
    public void onAskQuestion() {
        Log.d("AIFetch", "onAskQuestion");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onAskQuestion()"));
        org.greenrobot.eventbus.c.getDefault().post(new FetchQuestionEvent(this.fetchType));
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiAgentListener
    public void onCancel() {
        Log.d("AIFetch", "onCancel");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onCancel()"));
        q qVar = this.audioDecoderDelegate;
        if (qVar != null) {
            qVar.cancelRecord();
        }
        i4.getInstance().abortAIFetch();
        org.greenrobot.eventbus.c.getDefault().post(new FetchCanceledEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiAgentListener
    public void onPauseResponse() {
        Log.d("AIFetch", "onPauseResponse");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onPauseResponse()"));
        org.greenrobot.eventbus.c.getDefault().post(new TtsStopEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiAgentListener
    public void onPlayResponse() {
        Log.d("AIFetch", "onPlayResponse");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onPlayResponse()"));
        org.greenrobot.eventbus.c.getDefault().post(new TtsStartEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiAgentListener
    public void onStartRecording(byte[] bArr) {
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onRecording()"));
        q qVar = this.audioDecoderDelegate;
        if (qVar == null) {
            return;
        }
        qVar.recording(bArr);
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiAgentListener
    public void onStopRecording(CRPBleRecordingType cRPBleRecordingType) {
        Log.d("AIFetch", "onStopRecord");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.g("onStopRecord()"));
        q qVar = this.audioDecoderDelegate;
        if (qVar == null) {
            Log.d("AIFetch", "audioDecoderDelegate == null");
        } else {
            qVar.stopRecord();
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPAiAgentListener
    public void onSupportAiAgent(byte[] bArr) {
        Log.d("AIFetch", "supportFetches: " + Arrays.toString(bArr));
        AIProvider.saveSupportFetchArray(bArr);
    }
}
