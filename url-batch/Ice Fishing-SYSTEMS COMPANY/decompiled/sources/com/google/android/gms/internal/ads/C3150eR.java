package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3150eR {

    /* renamed from: a, reason: collision with root package name */
    public final long f30434a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30435b;

    public C3150eR(long j9, long j10) {
        this.f30434a = j9;
        this.f30435b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3150eR)) {
            return false;
        }
        C3150eR c3150eR = (C3150eR) obj;
        return this.f30434a == c3150eR.f30434a && this.f30435b == c3150eR.f30435b;
    }

    public final int hashCode() {
        return (((int) this.f30434a) * 31) + ((int) this.f30435b);
    }
}
