package com.withpersona.sdk2.inquiry.permissions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class PermissionResult {
    public static final /* synthetic */ PermissionResult[] $VALUES;
    public static final PermissionResult PermissionGranted;
    public static final PermissionResult PermissionRejected;
    public static final PermissionResult SettingsLaunched;

    static {
        PermissionResult permissionResult = new PermissionResult("PermissionGranted", 0);
        PermissionGranted = permissionResult;
        PermissionResult permissionResult2 = new PermissionResult("PermissionRejected", 1);
        PermissionRejected = permissionResult2;
        PermissionResult permissionResult3 = new PermissionResult("SettingsLaunched", 2);
        SettingsLaunched = permissionResult3;
        $VALUES = new PermissionResult[]{permissionResult, permissionResult2, permissionResult3};
    }

    public static PermissionResult valueOf(String str) {
        return (PermissionResult) Enum.valueOf(PermissionResult.class, str);
    }

    public static PermissionResult[] values() {
        return (PermissionResult[]) $VALUES.clone();
    }
}
