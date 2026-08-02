package com.squareup.cash.transfers.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TransferType {
    public static final /* synthetic */ TransferType[] $VALUES;
    public static final TransferType ADD_CASH;
    public static final TransferType CASH_OUT;

    static {
        TransferType transferType = new TransferType("ADD_CASH", 0);
        ADD_CASH = transferType;
        TransferType transferType2 = new TransferType("CASH_OUT", 1);
        CASH_OUT = transferType2;
        $VALUES = new TransferType[]{transferType, transferType2};
    }

    public static TransferType valueOf(String str) {
        return (TransferType) Enum.valueOf(TransferType.class, str);
    }

    public static TransferType[] values() {
        return (TransferType[]) $VALUES.clone();
    }
}
