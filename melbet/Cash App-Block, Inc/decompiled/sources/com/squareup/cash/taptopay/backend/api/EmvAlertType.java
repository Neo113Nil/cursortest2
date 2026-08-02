package com.squareup.cash.taptopay.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class EmvAlertType {
    public static final /* synthetic */ EmvAlertType[] $VALUES;
    public static final EmvAlertType FAILURE;
    public static final EmvAlertType SUCCESS;

    static {
        EmvAlertType emvAlertType = new EmvAlertType("SUCCESS", 0);
        SUCCESS = emvAlertType;
        EmvAlertType emvAlertType2 = new EmvAlertType("FAILURE", 1);
        FAILURE = emvAlertType2;
        $VALUES = new EmvAlertType[]{emvAlertType, emvAlertType2};
    }

    public static EmvAlertType valueOf(String str) {
        return (EmvAlertType) Enum.valueOf(EmvAlertType.class, str);
    }

    public static EmvAlertType[] values() {
        return (EmvAlertType[]) $VALUES.clone();
    }
}
