package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.c4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1843c4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f24038a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24039b;

    public C1843c4(int i4, int i5) {
        this.f24038a = i4;
        this.f24039b = i5;
    }

    public final int a() {
        return this.f24038a;
    }

    public final int b() {
        return this.f24039b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1843c4)) {
            return false;
        }
        C1843c4 c1843c4 = (C1843c4) obj;
        return this.f24038a == c1843c4.f24038a && this.f24039b == c1843c4.f24039b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24039b) + (Integer.hashCode(this.f24038a) * 31);
    }

    @NotNull
    public final String toString() {
        return "AdInfo(adGroupIndex=" + this.f24038a + ", adIndexInAdGroup=" + this.f24039b + ")";
    }
}
