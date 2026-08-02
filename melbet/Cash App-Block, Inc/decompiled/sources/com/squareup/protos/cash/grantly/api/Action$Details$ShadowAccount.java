package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$ShadowAccount extends DrawableUtils {
    public final Action.ShadowAccount value;

    public Action$Details$ShadowAccount(Action.ShadowAccount shadowAccount) {
        shadowAccount.getClass();
        this.value = shadowAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$ShadowAccount) && Intrinsics.areEqual(this.value, ((Action$Details$ShadowAccount) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ShadowAccount(value=" + this.value + ")";
    }
}
