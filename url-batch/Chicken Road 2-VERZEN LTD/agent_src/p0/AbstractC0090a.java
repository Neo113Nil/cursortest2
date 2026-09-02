package p0;

import D.AbstractC0009j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.AbstractC0057p;
import k0.AbstractC0060t;
import k0.C0052k;
import k0.C0053l;
import k0.C0058q;
import k0.D;
import k0.K;
import k0.T;
import k0.Z;
import k0.a0;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0090a {

    /* renamed from: c, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1128c;

    /* renamed from: d, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1129d;

    /* renamed from: a, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1126a = new io.flutter.plugin.platform.c(4, "NO_DECISION");

    /* renamed from: b, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1127b = new io.flutter.plugin.platform.c(4, "CLOSED");

    /* renamed from: e, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1130e = new io.flutter.plugin.platform.c(4, "CONDITION_FALSE");

    /* renamed from: f, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1131f = new io.flutter.plugin.platform.c(4, "NO_THREAD_ELEMENTS");

    static {
        int i2 = 4;
        f1128c = new io.flutter.plugin.platform.c(i2, "UNDEFINED");
        f1129d = new io.flutter.plugin.platform.c(i2, "REUSABLE_CLAIMED");
    }

    public static final void a(d0.l lVar, Object obj, W.i iVar) {
        B.c b2 = b(lVar, obj, null);
        if (b2 != null) {
            AbstractC0060t.c(iVar, b2);
        }
    }

    public static final B.c b(d0.l lVar, Object obj, B.c cVar) {
        try {
            lVar.h(obj);
        } catch (Throwable th) {
            if (cVar == null || cVar.getCause() == th) {
                return new B.c("Exception in undelivered element handler for " + obj, th);
            }
            a.a.a(cVar, th);
        }
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, p0.v] */
    /* JADX WARN: Type inference failed for: r3v4, types: [p0.v] */
    public static final Object c(long j2, m0.k kVar) {
        m0.d dVar = m0.d.f1000j;
        while (true) {
            long j3 = kVar.f1171c;
            if (j3 >= j2 && !kVar.c()) {
                return kVar;
            }
            Object obj = d.f1134a.get(kVar);
            io.flutter.plugin.platform.c cVar = f1127b;
            if (obj == cVar) {
                return cVar;
            }
            ?? r3 = (v) ((d) obj);
            if (r3 != 0) {
                kVar = r3;
            } else {
                ?? r1 = (v) dVar.e(Long.valueOf(j3 + 1), kVar);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1134a;
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

    public static final v d(Object obj) {
        if (obj == f1127b) {
            throw new IllegalStateException("Does not contain segment");
        }
        e0.h.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (v) obj;
    }

    public static final void e(W.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f1137a.iterator();
        while (it.hasNext()) {
            try {
                ((l0.b) it.next()).d(iVar, th);
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
            a.a.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean f(Object obj) {
        return obj == f1127b;
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

    public static final void h(W.i iVar, Object obj) {
        if (obj == f1131f) {
            return;
        }
        if (!(obj instanceof A)) {
            e0.h.c(iVar.f(null, y.f1175e), "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            throw new ClassCastException();
        }
        A a2 = (A) obj;
        Z[] zArr = a2.f1125b;
        int length = zArr.length - 1;
        if (length < 0) {
            return;
        }
        Z z2 = zArr[length];
        e0.h.b(null);
        Object obj2 = a2.f1124a[length];
        throw null;
    }

    public static final void i(W.d dVar, Object obj, d0.l lVar) {
        if (!(dVar instanceof h)) {
            dVar.d(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable a2 = U.d.a(obj);
        Object c0053l = a2 == null ? lVar != null ? new C0053l(obj, lVar) : obj : new C0052k(a2, false);
        AbstractC0057p abstractC0057p = hVar.f1140e;
        Y.b bVar = hVar.f1141f;
        bVar.i();
        boolean g2 = abstractC0057p.g();
        W.i iVar = bVar.f399c;
        if (g2) {
            hVar.f1142g = c0053l;
            hVar.f896d = 1;
            e0.h.b(iVar);
            hVar.f1140e.d(iVar, hVar);
            return;
        }
        D a3 = a0.a();
        if (a3.f827d >= 4294967296L) {
            hVar.f1142g = c0053l;
            hVar.f896d = 1;
            V.c cVar = a3.f829f;
            if (cVar == null) {
                cVar = new V.c();
                a3.f829f = cVar;
            }
            cVar.addLast(hVar);
            return;
        }
        a3.j(true);
        try {
            e0.h.b(iVar);
            K k2 = (K) iVar.k(C0058q.f883c);
            if (k2 == null || k2.b()) {
                Object obj2 = hVar.f1143h;
                e0.h.b(iVar);
                Object m2 = m(iVar, obj2);
                if (m2 != f1131f) {
                    AbstractC0060t.i(bVar, iVar);
                }
                try {
                    bVar.d(obj);
                } finally {
                    h(iVar, m2);
                }
            } else {
                CancellationException v2 = ((T) k2).v();
                hVar.b(c0053l, v2);
                hVar.d(a.a.h(v2));
            }
            while (a3.l()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long j(String str, long j2, long j3, long j4) {
        String str2;
        int i2;
        String str3;
        Long valueOf;
        int i3;
        int i4 = x.f1173a;
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
                if (length != 1) {
                    if (charAt == '+') {
                        i2 = 0;
                        i5 = 1;
                        long j6 = 0;
                        long j7 = -256204778801521550L;
                        while (i5 < length) {
                            int digit = Character.digit((int) str2.charAt(i5), 10);
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
                                i5++;
                                length = i3;
                                str2 = str3;
                            }
                        }
                        str3 = str2;
                        if (i2 == 0) {
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
                        i5 = 1;
                    }
                }
            }
            i2 = i5;
            long j62 = 0;
            long j72 = -256204778801521550L;
            while (i5 < length) {
            }
            str3 = str2;
            if (i2 == 0) {
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

    public static final Object l(W.i iVar) {
        Object f2 = iVar.f(0, y.f1174d);
        e0.h.b(f2);
        return f2;
    }

    public static final Object m(W.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f1131f;
        }
        if (obj instanceof Integer) {
            return iVar.f(new A(((Number) obj).intValue(), iVar), y.f1176f);
        }
        AbstractC0009j.f(obj);
        throw null;
    }
}
