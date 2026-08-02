package com.squareup.protos.cash.grantly.api;

import coil3.util.DrawableUtils;
import com.squareup.protos.cash.grantly.api.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Action$Details$SessionAuthentication extends DrawableUtils {
    public final Action.SessionAuthentication value;

    public Action$Details$SessionAuthentication(Action.SessionAuthentication sessionAuthentication) {
        sessionAuthentication.getClass();
        this.value = sessionAuthentication;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Details$SessionAuthentication) && Intrinsics.areEqual(this.value, ((Action$Details$SessionAuthentication) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SessionAuthentication(value=" + this.value + ")";
    }
}
