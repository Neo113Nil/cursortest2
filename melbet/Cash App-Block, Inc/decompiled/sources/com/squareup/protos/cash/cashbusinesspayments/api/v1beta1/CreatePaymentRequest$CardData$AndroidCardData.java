package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.google.android.gms.internal.mlkit_vision_barcode.zztw;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CreatePaymentRequest$CardData$AndroidCardData extends zztw {
    public final AndroidCardData value;

    public CreatePaymentRequest$CardData$AndroidCardData(AndroidCardData androidCardData) {
        androidCardData.getClass();
        this.value = androidCardData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreatePaymentRequest$CardData$AndroidCardData) && Intrinsics.areEqual(this.value, ((CreatePaymentRequest$CardData$AndroidCardData) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AndroidCardData(value=" + this.value + ")";
    }
}
