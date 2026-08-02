package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.squareup.protos.cash.cashliteflow.blockers.v1.CashLiteApplePayPushProvisioningInputs;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitBlockerRequest$Request$Request$CashLiteApplePayPushProvisioningInputs extends zzdh {
    public final CashLiteApplePayPushProvisioningInputs value;

    public SubmitBlockerRequest$Request$Request$CashLiteApplePayPushProvisioningInputs(CashLiteApplePayPushProvisioningInputs cashLiteApplePayPushProvisioningInputs) {
        cashLiteApplePayPushProvisioningInputs.getClass();
        this.value = cashLiteApplePayPushProvisioningInputs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$CashLiteApplePayPushProvisioningInputs) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$CashLiteApplePayPushProvisioningInputs) obj).value);
    }

    public final CashLiteApplePayPushProvisioningInputs getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CashLiteApplePayPushProvisioningInputs(value=" + this.value + ")";
    }
}
