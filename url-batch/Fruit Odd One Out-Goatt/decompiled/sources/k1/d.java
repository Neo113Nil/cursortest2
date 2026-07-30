package k1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class d extends x implements x0.c, y0, v0.d {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f671g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_decisionAndIndex");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f672h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_state");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f673i = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    public final v0.d f674e;

    /* renamed from: f, reason: collision with root package name */
    public final v0.h f675f;

    public d(v0.d dVar, int i2) {
        super(i2);
        this.f674e = dVar;
        this.f675f = dVar.d();
        this._decisionAndIndex = 536870911;
        this._state = b.f663a;
    }

    public static void t(m1.k kVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + kVar + ", already has " + obj).toString());
    }

    @Override // k1.y0
    public final void a(m1.k kVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f671g;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                f0.l.b("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f672h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            } else {
                if (obj instanceof p1.u) {
                    t(kVar, obj);
                    throw null;
                }
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    if (!j.f688b.compareAndSet(jVar, 0, 1)) {
                        t(kVar, obj);
                        throw null;
                    }
                    if (obj instanceof e) {
                        l(kVar, jVar.f689a);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // x0.c
    public final x0.c b() {
        v0.d dVar = this.f674e;
        if (dVar instanceof x0.c) {
            return (x0.c) dVar;
        }
        return null;
    }

    @Override // k1.x
    public final void c(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f672h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof t0) {
                f0.l.b("Not completed");
                return;
            }
            if (obj2 instanceof j) {
                return;
            }
            if (!(obj2 instanceof i)) {
                i iVar = new i(obj2, (c1.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, iVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            i iVar2 = (i) obj2;
            if (iVar2.f685d != null) {
                f0.l.b("Must be called at most once");
                return;
            }
            i iVar3 = new i(iVar2.f682a, iVar2.f683b, iVar2.f684c, (15 & 16) != 0 ? iVar2.f685d : cancellationException);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, iVar3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            c1.l lVar = iVar2.f683b;
            if (lVar != null) {
                k(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // v0.d
    public final v0.h d() {
        return this.f675f;
    }

    @Override // k1.x
    public final v0.d e() {
        return this.f674e;
    }

    @Override // v0.d
    public final void f(Object obj) {
        Throwable a2 = t0.d.a(obj);
        if (a2 != null) {
            obj = new j(a2, false);
        }
        v(obj, this.f731d, null);
    }

    @Override // k1.x
    public final Throwable g(Object obj) {
        Throwable g2 = super.g(obj);
        if (g2 != null) {
            return g2;
        }
        return null;
    }

    @Override // k1.x
    public final Object h(Object obj) {
        return obj instanceof i ? ((i) obj).f682a : obj;
    }

    @Override // k1.x
    public final Object j() {
        return f672h.get(this);
    }

    public final void k(c1.l lVar, Throwable th) {
        try {
            lVar.h(th);
        } catch (Throwable th2) {
            t.c(this.f675f, new c0.c("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(p1.u uVar, Throwable th) {
        v0.h hVar = this.f675f;
        int i2 = f671g.get(this) & 536870911;
        if (i2 == 536870911) {
            f0.l.b("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            uVar.g(i2, hVar);
        } catch (Throwable th2) {
            t.c(hVar, new c0.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f672h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof t0) {
                e eVar = new e(this, th, obj instanceof p1.u);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, eVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((t0) obj) instanceof p1.u) {
                    l((p1.u) obj, th);
                }
                if (!s()) {
                    n();
                }
                o(this.f731d);
                return;
            }
            return;
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f673i;
        z zVar = (z) atomicReferenceFieldUpdater.get(this);
        if (zVar == null) {
            return;
        }
        zVar.b();
        atomicReferenceFieldUpdater.set(this, s0.f716b);
    }

    public final void o(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f671g;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    f0.l.b("Already resumed");
                    return;
                }
                boolean z2 = i2 == 4;
                v0.d dVar = this.f674e;
                if (!z2 && (dVar instanceof p1.h)) {
                    boolean z3 = i2 == 1 || i2 == 2;
                    int i5 = this.f731d;
                    if (z3 == (i5 == 1 || i5 == 2)) {
                        p1.h hVar = (p1.h) dVar;
                        p pVar = hVar.f1047e;
                        v0.h hVar2 = hVar.f1048f.f1231c;
                        hVar2.getClass();
                        if (pVar.c()) {
                            pVar.b(hVar2, this);
                            return;
                        }
                        c0 a2 = v0.a();
                        if (a2.f668d >= 4294967296L) {
                            u0.b bVar = a2.f670f;
                            if (bVar == null) {
                                bVar = new u0.b();
                                a2.f670f = bVar;
                            }
                            bVar.addLast(this);
                            return;
                        }
                        a2.g(true);
                        try {
                            t.f(this, dVar, true);
                            do {
                            } while (a2.m());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                t.f(this, dVar, z2);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public final Object p() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        q0 q0Var;
        boolean s2 = s();
        do {
            atomicIntegerFieldUpdater = f671g;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    f0.l.b("Already suspended");
                    return null;
                }
                if (s2) {
                    u();
                }
                Object obj = f672h.get(this);
                if (obj instanceof j) {
                    throw ((j) obj).f689a;
                }
                int i4 = this.f731d;
                if ((i4 != 1 && i4 != 2) || (q0Var = (q0) this.f675f.j(q.f713c)) == null || q0Var.B()) {
                    return h(obj);
                }
                CancellationException u = q0Var.u();
                c(obj, u);
                throw u;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((z) f673i.get(this)) == null) {
            r();
        }
        if (s2) {
            u();
        }
        return w0.a.f1227b;
    }

    public final void q() {
        z r2 = r();
        if (r2 == null || (f672h.get(this) instanceof t0)) {
            return;
        }
        r2.b();
        f673i.set(this, s0.f716b);
    }

    public final z r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        q0 q0Var = (q0) this.f675f.j(q.f713c);
        if (q0Var == null) {
            return null;
        }
        z d2 = t.d(q0Var, new f(this), 2);
        do {
            atomicReferenceFieldUpdater = f673i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, d2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return d2;
    }

    public final boolean s() {
        if (this.f731d != 2) {
            return false;
        }
        v0.d dVar = this.f674e;
        dVar.getClass();
        return p1.h.f1046i.get((p1.h) dVar) != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(t.g(this.f674e));
        sb.append("){");
        Object obj = f672h.get(this);
        sb.append(obj instanceof t0 ? "Active" : obj instanceof e ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(t.a(this));
        return sb.toString();
    }

    public final void u() {
        v0.d dVar = this.f674e;
        Throwable th = null;
        p1.h hVar = dVar instanceof p1.h ? (p1.h) dVar : null;
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p1.h.f1046i;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                o0.a aVar = p1.a.f1036d;
                if (obj == aVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        f0.l.f("Inconsistent state ", obj);
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            n();
            m(th);
        }
    }

    public final void v(Object obj, int i2, c1.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f672h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof t0) {
                Object iVar = (!(obj instanceof j) && (i2 == 1 || i2 == 2) && lVar != null) ? new i(obj, lVar, (CancellationException) null, 16) : obj;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, iVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!s()) {
                    n();
                }
                o(i2);
                return;
            }
            if (obj2 instanceof e) {
                e eVar = (e) obj2;
                if (e.f676c.compareAndSet(eVar, 0, 1)) {
                    if (lVar != null) {
                        k(lVar, eVar.f689a);
                        return;
                    }
                    return;
                }
            }
            f0.l.f("Already resumed, but proposed with update ", obj);
            return;
        }
    }
}
