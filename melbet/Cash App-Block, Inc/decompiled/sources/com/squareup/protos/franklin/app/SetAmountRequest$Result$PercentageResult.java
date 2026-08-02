package com.squareup.protos.franklin.app;

import com.google.android.gms.internal.mlkit_vision_face.zzdg;
import com.squareup.protos.franklin.app.SetAmountRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SetAmountRequest$Result$PercentageResult extends zzdg {
    public final SetAmountRequest.PercentageResult value;

    public SetAmountRequest$Result$PercentageResult(SetAmountRequest.PercentageResult percentageResult) {
        percentageResult.getClass();
        this.value = percentageResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetAmountRequest$Result$PercentageResult) && Intrinsics.areEqual(this.value, ((SetAmountRequest$Result$PercentageResult) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "PercentageResult(value=" + this.value + ")";
    }
}
