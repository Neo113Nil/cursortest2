package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuSelectorKt;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$SectionHeader$StandardHeader extends LocalMenuSelectorKt {
    public final SectionHeader value;

    public AfterpayAppletHomeSection$SectionHeader$StandardHeader(SectionHeader sectionHeader) {
        sectionHeader.getClass();
        this.value = sectionHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$SectionHeader$StandardHeader) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$SectionHeader$StandardHeader) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "StandardHeader(value=" + this.value + ")";
    }
}
