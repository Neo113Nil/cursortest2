package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$RecurringDeposits extends DrawableUtils {
    public final Action.RecurringDeposits value;

    public Action$Details$RecurringDeposits(Action.RecurringDeposits recurringDeposits) {
        recurringDeposits.getClass();
        this.value = recurringDeposits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$RecurringDeposits) && Intrinsics.areEqual(this.value, ((Action$Details$RecurringDeposits) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RecurringDeposits(value=" + this.value + ")";
    }
}
