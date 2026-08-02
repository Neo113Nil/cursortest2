package com.squareup.cash.work.service.api;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SquareMerchantToken {
    public final String value;

    public SquareMerchantToken(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SquareMerchantToken) && Intrinsics.areEqual(this.value, ((SquareMerchantToken) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SquareMerchantToken(value=", this.value, ")");
    }
}
