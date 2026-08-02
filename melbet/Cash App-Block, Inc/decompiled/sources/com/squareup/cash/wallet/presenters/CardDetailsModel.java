package com.squareup.cash.wallet.presenters;

import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;

/* loaded from: classes7.dex */
public final class CardDetailsModel {
    public final CardSchemeViewModel.Module.HeroCardDetails heroCardDetails;
    public final zzsc pillModel;

    public CardDetailsModel(CardSchemeViewModel.Module.HeroCardDetails heroCardDetails, zzsc zzscVar) {
        this.heroCardDetails = heroCardDetails;
        this.pillModel = zzscVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardDetailsModel)) {
            return false;
        }
        CardDetailsModel cardDetailsModel = (CardDetailsModel) obj;
        return this.heroCardDetails.equals(cardDetailsModel.heroCardDetails) && this.pillModel.equals(cardDetailsModel.pillModel);
    }

    public final int hashCode() {
        return this.pillModel.hashCode() + (this.heroCardDetails.hashCode() * 31);
    }

    public final String toString() {
        return "CardDetailsModel(heroCardDetails=" + this.heroCardDetails + ", pillModel=" + this.pillModel + ")";
    }
}
