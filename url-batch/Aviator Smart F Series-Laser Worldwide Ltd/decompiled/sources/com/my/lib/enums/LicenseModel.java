package com.my.lib.enums;

import a6.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LicenseModel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LicenseModel[] $VALUES;
    private final int value;
    public static final LicenseModel KNOWN_DEVICE = new LicenseModel("KNOWN_DEVICE", 0, 0);
    public static final LicenseModel CONSUMER_DEVICE = new LicenseModel("CONSUMER_DEVICE", 1, 1);

    private static final /* synthetic */ LicenseModel[] $values() {
        return new LicenseModel[]{KNOWN_DEVICE, CONSUMER_DEVICE};
    }

    static {
        LicenseModel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.enumEntries($values);
    }

    private LicenseModel(String str, int i8, int i9) {
        this.value = i9;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static LicenseModel valueOf(String str) {
        return (LicenseModel) Enum.valueOf(LicenseModel.class, str);
    }

    public static LicenseModel[] values() {
        return (LicenseModel[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
