package com.squareup.protos.cash.moneta.api.v1_0;

import com.google.android.gms.internal.mlkit_vision_common.zzka;
import com.squareup.protos.cash.moneta.api.v1_0.SelectInstrumentRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SelectInstrumentRequest$AdditionalParams$GooglePayPayload extends zzka {
    public final SelectInstrumentRequest.GooglePayPayload value;

    public SelectInstrumentRequest$AdditionalParams$GooglePayPayload(SelectInstrumentRequest.GooglePayPayload googlePayPayload) {
        googlePayPayload.getClass();
        this.value = googlePayPayload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectInstrumentRequest$AdditionalParams$GooglePayPayload) && Intrinsics.areEqual(this.value, ((SelectInstrumentRequest$AdditionalParams$GooglePayPayload) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "GooglePayPayload(value=" + this.value + ")";
    }
}
