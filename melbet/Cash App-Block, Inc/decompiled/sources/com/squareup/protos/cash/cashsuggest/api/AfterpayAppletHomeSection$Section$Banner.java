package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$Banner extends LocalMenuHoursViewKt {
    public final Banner value;

    public AfterpayAppletHomeSection$Section$Banner(Banner banner) {
        banner.getClass();
        this.value = banner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$Banner) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$Banner) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Banner(value=" + this.value + ")";
    }
}
