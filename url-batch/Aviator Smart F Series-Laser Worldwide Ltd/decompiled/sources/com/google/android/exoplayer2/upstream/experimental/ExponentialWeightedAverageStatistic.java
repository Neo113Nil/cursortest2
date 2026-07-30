package com.google.android.exoplayer2.upstream.experimental;

@Deprecated
/* loaded from: classes3.dex */
public class ExponentialWeightedAverageStatistic implements BandwidthStatistic {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.9999d;
    private long bitrateEstimate;
    private final double smoothingFactor;

    public ExponentialWeightedAverageStatistic() {
        this(0.9999d);
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public void addSample(long j8, long j9) {
        long j10 = (com.baidu.bbalbscesium.j.b.f3998f * j8) / j9;
        if (this.bitrateEstimate == Long.MIN_VALUE) {
            this.bitrateEstimate = j10;
        } else {
            double pow = Math.pow(this.smoothingFactor, Math.sqrt(j8));
            this.bitrateEstimate = (long) ((this.bitrateEstimate * pow) + ((1.0d - pow) * j10));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // com.google.android.exoplayer2.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    public ExponentialWeightedAverageStatistic(double d8) {
        this.smoothingFactor = d8;
        this.bitrateEstimate = Long.MIN_VALUE;
    }
}
