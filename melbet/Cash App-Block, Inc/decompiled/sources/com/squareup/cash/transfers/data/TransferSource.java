package com.squareup.cash.transfers.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TransferSource {
    public static final /* synthetic */ TransferSource[] $VALUES;
    public static final TransferSource CLIENT_ROUTE;
    public static final TransferSource MONEY_TAB;

    static {
        TransferSource transferSource = new TransferSource("MONEY_TAB", 0);
        MONEY_TAB = transferSource;
        TransferSource transferSource2 = new TransferSource("ADD_MONEY", 1);
        TransferSource transferSource3 = new TransferSource("CLIENT_ROUTE", 2);
        CLIENT_ROUTE = transferSource3;
        $VALUES = new TransferSource[]{transferSource, transferSource2, transferSource3};
    }

    public static TransferSource valueOf(String str) {
        return (TransferSource) Enum.valueOf(TransferSource.class, str);
    }

    public static TransferSource[] values() {
        return (TransferSource[]) $VALUES.clone();
    }
}
