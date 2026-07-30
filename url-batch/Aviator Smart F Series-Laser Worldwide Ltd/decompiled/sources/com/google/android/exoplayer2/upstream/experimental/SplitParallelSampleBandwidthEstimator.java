package com.google.android.exoplayer2.upstream.experimental;

import android.os.Handler;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@Deprecated
/* loaded from: classes3.dex */
public class SplitParallelSampleBandwidthEstimator implements BandwidthEstimator {
    private long bandwidthEstimate;
    private final BandwidthStatistic bandwidthStatistic;
    private final Clock clock;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private long lastReportedBandwidthEstimate;
    private final long minBytesTransferred;
    private final int minSamples;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private int streamCount;
    private long totalBytesTransferred;
    private int totalSamplesAdded;

    public static class Builder {
        private BandwidthStatistic bandwidthStatistic = new SlidingWeightedAverageBandwidthStatistic();
        private Clock clock = Clock.DEFAULT;
        private long minBytesTransferred;
        private int minSamples;

        public SplitParallelSampleBandwidthEstimator build() {
            return new SplitParallelSampleBandwidthEstimator(this);
        }

        @CanIgnoreReturnValue
        public Builder setBandwidthStatistic(BandwidthStatistic bandwidthStatistic) {
            Assertions.checkNotNull(bandwidthStatistic);
            this.bandwidthStatistic = bandwidthStatistic;
            return this;
        }

        @CanIgnoreReturnValue
        @VisibleForTesting
        Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMinBytesTransferred(long j8) {
            Assertions.checkArgument(j8 >= 0);
            this.minBytesTransferred = j8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMinSamples(int i8) {
            Assertions.checkArgument(i8 >= 0);
            this.minSamples = i8;
            return this;
        }
    }

    private void maybeNotifyBandwidthSample(int i8, long j8, long j9) {
        if (j9 != Long.MIN_VALUE) {
            if (i8 == 0 && j8 == 0 && j9 == this.lastReportedBandwidthEstimate) {
                return;
            }
            this.lastReportedBandwidthEstimate = j9;
            this.eventDispatcher.bandwidthSample(i8, j8, j9);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthEstimator
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthEstimator
    public long getBandwidthEstimate() {
        return this.bandwidthEstimate;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthEstimator
    public void onBytesTransferred(DataSource dataSource, int i8) {
        long j8 = i8;
        this.sampleBytesTransferred += j8;
        this.totalBytesTransferred += j8;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthEstimator
    public void onNetworkTypeChange(long j8) {
        long elapsedRealtime = this.clock.elapsedRealtime();
        maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (elapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, j8);
        this.bandwidthStatistic.reset();
        this.bandwidthEstimate = Long.MIN_VALUE;
        this.sampleStartTimeMs = elapsedRealtime;
        this.sampleBytesTransferred = 0L;
        this.totalSamplesAdded = 0;
        this.totalBytesTransferred = 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthEstimator
    public void onTransferEnd(DataSource dataSource) {
        Assertions.checkState(this.streamCount > 0);
        long elapsedRealtime = this.clock.elapsedRealtime();
        long j8 = (int) (elapsedRealtime - this.sampleStartTimeMs);
        if (j8 > 0) {
            this.bandwidthStatistic.addSample(this.sampleBytesTransferred, 1000 * j8);
            int i8 = this.totalSamplesAdded + 1;
            this.totalSamplesAdded = i8;
            if (i8 > this.minSamples && this.totalBytesTransferred > this.minBytesTransferred) {
                this.bandwidthEstimate = this.bandwidthStatistic.getBandwidthEstimate();
            }
            maybeNotifyBandwidthSample((int) j8, this.sampleBytesTransferred, this.bandwidthEstimate);
            this.sampleStartTimeMs = elapsedRealtime;
            this.sampleBytesTransferred = 0L;
        }
        this.streamCount--;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthEstimator
    public void onTransferInitializing(DataSource dataSource) {
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthEstimator
    public void onTransferStart(DataSource dataSource) {
        if (this.streamCount == 0) {
            this.sampleStartTimeMs = this.clock.elapsedRealtime();
        }
        this.streamCount++;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthEstimator
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    private SplitParallelSampleBandwidthEstimator(Builder builder) {
        this.bandwidthStatistic = builder.bandwidthStatistic;
        this.minSamples = builder.minSamples;
        this.minBytesTransferred = builder.minBytesTransferred;
        this.clock = builder.clock;
        this.eventDispatcher = new BandwidthMeter.EventListener.EventDispatcher();
        this.bandwidthEstimate = Long.MIN_VALUE;
        this.lastReportedBandwidthEstimate = Long.MIN_VALUE;
    }
}
