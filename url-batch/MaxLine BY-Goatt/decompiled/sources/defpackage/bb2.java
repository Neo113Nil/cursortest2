package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class bb2 extends ul1 implements l00, xd0, r81 {
    public final b41 A;
    public final boolean B;
    public final float C;
    public final s90 D;
    public final t90 E;
    public du F;
    public float G;
    public boolean I;
    public long H = 0;
    public final jn1 J = new jn1();

    public bb2(b41 b41Var, boolean z, float f, s90 s90Var, t90 t90Var) {
        this.A = b41Var;
        this.B = z;
        this.C = f;
        this.D = s90Var;
        this.E = t90Var;
    }

    public abstract void G0(u42 u42Var, long j, float f);

    public abstract void H0(k91 k91Var);

    public final void I0(w42 w42Var) {
        if (w42Var instanceof u42) {
            G0((u42) w42Var, this.H, this.G);
        } else if (w42Var instanceof v42) {
            J0(((v42) w42Var).a);
        } else if (w42Var instanceof t42) {
            J0(((t42) w42Var).a);
        }
    }

    public abstract void J0(u42 u42Var);

    @Override // defpackage.xd0
    public final void g(k91 k91Var) {
        k91Var.a();
        du duVar = this.F;
        if (duVar != null) {
            duVar.b(k91Var, this.G, this.D.a());
        }
        H0(k91Var);
    }

    @Override // defpackage.r81
    public final void v(long j) {
        this.I = true;
        ca0 ca0Var = s03.J(this).I;
        this.H = zm3.Q(j);
        float f = this.C;
        this.G = Float.isNaN(f) ? o70.A(ca0Var, this.B, this.H) : ca0Var.D(f);
        jn1 jn1Var = this.J;
        Object[] objArr = jn1Var.a;
        int i = jn1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            I0((w42) objArr[i2]);
        }
        jn1Var.c();
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }

    @Override // defpackage.ul1
    public final void y0() {
        z71.H(u0(), null, new z62(1, null, this), 3);
    }
}
