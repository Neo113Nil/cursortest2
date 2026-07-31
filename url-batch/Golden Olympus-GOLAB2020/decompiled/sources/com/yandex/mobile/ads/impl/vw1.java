package com.yandex.mobile.ads.impl;

import com.ironsource.b9;

/* loaded from: classes3.dex */
public final class vw1 {

    /* renamed from: c, reason: collision with root package name */
    public static final vw1 f33814c = new vw1(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f33815a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33816b;

    public vw1(long j4, long j5) {
        this.f33815a = j4;
        this.f33816b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vw1.class == obj.getClass()) {
            vw1 vw1Var = (vw1) obj;
            if (this.f33815a == vw1Var.f33815a && this.f33816b == vw1Var.f33816b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f33815a) * 31) + ((int) this.f33816b);
    }

    public final String toString() {
        return "[timeUs=" + this.f33815a + ", position=" + this.f33816b + b9.i.f15552e;
    }
}
