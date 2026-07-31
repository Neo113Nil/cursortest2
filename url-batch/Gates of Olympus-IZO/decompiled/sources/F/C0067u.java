package F;

import H2.AbstractC0080b;
import b0.C0288u;

/* renamed from: F.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067u {

    /* renamed from: a, reason: collision with root package name */
    public final long f1390a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1391b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1392c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1393d;

    public C0067u(long j3, long j4, long j5, long j6) {
        this.f1390a = j3;
        this.f1391b = j4;
        this.f1392c = j5;
        this.f1393d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0067u)) {
            return false;
        }
        C0067u c0067u = (C0067u) obj;
        return C0288u.c(this.f1390a, c0067u.f1390a) && C0288u.c(this.f1391b, c0067u.f1391b) && C0288u.c(this.f1392c, c0067u.f1392c) && C0288u.c(this.f1393d, c0067u.f1393d);
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        return Long.hashCode(this.f1393d) + AbstractC0080b.d(AbstractC0080b.d(Long.hashCode(this.f1390a) * 31, 31, this.f1391b), 31, this.f1392c);
    }
}
