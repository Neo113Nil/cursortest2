package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$OnFilePayout extends DrawableUtils {
    public final Action.OnFilePayout value;

    public Action$Details$OnFilePayout(Action.OnFilePayout onFilePayout) {
        onFilePayout.getClass();
        this.value = onFilePayout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$OnFilePayout) && Intrinsics.areEqual(this.value, ((Action$Details$OnFilePayout) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OnFilePayout(value=" + this.value + ")";
    }
}
