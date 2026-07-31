package a7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class a1 implements s0, g1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f240d = AtomicReferenceFieldUpdater.newUpdater(a1.class, Object.class, "_state$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f241e = AtomicReferenceFieldUpdater.newUpdater(a1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public a1(boolean z3) {
        this._state$volatile = z3 ? x.f318j : x.i;
    }

    public static l V(f7.j jVar) {
        while (jVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7.j.f2784e;
            f7.j f6 = jVar.f();
            if (f6 == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (f7.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = f6;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof l) {
                    return (l) jVar;
                }
                if (jVar instanceof c1) {
                    return null;
                }
            }
        }
    }

    public static String c0(Object obj) {
        if (!(obj instanceof z0)) {
            return obj instanceof p0 ? ((p0) obj).b() ? "Active" : "New" : obj instanceof o ? "Cancelled" : "Completed";
        }
        z0 z0Var = (z0) obj;
        return z0Var.e() ? "Cancelling" : z0.f326e.get(z0Var) != 0 ? "Completing" : "Active";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 == a7.x.f314e) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(Object obj) {
        d4.t tVar;
        Object obj2 = x.f313d;
        if (L()) {
            do {
                Object obj3 = f240d.get(this);
                if (obj3 instanceof p0) {
                    if (obj3 instanceof z0) {
                        if (z0.f326e.get((z0) obj3) != 0) {
                        }
                    }
                    obj2 = d0(obj3, new o(H(obj), false));
                }
                obj2 = x.f313d;
                break;
            } while (obj2 == x.f315f);
        }
        if (obj2 == x.f313d) {
            Throwable th = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f240d;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof z0)) {
                    if (!(obj4 instanceof p0)) {
                        tVar = x.f316g;
                        break;
                    }
                    if (th == null) {
                        th = H(obj);
                    }
                    p0 p0Var = (p0) obj4;
                    if (p0Var.b()) {
                        c1 M = M(p0Var);
                        if (M != null) {
                            z0 z0Var = new z0(M, th);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, p0Var, z0Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != p0Var) {
                                    break;
                                }
                            }
                            W(M, th);
                            tVar = x.f313d;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object d02 = d0(obj4, new o(th, false));
                        if (d02 == x.f313d) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        if (d02 != x.f315f) {
                            obj2 = d02;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        if (z0.f328g.get((z0) obj4) == x.f317h) {
                            tVar = x.f316g;
                        } else {
                            boolean e8 = ((z0) obj4).e();
                            if (th == null) {
                                th = H(obj);
                            }
                            ((z0) obj4).a(th);
                            Throwable c8 = e8 ? null : ((z0) obj4).c();
                            if (c8 != null) {
                                W(((z0) obj4).f329d, c8);
                            }
                            tVar = x.f313d;
                        }
                    }
                }
            }
            obj2 = tVar;
        }
        if (obj2 != x.f313d && obj2 != x.f314e) {
            if (obj2 == x.f316g) {
                return false;
            }
            y(obj2);
            return true;
        }
        return true;
    }

    public void C(CancellationException cancellationException) {
        B(cancellationException);
    }

    public final boolean D(Throwable th) {
        if (R()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        k kVar = (k) f241e.get(this);
        return (kVar == null || kVar == e1.f253d) ? z3 : kVar.c(th) || z3;
    }

    public String E() {
        return "Job was cancelled";
    }

    public boolean F(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return B(th) && K();
    }

    public final void G(p0 p0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f241e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        if (kVar != null) {
            kVar.a();
            atomicReferenceFieldUpdater.set(this, e1.f253d);
        }
        a5.c cVar = null;
        o oVar = obj instanceof o ? (o) obj : null;
        Throwable th = oVar != null ? oVar.f286a : null;
        if (p0Var instanceof w0) {
            try {
                ((w0) p0Var).l(th);
                return;
            } catch (Throwable th2) {
                O(new a5.c("Exception in completion handler " + p0Var + " for " + this, th2));
                return;
            }
        }
        c1 d8 = p0Var.d();
        if (d8 != null) {
            d8.e(new f7.h(1), 1);
            Object obj2 = f7.j.f2783d.get(d8);
            q6.i.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (f7.j jVar = (f7.j) obj2; !jVar.equals(d8); jVar = jVar.h()) {
                if (jVar instanceof w0) {
                    try {
                        ((w0) jVar).l(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            s6.a.e(cVar, th3);
                        } else {
                            cVar = new a5.c("Exception in completion handler " + jVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                O(cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable H(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        a1 a1Var = (a1) ((g1) obj);
        Object obj2 = f240d.get(a1Var);
        if (obj2 instanceof z0) {
            cancellationException = ((z0) obj2).c();
        } else if (obj2 instanceof o) {
            cancellationException = ((o) obj2).f286a;
        } else {
            if (obj2 instanceof p0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new t0("Parent job is ".concat(c0(obj2)), cancellationException, a1Var) : cancellationException2;
    }

    public final Object I(z0 z0Var, Object obj) {
        Throwable J;
        o oVar = obj instanceof o ? (o) obj : null;
        Throwable th = oVar != null ? oVar.f286a : null;
        synchronized (z0Var) {
            z0Var.e();
            ArrayList f6 = z0Var.f(th);
            J = J(z0Var, f6);
            if (J != null && f6.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f6.size()));
                int size = f6.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = f6.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != J && th2 != J && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        s6.a.e(J, th2);
                    }
                }
            }
        }
        if (J != null && J != th) {
            obj = new o(J, false);
        }
        if (J != null && (D(J) || N(J))) {
            q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            o.f285b.compareAndSet((o) obj, 0, 1);
        }
        X(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f240d;
        Object q0Var = obj instanceof p0 ? new q0((p0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, z0Var, q0Var) && atomicReferenceFieldUpdater.get(this) == z0Var) {
        }
        G(z0Var, obj);
        return obj;
    }

    public final Throwable J(z0 z0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (z0Var.e()) {
                return new t0(E(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i8);
            i8++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof m1) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof m1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean K() {
        return true;
    }

    public boolean L() {
        return this instanceof m;
    }

    public final c1 M(p0 p0Var) {
        c1 d8 = p0Var.d();
        if (d8 != null) {
            return d8;
        }
        if (p0Var instanceof g0) {
            return new c1();
        }
        if (p0Var instanceof w0) {
            a0((w0) p0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + p0Var).toString());
    }

    public boolean N(Throwable th) {
        return false;
    }

    public final void P(s0 s0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f241e;
        e1 e1Var = e1.f253d;
        if (s0Var == null) {
            atomicReferenceFieldUpdater.set(this, e1Var);
            return;
        }
        s0Var.start();
        k j7 = s0Var.j(this);
        atomicReferenceFieldUpdater.set(this, j7);
        if (f240d.get(this) instanceof p0) {
            return;
        }
        j7.a();
        atomicReferenceFieldUpdater.set(this, e1Var);
    }

    public final e0 Q(boolean z3, w0 w0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e1 e1Var;
        boolean z7;
        boolean e8;
        w0Var.f309g = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f240d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z8 = obj instanceof g0;
            e1Var = e1.f253d;
            z7 = true;
            if (!z8) {
                if (!(obj instanceof p0)) {
                    z7 = false;
                    break;
                }
                p0 p0Var = (p0) obj;
                c1 d8 = p0Var.d();
                if (d8 == null) {
                    a0((w0) obj);
                } else {
                    if (w0Var.k()) {
                        z0 z0Var = p0Var instanceof z0 ? (z0) p0Var : null;
                        Throwable c8 = z0Var != null ? z0Var.c() : null;
                        if (c8 == null) {
                            e8 = d8.e(w0Var, 5);
                        } else if (z3) {
                            w0Var.l(c8);
                            return e1Var;
                        }
                    } else {
                        e8 = d8.e(w0Var, 1);
                    }
                    if (e8) {
                        break;
                    }
                }
            } else {
                g0 g0Var = (g0) obj;
                if (g0Var.f257d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Z(g0Var);
            }
        }
        if (z7) {
            return w0Var;
        }
        if (z3) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            o oVar = obj2 instanceof o ? (o) obj2 : null;
            w0Var.l(oVar != null ? oVar.f286a : null);
        }
        return e1Var;
    }

    public boolean R() {
        return this instanceof c;
    }

    public final boolean S(Object obj) {
        Object d02;
        do {
            d02 = d0(f240d.get(this), obj);
            if (d02 == x.f313d) {
                return false;
            }
            if (d02 == x.f314e) {
                return true;
            }
        } while (d02 == x.f315f);
        y(d02);
        return true;
    }

    public final Object T(Object obj) {
        Object d02;
        do {
            d02 = d0(f240d.get(this), obj);
            if (d02 == x.f313d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                o oVar = obj instanceof o ? (o) obj : null;
                throw new IllegalStateException(str, oVar != null ? oVar.f286a : null);
            }
        } while (d02 == x.f315f);
        return d02;
    }

    public String U() {
        return getClass().getSimpleName();
    }

    public final void W(c1 c1Var, Throwable th) {
        c1Var.e(new f7.h(4), 4);
        Object obj = f7.j.f2783d.get(c1Var);
        q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        a5.c cVar = null;
        for (f7.j jVar = (f7.j) obj; !jVar.equals(c1Var); jVar = jVar.h()) {
            if ((jVar instanceof w0) && ((w0) jVar).k()) {
                try {
                    ((w0) jVar).l(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        s6.a.e(cVar, th2);
                    } else {
                        cVar = new a5.c("Exception in completion handler " + jVar + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            O(cVar);
        }
        D(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [a7.o0] */
    public final void Z(g0 g0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c1 c1Var = new c1();
        if (!g0Var.f257d) {
            c1Var = new o0(c1Var);
        }
        do {
            atomicReferenceFieldUpdater = f240d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, g0Var, c1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == g0Var);
    }

    @Override // a7.s0
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new t0(E(), null, this);
        }
        C(cancellationException);
    }

    public final void a0(w0 w0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c1 c1Var = new c1();
        w0Var.getClass();
        f7.j.f2784e.set(c1Var, w0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7.j.f2783d;
        atomicReferenceFieldUpdater2.set(c1Var, w0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(w0Var) == w0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(w0Var, w0Var, c1Var)) {
                    if (atomicReferenceFieldUpdater2.get(w0Var) != w0Var) {
                        break;
                    }
                }
                c1Var.g(w0Var);
                break loop0;
            }
            break;
        }
        f7.j h8 = w0Var.h();
        do {
            atomicReferenceFieldUpdater = f240d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, w0Var, h8)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == w0Var);
    }

    @Override // a7.s0
    public boolean b() {
        Object obj = f240d.get(this);
        return (obj instanceof p0) && ((p0) obj).b();
    }

    public final int b0(Object obj) {
        boolean z3 = obj instanceof g0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f240d;
        if (z3) {
            if (((g0) obj).f257d) {
                return 0;
            }
            g0 g0Var = x.f318j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Y();
            return 1;
        }
        if (!(obj instanceof o0)) {
            return 0;
        }
        c1 c1Var = ((o0) obj).f287d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Y();
        return 1;
    }

    @Override // g6.h
    public final g6.h c(g6.h hVar) {
        return a.a.v(this, hVar);
    }

    public final Object d0(Object obj, Object obj2) {
        if (!(obj instanceof p0)) {
            return x.f313d;
        }
        if (((obj instanceof g0) || (obj instanceof w0)) && !(obj instanceof l) && !(obj2 instanceof o)) {
            p0 p0Var = (p0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f240d;
            Object q0Var = obj2 instanceof p0 ? new q0((p0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, p0Var, q0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != p0Var) {
                    return x.f315f;
                }
            }
            X(obj2);
            G(p0Var, obj2);
            return obj2;
        }
        p0 p0Var2 = (p0) obj;
        c1 M = M(p0Var2);
        if (M == null) {
            return x.f315f;
        }
        z0 z0Var = p0Var2 instanceof z0 ? (z0) p0Var2 : null;
        if (z0Var == null) {
            z0Var = new z0(M, null);
        }
        synchronized (z0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = z0.f326e;
            if (atomicIntegerFieldUpdater.get(z0Var) != 0) {
                return x.f313d;
            }
            atomicIntegerFieldUpdater.set(z0Var, 1);
            if (z0Var != p0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f240d;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, p0Var2, z0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != p0Var2) {
                        return x.f315f;
                    }
                }
            }
            boolean e8 = z0Var.e();
            o oVar = obj2 instanceof o ? (o) obj2 : null;
            if (oVar != null) {
                z0Var.a(oVar.f286a);
            }
            Throwable c8 = e8 ? null : z0Var.c();
            if (c8 != null) {
                W(M, c8);
            }
            l V = V(M);
            if (V != null && e0(z0Var, V, obj2)) {
                return x.f314e;
            }
            M.e(new f7.h(2), 2);
            l V2 = V(M);
            return (V2 == null || !e0(z0Var, V2, obj2)) ? I(z0Var, obj2) : x.f314e;
        }
    }

    public final boolean e0(z0 z0Var, l lVar, Object obj) {
        while (x.k(lVar.f270h, false, new y0(this, z0Var, lVar, obj)) == e1.f253d) {
            lVar = V(lVar);
            if (lVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // g6.h
    public final Object g(Object obj, p6.e eVar) {
        return eVar.g(obj, this);
    }

    @Override // g6.f
    public final g6.g getKey() {
        return r.f297e;
    }

    @Override // a7.s0
    public final k j(a1 a1Var) {
        l lVar = new l(a1Var);
        lVar.f309g = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f240d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (g0Var.f257d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Z(g0Var);
            } else {
                boolean z3 = obj instanceof p0;
                e1 e1Var = e1.f253d;
                if (!z3) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    o oVar = obj2 instanceof o ? (o) obj2 : null;
                    lVar.l(oVar != null ? oVar.f286a : null);
                    return e1Var;
                }
                c1 d8 = ((p0) obj).d();
                if (d8 == null) {
                    a0((w0) obj);
                } else if (!d8.e(lVar, 7)) {
                    boolean e8 = d8.e(lVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof z0) {
                        r4 = ((z0) obj3).c();
                    } else {
                        o oVar2 = obj3 instanceof o ? (o) obj3 : null;
                        if (oVar2 != null) {
                            r4 = oVar2.f286a;
                        }
                    }
                    lVar.l(r4);
                    if (e8) {
                        break loop0;
                    }
                    return e1Var;
                }
            }
        }
        return lVar;
    }

    @Override // g6.h
    public final g6.f l(g6.g gVar) {
        return a.a.j(this, gVar);
    }

    @Override // a7.s0
    public final CancellationException p() {
        CancellationException cancellationException;
        Object obj = f240d.get(this);
        if (!(obj instanceof z0)) {
            if (obj instanceof p0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof o)) {
                return new t0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((o) obj).f286a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new t0(E(), th, this) : cancellationException;
        }
        Throwable c8 = ((z0) obj).c();
        if (c8 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c8 instanceof CancellationException ? (CancellationException) c8 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = E();
        }
        return new t0(concat, c8, this);
    }

    @Override // a7.s0
    public final e0 q(boolean z3, boolean z7, v0 v0Var) {
        return Q(z7, z3 ? new r0(v0Var) : new f0(1, v0Var));
    }

    @Override // a7.s0
    public final Object r(i6.c cVar) {
        Object obj;
        c6.m mVar;
        do {
            obj = f240d.get(this);
            boolean z3 = obj instanceof p0;
            mVar = c6.m.f1757a;
            if (!z3) {
                x.d(cVar.f());
                return mVar;
            }
        } while (b0(obj) < 0);
        h hVar = new h(1, m.a.G(cVar));
        hVar.t();
        int i = 1;
        hVar.w(new e(i, x.k(this, true, new j(hVar, i))));
        Object s5 = hVar.s();
        h6.a aVar = h6.a.f3204d;
        if (s5 != aVar) {
            s5 = mVar;
        }
        return s5 == aVar ? s5 : mVar;
    }

    @Override // a7.s0
    public final boolean start() {
        int b02;
        do {
            b02 = b0(f240d.get(this));
            if (b02 == 0) {
                return false;
            }
        } while (b02 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(U() + '{' + c0(f240d.get(this)) + '}');
        sb.append('@');
        sb.append(x.g(this));
        return sb.toString();
    }

    @Override // g6.h
    public final g6.h v(g6.g gVar) {
        return a.a.s(this, gVar);
    }

    @Override // a7.s0
    public final e0 w(p6.c cVar) {
        return Q(true, new f0(1, cVar));
    }

    public void z(Object obj) {
        y(obj);
    }

    public void Y() {
    }

    public void O(a5.c cVar) {
        throw cVar;
    }

    public void X(Object obj) {
    }

    public void y(Object obj) {
    }
}
