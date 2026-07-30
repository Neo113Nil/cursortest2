package com.google.android.exoplayer2.upstream.experimental;

import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.TreeSet;

@Deprecated
/* loaded from: classes3.dex */
public class SlidingPercentileBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    public static final double DEFAULT_PERCENTILE = 0.5d;
    private long bitrateEstimate;
    private final int maxSampleCount;
    private final double percentile;
    private final ArrayDeque<Sample> samples;
    private final TreeSet<Sample> sortedSamples;
    private double weightSum;

    private static class Sample implements Comparable<Sample> {
        private final long bitrate;
        private final double weight;

        public Sample(long j8, double d8) {
            this.bitrate = j8;
            this.weight = d8;
        }

        @Override // java.lang.Comparable
        public int compareTo(Sample sample) {
            return Util.compareLong(this.bitrate, sample.bitrate);
        }
    }

    public SlidingPercentileBandwidthStatistic() {
        this(10, 0.5d);
    }

    private long calculateBitrateEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        double d8 = this.weightSum * this.percentile;
        Iterator<Sample> it = this.sortedSamples.iterator();
        double d9 = i.DOUBLE_EPSILON;
        long j8 = 0;
        double d10 = 0.0d;
        while (it.hasNext()) {
            Sample next = it.next();
            double d11 = d9 + (next.weight / 2.0d);
            if (d11 >= d8) {
                return j8 == 0 ? next.bitrate : j8 + ((long) (((next.bitrate - j8) * (d8 - d10)) / (d11 - d10)));
            }
            j8 = next.bitrate;
            d9 = (next.weight / 2.0d) + d11;
            d10 = d11;
        }
        return j8;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public void addSample(long j8, long j9) {
        while (this.samples.size() >= this.maxSampleCount) {
            Sample remove = this.samples.remove();
            this.sortedSamples.remove(remove);
            this.weightSum -= remove.weight;
        }
        double sqrt = Math.sqrt(j8);
        Sample sample = new Sample((j8 * com.baidu.bbalbscesium.j.b.f3998f) / j9, sqrt);
        this.samples.add(sample);
        this.sortedSamples.add(sample);
        this.weightSum += sqrt;
        this.bitrateEstimate = calculateBitrateEstimate();
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.sortedSamples.clear();
        this.weightSum = i.DOUBLE_EPSILON;
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    public SlidingPercentileBandwidthStatistic(int i8, double d8) {
        Assertions.checkArgument(d8 >= i.DOUBLE_EPSILON && d8 <= 1.0d);
        this.maxSampleCount = i8;
        this.percentile = d8;
        this.samples = new ArrayDeque<>();
        this.sortedSamples = new TreeSet<>();
        this.bitrateEstimate = Long.MIN_VALUE;
    }
}
