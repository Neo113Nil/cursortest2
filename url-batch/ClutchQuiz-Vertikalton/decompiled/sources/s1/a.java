package s1;

import X.V;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import o1.AbstractC0296o;
import o1.AbstractC0299s;
import o1.C0291j;
import o1.C0292k;
import o1.C0297p;
import o1.D;
import o1.M;
import o1.U;
import o1.b0;
import o1.c0;
import o1.e0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final T.r f3639a = new T.r("NO_DECISION", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final T.r f3640b = new T.r("UNDEFINED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final T.r f3641c = new T.r("REUSABLE_CLAIMED", 1);
    public static final T.r d = new T.r("CONDITION_FALSE", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final T.r f3642e = new T.r("NO_THREAD_ELEMENTS", 1);

    public static final void a(X0.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.f3645a.iterator();
        while (it.hasNext()) {
            try {
                ((p1.b) it.next()).y(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    T.d.g(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            T.d.g(th, new e(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final void b(X0.i iVar, Object obj) {
        if (obj == f3642e) {
            return;
        }
        if (!(obj instanceof u)) {
            Object u2 = iVar.u(null, s.d);
            g1.f.c(u2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            V.f(u2);
            throw null;
        }
        u uVar = (u) obj;
        b0[] b0VarArr = uVar.f3674b;
        int length = b0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        b0 b0Var = b0VarArr[length];
        g1.f.b(null);
        Object obj2 = uVar.f3673a[length];
        throw null;
    }

    public static final void c(X0.d dVar, Object obj, f1.l lVar) {
        if (!(dVar instanceof f)) {
            dVar.b(obj);
            return;
        }
        f fVar = (f) dVar;
        Throwable a2 = U0.f.a(obj);
        Object c0292k = a2 == null ? lVar != null ? new C0292k(obj, lVar) : obj : new C0291j(a2, false);
        AbstractC0296o abstractC0296o = fVar.d;
        Z0.e eVar = fVar.f3647e;
        eVar.h();
        boolean z2 = abstractC0296o.z();
        X0.i iVar = eVar.f1173b;
        if (z2) {
            fVar.f3648f = c0292k;
            fVar.f3368c = 1;
            g1.f.b(iVar);
            fVar.d.y(iVar, fVar);
            return;
        }
        D a3 = c0.a();
        if (a3.f3308c >= 4294967296L) {
            fVar.f3648f = c0292k;
            fVar.f3368c = 1;
            V0.c cVar = a3.f3309e;
            if (cVar == null) {
                cVar = new V0.c();
                a3.f3309e = cVar;
            }
            cVar.addLast(fVar);
            return;
        }
        a3.C(true);
        try {
            g1.f.b(iVar);
            M m2 = (M) iVar.j(C0297p.f3358b);
            if (m2 == null || m2.a()) {
                Object obj2 = fVar.f3649g;
                g1.f.b(iVar);
                Object g2 = g(iVar, obj2);
                e0 l2 = g2 != f3642e ? AbstractC0299s.l(eVar, iVar, g2) : null;
                try {
                    eVar.b(obj);
                } finally {
                    if (l2 == null || l2.J()) {
                        b(iVar, g2);
                    }
                }
            } else {
                CancellationException s2 = ((U) m2).s();
                fVar.a(c0292k, s2);
                fVar.b(T.d.p(s2));
            }
            while (a3.D()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long d(String str, long j2, long j3, long j4) {
        String str2;
        int i;
        String str3;
        Long valueOf;
        int i2;
        int i3 = r.f3668a;
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
            int i4 = 0;
            char charAt = str2.charAt(0);
            long j5 = -9223372036854775807L;
            if ((charAt < '0' ? (char) 65535 : charAt == '0' ? (char) 0 : (char) 1) < 0) {
                if (length != 1) {
                    if (charAt == '+') {
                        i = 0;
                        i4 = 1;
                        long j6 = 0;
                        long j7 = -256204778801521550L;
                        while (i4 < length) {
                            int digit = Character.digit((int) str2.charAt(i4), 10);
                            if (digit >= 0) {
                                if (j6 >= j7) {
                                    str3 = str2;
                                    i2 = length;
                                } else if (j7 == -256204778801521550L) {
                                    str3 = str2;
                                    i2 = length;
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
                                i4++;
                                length = i2;
                                str2 = str3;
                            }
                        }
                        str3 = str2;
                        if (i == 0) {
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
                    if (charAt == '-') {
                        j5 = Long.MIN_VALUE;
                        i4 = 1;
                    }
                }
            }
            i = i4;
            long j62 = 0;
            long j72 = -256204778801521550L;
            while (i4 < length) {
            }
            str3 = str2;
            if (i == 0) {
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

    public static int e(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) d(str, i, i2, i3);
    }

    public static final Object f(X0.i iVar) {
        Object u2 = iVar.u(0, s.f3669c);
        g1.f.b(u2);
        return u2;
    }

    public static final Object g(X0.i iVar, Object obj) {
        if (obj == null) {
            obj = f(iVar);
        }
        if (obj == 0) {
            return f3642e;
        }
        if (obj instanceof Integer) {
            return iVar.u(new u(iVar, ((Number) obj).intValue()), s.f3670e);
        }
        V.f(obj);
        throw null;
    }
}
