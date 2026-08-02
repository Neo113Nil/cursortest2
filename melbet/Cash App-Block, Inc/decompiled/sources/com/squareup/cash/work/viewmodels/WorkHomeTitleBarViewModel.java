package com.squareup.cash.work.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class WorkHomeTitleBarViewModel {
    public final SellerCardViewModel sellerCardViewModel;

    public WorkHomeTitleBarViewModel(SellerCardViewModel sellerCardViewModel) {
        this.sellerCardViewModel = sellerCardViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WorkHomeTitleBarViewModel) && Intrinsics.areEqual(this.sellerCardViewModel, ((WorkHomeTitleBarViewModel) obj).sellerCardViewModel);
    }

    public final int hashCode() {
        SellerCardViewModel sellerCardViewModel = this.sellerCardViewModel;
        if (sellerCardViewModel == null) {
            return 0;
        }
        return sellerCardViewModel.hashCode();
    }

    public final String toString() {
        return "WorkHomeTitleBarViewModel(sellerCardViewModel=" + this.sellerCardViewModel + ")";
    }
}
