package com.baidu.ar.recognition;

import com.baidu.ar.libloader.a;

/* loaded from: classes.dex */
public class CloudRecognitionClient {
    public boolean run = false;

    static {
        a.a("dumixar");
    }

    private native int nativeGetVersion();

    private native int nativeTrackFrame(RequestRecognitionMode requestRecognitionMode);

    private native int nativeVpsServerReceiver(byte[] bArr);

    public int getCurrentVersion() {
        return nativeGetVersion();
    }

    public int onServerReceiver(byte[] bArr) {
        return nativeVpsServerReceiver(bArr);
    }

    public int recognition(RequestRecognitionMode requestRecognitionMode) {
        if (this.run) {
            return -1;
        }
        this.run = true;
        int nativeTrackFrame = nativeTrackFrame(requestRecognitionMode);
        this.run = false;
        return nativeTrackFrame;
    }
}
