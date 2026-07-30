package com.crrepa.band.my.device.ai;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ai.asr.g;
import com.crrepa.band.my.device.ai.asr.model.AsrRecordStatusEvent;
import com.crrepa.band.my.device.ai.asr.r;
import com.crrepa.band.my.device.ai.chat.model.ChatCanceledEvent;
import com.crrepa.band.my.device.ai.chat.model.ChatQuestionEvent;
import com.crrepa.band.my.device.ai.chat.model.FetchCanceledEvent;
import com.crrepa.band.my.device.ai.chat.model.FetchQuestionEvent;
import com.crrepa.band.my.device.ai.chat.model.HisiliconErrorCode;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.helper.d;
import com.crrepa.band.my.device.ai.picture.AIPictureDelegate;
import com.crrepa.band.my.device.ai.picture.c1;
import com.crrepa.band.my.device.ai.picture.d1;
import com.crrepa.band.my.device.ai.picture.model.AIPictureModel;
import com.crrepa.band.my.device.ai.picture.model.ConfirmPreviewEvent;
import com.crrepa.band.my.device.ai.picture.model.RequestPreviewEvent;
import com.crrepa.band.my.device.ai.tts.AITTSPlayer;
import com.crrepa.band.my.device.ai.tts.e;
import com.crrepa.band.my.device.ai.tts.model.TtsStartEvent;
import com.crrepa.band.my.device.ai.tts.model.TtsStopEvent;
import com.crrepa.ble.conn.bean.CRPAiWatchFacePreviewInfo;
import com.crrepa.ble.conn.type.CRPChatErrorCode;
import com.moyoung.dafit.module.common.utils.x0;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.greenrobot.eventbus.l;
import u0.f;

/* loaded from: classes2.dex */
public class AIForegroundService extends Service implements r.a {
    private int aiType;
    private String asrResultTxt;
    private String ttsUrl;
    private final r asrDelegate = new g(this);
    private final com.crrepa.band.my.device.ai.chat.delegate.b chatDelegate = new com.crrepa.band.my.device.ai.chat.delegate.b();
    private final f fetchDelegate = new f();
    private final AIPictureDelegate aiPictureDelegate = new AIPictureDelegate();
    private final c1 aiWatchFaceUploadDelegate = new c1();

    class a implements d1 {
        final /* synthetic */ RequestPreviewEvent val$event;

        a(RequestPreviewEvent requestPreviewEvent) {
            this.val$event = requestPreviewEvent;
        }

        @Override // com.crrepa.band.my.device.ai.picture.d1
        public void onFail(String str, String str2) {
            i4.getInstance().sendAIWatchFaceError(CRPChatErrorCode.SERVER_BUSY_ERROR);
        }

        @Override // com.crrepa.band.my.device.ai.picture.d1
        public void onSuccess(String str) {
            AIForegroundService.this.sendAIWatchFacePreview(str, this.val$event.getWatchFacePreviewInfo());
        }
    }

    class b implements AITTSPlayer.b {
        b() {
        }

        @Override // com.crrepa.band.my.device.ai.tts.AITTSPlayer.b
        public void onAudioCreated(String str) {
            AIForegroundService.this.ttsUrl = str;
        }

        @Override // com.crrepa.band.my.device.ai.tts.AITTSPlayer.b
        public /* bridge */ /* synthetic */ void onAudioRequesting() {
            e.b(this);
        }

        @Override // com.crrepa.band.my.device.ai.tts.AITTSPlayer.b
        public /* bridge */ /* synthetic */ void onPlayEnded() {
            e.c(this);
        }

        @Override // com.crrepa.band.my.device.ai.tts.AITTSPlayer.b
        public /* bridge */ /* synthetic */ void onPlayStopped() {
            e.d(this);
        }

        @Override // com.crrepa.band.my.device.ai.tts.AITTSPlayer.b
        public /* bridge */ /* synthetic */ void onPlaying() {
            e.e(this);
        }

        @Override // com.crrepa.band.my.device.ai.tts.AITTSPlayer.b
        public /* bridge */ /* synthetic */ void onTtsRequestFailed() {
            e.f(this);
        }
    }

    private static Intent getServiceIntent(Context context) {
        return new Intent(context, (Class<?>) AIForegroundService.class);
    }

    private void makeServiceForeground() {
        if (Build.VERSION.SDK_INT >= 26) {
            Notification showChatNotification = m1.a.showChatNotification(this);
            com.orhanobut.logger.f.d("startForeground");
            startForeground(8, showChatNotification);
        }
    }

