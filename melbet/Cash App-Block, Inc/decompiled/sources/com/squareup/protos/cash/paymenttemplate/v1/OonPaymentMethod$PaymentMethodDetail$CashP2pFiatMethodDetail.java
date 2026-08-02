package com.squareup.protos.cash.paymenttemplate.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class OonPaymentMethod$PaymentMethodDetail$CashP2pFiatMethodDetail extends zzkg {
    public final CashP2PFiatMethodDetail value;

    public OonPaymentMethod$PaymentMethodDetail$CashP2pFiatMethodDetail(CashP2PFiatMethodDetail cashP2PFiatMethodDetail) {
        cashP2PFiatMethodDetail.getClass();
        this.value = cashP2PFiatMethodDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OonPaymentMethod$PaymentMethodDetail$CashP2pFiatMethodDetail) && Intrinsics.areEqual(this.value, ((OonPaymentMethod$PaymentMethodDetail$CashP2pFiatMethodDetail) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CashP2pFiatMethodDetail(value=" + this.value + ")";
    }
}
