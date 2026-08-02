package com.squareup.protos.cash.postcard;

import com.datadog.android.rum.model.ErrorEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardHomeAction$Action$CopyCardNumber extends ErrorEvent.Dd.Companion {
    public final CopyCardNumber value;

    public CardHomeAction$Action$CopyCardNumber(CopyCardNumber copyCardNumber) {
        copyCardNumber.getClass();
        this.value = copyCardNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardHomeAction$Action$CopyCardNumber) && Intrinsics.areEqual(this.value, ((CardHomeAction$Action$CopyCardNumber) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CopyCardNumber(value=" + this.value + ")";
    }
}
