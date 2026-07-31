package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ec, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1899ec {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final C1851cc f25184a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final C1851cc f25185b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25186c;

    public C1899ec(@Nullable C1851cc c1851cc, @Nullable C1851cc c1851cc2, boolean z4) {
        this.f25184a = c1851cc;
        this.f25185b = c1851cc2;
        this.f25186c = z4;
    }

    @Nullable
    public final C1851cc a() {
        return this.f25184a;
    }

    public final boolean b() {
        return this.f25186c;
    }

    @Nullable
    public final C1851cc c() {
        return this.f25185b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1899ec)) {
            return false;
        }
        C1899ec c1899ec = (C1899ec) obj;
        return Intrinsics.areEqual(this.f25184a, c1899ec.f25184a) && Intrinsics.areEqual(this.f25185b, c1899ec.f25185b) && this.f25186c == c1899ec.f25186c;
    }

    public final int hashCode() {
        C1851cc c1851cc = this.f25184a;
        int hashCode = (c1851cc == null ? 0 : c1851cc.hashCode()) * 31;
        C1851cc c1851cc2 = this.f25185b;
        return Boolean.hashCode(this.f25186c) + ((hashCode + (c1851cc2 != null ? c1851cc2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AdvertisingInfoHolder(gmsAdvertisingInfo=" + this.f25184a + ", hmsAdvertisingInfo=" + this.f25185b + ", gmsAdvertisingReset=" + this.f25186c + ")";
    }
}
