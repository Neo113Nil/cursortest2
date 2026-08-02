package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$OneTimePayment extends DrawableUtils {
    public final Action.OneTimePayment value;

    public Action$Details$OneTimePayment(Action.OneTimePayment oneTimePayment) {
        oneTimePayment.getClass();
        this.value = oneTimePayment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$OneTimePayment) && Intrinsics.areEqual(this.value, ((Action$Details$OneTimePayment) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OneTimePayment(value=" + this.value + ")";
    }
}
