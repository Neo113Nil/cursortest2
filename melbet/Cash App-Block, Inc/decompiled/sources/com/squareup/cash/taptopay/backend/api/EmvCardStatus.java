package com.squareup.cash.taptopay.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class EmvCardStatus {
    public static final /* synthetic */ EmvCardStatus[] $VALUES;
    public static final EmvCardStatus DEACTIVATED;
    public static final EmvCardStatus DETECTED;
    public static final EmvCardStatus REMOVED;

    static {
        EmvCardStatus emvCardStatus = new EmvCardStatus("DETECTED", 0);
        DETECTED = emvCardStatus;
        EmvCardStatus emvCardStatus2 = new EmvCardStatus("DEACTIVATED", 1);
        DEACTIVATED = emvCardStatus2;
        EmvCardStatus emvCardStatus3 = new EmvCardStatus("REMOVED", 2);
        REMOVED = emvCardStatus3;
        $VALUES = new EmvCardStatus[]{emvCardStatus, emvCardStatus2, emvCardStatus3};
    }

    public static EmvCardStatus valueOf(String str) {
        return (EmvCardStatus) Enum.valueOf(EmvCardStatus.class, str);
    }

    public static EmvCardStatus[] values() {
        return (EmvCardStatus[]) $VALUES.clone();
    }
}
