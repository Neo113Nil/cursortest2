package com.squareup.cash.work.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ToastType {
    public static final /* synthetic */ ToastType[] $VALUES;
    public static final ToastType Info;
    public static final ToastType Success;

    static {
        ToastType toastType = new ToastType("Info", 0);
        Info = toastType;
        ToastType toastType2 = new ToastType("Success", 1);
        Success = toastType2;
        $VALUES = new ToastType[]{toastType, toastType2};
    }

    public static ToastType valueOf(String str) {
        return (ToastType) Enum.valueOf(ToastType.class, str);
    }

    public static ToastType[] values() {
        return (ToastType[]) $VALUES.clone();
    }
}
