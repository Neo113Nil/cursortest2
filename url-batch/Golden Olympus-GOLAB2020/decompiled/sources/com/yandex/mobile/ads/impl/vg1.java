package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class vg1 {

    /* renamed from: b, reason: collision with root package name */
    public static final vg1 f33619b;

    /* renamed from: c, reason: collision with root package name */
    public static final vg1 f33620c;

    /* renamed from: d, reason: collision with root package name */
    public static final vg1 f33621d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ vg1[] f33622e;

    static {
        vg1 vg1Var = new vg1(0, "SCREEN_ON");
        f33619b = vg1Var;
        vg1 vg1Var2 = new vg1(1, "SCREEN_OFF");
        f33620c = vg1Var2;
        vg1 vg1Var3 = new vg1(2, "USER_PRESENT");
        f33621d = vg1Var3;
        vg1[] vg1VarArr = {vg1Var, vg1Var2, vg1Var3};
        f33622e = vg1VarArr;
        AbstractC1372b.a(vg1VarArr);
    }

    private vg1(int i4, String str) {
    }

    public static vg1 valueOf(String str) {
        return (vg1) Enum.valueOf(vg1.class, str);
    }

    public static vg1[] values() {
        return (vg1[]) f33622e.clone();
    }
}
