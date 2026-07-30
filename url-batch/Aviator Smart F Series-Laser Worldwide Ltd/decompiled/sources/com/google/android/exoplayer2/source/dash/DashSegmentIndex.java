package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.source.dash.manifest.RangedUri;

@Deprecated
/* loaded from: classes3.dex */
public interface DashSegmentIndex {
    public static final int INDEX_UNBOUNDED = -1;

    long getAvailableSegmentCount(long j8, long j9);

    long getDurationUs(long j8, long j9);

    long getFirstAvailableSegmentNum(long j8, long j9);

    long getFirstSegmentNum();

    long getNextSegmentAvailableTimeUs(long j8, long j9);

    long getSegmentCount(long j8);

    long getSegmentNum(long j8, long j9);

    RangedUri getSegmentUrl(long j8);

    long getTimeUs(long j8);

    boolean isExplicit();
}
