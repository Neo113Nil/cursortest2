package com.squareup.protos.cash.whimsicard.syncentity;

import com.squareup.protos.cash.whimsicard.syncentity.Action;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class Action$Type$ClientRoute {
    public final Action.ClientRouteAction value;

    public Action$Type$ClientRoute(Action.ClientRouteAction clientRouteAction) {
        clientRouteAction.getClass();
        this.value = clientRouteAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$Type$ClientRoute) && Intrinsics.areEqual(this.value, ((Action$Type$ClientRoute) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ClientRoute(value=" + this.value + ")";
    }
}
