package k0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p0.AbstractC0090a;

/* renamed from: k0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046e extends AbstractC0064x implements InterfaceC0045d, Y.c, d0 {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f859g = AtomicIntegerFieldUpdater.newUpdater(C0046e.class, "_decisionAndIndex");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f860h = AtomicReferenceFieldUpdater.newUpdater(C0046e.class, Object.class, "_state");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f861i = AtomicReferenceFieldUpdater.newUpdater(C0046e.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    public final W.d f862e;

    /* renamed from: f, reason: collision with root package name */
    public final W.i f863f;

    public C0046e(W.d dVar, int i2) {
        super(i2);
        this.f862e = dVar;
        this.f863f = dVar.i();
        this._decisionAndIndex = 536870911;
        this._state = C0043b.f855a;
    }

    public static void t(p0.v vVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + vVar + ", already has " + obj).toString());
    }

    public static Object w(Object obj, int i2, d0.l lVar) {
        return ((obj instanceof C0052k) || !AbstractC0060t.e(i2) || lVar == null) ? obj : new C0051j(obj, lVar, (CancellationException) null, 16);
    }

    @Override // k0.d0
    public final void a(m0.k kVar, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f859g;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f860h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0043b) {
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
            if (!(obj instanceof C0052k)) {
                if (obj instanceof C0051j) {
                    ((C0051j) obj).getClass();
                    return;
                }
                return;
            }
            C0052k c0052k = (C0052k) obj;
            c0052k.getClass();
            if (!C0052k.f871b.compareAndSet(c0052k, 0, 1)) {
                t(kVar, obj);
                throw null;
            }
            if (obj instanceof C0047f) {
                if (!(obj instanceof C0052k)) {
                    c0052k = null;
                }
                l(kVar, c0052k != null ? c0052k.f872a : null);
                return;
            }
            return;
        }
    }

    @Override // k0.AbstractC0064x
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f860h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof W) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0052k) {
                return;
            }
            if (!(obj2 instanceof C0051j)) {
                C0051j c0051j = new C0051j(obj2, (d0.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0051j)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0051j c0051j2 = (C0051j) obj2;
            if (c0051j2.f870d != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            Object obj3 = c0051j2.f867a;
            if ((15 & 2) != 0) {
                c0051j2.getClass();
            }
            d0.l lVar = c0051j2.f868b;
            Object obj4 = c0051j2.f869c;
            Throwable th = (15 & 16) != 0 ? c0051j2.f870d : cancellationException;
            c0051j2.getClass();
            C0051j c0051j3 = new C0051j(obj3, lVar, obj4, th);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0051j3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            d0.l lVar2 = c0051j2.f868b;
            if (lVar2 != null) {
                k(lVar2, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // k0.AbstractC0064x
    public final W.d c() {
        return this.f862e;
    }

    @Override // W.d
    public final void d(Object obj) {
        Throwable a2 = U.d.a(obj);
        if (a2 != null) {
            obj = new C0052k(a2, false);
        }
        v(obj, this.f896d, null);
    }

    @Override // k0.AbstractC0064x
    public final Throwable e(Object obj) {
        Throwable e2 = super.e(obj);
        if (e2 != null) {
            return e2;
        }
        return null;
    }

    @Override // k0.AbstractC0064x
    public final Object f(Object obj) {
        return obj instanceof C0051j ? ((C0051j) obj).f867a : obj;
    }

    @Override // Y.c
    public final Y.c g() {
        W.d dVar = this.f862e;
        if (dVar instanceof Y.c) {
            return (Y.c) dVar;
        }
        return null;
    }

    @Override // W.d
    public final W.i i() {
        return this.f863f;
    }

    @Override // k0.AbstractC0064x
    public final Object j() {
        return f860h.get(this);
    }

    public final void k(d0.l lVar, Throwable th) {
        try {
            lVar.h(th);
        } catch (Throwable th2) {
            AbstractC0060t.c(this.f863f, new B.c("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(p0.v vVar, Throwable th) {
        W.i iVar = this.f863f;
        int i2 = f859g.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            vVar.g(i2, iVar);
        } catch (Throwable th2) {
            AbstractC0060t.c(iVar, new B.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f860h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof W) {
                C0047f c0047f = new C0047f(this, th, obj instanceof p0.v);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0047f)) {
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
                o(this.f896d);
                return;
            }
            return;
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f861i;
        InterfaceC0066z interfaceC0066z = (InterfaceC0066z) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0066z == null) {
            return;
        }
        interfaceC0066z.d();
        atomicReferenceFieldUpdater.set(this, V.f852b);
    }

    public final void o(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f859g;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i2 == 4;
                W.d dVar = this.f862e;
                if (z2 || !(dVar instanceof p0.h) || AbstractC0060t.e(i2) != AbstractC0060t.e(this.f896d)) {
                    AbstractC0060t.g(this, dVar, z2);
                    return;
                }
                AbstractC0057p abstractC0057p = ((p0.h) dVar).f1140e;
                W.i iVar = ((p0.h) dVar).f1141f.f399c;
                e0.h.b(iVar);
                if (abstractC0057p.g()) {
                    abstractC0057p.d(iVar, this);
                    return;
                }
                D a2 = a0.a();
                if (a2.f827d >= 4294967296L) {
                    V.c cVar = a2.f829f;
                    if (cVar == null) {
                        cVar = new V.c();
                        a2.f829f = cVar;
                    }
                    cVar.addLast(this);
                    return;
                }
                a2.j(true);
                try {
                    AbstractC0060t.g(this, dVar, true);
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
            atomicIntegerFieldUpdater = f859g;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (s2) {
                    u();
                }
                Object obj = f860h.get(this);
                if (obj instanceof C0052k) {
                    throw ((C0052k) obj).f872a;
                }
                if (AbstractC0060t.e(this.f896d)) {
                    K k2 = (K) this.f863f.k(C0058q.f883c);
                    if (k2 != null && !k2.b()) {
                        CancellationException v2 = ((T) k2).v();
                        b(obj, v2);
                        throw v2;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((InterfaceC0066z) f861i.get(this)) == null) {
            r();
        }
        if (s2) {
            u();
        }
        return X.a.f395b;
    }

    public final void q() {
        InterfaceC0066z r2 = r();
        if (r2 == null || (f860h.get(this) instanceof W)) {
            return;
        }
        r2.d();
        f861i.set(this, V.f852b);
    }

    public final InterfaceC0066z r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        K k2 = (K) this.f863f.k(C0058q.f883c);
        if (k2 == null) {
            return null;
        }
        InterfaceC0066z d2 = AbstractC0060t.d(k2, true, new C0048g(this), 2);
        do {
            atomicReferenceFieldUpdater = f861i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, d2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return d2;
    }

    public final boolean s() {
        if (this.f896d == 2) {
            W.d dVar = this.f862e;
            e0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (p0.h.f1139i.get((p0.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0060t.h(this.f862e));
        sb.append("){");
        Object obj = f860h.get(this);
        sb.append(obj instanceof W ? "Active" : obj instanceof C0047f ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0060t.a(this));
        return sb.toString();
    }

    public final void u() {
        W.d dVar = this.f862e;
        Throwable th = null;
        p0.h hVar = dVar instanceof p0.h ? (p0.h) dVar : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p0.h.f1139i;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                io.flutter.plugin.platform.c cVar = AbstractC0090a.f1129d;
                if (obj == cVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, cVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != cVar) {
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f860h;
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
            if (obj2 instanceof C0047f) {
                C0047f c0047f = (C0047f) obj2;
                c0047f.getClass();
                if (C0047f.f864c.compareAndSet(c0047f, 0, 1)) {
                    if (lVar != null) {
                        k(lVar, c0047f.f872a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }
}
