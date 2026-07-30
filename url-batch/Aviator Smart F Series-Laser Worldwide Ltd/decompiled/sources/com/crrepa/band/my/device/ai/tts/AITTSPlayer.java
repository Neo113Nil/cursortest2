package com.crrepa.band.my.device.ai.tts;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.NonNull;
import com.artillery.ctc.CtHelper;
import com.artillery.ctc.base.Text2AudioSilkyBody;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.tts.AITTSPlayer;
import com.crrepa.band.my.device.ai.tts.model.TtsResponseBean;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.dafit.module.common.utils.x0;
import f6.l;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.io.File;
import y5.w;

/* loaded from: classes2.dex */
public enum AITTSPlayer {
    INSTANCE;

    private b lastTTSListener;
    private f ttsAudioPlayer;

    class a implements com.moyoung.lib.ai.tts.b {
        final /* synthetic */ b val$ttsListener;

        a(b bVar) {
            this.val$ttsListener = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSuccess$0(File file, b bVar, String str) {
            AITTSPlayer.this.ttsAudioPlayer.playAudio(file.getAbsolutePath());
            bVar.onAudioCreated(file.getAbsolutePath());
            bVar.onPlaying();
        }

        @Override // com.moyoung.lib.ai.tts.b
        public void onError(String str) {
            Observable observeOn = Observable.just("").observeOn(AndroidSchedulers.mainThread());
            final b bVar = this.val$ttsListener;
            observeOn.subscribe(new Consumer() { // from class: com.crrepa.band.my.device.ai.tts.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AITTSPlayer.b.this.onTtsRequestFailed();
                }
            });
        }

        @Override // com.moyoung.lib.ai.tts.b
        public /* bridge */ /* synthetic */ void onSuccess(byte[] bArr, String str) {
            com.moyoung.lib.ai.tts.a.b(this, bArr, str);
        }

        @Override // com.moyoung.lib.ai.tts.b
        public void onSuccess(final File file, String str) {
            String str2 = "ttsResultStr:" + file + "，" + str;
            Log.d("MoyAI", str2);
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(str2));
            Observable observeOn = Observable.just("").observeOn(AndroidSchedulers.mainThread());
            final b bVar = this.val$ttsListener;
            observeOn.subscribe(new Consumer() { // from class: com.crrepa.band.my.device.ai.tts.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AITTSPlayer.a.this.lambda$onSuccess$0(file, bVar, (String) obj);
                }
            });
        }
    }

    public interface b {
        void onAudioCreated(String str);

        void onAudioRequesting();

        void onPlayEnded();

        void onPlayStopped();

        void onPlaying();

        void onTtsRequestFailed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestHuaqiaoTTS$0(TtsResponseBean ttsResponseBean, b bVar, String str) {
        this.ttsAudioPlayer.playAudio(ttsResponseBean.voiceUrl);
        bVar.onAudioCreated(ttsResponseBean.voiceUrl);
        bVar.onPlaying();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ w lambda$requestHuaqiaoTTS$1(final b bVar, String str) {
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(str));
        Log.d("AITtsDelegate", "requestTts:" + str);
        if (x0.isEmpty(str)) {
            bVar.onTtsRequestFailed();
            return null;
        }
        final TtsResponseBean ttsResponseBean = (TtsResponseBean) new Gson().fromJson(str, TtsResponseBean.class);
        if (ttsResponseBean == null || x0.isEmpty(ttsResponseBean.voiceUrl)) {
            bVar.onTtsRequestFailed();
            return null;
        }
        Observable.just("").observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.ai.tts.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AITTSPlayer.this.lambda$requestHuaqiaoTTS$0(ttsResponseBean, bVar, (String) obj);
            }
        });
        return null;
    }

    @SuppressLint({"CheckResult"})
    private void requestAFlashTTS(String str, b bVar) {
    }

    @SuppressLint({"CheckResult"})
    private void requestHuaqiaoTTS(String str, final b bVar) {
        Text2AudioSilkyBody text2AudioSilkyBody = new Text2AudioSilkyBody(str.replace("#", "").replace("*", ""));
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(text2AudioSilkyBody));
        CtHelper.Companion.get().text2AudioInternalByHttpOverseas(text2AudioSilkyBody, new l() { // from class: com.crrepa.band.my.device.ai.tts.a
            @Override // f6.l
            public final Object invoke(Object obj) {
                w lambda$requestHuaqiaoTTS$1;
                lambda$requestHuaqiaoTTS$1 = AITTSPlayer.this.lambda$requestHuaqiaoTTS$1(bVar, (String) obj);
                return lambda$requestHuaqiaoTTS$1;
            }
        });
    }

    @SuppressLint({"CheckResult"})
    private void requestMoyTTS(String str, b bVar) {
        String replace = str.replace("#", "").replace("*", "");
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(replace));
        String str2 = g0.getMusicFileDir(com.moyoung.dafit.module.common.utils.d.get()) + "/moy_tts";
        Log.d("MoyAI", replace);
        com.moyoung.lib.ai.e.get().tts.textToSpeech(replace, str2, new a(bVar));
    }

    private void requestTTS(String str, b bVar) {
        if (com.crrepa.band.my.device.ai.helper.d.isUnauthorizedAndShowTips()) {
            bVar.onTtsRequestFailed();
            return;
        }
        if (AIProvider.getProviderType() == 0) {
            requestHuaqiaoTTS(str, bVar);
        } else if (AIProvider.getProviderType() == 1) {
            requestAFlashTTS(str, bVar);
        } else {
            requestMoyTTS(str, bVar);
        }
        bVar.onAudioRequesting();
    }

    public void destroy() {
        stopTts();
        f fVar = this.ttsAudioPlayer;
        if (fVar != null) {
            fVar.release();
            this.ttsAudioPlayer = null;
        }
    }

    public void playTxtAudio(@NonNull String str, String str2, @NonNull b bVar) {
        stopTts();
        if (this.ttsAudioPlayer == null) {
            this.ttsAudioPlayer = new f(com.moyoung.dafit.module.common.utils.d.get());
        }
        this.ttsAudioPlayer.setTtsListener(bVar);
        if (x0.isNotEmpty(str2)) {
            Log.d("AITtsDelegate", "playTxtAudio=" + str2);
            this.ttsAudioPlayer.playAudio(str2);
            bVar.onPlaying();
        } else {
            requestTTS(str, bVar);
        }
        this.lastTTSListener = bVar;
    }

    public void stopTts() {
        b bVar = this.lastTTSListener;
        if (bVar != null) {
            bVar.onPlayStopped();
        }
        f fVar = this.ttsAudioPlayer;
        if (fVar != null) {
            fVar.stopAudio();
        }
    }
}
