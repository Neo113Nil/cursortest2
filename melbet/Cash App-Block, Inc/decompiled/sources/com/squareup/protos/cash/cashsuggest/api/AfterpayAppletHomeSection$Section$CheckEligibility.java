package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import com.squareup.protos.cash.shop.rendering.api.ImageTextSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$CheckEligibility extends LocalMenuHoursViewKt {
    public final ImageTextSection value;

    public AfterpayAppletHomeSection$Section$CheckEligibility(ImageTextSection imageTextSection) {
        imageTextSection.getClass();
        this.value = imageTextSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$CheckEligibility) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$CheckEligibility) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CheckEligibility(value=" + this.value + ")";
    }
}
