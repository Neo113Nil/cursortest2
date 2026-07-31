package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.j6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2012j6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f27482a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f27483b;

    public C2012j6(boolean z4, int i4) {
        this.f27482a = i4;
        this.f27483b = z4;
    }

    public final boolean a() {
        return this.f27483b;
    }

    public final int b() {
        return this.f27482a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2012j6)) {
            return false;
        }
        C2012j6 c2012j6 = (C2012j6) obj;
        return this.f27482a == c2012j6.f27482a && this.f27483b == c2012j6.f27483b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27483b) + (Integer.hashCode(this.f27482a) * 31);
    }

    @NotNull
    public final String toString() {
        return "AdQualityVerificationNetworkConfiguration(usagePercent=" + this.f27482a + ", disabled=" + this.f27483b + ")";
    }
}
