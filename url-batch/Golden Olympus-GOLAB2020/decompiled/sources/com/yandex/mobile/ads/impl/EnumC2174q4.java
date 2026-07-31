package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.q4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2174q4 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2174q4 f30654b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2174q4 f30655c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2174q4 f30656d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2174q4 f30657e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2174q4 f30658f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC2174q4[] f30659g;

    static {
        EnumC2174q4 enumC2174q4 = new EnumC2174q4(0, "CANCELLED");
        f30654b = enumC2174q4;
        EnumC2174q4 enumC2174q42 = new EnumC2174q4(1, "NOT_STARTED");
        f30655c = enumC2174q42;
        EnumC2174q4 enumC2174q43 = new EnumC2174q4(2, "LOADING");
        f30656d = enumC2174q43;
        EnumC2174q4 enumC2174q44 = new EnumC2174q4(3, "SUCCESSFULLY_LOADED");
        f30657e = enumC2174q44;
        EnumC2174q4 enumC2174q45 = new EnumC2174q4(4, "ERRONEOUSLY_LOADED");
        f30658f = enumC2174q45;
        EnumC2174q4[] enumC2174q4Arr = {enumC2174q4, enumC2174q42, enumC2174q43, enumC2174q44, enumC2174q45};
        f30659g = enumC2174q4Arr;
        AbstractC1372b.a(enumC2174q4Arr);
    }

    private EnumC2174q4(int i4, String str) {
    }

    public static EnumC2174q4 valueOf(String str) {
        return (EnumC2174q4) Enum.valueOf(EnumC2174q4.class, str);
    }

    public static EnumC2174q4[] values() {
        return (EnumC2174q4[]) f30659g.clone();
    }
}
