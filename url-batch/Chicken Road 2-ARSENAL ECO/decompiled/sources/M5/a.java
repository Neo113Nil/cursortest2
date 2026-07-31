package M5;

import H5.AbstractC0161v;
import H5.AbstractC0165z;
import H5.C0156p;
import H5.C0162w;
import H5.P;
import H5.X;
import H5.g0;
import H5.o0;
import H5.p0;
import H5.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k5.AbstractC0479i;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import q5.AbstractC0607c;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final v f1582a = new v("NO_DECISION", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final v f1583b = new v("CLOSED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final v f1584c = new v("UNDEFINED", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final v f1585d = new v("REUSABLE_CLAIMED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final v f1586e = new v("CONDITION_FALSE", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final v f1587f = new v("NO_THREAD_ELEMENTS", 0);

    public static final void a(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException(W4.o.c("Expected positive parallelism level, but got ", i7).toString());
        }
    }

    public static final Object b(t tVar, long j4, InterfaceC0747p interfaceC0747p) {
        while (true) {
            if (tVar.f1622h >= j4 && !tVar.c()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1590f;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            v vVar = f1583b;
            if (obj == vVar) {
                return vVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) interfaceC0747p.invoke(Long.valueOf(tVar.f1622h + 1), tVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                    if (atomicReferenceFieldUpdater.get(tVar) != null) {
                        break;
                    }
                }
                if (tVar.c()) {
                    tVar.d();
                }
            }
            tVar = tVar2;
        }
    }

    public static final t c(Object obj) {
        if (obj != f1583b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(InterfaceC0569i interfaceC0569i, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f1593a.iterator();
        while (it.hasNext()) {
            try {
                ((I5.b) it.next()).F(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    i6.g.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            i6.g.a(th, new g(interfaceC0569i));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f1583b;
    }

    public static final Object f(Object obj, Object obj2) {
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

    public static final void g(InterfaceC0569i interfaceC0569i, Object obj) {
        if (obj == f1587f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object h7 = interfaceC0569i.h(null, x.f1628h);
            kotlin.jvm.internal.i.c(h7, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            C1.c.l(h7);
            throw null;
        }
        z zVar = (z) obj;
        o0[] o0VarArr = zVar.f1634b;
        int length = o0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        o0 o0Var = o0VarArr[length];
        kotlin.jvm.internal.i.b(null);
        Object obj2 = zVar.f1633a[length];
        throw null;
    }

    public static final void h(Object obj, InterfaceC0564d interfaceC0564d) {
        if (!(interfaceC0564d instanceof h)) {
            interfaceC0564d.resumeWith(obj);
            return;
        }
        h hVar = (h) interfaceC0564d;
        AbstractC0161v abstractC0161v = hVar.f1596i;
        Throwable a7 = AbstractC0479i.a(obj);
        Object c0156p = a7 == null ? obj : new C0156p(a7, false);
        AbstractC0607c abstractC0607c = hVar.f1597j;
        abstractC0607c.getContext();
        if (abstractC0161v.H()) {
            hVar.f1598k = c0156p;
            hVar.f1026h = 1;
            abstractC0161v.F(abstractC0607c.getContext(), hVar);
            return;
        }
        P a8 = p0.a();
        if (a8.f1044h >= 4294967296L) {
            hVar.f1598k = c0156p;
            hVar.f1026h = 1;
            a8.J(hVar);
            return;
        }
        a8.L(true);
        try {
            X x6 = (X) abstractC0607c.getContext().m(C0162w.f1110g);
            if (x6 == null || x6.a()) {
                Object obj2 = hVar.f1599l;
                InterfaceC0569i context = abstractC0607c.getContext();
                Object m4 = m(context, obj2);
                v0 s6 = m4 != f1587f ? AbstractC0165z.s(abstractC0607c, context, m4) : null;
                try {
                    abstractC0607c.resumeWith(obj);
                } finally {
                    if (s6 == null || s6.W()) {
                        g(context, m4);
                    }
                }
            } else {
                CancellationException w5 = ((g0) x6).w();
                hVar.b(c0156p, w5);
                hVar.resumeWith(AbstractC0676f.f(w5));
            }
            while (a8.N()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final long j(String str, long j4, long j7, long j8) {
        String str2;
        int i7 = w.f1626a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j4;
        }
        Long K6 = F5.q.K(str2);
        if (K6 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = K6.longValue();
        if (j7 <= longValue && longValue <= j8) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j7 + ".." + j8 + ", but is '" + longValue + '\'').toString());
    }

    public static int k(String str, int i7, int i8) {
        return (int) j(str, i7, 1, (i8 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object l(InterfaceC0569i interfaceC0569i) {
        Object h7 = interfaceC0569i.h(0, x.f1627g);
        kotlin.jvm.internal.i.b(h7);
        return h7;
    }

    public static final Object m(InterfaceC0569i interfaceC0569i, Object obj) {
        if (obj == null) {
            obj = l(interfaceC0569i);
        }
        if (obj == 0) {
            return f1587f;
        }
        if (obj instanceof Integer) {
            return interfaceC0569i.h(new z(((Number) obj).intValue(), interfaceC0569i), x.f1629i);
        }
        C1.c.l(obj);
        throw null;
    }
}
