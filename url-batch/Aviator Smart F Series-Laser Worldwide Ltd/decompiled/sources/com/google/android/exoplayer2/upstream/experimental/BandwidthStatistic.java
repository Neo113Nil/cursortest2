package com.google.android.exoplayer2.upstream.experimental;

@Deprecated
/* loaded from: classes3.dex */
public interface BandwidthStatistic {
    void addSample(long j8, long j9);

    long getBandwidthEstimate();

    void reset();
}
