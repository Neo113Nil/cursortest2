package com.squareup.cash.work.presenters.shift;

import com.squareup.cash.work.viewmodels.ShiftCardModel;

/* loaded from: classes9.dex */
public final class PendingCard {
    public final ShiftCardModel card;
    public final CardDateContext dateContext;

    public PendingCard(ShiftCardModel shiftCardModel, CardDateContext cardDateContext) {
        this.card = shiftCardModel;
        this.dateContext = cardDateContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingCard)) {
            return false;
        }
        PendingCard pendingCard = (PendingCard) obj;
        return this.card.equals(pendingCard.card) && this.dateContext.equals(pendingCard.dateContext);
    }

    public final int hashCode() {
        return this.dateContext.dateTime.hashCode() + (this.card.hashCode() * 31);
    }

    public final String toString() {
        return "PendingCard(card=" + this.card + ", dateContext=" + this.dateContext + ")";
    }
}
