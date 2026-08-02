package com.squareup.protos.cash.marketdata.model;

import com.google.android.gms.internal.mlkit_vision_common.zzjk;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InvestmentEarnings$Earning$UpcomingEps$ActualEps extends zzjk {
    public final Money value;

    public InvestmentEarnings$Earning$UpcomingEps$ActualEps(Money money) {
        money.getClass();
        this.value = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestmentEarnings$Earning$UpcomingEps$ActualEps) && Intrinsics.areEqual(this.value, ((InvestmentEarnings$Earning$UpcomingEps$ActualEps) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "ActualEps(value=", ")");
    }
}
