package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;

@Deprecated
/* loaded from: classes3.dex */
public abstract class BaseMediaChunk extends MediaChunk {
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;
    private int[] firstSampleIndices;
    private BaseMediaChunkOutput output;

    public BaseMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i8, @Nullable Object obj, long j8, long j9, long j10, long j11, long j12) {
        super(dataSource, dataSpec, format, i8, obj, j8, j9, j12);
        this.clippedStartTimeUs = j10;
        this.clippedEndTimeUs = j11;
    }

    public final int getFirstSampleIndex(int i8) {
        return ((int[]) Assertions.checkStateNotNull(this.firstSampleIndices))[i8];
    }

    protected final BaseMediaChunkOutput getOutput() {
        return (BaseMediaChunkOutput) Assertions.checkStateNotNull(this.output);
    }

    public void init(BaseMediaChunkOutput baseMediaChunkOutput) {
        this.output = baseMediaChunkOutput;
        this.firstSampleIndices = baseMediaChunkOutput.getWriteIndices();
    }
}
