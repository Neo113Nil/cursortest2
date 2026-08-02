package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlq;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SupportPhoneStatusResponse$Granted$State$Active extends zzlq {
    public final SupportPhoneStatusResponse.Active value;

    public SupportPhoneStatusResponse$Granted$State$Active(SupportPhoneStatusResponse.Active active) {
        active.getClass();
        this.value = active;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportPhoneStatusResponse$Granted$State$Active) && Intrinsics.areEqual(this.value, ((SupportPhoneStatusResponse$Granted$State$Active) obj).value);
    }

    public final SupportPhoneStatusResponse.Active getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Active(value=" + this.value + ")";
    }
}
