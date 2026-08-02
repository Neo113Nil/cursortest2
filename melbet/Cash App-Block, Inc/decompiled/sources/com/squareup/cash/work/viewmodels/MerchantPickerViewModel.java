package com.squareup.cash.work.viewmodels;

import com.squareup.cash.work.identifiers.MerchantIdentifier;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MerchantPickerViewModel {
    public final List merchants;
    public final MerchantIdentifier selectedMerchant;

    public MerchantPickerViewModel(List list, MerchantIdentifier merchantIdentifier) {
        list.getClass();
        this.merchants = list;
        this.selectedMerchant = merchantIdentifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantPickerViewModel)) {
            return false;
        }
        MerchantPickerViewModel merchantPickerViewModel = (MerchantPickerViewModel) obj;
        return Intrinsics.areEqual(this.merchants, merchantPickerViewModel.merchants) && Intrinsics.areEqual(this.selectedMerchant, merchantPickerViewModel.selectedMerchant);
    }

    public final int hashCode() {
        int hashCode = this.merchants.hashCode() * 31;
        MerchantIdentifier merchantIdentifier = this.selectedMerchant;
        return hashCode + (merchantIdentifier == null ? 0 : merchantIdentifier.token.hashCode());
    }

    public final String toString() {
        return "MerchantPickerViewModel(merchants=" + this.merchants + ", selectedMerchant=" + this.selectedMerchant + ")";
    }
}
