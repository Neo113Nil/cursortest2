package com.crrepa.band.my.device.ai.asr;

/* loaded from: classes2.dex */
public abstract class r {

    public interface a {
        void onRecognizeError(String str);

        void onRecognizeResult(String str);
    }

    public abstract void cancel();

    public abstract void startRecognize(int i8, boolean z7);
}
