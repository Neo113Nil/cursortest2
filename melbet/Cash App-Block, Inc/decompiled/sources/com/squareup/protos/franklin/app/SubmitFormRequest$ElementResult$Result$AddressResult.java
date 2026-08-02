package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Result$AddressResult extends zzdi {
    public final SubmitFormRequest.ElementResult.AddressResult value;

    public SubmitFormRequest$ElementResult$Result$AddressResult(SubmitFormRequest.ElementResult.AddressResult addressResult) {
        addressResult.getClass();
        this.value = addressResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitFormRequest$ElementResult$Result$AddressResult) && Intrinsics.areEqual(this.value, ((SubmitFormRequest$ElementResult$Result$AddressResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AddressResult(value=" + this.value + ")";
    }
}
