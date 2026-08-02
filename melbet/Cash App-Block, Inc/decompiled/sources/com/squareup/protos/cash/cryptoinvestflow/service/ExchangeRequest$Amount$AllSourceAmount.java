package com.squareup.protos.cash.cryptoinvestflow.service;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.zipline.internal.JsonEngineKt;

/* loaded from: classes7.dex */
public final class ExchangeRequest$Amount$AllSourceAmount extends JsonEngineKt {
    public final boolean value;

    public ExchangeRequest$Amount$AllSourceAmount(boolean z) {
        this.value = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExchangeRequest$Amount$AllSourceAmount) && this.value == ((ExchangeRequest$Amount$AllSourceAmount) obj).value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("AllSourceAmount(value=", ")", this.value);
    }
}
