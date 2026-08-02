package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$Result$CellDefaultResult extends zzdi {
    public final SubmitFormRequest.ElementResult.CellDefaultResult value;

    public SubmitFormRequest$ElementResult$Result$CellDefaultResult(SubmitFormRequest.ElementResult.CellDefaultResult cellDefaultResult) {
        cellDefaultResult.getClass();
        this.value = cellDefaultResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubmitFormRequest$ElementResult$Result$CellDefaultResult) && Intrinsics.areEqual(this.value, ((SubmitFormRequest$ElementResult$Result$CellDefaultResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CellDefaultResult(value=" + this.value + ")";
    }
}
