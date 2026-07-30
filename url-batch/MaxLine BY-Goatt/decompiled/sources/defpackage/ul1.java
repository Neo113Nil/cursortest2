package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ul1 implements o90 {
    public m30 n;
    public int o;
    public ul1 q;
    public ul1 r;
    public yt1 s;
    public ks1 t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public k7 y;
    public boolean z;
    public ul1 m = this;
    public int p = -1;

    public void B0() {
        if (!this.z) {
            h21.b("reset() called on an unattached node");
        }
        A0();
    }

    public void C0() {
        if (!this.z) {
            h21.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.w) {
            h21.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.w = false;
        y0();
        this.x = true;
    }

    public void D0() {
        if (!this.z) {
            h21.b("node detached multiple times");
        }
        if (this.t == null) {
            h21.b("detach invoked on a node without a coordinator");
        }
        if (!this.x) {
            h21.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.x = false;
        k7 k7Var = this.y;
        if (k7Var != null) {
            k7Var.invoke();
        }
        z0();
    }

    public void E0(ul1 ul1Var) {
        this.m = ul1Var;
    }

    public void F0(ks1 ks1Var) {
        this.t = ks1Var;
    }

    public final a50 u0() {
        m30 m30Var = this.n;
        if (m30Var != null) {
            return m30Var;
        }
        m30 b = j8.b(((t7) s03.K(this)).getCoroutineContext().p(new i61((g61) ((t7) s03.K(this)).getCoroutineContext().m(qb2.U))));
        this.n = b;
        return b;
    }

    public boolean v0() {
        return !(this instanceof ap0);
    }

    public void w0() {
        if (this.z) {
            h21.b("node attached multiple times");
        }
        if (this.t == null) {
            h21.b("attach invoked on a node without a coordinator");
        }
        this.z = true;
        this.w = true;
    }

    public void x0() {
        if (!this.z) {
            h21.b("Cannot detach a node that is not attached");
        }
        if (this.w) {
            h21.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.x) {
            h21.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.z = false;
        m30 m30Var = this.n;
        if (m30Var != null) {
            j8.m(m30Var, new bm1("The Modifier.Node was detached", 0));
            this.n = null;
        }
    }

    public void A0() {
    }

    public void y0() {
    }

    public void z0() {
    }
}
