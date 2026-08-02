package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$CheckingBalance extends DrawableUtils {
    public final Action.CheckingBalance value;

    public Action$Details$CheckingBalance(Action.CheckingBalance checkingBalance) {
        checkingBalance.getClass();
        this.value = checkingBalance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$CheckingBalance) && Intrinsics.areEqual(this.value, ((Action$Details$CheckingBalance) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CheckingBalance(value=" + this.value + ")";
    }
}
