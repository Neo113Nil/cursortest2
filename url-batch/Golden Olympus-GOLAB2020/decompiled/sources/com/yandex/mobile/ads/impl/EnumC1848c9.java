package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.c9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1848c9 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1848c9 f24098b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1848c9 f24099c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1848c9 f24100d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC1848c9[] f24101e;

    static {
        EnumC1848c9 enumC1848c9 = new EnumC1848c9(0, "SINGLE");
        f24098b = enumC1848c9;
        EnumC1848c9 enumC1848c92 = new EnumC1848c9(1, "BLOCK");
        f24099c = enumC1848c92;
        EnumC1848c9 enumC1848c93 = new EnumC1848c9(2, "BLOCK_INNER_CREATIVE");
        f24100d = enumC1848c93;
        EnumC1848c9[] enumC1848c9Arr = {enumC1848c9, enumC1848c92, enumC1848c93};
        f24101e = enumC1848c9Arr;
        AbstractC1372b.a(enumC1848c9Arr);
    }

    private EnumC1848c9(int i4, String str) {
    }

    public static EnumC1848c9 valueOf(String str) {
        return (EnumC1848c9) Enum.valueOf(EnumC1848c9.class, str);
    }

    public static EnumC1848c9[] values() {
        return (EnumC1848c9[]) f24101e.clone();
    }
}
