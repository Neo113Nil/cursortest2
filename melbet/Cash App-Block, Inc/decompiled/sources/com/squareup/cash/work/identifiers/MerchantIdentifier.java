package com.squareup.cash.work.identifiers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes7.dex */
public final class MerchantIdentifier {
    public final String entityId;
    public final String token;

    public MerchantIdentifier(String str) {
        str.getClass();
        this.token = str;
        if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Merchant token cannot be blank");
            throw null;
        }
        if (StringsKt__StringsJVMKt.startsWith(str, "tmmerchant:", false)) {
            a$$ExternalSyntheticBUOutline0.m$3("Merchant token should not include the 'tmmerchant:' prefix");
            throw null;
        }
        this.entityId = "tmmerchant:".concat(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MerchantIdentifier) && Intrinsics.areEqual(this.token, ((MerchantIdentifier) obj).token);
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantIdentifier(token=", this.token, ")");
    }
}
