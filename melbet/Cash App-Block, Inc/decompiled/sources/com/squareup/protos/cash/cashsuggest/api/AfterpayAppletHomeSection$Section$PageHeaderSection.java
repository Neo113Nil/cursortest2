package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import com.squareup.protos.cash.shop.rendering.api.PageHeaderSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$PageHeaderSection extends LocalMenuHoursViewKt {
    public final PageHeaderSection value;

    public AfterpayAppletHomeSection$Section$PageHeaderSection(PageHeaderSection pageHeaderSection) {
        pageHeaderSection.getClass();
        this.value = pageHeaderSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$PageHeaderSection) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$PageHeaderSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PageHeaderSection(value=" + this.value + ")";
    }
}
