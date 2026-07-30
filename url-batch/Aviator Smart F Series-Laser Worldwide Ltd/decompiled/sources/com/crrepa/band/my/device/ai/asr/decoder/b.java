package com.crrepa.band.my.device.ai.asr.decoder;

/* loaded from: classes2.dex */
public interface b {

    public interface a {
        void onComplete();

        void onError(String str);

        void onStart();
    }

    void decode(byte[] bArr);

    void opus2Audio(String str, String str2, a aVar);
}
