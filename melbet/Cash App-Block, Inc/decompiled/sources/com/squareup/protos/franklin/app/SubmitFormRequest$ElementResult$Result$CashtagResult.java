package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Result$CashtagResult extends zzdi {
    public final SubmitFormRequest.ElementResult.CashtagResult value;

    public SubmitFormRequest$ElementResult$Result$CashtagResult(SubmitFormRequest.ElementResult.CashtagResult cashtagResult) {
        cashtagResult.getClass();
        this.value = cashtagResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitFormRequest$ElementResult$Result$CashtagResult) && Intrinsics.areEqual(this.value, ((SubmitFormRequest$ElementResult$Result$CashtagResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CashtagResult(value=" + this.value + ")";
    }
}
