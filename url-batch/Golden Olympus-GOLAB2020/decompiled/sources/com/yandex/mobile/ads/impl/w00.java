package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class w00 {

    /* renamed from: c, reason: collision with root package name */
    public static final w00 f33851c;

    /* renamed from: d, reason: collision with root package name */
    public static final w00 f33852d;

    /* renamed from: e, reason: collision with root package name */
    public static final w00 f33853e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ w00[] f33854f;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33855b;

    static {
        w00 w00Var = new w00(0, "AD", "ad");
        f33851c = w00Var;
        w00 w00Var2 = new w00(1, "PACK_SHOT", "pack_shot");
        f33852d = w00Var2;
        w00 w00Var3 = new w00(2, "CLOSE_DIALOG", "close_dialog");
        f33853e = w00Var3;
        w00[] w00VarArr = {w00Var, w00Var2, w00Var3};
        f33854f = w00VarArr;
        AbstractC1372b.a(w00VarArr);
    }

    private w00(int i4, String str, String str2) {
        this.f33855b = str2;
    }

    public static w00 valueOf(String str) {
        return (w00) Enum.valueOf(w00.class, str);
    }

    public static w00[] values() {
        return (w00[]) f33854f.clone();
    }

    @NotNull
    public final String a() {
        return this.f33855b;
    }
}
