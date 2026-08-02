package com.squareup.protos.franklin.investing;

import com.google.android.gms.internal.mlkit_vision_face.zzea;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InitiateInvestmentOrderRequest$RequestValue$Amount extends zzea {
    public final Money value;

    public InitiateInvestmentOrderRequest$RequestValue$Amount(Money money) {
        money.getClass();
        this.value = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InitiateInvestmentOrderRequest$RequestValue$Amount) && Intrinsics.areEqual(this.value, ((InitiateInvestmentOrderRequest$RequestValue$Amount) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Amount(value=", ")");
    }
}
