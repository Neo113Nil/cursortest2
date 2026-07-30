package com.google.android.exoplayer2.upstream.experimental;

import androidx.annotation.VisibleForTesting;
import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.Deque;

@Deprecated
/* loaded from: classes3.dex */
public class SlidingWeightedAverageBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    private double bitrateWeightProductSum;
    private final Clock clock;
    private final SampleEvictionFunction sampleEvictionFunction;
    private final ArrayDeque<Sample> samples;
    private double weightSum;

    public static class Sample {
        public final long bitrate;
        public final long timeAddedMs;
        public final double weight;

        public Sample(long j8, double d8, long j9) {
            this.bitrate = j8;
            this.weight = d8;
            this.timeAddedMs = j9;
        }
    }

    public interface SampleEvictionFunction {
        boolean shouldEvictSample(Deque<Sample> deque);
    }

    public SlidingWeightedAverageBandwidthStatistic() {
        this(getMaxCountEvictionFunction(10L));
    }

    public static SampleEvictionFunction getAgeBasedEvictionFunction(long j8) {
        return getAgeBasedEvictionFunction(j8, Clock.DEFAULT);
    }

    public static SampleEvictionFunction getMaxCountEvictionFunction(final long j8) {
        return new SampleEvictionFunction() { // from class: com.google.android.exoplayer2.upstream.experimental.b
            @Override // com.google.android.exoplayer2.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(Deque deque) {
                boolean lambda$getMaxCountEvictionFunction$0;
                lambda$getMaxCountEvictionFunction$0 = SlidingWeightedAverageBandwidthStatistic.lambda$getMaxCountEvictionFunction$0(j8, deque);
                return lambda$getMaxCountEvictionFunction$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAgeBasedEvictionFunction$1(long j8, Clock clock, Deque deque) {
        return !deque.isEmpty() && ((Sample) Util.castNonNull((Sample) deque.peek())).timeAddedMs + j8 < clock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getMaxCountEvictionFunction$0(long j8, Deque deque) {
        return ((long) deque.size()) >= j8;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public void addSample(long j8, long j9) {
        while (this.sampleEvictionFunction.shouldEvictSample(this.samples)) {
            Sample remove = this.samples.remove();
            double d8 = this.bitrateWeightProductSum;
            double d9 = remove.bitrate;
            double d10 = remove.weight;
            this.bitrateWeightProductSum = d8 - (d9 * d10);
            this.weightSum -= d10;
        }
        Sample sample = new Sample((j8 * com.baidu.bbalbscesium.j.b.f3998f) / j9, Math.sqrt(j8), this.clock.elapsedRealtime());
        this.samples.add(sample);
        double d11 = this.bitrateWeightProductSum;
        double d12 = sample.bitrate;
        double d13 = sample.weight;
        this.bitrateWeightProductSum = d11 + (d12 * d13);
        this.weightSum += d13;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.bitrateWeightProductSum / this.weightSum);
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.bitrateWeightProductSum = i.DOUBLE_EPSILON;
        this.weightSum = i.DOUBLE_EPSILON;
    }

    public SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction) {
        this(sampleEvictionFunction, Clock.DEFAULT);
    }

    @VisibleForTesting
    static SampleEvictionFunction getAgeBasedEvictionFunction(final long j8, final Clock clock) {
        return new SampleEvictionFunction() { // from class: com.google.android.exoplayer2.upstream.experimental.c
            @Override // com.google.android.exoplayer2.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(Deque deque) {
                boolean lambda$getAgeBasedEvictionFunction$1;
                lambda$getAgeBasedEvictionFunction$1 = SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$1(j8, clock, deque);
                return lambda$getAgeBasedEvictionFunction$1;
            }
        };
    }

    @VisibleForTesting
    SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction, Clock clock) {
        this.samples = new ArrayDeque<>();
        this.sampleEvictionFunction = sampleEvictionFunction;
        this.clock = clock;
    }
}
