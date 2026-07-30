package com.artillery.ctc.interfaces;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface StListener {
    void onAsrEnd(String str);

    void onAsrResult(boolean z7, String str);

    void onBegin();

    void onCompleted(int i8);

    void onError(String str);

    void onFlushChunk();

    void onInit(boolean z7, String str);

    void onTTSEnd(byte[] bArr);

    void onTTSResult(byte[] bArr);

    void onTraslateEnd(String str);

    void onTraslateResult(boolean z7, String str);
}
