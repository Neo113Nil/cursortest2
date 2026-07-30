package s0;

import c7.a0;
import c7.u;
import c7.x;
import c7.x0;
import c7.z0;
import g0.s0;
import r1.a1;
import r1.d1;
import s1.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class n implements r1.l {

    /* renamed from: g, reason: collision with root package name */
    public h7.c f8105g;

    /* renamed from: h, reason: collision with root package name */
    public int f8106h;

    /* renamed from: j, reason: collision with root package name */
    public n f8108j;

    /* renamed from: k, reason: collision with root package name */
    public n f8109k;

    /* renamed from: l, reason: collision with root package name */
    public d1 f8110l;

    /* renamed from: m, reason: collision with root package name */
    public a1 f8111m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8112n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8113o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8114p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8115q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8116r;

    /* renamed from: f, reason: collision with root package name */
    public n f8104f = this;

    /* renamed from: i, reason: collision with root package name */
    public int f8107i = -1;

    public final x o0() {
        h7.c cVar = this.f8105g;
        if (cVar != null) {
            return cVar;
        }
        h7.c a3 = a0.a(((r) r1.f.u(this)).getCoroutineContext().z(new z0((x0) ((r) r1.f.u(this)).getCoroutineContext().u(u.f1748g))));
        this.f8105g = a3;
        return a3;
    }

    public boolean p0() {
        return !(this instanceof m.x);
    }

    public void q0() {
        if (this.f8116r) {
            a.a.M("node attached multiple times");
            throw null;
        }
        if (this.f8111m == null) {
            a.a.M("attach invoked on a node without a coordinator");
            throw null;
        }
        this.f8116r = true;
        this.f8114p = true;
    }

    public void r0() {
        if (!this.f8116r) {
            a.a.M("Cannot detach a node that is not attached");
            throw null;
        }
        if (this.f8114p) {
            a.a.M("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        if (this.f8115q) {
            a.a.M("Must run runDetachLifecycle() before markAsDetached()");
            throw null;
        }
        this.f8116r = false;
        h7.c cVar = this.f8105g;
        if (cVar != null) {
            a0.c(cVar, new s0("The Modifier.Node was detached", 4));
            this.f8105g = null;
        }
    }

    public void v0() {
        if (this.f8116r) {
            u0();
        } else {
            a.a.M("reset() called on an unattached node");
            throw null;
        }
    }

    public void w0() {
        if (!this.f8116r) {
            a.a.M("Must run markAsAttached() prior to runAttachLifecycle");
            throw null;
        }
        if (!this.f8114p) {
            a.a.M("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        this.f8114p = false;
        s0();
        this.f8115q = true;
    }

    public void x0() {
        if (!this.f8116r) {
            a.a.M("node detached multiple times");
            throw null;
        }
        if (this.f8111m == null) {
            a.a.M("detach invoked on a node without a coordinator");
            throw null;
        }
        if (!this.f8115q) {
            a.a.M("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            throw null;
        }
        this.f8115q = false;
        t0();
    }

    public void y0(n nVar) {
        this.f8104f = nVar;
    }

    public void z0(a1 a1Var) {
        this.f8111m = a1Var;
    }

    public void s0() {
    }

    public void t0() {
    }

    public void u0() {
    }
}
