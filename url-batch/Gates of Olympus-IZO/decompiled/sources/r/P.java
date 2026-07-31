package r;

import e2.AbstractC0381e;
import t0.InterfaceC0914w;

/* loaded from: classes.dex */
public final class P extends U.k implements InterfaceC0914w {

    /* renamed from: q, reason: collision with root package name */
    public float f7017q;

    /* renamed from: r, reason: collision with root package name */
    public float f7018r;

    /* renamed from: s, reason: collision with root package name */
    public float f7019s;

    /* renamed from: t, reason: collision with root package name */
    public float f7020t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7021u;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    @Override // t0.InterfaceC0914w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r0.B b(t0.O o3, r0.z zVar, long j3) {
        int i3;
        int i4;
        int i5;
        int j4;
        int h3;
        int i6;
        int g3;
        long a3;
        int i7 = 0;
        if (M0.e.a(this.f7019s, Float.NaN)) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = o3.k(this.f7019s);
            if (i3 < 0) {
                i3 = 0;
            }
        }
        if (M0.e.a(this.f7020t, Float.NaN)) {
            i4 = Integer.MAX_VALUE;
        } else {
            i4 = o3.k(this.f7020t);
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (!M0.e.a(this.f7017q, Float.NaN)) {
            i5 = o3.k(this.f7017q);
            if (i5 > i3) {
                i5 = i3;
            }
            if (i5 < 0) {
                i5 = 0;
            }
        }
        i5 = 0;
        if (!M0.e.a(this.f7018r, Float.NaN)) {
            int k3 = o3.k(this.f7018r);
            if (k3 > i4) {
                k3 = i4;
            }
            if (k3 < 0) {
                k3 = 0;
            }
            if (k3 != Integer.MAX_VALUE) {
                i7 = k3;
            }
        }
        long a4 = I2.l.a(i5, i3, i7, i4);
        if (this.f7021u) {
            a3 = I2.l.a(AbstractC0381e.r(M0.a.j(a4), M0.a.j(j3), M0.a.h(j3)), AbstractC0381e.r(M0.a.h(a4), M0.a.j(j3), M0.a.h(j3)), AbstractC0381e.r(M0.a.i(a4), M0.a.i(j3), M0.a.g(j3)), AbstractC0381e.r(M0.a.g(a4), M0.a.i(j3), M0.a.g(j3)));
        } else {
            if (M0.e.a(this.f7017q, Float.NaN)) {
                j4 = M0.a.j(j3);
                int h4 = M0.a.h(a4);
                if (j4 > h4) {
                    j4 = h4;
                }
            } else {
                j4 = M0.a.j(a4);
            }
            if (M0.e.a(this.f7019s, Float.NaN)) {
                h3 = M0.a.h(j3);
                int j5 = M0.a.j(a4);
                if (h3 < j5) {
                    h3 = j5;
                }
            } else {
                h3 = M0.a.h(a4);
            }
            if (M0.e.a(this.f7018r, Float.NaN)) {
                i6 = M0.a.i(j3);
                int g4 = M0.a.g(a4);
                if (i6 > g4) {
                    i6 = g4;
                }
            } else {
                i6 = M0.a.i(a4);
            }
            if (M0.e.a(this.f7020t, Float.NaN)) {
                g3 = M0.a.g(j3);
                int i8 = M0.a.i(a4);
                if (g3 < i8) {
                    g3 = i8;
                }
            } else {
                g3 = M0.a.g(a4);
            }
            a3 = I2.l.a(j4, h3, i6, g3);
        }
        r0.H b2 = zVar.b(a3);
        return o3.Y(b2.f7114d, b2.f7115e, M1.v.f2804d, new Y.g(b2, 5));
    }
}