    private void sendAIQuestion(String str) {
        int i8 = this.aiType;
        if (i8 != 1) {
            if (i8 == 3) {
                i4.getInstance().sendAIFetchQuestion(this.fetchDelegate.getFetchType(), str);
                return;
            } else {
                i4.getInstance().sendAIWatchFaceDescribe(str);
                return;
            }
        }
        if (!com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            i4.getInstance().sendChatQuestion(str);
        } else {
            i4.getInstance().sendHisiliconChatQuestion(str);
            c.getDefault().post(new ChatQuestionEvent());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAIWatchFacePreview(@NonNull String str, CRPAiWatchFacePreviewInfo cRPAiWatchFacePreviewInfo) {
        this.aiWatchFaceUploadDelegate.setPictureFilePath(str);
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            this.aiWatchFaceUploadDelegate.sendHisiliconAIWatchFacePreview(cRPAiWatchFacePreviewInfo);
            this.aiWatchFaceUploadDelegate.setHisiliconAIWatchFace();
        } else {
            this.aiWatchFaceUploadDelegate.sendAIWatchFacePreview(cRPAiWatchFacePreviewInfo);
        }
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(AIPictureModel.SENT_AI_PICTURE_PATH, null);
        c.getDefault().post(new com.crrepa.band.my.device.ai.b());
    }

    public static void start(Context context) {
        ContextCompat.startForegroundService(context, getServiceIntent(context));
    }

    public static void stop(Context context) {
        context.stopService(getServiceIntent(context));
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c.getDefault().register(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        AITTSPlayer.INSTANCE.destroy();
        stopForeground(true);
        m1.a.hideChatNotification(this);
        c.getDefault().unregister(this);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(AsrRecordStatusEvent asrRecordStatusEvent) {
        this.aiType = asrRecordStatusEvent.getAiType();
        if (asrRecordStatusEvent.getRecordStatus() == 0) {
            this.asrResultTxt = "";
        } else if (asrRecordStatusEvent.getRecordStatus() == 1) {
            this.asrDelegate.startRecognize(this.aiType, true);
        } else {
            this.asrDelegate.cancel();
        }
    }

    @Override // com.crrepa.band.my.device.ai.asr.r.a
    public void onRecognizeError(String str) {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            d.sendHisiliconAIError(this.aiType, HisiliconErrorCode.AI_SERVER_BUSY);
        } else {
            d.sendAIError(this.aiType, CRPChatErrorCode.VOICE_CONVERSION_ERROR);
        }
    }

    @Override // com.crrepa.band.my.device.ai.asr.r.a
    public void onRecognizeResult(String str) {
        this.ttsUrl = "";
        this.asrResultTxt = str;
        if (!TextUtils.isEmpty(str)) {
            sendAIQuestion(str);
        } else if (com.crrepa.band.my.ble.band.utils.a.getInstance().isHisilicon()) {
            d.sendHisiliconAIError(this.aiType, HisiliconErrorCode.AI_SERVER_BUSY);
        } else {
            d.sendAIError(this.aiType, CRPChatErrorCode.VOICE_CONVERSION_ERROR);
        }
    }

    @Override // android.app.Service
    @SuppressLint({"WrongConstant"})
    public int onStartCommand(Intent intent, int i8, int i9) {
        makeServiceForeground();
        return 1;
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(ChatQuestionEvent chatQuestionEvent) {
        this.chatDelegate.resetQid();
        this.chatDelegate.requestChatGPTForWatch(this.asrResultTxt);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(ChatCanceledEvent chatCanceledEvent) {
        this.chatDelegate.resetQid();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(FetchQuestionEvent fetchQuestionEvent) {
        this.fetchDelegate.setFetchType(fetchQuestionEvent.fetchType);
        this.fetchDelegate.startFetchAgent(this.asrResultTxt, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(FetchCanceledEvent fetchCanceledEvent) {
        this.fetchDelegate.resetRequestId();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(RequestPreviewEvent requestPreviewEvent) {
        this.aiWatchFaceUploadDelegate.setPictureFilePath("");
        this.aiPictureDelegate.requestAIPictureForWatch(this.asrResultTxt, new a(requestPreviewEvent));
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(ConfirmPreviewEvent confirmPreviewEvent) {
        this.aiWatchFaceUploadDelegate.sendAIWatchFaceForWatch(AIProvider.getAIWatchFaceLayoutInfo());
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(TtsStartEvent ttsStartEvent) {
        String wholeAnswer = this.chatDelegate.getWholeAnswer();
        if (x0.isNotEmpty(wholeAnswer)) {
            AITTSPlayer.INSTANCE.playTxtAudio(wholeAnswer, this.ttsUrl, new b());
            d.logTTSEvent(true);
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(TtsStopEvent ttsStopEvent) {
        AITTSPlayer.INSTANCE.stopTts();
    }
}
