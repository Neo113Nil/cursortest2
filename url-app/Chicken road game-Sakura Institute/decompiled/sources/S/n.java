package S;

import G.V;
import W2.B;
import W2.C0299v;
import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import W2.e0;
import m.F;
import n.AbstractC0864b;
import r0.AbstractC1065f;
import r0.InterfaceC1072m;
import r0.a0;
import r0.d0;
import s0.C1166s;

/* loaded from: classes.dex */
public abstract class n implements InterfaceC1072m {

    /* renamed from: e, reason: collision with root package name */
    public b3.c f3979e;

    /* renamed from: i, reason: collision with root package name */
    public int f3980i;

    /* renamed from: k, reason: collision with root package name */
    public n f3982k;

    /* renamed from: l, reason: collision with root package name */
    public n f3983l;

    /* renamed from: m, reason: collision with root package name */
    public d0 f3984m;

    /* renamed from: n, reason: collision with root package name */
    public a0 f3985n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3986o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3987p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3988q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3989r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3990s;

    /* renamed from: d, reason: collision with root package name */
    public n f3978d = this;

    /* renamed from: j, reason: collision with root package name */
    public int f3981j = -1;

    public void A0(a0 a0Var) {
        this.f3985n = a0Var;
    }

    public final InterfaceC0302y p0() {
        b3.c cVar = this.f3979e;
        if (cVar != null) {
            return cVar;
        }
        b3.c a4 = B.a(((C1166s) AbstractC1065f.w(this)).getCoroutineContext().s(new e0((InterfaceC0280c0) ((C1166s) AbstractC1065f.w(this)).getCoroutineContext().k(C0299v.f4296e))));
        this.f3979e = a4;
        return a4;
    }

    public boolean q0() {
        return !(this instanceof F);
    }

    public void r0() {
        if (this.f3990s) {
            AbstractC0864b.D("node attached multiple times");
            throw null;
        }
        if (this.f3985n == null) {
            AbstractC0864b.D("attach invoked on a node without a coordinator");
            throw null;
        }
        this.f3990s = true;
        this.f3988q = true;
    }

    public void s0() {
        if (!this.f3990s) {
            AbstractC0864b.D("Cannot detach a node that is not attached");
            throw null;
        }
        if (this.f3988q) {
            AbstractC0864b.D("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        if (this.f3989r) {
            AbstractC0864b.D("Must run runDetachLifecycle() before markAsDetached()");
            throw null;
        }
        this.f3990s = false;
        b3.c cVar = this.f3979e;
        if (cVar != null) {
            B.b(cVar, new V("The Modifier.Node was detached", 1));
            this.f3979e = null;
        }
    }

    public void t0() {
    }

    public void u0() {
    }

    public void v0() {
    }

    public void w0() {
        if (this.f3990s) {
            v0();
        } else {
            AbstractC0864b.D("reset() called on an unattached node");
            throw null;
        }
    }

    public void x0() {
        if (!this.f3990s) {
            AbstractC0864b.D("Must run markAsAttached() prior to runAttachLifecycle");
            throw null;
        }
        if (!this.f3988q) {
            AbstractC0864b.D("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        this.f3988q = false;
        t0();
        this.f3989r = true;
    }

    public void y0() {
        if (!this.f3990s) {
            AbstractC0864b.D("node detached multiple times");
            throw null;
        }
        if (this.f3985n == null) {
            AbstractC0864b.D("detach invoked on a node without a coordinator");
            throw null;
        }
        if (!this.f3989r) {
            AbstractC0864b.D("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            throw null;
        }
        this.f3989r = false;
        u0();
    }

    public void z0(n nVar) {
        this.f3978d = nVar;
    }
}
