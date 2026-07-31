package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ab, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1802ab implements InterfaceC2143oj {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23195a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f23196b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f23197c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<String> f23198d;

    public C1802ab(@NotNull String actionType, @NotNull String adtuneUrl, @NotNull String optOutUrl, @NotNull ArrayList trackingUrls) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(adtuneUrl, "adtuneUrl");
        Intrinsics.checkNotNullParameter(optOutUrl, "optOutUrl");
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        this.f23195a = actionType;
        this.f23196b = adtuneUrl;
        this.f23197c = optOutUrl;
        this.f23198d = trackingUrls;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2237t
    @NotNull
    public final String a() {
        return this.f23195a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2143oj
    @NotNull
    public final List<String> b() {
        return this.f23198d;
    }

    @NotNull
    public final String c() {
        return this.f23196b;
    }

    @NotNull
    public final String d() {
        return this.f23197c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1802ab)) {
            return false;
        }
        C1802ab c1802ab = (C1802ab) obj;
        return Intrinsics.areEqual(this.f23195a, c1802ab.f23195a) && Intrinsics.areEqual(this.f23196b, c1802ab.f23196b) && Intrinsics.areEqual(this.f23197c, c1802ab.f23197c) && Intrinsics.areEqual(this.f23198d, c1802ab.f23198d);
    }

    public final int hashCode() {
        return this.f23198d.hashCode() + C1842c3.a(this.f23197c, C1842c3.a(this.f23196b, this.f23195a.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "AdtuneAction(actionType=" + this.f23195a + ", adtuneUrl=" + this.f23196b + ", optOutUrl=" + this.f23197c + ", trackingUrls=" + this.f23198d + ")";
    }
}
