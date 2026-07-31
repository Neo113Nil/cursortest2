package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ej0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f25321a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25322b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f25323c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f25324d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final f02 f25325e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f25326f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f25327g;

    public /* synthetic */ ej0(int i4, int i5, String str, String str2, int i6) {
        this(i4, i5, str, (i6 & 8) != 0 ? null : str2, null, true, null);
    }

    public final int a() {
        return this.f25322b;
    }

    public final boolean b() {
        return this.f25326f;
    }

    @Nullable
    public final String c() {
        return this.f25327g;
    }

    @Nullable
    public final String d() {
        return this.f25324d;
    }

    @Nullable
    public final f02 e() {
        return this.f25325e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej0)) {
            return false;
        }
        ej0 ej0Var = (ej0) obj;
        return this.f25321a == ej0Var.f25321a && this.f25322b == ej0Var.f25322b && Intrinsics.areEqual(this.f25323c, ej0Var.f25323c) && Intrinsics.areEqual(this.f25324d, ej0Var.f25324d) && Intrinsics.areEqual(this.f25325e, ej0Var.f25325e) && this.f25326f == ej0Var.f25326f && Intrinsics.areEqual(this.f25327g, ej0Var.f25327g);
    }

    @NotNull
    public final String f() {
        return this.f25323c;
    }

    public final int g() {
        return this.f25321a;
    }

    public final int hashCode() {
        int a4 = C1842c3.a(this.f25323c, sx1.a(this.f25322b, Integer.hashCode(this.f25321a) * 31, 31), 31);
        String str = this.f25324d;
        int hashCode = (a4 + (str == null ? 0 : str.hashCode())) * 31;
        f02 f02Var = this.f25325e;
        int a5 = C1965h6.a(this.f25326f, (hashCode + (f02Var == null ? 0 : f02Var.hashCode())) * 31, 31);
        String str2 = this.f25327g;
        return a5 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ImageValue(width=" + this.f25321a + ", height=" + this.f25322b + ", url=" + this.f25323c + ", sizeType=" + this.f25324d + ", smartCenterSettings=" + this.f25325e + ", preload=" + this.f25326f + ", preview=" + this.f25327g + ")";
    }

    public ej0(int i4, int i5, @NotNull String url, @Nullable String str, @Nullable f02 f02Var, boolean z4, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f25321a = i4;
        this.f25322b = i5;
        this.f25323c = url;
        this.f25324d = str;
        this.f25325e = f02Var;
        this.f25326f = z4;
        this.f25327g = str2;
    }
}
