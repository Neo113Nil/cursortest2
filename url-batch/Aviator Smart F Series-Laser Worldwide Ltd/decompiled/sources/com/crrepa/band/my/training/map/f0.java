package com.crrepa.band.my.training.map;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import java.util.Locale;

/* loaded from: classes3.dex */
public class f0 extends UtteranceProgressListener {
    private boolean isSuccess = false;
    private TextToSpeech textToSpeech;

    public interface a {
        void a(boolean z7);
    }

    public f0(Context context) {
        this.textToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() { // from class: com.crrepa.band.my.training.map.d0
            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i8) {
                f0.this.lambda$new$0(i8);
            }
        });
    }

    private boolean initTTSConfig() {
        this.textToSpeech.setPitch(1.0f);
        this.textToSpeech.setSpeechRate(1.0f);
        this.textToSpeech.setOnUtteranceProgressListener(this);
        int language = com.moyoung.dafit.module.common.utils.u.isZH() ? this.textToSpeech.setLanguage(Locale.CHINESE) : this.textToSpeech.setLanguage(Locale.ENGLISH);
        if (language == -1 || language == -2) {
            this.isSuccess = false;
        } else {
            this.isSuccess = true;
        }
        return this.isSuccess;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i8) {
        if (i8 != 0) {
            return;
        }
        initTTSConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(a aVar, int i8) {
        if (i8 != 0) {
            return;
        }
        aVar.a(initTTSConfig());
    }

    public void destroy() {
        TextToSpeech textToSpeech = this.textToSpeech;
        if (textToSpeech != null) {
            textToSpeech.setOnUtteranceProgressListener(null);
            this.textToSpeech = null;
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onDone(String str) {
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onError(String str) {
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onStart(String str) {
    }

    public void playText(String str) {
        TextToSpeech textToSpeech;
        if (this.isSuccess && (textToSpeech = this.textToSpeech) != null) {
            textToSpeech.speak(str, 1, null, null);
        }
    }

    public void stopSpeak() {
        TextToSpeech textToSpeech = this.textToSpeech;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    public f0(Context context, final a aVar) {
        this.textToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener(aVar) { // from class: com.crrepa.band.my.training.map.e0
            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i8) {
                f0.this.lambda$new$1(null, i8);
            }
        });
    }
}
