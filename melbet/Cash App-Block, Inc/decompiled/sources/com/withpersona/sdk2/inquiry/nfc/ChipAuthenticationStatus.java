package com.withpersona.sdk2.inquiry.nfc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ChipAuthenticationStatus {
    public static final /* synthetic */ ChipAuthenticationStatus[] $VALUES;
    public static final ChipAuthenticationStatus NotRequested;

    static {
        ChipAuthenticationStatus chipAuthenticationStatus = new ChipAuthenticationStatus("NotRequested", 0);
        NotRequested = chipAuthenticationStatus;
        $VALUES = new ChipAuthenticationStatus[]{chipAuthenticationStatus, new ChipAuthenticationStatus("NotSupported", 1), new ChipAuthenticationStatus("Failed", 2), new ChipAuthenticationStatus("Success", 3)};
    }

    public static ChipAuthenticationStatus valueOf(String str) {
        return (ChipAuthenticationStatus) Enum.valueOf(ChipAuthenticationStatus.class, str);
    }

    public static ChipAuthenticationStatus[] values() {
        return (ChipAuthenticationStatus[]) $VALUES.clone();
    }
}
