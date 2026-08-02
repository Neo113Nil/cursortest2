package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import com.squareup.protos.cash.shop.rendering.api.ImageTextSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$ImageTextSection extends LocalMenuHoursViewKt {
    public final ImageTextSection value;

    public AfterpayAppletHomeSection$Section$ImageTextSection(ImageTextSection imageTextSection) {
        imageTextSection.getClass();
        this.value = imageTextSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$ImageTextSection) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$ImageTextSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ImageTextSection(value=" + this.value + ")";
    }
}
