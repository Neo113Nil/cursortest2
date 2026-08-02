package com.squareup.cash.wallet.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardDetailsModel$CardPillModel$Installed$WithActiveOffer extends zzsc {
    public final String lastFour;
    public final int offerCount;

    public CardDetailsModel$CardPillModel$Installed$WithActiveOffer(String str, int i) {
        str.getClass();
        this.lastFour = str;
        this.offerCount = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardDetailsModel$CardPillModel$Installed$WithActiveOffer)) {
            return false;
        }
        CardDetailsModel$CardPillModel$Installed$WithActiveOffer cardDetailsModel$CardPillModel$Installed$WithActiveOffer = (CardDetailsModel$CardPillModel$Installed$WithActiveOffer) obj;
        return Intrinsics.areEqual(this.lastFour, cardDetailsModel$CardPillModel$Installed$WithActiveOffer.lastFour) && this.offerCount == cardDetailsModel$CardPillModel$Installed$WithActiveOffer.offerCount;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzsc
    public final String getLastFour() {
        return this.lastFour;
    }

    public final int hashCode() {
        return Integer.hashCode(this.offerCount) + (this.lastFour.hashCode() * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m("WithActiveOffer(lastFour=", this.offerCount, this.lastFour, ", offerCount=", ")");
    }
}
