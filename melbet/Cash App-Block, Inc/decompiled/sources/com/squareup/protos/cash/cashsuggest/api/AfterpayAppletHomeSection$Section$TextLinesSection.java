package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import com.squareup.protos.cash.shop.rendering.api.TextLinesSection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHomeSection$Section$TextLinesSection extends LocalMenuHoursViewKt {
    public final TextLinesSection value;

    public AfterpayAppletHomeSection$Section$TextLinesSection(TextLinesSection textLinesSection) {
        textLinesSection.getClass();
        this.value = textLinesSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHomeSection$Section$TextLinesSection) && Intrinsics.areEqual(this.value, ((AfterpayAppletHomeSection$Section$TextLinesSection) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TextLinesSection(value=" + this.value + ")";
    }
}
