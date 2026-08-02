package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$CustomerProfileSharing extends DrawableUtils {
    public final Action.CustomerProfileSharing value;

    public Action$Details$CustomerProfileSharing(Action.CustomerProfileSharing customerProfileSharing) {
        customerProfileSharing.getClass();
        this.value = customerProfileSharing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$CustomerProfileSharing) && Intrinsics.areEqual(this.value, ((Action$Details$CustomerProfileSharing) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CustomerProfileSharing(value=" + this.value + ")";
    }
}
