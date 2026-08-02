package com.squareup.cash.wallet.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class CardScreenId {
    public static final /* synthetic */ CardScreenId[] $VALUES;
    public static final CardScreenId Money;
    public static final CardScreenId Wallet;

    static {
        CardScreenId cardScreenId = new CardScreenId("Money", 0);
        Money = cardScreenId;
        CardScreenId cardScreenId2 = new CardScreenId("Wallet", 1);
        Wallet = cardScreenId2;
        $VALUES = new CardScreenId[]{cardScreenId, cardScreenId2};
    }

    public static CardScreenId valueOf(String str) {
        return (CardScreenId) Enum.valueOf(CardScreenId.class, str);
    }

    public static CardScreenId[] values() {
        return (CardScreenId[]) $VALUES.clone();
    }
}
