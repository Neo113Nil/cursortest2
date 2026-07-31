package r;

import t0.InterfaceC0914w;

/* renamed from: r.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814k extends U.k implements InterfaceC0914w {

    /* renamed from: q, reason: collision with root package name */
    public float f7066q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7067r;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (M0.i.a(r5, 0) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
    
        if (M0.i.a(r5, 0) == false) goto L53;
     */
    @Override // t0.InterfaceC0914w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r0.B b(t0.O o3, r0.z zVar, long j3) {
        long v0;
        if (this.f7067r) {
            v0 = v0(j3, true);
            if (M0.i.a(v0, 0L)) {
                v0 = w0(j3, true);
                if (M0.i.a(v0, 0L)) {
                    v0 = x0(j3, true);
                    if (M0.i.a(v0, 0L)) {
                        v0 = y0(j3, true);
                        if (M0.i.a(v0, 0L)) {
                            v0 = v0(j3, false);
                            if (M0.i.a(v0, 0L)) {
                                v0 = w0(j3, false);
                                if (M0.i.a(v0, 0L)) {
                                    v0 = x0(j3, false);
                                    if (M0.i.a(v0, 0L)) {
                                        v0 = y0(j3, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            v0 = w0(j3, true);
            if (M0.i.a(v0, 0L)) {
                v0 = v0(j3, true);
                if (M0.i.a(v0, 0L)) {
                    v0 = y0(j3, true);
                    if (M0.i.a(v0, 0L)) {
                        v0 = x0(j3, true);
                        if (M0.i.a(v0, 0L)) {
                            v0 = w0(j3, false);
                            if (M0.i.a(v0, 0L)) {
                                v0 = v0(j3, false);
                                if (M0.i.a(v0, 0L)) {
                                    v0 = y0(j3, false);
                                    if (M0.i.a(v0, 0L)) {
                                        v0 = x0(j3, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!M0.i.a(v0, 0L)) {
            int i3 = (int) (v0 >> 32);
            int i4 = (int) (4294967295L & v0);
            if (i3 < 0 || i4 < 0) {
                M1.B.O("width(" + i3 + ") and height(" + i4 + ") must be >= 0");
                throw null;
            }
            j3 = I2.l.s(i3, i3, i4, i4);
        }
        r0.H b2 = zVar.b(j3);
        return o3.Y(b2.f7114d, b2.f7115e, M1.v.f2804d, new Y.g(b2, 3));
    }

    public final long v0(long j3, boolean z3) {
        int round;
        int g3 = M0.a.g(j3);
        if (g3 == Integer.MAX_VALUE || (round = Math.round(g3 * this.f7066q)) <= 0) {
            return 0L;
        }
        long e3 = I2.l.e(round, g3);
        if (!z3 || I2.l.E(j3, e3)) {
            return e3;
        }
        return 0L;
    }

    public final long w0(long j3, boolean z3) {
        int round;
        int h3 = M0.a.h(j3);
        if (h3 == Integer.MAX_VALUE || (round = Math.round(h3 / this.f7066q)) <= 0) {
            return 0L;
        }
        long e3 = I2.l.e(h3, round);
        if (!z3 || I2.l.E(j3, e3)) {
            return e3;
        }
        return 0L;
    }

    public final long x0(long j3, boolean z3) {
        int i3 = M0.a.i(j3);
        int round = Math.round(i3 * this.f7066q);
        if (round <= 0) {
            return 0L;
        }
        long e3 = I2.l.e(round, i3);
        if (!z3 || I2.l.E(j3, e3)) {
            return e3;
        }
        return 0L;
    }

    public final long y0(long j3, boolean z3) {
        int j4 = M0.a.j(j3);
        int round = Math.round(j4 / this.f7066q);
        if (round <= 0) {
            return 0L;
        }
        long e3 = I2.l.e(j4, round);
        if (!z3 || I2.l.E(j3, e3)) {
            return e3;
        }
        return 0L;
    }
}
