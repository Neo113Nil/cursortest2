package ge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class k1 implements c1, q1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4374d = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_state$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4375e = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public k1(boolean z10) {
        this._state$volatile = z10 ? a0.j : a0.f4330i;
    }

    public static l V(le.k kVar) {
        while (kVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = le.k.f5985e;
            le.k f3 = kVar.f();
            if (f3 == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (le.k) obj;
                    if (!kVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = f3;
            }
        }
        while (true) {
            kVar = kVar.h();
            if (!kVar.i()) {
                if (kVar instanceof l) {
                    return (l) kVar;
                }
                if (kVar instanceof m1) {
                    return null;
                }
            }
        }
    }

    public static String c0(Object obj) {
        if (!(obj instanceof j1)) {
            return obj instanceof z0 ? ((z0) obj).d() ? "Active" : "New" : obj instanceof q ? "Cancelled" : "Completed";
        }
        j1 j1Var = (j1) obj;
        return j1Var.c() ? "Cancelling" : j1.f4368e.get(j1Var) == 1 ? "Completing" : "Active";
    }

    public final void A(z0 z0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4375e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        if (kVar != null) {
            kVar.a();
            atomicReferenceFieldUpdater.set(this, o1.f4383d);
        }
        com.google.android.gms.internal.measurement.d0 d0Var = null;
        q qVar = obj instanceof q ? (q) obj : null;
        Throwable th = qVar != null ? qVar.f4394a : null;
        if (z0Var instanceof g1) {
            try {
                ((g1) z0Var).l(th);
                return;
            } catch (Throwable th2) {
                N(new com.google.android.gms.internal.measurement.d0("Exception in completion handler " + z0Var + " for " + this, th2, 1));
                return;
            }
        }
        m1 e2 = z0Var.e();
        if (e2 != null) {
            e2.c(new le.i(1), 1);
            Object obj2 = le.k.f5984d.get(e2);
            obj2.getClass();
            for (le.k kVar2 = (le.k) obj2; !kVar2.equals(e2); kVar2 = kVar2.h()) {
                if (kVar2 instanceof g1) {
                    try {
                        ((g1) kVar2).l(th);
                    } catch (Throwable th3) {
                        if (d0Var != null) {
                            hd.b.a(d0Var, th3);
                        } else {
                            d0Var = new com.google.android.gms.internal.measurement.d0("Exception in completion handler " + kVar2 + " for " + this, th3, 1);
                        }
                    }
                }
            }
            if (d0Var != null) {
                N(d0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable] */
    public final Throwable B(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        k1 k1Var = (k1) ((q1) obj);
        Object obj2 = f4374d.get(k1Var);
        if (obj2 instanceof j1) {
            cancellationException = ((j1) obj2).b();
        } else if (obj2 instanceof q) {
            cancellationException = ((q) obj2).f4394a;
        } else {
            if (obj2 instanceof z0) {
                a2.r.n(obj2, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new d1("Parent job is ".concat(c0(obj2)), cancellationException, k1Var) : cancellationException2;
    }

    public final Object D(j1 j1Var, Object obj) {
        Throwable G;
        q qVar = obj instanceof q ? (q) obj : null;
        Throwable th = qVar != null ? qVar.f4394a : null;
        synchronized (j1Var) {
            j1Var.c();
            ArrayList f3 = j1Var.f(th);
            G = G(j1Var, f3);
            if (G != null && f3.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f3.size()));
                int size = f3.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = f3.get(i3);
                    i3++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != G && th2 != G && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        hd.b.a(G, th2);
                    }
                }
            }
        }
        if (G != null && G != th) {
            obj = new q(G, false);
        }
        if (G != null && (r(G) || M(G))) {
            obj.getClass();
            q.f4393b.compareAndSet((q) obj, 0, 1);
        }
        X(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4374d;
        Object a1Var = obj instanceof z0 ? new a1((z0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, j1Var, a1Var) && atomicReferenceFieldUpdater.get(this) == j1Var) {
        }
        A(j1Var, obj);
        return obj;
    }

    public final Object E() {
        Object obj = f4374d.get(this);
        if (obj instanceof z0) {
            kotlin.collections.i0.l("This job has not completed yet");
            return null;
        }
        if (obj instanceof q) {
            throw ((q) obj).f4394a;
        }
        return a0.A(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext F(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    public final Throwable G(j1 j1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (j1Var.c()) {
                return new d1(t(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof v1) {
            int size2 = arrayList.size();
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i3);
                i3++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof v1)) {
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

    @Override // ge.c1
    public final k H(k1 k1Var) {
        l lVar = new l(k1Var);
        lVar.f4352r = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4374d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                if (o0Var.f4382d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Z(o0Var);
            } else {
                boolean z10 = obj instanceof z0;
                o1 o1Var = o1.f4383d;
                if (!z10) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    q qVar = obj2 instanceof q ? (q) obj2 : null;
                    lVar.l(qVar != null ? qVar.f4394a : null);
                    return o1Var;
                }
                m1 e2 = ((z0) obj).e();
                if (e2 == null) {
                    a0((g1) obj);
                } else if (!e2.c(lVar, 7)) {
                    boolean c10 = e2.c(lVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof j1) {
                        r4 = ((j1) obj3).b();
                    } else {
                        q qVar2 = obj3 instanceof q ? (q) obj3 : null;
                        if (qVar2 != null) {
                            r4 = qVar2.f4394a;
                        }
                    }
                    lVar.l(r4);
                    if (c10) {
                        break loop0;
                    }
                    return o1Var;
                }
            }
        }
        return lVar;
    }

    public boolean I() {
        return true;
    }

    public boolean K() {
        return this instanceof n;
    }

    public final m1 L(z0 z0Var) {
        m1 e2 = z0Var.e();
        if (e2 != null) {
            return e2;
        }
        if (z0Var instanceof o0) {
            return new m1();
        }
        if (z0Var instanceof g1) {
            a0((g1) z0Var);
            return null;
        }
        a2.r.n(z0Var, "State should have list: ");
        return null;
    }

    public boolean M(Throwable th) {
        return false;
    }

    public final void O(c1 c1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4375e;
        o1 o1Var = o1.f4383d;
        if (c1Var == null) {
            atomicReferenceFieldUpdater.set(this, o1Var);
            return;
        }
        c1Var.start();
        k H = c1Var.H(this);
        atomicReferenceFieldUpdater.set(this, H);
        if (Q()) {
            H.a();
            atomicReferenceFieldUpdater.set(this, o1Var);
        }
    }

    public final m0 P(boolean z10, g1 g1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o1 o1Var;
        boolean z11;
        boolean c10;
        g1Var.f4352r = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f4374d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z12 = obj instanceof o0;
            o1Var = o1.f4383d;
            z11 = true;
            if (!z12) {
                if (!(obj instanceof z0)) {
                    z11 = false;
                    break;
                }
                z0 z0Var = (z0) obj;
                m1 e2 = z0Var.e();
                if (e2 == null) {
                    a0((g1) obj);
                } else {
                    if (g1Var.k()) {
                        j1 j1Var = z0Var instanceof j1 ? (j1) z0Var : null;
                        Throwable b10 = j1Var != null ? j1Var.b() : null;
                        if (b10 == null) {
                            c10 = e2.c(g1Var, 5);
                        } else if (z10) {
                            g1Var.l(b10);
                            return o1Var;
                        }
                    } else {
                        c10 = e2.c(g1Var, 1);
                    }
                    if (c10) {
                        break;
                    }
                }
            } else {
                o0 o0Var = (o0) obj;
                if (o0Var.f4382d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Z(o0Var);
            }
        }
        if (z11) {
            return g1Var;
        }
        if (z10) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            q qVar = obj2 instanceof q ? (q) obj2 : null;
            g1Var.l(qVar != null ? qVar.f4394a : null);
        }
        return o1Var;
    }

    public final boolean Q() {
        return !(f4374d.get(this) instanceof z0);
    }

    public boolean R() {
        return this instanceof c;
    }

    public final boolean S(Object obj) {
        Object d02;
        do {
            d02 = d0(f4374d.get(this), obj);
            if (d02 == a0.f4326d) {
                return false;
            }
            if (d02 == a0.f4327e) {
                return true;
            }
        } while (d02 == a0.f4328f);
        k(d02);
        return true;
    }

    public final Object T(Object obj) {
        Object d02;
        do {
            d02 = d0(f4374d.get(this), obj);
            if (d02 == a0.f4326d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                q qVar = obj instanceof q ? (q) obj : null;
                throw new IllegalStateException(str, qVar != null ? qVar.f4394a : null);
            }
        } while (d02 == a0.f4328f);
        return d02;
    }

    public String U() {
        return getClass().getSimpleName();
    }

    public final void W(m1 m1Var, Throwable th) {
        m1Var.c(new le.i(4), 4);
        Object obj = le.k.f5984d.get(m1Var);
        obj.getClass();
        com.google.android.gms.internal.measurement.d0 d0Var = null;
        for (le.k kVar = (le.k) obj; !kVar.equals(m1Var); kVar = kVar.h()) {
            if ((kVar instanceof g1) && ((g1) kVar).k()) {
                try {
                    ((g1) kVar).l(th);
                } catch (Throwable th2) {
                    if (d0Var != null) {
                        hd.b.a(d0Var, th2);
                    } else {
                        d0Var = new com.google.android.gms.internal.measurement.d0("Exception in completion handler " + kVar + " for " + this, th2, 1);
                    }
                }
            }
        }
        if (d0Var != null) {
            N(d0Var);
        }
        r(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ge.y0] */
    public final void Z(o0 o0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m1 m1Var = new m1();
        if (!o0Var.f4382d) {
            m1Var = new y0(m1Var);
        }
        do {
            atomicReferenceFieldUpdater = f4374d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o0Var, m1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == o0Var);
    }

    @Override // ge.c1
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new d1(t(), null, this);
        }
        q(cancellationException);
    }

    public final void a0(g1 g1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m1 m1Var = new m1();
        g1Var.getClass();
        le.k.f5985e.set(m1Var, g1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = le.k.f5984d;
        atomicReferenceFieldUpdater2.set(m1Var, g1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(g1Var) == g1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(g1Var, g1Var, m1Var)) {
                    if (atomicReferenceFieldUpdater2.get(g1Var) != g1Var) {
                        break;
                    }
                }
                m1Var.g(g1Var);
                break loop0;
            }
            break;
        }
        le.k h10 = g1Var.h();
        do {
            atomicReferenceFieldUpdater = f4374d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, g1Var, h10)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == g1Var);
    }

    public final int b0(Object obj) {
        boolean z10 = obj instanceof o0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4374d;
        if (z10) {
            if (((o0) obj).f4382d) {
                return 0;
            }
            o0 o0Var = a0.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Y();
            return 1;
        }
        if (!(obj instanceof y0)) {
            return 0;
        }
        m1 m1Var = ((y0) obj).f4422d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Y();
        return 1;
    }

    @Override // ge.c1
    public boolean d() {
        Object obj = f4374d.get(this);
        return (obj instanceof z0) && ((z0) obj).d();
    }

    public final Object d0(Object obj, Object obj2) {
        if (!(obj instanceof z0)) {
            return a0.f4326d;
        }
        if (((obj instanceof o0) || (obj instanceof g1)) && !(obj instanceof l) && !(obj2 instanceof q)) {
            z0 z0Var = (z0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4374d;
            Object a1Var = obj2 instanceof z0 ? new a1((z0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, z0Var, a1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != z0Var) {
                    return a0.f4328f;
                }
            }
            X(obj2);
            A(z0Var, obj2);
            return obj2;
        }
        z0 z0Var2 = (z0) obj;
        m1 L = L(z0Var2);
        if (L == null) {
            return a0.f4328f;
        }
        j1 j1Var = z0Var2 instanceof j1 ? (j1) z0Var2 : null;
        if (j1Var == null) {
            j1Var = new j1(L, null);
        }
        synchronized (j1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j1.f4368e;
            if (atomicIntegerFieldUpdater.get(j1Var) == 1) {
                return a0.f4326d;
            }
            atomicIntegerFieldUpdater.set(j1Var, 1);
            if (j1Var != z0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4374d;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, z0Var2, j1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != z0Var2) {
                        return a0.f4328f;
                    }
                }
            }
            boolean c10 = j1Var.c();
            q qVar = obj2 instanceof q ? (q) obj2 : null;
            if (qVar != null) {
                j1Var.a(qVar.f4394a);
            }
            Throwable b10 = c10 ? null : j1Var.b();
            if (b10 != null) {
                W(L, b10);
            }
            l V = V(L);
            if (V != null && e0(j1Var, V, obj2)) {
                return a0.f4327e;
            }
            L.c(new le.i(2), 2);
            l V2 = V(L);
            return (V2 == null || !e0(j1Var, V2, obj2)) ? D(j1Var, obj2) : a0.f4327e;
        }
    }

    public final boolean e0(j1 j1Var, l lVar, Object obj) {
        while (a0.p(lVar.f4376s, false, new i1(this, j1Var, lVar, obj)) == o1.f4383d) {
            lVar = V(lVar);
            if (lVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return u.f4403e;
    }

    public void l(Object obj) {
        k(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 == ge.a0.f4327e) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(Object obj) {
        a8.f fVar;
        Object obj2 = a0.f4326d;
        if (K()) {
            do {
                Object obj3 = f4374d.get(this);
                if (obj3 instanceof z0) {
                    if (obj3 instanceof j1) {
                        if (j1.f4368e.get((j1) obj3) == 1) {
                        }
                    }
                    obj2 = d0(obj3, new q(B(obj), false));
                }
                obj2 = a0.f4326d;
                break;
            } while (obj2 == a0.f4328f);
        }
        if (obj2 == a0.f4326d) {
            Throwable th = null;
            loop1: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4374d;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof j1)) {
                    if (!(obj4 instanceof z0)) {
                        fVar = a0.g;
                        break;
                    }
                    if (th == null) {
                        th = B(obj);
                    }
                    z0 z0Var = (z0) obj4;
                    if (z0Var.d()) {
                        m1 L = L(z0Var);
                        if (L != null) {
                            j1 j1Var = new j1(L, th);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, z0Var, j1Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != z0Var) {
                                    break;
                                }
                            }
                            W(L, th);
                            fVar = a0.f4326d;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object d02 = d0(obj4, new q(th, false));
                        if (d02 == a0.f4326d) {
                            a2.r.n(obj4, "Cannot happen in ");
                            return false;
                        }
                        if (d02 != a0.f4328f) {
                            obj2 = d02;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        if (j1.f4370r.get((j1) obj4) == a0.f4329h) {
                            fVar = a0.g;
                        } else {
                            boolean c10 = ((j1) obj4).c();
                            if (th == null) {
                                th = B(obj);
                            }
                            ((j1) obj4).a(th);
                            Throwable b10 = c10 ? null : ((j1) obj4).b();
                            if (b10 != null) {
                                W(((j1) obj4).f4371d, b10);
                            }
                            fVar = a0.f4326d;
                        }
                    }
                }
            }
            obj2 = fVar;
        }
        if (obj2 != a0.f4326d && obj2 != a0.f4327e) {
            if (obj2 == a0.g) {
                return false;
            }
            k(obj2);
            return true;
        }
        return true;
    }

    @Override // ge.c1
    public final m0 o(Function1 function1) {
        return P(true, new n0(1, function1));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    public void q(CancellationException cancellationException) {
        n(cancellationException);
    }

    public final boolean r(Throwable th) {
        if (R()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        k kVar = (k) f4375e.get(this);
        return (kVar == null || kVar == o1.f4383d) ? z10 : kVar.b(th) || z10;
    }

    @Override // ge.c1
    public final boolean start() {
        int b02;
        do {
            b02 = b0(f4374d.get(this));
            if (b02 == 0) {
                return false;
            }
        } while (b02 != 1);
        return true;
    }

    public String t() {
        return "Job was cancelled";
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(U() + '{' + c0(f4374d.get(this)) + '}');
        sb2.append('@');
        sb2.append(a0.m(this));
        return sb2.toString();
    }

    @Override // ge.c1
    public final m0 u(boolean z10, boolean z11, f1 f1Var) {
        return P(z11, z10 ? new b1(f1Var) : new n0(1, f1Var));
    }

    @Override // ge.c1
    public final Object w(ld.a aVar) {
        Object obj;
        do {
            obj = f4374d.get(this);
            if (!(obj instanceof z0)) {
                a0.j(aVar.getContext());
                return Unit.f5554a;
            }
        } while (b0(obj) < 0);
        h hVar = new h(1, md.f.b(aVar));
        hVar.s();
        hVar.v(new e(2, a0.p(this, true, new j(hVar, 1))));
        Object r9 = hVar.r();
        md.a aVar2 = md.a.f6622d;
        if (r9 != aVar2) {
            r9 = Unit.f5554a;
        }
        return r9 == aVar2 ? r9 : Unit.f5554a;
    }

    @Override // ge.c1
    public final CancellationException x() {
        CancellationException cancellationException;
        Object obj = f4374d.get(this);
        if (obj instanceof j1) {
            Throwable b10 = ((j1) obj).b();
            if (b10 == null) {
                a2.r.n(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = b10 instanceof CancellationException ? (CancellationException) b10 : null;
            return cancellationException == null ? new d1(concat, b10, this) : cancellationException;
        }
        if (obj instanceof z0) {
            a2.r.n(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof q)) {
            return new d1(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((q) obj).f4394a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new d1(t(), th, this) : cancellationException;
    }

    public boolean y(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return n(th) && I();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object z(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public void Y() {
    }

    public void N(com.google.android.gms.internal.measurement.d0 d0Var) {
        throw d0Var;
    }

    public void X(Object obj) {
    }

    public void k(Object obj) {
    }
}
