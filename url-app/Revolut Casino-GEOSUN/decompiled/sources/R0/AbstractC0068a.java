package R0;

import M0.AbstractC0060s;
import M0.AbstractC0063v;
import M0.C0056n;
import M0.C0057o;
import M0.C0061t;
import M0.H;
import M0.P;
import M0.Z;
import M0.g0;
import M0.h0;
import M0.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u0.AbstractC0244d;

/* renamed from: R0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0068a {

    /* renamed from: c, reason: collision with root package name */
    public static final A.j f895c;

    /* renamed from: d, reason: collision with root package name */
    public static final A.j f896d;

    /* renamed from: a, reason: collision with root package name */
    public static final A.j f893a = new A.j(11, "NO_DECISION");

    /* renamed from: b, reason: collision with root package name */
    public static final A.j f894b = new A.j(11, "CLOSED");

    /* renamed from: e, reason: collision with root package name */
    public static final A.j f897e = new A.j(11, "CONDITION_FALSE");

    /* renamed from: f, reason: collision with root package name */
    public static final A.j f898f = new A.j(11, "NO_THREAD_ELEMENTS");

    static {
        int i2 = 11;
        f895c = new A.j(i2, "UNDEFINED");
        f896d = new A.j(i2, "REUSABLE_CLAIMED");
    }

    public static final void a(E0.l lVar, Object obj, w0.i iVar) {
        M.c b2 = b(lVar, obj, null);
        if (b2 != null) {
            AbstractC0063v.d(b2, iVar);
        }
    }

    public static final M.c b(E0.l lVar, Object obj, M.c cVar) {
        try {
            lVar.i(obj);
        } catch (Throwable th) {
            if (cVar == null || cVar.getCause() == th) {
                return new M.c("Exception in undelivered element handler for " + obj, th);
            }
            o.g.a(cVar, th);
        }
        return cVar;
    }

    public static final Object c(v vVar, long j2, E0.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (vVar.f938g >= j2 && !vVar.c()) {
                return vVar;
            }
            Object obj = d.f901e.get(vVar);
            A.j jVar = f894b;
            if (obj == jVar) {
                return jVar;
            }
            v vVar2 = (v) ((d) obj);
            if (vVar2 == null) {
                vVar2 = (v) pVar.f(Long.valueOf(vVar.f938g + 1), vVar);
                do {
                    atomicReferenceFieldUpdater = d.f901e;
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

    public static final v d(Object obj) {
        if (obj != f894b) {
            return (v) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void e(Throwable th, w0.i iVar) {
        Throwable runtimeException;
        Iterator it = f.f904a.iterator();
        while (it.hasNext()) {
            try {
                ((N0.b) it.next()).c(th, iVar);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    o.g.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            o.g.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean f(Object obj) {
        return obj == f894b;
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

    public static final void h(w0.i iVar, Object obj) {
        if (obj == f898f) {
            return;
        }
        if (!(obj instanceof A)) {
            Object h2 = iVar.h(null, y.f942h);
            F0.i.c(h2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            F0.h.h(h2);
            throw null;
        }
        A a2 = (A) obj;
        g0[] g0VarArr = a2.f892b;
        int length = g0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        g0 g0Var = g0VarArr[length];
        F0.i.b(null);
        Object obj2 = a2.f891a[length];
        throw null;
    }

    public static final void i(w0.d dVar, Object obj, E0.l lVar) {
        if (!(dVar instanceof h)) {
            dVar.resumeWith(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable a2 = AbstractC0244d.a(obj);
        Object c0057o = a2 == null ? lVar != null ? new C0057o(obj, lVar) : obj : new C0056n(a2, false);
        AbstractC0060s abstractC0060s = hVar.f907h;
        y0.b bVar = hVar.f908i;
        bVar.getContext();
        if (abstractC0060s.d()) {
            hVar.f909j = c0057o;
            hVar.f615g = 1;
            hVar.f907h.c(bVar.getContext(), hVar);
            return;
        }
        H a3 = h0.a();
        if (a3.f624g >= 4294967296L) {
            hVar.f909j = c0057o;
            hVar.f615g = 1;
            v0.b bVar2 = a3.f626i;
            if (bVar2 == null) {
                bVar2 = new v0.b();
                a3.f626i = bVar2;
            }
            bVar2.addLast(hVar);
            return;
        }
        a3.j(true);
        try {
            P p2 = (P) bVar.getContext().f(C0061t.f687f);
            if (p2 == null || p2.b()) {
                Object obj2 = hVar.f910k;
                w0.i context = bVar.getContext();
                Object n2 = n(context, obj2);
                j0 m2 = n2 != f898f ? AbstractC0063v.m(bVar, context, n2) : null;
                try {
                    bVar.resumeWith(obj);
                } finally {
                    if (m2 == null || m2.V()) {
                        h(context, n2);
                    }
                }
            } else {
                CancellationException y2 = ((Z) p2).y();
                hVar.b(c0057o, y2);
                hVar.resumeWith(o.g.f(y2));
            }
            while (a3.m()) {
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
    public static final long k(String str, long j2, long j3, long j4) {
        String str2;
        int i2;
        String str3;
        Long valueOf;
        int i3;
        int i4 = x.f940a;
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

    public static int l(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) k(str, i2, i3, i4);
    }

    public static final Object m(w0.i iVar) {
        Object h2 = iVar.h(0, y.f941g);
        F0.i.b(h2);
        return h2;
    }

    public static final Object n(w0.i iVar, Object obj) {
        if (obj == null) {
            obj = m(iVar);
        }
        if (obj == 0) {
            return f898f;
        }
        if (obj instanceof Integer) {
            return iVar.h(new A(((Number) obj).intValue(), iVar), y.f943i);
        }
        F0.h.h(obj);
        throw null;
    }
}
