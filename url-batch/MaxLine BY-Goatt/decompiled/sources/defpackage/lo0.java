package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lo0 {
    public final po0 a;
    public final t7 b;
    public final un1 c;
    public final un1 d;
    public boolean e;

    public lo0(po0 po0Var, t7 t7Var) {
        this.a = po0Var;
        this.b = t7Var;
        int i = pe2.a;
        this.c = new un1();
        this.d = new un1();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        j7 j7Var = new j7(0, this, lo0.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 1);
        jn1 jn1Var = this.b.G0;
        if (jn1Var.f(j7Var) < 0) {
            jn1Var.a(j7Var);
        }
        this.e = true;
    }
}
