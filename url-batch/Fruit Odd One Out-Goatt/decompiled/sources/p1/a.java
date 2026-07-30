package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.c0;
import k1.q0;
import k1.v0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final o0.a f1033a;

    /* renamed from: b, reason: collision with root package name */
    public static final o0.a f1034b;

    /* renamed from: c, reason: collision with root package name */
    public static final o0.a f1035c;

    /* renamed from: d, reason: collision with root package name */
    public static final o0.a f1036d;

    /* renamed from: e, reason: collision with root package name */
    public static final o0.a f1037e;

    /* renamed from: f, reason: collision with root package name */
    public static final o0.a f1038f;

    static {
        int i2 = 2;
        f1033a = new o0.a(i2, "NO_DECISION");
        f1034b = new o0.a(i2, "CLOSED");
        f1035c = new o0.a(i2, "UNDEFINED");
        f1036d = new o0.a(i2, "REUSABLE_CLAIMED");
        f1037e = new o0.a(i2, "CONDITION_FALSE");
        f1038f = new o0.a(i2, "NO_THREAD_ELEMENTS");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, p1.u] */
    /* JADX WARN: Type inference failed for: r4v2, types: [p1.u] */
    public static final Object a(long j2, m1.k kVar) {
        m1.d dVar = m1.d.f853j;
        while (true) {
            long j3 = kVar.f1075c;
            if (j3 >= j2 && !kVar.c()) {
                return kVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1041a;
            Object obj = atomicReferenceFieldUpdater.get(kVar);
            o0.a aVar = f1034b;
            if (obj == aVar) {
                return aVar;
            }
            ?? r4 = (u) ((d) obj);
            if (r4 != 0) {
                kVar = r4;
            } else {
                ?? r1 = (u) dVar.g(Long.valueOf(j3 + 1), kVar);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(kVar, null, r1)) {
                        if (kVar.c()) {
                            kVar.d();
                        }
                        kVar = r1;
                    } else if (atomicReferenceFieldUpdater.get(kVar) != null) {
                        break;
                    }
                }
            }
        }
    }

    public static final u b(Object obj) {
        if (obj != f1034b) {
            obj.getClass();
            return (u) obj;
        }
        f0.l.b("Does not contain segment");
        return null;
    }

    public static final void c(v0.h hVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f1044a.iterator();
        while (it.hasNext()) {
            try {
                ((l1.b) it.next()).b(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    a.a.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            a.a.a(th, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean d(Object obj) {
        return obj == f1034b;
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

    public static final void f(v0.h hVar, Object obj) {
        if (obj == f1038f) {
            return;
        }
        if (!(obj instanceof z)) {
            hVar.a(null, x.f1079e).getClass();
            f0.l.a();
            return;
        }
        k1.l[] lVarArr = ((z) obj).f1084b;
        int length = lVarArr.length - 1;
        if (length < 0) {
            return;
        }
        k1.l lVar = lVarArr[length];
        throw null;
    }

    public static final void g(Object obj, v0.d dVar) {
        if (!(dVar instanceof h)) {
            dVar.f(obj);
            return;
        }
        h hVar = (h) dVar;
        k1.p pVar = hVar.f1047e;
        x0.b bVar = hVar.f1048f;
        Throwable a2 = t0.d.a(obj);
        Object jVar = a2 == null ? obj : new k1.j(a2, false);
        bVar.d();
        v0.h hVar2 = bVar.f1231c;
        if (pVar.c()) {
            hVar.f1049g = jVar;
            hVar.f731d = 1;
            hVar2.getClass();
            pVar.b(hVar2, hVar);
            return;
        }
        c0 a3 = v0.a();
        if (a3.f668d >= 4294967296L) {
            hVar.f1049g = jVar;
            hVar.f731d = 1;
            u0.b bVar2 = a3.f670f;
            if (bVar2 == null) {
                bVar2 = new u0.b();
                a3.f670f = bVar2;
            }
            bVar2.addLast(hVar);
            return;
        }
        a3.g(true);
        try {
            hVar2.getClass();
            q0 q0Var = (q0) hVar2.j(k1.q.f713c);
            if (q0Var == null || q0Var.B()) {
                Object obj2 = hVar.f1050h;
                hVar2.getClass();
                Object k2 = k(hVar2, obj2);
                if (k2 != f1038f) {
                    k1.t.h(bVar, hVar2);
                }
                try {
                    bVar.f(obj);
                } finally {
                    f(hVar2, k2);
                }
            } else {
                CancellationException u = q0Var.u();
                hVar.c(jVar, u);
                hVar.f(new t0.c(u));
            }
            while (a3.m()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0044, code lost:
    
        if (r9 == '+') goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long h(String str, long j2, long j3, long j4) {
        String str2;
        String str3;
        Long valueOf;
        long j5;
        int i2 = w.f1077a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        int i3 = 1;
        if (10 > new g1.b(2, 36, 1).f367c) {
            throw new IllegalArgumentException("radix 10 was not in valid range " + new g1.b(2, 36, 1));
        }
        int length = str2.length();
        if (length != 0) {
            boolean z2 = false;
            char charAt = str2.charAt(0);
            long j6 = -9223372036854775807L;
            if (charAt >= '0') {
                i3 = 0;
            } else if (length != 1) {
                if (charAt == '-') {
                    j6 = Long.MIN_VALUE;
                    z2 = true;
                }
            }
            long j7 = 0;
            long j8 = -256204778801521550L;
            while (i3 < length) {
                int digit = Character.digit((int) str2.charAt(i3), 10);
                if (digit >= 0) {
                    long j9 = j7;
                    str3 = str2;
                    if (j9 < j8) {
                        if (j8 == -256204778801521550L) {
                            j5 = j6;
                            j8 = j5 / 10;
                            if (j9 < j8) {
                            }
                        }
                        valueOf = null;
                        break;
                    }
                    j5 = j6;
                    long j10 = j9 * 10;
                    long j11 = digit;
                    if (j10 < j5 + j11) {
                        valueOf = null;
                        break;
                    }
                    i3++;
                    str2 = str3;
                    j7 = j10 - j11;
                    j6 = j5;
                }
            }
            long j12 = j7;
            str3 = str2;
            long j13 = j12;
            if (!z2) {
                j13 = -j13;
            }
            valueOf = Long.valueOf(j13);
            if (valueOf != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str3 + '\'').toString());
            }
            long longValue = valueOf.longValue();
            if (j3 <= longValue && longValue <= j4) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
        }
        str3 = str2;
        valueOf = null;
        if (valueOf != null) {
        }
    }

    public static int i(String str, int i2, int i3) {
        return (int) h(str, i2, 1, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object j(v0.h hVar) {
        Object a2 = hVar.a(0, x.f1078d);
        a2.getClass();
        return a2;
    }

    public static final Object k(v0.h hVar, Object obj) {
        if (obj == null) {
            obj = j(hVar);
        }
        if (obj == 0) {
            return f1038f;
        }
        if (obj instanceof Integer) {
            return hVar.a(new z(((Number) obj).intValue(), hVar), x.f1080f);
        }
        f0.l.a();
        return null;
    }
}
