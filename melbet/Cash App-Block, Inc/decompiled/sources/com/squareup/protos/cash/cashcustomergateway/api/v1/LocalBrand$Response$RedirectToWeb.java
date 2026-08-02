package com.squareup.protos.cash.cashcustomergateway.api.v1;

import app.cash.local.primitives.MenuHoursKt;
import com.squareup.protos.cash.local.client.v1.RedirectToWeb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LocalBrand$Response$RedirectToWeb extends MenuHoursKt {
    public final RedirectToWeb value;

    public LocalBrand$Response$RedirectToWeb(RedirectToWeb redirectToWeb) {
        redirectToWeb.getClass();
        this.value = redirectToWeb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalBrand$Response$RedirectToWeb) && Intrinsics.areEqual(this.value, ((LocalBrand$Response$RedirectToWeb) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RedirectToWeb(value=" + this.value + ")";
    }
}
