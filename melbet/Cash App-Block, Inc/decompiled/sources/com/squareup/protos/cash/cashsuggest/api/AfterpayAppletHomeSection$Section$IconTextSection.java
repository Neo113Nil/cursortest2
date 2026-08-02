package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import com.squareup.protos.cash.shop.rendering.api.IconTextSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$IconTextSection extends LocalMenuHoursViewKt {
    public final IconTextSection value;

    public AfterpayAppletHomeSection$Section$IconTextSection(IconTextSection iconTextSection) {
        iconTextSection.getClass();
        this.value = iconTextSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$IconTextSection) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$IconTextSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "IconTextSection(value=" + this.value + ")";
    }
}
