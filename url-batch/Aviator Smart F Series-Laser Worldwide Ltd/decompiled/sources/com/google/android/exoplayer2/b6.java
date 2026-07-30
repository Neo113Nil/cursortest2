package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.SimpleBasePlayer;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class b6 {
    static {
        SimpleBasePlayer.PositionSupplier positionSupplier = SimpleBasePlayer.PositionSupplier.ZERO;
    }

    public static SimpleBasePlayer.PositionSupplier a(final long j8) {
        return new SimpleBasePlayer.PositionSupplier() { // from class: com.google.android.exoplayer2.a6
            @Override // com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier
            public final long get() {
                return b6.c(j8);
            }
        };
    }

    public static SimpleBasePlayer.PositionSupplier b(final long j8, final float f8) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        return new SimpleBasePlayer.PositionSupplier() { // from class: com.google.android.exoplayer2.z5
            @Override // com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier
            public final long get() {
                return b6.d(j8, elapsedRealtime, f8);
            }
        };
    }

    public static /* synthetic */ long c(long j8) {
        return j8;
    }

    public static /* synthetic */ long d(long j8, long j9, float f8) {
        return j8 + ((long) ((SystemClock.elapsedRealtime() - j9) * f8));
    }
}
