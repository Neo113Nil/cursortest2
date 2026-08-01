package d1;

import a3.a0;
import c2.i1;
import c2.l1;
import ge.c1;
import ge.e1;
import ge.u;
import ge.x;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k implements c2.i {
    public a0 A;
    public boolean B;

    /* renamed from: e, reason: collision with root package name */
    public le.d f3306e;

    /* renamed from: i, reason: collision with root package name */
    public int f3307i;

    /* renamed from: s, reason: collision with root package name */
    public k f3309s;

    /* renamed from: t, reason: collision with root package name */
    public k f3310t;

    /* renamed from: u, reason: collision with root package name */
    public l1 f3311u;

    /* renamed from: v, reason: collision with root package name */
    public i1 f3312v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3313w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3314x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3315y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3316z;

    /* renamed from: d, reason: collision with root package name */
    public k f3305d = this;

    /* renamed from: r, reason: collision with root package name */
    public int f3308r = -1;

    public void D() {
        if (!this.B) {
            z1.a.b("reset() called on an unattached node");
        }
        C();
    }

    public void E() {
        if (!this.B) {
            z1.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f3315y) {
            z1.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f3315y = false;
        A();
        this.f3316z = true;
    }

    public void F() {
        if (!this.B) {
            z1.a.b("node detached multiple times");
        }
        if (this.f3312v == null) {
            z1.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f3316z) {
            z1.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f3316z = false;
        a0 a0Var = this.A;
        if (a0Var != null) {
            a0Var.invoke();
        }
        B();
    }

    public void G(k kVar) {
        this.f3305d = kVar;
    }

    public void H(i1 i1Var) {
        this.f3312v = i1Var;
    }

    public final x w() {
        le.d dVar = this.f3306e;
        if (dVar != null) {
            return dVar;
        }
        le.d b10 = ge.a0.b(c2.k.v(this).getCoroutineContext().p(new e1((c1) c2.k.v(this).getCoroutineContext().m(u.f4403e))));
        this.f3306e = b10;
        return b10;
    }

    public boolean x() {
        return !(this instanceof x.h);
    }

    public void y() {
        if (this.B) {
            z1.a.b("node attached multiple times");
        }
        if (this.f3312v == null) {
            z1.a.b("attach invoked on a node without a coordinator");
        }
        this.B = true;
        this.f3315y = true;
    }

    public void z() {
        if (!this.B) {
            z1.a.b("Cannot detach a node that is not attached");
        }
        if (this.f3315y) {
            z1.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f3316z) {
            z1.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.B = false;
        le.d dVar = this.f3306e;
        if (dVar != null) {
            ge.a0.f(dVar, new m("The Modifier.Node was detached", 0));
            this.f3306e = null;
        }
    }

    public void A() {
    }

    public void B() {
    }

    public void C() {
    }
}
