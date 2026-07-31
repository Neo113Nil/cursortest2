package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rj1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f31244a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f31245b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final Map<String, Object> f31246c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final Integer f31247d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final my f31248e;

    public rj1(@NotNull String packageName, @NotNull String url, @Nullable LinkedHashMap linkedHashMap, @Nullable Integer num, @Nullable my myVar) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f31244a = packageName;
        this.f31245b = url;
        this.f31246c = linkedHashMap;
        this.f31247d = num;
        this.f31248e = myVar;
    }

    @Nullable
    public final Map<String, Object> a() {
        return this.f31246c;
    }

    @Nullable
    public final Integer b() {
        return this.f31247d;
    }

    @Nullable
    public final my c() {
        return this.f31248e;
    }

    @NotNull
    public final String d() {
        return this.f31244a;
    }

    @NotNull
    public final String e() {
        return this.f31245b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj1)) {
            return false;
        }
        rj1 rj1Var = (rj1) obj;
        return Intrinsics.areEqual(this.f31244a, rj1Var.f31244a) && Intrinsics.areEqual(this.f31245b, rj1Var.f31245b) && Intrinsics.areEqual(this.f31246c, rj1Var.f31246c) && Intrinsics.areEqual(this.f31247d, rj1Var.f31247d) && this.f31248e == rj1Var.f31248e;
    }

    public final int hashCode() {
        int a4 = C1842c3.a(this.f31245b, this.f31244a.hashCode() * 31, 31);
        Map<String, Object> map = this.f31246c;
        int hashCode = (a4 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.f31247d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        my myVar = this.f31248e;
        return hashCode2 + (myVar != null ? myVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PreferredPackage(packageName=" + this.f31244a + ", url=" + this.f31245b + ", extras=" + this.f31246c + ", flags=" + this.f31247d + ", launchMode=" + this.f31248e + ")";
    }
}
