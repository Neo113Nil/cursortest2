package h7;

import c7.a0;
import c7.o1;
import c7.p1;
import c7.q0;
import c7.u1;
import c7.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final s f4664a = new s("CLOSED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final s f4665b = new s("UNDEFINED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final s f4666c = new s("REUSABLE_CLAIMED", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final s f4667d = new s("NO_THREAD_ELEMENTS", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final c7.q f4668e = new c7.q(10);

    /* renamed from: f, reason: collision with root package name */
    public static final c7.q f4669f = new c7.q(11);

    /* renamed from: g, reason: collision with root package name */
    public static final c7.q f4670g = new c7.q(12);

    public static final void a(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException(a0.m.i("Expected positive parallelism level, but got ", i7).toString());
        }
    }

    public static final Object b(q qVar, long j8, q6.e eVar) {
        while (true) {
            if (qVar.f4704c >= j8 && !qVar.c()) {
                return qVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f4671a;
            Object obj = atomicReferenceFieldUpdater.get(qVar);
            s sVar = f4664a;
            if (obj == sVar) {
                return sVar;
            }
            q qVar2 = (q) ((b) obj);
            if (qVar2 == null) {
                qVar2 = (q) eVar.d(Long.valueOf(qVar.f4704c + 1), qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(qVar, null, qVar2)) {
                    if (atomicReferenceFieldUpdater.get(qVar) != null) {
                        break;
                    }
                }
                if (qVar.c()) {
                    qVar.d();
                }
            }
            qVar = qVar2;
        }
    }

    public static final q c(Object obj) {
        if (obj != f4664a) {
            return (q) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(h6.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.f4674a.iterator();
        while (it.hasNext()) {
            try {
                ((c7.v) it.next()).Q(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    d6.a.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            d6.a.a(th, new e(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f4664a;
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

    public static final void g(h6.i iVar, Object obj) {
        if (obj == f4667d) {
            return;
        }
        if (!(obj instanceof v)) {
            Object D = iVar.D(null, f4669f);
            r6.k.d(D, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            r6.i.e(D);
            throw null;
        }
        v vVar = (v) obj;
        o1[] o1VarArr = vVar.f4712b;
        int length = o1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        o1 o1Var = o1VarArr[length];
        r6.k.c(null);
        Object obj2 = vVar.f4711a[length];
        throw null;
    }

    public static final void h(h6.d dVar, Object obj) {
        if (!(dVar instanceof f)) {
            dVar.resumeWith(obj);
            return;
        }
        f fVar = (f) dVar;
        c7.t tVar = fVar.f4677i;
        j6.c cVar = fVar.f4678j;
        Throwable a3 = d6.m.a(obj);
        Object pVar = a3 == null ? obj : new c7.p(a3, false);
        if (tVar.X(cVar.getContext())) {
            fVar.f4679k = pVar;
            fVar.f1691h = 1;
            tVar.V(cVar.getContext(), fVar);
            return;
        }
        q0 a9 = p1.a();
        if (a9.f1732h >= 4294967296L) {
            fVar.f4679k = pVar;
            fVar.f1691h = 1;
            a9.a0(fVar);
            return;
        }
        a9.c0(true);
        try {
            x0 x0Var = (x0) cVar.getContext().u(c7.u.f1748g);
            if (x0Var == null || x0Var.b()) {
                Object obj2 = fVar.f4680l;
                h6.i context = cVar.getContext();
                Object l8 = l(context, obj2);
                u1 w4 = l8 != f4667d ? a0.w(cVar, context, l8) : null;
                try {
                    cVar.resumeWith(obj);
                } finally {
                    if (w4 == null || w4.g0()) {
                        g(context, l8);
                    }
                }
            } else {
                fVar.resumeWith(d6.a.b(x0Var.w()));
            }
            while (a9.e0()) {
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
    public static final long i(String str, long j8, long j9, long j10) {
        String str2;
        boolean z8;
        String str3;
        Long valueOf;
        int i7 = t.f4708a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j8;
        }
        v1.g.b(10);
        int length = str2.length();
        if (length != 0) {
            int i8 = 0;
            char charAt = str2.charAt(0);
            long j11 = -9223372036854775807L;
            if (r6.k.g(charAt, 48) < 0) {
                z8 = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z8 = false;
                        i8 = 1;
                    } else if (charAt == '-') {
                        j11 = Long.MIN_VALUE;
                        i8 = 1;
                    }
                }
            } else {
                z8 = false;
            }
            long j12 = 0;
            long j13 = -256204778801521550L;
            while (i8 < length) {
                int digit = Character.digit((int) str2.charAt(i8), 10);
                if (digit >= 0) {
                    if (j12 >= j13) {
                        str3 = str2;
                    } else if (j13 == -256204778801521550L) {
                        str3 = str2;
                        j13 = j11 / 10;
                        if (j12 < j13) {
                            valueOf = null;
                            break;
                        }
                    }
                    long j14 = j12 * 10;
                    long j15 = digit;
                    if (j14 < j11 + j15) {
                        valueOf = null;
                        break;
                    }
                    j12 = j14 - j15;
                    i8++;
                    str2 = str3;
                }
            }
            str3 = str2;
            valueOf = z8 ? Long.valueOf(j12) : Long.valueOf(-j12);
            if (valueOf != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str3 + '\'').toString());
            }
            long longValue = valueOf.longValue();
            if (j9 <= longValue && longValue <= j10) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j9 + ".." + j10 + ", but is '" + longValue + '\'').toString());
        }
        str3 = str2;
        valueOf = null;
        if (valueOf != null) {
        }
    }

    public static int j(int i7, int i8, String str) {
        return (int) i(str, i7, 1, (i8 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(h6.i iVar) {
        Object D = iVar.D(0, f4668e);
        r6.k.c(D);
        return D;
    }

    public static final Object l(h6.i iVar, Object obj) {
        if (obj == null) {
            obj = k(iVar);
        }
        if (obj == 0) {
            return f4667d;
        }
        if (obj instanceof Integer) {
            return iVar.D(new v(((Number) obj).intValue(), iVar), f4670g);
        }
        r6.i.e(obj);
        throw null;
    }
}
