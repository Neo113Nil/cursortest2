package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$OnFilePayment extends DrawableUtils {
    public final Action.OnFilePayment value;

    public Action$Details$OnFilePayment(Action.OnFilePayment onFilePayment) {
        onFilePayment.getClass();
        this.value = onFilePayment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$OnFilePayment) && Intrinsics.areEqual(this.value, ((Action$Details$OnFilePayment) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OnFilePayment(value=" + this.value + ")";
    }
}
