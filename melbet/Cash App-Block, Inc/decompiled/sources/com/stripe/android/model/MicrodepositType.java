package com.stripe.android.model;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class MicrodepositType {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ MicrodepositType[] $VALUES;
    public static final MicrodepositType UNKNOWN;
    public final String value;

    static {
        MicrodepositType microdepositType = new MicrodepositType("AMOUNTS", 0, "amounts");
        MicrodepositType microdepositType2 = new MicrodepositType("DESCRIPTOR_CODE", 1, "descriptor_code");
        MicrodepositType microdepositType3 = new MicrodepositType("UNKNOWN", 2, "unknown");
        UNKNOWN = microdepositType3;
        MicrodepositType[] microdepositTypeArr = {microdepositType, microdepositType2, microdepositType3};
        $VALUES = microdepositTypeArr;
        $ENTRIES = new EnumEntriesList(microdepositTypeArr);
    }

    public MicrodepositType(String str, int i, String str2) {
        this.value = str2;
    }

    public static MicrodepositType valueOf(String str) {
        return (MicrodepositType) Enum.valueOf(MicrodepositType.class, str);
    }

    public static MicrodepositType[] values() {
        return (MicrodepositType[]) $VALUES.clone();
    }
}
