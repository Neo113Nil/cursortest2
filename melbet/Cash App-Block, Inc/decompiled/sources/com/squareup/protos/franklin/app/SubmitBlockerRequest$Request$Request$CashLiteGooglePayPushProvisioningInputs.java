package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import com.squareup.protos.cash.cashliteflow.blockers.v1.CashLiteGooglePayPushProvisioningInputs;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SubmitBlockerRequest$Request$Request$CashLiteGooglePayPushProvisioningInputs extends zzdh {
    public final CashLiteGooglePayPushProvisioningInputs value;

    public SubmitBlockerRequest$Request$Request$CashLiteGooglePayPushProvisioningInputs(CashLiteGooglePayPushProvisioningInputs cashLiteGooglePayPushProvisioningInputs) {
        cashLiteGooglePayPushProvisioningInputs.getClass();
        this.value = cashLiteGooglePayPushProvisioningInputs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$CashLiteGooglePayPushProvisioningInputs) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$CashLiteGooglePayPushProvisioningInputs) obj).value);
    }

    public final CashLiteGooglePayPushProvisioningInputs getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CashLiteGooglePayPushProvisioningInputs(value=" + this.value + ")";
    }
}
