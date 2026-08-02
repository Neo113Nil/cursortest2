package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Result$CheckBoxResult extends zzdi {
    public final SubmitFormRequest.ElementResult.CheckBoxResult value;

    public SubmitFormRequest$ElementResult$Result$CheckBoxResult(SubmitFormRequest.ElementResult.CheckBoxResult checkBoxResult) {
        checkBoxResult.getClass();
        this.value = checkBoxResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitFormRequest$ElementResult$Result$CheckBoxResult) && Intrinsics.areEqual(this.value, ((SubmitFormRequest$ElementResult$Result$CheckBoxResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CheckBoxResult(value=" + this.value + ")";
    }
}
