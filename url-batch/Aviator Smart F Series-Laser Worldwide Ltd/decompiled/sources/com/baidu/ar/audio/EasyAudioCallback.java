package com.baidu.ar.audio;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface EasyAudioCallback {
    void onAudioFrameAvailable(ByteBuffer byteBuffer, int i8, long j8);

    void onAudioStart(boolean z7, AudioParams audioParams);

    void onAudioStop(boolean z7);
}
