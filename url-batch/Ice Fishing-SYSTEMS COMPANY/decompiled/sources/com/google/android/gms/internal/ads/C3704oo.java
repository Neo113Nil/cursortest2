package com.google.android.gms.internal.ads;

import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.oo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3704oo {

    /* renamed from: a, reason: collision with root package name */
    public final long f33211a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33212b;

    public C3704oo(long j9, int i) {
        this.f33211a = j9;
        this.f33212b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3704oo) {
            C3704oo c3704oo = (C3704oo) obj;
            if (this.f33211a == c3704oo.f33211a && this.f33212b == c3704oo.f33212b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f33211a;
        return ((((int) ((j9 >>> 32) ^ j9)) ^ 1000003) * 1000003) ^ this.f33212b;
    }

    public final String toString() {
        long j9 = this.f33211a;
        int length = String.valueOf(j9).length();
        int i = this.f33212b;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i).length() + 1);
        com.anythink.basead.b.c.i.x(sb, "OnDeviceStorageKey{id=", j9, ", eventType=");
        return AbstractC5051n.e(i, "}", sb);
    }
}
