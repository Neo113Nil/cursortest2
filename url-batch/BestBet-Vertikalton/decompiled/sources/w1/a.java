package w1;

import G1.AbstractC0001b;
import d1.AbstractC0095c;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import s1.AbstractC0332o;
import s1.AbstractC0335s;
import s1.C0327j;
import s1.C0328k;
import s1.C0333p;
import s1.D;
import s1.M;
import s1.U;
import s1.b0;
import s1.c0;
import s1.e0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final U.q f4488a = new U.q("NO_DECISION", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final U.q f4489b = new U.q("UNDEFINED", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final U.q f4490c = new U.q("REUSABLE_CLAIMED", 2);
    public static final U.q d = new U.q("CONDITION_FALSE", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final U.q f4491e = new U.q("NO_THREAD_ELEMENTS", 2);

    public static final void a(b1.j jVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.f4494a.iterator();
        while (it.hasNext()) {
            try {
                ((t1.b) it.next()).r(jVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    H1.d.b(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            H1.d.b(th, new e(jVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final void b(b1.j jVar, Object obj) {
        if (obj == f4491e) {
            return;
        }
        if (!(obj instanceof u)) {
            Object k2 = jVar.k(null, s.d);
            k1.e.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0001b.i(k2);
            throw null;
        }
        u uVar = (u) obj;
        b0[] b0VarArr = uVar.f4523b;
        int length = b0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        b0 b0Var = b0VarArr[length];
        k1.e.b(null);
        Object obj2 = uVar.f4522a[length];
        throw null;
    }

    public static final void c(b1.d dVar, Object obj, j1.l lVar) {
        if (!(dVar instanceof f)) {
            dVar.b(obj);
            return;
        }
        f fVar = (f) dVar;
        Throwable a2 = X0.e.a(obj);
        Object c0328k = a2 == null ? lVar != null ? new C0328k(obj, lVar) : obj : new C0327j(a2, false);
        AbstractC0332o abstractC0332o = fVar.d;
        AbstractC0095c abstractC0095c = fVar.f4496e;
        abstractC0095c.h();
        boolean s2 = abstractC0332o.s();
        b1.j jVar = abstractC0095c.f2474b;
        if (s2) {
            fVar.f4497f = c0328k;
            fVar.f4071c = 1;
            k1.e.b(jVar);
            fVar.d.r(jVar, fVar);
            return;
        }
        D a3 = c0.a();
        if (a3.f4011c >= 4294967296L) {
            fVar.f4497f = c0328k;
            fVar.f4071c = 1;
            Y0.h hVar = a3.f4012e;
            if (hVar == null) {
                hVar = new Y0.h();
                a3.f4012e = hVar;
            }
            hVar.addLast(fVar);
            return;
        }
        a3.v(true);
        try {
            k1.e.b(jVar);
            M m2 = (M) jVar.p(C0333p.f4061b);
            if (m2 == null || m2.a()) {
                Object obj2 = fVar.f4498g;
                k1.e.b(jVar);
                Object g2 = g(jVar, obj2);
                e0 k2 = g2 != f4491e ? AbstractC0335s.k(abstractC0095c, jVar, g2) : null;
                try {
                    abstractC0095c.b(obj);
                } finally {
                    if (k2 == null || k2.K()) {
                        b(jVar, g2);
                    }
                }
            } else {
                CancellationException u2 = ((U) m2).u();
                fVar.a(c0328k, u2);
                fVar.b(H1.l.w(u2));
            }
            while (a3.w()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long d(String str, long j2, long j3, long j4) {
        String str2;
        int i;
        Long valueOf;
        long j5;
        int i2 = r.f4517a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        b1.g.b(10);
        int length = str2.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str2.charAt(0);
            long j6 = -9223372036854775807L;
            if (k1.e.f(charAt, 48) < 0) {
                if (length != 1) {
                    if (charAt == '+') {
                        i = 0;
                        i3 = 1;
                        long j7 = 0;
                        long j8 = -256204778801521550L;
                        while (i3 < length) {
                            int digit = Character.digit((int) str2.charAt(i3), 10);
                            if (digit >= 0) {
                                if (j7 < j8) {
                                    if (j8 == -256204778801521550L) {
                                        j8 = j6 / 10;
                                        if (j7 < j8) {
                                        }
                                    }
                                }
                                long j9 = j7 * 10;
                                long j10 = digit;
                                if (j9 >= j6 + j10) {
                                    j7 = j9 - j10;
                                    i3++;
                                }
                            }
                        }
                        valueOf = i == 0 ? Long.valueOf(j7) : Long.valueOf(-j7);
                        if (valueOf == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = valueOf.longValue();
                        if (j3 <= longValue) {
                            j5 = j4;
                            if (longValue <= j5) {
                                return longValue;
                            }
                        } else {
                            j5 = j4;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j5 + ", but is '" + longValue + '\'').toString());
                    }
                    if (charAt == '-') {
                        j6 = Long.MIN_VALUE;
                        i3 = 1;
                    }
                }
            }
            i = i3;
            long j72 = 0;
            long j82 = -256204778801521550L;
            while (i3 < length) {
            }
            valueOf = i == 0 ? Long.valueOf(j72) : Long.valueOf(-j72);
            if (valueOf == null) {
            }
        }
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

    public static final Object f(b1.j jVar) {
        Object k2 = jVar.k(0, s.f4518c);
        k1.e.b(k2);
        return k2;
    }

    public static final Object g(b1.j jVar, Object obj) {
        if (obj == null) {
            obj = f(jVar);
        }
        if (obj == 0) {
            return f4491e;
        }
        if (obj instanceof Integer) {
            return jVar.k(new u(jVar, ((Number) obj).intValue()), s.f4519e);
        }
        AbstractC0001b.i(obj);
        throw null;
    }
}
