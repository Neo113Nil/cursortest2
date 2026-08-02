package com.squareup.protos.cash.paymenttemplate.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class OonPaymentMethod$PaymentMethodDetail$UsdcP2pMethodDetail extends zzkg {
    public final UsdcP2pMethodDetail value;

    public OonPaymentMethod$PaymentMethodDetail$UsdcP2pMethodDetail(UsdcP2pMethodDetail usdcP2pMethodDetail) {
        usdcP2pMethodDetail.getClass();
        this.value = usdcP2pMethodDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OonPaymentMethod$PaymentMethodDetail$UsdcP2pMethodDetail) && Intrinsics.areEqual(this.value, ((OonPaymentMethod$PaymentMethodDetail$UsdcP2pMethodDetail) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "UsdcP2pMethodDetail(value=" + this.value + ")";
    }
}
