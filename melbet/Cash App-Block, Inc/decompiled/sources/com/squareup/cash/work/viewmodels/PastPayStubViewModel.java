package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PastPayStubViewModel {
    public final String amount;
    public final String id;
    public final String payDate;

    public PastPayStubViewModel(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.id = str;
        this.payDate = str2;
        this.amount = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PastPayStubViewModel)) {
            return false;
        }
        PastPayStubViewModel pastPayStubViewModel = (PastPayStubViewModel) obj;
        return this.id.equals(pastPayStubViewModel.id) && Intrinsics.areEqual(this.payDate, pastPayStubViewModel.payDate) && Intrinsics.areEqual(this.amount, pastPayStubViewModel.amount);
    }

    public final int hashCode() {
        return this.amount.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.payDate);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PastPayStubViewModel(id=", this.id, ", payDate=", this.payDate, ", amount="), this.amount, ")");
    }
}
