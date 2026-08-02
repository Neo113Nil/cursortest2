package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Result$OptionPickerResult extends zzdi {
    public final SubmitFormRequest.ElementResult.OptionPickerResult value;

    public SubmitFormRequest$ElementResult$Result$OptionPickerResult(SubmitFormRequest.ElementResult.OptionPickerResult optionPickerResult) {
        optionPickerResult.getClass();
        this.value = optionPickerResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitFormRequest$ElementResult$Result$OptionPickerResult) && Intrinsics.areEqual(this.value, ((SubmitFormRequest$ElementResult$Result$OptionPickerResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "OptionPickerResult(value=" + this.value + ")";
    }
}
