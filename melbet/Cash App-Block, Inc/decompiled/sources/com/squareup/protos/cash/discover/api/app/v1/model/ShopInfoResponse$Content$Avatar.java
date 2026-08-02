package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.decode.ImageSourceKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShopInfoResponse$Content$Avatar extends ImageSourceKt {
    public final Avatar value;

    public ShopInfoResponse$Content$Avatar(Avatar avatar) {
        avatar.getClass();
        this.value = avatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShopInfoResponse$Content$Avatar) && Intrinsics.areEqual(this.value, ((ShopInfoResponse$Content$Avatar) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Avatar(value=" + this.value + ")";
    }
}
