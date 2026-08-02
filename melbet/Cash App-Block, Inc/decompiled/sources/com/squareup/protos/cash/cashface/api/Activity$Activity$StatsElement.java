package com.squareup.protos.cash.cashface.api;

import app.cash.local.primitives.ScopedModifierTokensKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Activity$Activity$StatsElement extends ScopedModifierTokensKt {
    public final GenericProfileElement.ActivityStatsElement value;

    public Activity$Activity$StatsElement(GenericProfileElement.ActivityStatsElement activityStatsElement) {
        activityStatsElement.getClass();
        this.value = activityStatsElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Activity$Activity$StatsElement) && Intrinsics.areEqual(this.value, ((Activity$Activity$StatsElement) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "StatsElement(value=" + this.value + ")";
    }
}
