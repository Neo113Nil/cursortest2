package com.squareup.cash.work.viewmodels;

import com.squareup.cash.work.identifiers.MerchantIdentifier;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MerchantRowViewModel {
    public final MerchantIdentifier merchant;
    public final String name;
    public final String nextShiftDate;
    public final SellerCardViewModel sellerCard;

    public MerchantRowViewModel(MerchantIdentifier merchantIdentifier, String str, String str2, SellerCardViewModel sellerCardViewModel) {
        sellerCardViewModel.getClass();
        this.merchant = merchantIdentifier;
        this.name = str;
        this.nextShiftDate = str2;
        this.sellerCard = sellerCardViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantRowViewModel)) {
            return false;
        }
        MerchantRowViewModel merchantRowViewModel = (MerchantRowViewModel) obj;
        return this.merchant.equals(merchantRowViewModel.merchant) && this.name.equals(merchantRowViewModel.name) && Intrinsics.areEqual(this.nextShiftDate, merchantRowViewModel.nextShiftDate) && Intrinsics.areEqual(this.sellerCard, merchantRowViewModel.sellerCard);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.merchant.token.hashCode() * 31, 31, this.name);
        String str = this.nextShiftDate;
        return this.sellerCard.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "MerchantRowViewModel(merchant=" + this.merchant + ", name=" + this.name + ", nextShiftDate=" + this.nextShiftDate + ", sellerCard=" + this.sellerCard + ")";
    }
}
