package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.wi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2325wi {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f34073c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2325wi f34074d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC2325wi[] f34075e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f34076b;

    /* renamed from: com.yandex.mobile.ads.impl.wi$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    static {
        EnumC2325wi enumC2325wi = new EnumC2325wi(0, "CONSTANT", "constant");
        EnumC2325wi enumC2325wi2 = new EnumC2325wi(1, "RATIO", "ratio");
        EnumC2325wi enumC2325wi3 = new EnumC2325wi(2, "SCREEN_BASED", "screen_based");
        EnumC2325wi enumC2325wi4 = new EnumC2325wi(3, "SCREEN_ORIENTATION_BASED", "screen_orientation_based");
        f34074d = enumC2325wi4;
        EnumC2325wi[] enumC2325wiArr = {enumC2325wi, enumC2325wi2, enumC2325wi3, enumC2325wi4, new EnumC2325wi(4, "MEDIATION", "mediation")};
        f34075e = enumC2325wiArr;
        AbstractC1372b.a(enumC2325wiArr);
        f34073c = new a(0);
    }

    private EnumC2325wi(int i4, String str, String str2) {
        this.f34076b = str2;
    }

    public static EnumC2325wi valueOf(String str) {
        return (EnumC2325wi) Enum.valueOf(EnumC2325wi.class, str);
    }

    public static EnumC2325wi[] values() {
        return (EnumC2325wi[]) f34075e.clone();
    }

    @NotNull
    public final String a() {
        return this.f34076b;
    }
}
