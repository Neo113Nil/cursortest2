package com.yandex.mobile.ads.impl;

import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vd1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f33583a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33584b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final SSLSocketFactory f33585c;

    public vd1(int i4, int i5, @Nullable SSLSocketFactory sSLSocketFactory) {
        this.f33583a = i4;
        this.f33584b = i5;
        this.f33585c = sSLSocketFactory;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd1)) {
            return false;
        }
        vd1 vd1Var = (vd1) obj;
        return this.f33583a == vd1Var.f33583a && this.f33584b == vd1Var.f33584b && Intrinsics.areEqual(this.f33585c, vd1Var.f33585c);
    }

    public final int hashCode() {
        int a4 = sx1.a(this.f33584b, Integer.hashCode(this.f33583a) * 31, 31);
        SSLSocketFactory sSLSocketFactory = this.f33585c;
        return a4 + (sSLSocketFactory == null ? 0 : sSLSocketFactory.hashCode());
    }

    @NotNull
    public final String toString() {
        return "OkHttpConfiguration(connectionTimeoutMs=" + this.f33583a + ", readTimeoutMs=" + this.f33584b + ", sslSocketFactory=" + this.f33585c + ")";
    }
}
