package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.b4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1819b4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f23586a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23587b;

    public C1819b4(int i4, int i5) {
        this.f23586a = i4;
        this.f23587b = i5;
    }

    public final int a() {
        return this.f23586a;
    }

    public final int b() {
        return this.f23587b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1819b4)) {
            return false;
        }
        C1819b4 c1819b4 = (C1819b4) obj;
        return this.f23586a == c1819b4.f23586a && this.f23587b == c1819b4.f23587b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23587b) + (Integer.hashCode(this.f23586a) * 31);
    }

    @NotNull
    public final String toString() {
        return "AdInfo(adGroupIndex=" + this.f23586a + ", adIndexInAdGroup=" + this.f23587b + ")";
    }
}
