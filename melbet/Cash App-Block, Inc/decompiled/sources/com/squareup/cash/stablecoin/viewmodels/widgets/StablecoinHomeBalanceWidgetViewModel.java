package com.squareup.cash.stablecoin.viewmodels.widgets;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class StablecoinHomeBalanceWidgetViewModel implements StablecoinHomeWidgetViewModel {
    public final String amount;

    public StablecoinHomeBalanceWidgetViewModel(String str) {
        str.getClass();
        this.amount = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StablecoinHomeBalanceWidgetViewModel) && Intrinsics.areEqual(this.amount, ((StablecoinHomeBalanceWidgetViewModel) obj).amount);
    }

    public final int hashCode() {
        return this.amount.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StablecoinHomeBalanceWidgetViewModel(amount=", this.amount, ")");
    }
}
