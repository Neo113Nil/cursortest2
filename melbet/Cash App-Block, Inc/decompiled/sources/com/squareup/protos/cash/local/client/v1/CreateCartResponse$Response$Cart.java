package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzho;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CreateCartResponse$Response$Cart extends zzho {
    public final LocalCart value;

    public CreateCartResponse$Response$Cart(LocalCart localCart) {
        localCart.getClass();
        this.value = localCart;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateCartResponse$Response$Cart) && Intrinsics.areEqual(this.value, ((CreateCartResponse$Response$Cart) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Cart(value=" + this.value + ")";
    }
}
