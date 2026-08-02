package com.squareup.protos.cash.cashsuggest.api;

import app.cash.local.views.internal.menus.LocalMenuCardKt;
import com.squareup.protos.cash.shop.rendering.api.UpsellSheet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet extends LocalMenuCardKt {
    public final UpsellSheet value;

    public AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet(UpsellSheet upsellSheet) {
        upsellSheet.getClass();
        this.value = upsellSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet) && Intrinsics.areEqual(this.value, ((AfterpayAppletHome$OnDisplayMessage$Treatment$UpsellSheet) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UpsellSheet(value=" + this.value + ")";
    }
}
