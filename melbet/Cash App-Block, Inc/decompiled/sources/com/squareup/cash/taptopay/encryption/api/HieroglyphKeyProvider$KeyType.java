package com.squareup.cash.taptopay.encryption.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class HieroglyphKeyProvider$KeyType {
    public static final /* synthetic */ HieroglyphKeyProvider$KeyType[] $VALUES;
    public static final HieroglyphKeyProvider$KeyType TTP_HMAC_PAN_KEY;
    public static final HieroglyphKeyProvider$KeyType TTP_PAN_KEY;

    static {
        HieroglyphKeyProvider$KeyType hieroglyphKeyProvider$KeyType = new HieroglyphKeyProvider$KeyType("TTP_PAN_KEY", 0);
        TTP_PAN_KEY = hieroglyphKeyProvider$KeyType;
        HieroglyphKeyProvider$KeyType hieroglyphKeyProvider$KeyType2 = new HieroglyphKeyProvider$KeyType("TTP_HMAC_PAN_KEY", 1);
        TTP_HMAC_PAN_KEY = hieroglyphKeyProvider$KeyType2;
        $VALUES = new HieroglyphKeyProvider$KeyType[]{hieroglyphKeyProvider$KeyType, hieroglyphKeyProvider$KeyType2};
    }

    public static HieroglyphKeyProvider$KeyType valueOf(String str) {
        return (HieroglyphKeyProvider$KeyType) Enum.valueOf(HieroglyphKeyProvider$KeyType.class, str);
    }

    public static HieroglyphKeyProvider$KeyType[] values() {
        return (HieroglyphKeyProvider$KeyType[]) $VALUES.clone();
    }
}
