package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.d2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1865d2 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1865d2 f24400b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1865d2 f24401c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1865d2 f24402d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1865d2 f24403e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC1865d2[] f24404f;

    static {
        EnumC1865d2 enumC1865d2 = new EnumC1865d2(0, "PREROLL");
        f24400b = enumC1865d2;
        EnumC1865d2 enumC1865d22 = new EnumC1865d2(1, "MIDROLL");
        f24401c = enumC1865d22;
        EnumC1865d2 enumC1865d23 = new EnumC1865d2(2, "POSTROLL");
        f24402d = enumC1865d23;
        EnumC1865d2 enumC1865d24 = new EnumC1865d2(3, "STANDALONE");
        f24403e = enumC1865d24;
        EnumC1865d2[] enumC1865d2Arr = {enumC1865d2, enumC1865d22, enumC1865d23, enumC1865d24};
        f24404f = enumC1865d2Arr;
        AbstractC1372b.a(enumC1865d2Arr);
    }

    private EnumC1865d2(int i4, String str) {
    }

    public static EnumC1865d2 valueOf(String str) {
        return (EnumC1865d2) Enum.valueOf(EnumC1865d2.class, str);
    }

    public static EnumC1865d2[] values() {
        return (EnumC1865d2[]) f24404f.clone();
    }
}
