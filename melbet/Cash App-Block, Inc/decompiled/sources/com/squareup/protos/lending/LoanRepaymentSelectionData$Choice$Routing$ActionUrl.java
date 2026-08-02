package com.squareup.protos.lending;

import com.google.android.gms.internal.mlkit_vision_face.zziz;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class LoanRepaymentSelectionData$Choice$Routing$ActionUrl extends zziz {
    public final String value;

    public LoanRepaymentSelectionData$Choice$Routing$ActionUrl(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoanRepaymentSelectionData$Choice$Routing$ActionUrl) && Intrinsics.areEqual(this.value, ((LoanRepaymentSelectionData$Choice$Routing$ActionUrl) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActionUrl(value=", this.value, ")");
    }
}
