package com.squareup.protos.timecards;

import com.squareup.cash.clientrouting.RoutesKt;
import com.squareup.protos.timecards.BreakRule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BreakRule$Rule$EarnIfShiftIsAtLeastXSeconds extends RoutesKt {
    public final BreakRule.EarnOnceIfShiftAtLeastXSeconds value;

    public BreakRule$Rule$EarnIfShiftIsAtLeastXSeconds(BreakRule.EarnOnceIfShiftAtLeastXSeconds earnOnceIfShiftAtLeastXSeconds) {
        earnOnceIfShiftAtLeastXSeconds.getClass();
        this.value = earnOnceIfShiftAtLeastXSeconds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BreakRule$Rule$EarnIfShiftIsAtLeastXSeconds) && Intrinsics.areEqual(this.value, ((BreakRule$Rule$EarnIfShiftIsAtLeastXSeconds) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EarnIfShiftIsAtLeastXSeconds(value=" + this.value + ")";
    }
}
