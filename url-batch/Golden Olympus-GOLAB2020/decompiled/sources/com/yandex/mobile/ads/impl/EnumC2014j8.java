package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.j8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2014j8 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2014j8 f27558b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2014j8 f27559c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2014j8 f27560d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2014j8 f27561e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2014j8 f27562f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC2014j8[] f27563g;

    static {
        EnumC2014j8 enumC2014j8 = new EnumC2014j8(0, "INITIAL");
        f27558b = enumC2014j8;
        EnumC2014j8 enumC2014j82 = new EnumC2014j8(1, "PREPARED");
        f27559c = enumC2014j82;
        EnumC2014j8 enumC2014j83 = new EnumC2014j8(2, "STARTED");
        f27560d = enumC2014j83;
        EnumC2014j8 enumC2014j84 = new EnumC2014j8(3, "ENDED");
        f27561e = enumC2014j84;
        EnumC2014j8 enumC2014j85 = new EnumC2014j8(4, "ERROR");
        f27562f = enumC2014j85;
        EnumC2014j8[] enumC2014j8Arr = {enumC2014j8, enumC2014j82, enumC2014j83, enumC2014j84, enumC2014j85};
        f27563g = enumC2014j8Arr;
        AbstractC1372b.a(enumC2014j8Arr);
    }

    private EnumC2014j8(int i4, String str) {
    }

    public static EnumC2014j8 valueOf(String str) {
        return (EnumC2014j8) Enum.valueOf(EnumC2014j8.class, str);
    }

    public static EnumC2014j8[] values() {
        return (EnumC2014j8[]) f27563g.clone();
    }
}
