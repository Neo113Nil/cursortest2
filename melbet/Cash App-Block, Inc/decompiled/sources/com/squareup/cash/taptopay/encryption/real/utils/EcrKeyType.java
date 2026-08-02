package com.squareup.cash.taptopay.encryption.real.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class EcrKeyType {
    public static final /* synthetic */ EcrKeyType[] $VALUES;
    public static final EcrKeyType AES_KEY_NO_MIN_MAC;
    public static final EcrKeyType AES_KEY_WITH_MIN_MAC;
    public static final EcrKeyType HMAC_KEY_WITH_MIN_MAC;

    static {
        EcrKeyType ecrKeyType = new EcrKeyType("AES_KEY_WITH_MIN_MAC", 0);
        AES_KEY_WITH_MIN_MAC = ecrKeyType;
        EcrKeyType ecrKeyType2 = new EcrKeyType("AES_KEY_NO_MIN_MAC", 1);
        AES_KEY_NO_MIN_MAC = ecrKeyType2;
        EcrKeyType ecrKeyType3 = new EcrKeyType("HMAC_KEY_WITH_MIN_MAC", 2);
        HMAC_KEY_WITH_MIN_MAC = ecrKeyType3;
        $VALUES = new EcrKeyType[]{ecrKeyType, ecrKeyType2, ecrKeyType3, new EcrKeyType("HMAC_KEY_NO_MIN_MAC", 3)};
    }

    public static EcrKeyType valueOf(String str) {
        return (EcrKeyType) Enum.valueOf(EcrKeyType.class, str);
    }

    public static EcrKeyType[] values() {
        return (EcrKeyType[]) $VALUES.clone();
    }
}
