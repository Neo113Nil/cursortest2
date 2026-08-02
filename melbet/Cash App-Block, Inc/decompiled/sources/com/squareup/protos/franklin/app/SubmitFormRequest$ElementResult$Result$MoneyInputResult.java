package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Result$MoneyInputResult extends zzdi {
    public final SubmitFormRequest.ElementResult.MoneyInputResult value;

    public SubmitFormRequest$ElementResult$Result$MoneyInputResult(SubmitFormRequest.ElementResult.MoneyInputResult moneyInputResult) {
        moneyInputResult.getClass();
        this.value = moneyInputResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitFormRequest$ElementResult$Result$MoneyInputResult) && Intrinsics.areEqual(this.value, ((SubmitFormRequest$ElementResult$Result$MoneyInputResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MoneyInputResult(value=" + this.value + ")";
    }
}
