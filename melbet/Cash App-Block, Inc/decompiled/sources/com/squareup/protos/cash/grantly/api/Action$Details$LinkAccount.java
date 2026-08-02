package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$LinkAccount extends DrawableUtils {
    public final Action.LinkAccount value;

    public Action$Details$LinkAccount(Action.LinkAccount linkAccount) {
        linkAccount.getClass();
        this.value = linkAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$LinkAccount) && Intrinsics.areEqual(this.value, ((Action$Details$LinkAccount) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LinkAccount(value=" + this.value + ")";
    }
}
