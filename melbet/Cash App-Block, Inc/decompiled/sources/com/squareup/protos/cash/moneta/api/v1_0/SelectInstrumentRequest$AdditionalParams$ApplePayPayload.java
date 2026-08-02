package com.squareup.protos.cash.moneta.api.v1_0;

import com.google.android.gms.internal.mlkit_vision_common.zzka;
import com.squareup.protos.cash.moneta.api.v1_0.SelectInstrumentRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SelectInstrumentRequest$AdditionalParams$ApplePayPayload extends zzka {
    public final SelectInstrumentRequest.ApplePayPayload value;

    public SelectInstrumentRequest$AdditionalParams$ApplePayPayload(SelectInstrumentRequest.ApplePayPayload applePayPayload) {
        applePayPayload.getClass();
        this.value = applePayPayload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectInstrumentRequest$AdditionalParams$ApplePayPayload) && Intrinsics.areEqual(this.value, ((SelectInstrumentRequest$AdditionalParams$ApplePayPayload) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "ApplePayPayload(value=" + this.value + ")";
    }
}
