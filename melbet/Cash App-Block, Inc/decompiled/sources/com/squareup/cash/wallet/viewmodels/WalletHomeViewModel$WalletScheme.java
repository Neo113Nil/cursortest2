package com.squareup.cash.wallet.viewmodels;

import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.viewmodels.TabToolbarViewModel;

/* loaded from: classes7.dex */
public final class WalletHomeViewModel$WalletScheme {
    public final CardSchemeViewModel cardSchemeViewModel;
    public final TabToolbarInternalViewModel toolbarInternalModel;
    public final TabToolbarViewModel toolbarViewModel;

    public WalletHomeViewModel$WalletScheme(TabToolbarInternalViewModel tabToolbarInternalViewModel, TabToolbarViewModel tabToolbarViewModel, CardSchemeViewModel cardSchemeViewModel) {
        this.toolbarInternalModel = tabToolbarInternalViewModel;
        this.toolbarViewModel = tabToolbarViewModel;
        this.cardSchemeViewModel = cardSchemeViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletHomeViewModel$WalletScheme)) {
            return false;
        }
        WalletHomeViewModel$WalletScheme walletHomeViewModel$WalletScheme = (WalletHomeViewModel$WalletScheme) obj;
        return this.toolbarInternalModel.equals(walletHomeViewModel$WalletScheme.toolbarInternalModel) && this.toolbarViewModel.equals(walletHomeViewModel$WalletScheme.toolbarViewModel) && this.cardSchemeViewModel.equals(walletHomeViewModel$WalletScheme.cardSchemeViewModel);
    }

    public final int hashCode() {
        return this.cardSchemeViewModel.hashCode() + ((this.toolbarViewModel.title.hashCode() + (this.toolbarInternalModel.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WalletScheme(toolbarInternalModel=" + this.toolbarInternalModel + ", toolbarViewModel=" + this.toolbarViewModel + ", cardSchemeViewModel=" + this.cardSchemeViewModel + ")";
    }
}
