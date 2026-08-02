package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PayHistoryStubViewModel {
    public final String amount;
    public final String id;
    public final String payDate;

    public PayHistoryStubViewModel(String str, String str2, String str3) {
        str2.getClass();
        this.id = str;
        this.payDate = str2;
        this.amount = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayHistoryStubViewModel)) {
            return false;
        }
        PayHistoryStubViewModel payHistoryStubViewModel = (PayHistoryStubViewModel) obj;
        return this.id.equals(payHistoryStubViewModel.id) && Intrinsics.areEqual(this.payDate, payHistoryStubViewModel.payDate) && this.amount.equals(payHistoryStubViewModel.amount);
    }

    public final int hashCode() {
        return this.amount.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.payDate);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PayHistoryStubViewModel(id=", this.id, ", payDate=", this.payDate, ", amount="), this.amount, ")");
    }
}
