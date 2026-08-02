package com.squareup.cash.wallet.presenters;

import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardDetailsModel$CardPillModel$Installed$WithCardInfo extends zzsc {
    public final String lastFour;

    public CardDetailsModel$CardPillModel$Installed$WithCardInfo(String str) {
        str.getClass();
        this.lastFour = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardDetailsModel$CardPillModel$Installed$WithCardInfo) && Intrinsics.areEqual(this.lastFour, ((CardDetailsModel$CardPillModel$Installed$WithCardInfo) obj).lastFour);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzsc
    public final String getLastFour() {
        return this.lastFour;
    }

    public final int hashCode() {
        return this.lastFour.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WithCardInfo(lastFour=", this.lastFour, ")");
    }
}
