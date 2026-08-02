package com.squareup.cash.util.clock;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes7.dex */
public final class AccurateClock$AccurateTimestamp {
    public final long millis;

    public final boolean equals(Object obj) {
        if (obj instanceof AccurateClock$AccurateTimestamp) {
            return this.millis == ((AccurateClock$AccurateTimestamp) obj).millis;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.millis);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(this.millis, "AccurateTimestamp(millis=", ")");
    }
}
