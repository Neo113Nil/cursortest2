package com.baidu.ar;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface s0 {
    void onAudioFrameAvailable(ByteBuffer byteBuffer, int i8, long j8);

    void onAudioRelease();

    void onAudioSetup(boolean z7);

    void onAudioStart(boolean z7);

    void onAudioStop(boolean z7);
}
