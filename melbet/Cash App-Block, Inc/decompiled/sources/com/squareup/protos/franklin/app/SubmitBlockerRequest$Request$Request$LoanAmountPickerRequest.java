package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitBlockerRequest$Request$Request$LoanAmountPickerRequest extends zzdh {
    public final LoanAmountPickerRequest value;

    public SubmitBlockerRequest$Request$Request$LoanAmountPickerRequest(LoanAmountPickerRequest loanAmountPickerRequest) {
        loanAmountPickerRequest.getClass();
        this.value = loanAmountPickerRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitBlockerRequest$Request$Request$LoanAmountPickerRequest) && Intrinsics.areEqual(this.value, ((SubmitBlockerRequest$Request$Request$LoanAmountPickerRequest) obj).value);
    }

    public final LoanAmountPickerRequest getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "LoanAmountPickerRequest(value=" + this.value + ")";
    }
}
