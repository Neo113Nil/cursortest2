package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SupportPhoneStatusResponse$Access$Denied extends zzlp {
    public final SupportPhoneStatusResponse.Denied value;

    public SupportPhoneStatusResponse$Access$Denied(SupportPhoneStatusResponse.Denied denied) {
        denied.getClass();
        this.value = denied;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportPhoneStatusResponse$Access$Denied) && Intrinsics.areEqual(this.value, ((SupportPhoneStatusResponse$Access$Denied) obj).value);
    }

    public final SupportPhoneStatusResponse.Denied getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Denied(value=" + this.value + ")";
    }
}
