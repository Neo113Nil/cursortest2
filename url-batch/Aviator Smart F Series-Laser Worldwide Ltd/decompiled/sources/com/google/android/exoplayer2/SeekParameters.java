package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
public final class SeekParameters {
    public static final SeekParameters CLOSEST_SYNC;
    public static final SeekParameters DEFAULT;
    public static final SeekParameters EXACT;
    public static final SeekParameters NEXT_SYNC;
    public static final SeekParameters PREVIOUS_SYNC;
    public final long toleranceAfterUs;
    public final long toleranceBeforeUs;

    static {
        SeekParameters seekParameters = new SeekParameters(0L, 0L);
        EXACT = seekParameters;
        CLOSEST_SYNC = new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        PREVIOUS_SYNC = new SeekParameters(Long.MAX_VALUE, 0L);
        NEXT_SYNC = new SeekParameters(0L, Long.MAX_VALUE);
        DEFAULT = seekParameters;
    }

    public SeekParameters(long j8, long j9) {
        Assertions.checkArgument(j8 >= 0);
        Assertions.checkArgument(j9 >= 0);
        this.toleranceBeforeUs = j8;
        this.toleranceAfterUs = j9;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SeekParameters.class != obj.getClass()) {
            return false;
        }
        SeekParameters seekParameters = (SeekParameters) obj;
        return this.toleranceBeforeUs == seekParameters.toleranceBeforeUs && this.toleranceAfterUs == seekParameters.toleranceAfterUs;
    }

    public int hashCode() {
        return (((int) this.toleranceBeforeUs) * 31) + ((int) this.toleranceAfterUs);
    }

    public long resolveSeekPositionUs(long j8, long j9, long j10) {
        long j11 = this.toleranceBeforeUs;
        if (j11 == 0 && this.toleranceAfterUs == 0) {
            return j8;
        }
        long subtractWithOverflowDefault = Util.subtractWithOverflowDefault(j8, j11, Long.MIN_VALUE);
        long addWithOverflowDefault = Util.addWithOverflowDefault(j8, this.toleranceAfterUs, Long.MAX_VALUE);
        boolean z7 = false;
        boolean z8 = subtractWithOverflowDefault <= j9 && j9 <= addWithOverflowDefault;
        if (subtractWithOverflowDefault <= j10 && j10 <= addWithOverflowDefault) {
            z7 = true;
        }
        return (z8 && z7) ? Math.abs(j9 - j8) <= Math.abs(j10 - j8) ? j9 : j10 : z8 ? j9 : z7 ? j10 : subtractWithOverflowDefault;
    }
}
