package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.r8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2200r8 {

    /* renamed from: a, reason: collision with root package name */
    private final int f31070a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31071b;

    public C2200r8(int i4, int i5) {
        this.f31070a = i4;
        this.f31071b = i5;
    }

    public final int a() {
        return this.f31071b;
    }

    public final int b() {
        return this.f31070a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2200r8)) {
            return false;
        }
        C2200r8 c2200r8 = (C2200r8) obj;
        return this.f31070a == c2200r8.f31070a && this.f31071b == c2200r8.f31071b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31071b) + (Integer.hashCode(this.f31070a) * 31);
    }

    @NotNull
    public final String toString() {
        return "AdSize(width=" + this.f31070a + ", height=" + this.f31071b + ")";
    }
}
