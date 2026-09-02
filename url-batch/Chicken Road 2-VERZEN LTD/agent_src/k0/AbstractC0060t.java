package k0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p0.AbstractC0090a;

/* renamed from: k0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0060t {

    /* renamed from: c, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f886c;

    /* renamed from: d, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f887d;

    /* renamed from: e, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f888e;

    /* renamed from: f, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f889f;

    /* renamed from: g, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f890g;

    /* renamed from: a, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f884a = new io.flutter.plugin.platform.c(4, "RESUME_TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f885b = new io.flutter.plugin.platform.c(4, "CLOSED_EMPTY");

    /* renamed from: h, reason: collision with root package name */
    public static final A f891h = new A(false);

    /* renamed from: i, reason: collision with root package name */
    public static final A f892i = new A(true);

    static {
        int i2 = 4;
        f886c = new io.flutter.plugin.platform.c(i2, "COMPLETING_ALREADY");
        f887d = new io.flutter.plugin.platform.c(i2, "COMPLETING_WAITING_CHILDREN");
        f888e = new io.flutter.plugin.platform.c(i2, "COMPLETING_RETRY");
        f889f = new io.flutter.plugin.platform.c(i2, "TOO_LATE_TO_CANCEL");
        f890g = new io.flutter.plugin.platform.c(i2, "SEALED");
    }

    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0046e b(W.d dVar) {
        C0046e c0046e;
        C0046e c0046e2;
        if (!(dVar instanceof p0.h)) {
            return new C0046e(dVar, 1);
        }
        p0.h hVar = (p0.h) dVar;
        hVar.getClass();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p0.h.f1139i;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            io.flutter.plugin.platform.c cVar = AbstractC0090a.f1129d;
            c0046e = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, cVar);
                c0046e2 = null;
                break;
            }
            if (obj instanceof C0046e) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, cVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0046e2 = (C0046e) obj;
                break loop0;
            }
            if (obj != cVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0046e2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0046e.f860h;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0046e2);
            if (!(obj2 instanceof C0051j) || ((C0051j) obj2).f869c == null) {
                C0046e.f859g.set(c0046e2, 536870911);
                atomicReferenceFieldUpdater2.set(c0046e2, C0043b.f855a);
                c0046e = c0046e2;
            } else {
                c0046e2.n();
            }
            if (c0046e != null) {
                return c0046e;
            }
        }
        return new C0046e(dVar, 2);
    }

    public static final void c(W.i iVar, Throwable th) {
        try {
            l0.b bVar = (l0.b) iVar.k(C0058q.f882b);
            if (bVar != null) {
                bVar.d(iVar, th);
            } else {
                AbstractC0090a.e(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                a.a.a(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0090a.e(iVar, th);
        }
    }

    public static InterfaceC0066z d(K k2, boolean z2, O o2, int i2) {
        O o3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        boolean z3 = (i2 & 2) != 0;
        T t2 = (T) k2;
        t2.getClass();
        if (z2) {
            o3 = o2 instanceof M ? (M) o2 : null;
            if (o3 == null) {
                o3 = new J(o2);
            }
        } else {
            o3 = o2;
        }
        o3.f837e = t2;
        while (true) {
            Object y2 = t2.y();
            if (y2 instanceof A) {
                A a2 = (A) y2;
                if (a2.f823b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = T.f850b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(t2, y2, o3)) {
                        if (atomicReferenceFieldUpdater2.get(t2) != y2) {
                            break;
                        }
                    }
                    return o3;
                }
                U u = new U();
                Object g2 = a2.f823b ? u : new G(u);
                do {
                    atomicReferenceFieldUpdater = T.f850b;
                    if (atomicReferenceFieldUpdater.compareAndSet(t2, a2, g2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(t2) == a2);
            } else {
                if (!(y2 instanceof H)) {
                    if (z3) {
                        C0052k c0052k = y2 instanceof C0052k ? (C0052k) y2 : null;
                        o2.h(c0052k != null ? c0052k.f872a : null);
                    }
                    return V.f852b;
                }
                U c2 = ((H) y2).c();
                if (c2 == null) {
                    e0.h.c(y2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    t2.H((O) y2);
                } else {
                    InterfaceC0066z interfaceC0066z = V.f852b;
                    if (z2 && (y2 instanceof Q)) {
                        synchronized (y2) {
                            try {
                                th = ((Q) y2).d();
                                if (th != null) {
                                    if ((o2 instanceof C0050i) && !((Q) y2).f()) {
                                    }
                                }
                                if (t2.l((H) y2, c2, o3)) {
                                    if (th == null) {
                                        return o3;
                                    }
                                    interfaceC0066z = o3;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z3) {
                            o2.h(th);
                        }
                        return interfaceC0066z;
                    }
                    if (t2.l((H) y2, c2, o3)) {
                        return o3;
                    }
                }
            }
        }
    }

    public static final boolean e(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final W.i f(r rVar, W.i iVar) {
        W.i c2;
        W.i j2 = rVar.j();
        Boolean bool = Boolean.FALSE;
        C0054m c0054m = C0054m.f876e;
        boolean booleanValue = ((Boolean) j2.f(bool, c0054m)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar.f(bool, c0054m)).booleanValue();
        if (booleanValue || booleanValue2) {
            W.j jVar = W.j.f394b;
            W.i iVar2 = (W.i) j2.f(jVar, new C0054m(2, 2));
            Object obj = iVar;
            if (booleanValue2) {
                obj = iVar.f(jVar, C0054m.f875d);
            }
            c2 = iVar2.c((W.i) obj);
        } else {
            c2 = j2.c(iVar);
        }
        q0.d dVar = AbstractC0065y.f897a;
        return (c2 == dVar || c2.k(W.e.f393b) != null) ? c2 : c2.c(dVar);
    }

    public static final void g(C0046e c0046e, W.d dVar, boolean z2) {
        Object obj = C0046e.f860h.get(c0046e);
        Throwable e2 = c0046e.e(obj);
        Object h2 = e2 != null ? a.a.h(e2) : c0046e.f(obj);
        if (!z2) {
            dVar.d(h2);
            return;
        }
        e0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        p0.h hVar = (p0.h) dVar;
        Y.b bVar = hVar.f1141f;
        W.i iVar = bVar.f399c;
        e0.h.b(iVar);
        Object m2 = AbstractC0090a.m(iVar, hVar.f1143h);
        if (m2 != AbstractC0090a.f1131f) {
            i(bVar, iVar);
        }
        try {
            bVar.d(h2);
        } finally {
            AbstractC0090a.h(iVar, m2);
        }
    }

    public static final String h(W.d dVar) {
        Object h2;
        if (dVar instanceof p0.h) {
            return dVar.toString();
        }
        try {
            h2 = dVar + '@' + a(dVar);
        } catch (Throwable th) {
            h2 = a.a.h(th);
        }
        if (U.d.a(h2) != null) {
            h2 = dVar.getClass().getName() + '@' + a(dVar);
        }
        return (String) h2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Y.c] */
    /* JADX WARN: Type inference failed for: r1v2, types: [Y.c] */
    public static final void i(Y.b bVar, W.i iVar) {
        if (bVar == 0 || iVar.k(c0.f858b) == null) {
            return;
        }
        do {
            bVar = bVar.g();
        } while (bVar != 0);
    }
}
