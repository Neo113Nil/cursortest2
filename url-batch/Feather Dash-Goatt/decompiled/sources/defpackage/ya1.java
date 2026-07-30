package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ya1 extends zl0 implements ad0 {
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    @Override // defpackage.ad0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wk0 P(ej0 ej0Var, qk0 qk0Var, long j) {
        int i;
        int i2;
        int i3;
        int j2;
        int h;
        int i4;
        int g;
        long a;
        int i5 = 0;
        if (Float.isNaN(this.u)) {
            i = Integer.MAX_VALUE;
        } else {
            i = ej0Var.H(this.u);
            if (i < 0) {
                i = 0;
            }
        }
        if (Float.isNaN(this.v)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = ej0Var.H(this.v);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!Float.isNaN(this.s)) {
            i3 = ej0Var.H(this.s);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i) {
                i3 = i;
            }
        }
        i3 = 0;
        if (!Float.isNaN(this.t)) {
            int H = ej0Var.H(this.t);
            if (H < 0) {
                H = 0;
            }
            if (H > i2) {
                H = i2;
            }
            if (H != Integer.MAX_VALUE) {
                i5 = H;
            }
        }
        long a2 = nm.a(i3, i, i5, i2);
        if (this.w) {
            int j3 = mm.j(j);
            int h2 = mm.h(j);
            int i6 = mm.i(j);
            int g2 = mm.g(j);
            int j4 = mm.j(a2);
            if (j4 < j3) {
                j4 = j3;
            }
            if (j4 > h2) {
                j4 = h2;
            }
            int h3 = mm.h(a2);
            if (h3 >= j3) {
                j3 = h3;
            }
            if (j3 <= h2) {
                h2 = j3;
            }
            int i7 = mm.i(a2);
            if (i7 < i6) {
                i7 = i6;
            }
            if (i7 > g2) {
                i7 = g2;
            }
            int g3 = mm.g(a2);
            if (g3 >= i6) {
                i6 = g3;
            }
            if (i6 <= g2) {
                g2 = i6;
            }
            a = nm.a(j4, h2, i7, g2);
        } else {
            if (Float.isNaN(this.s)) {
                j2 = mm.j(j);
                int h4 = mm.h(a2);
                if (j2 > h4) {
                    j2 = h4;
                }
            } else {
                j2 = mm.j(a2);
            }
            if (Float.isNaN(this.u)) {
                h = mm.h(j);
                int j5 = mm.j(a2);
                if (h < j5) {
                    h = j5;
                }
            } else {
                h = mm.h(a2);
            }
            if (Float.isNaN(this.t)) {
                i4 = mm.i(j);
                int g4 = mm.g(a2);
                if (i4 > g4) {
                    i4 = g4;
                }
            } else {
                i4 = mm.i(a2);
            }
            if (Float.isNaN(this.v)) {
                g = mm.g(j);
                int i8 = mm.i(a2);
                if (g < i8) {
                    g = i8;
                }
            } else {
                g = mm.g(a2);
            }
            a = nm.a(j2, h, i4, g);
        }
        zw0 c = qk0Var.c(a);
        return xk0.q(ej0Var, c.d, c.e, new aa(c, 4));
    }
}
