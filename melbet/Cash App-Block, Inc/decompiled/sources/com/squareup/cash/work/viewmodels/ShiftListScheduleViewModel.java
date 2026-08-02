package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShiftListScheduleViewModel {
    public final String body;
    public final String id;
    public final String merchantName;
    public final SellerCardViewModel sellerCard;

    public ShiftListScheduleViewModel(SellerCardViewModel sellerCardViewModel, String str, String str2, String str3) {
        str.getClass();
        this.id = str;
        this.sellerCard = sellerCardViewModel;
        this.merchantName = str2;
        this.body = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftListScheduleViewModel)) {
            return false;
        }
        ShiftListScheduleViewModel shiftListScheduleViewModel = (ShiftListScheduleViewModel) obj;
        return Intrinsics.areEqual(this.id, shiftListScheduleViewModel.id) && this.sellerCard.equals(shiftListScheduleViewModel.sellerCard) && this.merchantName.equals(shiftListScheduleViewModel.merchantName) && this.body.equals(shiftListScheduleViewModel.body);
    }

    public final int hashCode() {
        return this.body.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.sellerCard.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.merchantName);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShiftListScheduleViewModel(id=");
        sb.append(this.id);
        sb.append(", sellerCard=");
        sb.append(this.sellerCard);
        sb.append(", merchantName=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.merchantName, ", body=", this.body, ")");
    }
}
