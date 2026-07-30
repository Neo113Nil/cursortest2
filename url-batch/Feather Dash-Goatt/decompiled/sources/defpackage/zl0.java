package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class zl0 implements yq {
    public cn e;
    public int g;
    public zl0 i;
    public zl0 j;
    public vq0 k;
    public qp0 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public w3 q;
    public boolean r;
    public zl0 d = this;
    public int h = -1;

    public final sn n0() {
        cn cnVar = this.e;
        if (cnVar != null) {
            return cnVar;
        }
        cn f = la0.f(((d4) op.J(this)).getCoroutineContext().i(new lb0((jb0) ((d4) op.J(this)).getCoroutineContext().d(j41.m))));
        this.e = f;
        return f;
    }

    public boolean o0() {
        return !(this instanceof wc);
    }

    public void p0() {
        if (this.r) {
            o80.b("node attached multiple times");
        }
        if (this.l == null) {
            o80.b("attach invoked on a node without a coordinator");
        }
        this.r = true;
        this.o = true;
    }

    public void q0() {
        if (!this.r) {
            o80.b("Cannot detach a node that is not attached");
        }
        if (this.o) {
            o80.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.p) {
            o80.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.r = false;
        cn cnVar = this.e;
        if (cnVar != null) {
            dm0 dm0Var = new dm0("The Modifier.Node was detached", 2);
            jb0 jb0Var = (jb0) cnVar.d.d(j41.m);
            if (jb0Var == null) {
                af.j(cnVar, "Scope cannot be cancelled because it does not have a job: ");
            } else {
                jb0Var.a(dm0Var);
                this.e = null;
            }
        }
    }

    public void u0() {
        if (!this.r) {
            o80.b("reset() called on an unattached node");
        }
        t0();
    }

    public void v0() {
        if (!this.r) {
            o80.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.o) {
            o80.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.o = false;
        r0();
        this.p = true;
    }

    public void w0() {
        if (!this.r) {
            o80.b("node detached multiple times");
        }
        if (this.l == null) {
            o80.b("detach invoked on a node without a coordinator");
        }
        if (!this.p) {
            o80.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.p = false;
        w3 w3Var = this.q;
        if (w3Var != null) {
            w3Var.invoke();
        }
        s0();
    }

    public void x0(zl0 zl0Var) {
        this.d = zl0Var;
    }

    public void y0(qp0 qp0Var) {
        this.l = qp0Var;
    }

    public void r0() {
    }

    public void s0() {
    }

    public void t0() {
    }
}
