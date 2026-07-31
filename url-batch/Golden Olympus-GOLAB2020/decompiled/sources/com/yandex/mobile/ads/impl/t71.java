package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t71 {

    /* renamed from: c, reason: collision with root package name */
    public static final t71 f32234c;

    /* renamed from: d, reason: collision with root package name */
    public static final t71 f32235d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ t71[] f32236e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f32237b;

    static {
        t71 t71Var = new t71(0, com.ironsource.mediationsdk.l.f17632f, "custom");
        f32234c = t71Var;
        t71 t71Var2 = new t71(1, "TEMPLATE", "template");
        f32235d = t71Var2;
        t71[] t71VarArr = {t71Var, t71Var2};
        f32236e = t71VarArr;
        AbstractC1372b.a(t71VarArr);
    }

    private t71(int i4, String str, String str2) {
        this.f32237b = str2;
    }

    public static t71 valueOf(String str) {
        return (t71) Enum.valueOf(t71.class, str);
    }

    public static t71[] values() {
        return (t71[]) f32236e.clone();
    }

    @NotNull
    public final String a() {
        return this.f32237b;
    }
}
