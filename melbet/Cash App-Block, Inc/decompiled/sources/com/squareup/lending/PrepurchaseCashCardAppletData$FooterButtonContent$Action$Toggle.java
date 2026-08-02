package com.squareup.lending;

import app.cash.local.presenters.internal.CashBalanceKt;
import com.squareup.protos.lending.Toggle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle extends CashBalanceKt {
    public final Toggle value;

    public PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle(Toggle toggle) {
        toggle.getClass();
        this.value = toggle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle) && Intrinsics.areEqual(this.value, ((PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Toggle(value=" + this.value + ")";
    }
}
