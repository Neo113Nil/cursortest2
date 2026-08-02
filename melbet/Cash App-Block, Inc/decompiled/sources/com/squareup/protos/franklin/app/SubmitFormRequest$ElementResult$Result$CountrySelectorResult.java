package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Result$CountrySelectorResult extends zzdi {
    public final SubmitFormRequest.ElementResult.CountrySelectorResult value;

    public SubmitFormRequest$ElementResult$Result$CountrySelectorResult(SubmitFormRequest.ElementResult.CountrySelectorResult countrySelectorResult) {
        countrySelectorResult.getClass();
        this.value = countrySelectorResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitFormRequest$ElementResult$Result$CountrySelectorResult) && Intrinsics.areEqual(this.value, ((SubmitFormRequest$ElementResult$Result$CountrySelectorResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CountrySelectorResult(value=" + this.value + ")";
    }
}
