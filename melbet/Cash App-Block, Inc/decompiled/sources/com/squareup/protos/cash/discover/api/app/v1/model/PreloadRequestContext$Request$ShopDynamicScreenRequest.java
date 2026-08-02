package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.UriKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PreloadRequestContext$Request$ShopDynamicScreenRequest extends UriKt {
    public final ShopDynamicScreenRequest value;

    public PreloadRequestContext$Request$ShopDynamicScreenRequest(ShopDynamicScreenRequest shopDynamicScreenRequest) {
        shopDynamicScreenRequest.getClass();
        this.value = shopDynamicScreenRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreloadRequestContext$Request$ShopDynamicScreenRequest) && Intrinsics.areEqual(this.value, ((PreloadRequestContext$Request$ShopDynamicScreenRequest) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ShopDynamicScreenRequest(value=" + this.value + ")";
    }
}
