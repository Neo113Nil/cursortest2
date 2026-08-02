package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetShortlinkResponse$Action$InvokeClientRoute extends ViewUtilsKt {
    public final InvokeClientRoute value;

    public GetShortlinkResponse$Action$InvokeClientRoute(InvokeClientRoute invokeClientRoute) {
        invokeClientRoute.getClass();
        this.value = invokeClientRoute;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetShortlinkResponse$Action$InvokeClientRoute) && Intrinsics.areEqual(this.value, ((GetShortlinkResponse$Action$InvokeClientRoute) obj).value);
    }

    public final InvokeClientRoute getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InvokeClientRoute(value=" + this.value + ")";
    }
}
