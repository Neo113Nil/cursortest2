package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q81 {

    /* renamed from: c, reason: collision with root package name */
    public static final q81 f30707c;

    /* renamed from: d, reason: collision with root package name */
    public static final q81 f30708d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ q81[] f30709e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f30710b;

    static {
        q81 q81Var = new q81(0, "LoadingOnShow", "loading_on_show");
        f30707c = q81Var;
        q81 q81Var2 = new q81(1, "LoadingOnBack", "loading_on_back");
        f30708d = q81Var2;
        q81[] q81VarArr = {q81Var, q81Var2};
        f30709e = q81VarArr;
        AbstractC1372b.a(q81VarArr);
    }

    private q81(int i4, String str, String str2) {
        this.f30710b = str2;
    }

    public static q81 valueOf(String str) {
        return (q81) Enum.valueOf(q81.class, str);
    }

    public static q81[] values() {
        return (q81[]) f30709e.clone();
    }

    @NotNull
    public final String a() {
        return this.f30710b;
    }
}
