package com.squareup.lending;

import app.cash.local.presenters.internal.CashBalanceKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute extends CashBalanceKt {
    public final String value;

    public PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute(String str) {
        str.getClass();
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRoute(value=", this.value, ")");
    }
}
