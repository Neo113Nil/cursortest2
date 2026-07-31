package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t00 {

    /* renamed from: c, reason: collision with root package name */
    public static final t00 f32103c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ t00[] f32104d;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f32105b = "ad_pod";

    static {
        t00 t00Var = new t00();
        f32103c = t00Var;
        t00[] t00VarArr = {t00Var};
        f32104d = t00VarArr;
        AbstractC1372b.a(t00VarArr);
    }

    private t00() {
    }

    public static t00 valueOf(String str) {
        return (t00) Enum.valueOf(t00.class, str);
    }

    public static t00[] values() {
        return (t00[]) f32104d.clone();
    }

    @NotNull
    public final String a() {
        return this.f32105b;
    }
}
