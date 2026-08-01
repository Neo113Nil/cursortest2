package b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x0 extends d1.k implements c2.v {
    public float C;
    public float D;
    public float E;
    public float F;
    public boolean G;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    @Override // c2.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a2.h0 v(c2.o0 o0Var, a2.f0 f0Var, long j) {
        int i3;
        int i10;
        int i11;
        int j3;
        int h10;
        int i12;
        int g;
        long a9;
        int i13 = 0;
        if (Float.isNaN(this.E)) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = o0Var.y(this.E);
            if (i3 < 0) {
                i3 = 0;
            }
        }
        if (Float.isNaN(this.F)) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = o0Var.y(this.F);
            if (i10 < 0) {
                i10 = 0;
            }
        }
        if (!Float.isNaN(this.C)) {
            i11 = o0Var.y(this.C);
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 > i3) {
                i11 = i3;
            }
        }
        i11 = 0;
        if (!Float.isNaN(this.D)) {
            int y3 = o0Var.y(this.D);
            if (y3 < 0) {
                y3 = 0;
            }
            if (y3 > i10) {
                y3 = i10;
            }
            if (y3 != Integer.MAX_VALUE) {
                i13 = y3;
            }
        }
        long a10 = x2.b.a(i11, i3, i13, i10);
        if (this.G) {
            int j10 = x2.a.j(j);
            int h11 = x2.a.h(j);
            int i14 = x2.a.i(j);
            int g2 = x2.a.g(j);
            int j11 = x2.a.j(a10);
            if (j11 < j10) {
                j11 = j10;
            }
            if (j11 > h11) {
                j11 = h11;
            }
            int h12 = x2.a.h(a10);
            if (h12 >= j10) {
                j10 = h12;
            }
            if (j10 <= h11) {
                h11 = j10;
            }
            int i15 = x2.a.i(a10);
            if (i15 < i14) {
                i15 = i14;
            }
            if (i15 > g2) {
                i15 = g2;
            }
            int g10 = x2.a.g(a10);
            if (g10 >= i14) {
                i14 = g10;
            }
            if (i14 <= g2) {
                g2 = i14;
            }
            a9 = x2.b.a(j11, h11, i15, g2);
        } else {
            if (Float.isNaN(this.C)) {
                j3 = x2.a.j(j);
                int h13 = x2.a.h(a10);
                if (j3 > h13) {
                    j3 = h13;
                }
            } else {
                j3 = x2.a.j(a10);
            }
            if (Float.isNaN(this.E)) {
                h10 = x2.a.h(j);
                int j12 = x2.a.j(a10);
                if (h10 < j12) {
                    h10 = j12;
                }
            } else {
                h10 = x2.a.h(a10);
            }
            if (Float.isNaN(this.D)) {
                i12 = x2.a.i(j);
                int g11 = x2.a.g(a10);
                if (i12 > g11) {
                    i12 = g11;
                }
            } else {
                i12 = x2.a.i(a10);
            }
            if (Float.isNaN(this.F)) {
                g = x2.a.g(j);
                int i16 = x2.a.i(a10);
                if (g < i16) {
                    g = i16;
                }
            } else {
                g = x2.a.g(a10);
            }
            a9 = x2.b.a(j3, h10, i12, g);
        }
        a2.o0 c10 = f0Var.c(a9);
        return a2.i0.V(o0Var, c10.f131d, c10.f132e, new j(c10, 2));
    }
}
