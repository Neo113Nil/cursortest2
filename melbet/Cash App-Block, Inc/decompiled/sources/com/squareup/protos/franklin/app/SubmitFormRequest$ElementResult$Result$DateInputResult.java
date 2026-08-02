package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Result$DateInputResult extends zzdi {
    public final SubmitFormRequest.ElementResult.DateInputResult value;

    public SubmitFormRequest$ElementResult$Result$DateInputResult(SubmitFormRequest.ElementResult.DateInputResult dateInputResult) {
        dateInputResult.getClass();
        this.value = dateInputResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitFormRequest$ElementResult$Result$DateInputResult) && Intrinsics.areEqual(this.value, ((SubmitFormRequest$ElementResult$Result$DateInputResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "DateInputResult(value=" + this.value + ")";
    }
}
