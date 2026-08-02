package com.squareup.protos.cash.cashface.api;

import app.cash.local.primitives.ScopedModifierTokensKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Activity$Activity$Stats extends ScopedModifierTokensKt {
    public final ActivityStats value;

    public Activity$Activity$Stats(ActivityStats activityStats) {
        activityStats.getClass();
        this.value = activityStats;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Activity$Activity$Stats) && Intrinsics.areEqual(this.value, ((Activity$Activity$Stats) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Stats(value=" + this.value + ")";
    }
}
