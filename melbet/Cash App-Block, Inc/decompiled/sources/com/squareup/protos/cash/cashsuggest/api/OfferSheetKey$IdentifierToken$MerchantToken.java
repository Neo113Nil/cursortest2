package com.squareup.protos.cash.cashsuggest.api;

import app.cash.redwood.widget.ComposeHelpersKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OfferSheetKey$IdentifierToken$MerchantToken extends ComposeHelpersKt {
    public final String value;

    public OfferSheetKey$IdentifierToken$MerchantToken(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OfferSheetKey$IdentifierToken$MerchantToken) && Intrinsics.areEqual(this.value, ((OfferSheetKey$IdentifierToken$MerchantToken) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantToken(value=", this.value, ")");
    }
}
