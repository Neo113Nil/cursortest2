package U;

import I.W;
import e2.AbstractC0381e;
import k2.AbstractC0552y;
import k2.C0547t;
import k2.InterfaceC0550w;
import k2.X;
import k2.Z;
import n.C0635F;
import t0.AbstractC0898f;
import t0.InterfaceC0904l;
import t0.a0;
import t0.d0;
import u0.C0997t;

/* loaded from: classes.dex */
public abstract class k implements InterfaceC0904l {

    /* renamed from: e, reason: collision with root package name */
    public p2.c f3304e;

    /* renamed from: f, reason: collision with root package name */
    public int f3305f;

    /* renamed from: h, reason: collision with root package name */
    public k f3307h;

    /* renamed from: i, reason: collision with root package name */
    public k f3308i;

    /* renamed from: j, reason: collision with root package name */
    public d0 f3309j;

    /* renamed from: k, reason: collision with root package name */
    public a0 f3310k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3311l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3312m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3313n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3314o;
    public boolean p;

    /* renamed from: d, reason: collision with root package name */
    public k f3303d = this;

    /* renamed from: g, reason: collision with root package name */
    public int f3306g = -1;

    public final InterfaceC0550w j0() {
        p2.c cVar = this.f3304e;
        if (cVar != null) {
            return cVar;
        }
        p2.c a3 = AbstractC0552y.a(((C0997t) AbstractC0898f.u(this)).getCoroutineContext().o(new Z((X) ((C0997t) AbstractC0898f.u(this)).getCoroutineContext().k(C0547t.f5390e))));
        this.f3304e = a3;
        return a3;
    }

    public boolean k0() {
        return !(this instanceof C0635F);
    }

    public void l0() {
        if (this.p) {
            AbstractC0381e.N("node attached multiple times");
            throw null;
        }
        if (this.f3310k == null) {
            AbstractC0381e.N("attach invoked on a node without a coordinator");
            throw null;
        }
        this.p = true;
        this.f3313n = true;
    }

    public void m0() {
        if (!this.p) {
            AbstractC0381e.N("Cannot detach a node that is not attached");
            throw null;
        }
        if (this.f3313n) {
            AbstractC0381e.N("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        if (this.f3314o) {
            AbstractC0381e.N("Must run runDetachLifecycle() before markAsDetached()");
            throw null;
        }
        this.p = false;
        p2.c cVar = this.f3304e;
        if (cVar != null) {
            AbstractC0552y.c(cVar, new W("The Modifier.Node was detached", 1));
            this.f3304e = null;
        }
    }

    public void q0() {
        if (this.p) {
            p0();
        } else {
            AbstractC0381e.N("reset() called on an unattached node");
            throw null;
        }
    }

    public void r0() {
        if (!this.p) {
            AbstractC0381e.N("Must run markAsAttached() prior to runAttachLifecycle");
            throw null;
        }
        if (!this.f3313n) {
            AbstractC0381e.N("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        this.f3313n = false;
        n0();
        this.f3314o = true;
    }

    public void s0() {
        if (!this.p) {
            AbstractC0381e.N("node detached multiple times");
            throw null;
        }
        if (this.f3310k == null) {
            AbstractC0381e.N("detach invoked on a node without a coordinator");
            throw null;
        }
        if (!this.f3314o) {
            AbstractC0381e.N("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            throw null;
        }
        this.f3314o = false;
        o0();
    }

    public void t0(k kVar) {
        this.f3303d = kVar;
    }

    public void u0(a0 a0Var) {
        this.f3310k = a0Var;
    }

    public void n0() {
    }

    public void o0() {
    }

    public void p0() {
    }
}
