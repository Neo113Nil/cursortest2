package com.google.android.exoplayer2.source.rtsp.reader;

import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
class RtpReaderUtils {
    private RtpReaderUtils() {
    }

    public static long toSampleTimeUs(long j8, long j9, long j10, int i8) {
        return j8 + Util.scaleLargeTimestamp(j9 - j10, 1000000L, i8);
    }
}
