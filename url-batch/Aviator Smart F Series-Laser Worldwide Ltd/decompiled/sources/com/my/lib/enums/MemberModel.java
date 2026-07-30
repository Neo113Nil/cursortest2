package com.my.lib.enums;

import a6.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MemberModel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MemberModel[] $VALUES;
    private final int value;
    public static final MemberModel FREE = new MemberModel("FREE", 0, 0);
    public static final MemberModel VIP = new MemberModel("VIP", 1, 1);
    public static final MemberModel S_VIP = new MemberModel("S_VIP", 2, 2);

    private static final /* synthetic */ MemberModel[] $values() {
        return new MemberModel[]{FREE, VIP, S_VIP};
    }

    static {
        MemberModel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.enumEntries($values);
    }

    private MemberModel(String str, int i8, int i9) {
        this.value = i9;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static MemberModel valueOf(String str) {
        return (MemberModel) Enum.valueOf(MemberModel.class, str);
    }

    public static MemberModel[] values() {
        return (MemberModel[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
