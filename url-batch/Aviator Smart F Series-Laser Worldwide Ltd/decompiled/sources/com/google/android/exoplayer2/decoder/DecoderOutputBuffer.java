package com.google.android.exoplayer2.decoder;

@Deprecated
/* loaded from: classes3.dex */
public abstract class DecoderOutputBuffer extends Buffer {
    public int skippedOutputBufferCount;
    public long timeUs;

    public interface Owner<S extends DecoderOutputBuffer> {
        void releaseOutputBuffer(S s7);
    }

    public abstract void release();
}
