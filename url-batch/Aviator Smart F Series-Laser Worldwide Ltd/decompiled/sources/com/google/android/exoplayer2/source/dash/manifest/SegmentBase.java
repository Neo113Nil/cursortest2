package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Util;
import com.google.common.math.BigIntegerMath;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class SegmentBase {

    @Nullable
    final RangedUri initialization;
    final long presentationTimeOffset;
    final long timescale;

    public static abstract class MultiSegmentBase extends SegmentBase {

        @VisibleForTesting
        final long availabilityTimeOffsetUs;
        final long duration;
        private final long periodStartUnixTimeUs;

        @Nullable
        final List<SegmentTimelineElement> segmentTimeline;
        final long startNumber;
        private final long timeShiftBufferDepthUs;

        public MultiSegmentBase(@Nullable RangedUri rangedUri, long j8, long j9, long j10, long j11, @Nullable List<SegmentTimelineElement> list, long j12, long j13, long j14) {
            super(rangedUri, j8, j9);
            this.startNumber = j10;
            this.duration = j11;
            this.segmentTimeline = list;
            this.availabilityTimeOffsetUs = j12;
            this.timeShiftBufferDepthUs = j13;
            this.periodStartUnixTimeUs = j14;
        }

        public long getAvailableSegmentCount(long j8, long j9) {
            long segmentCount = getSegmentCount(j8);
            return segmentCount != -1 ? segmentCount : (int) (getSegmentNum((j9 - this.periodStartUnixTimeUs) + this.availabilityTimeOffsetUs, j8) - getFirstAvailableSegmentNum(j8, j9));
        }

        public long getFirstAvailableSegmentNum(long j8, long j9) {
            if (getSegmentCount(j8) == -1) {
                long j10 = this.timeShiftBufferDepthUs;
                if (j10 != C.TIME_UNSET) {
                    return Math.max(getFirstSegmentNum(), getSegmentNum((j9 - this.periodStartUnixTimeUs) - j10, j8));
                }
            }
            return getFirstSegmentNum();
        }

        public long getFirstSegmentNum() {
            return this.startNumber;
        }

        public long getNextSegmentAvailableTimeUs(long j8, long j9) {
            if (this.segmentTimeline != null) {
                return C.TIME_UNSET;
            }
            long firstAvailableSegmentNum = getFirstAvailableSegmentNum(j8, j9) + getAvailableSegmentCount(j8, j9);
            return (getSegmentTimeUs(firstAvailableSegmentNum) + getSegmentDurationUs(firstAvailableSegmentNum, j8)) - this.availabilityTimeOffsetUs;
        }

        public abstract long getSegmentCount(long j8);

        public final long getSegmentDurationUs(long j8, long j9) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return (list.get((int) (j8 - this.startNumber)).duration * 1000000) / this.timescale;
            }
            long segmentCount = getSegmentCount(j9);
            return (segmentCount == -1 || j8 != (getFirstSegmentNum() + segmentCount) - 1) ? (this.duration * 1000000) / this.timescale : j9 - getSegmentTimeUs(j8);
        }

        public long getSegmentNum(long j8, long j9) {
            long firstSegmentNum = getFirstSegmentNum();
            long segmentCount = getSegmentCount(j9);
            if (segmentCount == 0) {
                return firstSegmentNum;
            }
            if (this.segmentTimeline == null) {
                long j10 = this.startNumber + (j8 / ((this.duration * 1000000) / this.timescale));
                return j10 < firstSegmentNum ? firstSegmentNum : segmentCount == -1 ? j10 : Math.min(j10, (firstSegmentNum + segmentCount) - 1);
            }
            long j11 = (segmentCount + firstSegmentNum) - 1;
            long j12 = firstSegmentNum;
            while (j12 <= j11) {
                long j13 = ((j11 - j12) / 2) + j12;
                long segmentTimeUs = getSegmentTimeUs(j13);
                if (segmentTimeUs < j8) {
                    j12 = j13 + 1;
                } else {
                    if (segmentTimeUs <= j8) {
                        return j13;
                    }
                    j11 = j13 - 1;
                }
            }
            return j12 == firstSegmentNum ? j12 : j11;
        }

        public final long getSegmentTimeUs(long j8) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            return Util.scaleLargeTimestamp(list != null ? list.get((int) (j8 - this.startNumber)).startTime - this.presentationTimeOffset : (j8 - this.startNumber) * this.duration, 1000000L, this.timescale);
        }

        public abstract RangedUri getSegmentUrl(Representation representation, long j8);

        public boolean isExplicit() {
            return this.segmentTimeline != null;
        }
    }

    public static final class SegmentList extends MultiSegmentBase {

        @Nullable
        final List<RangedUri> mediaSegments;

        public SegmentList(RangedUri rangedUri, long j8, long j9, long j10, long j11, @Nullable List<SegmentTimelineElement> list, long j12, @Nullable List<RangedUri> list2, long j13, long j14) {
            super(rangedUri, j8, j9, j10, j11, list, j12, j13, j14);
            this.mediaSegments = list2;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j8) {
            return this.mediaSegments.size();
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j8) {
            return this.mediaSegments.get((int) (j8 - this.startNumber));
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public boolean isExplicit() {
            return true;
        }
    }

    public static final class SegmentTemplate extends MultiSegmentBase {
        final long endNumber;

        @Nullable
        final UrlTemplate initializationTemplate;

        @Nullable
        final UrlTemplate mediaTemplate;

        public SegmentTemplate(RangedUri rangedUri, long j8, long j9, long j10, long j11, long j12, @Nullable List<SegmentTimelineElement> list, long j13, @Nullable UrlTemplate urlTemplate, @Nullable UrlTemplate urlTemplate2, long j14, long j15) {
            super(rangedUri, j8, j9, j10, j12, list, j13, j14, j15);
            this.initializationTemplate = urlTemplate;
            this.mediaTemplate = urlTemplate2;
            this.endNumber = j11;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase
        @Nullable
        public RangedUri getInitialization(Representation representation) {
            UrlTemplate urlTemplate = this.initializationTemplate;
            if (urlTemplate == null) {
                return super.getInitialization(representation);
            }
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.id, 0L, format.bitrate, 0L), 0L, -1L);
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j8) {
            if (this.segmentTimeline != null) {
                return r0.size();
            }
            long j9 = this.endNumber;
            if (j9 != -1) {
                return (j9 - this.startNumber) + 1;
            }
            if (j8 != C.TIME_UNSET) {
                return BigIntegerMath.divide(BigInteger.valueOf(j8).multiply(BigInteger.valueOf(this.timescale)), BigInteger.valueOf(this.duration).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j8) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            long j9 = list != null ? list.get((int) (j8 - this.startNumber)).startTime : (j8 - this.startNumber) * this.duration;
            UrlTemplate urlTemplate = this.mediaTemplate;
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.id, j8, format.bitrate, j9), 0L, -1L);
        }
    }

    public static final class SegmentTimelineElement {
        final long duration;
        final long startTime;

        public SegmentTimelineElement(long j8, long j9) {
            this.startTime = j8;
            this.duration = j9;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SegmentTimelineElement.class != obj.getClass()) {
                return false;
            }
            SegmentTimelineElement segmentTimelineElement = (SegmentTimelineElement) obj;
            return this.startTime == segmentTimelineElement.startTime && this.duration == segmentTimelineElement.duration;
        }

        public int hashCode() {
            return (((int) this.startTime) * 31) + ((int) this.duration);
        }
    }

    public static class SingleSegmentBase extends SegmentBase {
        final long indexLength;
        final long indexStart;

        public SingleSegmentBase(@Nullable RangedUri rangedUri, long j8, long j9, long j10, long j11) {
            super(rangedUri, j8, j9);
            this.indexStart = j10;
            this.indexLength = j11;
        }

        @Nullable
        public RangedUri getIndex() {
            long j8 = this.indexLength;
            if (j8 <= 0) {
                return null;
            }
            return new RangedUri(null, this.indexStart, j8);
        }

        public SingleSegmentBase() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }

    public SegmentBase(@Nullable RangedUri rangedUri, long j8, long j9) {
        this.initialization = rangedUri;
        this.timescale = j8;
        this.presentationTimeOffset = j9;
    }

    @Nullable
    public RangedUri getInitialization(Representation representation) {
        return this.initialization;
    }

    public long getPresentationTimeOffsetUs() {
        return Util.scaleLargeTimestamp(this.presentationTimeOffset, 1000000L, this.timescale);
    }
}
