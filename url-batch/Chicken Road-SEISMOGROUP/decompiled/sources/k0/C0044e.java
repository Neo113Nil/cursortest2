package k0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p0.AbstractC0084a;

/* renamed from: k0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044e extends AbstractC0062x implements InterfaceC0043d, Y.c, d0 {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f912g = AtomicIntegerFieldUpdater.newUpdater(C0044e.class, "_decisionAndIndex");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f913h = AtomicReferenceFieldUpdater.newUpdater(C0044e.class, Object.class, "_state");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f914i = AtomicReferenceFieldUpdater.newUpdater(C0044e.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    public final W.d f915e;

    /* renamed from: f, reason: collision with root package name */
    public final W.i f916f;

    public C0044e(W.d dVar, int i2) {
        super(i2);
        this.f915e = dVar;
        this.f916f = dVar.i();
        this._decisionAndIndex = 536870911;
        this._state = C0041b.f908a;
    }

    public static void t(p0.v vVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + vVar + ", already has " + obj).toString());
    }

    public static Object w(Object obj, int i2, d0.l lVar) {
        return ((obj instanceof C0050k) || !AbstractC0058t.e(i2) || lVar == null) ? obj : new C0049j(obj, lVar, (CancellationException) null, 16);
    }

    @Override // k0.d0
    public final void a(m0.k kVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f912g;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f913h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0041b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof p0.v) {
                t(kVar, obj);
                throw null;
            }
            if (!(obj instanceof C0050k)) {
                if (obj instanceof C0049j) {
                    ((C0049j) obj).getClass();
                    return;
                }
                return;
            }
            C0050k c0050k = (C0050k) obj;
            c0050k.getClass();
            if (!C0050k.f924b.compareAndSet(c0050k, 0, 1)) {
                t(kVar, obj);
                throw null;
            }
            if (obj instanceof C0045f) {
                if (!(obj instanceof C0050k)) {
                    c0050k = null;
                }
                l(kVar, c0050k != null ? c0050k.f925a : null);
                return;
            }
            return;
        }
    }

    @Override // k0.AbstractC0062x
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f913h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof W) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0050k) {
                return;
            }
            if (!(obj2 instanceof C0049j)) {
                C0049j c0049j = new C0049j(obj2, (d0.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0049j)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0049j c0049j2 = (C0049j) obj2;
            if (c0049j2.f923d != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            Object obj3 = c0049j2.f920a;
            if ((15 & 2) != 0) {
                c0049j2.getClass();
            }
            d0.l lVar = c0049j2.f921b;
            Object obj4 = c0049j2.f922c;
            Throwable th = (15 & 16) != 0 ? c0049j2.f923d : cancellationException;
            c0049j2.getClass();
            C0049j c0049j3 = new C0049j(obj3, lVar, obj4, th);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0049j3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            d0.l lVar2 = c0049j2.f921b;
            if (lVar2 != null) {
                k(lVar2, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // k0.AbstractC0062x
    public final W.d c() {
        return this.f915e;
    }

    @Override // W.d
    public final void d(Object obj) {
        Throwable a2 = U.d.a(obj);
        if (a2 != null) {
            obj = new C0050k(a2, false);
        }
        v(obj, this.f949d, null);
    }

    @Override // k0.AbstractC0062x
    public final Throwable e(Object obj) {
        Throwable e2 = super.e(obj);
        if (e2 != null) {
            return e2;
        }
        return null;
    }

    @Override // k0.AbstractC0062x
    public final Object f(Object obj) {
        return obj instanceof C0049j ? ((C0049j) obj).f920a : obj;
    }

    @Override // Y.c
    public final Y.c g() {
        W.d dVar = this.f915e;
        if (dVar instanceof Y.c) {
            return (Y.c) dVar;
        }
        return null;
    }

    @Override // W.d
    public final W.i i() {
        return this.f916f;
    }

    @Override // k0.AbstractC0062x
    public final Object j() {
        return f913h.get(this);
    }

    public final void k(d0.l lVar, Throwable th) {
        try {
            lVar.h(th);
        } catch (Throwable th2) {
            AbstractC0058t.c(this.f916f, new A.c("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(p0.v vVar, Throwable th) {
        W.i iVar = this.f916f;
        int i2 = f912g.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            vVar.g(i2, iVar);
        } catch (Throwable th2) {
            AbstractC0058t.c(iVar, new A.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f913h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof W) {
                C0045f c0045f = new C0045f(this, th, obj instanceof p0.v);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0045f)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((W) obj) instanceof p0.v) {
                    l((p0.v) obj, th);
                }
                if (!s()) {
                    n();
                }
                o(this.f949d);
                return;
            }
            return;
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f914i;
        InterfaceC0064z interfaceC0064z = (InterfaceC0064z) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0064z == null) {
            return;
        }
        interfaceC0064z.d();
        atomicReferenceFieldUpdater.set(this, V.f905b);
    }

    public final void o(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f912g;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i2 == 4;
                W.d dVar = this.f915e;
                if (z || !(dVar instanceof p0.h) || AbstractC0058t.e(i2) != AbstractC0058t.e(this.f949d)) {
                    AbstractC0058t.g(this, dVar, z);
                    return;
                }
                AbstractC0055p abstractC0055p = ((p0.h) dVar).f1148e;
                W.i iVar = ((p0.h) dVar).f1149f.f454c;
                e0.h.b(iVar);
                if (abstractC0055p.g()) {
                    abstractC0055p.d(iVar, this);
                    return;
                }
                D a2 = a0.a();
                if (a2.f880d >= 4294967296L) {
                    V.c cVar = a2.f882f;
                    if (cVar == null) {
                        cVar = new V.c();
                        a2.f882f = cVar;
                    }
                    cVar.addLast(this);
                    return;
                }
                a2.j(true);
                try {
                    AbstractC0058t.g(this, dVar, true);
                    do {
                    } while (a2.l());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public final Object p() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean s2 = s();
        do {
            atomicIntegerFieldUpdater = f912g;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (s2) {
                    u();
                }
                Object obj = f913h.get(this);
                if (obj instanceof C0050k) {
                    throw ((C0050k) obj).f925a;
                }
                if (AbstractC0058t.e(this.f949d)) {
                    K k2 = (K) this.f916f.k(C0056q.f936c);
                    if (k2 != null && !k2.b()) {
                        CancellationException v2 = ((T) k2).v();
                        b(obj, v2);
                        throw v2;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((InterfaceC0064z) f914i.get(this)) == null) {
            r();
        }
        if (s2) {
            u();
        }
        return X.a.f450b;
    }

    public final void q() {
        InterfaceC0064z r2 = r();
        if (r2 == null || (f913h.get(this) instanceof W)) {
            return;
        }
        r2.d();
        f914i.set(this, V.f905b);
    }

    public final InterfaceC0064z r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        K k2 = (K) this.f916f.k(C0056q.f936c);
        if (k2 == null) {
            return null;
        }
        InterfaceC0064z d2 = AbstractC0058t.d(k2, true, new C0046g(this), 2);
        do {
            atomicReferenceFieldUpdater = f914i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, d2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return d2;
    }

    public final boolean s() {
        if (this.f949d == 2) {
            W.d dVar = this.f915e;
            e0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (p0.h.f1147i.get((p0.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0058t.h(this.f915e));
        sb.append("){");
        Object obj = f913h.get(this);
        sb.append(obj instanceof W ? "Active" : obj instanceof C0045f ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0058t.a(this));
        return sb.toString();
    }

    public final void u() {
        W.d dVar = this.f915e;
        Throwable th = null;
        p0.h hVar = dVar instanceof p0.h ? (p0.h) dVar : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p0.h.f1147i;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                io.flutter.plugin.editing.a aVar = AbstractC0084a.f1137d;
                if (obj == aVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
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

    public final void v(Object obj, int i2, d0.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f913h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof W) {
                Object w2 = w(obj, i2, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, w2)) {
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
            if (obj2 instanceof C0045f) {
                C0045f c0045f = (C0045f) obj2;
                c0045f.getClass();
                if (C0045f.f917c.compareAndSet(c0045f, 0, 1)) {
                    if (lVar != null) {
                        k(lVar, c0045f.f925a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }
}
