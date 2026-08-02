package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$Openid extends DrawableUtils {
    public final Action.OpenID value;

    public Action$Details$Openid(Action.OpenID openID) {
        openID.getClass();
        this.value = openID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$Openid) && Intrinsics.areEqual(this.value, ((Action$Details$Openid) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Openid(value=" + this.value + ")";
    }
}
