package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.google.android.gms.internal.mlkit_vision_barcode.zztw;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CreatePaymentRequest$CardData$IosCardData extends zztw {
    public final IOSCardData value;

    public CreatePaymentRequest$CardData$IosCardData(IOSCardData iOSCardData) {
        iOSCardData.getClass();
        this.value = iOSCardData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreatePaymentRequest$CardData$IosCardData) && Intrinsics.areEqual(this.value, ((CreatePaymentRequest$CardData$IosCardData) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "IosCardData(value=" + this.value + ")";
    }
}
