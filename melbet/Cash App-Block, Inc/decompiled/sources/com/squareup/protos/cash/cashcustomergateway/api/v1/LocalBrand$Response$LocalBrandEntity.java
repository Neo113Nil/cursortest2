package com.squareup.protos.cash.cashcustomergateway.api.v1;

import app.cash.local.primitives.MenuHoursKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalBrand$Response$LocalBrandEntity extends MenuHoursKt {
    public final LocalBrandEntity value;

    public LocalBrand$Response$LocalBrandEntity(LocalBrandEntity localBrandEntity) {
        localBrandEntity.getClass();
        this.value = localBrandEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalBrand$Response$LocalBrandEntity) && Intrinsics.areEqual(this.value, ((LocalBrand$Response$LocalBrandEntity) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LocalBrandEntity(value=" + this.value + ")";
    }
}
