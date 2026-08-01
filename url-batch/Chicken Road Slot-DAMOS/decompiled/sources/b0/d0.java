package b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 extends d1.k implements c2.v {
    public b0 C;
    public float D;

    @Override // c2.v
    public final a2.h0 v(c2.o0 o0Var, a2.f0 f0Var, long j) {
        int j3;
        int h10;
        int g;
        int i3;
        if (!x2.a.d(j) || this.C == b0.f804d) {
            j3 = x2.a.j(j);
            h10 = x2.a.h(j);
        } else {
            int round = Math.round(x2.a.h(j) * this.D);
            int j10 = x2.a.j(j);
            j3 = x2.a.h(j);
            if (round < j10) {
                round = j10;
            }
            if (round <= j3) {
                j3 = round;
            }
            h10 = j3;
        }
        if (!x2.a.c(j) || this.C == b0.f805e) {
            int i10 = x2.a.i(j);
            g = x2.a.g(j);
            i3 = i10;
        } else {
            int round2 = Math.round(x2.a.g(j) * this.D);
            int i11 = x2.a.i(j);
            i3 = x2.a.g(j);
            if (round2 < i11) {
                round2 = i11;
            }
            if (round2 <= i3) {
                i3 = round2;
            }
            g = i3;
        }
        a2.o0 c10 = f0Var.c(x2.b.a(j3, h10, i3, g));
        return a2.i0.V(o0Var, c10.f131d, c10.f132e, new j(c10, 1));
    }
}
