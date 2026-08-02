package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class GetShortlinkResponse$Action$RedirectToWeb extends ViewUtilsKt {
    public final RedirectToWeb value;

    public GetShortlinkResponse$Action$RedirectToWeb(RedirectToWeb redirectToWeb) {
        redirectToWeb.getClass();
        this.value = redirectToWeb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetShortlinkResponse$Action$RedirectToWeb) && Intrinsics.areEqual(this.value, ((GetShortlinkResponse$Action$RedirectToWeb) obj).value);
    }

    public final RedirectToWeb getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RedirectToWeb(value=" + this.value + ")";
    }
}
