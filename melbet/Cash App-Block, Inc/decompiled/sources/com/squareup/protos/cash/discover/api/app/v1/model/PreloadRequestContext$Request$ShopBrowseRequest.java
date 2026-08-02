package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.UriKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PreloadRequestContext$Request$ShopBrowseRequest extends UriKt {
    public final ShopBrowseRequest value;

    public PreloadRequestContext$Request$ShopBrowseRequest(ShopBrowseRequest shopBrowseRequest) {
        shopBrowseRequest.getClass();
        this.value = shopBrowseRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreloadRequestContext$Request$ShopBrowseRequest) && Intrinsics.areEqual(this.value, ((PreloadRequestContext$Request$ShopBrowseRequest) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ShopBrowseRequest(value=" + this.value + ")";
    }
}
