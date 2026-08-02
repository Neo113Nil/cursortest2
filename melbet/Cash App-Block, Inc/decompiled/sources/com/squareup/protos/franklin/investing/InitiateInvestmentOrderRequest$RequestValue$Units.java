package com.squareup.protos.franklin.investing;

import com.google.android.gms.internal.mlkit_vision_face.zzea;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InitiateInvestmentOrderRequest$RequestValue$Units extends zzea {
    public final String value;

    public InitiateInvestmentOrderRequest$RequestValue$Units(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InitiateInvestmentOrderRequest$RequestValue$Units) && Intrinsics.areEqual(this.value, ((InitiateInvestmentOrderRequest$RequestValue$Units) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Units(value=", this.value, ")");
    }
}
