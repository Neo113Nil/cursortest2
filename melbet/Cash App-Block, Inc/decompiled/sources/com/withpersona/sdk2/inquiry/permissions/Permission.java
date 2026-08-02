package com.withpersona.sdk2.inquiry.permissions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class Permission {
    public static final /* synthetic */ Permission[] $VALUES;
    public static final Permission Camera;
    public static final Permission PreciseLocation;
    public static final Permission RecordAudio;
    public static final Permission RoughLocation;

    static {
        Permission permission = new Permission("Camera", 0);
        Camera = permission;
        Permission permission2 = new Permission("RecordAudio", 1);
        RecordAudio = permission2;
        Permission permission3 = new Permission("RoughLocation", 2);
        RoughLocation = permission3;
        Permission permission4 = new Permission("PreciseLocation", 3);
        PreciseLocation = permission4;
        $VALUES = new Permission[]{permission, permission2, permission3, permission4};
    }

    public static Permission valueOf(String str) {
        return (Permission) Enum.valueOf(Permission.class, str);
    }

    public static Permission[] values() {
        return (Permission[]) $VALUES.clone();
    }
}
