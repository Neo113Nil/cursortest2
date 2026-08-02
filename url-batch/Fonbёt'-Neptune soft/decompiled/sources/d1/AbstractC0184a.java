package d1;

import Y0.AbstractC0124s;
import Y0.AbstractC0127v;
import Y0.C0120n;
import Y0.C0121o;
import Y0.C0125t;
import Y0.H;
import Y0.P;
import Y0.Z;
import Y0.g0;
import Y0.h0;
import Y0.j0;
import a.AbstractC0132a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0184a {

    /* renamed from: c, reason: collision with root package name */
    public static final B.m f2064c;

    /* renamed from: d, reason: collision with root package name */
    public static final B.m f2065d;

    /* renamed from: a, reason: collision with root package name */
    public static final B.m f2062a = new B.m(19, "NO_DECISION");

    /* renamed from: b, reason: collision with root package name */
    public static final B.m f2063b = new B.m(19, "CLOSED");

    /* renamed from: e, reason: collision with root package name */
    public static final B.m f2066e = new B.m(19, "CONDITION_FALSE");

    /* renamed from: f, reason: collision with root package name */
    public static final B.m f2067f = new B.m(19, "NO_THREAD_ELEMENTS");

    static {
        int i2 = 19;
        f2064c = new B.m(i2, "UNDEFINED");
        f2065d = new B.m(i2, "REUSABLE_CLAIMED");
    }

    public static final F0.b a(P0.l lVar, Object obj, F0.b bVar) {
        try {
            lVar.i(obj);
        } catch (Throwable th) {
            if (bVar == null || bVar.getCause() == th) {
                return new F0.b("Exception in undelivered element handler for " + obj, th);
            }
            AbstractC0132a.c(bVar, th);
        }
        return bVar;
    }

    public static final Object b(v vVar, long j2, P0.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (vVar.f2107g >= j2 && !vVar.c()) {
                return vVar;
            }
            Object obj = d.f2070e.get(vVar);
            B.m mVar = f2063b;
            if (obj == mVar) {
                return mVar;
            }
            v vVar2 = (v) ((d) obj);
            if (vVar2 == null) {
                vVar2 = (v) pVar.h(Long.valueOf(vVar.f2107g + 1), vVar);
                do {
                    atomicReferenceFieldUpdater = d.f2070e;
                    if (atomicReferenceFieldUpdater.compareAndSet(vVar, null, vVar2)) {
                        if (vVar.c()) {
                            vVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(vVar) == null);
            }
            vVar = vVar2;
        }
    }

    public static final v c(Object obj) {
        if (obj != f2063b) {
            return (v) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(H0.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f2073a.iterator();
        while (it.hasNext()) {
            try {
                ((Z0.b) it.next()).c(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0132a.c(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC0132a.c(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f2063b;
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

    public static final void g(H0.i iVar, Object obj) {
        if (obj == f2067f) {
            return;
        }
        if (!(obj instanceof A)) {
            Object m2 = iVar.m(null, y.f2111h);
            Q0.h.c(m2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            A0.b.h(m2);
            throw null;
        }
        A a2 = (A) obj;
        g0[] g0VarArr = a2.f2061b;
        int length = g0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        g0 g0Var = g0VarArr[length];
        Q0.h.b(null);
        Object obj2 = a2.f2060a[length];
        throw null;
    }

    public static final void h(H0.d dVar, Object obj, P0.l lVar) {
        if (!(dVar instanceof h)) {
            dVar.j(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable a2 = F0.e.a(obj);
        Object c0121o = a2 == null ? lVar != null ? new C0121o(obj, lVar) : obj : new C0120n(a2, false);
        J0.b bVar = hVar.f2077i;
        bVar.f();
        AbstractC0124s abstractC0124s = hVar.f2076h;
        if (abstractC0124s.e()) {
            hVar.f2078j = c0121o;
            hVar.f1158g = 1;
            abstractC0124s.c(bVar.f(), hVar);
            return;
        }
        H a3 = h0.a();
        if (a3.f1167g >= 4294967296L) {
            hVar.f2078j = c0121o;
            hVar.f1158g = 1;
            G0.b bVar2 = a3.f1169i;
            if (bVar2 == null) {
                bVar2 = new G0.b();
                a3.f1169i = bVar2;
            }
            bVar2.addLast(hVar);
            return;
        }
        a3.h(true);
        try {
            P p2 = (P) bVar.f().k(C0125t.f1230f);
            if (p2 == null || p2.b()) {
                Object obj2 = hVar.f2079k;
                H0.i f2 = bVar.f();
                Object m2 = m(f2, obj2);
                j0 m3 = m2 != f2067f ? AbstractC0127v.m(bVar, f2, m2) : null;
                try {
                    bVar.j(obj);
                } finally {
                    if (m3 == null || m3.X()) {
                        g(f2, m2);
                    }
                }
            } else {
                CancellationException A2 = ((Z) p2).A();
                hVar.b(c0121o, A2);
                hVar.j(i1.a.b(A2));
            }
            while (a3.l()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long j(String str, long j2, long j3, long j4) {
        String str2;
        int i2;
        boolean z2;
        String str3;
        Long valueOf;
        int i3;
        int i4 = x.f2109a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        if (10 > new U0.c(2, 36, 1).f1088f) {
            throw new IllegalArgumentException("radix 10 was not in valid range " + new U0.c(2, 36, 1));
        }
        int length = str2.length();
        if (length != 0) {
            char charAt = str2.charAt(0);
            long j5 = -9223372036854775807L;
            if (charAt < '0') {
                if (length != 1) {
                    if (charAt == '-') {
                        j5 = Long.MIN_VALUE;
                        i2 = 1;
                        z2 = true;
                        long j6 = 0;
                        long j7 = -256204778801521550L;
                        while (i2 < length) {
                            int digit = Character.digit((int) str2.charAt(i2), 10);
                            if (digit >= 0) {
                                if (j6 >= j7) {
                                    str3 = str2;
                                    i3 = length;
                                } else if (j7 == -256204778801521550L) {
                                    str3 = str2;
                                    i3 = length;
                                    j7 = j5 / 10;
                                    if (j6 < j7) {
                                        valueOf = null;
                                        break;
                                    }
                                }
                                long j8 = j6 * 10;
                                long j9 = digit;
                                if (j8 < j5 + j9) {
                                    valueOf = null;
                                    break;
                                }
                                j6 = j8 - j9;
                                i2++;
                                length = i3;
                                str2 = str3;
                            }
                        }
                        str3 = str2;
                        if (!z2) {
                            j6 = -j6;
                        }
                        valueOf = Long.valueOf(j6);
                        if (valueOf == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str3 + '\'').toString());
                        }
                        long longValue = valueOf.longValue();
                        if (j3 <= longValue && longValue <= j4) {
                            return longValue;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
                    }
                    i2 = charAt == '+' ? 1 : 0;
                }
            }
            z2 = false;
            long j62 = 0;
            long j72 = -256204778801521550L;
            while (i2 < length) {
            }
            str3 = str2;
            if (!z2) {
            }
            valueOf = Long.valueOf(j62);
            if (valueOf == null) {
            }
        }
        str3 = str2;
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static int k(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) j(str, i2, i3, i4);
    }

    public static final Object l(H0.i iVar) {
        Object m2 = iVar.m(0, y.f2110g);
        Q0.h.b(m2);
        return m2;
    }

    public static final Object m(H0.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f2067f;
        }
        if (obj instanceof Integer) {
            return iVar.m(new A(((Number) obj).intValue(), iVar), y.f2112i);
        }
        A0.b.h(obj);
        throw null;
    }
}
