package t2;

import b2.C0192f;
import c2.C0204b;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f2.InterfaceC0327d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1148j;

/* renamed from: t2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1196f extends C implements InterfaceC1195e, InterfaceC0327d, p0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C1196f.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10415g = AtomicReferenceFieldUpdater.newUpdater(C1196f.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10416h = AtomicReferenceFieldUpdater.newUpdater(C1196f.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0300c f10417d;

    /* renamed from: e, reason: collision with root package name */
    public final d2.h f10418e;

    public C1196f(int i3, InterfaceC0300c interfaceC0300c) {
        super(i3);
        this.f10417d = interfaceC0300c;
        this.f10418e = interfaceC0300c.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C1192b.f10398a;
    }

    public static Object C(h0 h0Var, Object obj, int i3, l2.l lVar) {
        if (obj instanceof C1204n) {
            return obj;
        }
        if (i3 != 1 && i3 != 2) {
            return obj;
        }
        if (lVar != null || (h0Var instanceof F)) {
            return new C1203m(obj, h0Var instanceof F ? (F) h0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(h0 h0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + h0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, l2.l lVar) {
        B(obj, this.f10376c, lVar);
    }

    public final void B(Object obj, int i3, l2.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10415g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof h0) {
                Object C3 = C((h0) obj2, obj, i3, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    p();
                }
                q(i3);
                return;
            }
            if (obj2 instanceof C1197g) {
                C1197g c1197g = (C1197g) obj2;
                c1197g.getClass();
                if (C1197g.f10419c.compareAndSet(c1197g, 0, 1)) {
                    if (lVar != null) {
                        l(lVar, c1197g.f10431a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // t2.p0
    public final void a(y2.t tVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i3));
        v(tVar);
    }

    @Override // t2.C
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10415g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof h0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C1204n) {
                return;
            }
            if (!(obj2 instanceof C1203m)) {
                cancellationException2 = cancellationException;
                C1203m c1203m = new C1203m(obj2, (F) null, (l2.l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c1203m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C1203m c1203m2 = (C1203m) obj2;
            if (c1203m2.f10428e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C1203m a3 = C1203m.a(c1203m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            F f3 = c1203m2.f10425b;
            if (f3 != null) {
                k(f3);
            }
            l2.l lVar = c1203m2.f10426c;
            if (lVar != null) {
                l(lVar, cancellationException);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // f2.InterfaceC0327d
    public final InterfaceC0327d c() {
        InterfaceC0300c interfaceC0300c = this.f10417d;
        if (interfaceC0300c instanceof InterfaceC0327d) {
            return (InterfaceC0327d) interfaceC0300c;
        }
        return null;
    }

    @Override // t2.InterfaceC1195e
    public final C1148j d(Object obj, l2.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10415g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z = obj2 instanceof h0;
            C1148j c1148j = AbstractC1212w.f10445a;
            if (!z) {
                boolean z2 = obj2 instanceof C1203m;
                return null;
            }
            Object C3 = C((h0) obj2, obj, this.f10376c, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w()) {
                p();
            }
            return c1148j;
        }
    }

    @Override // t2.C
    public final InterfaceC0300c e() {
        return this.f10417d;
    }

    @Override // d2.InterfaceC0300c
    public final void f(Object obj) {
        Throwable a3 = C0192f.a(obj);
        if (a3 != null) {
            obj = new C1204n(a3, false);
        }
        B(obj, this.f10376c, null);
    }

    @Override // t2.C
    public final Throwable g(Object obj) {
        Throwable g3 = super.g(obj);
        if (g3 != null) {
            return g3;
        }
        return null;
    }

    @Override // d2.InterfaceC0300c
    public final d2.h getContext() {
        return this.f10418e;
    }

    @Override // t2.C
    public final Object h(Object obj) {
        return obj instanceof C1203m ? ((C1203m) obj).f10424a : obj;
    }

    @Override // t2.C
    public final Object j() {
        return f10415g.get(this);
    }

    public final void k(F f3) {
        try {
            f3.f10379a.dispose();
        } catch (Throwable th) {
            AbstractC1212w.e(this.f10418e, new O0.b("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    public final void l(l2.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            AbstractC1212w.e(this.f10418e, new O0.b("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // t2.InterfaceC1195e
    public final void m(Object obj) {
        q(this.f10376c);
    }

    public final void n(y2.t tVar, Throwable th) {
        d2.h hVar = this.f10418e;
        int i3 = f.get(this) & 536870911;
        if (i3 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.g(i3, hVar);
        } catch (Throwable th2) {
            AbstractC1212w.e(hVar, new O0.b("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10415g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof h0) {
                C1197g c1197g = new C1197g(this, th, (obj instanceof F) || (obj instanceof y2.t));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1197g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                h0 h0Var = (h0) obj;
                if (h0Var instanceof F) {
                    k((F) obj);
                } else if (h0Var instanceof y2.t) {
                    n((y2.t) obj, th);
                }
                if (!w()) {
                    p();
                }
                q(this.f10376c);
                return;
            }
            return;
        }
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10416h;
        E e3 = (E) atomicReferenceFieldUpdater.get(this);
        if (e3 == null) {
            return;
        }
        e3.dispose();
        atomicReferenceFieldUpdater.set(this, g0.f10420a);
    }

    public final void q(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i3 == 4;
                InterfaceC0300c interfaceC0300c = this.f10417d;
                if (!z && (interfaceC0300c instanceof y2.h)) {
                    boolean z2 = i3 == 1 || i3 == 2;
                    int i6 = this.f10376c;
                    if (z2 == (i6 == 1 || i6 == 2)) {
                        AbstractC1208s abstractC1208s = ((y2.h) interfaceC0300c).f10844d;
                        d2.h context = ((y2.h) interfaceC0300c).f10845e.getContext();
                        if (abstractC1208s.d()) {
                            abstractC1208s.c(context, this);
                            return;
                        }
                        J a3 = l0.a();
                        if (a3.f10384c >= 4294967296L) {
                            C0204b c0204b = a3.f10386e;
                            if (c0204b == null) {
                                c0204b = new C0204b();
                                a3.f10386e = c0204b;
                            }
                            c0204b.addLast(this);
                            return;
                        }
                        a3.g(true);
                        try {
                            AbstractC1212w.j(this, interfaceC0300c, true);
                            do {
                            } while (a3.m());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC1212w.j(this, interfaceC0300c, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    public Throwable r(e0 e0Var) {
        return e0Var.z();
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        boolean w3 = w();
        do {
            atomicIntegerFieldUpdater = f;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (w3) {
                    z();
                }
                Object obj = f10415g.get(this);
                if (obj instanceof C1204n) {
                    throw ((C1204n) obj).f10431a;
                }
                int i5 = this.f10376c;
                if (i5 == 1 || i5 == 2) {
                    U u3 = (U) this.f10418e.h(C1209t.f10441b);
                    if (u3 != null && !u3.a()) {
                        CancellationException z = ((e0) u3).z();
                        b(obj, z);
                        throw z;
                    }
                }
                return h(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        if (((E) f10416h.get(this)) == null) {
            u();
        }
        if (w3) {
            z();
        }
        return EnumC0317a.f4969a;
    }

    public final void t() {
        E u3 = u();
        if (u3 == null || (f10415g.get(this) instanceof h0)) {
            return;
        }
        u3.dispose();
        f10416h.set(this, g0.f10420a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(AbstractC1212w.l(this.f10417d));
        sb.append("){");
        Object obj = f10415g.get(this);
        sb.append(obj instanceof h0 ? "Active" : obj instanceof C1197g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC1212w.c(this));
        return sb.toString();
    }

    public final E u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        U u3 = (U) this.f10418e.h(C1209t.f10441b);
        if (u3 == null) {
            return null;
        }
        E f3 = AbstractC1212w.f(u3, true, new C1198h(this), 2);
        do {
            atomicReferenceFieldUpdater = f10416h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, f3)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return f3;
    }

    public final void v(h0 h0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10415g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C1192b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof F ? true : obj instanceof y2.t) {
                x(h0Var, obj);
                throw null;
            }
            if (obj instanceof C1204n) {
                C1204n c1204n = (C1204n) obj;
                c1204n.getClass();
                if (!C1204n.f10430b.compareAndSet(c1204n, 0, 1)) {
                    x(h0Var, obj);
                    throw null;
                }
                if (obj instanceof C1197g) {
                    if (obj == null) {
                        c1204n = null;
                    }
                    Throwable th = c1204n != null ? c1204n.f10431a : null;
                    if (h0Var instanceof F) {
                        k((F) h0Var);
                        return;
                    } else {
                        n((y2.t) h0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C1203m)) {
                if (h0Var instanceof y2.t) {
                    return;
                }
                C1203m c1203m = new C1203m(obj, (F) h0Var, (l2.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1203m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C1203m c1203m2 = (C1203m) obj;
            if (c1203m2.f10425b != null) {
                x(h0Var, obj);
                throw null;
            }
            if (h0Var instanceof y2.t) {
                return;
            }
            F f3 = (F) h0Var;
            if (c1203m2.f10428e != null) {
                k(f3);
                return;
            }
            C1203m a3 = C1203m.a(c1203m2, f3, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.f10376c != 2) {
            return false;
        }
        InterfaceC0300c interfaceC0300c = this.f10417d;
        kotlin.jvm.internal.j.c(interfaceC0300c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return y2.h.f10843h.get((y2.h) interfaceC0300c) != null;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        InterfaceC0300c interfaceC0300c = this.f10417d;
        Throwable th = null;
        y2.h hVar = interfaceC0300c instanceof y2.h ? (y2.h) interfaceC0300c : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y2.h.f10843h;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C1148j c1148j = y2.a.f10834d;
                if (obj == c1148j) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, c1148j, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != c1148j) {
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
            p();
            o(th);
        }
    }
}
