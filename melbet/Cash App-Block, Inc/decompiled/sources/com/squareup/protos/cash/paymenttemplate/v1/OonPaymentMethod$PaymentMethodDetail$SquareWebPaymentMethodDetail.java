package com.squareup.protos.cash.paymenttemplate.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class OonPaymentMethod$PaymentMethodDetail$SquareWebPaymentMethodDetail extends zzkg {
    public final SquareWebPaymentMethodDetail value;

    public OonPaymentMethod$PaymentMethodDetail$SquareWebPaymentMethodDetail(SquareWebPaymentMethodDetail squareWebPaymentMethodDetail) {
        squareWebPaymentMethodDetail.getClass();
        this.value = squareWebPaymentMethodDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OonPaymentMethod$PaymentMethodDetail$SquareWebPaymentMethodDetail) && Intrinsics.areEqual(this.value, ((OonPaymentMethod$PaymentMethodDetail$SquareWebPaymentMethodDetail) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SquareWebPaymentMethodDetail(value=" + this.value + ")";
    }
}
