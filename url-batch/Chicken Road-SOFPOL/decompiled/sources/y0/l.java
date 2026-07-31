package y0;

import a7.r;
import a7.s0;
import a7.u;
import a7.u0;
import a7.x;
import w1.d1;
import w1.g1;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class l implements w1.k {

    /* renamed from: e, reason: collision with root package name */
    public f7.c f8707e;

    /* renamed from: f, reason: collision with root package name */
    public int f8708f;

    /* renamed from: h, reason: collision with root package name */
    public l f8710h;
    public l i;

    /* renamed from: j, reason: collision with root package name */
    public g1 f8711j;

    /* renamed from: k, reason: collision with root package name */
    public d1 f8712k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8713l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8714m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8715n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8716o;

    /* renamed from: p, reason: collision with root package name */
    public a2.b f8717p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8718q;

    /* renamed from: d, reason: collision with root package name */
    public l f8706d = this;

    /* renamed from: g, reason: collision with root package name */
    public int f8709g = -1;

    public final u f0() {
        f7.c cVar = this.f8707e;
        if (cVar != null) {
            return cVar;
        }
        f7.c a8 = x.a(((t) w1.f.v(this)).getCoroutineContext().c(new u0((s0) ((t) w1.f.v(this)).getCoroutineContext().l(r.f297e))));
        this.f8707e = a8;
        return a8;
    }

    public boolean g0() {
        return !(this instanceof t.n);
    }

    public void h0() {
        if (this.f8718q) {
            t1.a.b("node attached multiple times");
        }
        if (this.f8712k == null) {
            t1.a.b("attach invoked on a node without a coordinator");
        }
        this.f8718q = true;
        this.f8715n = true;
    }

    public void i0() {
        if (!this.f8718q) {
            t1.a.b("Cannot detach a node that is not attached");
        }
        if (this.f8715n) {
            t1.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f8716o) {
            t1.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f8718q = false;
        f7.c cVar = this.f8707e;
        if (cVar != null) {
            q1.n nVar = new q1.n("The Modifier.Node was detached", 0);
            s0 s0Var = (s0) cVar.f2769d.l(r.f297e);
            if (s0Var != null) {
                s0Var.a(nVar);
                this.f8707e = null;
            } else {
                throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + cVar).toString());
            }
        }
    }

    public void m0() {
        if (!this.f8718q) {
            t1.a.b("reset() called on an unattached node");
        }
        l0();
    }

    public void n0() {
        if (!this.f8718q) {
            t1.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f8715n) {
            t1.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f8715n = false;
        j0();
        this.f8716o = true;
    }

    public void o0() {
        if (!this.f8718q) {
            t1.a.b("node detached multiple times");
        }
        if (this.f8712k == null) {
            t1.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f8716o) {
            t1.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f8716o = false;
        a2.b bVar = this.f8717p;
        if (bVar != null) {
            bVar.b();
        }
        k0();
    }

    public void p0(l lVar) {
        this.f8706d = lVar;
    }

    public void q0(d1 d1Var) {
        this.f8712k = d1Var;
    }

    public void j0() {
    }

    public void k0() {
    }

    public void l0() {
    }
}
