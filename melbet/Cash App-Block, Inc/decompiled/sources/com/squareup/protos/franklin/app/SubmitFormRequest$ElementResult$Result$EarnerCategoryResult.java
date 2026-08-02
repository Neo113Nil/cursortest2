package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Result$EarnerCategoryResult extends zzdi {
    public final SubmitFormRequest.ElementResult.EarnerCategoryResult value;

    public SubmitFormRequest$ElementResult$Result$EarnerCategoryResult(SubmitFormRequest.ElementResult.EarnerCategoryResult earnerCategoryResult) {
        earnerCategoryResult.getClass();
        this.value = earnerCategoryResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitFormRequest$ElementResult$Result$EarnerCategoryResult) && Intrinsics.areEqual(this.value, ((SubmitFormRequest$ElementResult$Result$EarnerCategoryResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "EarnerCategoryResult(value=" + this.value + ")";
    }
}
