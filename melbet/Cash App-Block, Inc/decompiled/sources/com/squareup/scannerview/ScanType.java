package com.squareup.scannerview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ScanType {
    public static final /* synthetic */ ScanType[] $VALUES;
    public static final ScanType CASH_QR;
    public static final ScanType MANUAL;
    public static final ScanType MANUAL_FACE;

    static {
        ScanType scanType = new ScanType("MANUAL", 0);
        MANUAL = scanType;
        ScanType scanType2 = new ScanType("MANUAL_FACE", 1);
        MANUAL_FACE = scanType2;
        ScanType scanType3 = new ScanType("CASH_QR", 2);
        CASH_QR = scanType3;
        $VALUES = new ScanType[]{scanType, scanType2, scanType3};
    }

    public static ScanType valueOf(String str) {
        return (ScanType) Enum.valueOf(ScanType.class, str);
    }

    public static ScanType[] values() {
        return (ScanType[]) $VALUES.clone();
    }
}
