package k0;

import a.AbstractC0016a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p0.AbstractC0084a;

/* renamed from: k0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0058t {

    /* renamed from: c, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f939c;

    /* renamed from: d, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f940d;

    /* renamed from: e, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f941e;

    /* renamed from: f, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f942f;

    /* renamed from: g, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f943g;

    /* renamed from: a, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f937a = new io.flutter.plugin.editing.a(5, "RESUME_TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final io.flutter.plugin.editing.a f938b = new io.flutter.plugin.editing.a(5, "CLOSED_EMPTY");

    /* renamed from: h, reason: collision with root package name */
    public static final A f944h = new A(false);

    /* renamed from: i, reason: collision with root package name */
    public static final A f945i = new A(true);

    static {
        int i2 = 5;
        f939c = new io.flutter.plugin.editing.a(i2, "COMPLETING_ALREADY");
        f940d = new io.flutter.plugin.editing.a(i2, "COMPLETING_WAITING_CHILDREN");
        f941e = new io.flutter.plugin.editing.a(i2, "COMPLETING_RETRY");
        f942f = new io.flutter.plugin.editing.a(i2, "TOO_LATE_TO_CANCEL");
        f943g = new io.flutter.plugin.editing.a(i2, "SEALED");
    }

    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0044e b(W.d dVar) {
        C0044e c0044e;
        C0044e c0044e2;
        if (!(dVar instanceof p0.h)) {
            return new C0044e(dVar, 1);
        }
        p0.h hVar = (p0.h) dVar;
        hVar.getClass();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p0.h.f1147i;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            io.flutter.plugin.editing.a aVar = AbstractC0084a.f1137d;
            c0044e = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, aVar);
                c0044e2 = null;
                break;
            }
            if (obj instanceof C0044e) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0044e2 = (C0044e) obj;
                break loop0;
            }
            if (obj != aVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0044e2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0044e.f913h;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0044e2);
            if (!(obj2 instanceof C0049j) || ((C0049j) obj2).f922c == null) {
                C0044e.f912g.set(c0044e2, 536870911);
                atomicReferenceFieldUpdater2.set(c0044e2, C0041b.f908a);
                c0044e = c0044e2;
            } else {
                c0044e2.n();
            }
            if (c0044e != null) {
                return c0044e;
            }
        }
        return new C0044e(dVar, 2);
    }

    public static final void c(W.i iVar, Throwable th) {
        try {
            l0.b bVar = (l0.b) iVar.k(C0056q.f935b);
            if (bVar != null) {
                bVar.d(iVar, th);
            } else {
                AbstractC0084a.e(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0016a.a(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0084a.e(iVar, th);
        }
    }

    public static InterfaceC0064z d(K k2, boolean z, O o2, int i2) {
        O o3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = (i2 & 2) != 0;
        T t = (T) k2;
        t.getClass();
        if (z) {
            o3 = o2 instanceof M ? (M) o2 : null;
            if (o3 == null) {
                o3 = new J(o2);
            }
        } else {
            o3 = o2;
        }
        o3.f890e = t;
        while (true) {
            Object y2 = t.y();
            if (y2 instanceof A) {
                A a2 = (A) y2;
                if (a2.f876b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = T.f903b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(t, y2, o3)) {
                        if (atomicReferenceFieldUpdater2.get(t) != y2) {
                            break;
                        }
                    }
                    return o3;
                }
                U u2 = new U();
                Object g2 = a2.f876b ? u2 : new G(u2);
                do {
                    atomicReferenceFieldUpdater = T.f903b;
                    if (atomicReferenceFieldUpdater.compareAndSet(t, a2, g2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(t) == a2);
            } else {
                if (!(y2 instanceof H)) {
                    if (z2) {
                        C0050k c0050k = y2 instanceof C0050k ? (C0050k) y2 : null;
                        o2.h(c0050k != null ? c0050k.f925a : null);
                    }
                    return V.f905b;
                }
                U c2 = ((H) y2).c();
                if (c2 == null) {
                    e0.h.c(y2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    t.H((O) y2);
                } else {
                    InterfaceC0064z interfaceC0064z = V.f905b;
                    if (z && (y2 instanceof Q)) {
                        synchronized (y2) {
                            try {
                                th = ((Q) y2).d();
                                if (th != null) {
                                    if ((o2 instanceof C0048i) && !((Q) y2).f()) {
                                    }
                                }
                                if (t.l((H) y2, c2, o3)) {
                                    if (th == null) {
                                        return o3;
                                    }
                                    interfaceC0064z = o3;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z2) {
                            o2.h(th);
                        }
                        return interfaceC0064z;
                    }
                    if (t.l((H) y2, c2, o3)) {
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
        C0052m c0052m = C0052m.f929e;
        boolean booleanValue = ((Boolean) j2.f(bool, c0052m)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar.f(bool, c0052m)).booleanValue();
        if (booleanValue || booleanValue2) {
            W.j jVar = W.j.f449b;
            W.i iVar2 = (W.i) j2.f(jVar, new C0052m(2, 2));
            Object obj = iVar;
            if (booleanValue2) {
                obj = iVar.f(jVar, C0052m.f928d);
            }
            c2 = iVar2.c((W.i) obj);
        } else {
            c2 = j2.c(iVar);
        }
        q0.d dVar = AbstractC0063y.f950a;
        return (c2 == dVar || c2.k(W.e.f448b) != null) ? c2 : c2.c(dVar);
    }

    public static final void g(C0044e c0044e, W.d dVar, boolean z) {
        Object obj = C0044e.f913h.get(c0044e);
        Throwable e2 = c0044e.e(obj);
        Object h2 = e2 != null ? AbstractC0016a.h(e2) : c0044e.f(obj);
        if (!z) {
            dVar.d(h2);
            return;
        }
        e0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        p0.h hVar = (p0.h) dVar;
        Y.b bVar = hVar.f1149f;
        W.i iVar = bVar.f454c;
        e0.h.b(iVar);
        Object m2 = AbstractC0084a.m(iVar, hVar.f1151h);
        if (m2 != AbstractC0084a.f1139f) {
            i(bVar, iVar);
        }
        try {
            bVar.d(h2);
        } finally {
            AbstractC0084a.h(iVar, m2);
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
            h2 = AbstractC0016a.h(th);
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
        if (bVar == 0 || iVar.k(c0.f911b) == null) {
            return;
        }
        do {
            bVar = bVar.g();
        } while (bVar != 0);
    }
}
