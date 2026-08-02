package com.squareup.protos.cash.marketdata.model;

import com.google.android.gms.internal.mlkit_vision_common.zzjk;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate extends zzjk {
    public final String value;

    public InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate) && Intrinsics.areEqual(this.value, ((InvestmentEarnings$Earning$UpcomingEps$UpcomingEarningsDate) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UpcomingEarningsDate(value=", this.value, ")");
    }
}
