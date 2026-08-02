package com.squareup.protos.timecards;

import com.squareup.cash.clientrouting.RoutesKt;
import com.squareup.protos.timecards.BreakRule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BreakRule$Rule$EarnEveryXSeconds extends RoutesKt {
    public final BreakRule.EarnEveryXSeconds value;

    public BreakRule$Rule$EarnEveryXSeconds(BreakRule.EarnEveryXSeconds earnEveryXSeconds) {
        earnEveryXSeconds.getClass();
        this.value = earnEveryXSeconds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BreakRule$Rule$EarnEveryXSeconds) && Intrinsics.areEqual(this.value, ((BreakRule$Rule$EarnEveryXSeconds) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EarnEveryXSeconds(value=" + this.value + ")";
    }
}
