package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;

@Deprecated
/* loaded from: classes3.dex */
public abstract class MediaChunk extends Chunk {
    public final long chunkIndex;

    public MediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i8, @Nullable Object obj, long j8, long j9, long j10) {
        super(dataSource, dataSpec, 1, format, i8, obj, j8, j9);
        Assertions.checkNotNull(format);
        this.chunkIndex = j10;
    }

    public long getNextChunkIndex() {
        long j8 = this.chunkIndex;
        if (j8 != -1) {
            return 1 + j8;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();
}
