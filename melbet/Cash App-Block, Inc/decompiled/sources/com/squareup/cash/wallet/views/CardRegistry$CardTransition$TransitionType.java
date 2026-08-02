package com.squareup.cash.wallet.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class CardRegistry$CardTransition$TransitionType {
    public static final /* synthetic */ CardRegistry$CardTransition$TransitionType[] $VALUES;
    public static final CardRegistry$CardTransition$TransitionType SOURCE;
    public static final CardRegistry$CardTransition$TransitionType TARGET;

    static {
        CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType = new CardRegistry$CardTransition$TransitionType("SOURCE", 0);
        SOURCE = cardRegistry$CardTransition$TransitionType;
        CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType2 = new CardRegistry$CardTransition$TransitionType("TARGET", 1);
        TARGET = cardRegistry$CardTransition$TransitionType2;
        $VALUES = new CardRegistry$CardTransition$TransitionType[]{cardRegistry$CardTransition$TransitionType, cardRegistry$CardTransition$TransitionType2};
    }

    public static CardRegistry$CardTransition$TransitionType valueOf(String str) {
        return (CardRegistry$CardTransition$TransitionType) Enum.valueOf(CardRegistry$CardTransition$TransitionType.class, str);
    }

    public static CardRegistry$CardTransition$TransitionType[] values() {
        return (CardRegistry$CardTransition$TransitionType[]) $VALUES.clone();
    }
}
