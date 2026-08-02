package com.squareup.protos.cash.discover.api.app.v1.model;

import coil3.decode.ImageSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShopInfoHalfSheet$Content$Avatar extends ImageSource.Metadata {
    public final Avatar value;

    public ShopInfoHalfSheet$Content$Avatar(Avatar avatar) {
        avatar.getClass();
        this.value = avatar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShopInfoHalfSheet$Content$Avatar) && Intrinsics.areEqual(this.value, ((ShopInfoHalfSheet$Content$Avatar) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Avatar(value=" + this.value + ")";
    }
}
