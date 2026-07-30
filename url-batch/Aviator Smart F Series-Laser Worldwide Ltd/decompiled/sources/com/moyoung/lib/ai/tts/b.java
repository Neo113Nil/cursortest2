package com.moyoung.lib.ai.tts;

import java.io.File;

/* loaded from: classes4.dex */
public interface b {
    void onError(String str);

    void onSuccess(File file, String str);

    void onSuccess(byte[] bArr, String str);
}
