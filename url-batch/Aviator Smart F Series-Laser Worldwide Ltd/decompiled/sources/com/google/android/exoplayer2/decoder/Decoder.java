package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;

@Deprecated
/* loaded from: classes3.dex */
public interface Decoder<I, O, E extends DecoderException> {
    @Nullable
    I dequeueInputBuffer();

    @Nullable
    O dequeueOutputBuffer();

    void flush();

    String getName();

    void queueInputBuffer(I i8);

    void release();
}
