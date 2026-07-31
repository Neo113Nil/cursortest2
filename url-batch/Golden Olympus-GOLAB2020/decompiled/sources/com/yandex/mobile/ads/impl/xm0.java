package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xm0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f34618c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final xm0 f34619d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ xm0[] f34620e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f34621b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    static {
        xm0 xm0Var = new xm0(0, "DESIGN_V1", "design_v1");
        xm0[] xm0VarArr = {xm0Var, new xm0(1, "DESIGN_V2", "instream_design_v2")};
        f34620e = xm0VarArr;
        AbstractC1372b.a(xm0VarArr);
        f34618c = new a(0);
        f34619d = xm0Var;
    }

    private xm0(int i4, String str, String str2) {
        this.f34621b = str2;
    }

    public static xm0 valueOf(String str) {
        return (xm0) Enum.valueOf(xm0.class, str);
    }

    public static xm0[] values() {
        return (xm0[]) f34620e.clone();
    }

    @NotNull
    public final String b() {
        return this.f34621b;
    }
}
