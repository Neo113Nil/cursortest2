package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
final class ChunkReader {
    private static final int CHUNK_TYPE_AUDIO = 1651965952;
    private static final int CHUNK_TYPE_VIDEO_COMPRESSED = 1667497984;
    private static final int CHUNK_TYPE_VIDEO_UNCOMPRESSED = 1650720768;
    private static final int INITIAL_INDEX_SIZE = 512;
    private final int alternativeChunkId;
    private int bytesRemainingInCurrentChunk;
    private final int chunkId;
    private int currentChunkIndex;
    private int currentChunkSize;
    private final long durationUs;
    private int indexChunkCount;
    private int indexSize;
    private int[] keyFrameIndices;
    private long[] keyFrameOffsets;
    private final int streamHeaderChunkCount;
    protected final TrackOutput trackOutput;

    public ChunkReader(int i8, int i9, long j8, int i10, TrackOutput trackOutput) {
        boolean z7 = true;
        if (i9 != 1 && i9 != 2) {
            z7 = false;
        }
        Assertions.checkArgument(z7);
        this.durationUs = j8;
        this.streamHeaderChunkCount = i10;
        this.trackOutput = trackOutput;
        this.chunkId = getChunkIdFourCc(i8, i9 == 2 ? CHUNK_TYPE_VIDEO_COMPRESSED : CHUNK_TYPE_AUDIO);
        this.alternativeChunkId = i9 == 2 ? getChunkIdFourCc(i8, CHUNK_TYPE_VIDEO_UNCOMPRESSED) : -1;
        this.keyFrameOffsets = new long[512];
        this.keyFrameIndices = new int[512];
    }

    private static int getChunkIdFourCc(int i8, int i9) {
        return (((i8 % 10) + 48) << 8) | ((i8 / 10) + 48) | i9;
    }

    private long getChunkTimestampUs(int i8) {
        return (this.durationUs * i8) / this.streamHeaderChunkCount;
    }

    private SeekPoint getSeekPoint(int i8) {
        return new SeekPoint(this.keyFrameIndices[i8] * getFrameDurationUs(), this.keyFrameOffsets[i8]);
    }

    public void advanceCurrentChunk() {
        this.currentChunkIndex++;
    }

    public void appendKeyFrameToIndex(long j8) {
        if (this.indexSize == this.keyFrameIndices.length) {
            long[] jArr = this.keyFrameOffsets;
            this.keyFrameOffsets = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.keyFrameIndices;
            this.keyFrameIndices = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.keyFrameOffsets;
        int i8 = this.indexSize;
        jArr2[i8] = j8;
        this.keyFrameIndices[i8] = this.indexChunkCount;
        this.indexSize = i8 + 1;
    }

    public void compactIndex() {
        this.keyFrameOffsets = Arrays.copyOf(this.keyFrameOffsets, this.indexSize);
        this.keyFrameIndices = Arrays.copyOf(this.keyFrameIndices, this.indexSize);
    }

    public long getCurrentChunkTimestampUs() {
        return getChunkTimestampUs(this.currentChunkIndex);
    }

    public long getFrameDurationUs() {
        return getChunkTimestampUs(1);
    }

    public SeekMap.SeekPoints getSeekPoints(long j8) {
        int frameDurationUs = (int) (j8 / getFrameDurationUs());
        int binarySearchFloor = Util.binarySearchFloor(this.keyFrameIndices, frameDurationUs, true, true);
        if (this.keyFrameIndices[binarySearchFloor] == frameDurationUs) {
            return new SeekMap.SeekPoints(getSeekPoint(binarySearchFloor));
        }
        SeekPoint seekPoint = getSeekPoint(binarySearchFloor);
        int i8 = binarySearchFloor + 1;
        return i8 < this.keyFrameOffsets.length ? new SeekMap.SeekPoints(seekPoint, getSeekPoint(i8)) : new SeekMap.SeekPoints(seekPoint);
    }

    public boolean handlesChunkId(int i8) {
        return this.chunkId == i8 || this.alternativeChunkId == i8;
    }

    public void incrementIndexChunkCount() {
        this.indexChunkCount++;
    }

    public boolean isAudio() {
        return (this.chunkId & CHUNK_TYPE_AUDIO) == CHUNK_TYPE_AUDIO;
    }

    public boolean isCurrentFrameAKeyFrame() {
        return Arrays.binarySearch(this.keyFrameIndices, this.currentChunkIndex) >= 0;
    }

    public boolean isVideo() {
        return (this.chunkId & CHUNK_TYPE_VIDEO_COMPRESSED) == CHUNK_TYPE_VIDEO_COMPRESSED;
    }

    public boolean onChunkData(ExtractorInput extractorInput) {
        int i8 = this.bytesRemainingInCurrentChunk;
        int sampleData = i8 - this.trackOutput.sampleData((DataReader) extractorInput, i8, false);
        this.bytesRemainingInCurrentChunk = sampleData;
        boolean z7 = sampleData == 0;
        if (z7) {
            if (this.currentChunkSize > 0) {
                this.trackOutput.sampleMetadata(getCurrentChunkTimestampUs(), isCurrentFrameAKeyFrame() ? 1 : 0, this.currentChunkSize, 0, null);
            }
            advanceCurrentChunk();
        }
        return z7;
    }

    public void onChunkStart(int i8) {
        this.currentChunkSize = i8;
        this.bytesRemainingInCurrentChunk = i8;
    }

    public void seekToPosition(long j8) {
        if (this.indexSize == 0) {
            this.currentChunkIndex = 0;
        } else {
            this.currentChunkIndex = this.keyFrameIndices[Util.binarySearchFloor(this.keyFrameOffsets, j8, true, true)];
        }
    }
}
