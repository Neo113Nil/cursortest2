package b1;

import B0.E;
import W0.AbstractC0078s;
import W0.AbstractC0081v;
import W0.C0074n;
import W0.C0079t;
import W0.H;
import W0.P;
import W0.Z;
import W0.g0;
import W0.h0;
import W0.j0;
import a.AbstractC0086a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0115a {

    /* renamed from: a, reason: collision with root package name */
    public static final E f1735a;

    /* renamed from: b, reason: collision with root package name */
    public static final E f1736b;

    /* renamed from: c, reason: collision with root package name */
    public static final E f1737c;

    /* renamed from: d, reason: collision with root package name */
    public static final E f1738d;

    /* renamed from: e, reason: collision with root package name */
    public static final E f1739e;

    /* renamed from: f, reason: collision with root package name */
    public static final E f1740f;

    static {
        int i2 = 14;
        f1735a = new E(i2, "NO_DECISION");
        f1736b = new E(i2, "CLOSED");
        f1737c = new E(i2, "UNDEFINED");
        f1738d = new E(i2, "REUSABLE_CLAIMED");
        f1739e = new E(i2, "CONDITION_FALSE");
        f1740f = new E(i2, "NO_THREAD_ELEMENTS");
    }

    public static final Object a(v vVar, long j2, O0.p pVar) {
        while (true) {
            if (vVar.f1777g >= j2 && !vVar.c()) {
                return vVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1743e;
            Object obj = atomicReferenceFieldUpdater.get(vVar);
            E e2 = f1736b;
            if (obj == e2) {
                return e2;
            }
            v vVar2 = (v) ((d) obj);
            if (vVar2 == null) {
                vVar2 = (v) pVar.i(Long.valueOf(vVar.f1777g + 1), vVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(vVar, null, vVar2)) {
                    if (atomicReferenceFieldUpdater.get(vVar) != null) {
                        break;
                    }
                }
                if (vVar.c()) {
                    vVar.d();
                }
            }
            vVar = vVar2;
        }
    }

    public static final v b(Object obj) {
        if (obj != f1736b) {
            return (v) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(G0.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f1746a.iterator();
        while (it.hasNext()) {
            try {
                ((X0.b) it.next()).c(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0086a.c(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC0086a.c(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean d(Object obj) {
        return obj == f1736b;
    }

    public static final Object e(Object obj, Object obj2) {
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

    public static final void f(G0.i iVar, Object obj) {
        if (obj == f1740f) {
            return;
        }
        if (!(obj instanceof A)) {
            Object h2 = iVar.h(null, y.f1781h);
            P0.h.c(h2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            L.d.h(h2);
            throw null;
        }
        A a2 = (A) obj;
        g0[] g0VarArr = a2.f1734b;
        int length = g0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        g0 g0Var = g0VarArr[length];
        P0.h.b(null);
        Object obj2 = a2.f1733a[length];
        throw null;
    }

    public static final void g(G0.d dVar, Object obj) {
        if (!(dVar instanceof h)) {
            dVar.g(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable a2 = D0.e.a(obj);
        Object c0074n = a2 == null ? obj : new C0074n(a2, false);
        AbstractC0078s abstractC0078s = hVar.f1749h;
        I0.b bVar = hVar.f1750i;
        bVar.e();
        if (abstractC0078s.d()) {
            hVar.f1751j = c0074n;
            hVar.f904g = 1;
            hVar.f1749h.c(bVar.e(), hVar);
            return;
        }
        H a3 = h0.a();
        if (a3.f913g >= 4294967296L) {
            hVar.f1751j = c0074n;
            hVar.f904g = 1;
            E0.d dVar2 = a3.f915i;
            if (dVar2 == null) {
                dVar2 = new E0.d();
                a3.f915i = dVar2;
            }
            dVar2.addLast(hVar);
            return;
        }
        a3.g(true);
        try {
            P p2 = (P) bVar.e().m(C0079t.f974f);
            if (p2 == null || p2.a()) {
                Object obj2 = hVar.f1752k;
                G0.i e2 = bVar.e();
                Object l2 = l(e2, obj2);
                j0 l3 = l2 != f1740f ? AbstractC0081v.l(bVar, e2, l2) : null;
                try {
                    bVar.g(obj);
                } finally {
                    if (l3 == null || l3.W()) {
                        f(e2, l2);
                    }
                }
            } else {
                CancellationException z2 = ((Z) p2).z();
                hVar.b(c0074n, z2);
                hVar.g(AbstractC0086a.l(z2));
            }
            while (a3.l()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i(String str, long j2, long j3, long j4) {
        String str2;
        Long l2;
        boolean z2;
        int i2;
        int i3;
        int i4 = x.f1779a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        int length = str2.length();
        if (length != 0) {
            int i5 = 0;
            char charAt = str2.charAt(0);
            long j5 = -9223372036854775807L;
            if (charAt < '0') {
                z2 = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z2 = false;
                        i5 = 1;
                    } else if (charAt == '-') {
                        j5 = Long.MIN_VALUE;
                        i5 = 1;
                    }
                }
            } else {
                z2 = false;
            }
            long j6 = 0;
            long j7 = -256204778801521550L;
            while (i5 < length) {
                int digit = Character.digit((int) str2.charAt(i5), 10);
                if (digit >= 0) {
                    if (j6 >= j7) {
                        i2 = length;
                        i3 = i5;
                    } else if (j7 == -256204778801521550L) {
                        i2 = length;
                        i3 = i5;
                        j7 = j5 / 10;
                        if (j6 < j7) {
                        }
                    }
                    long j8 = j6 * 10;
                    long j9 = digit;
                    if (j8 >= j5 + j9) {
                        j6 = j8 - j9;
                        i5 = i3 + 1;
                        length = i2;
                    }
                }
            }
            l2 = z2 ? Long.valueOf(j6) : Long.valueOf(-j6);
            if (l2 != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
            }
            long longValue = l2.longValue();
            if (j3 <= longValue && longValue <= j4) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
        }
        l2 = null;
        if (l2 != null) {
        }
    }

    public static int j(String str, int i2, int i3) {
        return (int) i(str, i2, 1, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(G0.i iVar) {
        Object h2 = iVar.h(0, y.f1780g);
        P0.h.b(h2);
        return h2;
    }

    public static final Object l(G0.i iVar, Object obj) {
        if (obj == null) {
            obj = k(iVar);
        }
        if (obj == 0) {
            return f1740f;
        }
        if (obj instanceof Integer) {
            return iVar.h(new A(((Number) obj).intValue(), iVar), y.f1782i);
        }
        L.d.h(obj);
        throw null;
    }
}
