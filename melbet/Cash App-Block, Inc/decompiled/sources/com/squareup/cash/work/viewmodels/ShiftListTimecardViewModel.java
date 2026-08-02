package com.squareup.cash.work.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShiftListTimecardViewModel {
    public final String body;
    public final String id;
    public final String merchantName;
    public final SellerCardViewModel sellerCard;

    public ShiftListTimecardViewModel(SellerCardViewModel sellerCardViewModel, String str, String str2, String str3) {
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
        if (!(obj instanceof ShiftListTimecardViewModel)) {
            return false;
        }
        ShiftListTimecardViewModel shiftListTimecardViewModel = (ShiftListTimecardViewModel) obj;
        return Intrinsics.areEqual(this.id, shiftListTimecardViewModel.id) && this.sellerCard.equals(shiftListTimecardViewModel.sellerCard) && this.merchantName.equals(shiftListTimecardViewModel.merchantName) && this.body.equals(shiftListTimecardViewModel.body);
    }

    public final int hashCode() {
        return this.body.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.sellerCard.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.merchantName);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShiftListTimecardViewModel(id=");
        sb.append(this.id);
        sb.append(", sellerCard=");
        sb.append(this.sellerCard);
        sb.append(", merchantName=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.merchantName, ", body=", this.body, ")");
    }
}
