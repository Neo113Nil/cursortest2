package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$Oauth extends DrawableUtils {
    public final Action.OAuth value;

    public Action$Details$Oauth(Action.OAuth oAuth) {
        oAuth.getClass();
        this.value = oAuth;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$Oauth) && Intrinsics.areEqual(this.value, ((Action$Details$Oauth) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Oauth(value=" + this.value + ")";
    }
}
