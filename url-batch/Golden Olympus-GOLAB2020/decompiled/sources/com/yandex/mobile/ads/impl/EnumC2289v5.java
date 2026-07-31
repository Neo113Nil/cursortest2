package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.v5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2289v5 {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2289v5 f33496c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC2289v5[] f33497d;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33498b;

    static {
        EnumC2289v5 enumC2289v5 = new EnumC2289v5(0, "AUTOMATIC", "automatic");
        EnumC2289v5 enumC2289v52 = new EnumC2289v5(1, "MANUAL", "manual");
        f33496c = enumC2289v52;
        EnumC2289v5[] enumC2289v5Arr = {enumC2289v5, enumC2289v52};
        f33497d = enumC2289v5Arr;
        AbstractC1372b.a(enumC2289v5Arr);
    }

    private EnumC2289v5(int i4, String str, String str2) {
        this.f33498b = str2;
    }

    public static EnumC2289v5 valueOf(String str) {
        return (EnumC2289v5) Enum.valueOf(EnumC2289v5.class, str);
    }

    public static EnumC2289v5[] values() {
        return (EnumC2289v5[]) f33497d.clone();
    }

    @NotNull
    public final String a() {
        return this.f33498b;
    }
}
