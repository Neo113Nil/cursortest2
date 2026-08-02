package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlq;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SupportPhoneStatusResponse$Granted$State$Idle extends zzlq {
    public final SupportPhoneStatusResponse.Idle value;

    public SupportPhoneStatusResponse$Granted$State$Idle(SupportPhoneStatusResponse.Idle idle) {
        idle.getClass();
        this.value = idle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportPhoneStatusResponse$Granted$State$Idle) && Intrinsics.areEqual(this.value, ((SupportPhoneStatusResponse$Granted$State$Idle) obj).value);
    }

    public final SupportPhoneStatusResponse.Idle getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Idle(value=" + this.value + ")";
    }
}
