package I4;

import D4.AbstractC0020u;
import D4.AbstractC0024y;
import D4.C0016p;
import D4.C0017q;
import D4.C0021v;
import D4.O;
import D4.X;
import D4.g0;
import D4.o0;
import D4.p0;
import D4.v0;
import G0.C0051a;
import b2.AbstractC0279e;
import f4.AbstractC0432i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import m4.AbstractC1295c;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0051a f1280a = new C0051a("NO_DECISION", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final C0051a f1281b = new C0051a("CLOSED", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final C0051a f1282c = new C0051a("UNDEFINED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final C0051a f1283d = new C0051a("REUSABLE_CLAIMED", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0051a f1284e = new C0051a("CONDITION_FALSE", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final C0051a f1285f = new C0051a("NO_THREAD_ELEMENTS", 2);

    public static final C1.b a(InterfaceC1441l interfaceC1441l, Object obj, C1.b bVar) {
        try {
            interfaceC1441l.invoke(obj);
        } catch (Throwable th) {
            if (bVar == null || bVar.getCause() == th) {
                return new C1.b("Exception in undelivered element handler for " + obj, th);
            }
            K1.b.C(bVar, th);
        }
        return bVar;
    }

    public static final void b(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(AbstractC0279e.d(i2, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object c(u uVar, long j2, InterfaceC1445p interfaceC1445p) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f1323c >= j2 && !uVar.c()) {
                return uVar;
            }
            Object obj = d.f1288a.get(uVar);
            C0051a c0051a = f1281b;
            if (obj == c0051a) {
                return c0051a;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) interfaceC1445p.invoke(Long.valueOf(uVar.f1323c + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = d.f1288a;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }

    public static final u d(Object obj) {
        if (obj != f1281b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void e(Throwable th, InterfaceC1223i interfaceC1223i) {
        Throwable runtimeException;
        Iterator it = f.f1291a.iterator();
        while (it.hasNext()) {
            try {
                ((E4.b) it.next()).C(th, interfaceC1223i);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    K1.b.C(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            K1.b.C(th, new g(interfaceC1223i));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean f(Object obj) {
        return obj == f1281b;
    }

    public static final Object g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void h(InterfaceC1223i interfaceC1223i, Object obj) {
        if (obj == f1285f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object q5 = interfaceC1223i.q(null, x.f1327g);
            kotlin.jvm.internal.i.c(q5, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0279e.o(q5);
            throw null;
        }
        z zVar = (z) obj;
        o0[] o0VarArr = zVar.f1333b;
        int length = o0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        o0 o0Var = o0VarArr[length];
        kotlin.jvm.internal.i.b(null);
        Object obj2 = zVar.f1332a[length];
        throw null;
    }

    public static final void i(InterfaceC1218d interfaceC1218d, Object obj, InterfaceC1441l interfaceC1441l) {
        if (!(interfaceC1218d instanceof h)) {
            interfaceC1218d.resumeWith(obj);
            return;
        }
        h hVar = (h) interfaceC1218d;
        Throwable a6 = AbstractC0432i.a(obj);
        Object c0017q = a6 == null ? interfaceC1441l != null ? new C0017q(obj, interfaceC1441l) : obj : new C0016p(a6, false);
        AbstractC1295c abstractC1295c = hVar.f1295e;
        abstractC1295c.getContext();
        AbstractC0020u abstractC0020u = hVar.f1294d;
        if (abstractC0020u.E()) {
            hVar.f1296f = c0017q;
            hVar.f458c = 1;
            abstractC0020u.C(abstractC1295c.getContext(), hVar);
            return;
        }
        O a7 = p0.a();
        if (a7.J()) {
            hVar.f1296f = c0017q;
            hVar.f458c = 1;
            a7.G(hVar);
            return;
        }
        a7.I(true);
        try {
            X x5 = (X) abstractC1295c.getContext().o(C0021v.f545b);
            if (x5 == null || x5.a()) {
                Object obj2 = hVar.f1297g;
                InterfaceC1223i context = abstractC1295c.getContext();
                Object n6 = n(context, obj2);
                v0 v4 = n6 != f1285f ? AbstractC0024y.v(abstractC1295c, context, n6) : null;
                try {
                    abstractC1295c.resumeWith(obj);
                } finally {
                    if (v4 == null || v4.Z()) {
                        h(context, n6);
                    }
                }
            } else {
                CancellationException x6 = ((g0) x5).x();
                hVar.b(c0017q, x6);
                hVar.resumeWith(e5.g.l(x6));
            }
            while (a7.L()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final long k(String str, long j2, long j6, long j7) {
        String str2;
        int i2 = w.f1325a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        Long Q5 = B4.r.Q(str2);
        if (Q5 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = Q5.longValue();
        if (j6 <= longValue && longValue <= j7) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j6 + ".." + j7 + ", but is '" + longValue + '\'').toString());
    }

    public static int l(String str, int i2, int i3, int i6, int i7) {
        if ((i7 & 4) != 0) {
            i3 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return (int) k(str, i2, i3, i6);
    }

    public static final Object m(InterfaceC1223i interfaceC1223i) {
        Object q5 = interfaceC1223i.q(0, x.f1326f);
        kotlin.jvm.internal.i.b(q5);
        return q5;
    }

    public static final Object n(InterfaceC1223i interfaceC1223i, Object obj) {
        if (obj == null) {
            obj = m(interfaceC1223i);
        }
        if (obj == 0) {
            return f1285f;
        }
        if (obj instanceof Integer) {
            return interfaceC1223i.q(new z(((Number) obj).intValue(), interfaceC1223i), x.f1328h);
        }
        AbstractC0279e.o(obj);
        throw null;
    }
}
