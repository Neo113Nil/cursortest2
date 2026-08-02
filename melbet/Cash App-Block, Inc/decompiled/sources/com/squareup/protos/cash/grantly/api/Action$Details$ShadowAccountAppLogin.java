package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$ShadowAccountAppLogin extends DrawableUtils {
    public final Action.ShadowAccountAppLogin value;

    public Action$Details$ShadowAccountAppLogin(Action.ShadowAccountAppLogin shadowAccountAppLogin) {
        shadowAccountAppLogin.getClass();
        this.value = shadowAccountAppLogin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$ShadowAccountAppLogin) && Intrinsics.areEqual(this.value, ((Action$Details$ShadowAccountAppLogin) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ShadowAccountAppLogin(value=" + this.value + ")";
    }
}
