package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$OnFileDeposit extends DrawableUtils {
    public final Action.OnFileDeposit value;

    public Action$Details$OnFileDeposit(Action.OnFileDeposit onFileDeposit) {
        onFileDeposit.getClass();
        this.value = onFileDeposit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$OnFileDeposit) && Intrinsics.areEqual(this.value, ((Action$Details$OnFileDeposit) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OnFileDeposit(value=" + this.value + ")";
    }
}
