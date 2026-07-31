package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dr0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final List<InterfaceC2237t> f24737a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final c80 f24738b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<String> f24739c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f24740d;

    /* renamed from: e, reason: collision with root package name */
    private final long f24741e;

    /* JADX WARN: Multi-variable type inference failed */
    public dr0(@Nullable List<? extends InterfaceC2237t> list, @Nullable c80 c80Var, @NotNull List<String> trackingUrls, @Nullable String str, long j4) {
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        this.f24737a = list;
        this.f24738b = c80Var;
        this.f24739c = trackingUrls;
        this.f24740d = str;
        this.f24741e = j4;
    }

    @Nullable
    public final List<InterfaceC2237t> a() {
        return this.f24737a;
    }

    public final long b() {
        return this.f24741e;
    }

    @Nullable
    public final c80 c() {
        return this.f24738b;
    }

    @NotNull
    public final List<String> d() {
        return this.f24739c;
    }

    @Nullable
    public final String e() {
        return this.f24740d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr0)) {
            return false;
        }
        dr0 dr0Var = (dr0) obj;
        return Intrinsics.areEqual(this.f24737a, dr0Var.f24737a) && Intrinsics.areEqual(this.f24738b, dr0Var.f24738b) && Intrinsics.areEqual(this.f24739c, dr0Var.f24739c) && Intrinsics.areEqual(this.f24740d, dr0Var.f24740d) && this.f24741e == dr0Var.f24741e;
    }

    public final int hashCode() {
        List<InterfaceC2237t> list = this.f24737a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        c80 c80Var = this.f24738b;
        int a4 = C2039k9.a(this.f24739c, (hashCode + (c80Var == null ? 0 : c80Var.hashCode())) * 31, 31);
        String str = this.f24740d;
        return Long.hashCode(this.f24741e) + ((a4 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Link(actions=" + this.f24737a + ", falseClick=" + this.f24738b + ", trackingUrls=" + this.f24739c + ", url=" + this.f24740d + ", clickableDelay=" + this.f24741e + ")";
    }
}
