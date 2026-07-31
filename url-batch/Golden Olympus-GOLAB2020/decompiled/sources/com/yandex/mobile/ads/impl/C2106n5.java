package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.n5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2106n5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C2243t5> f29439a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29440b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29441c;

    public C2106n5(int i4, int i5, @NotNull List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f29439a = items;
        this.f29440b = i4;
        this.f29441c = i5;
    }

    public final int a() {
        return this.f29440b;
    }

    @NotNull
    public final List<C2243t5> b() {
        return this.f29439a;
    }

    public final int c() {
        return this.f29441c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2106n5)) {
            return false;
        }
        C2106n5 c2106n5 = (C2106n5) obj;
        return Intrinsics.areEqual(this.f29439a, c2106n5.f29439a) && this.f29440b == c2106n5.f29440b && this.f29441c == c2106n5.f29441c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29441c) + sx1.a(this.f29440b, this.f29439a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "AdPod(items=" + this.f29439a + ", closableAdPosition=" + this.f29440b + ", rewardAdPosition=" + this.f29441c + ")";
    }
}
