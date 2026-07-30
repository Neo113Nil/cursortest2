package com.facebook.appevents.iap;

import java.util.Currency;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InAppPurchase {
    private final double amount;
    private final Currency currency;
    private final String eventName;

    public InAppPurchase(String str, double d, Currency currency) {
        str.getClass();
        currency.getClass();
        this.eventName = str;
        this.amount = d;
        this.currency = currency;
    }

    public static /* synthetic */ InAppPurchase copy$default(InAppPurchase inAppPurchase, String str, double d, Currency currency, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppPurchase.eventName;
        }
        if ((i & 2) != 0) {
            d = inAppPurchase.amount;
        }
        if ((i & 4) != 0) {
            currency = inAppPurchase.currency;
        }
        return inAppPurchase.copy(str, d, currency);
    }

    public final String component1() {
        return this.eventName;
    }

    public final double component2() {
        return this.amount;
    }

    public final Currency component3() {
        return this.currency;
    }

    public final InAppPurchase copy(String str, double d, Currency currency) {
        str.getClass();
        currency.getClass();
        return new InAppPurchase(str, d, currency);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppPurchase)) {
            return false;
        }
        InAppPurchase inAppPurchase = (InAppPurchase) obj;
        return Intrinsics.b(this.eventName, inAppPurchase.eventName) && Double.compare(this.amount, inAppPurchase.amount) == 0 && Intrinsics.b(this.currency, inAppPurchase.currency);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public int hashCode() {
        return this.currency.hashCode() + ((Double.hashCode(this.amount) + (this.eventName.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "InAppPurchase(eventName=" + this.eventName + ", amount=" + this.amount + ", currency=" + this.currency + ')';
    }
}
