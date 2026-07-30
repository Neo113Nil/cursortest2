package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.util.Objects;

@Deprecated
/* loaded from: classes3.dex */
final class FlacBinarySearchSeeker extends BinarySearchSeeker {

    private static final class FlacTimestampSeeker implements BinarySearchSeeker.TimestampSeeker {
        private final FlacStreamMetadata flacStreamMetadata;
        private final int frameStartMarker;
        private final FlacFrameReader.SampleNumberHolder sampleNumberHolder;

        private long findNextFrame(ExtractorInput extractorInput) {
            while (extractorInput.getPeekPosition() < extractorInput.getLength() - 6 && !FlacFrameReader.checkFrameHeaderFromPeek(extractorInput, this.flacStreamMetadata, this.frameStartMarker, this.sampleNumberHolder)) {
                extractorInput.advancePeekPosition(1);
            }
            if (extractorInput.getPeekPosition() < extractorInput.getLength() - 6) {
                return this.sampleNumberHolder.sampleNumber;
            }
            extractorInput.advancePeekPosition((int) (extractorInput.getLength() - extractorInput.getPeekPosition()));
            return this.flacStreamMetadata.totalSamples;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public /* synthetic */ void onSeekFinished() {
            com.google.android.exoplayer2.extractor.a.a(this);
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j8) {
            long position = extractorInput.getPosition();
            long findNextFrame = findNextFrame(extractorInput);
            long peekPosition = extractorInput.getPeekPosition();
            extractorInput.advancePeekPosition(Math.max(6, this.flacStreamMetadata.minFrameSize));
            long findNextFrame2 = findNextFrame(extractorInput);
            return (findNextFrame > j8 || findNextFrame2 <= j8) ? findNextFrame2 <= j8 ? BinarySearchSeeker.TimestampSearchResult.underestimatedResult(findNextFrame2, extractorInput.getPeekPosition()) : BinarySearchSeeker.TimestampSearchResult.overestimatedResult(findNextFrame, position) : BinarySearchSeeker.TimestampSearchResult.targetFoundResult(peekPosition);
        }

        private FlacTimestampSeeker(FlacStreamMetadata flacStreamMetadata, int i8) {
            this.flacStreamMetadata = flacStreamMetadata;
            this.frameStartMarker = i8;
            this.sampleNumberHolder = new FlacFrameReader.SampleNumberHolder();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlacBinarySearchSeeker(final FlacStreamMetadata flacStreamMetadata, int i8, long j8, long j9) {
        super(new BinarySearchSeeker.SeekTimestampConverter() { // from class: com.google.android.exoplayer2.extractor.flac.a
            @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
            public final long timeUsToTargetTime(long j10) {
                return FlacStreamMetadata.this.getSampleNumber(j10);
            }
        }, new FlacTimestampSeeker(flacStreamMetadata, i8), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j8, j9, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        Objects.requireNonNull(flacStreamMetadata);
    }
}
