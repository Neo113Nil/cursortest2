package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdg;
import com.squareup.protos.franklin.app.SetAmountRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SetAmountRequest$Result$AmountResult extends zzdg {
    public final SetAmountRequest.AmountResult value;

    public SetAmountRequest$Result$AmountResult(SetAmountRequest.AmountResult amountResult) {
        amountResult.getClass();
        this.value = amountResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetAmountRequest$Result$AmountResult) && Intrinsics.areEqual(this.value, ((SetAmountRequest$Result$AmountResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "AmountResult(value=" + this.value + ")";
    }
}
