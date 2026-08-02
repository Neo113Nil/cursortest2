package com.squareup.protos.cash.supportal.app;

import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.squareup.protos.cash.supportal.app.SupportPhoneStatusResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SupportPhoneStatusResponse$Access$Granted extends zzlp {
    public final SupportPhoneStatusResponse.Granted value;

    public SupportPhoneStatusResponse$Access$Granted(SupportPhoneStatusResponse.Granted granted) {
        granted.getClass();
        this.value = granted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupportPhoneStatusResponse$Access$Granted) && Intrinsics.areEqual(this.value, ((SupportPhoneStatusResponse$Access$Granted) obj).value);
    }

    public final SupportPhoneStatusResponse.Granted getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Granted(value=" + this.value + ")";
    }
}
