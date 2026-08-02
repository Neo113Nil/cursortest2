package com.squareup.cash.work.presenters.shift;

import java.time.OffsetDateTime;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CardDateContext {
    public final OffsetDateTime dateTime;

    public CardDateContext(OffsetDateTime offsetDateTime) {
        offsetDateTime.getClass();
        this.dateTime = offsetDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardDateContext) && Intrinsics.areEqual(this.dateTime, ((CardDateContext) obj).dateTime);
    }

    public final int hashCode() {
        return this.dateTime.hashCode();
    }

    public final String toString() {
        return "CardDateContext(dateTime=" + this.dateTime + ")";
    }
}
