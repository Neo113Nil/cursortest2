package com.stripe.android.model;

import kotlin.enums.EnumEntriesList;
import kotlin.reflect.full.KClasses$$Lambda$1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class CardFunding {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ CardFunding[] $VALUES;
    public static final KClasses$$Lambda$1 Companion;
    public static final CardFunding Unknown;
    public final String code;

    static {
        CardFunding cardFunding = new CardFunding("Credit", 0, "credit");
        CardFunding cardFunding2 = new CardFunding("Debit", 1, "debit");
        CardFunding cardFunding3 = new CardFunding("Prepaid", 2, "prepaid");
        CardFunding cardFunding4 = new CardFunding("Unknown", 3, "unknown");
        Unknown = cardFunding4;
        CardFunding[] cardFundingArr = {cardFunding, cardFunding2, cardFunding3, cardFunding4};
        $VALUES = cardFundingArr;
        $ENTRIES = new EnumEntriesList(cardFundingArr);
        Companion = new KClasses$$Lambda$1(11);
    }

    public CardFunding(String str, int i, String str2) {
        this.code = str2;
    }

    public static CardFunding valueOf(String str) {
        return (CardFunding) Enum.valueOf(CardFunding.class, str);
    }

    public static CardFunding[] values() {
        return (CardFunding[]) $VALUES.clone();
    }
}
