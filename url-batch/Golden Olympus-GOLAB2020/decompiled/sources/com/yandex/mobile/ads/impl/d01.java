package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d01 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f24376c;

    /* renamed from: d, reason: collision with root package name */
    public static final d01 f24377d;

    /* renamed from: e, reason: collision with root package name */
    public static final d01 f24378e;

    /* renamed from: f, reason: collision with root package name */
    public static final d01 f24379f;

    /* renamed from: g, reason: collision with root package name */
    public static final d01 f24380g;

    /* renamed from: h, reason: collision with root package name */
    public static final d01 f24381h;

    /* renamed from: i, reason: collision with root package name */
    public static final d01 f24382i;

    /* renamed from: j, reason: collision with root package name */
    public static final d01 f24383j;

    /* renamed from: k, reason: collision with root package name */
    public static final d01 f24384k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ d01[] f24385l;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f24386b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    static {
        d01 d01Var = new d01(0, com.ironsource.jn.f16864a, com.ironsource.jn.f16864a);
        f24377d = d01Var;
        d01 d01Var2 = new d01(1, com.ironsource.jn.f16865b, com.ironsource.jn.f16865b);
        f24378e = d01Var2;
        d01 d01Var3 = new d01(2, "PUT", "PUT");
        f24379f = d01Var3;
        d01 d01Var4 = new d01(3, "DELETE", "DELETE");
        f24380g = d01Var4;
        d01 d01Var5 = new d01(4, "HEAD", "HEAD");
        f24381h = d01Var5;
        d01 d01Var6 = new d01(5, "OPTIONS", "OPTIONS");
        f24382i = d01Var6;
        d01 d01Var7 = new d01(6, "TRACE", "TRACE");
        f24383j = d01Var7;
        d01 d01Var8 = new d01(7, "PATCH", "PATCH");
        f24384k = d01Var8;
        d01[] d01VarArr = {d01Var, d01Var2, d01Var3, d01Var4, d01Var5, d01Var6, d01Var7, d01Var8};
        f24385l = d01VarArr;
        AbstractC1372b.a(d01VarArr);
        f24376c = new a(0);
    }

    private d01(int i4, String str, String str2) {
        this.f24386b = str2;
    }

    public static d01 valueOf(String str) {
        return (d01) Enum.valueOf(d01.class, str);
    }

    public static d01[] values() {
        return (d01[]) f24385l.clone();
    }

    @NotNull
    public final String a() {
        return this.f24386b;
    }
}
