package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Result$TextInputResult extends zzdi {
    public final SubmitFormRequest.ElementResult.TextInputResult value;

    public SubmitFormRequest$ElementResult$Result$TextInputResult(SubmitFormRequest.ElementResult.TextInputResult textInputResult) {
        textInputResult.getClass();
        this.value = textInputResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitFormRequest$ElementResult$Result$TextInputResult) && Intrinsics.areEqual(this.value, ((SubmitFormRequest$ElementResult$Result$TextInputResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TextInputResult(value=" + this.value + ")";
    }
}
