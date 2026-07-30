package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.util.Log;

@Deprecated
/* loaded from: classes3.dex */
public final class BaseMediaChunkOutput implements ChunkExtractor.TrackOutputProvider {
    private static final String TAG = "BaseMediaChunkOutput";
    private final SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i8 = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i8 >= sampleQueueArr.length) {
                return iArr;
            }
            iArr[i8] = sampleQueueArr[i8].getWriteIndex();
            i8++;
        }
    }

    public void setSampleOffsetUs(long j8) {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.setSampleOffsetUs(j8);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider
    public TrackOutput track(int i8, int i9) {
        int i10 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i10 >= iArr.length) {
                Log.e(TAG, "Unmatched track of type: " + i9);
                return new DummyTrackOutput();
            }
            if (i9 == iArr[i10]) {
                return this.sampleQueues[i10];
            }
            i10++;
        }
    }
}
