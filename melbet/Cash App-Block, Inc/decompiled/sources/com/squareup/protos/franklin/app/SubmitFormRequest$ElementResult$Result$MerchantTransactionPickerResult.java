package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Result$MerchantTransactionPickerResult extends zzdi {
    public final SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult value;

    public SubmitFormRequest$ElementResult$Result$MerchantTransactionPickerResult(SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult merchantTransactionOptionPickerResult) {
        merchantTransactionOptionPickerResult.getClass();
        this.value = merchantTransactionOptionPickerResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitFormRequest$ElementResult$Result$MerchantTransactionPickerResult) && Intrinsics.areEqual(this.value, ((SubmitFormRequest$ElementResult$Result$MerchantTransactionPickerResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "MerchantTransactionPickerResult(value=" + this.value + ")";
    }
}
