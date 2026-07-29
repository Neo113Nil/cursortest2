package com.tapjoy.internal;

/* loaded from: classes2.dex */
public final class gj {

    /* renamed from: a, reason: collision with root package name */
    public static final gj f8200a = new gj(0, 0, 0, 0.0d);

    /* renamed from: b, reason: collision with root package name */
    public final long f8201b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8202c;

    /* renamed from: d, reason: collision with root package name */
    public final double f8203d;
    public long e;
    private final long f;

    public gj(long j, long j2, long j3, double d2) {
        this.f = j;
        this.f8201b = j2;
        this.f8202c = j3;
        this.f8203d = d2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gj gjVar = (gj) obj;
        return this.f == gjVar.f && this.f8201b == gjVar.f8201b && this.f8202c == gjVar.f8202c && this.f8203d == gjVar.f8203d && this.e == gjVar.e;
    }
}
