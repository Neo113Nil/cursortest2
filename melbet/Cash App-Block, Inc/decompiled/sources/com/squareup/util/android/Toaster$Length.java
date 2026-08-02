package com.squareup.util.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Toaster$Length {
    public static final /* synthetic */ Toaster$Length[] $VALUES;
    public static final Toaster$Length LONG;
    public static final Toaster$Length SHORT;

    static {
        Toaster$Length toaster$Length = new Toaster$Length("SHORT", 0);
        SHORT = toaster$Length;
        Toaster$Length toaster$Length2 = new Toaster$Length("LONG", 1);
        LONG = toaster$Length2;
        $VALUES = new Toaster$Length[]{toaster$Length, toaster$Length2};
    }

    public static Toaster$Length valueOf(String str) {
        return (Toaster$Length) Enum.valueOf(Toaster$Length.class, str);
    }

    public static Toaster$Length[] values() {
        return (Toaster$Length[]) $VALUES.clone();
    }
}
