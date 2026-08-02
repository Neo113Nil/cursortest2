package com.withpersona.sdk2.inquiry.governmentid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class IdIcon {
    public static final /* synthetic */ IdIcon[] $VALUES;
    public static final IdIcon Card;
    public static final IdIcon Flag;
    public static final IdIcon House;
    public static final IdIcon World;

    static {
        IdIcon idIcon = new IdIcon("World", 0);
        World = idIcon;
        IdIcon idIcon2 = new IdIcon("Card", 1);
        Card = idIcon2;
        IdIcon idIcon3 = new IdIcon("Flag", 2);
        Flag = idIcon3;
        IdIcon idIcon4 = new IdIcon("House", 3);
        House = idIcon4;
        $VALUES = new IdIcon[]{idIcon, idIcon2, idIcon3, idIcon4};
    }

    public static IdIcon valueOf(String str) {
        return (IdIcon) Enum.valueOf(IdIcon.class, str);
    }

    public static IdIcon[] values() {
        return (IdIcon[]) $VALUES.clone();
    }
}
