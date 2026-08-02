package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$UnlinkedRefund extends DrawableUtils {
    public final Action.UnlinkedRefund value;

    public Action$Details$UnlinkedRefund(Action.UnlinkedRefund unlinkedRefund) {
        unlinkedRefund.getClass();
        this.value = unlinkedRefund;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$UnlinkedRefund) && Intrinsics.areEqual(this.value, ((Action$Details$UnlinkedRefund) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UnlinkedRefund(value=" + this.value + ")";
    }
}
