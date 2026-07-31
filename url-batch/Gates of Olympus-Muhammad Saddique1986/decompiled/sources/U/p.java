package U;

import I.V;
import n.C0665H;
import n.z0;
import q2.AbstractC0837y;
import q2.C0832t;
import q2.InterfaceC0835w;
import q2.X;
import q2.Z;
import t0.AbstractC0993f;
import t0.InterfaceC0999l;
import t0.b0;
import t0.e0;
import u0.C1123s;

/* loaded from: classes.dex */
public abstract class p implements InterfaceC0999l {

    /* renamed from: e, reason: collision with root package name */
    public v2.c f4490e;

    /* renamed from: f, reason: collision with root package name */
    public int f4491f;

    /* renamed from: h, reason: collision with root package name */
    public p f4493h;

    /* renamed from: i, reason: collision with root package name */
    public p f4494i;

    /* renamed from: j, reason: collision with root package name */
    public e0 f4495j;

    /* renamed from: k, reason: collision with root package name */
    public b0 f4496k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4497l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4498m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4499n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4500o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4501p;

    /* renamed from: d, reason: collision with root package name */
    public p f4489d = this;

    /* renamed from: g, reason: collision with root package name */
    public int f4492g = -1;

    public final InterfaceC0835w m0() {
        v2.c cVar = this.f4490e;
        if (cVar != null) {
            return cVar;
        }
        v2.c a3 = AbstractC0837y.a(((C1123s) AbstractC0993f.u(this)).getCoroutineContext().d(new Z((X) ((C1123s) AbstractC0993f.u(this)).getCoroutineContext().v(C0832t.f7929e))));
        this.f4490e = a3;
        return a3;
    }

    public boolean n0() {
        return !(this instanceof C0665H);
    }

    public void o0() {
        if (this.f4501p) {
            z0.o("node attached multiple times");
            throw null;
        }
        if (this.f4496k == null) {
            z0.o("attach invoked on a node without a coordinator");
            throw null;
        }
        this.f4501p = true;
        this.f4499n = true;
    }

    public void p0() {
        if (!this.f4501p) {
            z0.o("Cannot detach a node that is not attached");
            throw null;
        }
        if (this.f4499n) {
            z0.o("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        if (this.f4500o) {
            z0.o("Must run runDetachLifecycle() before markAsDetached()");
            throw null;
        }
        this.f4501p = false;
        v2.c cVar = this.f4490e;
        if (cVar != null) {
            AbstractC0837y.c(cVar, new V("The Modifier.Node was detached", 1));
            this.f4490e = null;
        }
    }

    public void t0() {
        if (this.f4501p) {
            s0();
        } else {
            z0.o("reset() called on an unattached node");
            throw null;
        }
    }

    public void u0() {
        if (!this.f4501p) {
            z0.o("Must run markAsAttached() prior to runAttachLifecycle");
            throw null;
        }
        if (!this.f4499n) {
            z0.o("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        this.f4499n = false;
        q0();
        this.f4500o = true;
    }

    public void v0() {
        if (!this.f4501p) {
            z0.o("node detached multiple times");
            throw null;
        }
        if (this.f4496k == null) {
            z0.o("detach invoked on a node without a coordinator");
            throw null;
        }
        if (!this.f4500o) {
            z0.o("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            throw null;
        }
        this.f4500o = false;
        r0();
    }

    public void w0(p pVar) {
        this.f4489d = pVar;
    }

    public void x0(b0 b0Var) {
        this.f4496k = b0Var;
    }

    public void q0() {
    }

    public void r0() {
    }

    public void s0() {
    }
}
