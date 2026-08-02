package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzje;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShortlinkAppAction$Action$InvokeClientRoute extends zzje {
    public final InvokeClientRoute value;

    public ShortlinkAppAction$Action$InvokeClientRoute(InvokeClientRoute invokeClientRoute) {
        invokeClientRoute.getClass();
        this.value = invokeClientRoute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortlinkAppAction$Action$InvokeClientRoute) && Intrinsics.areEqual(this.value, ((ShortlinkAppAction$Action$InvokeClientRoute) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InvokeClientRoute(value=" + this.value + ")";
    }
}
