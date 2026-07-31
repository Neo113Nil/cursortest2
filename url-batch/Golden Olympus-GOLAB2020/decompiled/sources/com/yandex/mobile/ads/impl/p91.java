package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.appsflyer.AdRevenueScheme;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p91 {

    /* renamed from: c, reason: collision with root package name */
    public static final p91 f30362c;

    /* renamed from: d, reason: collision with root package name */
    public static final p91 f30363d;

    /* renamed from: e, reason: collision with root package name */
    public static final p91 f30364e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ p91[] f30365f;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f30366b;

    static {
        p91 p91Var = new p91(0, "AD", "ad");
        f30362c = p91Var;
        p91 p91Var2 = new p91(1, "BULK", "bulk");
        f30363d = p91Var2;
        p91 p91Var3 = new p91(2, "SLIDER", AdRevenueScheme.AD_UNIT);
        f30364e = p91Var3;
        p91[] p91VarArr = {p91Var, p91Var2, p91Var3};
        f30365f = p91VarArr;
        AbstractC1372b.a(p91VarArr);
    }

    private p91(int i4, String str, String str2) {
        this.f30366b = str2;
    }

    public static p91 valueOf(String str) {
        return (p91) Enum.valueOf(p91.class, str);
    }

    public static p91[] values() {
        return (p91[]) f30365f.clone();
    }

    @NotNull
    public final String a() {
        return this.f30366b;
    }
}
