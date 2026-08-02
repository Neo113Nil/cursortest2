package com.squareup.protos.cash.shop.rendering.api;

import com.datadog.android.rum.model.ErrorEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class EngagedItemToken$Token$MerchantToken extends ErrorEvent.Meta.Companion {
    public final String value;

    public EngagedItemToken$Token$MerchantToken(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EngagedItemToken$Token$MerchantToken) && Intrinsics.areEqual(this.value, ((EngagedItemToken$Token$MerchantToken) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantToken(value=", this.value, ")");
    }
}
