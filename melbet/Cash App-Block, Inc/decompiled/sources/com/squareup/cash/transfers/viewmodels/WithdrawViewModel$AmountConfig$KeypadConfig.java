package com.squareup.cash.transfers.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class WithdrawViewModel$AmountConfig$KeypadConfig {
    public final CurrencyCode currency;
    public final Money currentAmount;
    public final double maxAmount;

    public WithdrawViewModel$AmountConfig$KeypadConfig(Money money, double d, CurrencyCode currencyCode) {
        money.getClass();
        currencyCode.getClass();
        this.currentAmount = money;
        this.maxAmount = d;
        this.currency = currencyCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawViewModel$AmountConfig$KeypadConfig)) {
            return false;
        }
        WithdrawViewModel$AmountConfig$KeypadConfig withdrawViewModel$AmountConfig$KeypadConfig = (WithdrawViewModel$AmountConfig$KeypadConfig) obj;
        return Intrinsics.areEqual(this.currentAmount, withdrawViewModel$AmountConfig$KeypadConfig.currentAmount) && Double.compare(this.maxAmount, withdrawViewModel$AmountConfig$KeypadConfig.maxAmount) == 0 && this.currency == withdrawViewModel$AmountConfig$KeypadConfig.currency;
    }

    public final int hashCode() {
        return this.currency.hashCode() + Fragment$5$$ExternalSyntheticOutline0.m(this.maxAmount, this.currentAmount.hashCode() * 31, 31);
    }

    public final String toString() {
        return "KeypadConfig(currentAmount=" + this.currentAmount + ", maxAmount=" + this.maxAmount + ", currency=" + this.currency + ")";
    }
}
