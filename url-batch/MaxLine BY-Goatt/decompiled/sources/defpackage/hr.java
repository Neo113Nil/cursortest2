package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hr extends ul1 implements xt1, sq, xd0 {
    public final ir A;
    public boolean B;
    public Function1 C;

    public hr(ir irVar, Function1 function1) {
        this.A = irVar;
        this.C = function1;
        irVar.m = this;
    }

    @Override // defpackage.ul1
    public final void A0() {
        G0();
    }

    public final void G0() {
        this.B = false;
        this.A.n = null;
        z71.F(this);
    }

    @Override // defpackage.xt1
    public final void L() {
        G0();
    }

    @Override // defpackage.o90, defpackage.w22
    public final void b() {
        G0();
    }

    @Override // defpackage.sq
    public final ca0 d() {
        return s03.J(this).I;
    }

    @Override // defpackage.sq
    public final long f() {
        return zm3.Q(s03.H(this, 128).o);
    }

    @Override // defpackage.xd0
    public final void g(k91 k91Var) {
        boolean z = this.B;
        ir irVar = this.A;
        if (!z) {
            irVar.n = null;
            j8.P(this, new k7(5, this, irVar));
            if (irVar.n == null) {
                throw q40.f("DrawResult not defined, did you forget to call onDraw?");
            }
            this.B = true;
        }
        ar0 ar0Var = irVar.n;
        ar0Var.getClass();
        ((Function1) ar0Var.n).invoke(k91Var);
    }

    @Override // defpackage.sq
    public final u81 getLayoutDirection() {
        return s03.J(this).J;
    }

    @Override // defpackage.xd0
    public final void n0() {
        G0();
    }

    @Override // defpackage.o90
    public final void q0() {
        G0();
    }

    @Override // defpackage.ul1
    public final void z0() {
    }
}
