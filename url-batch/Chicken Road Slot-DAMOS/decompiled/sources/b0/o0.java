package b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o0 extends d1.k implements c2.v {
    public float C;
    public float D;
    public float E;
    public float F;
    public boolean G;

    @Override // c2.v
    public final a2.h0 v(c2.o0 o0Var, a2.f0 f0Var, long j) {
        int y3 = o0Var.y(this.E) + o0Var.y(this.C);
        int y10 = o0Var.y(this.F) + o0Var.y(this.D);
        a2.o0 c10 = f0Var.c(x2.b.h(-y3, -y10, j));
        return a2.i0.V(o0Var, x2.b.f(c10.f131d + y3, j), x2.b.e(c10.f132e + y10, j), new l0(1, this, c10));
    }
}
