package com.stripe.android.financialconnections.utils;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes7.dex */
public final class PollTimingOptions {
    public final long initialDelayMs;
    public final int maxNumberOfRetries;
    public final long retryInterval;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PollTimingOptions(long j, int i) {
        this(r1, j, Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(0.25d, DurationUnit.SECONDS)));
        int i2 = (i & 2) != 0 ? EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE : 20;
        Duration.Companion companion = Duration.Companion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollTimingOptions)) {
            return false;
        }
        PollTimingOptions pollTimingOptions = (PollTimingOptions) obj;
        return this.initialDelayMs == pollTimingOptions.initialDelayMs && this.maxNumberOfRetries == pollTimingOptions.maxNumberOfRetries && this.retryInterval == pollTimingOptions.retryInterval;
    }

    public final int hashCode() {
        return Long.hashCode(this.retryInterval) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxNumberOfRetries, Long.hashCode(this.initialDelayMs) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollTimingOptions(initialDelayMs=");
        sb.append(this.initialDelayMs);
        sb.append(", maxNumberOfRetries=");
        sb.append(this.maxNumberOfRetries);
        return Boxes$$ExternalSyntheticOutline1.m(this.retryInterval, ", retryInterval=", ")", sb);
    }

    public PollTimingOptions(int i, long j, long j2) {
        this.initialDelayMs = j;
        this.maxNumberOfRetries = i;
        this.retryInterval = j2;
    }
}
