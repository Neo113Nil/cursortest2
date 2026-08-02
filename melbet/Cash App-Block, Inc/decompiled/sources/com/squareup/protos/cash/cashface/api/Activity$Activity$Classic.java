package com.squareup.protos.cash.cashface.api;

import app.cash.local.primitives.ScopedModifierTokensKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Activity$Activity$Classic extends ScopedModifierTokensKt {
    public final ActivityClassic value;

    public Activity$Activity$Classic(ActivityClassic activityClassic) {
        activityClassic.getClass();
        this.value = activityClassic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Activity$Activity$Classic) && Intrinsics.areEqual(this.value, ((Activity$Activity$Classic) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Classic(value=" + this.value + ")";
    }
}
