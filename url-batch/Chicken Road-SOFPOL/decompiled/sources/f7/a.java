package f7;

import a0.w0;
import a7.k1;
import a7.l1;
import a7.m0;
import a7.q1;
import a7.s0;
import a7.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d4.t f2760a = new d4.t("CLOSED", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final d4.t f2761b = new d4.t("UNDEFINED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final d4.t f2762c = new d4.t("REUSABLE_CLAIMED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final d4.t f2763d = new d4.t("NO_THREAD_ELEMENTS", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final w0 f2764e = new w0(10);

    /* renamed from: f, reason: collision with root package name */
    public static final w0 f2765f = new w0(11);

    /* renamed from: g, reason: collision with root package name */
    public static final w0 f2766g = new w0(12);

    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(a0.q.h("Expected positive parallelism level, but got ", i).toString());
        }
    }

    public static final Object b(r rVar, long j7, p6.e eVar) {
        while (true) {
            if (rVar.f2799c >= j7 && !rVar.c()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f2767a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            d4.t tVar = f2760a;
            if (obj == tVar) {
                return tVar;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) eVar.g(Long.valueOf(rVar.f2799c + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.c()) {
                    rVar.d();
                }
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f2760a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(g6.h hVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.f2770a.iterator();
        while (it.hasNext()) {
            try {
                ((a7.s) it.next()).n(hVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    s6.a.e(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            s6.a.e(th, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f2760a;
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

    public static final void g(g6.h hVar, Object obj) {
        if (obj == f2763d) {
            return;
        }
        if (!(obj instanceof v)) {
            Object g3 = hVar.g(null, f2765f);
            q6.i.c(g3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            a0.q.q(g3);
            throw null;
        }
        v vVar = (v) obj;
        k1[] k1VarArr = vVar.f2805b;
        int length = k1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        k1 k1Var = k1VarArr[length];
        q6.i.b(null);
        Object obj2 = vVar.f2804a[length];
        throw null;
    }

    public static final void h(g6.c cVar, Object obj) {
        if (!(cVar instanceof f)) {
            cVar.k(obj);
            return;
        }
        f fVar = (f) cVar;
        a7.q qVar = fVar.f2773g;
        i6.c cVar2 = fVar.f2774h;
        Throwable a8 = c6.i.a(obj);
        Object oVar = a8 == null ? obj : new a7.o(a8, false);
        if (qVar.i(cVar2.f())) {
            fVar.i = oVar;
            fVar.f247f = 1;
            qVar.h(cVar2.f(), fVar);
            return;
        }
        m0 a9 = l1.a();
        if (a9.f275f >= 4294967296L) {
            fVar.i = oVar;
            fVar.f247f = 1;
            a9.o(fVar);
            return;
        }
        a9.t(true);
        try {
            s0 s0Var = (s0) cVar2.f().l(a7.r.f297e);
            if (s0Var == null || s0Var.b()) {
                Object obj2 = fVar.f2775j;
                g6.h f6 = cVar2.f();
                Object l3 = l(f6, obj2);
                q1 t3 = l3 != f2763d ? x.t(cVar2, f6, l3) : null;
                try {
                    cVar2.k(obj);
                } finally {
                    if (t3 == null || t3.i0()) {
                        g(f6, l3);
                    }
                }
            } else {
                fVar.k(s6.a.l(s0Var.p()));
            }
            while (a9.y()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i(String str, long j7, long j8, long j9) {
        String str2;
        boolean z3;
        String str3;
        Long valueOf;
        int i = t.f2801a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j7;
        }
        r2.o.p(10);
        int length = str2.length();
        if (length != 0) {
            int i8 = 0;
            char charAt = str2.charAt(0);
            long j10 = -9223372036854775807L;
            if (q6.i.f(charAt, 48) < 0) {
                z3 = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z3 = false;
                        i8 = 1;
                    } else if (charAt == '-') {
                        j10 = Long.MIN_VALUE;
                        i8 = 1;
                    }
                }
            } else {
                z3 = false;
            }
            long j11 = 0;
            long j12 = -256204778801521550L;
            while (i8 < length) {
                int digit = Character.digit((int) str2.charAt(i8), 10);
                if (digit >= 0) {
                    if (j11 >= j12) {
                        str3 = str2;
                    } else if (j12 == -256204778801521550L) {
                        str3 = str2;
                        j12 = j10 / 10;
                        if (j11 < j12) {
                            valueOf = null;
                            break;
                        }
                    }
                    long j13 = j11 * 10;
                    long j14 = digit;
                    if (j13 < j10 + j14) {
                        valueOf = null;
                        break;
                    }
                    j11 = j13 - j14;
                    i8++;
                    str2 = str3;
                }
            }
            str3 = str2;
            valueOf = z3 ? Long.valueOf(j11) : Long.valueOf(-j11);
            if (valueOf != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str3 + '\'').toString());
            }
            long longValue = valueOf.longValue();
            if (j8 <= longValue && longValue <= j9) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j8 + ".." + j9 + ", but is '" + longValue + '\'').toString());
        }
        str3 = str2;
        valueOf = null;
        if (valueOf != null) {
        }
    }

    public static int j(int i, int i8, String str) {
        return (int) i(str, i, 1, (i8 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(g6.h hVar) {
        Object g3 = hVar.g(0, f2764e);
        q6.i.b(g3);
        return g3;
    }

    public static final Object l(g6.h hVar, Object obj) {
        if (obj == null) {
            obj = k(hVar);
        }
        if (obj == 0) {
            return f2763d;
        }
        if (obj instanceof Integer) {
            return hVar.g(new v(((Number) obj).intValue(), hVar), f2766g);
        }
        a0.q.q(obj);
        throw null;
    }
}
