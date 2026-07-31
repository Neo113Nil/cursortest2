package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.uf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2276uf<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f33075a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33076b;

    /* renamed from: c, reason: collision with root package name */
    private final T f33077c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final dr0 f33078d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f33079e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f33080f;

    public C2276uf(@NotNull String name, @NotNull String type, T t4, @Nullable dr0 dr0Var, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f33075a = name;
        this.f33076b = type;
        this.f33077c = t4;
        this.f33078d = dr0Var;
        this.f33079e = z4;
        this.f33080f = z5;
    }

    public static C2276uf a(C2276uf c2276uf, mw0 mw0Var) {
        String name = c2276uf.f33075a;
        String type = c2276uf.f33076b;
        dr0 dr0Var = c2276uf.f33078d;
        boolean z4 = c2276uf.f33079e;
        boolean z5 = c2276uf.f33080f;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new C2276uf(name, type, mw0Var, dr0Var, z4, z5);
    }

    @NotNull
    public final String b() {
        return this.f33075a;
    }

    @NotNull
    public final String c() {
        return this.f33076b;
    }

    public final T d() {
        return this.f33077c;
    }

    public final boolean e() {
        return this.f33079e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2276uf)) {
            return false;
        }
        C2276uf c2276uf = (C2276uf) obj;
        return Intrinsics.areEqual(this.f33075a, c2276uf.f33075a) && Intrinsics.areEqual(this.f33076b, c2276uf.f33076b) && Intrinsics.areEqual(this.f33077c, c2276uf.f33077c) && Intrinsics.areEqual(this.f33078d, c2276uf.f33078d) && this.f33079e == c2276uf.f33079e && this.f33080f == c2276uf.f33080f;
    }

    public final boolean f() {
        return this.f33080f;
    }

    public final int hashCode() {
        int a4 = C1842c3.a(this.f33076b, this.f33075a.hashCode() * 31, 31);
        T t4 = this.f33077c;
        int hashCode = (a4 + (t4 == null ? 0 : t4.hashCode())) * 31;
        dr0 dr0Var = this.f33078d;
        return Boolean.hashCode(this.f33080f) + C1965h6.a(this.f33079e, (hashCode + (dr0Var != null ? dr0Var.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "Asset(name=" + this.f33075a + ", type=" + this.f33076b + ", value=" + this.f33077c + ", link=" + this.f33078d + ", isClickable=" + this.f33079e + ", isRequired=" + this.f33080f + ")";
    }

    @Nullable
    public final dr0 a() {
        return this.f33078d;
    }
}
