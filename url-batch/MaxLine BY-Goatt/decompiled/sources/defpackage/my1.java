package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class my1 implements kn {
    public boolean m;
    public final Object n;
    public final Object o;
    public Object p;
    public Object q;
    public final Object r;

    public my1(int i, float f, ry1 ry1Var) {
        this.n = ry1Var;
        this.o = new iz1(i);
        this.p = new hz1(f);
        this.r = new pb1(i, 30, 100);
    }

    public void a(c10 c10Var) {
        aa3 aa3Var = (aa3) ((wv0) this.r).v.get((oe) this.o);
        if (aa3Var != null) {
            aa3Var.p(c10Var);
        }
    }

    @Override // defpackage.kn
    public void g(c10 c10Var) {
        ((wv0) this.r).y.post(new iu0(13, (Object) this, (Object) c10Var, false));
    }

    public my1(wv0 wv0Var, ce ceVar, oe oeVar) {
        this.r = wv0Var;
        this.p = null;
        this.q = null;
        this.m = false;
        this.n = ceVar;
        this.o = oeVar;
    }
}
