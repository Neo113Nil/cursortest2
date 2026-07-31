package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.ironsource.C1463f4;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class bu1 {

    /* renamed from: c, reason: collision with root package name */
    public static final bu1 f23918c;

    /* renamed from: d, reason: collision with root package name */
    public static final bu1 f23919d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ bu1[] f23920e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f23921b;

    static {
        bu1 bu1Var = new bu1(0, "CONFIGURATION_FAILED", "configuration_failed");
        f23918c = bu1Var;
        bu1 bu1Var2 = new bu1(1, "TIMEOUT", C1463f4.f16211f);
        f23919d = bu1Var2;
        bu1[] bu1VarArr = {bu1Var, bu1Var2};
        f23920e = bu1VarArr;
        AbstractC1372b.a(bu1VarArr);
    }

    private bu1(int i4, String str, String str2) {
        this.f23921b = str2;
    }

    public static bu1 valueOf(String str) {
        return (bu1) Enum.valueOf(bu1.class, str);
    }

    public static bu1[] values() {
        return (bu1[]) f23920e.clone();
    }

    @NotNull
    public final String a() {
        return this.f23921b;
    }
}
