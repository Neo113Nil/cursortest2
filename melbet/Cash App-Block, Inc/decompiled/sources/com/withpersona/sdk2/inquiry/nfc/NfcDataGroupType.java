package com.withpersona.sdk2.inquiry.nfc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class NfcDataGroupType {
    public static final /* synthetic */ NfcDataGroupType[] $VALUES;
    public static final NfcDataGroupType Dg1;
    public static final NfcDataGroupType Dg14;
    public static final NfcDataGroupType Dg2;
    public static final NfcDataGroupType Sod;

    static {
        NfcDataGroupType nfcDataGroupType = new NfcDataGroupType("Dg1", 0);
        Dg1 = nfcDataGroupType;
        NfcDataGroupType nfcDataGroupType2 = new NfcDataGroupType("Dg2", 1);
        Dg2 = nfcDataGroupType2;
        NfcDataGroupType nfcDataGroupType3 = new NfcDataGroupType("Dg14", 2);
        Dg14 = nfcDataGroupType3;
        NfcDataGroupType nfcDataGroupType4 = new NfcDataGroupType("Sod", 3);
        Sod = nfcDataGroupType4;
        $VALUES = new NfcDataGroupType[]{nfcDataGroupType, nfcDataGroupType2, nfcDataGroupType3, nfcDataGroupType4};
    }

    public static NfcDataGroupType valueOf(String str) {
        return (NfcDataGroupType) Enum.valueOf(NfcDataGroupType.class, str);
    }

    public static NfcDataGroupType[] values() {
        return (NfcDataGroupType[]) $VALUES.clone();
    }
}
