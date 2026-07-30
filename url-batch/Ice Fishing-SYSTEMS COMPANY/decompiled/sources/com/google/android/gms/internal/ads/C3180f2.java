package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3180f2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f30578a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30579b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30580c;

    public C3180f2(int i, long j9, long j10) {
        PA.n(j9 < j10);
        this.f30578a = j9;
        this.f30579b = j10;
        this.f30580c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3180f2.class == obj.getClass()) {
            C3180f2 c3180f2 = (C3180f2) obj;
            if (this.f30578a == c3180f2.f30578a && this.f30579b == c3180f2.f30579b && this.f30580c == c3180f2.f30580c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f30578a), Long.valueOf(this.f30579b), Integer.valueOf(this.f30580c));
    }

    public final String toString() {
        String str = AbstractC3548lu.f32613a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f30578a + ", endTimeMs=" + this.f30579b + ", speedDivisor=" + this.f30580c;
    }
}
