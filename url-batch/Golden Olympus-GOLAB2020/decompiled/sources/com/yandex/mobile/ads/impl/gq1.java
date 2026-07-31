package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class gq1 {

    /* renamed from: c, reason: collision with root package name */
    public static final gq1 f26273c;

    /* renamed from: d, reason: collision with root package name */
    public static final gq1 f26274d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ gq1[] f26275e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f26276b;

    static {
        gq1 gq1Var = new gq1(0, "LIGHT", "light");
        f26273c = gq1Var;
        gq1 gq1Var2 = new gq1(1, "DARK", "dark");
        f26274d = gq1Var2;
        gq1[] gq1VarArr = {gq1Var, gq1Var2};
        f26275e = gq1VarArr;
        AbstractC1372b.a(gq1VarArr);
    }

    private gq1(int i4, String str, String str2) {
        this.f26276b = str2;
    }

    public static gq1 valueOf(String str) {
        return (gq1) Enum.valueOf(gq1.class, str);
    }

    public static gq1[] values() {
        return (gq1[]) f26275e.clone();
    }

    @NotNull
    public final String a() {
        return this.f26276b;
    }
}
