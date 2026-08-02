package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$MultiCurrencyAmountEntryRequest extends zzdh {
    public final MultiCurrencyAmountEntryRequest value;

    public SubmitBlockerRequest$Request$Request$MultiCurrencyAmountEntryRequest(MultiCurrencyAmountEntryRequest multiCurrencyAmountEntryRequest) {
        multiCurrencyAmountEntryRequest.getClass();
        this.value = multiCurrencyAmountEntryRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$MultiCurrencyAmountEntryRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$MultiCurrencyAmountEntryRequest) obj).value);
    }

    public final MultiCurrencyAmountEntryRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MultiCurrencyAmountEntryRequest(value=" + this.value + ")";
    }
}
