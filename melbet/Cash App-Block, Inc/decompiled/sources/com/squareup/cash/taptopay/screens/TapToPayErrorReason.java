package com.squareup.cash.taptopay.screens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class TapToPayErrorReason {
    public static final /* synthetic */ TapToPayErrorReason[] $VALUES;
    public static final TapToPayErrorReason CARD_TAP_APDU_CONNECTION_ERROR;
    public static final TapToPayErrorReason CARD_TAP_ERROR;
    public static final TapToPayErrorReason CARD_TAP_NFC_READER_ERROR;
    public static final TapToPayErrorReason CARD_TAP_PAYMENT_DECLINED;
    public static final TapToPayErrorReason KEY_IMPORT_FAILURE;
    public static final TapToPayErrorReason ONBOARDING_ACTIVATION_FAILURE;
    public static final TapToPayErrorReason POLICY_FAILURE_API_ERROR;
    public static final TapToPayErrorReason POLICY_FAILURE_OS_PLATFORM_LEVEL_OUTDATED;
    public static final TapToPayErrorReason POLICY_FAILURE_PLAY_PROTECT_NOT_AVAILABLE;
    public static final TapToPayErrorReason POLICY_FAILURE_SCREEN_RECORDING_ON;
    public static final TapToPayErrorReason PROVISIONING_FAILURE;
    public static final TapToPayErrorReason TTP_PAYMENT_FAILURE;
    public static final TapToPayErrorReason UNKNOWN;

    static {
        TapToPayErrorReason tapToPayErrorReason = new TapToPayErrorReason("UNKNOWN", 0);
        UNKNOWN = tapToPayErrorReason;
        TapToPayErrorReason tapToPayErrorReason2 = new TapToPayErrorReason("KEY_IMPORT_FAILURE", 1);
        KEY_IMPORT_FAILURE = tapToPayErrorReason2;
        TapToPayErrorReason tapToPayErrorReason3 = new TapToPayErrorReason("PROVISIONING_FAILURE", 2);
        PROVISIONING_FAILURE = tapToPayErrorReason3;
        TapToPayErrorReason tapToPayErrorReason4 = new TapToPayErrorReason("ONBOARDING_ACTIVATION_FAILURE", 3);
        ONBOARDING_ACTIVATION_FAILURE = tapToPayErrorReason4;
        TapToPayErrorReason tapToPayErrorReason5 = new TapToPayErrorReason("POLICY_FAILURE_API_ERROR", 4);
        POLICY_FAILURE_API_ERROR = tapToPayErrorReason5;
        TapToPayErrorReason tapToPayErrorReason6 = new TapToPayErrorReason("POLICY_FAILURE_PLAY_PROTECT_NOT_AVAILABLE", 5);
        POLICY_FAILURE_PLAY_PROTECT_NOT_AVAILABLE = tapToPayErrorReason6;
        TapToPayErrorReason tapToPayErrorReason7 = new TapToPayErrorReason("POLICY_FAILURE_OS_PLATFORM_LEVEL_OUTDATED", 6);
        POLICY_FAILURE_OS_PLATFORM_LEVEL_OUTDATED = tapToPayErrorReason7;
        TapToPayErrorReason tapToPayErrorReason8 = new TapToPayErrorReason("POLICY_FAILURE_SCREEN_RECORDING_ON", 7);
        POLICY_FAILURE_SCREEN_RECORDING_ON = tapToPayErrorReason8;
        TapToPayErrorReason tapToPayErrorReason9 = new TapToPayErrorReason("CARD_TAP_ERROR", 8);
        CARD_TAP_ERROR = tapToPayErrorReason9;
        TapToPayErrorReason tapToPayErrorReason10 = new TapToPayErrorReason("CARD_TAP_APDU_CONNECTION_ERROR", 9);
        CARD_TAP_APDU_CONNECTION_ERROR = tapToPayErrorReason10;
        TapToPayErrorReason tapToPayErrorReason11 = new TapToPayErrorReason("CARD_TAP_NFC_READER_ERROR", 10);
        CARD_TAP_NFC_READER_ERROR = tapToPayErrorReason11;
        TapToPayErrorReason tapToPayErrorReason12 = new TapToPayErrorReason("CARD_TAP_PAYMENT_DECLINED", 11);
        CARD_TAP_PAYMENT_DECLINED = tapToPayErrorReason12;
        TapToPayErrorReason tapToPayErrorReason13 = new TapToPayErrorReason("CARD_TAP_PAYMENT_TIMEOUT", 12);
        TapToPayErrorReason tapToPayErrorReason14 = new TapToPayErrorReason("TTP_PAYMENT_FAILURE", 13);
        TTP_PAYMENT_FAILURE = tapToPayErrorReason14;
        $VALUES = new TapToPayErrorReason[]{tapToPayErrorReason, tapToPayErrorReason2, tapToPayErrorReason3, tapToPayErrorReason4, tapToPayErrorReason5, tapToPayErrorReason6, tapToPayErrorReason7, tapToPayErrorReason8, tapToPayErrorReason9, tapToPayErrorReason10, tapToPayErrorReason11, tapToPayErrorReason12, tapToPayErrorReason13, tapToPayErrorReason14};
    }

    public static TapToPayErrorReason valueOf(String str) {
        return (TapToPayErrorReason) Enum.valueOf(TapToPayErrorReason.class, str);
    }

    public static TapToPayErrorReason[] values() {
        return (TapToPayErrorReason[]) $VALUES.clone();
    }
}
