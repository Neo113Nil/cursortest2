package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.w6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2313w6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f33936a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33937b;

    public C2313w6(boolean z4, int i4) {
        this.f33936a = i4;
        this.f33937b = z4;
    }

    public final boolean a() {
        return this.f33937b;
    }

    public final int b() {
        return this.f33936a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2313w6)) {
            return false;
        }
        C2313w6 c2313w6 = (C2313w6) obj;
        return this.f33936a == c2313w6.f33936a && this.f33937b == c2313w6.f33937b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33937b) + (Integer.hashCode(this.f33936a) * 31);
    }

    @NotNull
    public final String toString() {
        return "AdQualityVerifierNetworkConfiguration(usagePercent=" + this.f33936a + ", disabled=" + this.f33937b + ")";
    }
}
