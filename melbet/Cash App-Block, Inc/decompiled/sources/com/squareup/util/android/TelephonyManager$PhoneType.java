package com.squareup.util.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TelephonyManager$PhoneType {
    public static final /* synthetic */ TelephonyManager$PhoneType[] $VALUES;
    public static final TelephonyManager$PhoneType CDMA;
    public static final TelephonyManager$PhoneType GSM;
    public static final TelephonyManager$PhoneType NONE;
    public static final TelephonyManager$PhoneType SIP;

    static {
        TelephonyManager$PhoneType telephonyManager$PhoneType = new TelephonyManager$PhoneType("NONE", 0);
        NONE = telephonyManager$PhoneType;
        TelephonyManager$PhoneType telephonyManager$PhoneType2 = new TelephonyManager$PhoneType("GSM", 1);
        GSM = telephonyManager$PhoneType2;
        TelephonyManager$PhoneType telephonyManager$PhoneType3 = new TelephonyManager$PhoneType("CDMA", 2);
        CDMA = telephonyManager$PhoneType3;
        TelephonyManager$PhoneType telephonyManager$PhoneType4 = new TelephonyManager$PhoneType("SIP", 3);
        SIP = telephonyManager$PhoneType4;
        $VALUES = new TelephonyManager$PhoneType[]{telephonyManager$PhoneType, telephonyManager$PhoneType2, telephonyManager$PhoneType3, telephonyManager$PhoneType4};
    }

    public static TelephonyManager$PhoneType valueOf(String str) {
        return (TelephonyManager$PhoneType) Enum.valueOf(TelephonyManager$PhoneType.class, str);
    }

    public static TelephonyManager$PhoneType[] values() {
        return (TelephonyManager$PhoneType[]) $VALUES.clone();
    }
}
