package C3;

import E.AbstractC0005f;
import c3.C0294f;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import i2.AbstractC0457a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x3.AbstractC1534I;
import x3.AbstractC1558s;
import x3.AbstractC1562w;
import x3.C1554n;
import x3.C1559t;
import x3.T;
import x3.d0;
import x3.k0;
import x3.l0;
import x3.n0;
import y3.C1577b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final v f279a = new v("NO_DECISION", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final v f280b = new v("CLOSED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final v f281c = new v("UNDEFINED", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final v f282d = new v("REUSABLE_CLAIMED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final v f283e = new v("CONDITION_FALSE", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final v f284f = new v("NO_THREAD_ELEMENTS", 0);

    public static final Object a(t tVar, long j4, o3.p pVar) {
        while (true) {
            if (tVar.f318c >= j4 && !tVar.c()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f287a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            v vVar = f280b;
            if (obj == vVar) {
                return vVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f318c + 1), tVar);
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

    public static final t b(Object obj) {
        if (obj != f280b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(InterfaceC0430h interfaceC0430h, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f290a.iterator();
        while (it.hasNext()) {
            try {
                ((C1577b) it.next()).s(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    O3.d.c(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            O3.d.c(th, new g(interfaceC0430h));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean d(Object obj) {
        return obj == f280b;
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

    public static final void f(InterfaceC0430h interfaceC0430h, Object obj) {
        if (obj == f284f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object e4 = interfaceC0430h.e(null, x.f324g);
            kotlin.jvm.internal.i.c(e4, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0005f.x(e4);
            throw null;
        }
        z zVar = (z) obj;
        k0[] k0VarArr = zVar.f329b;
        int length = k0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        k0 k0Var = k0VarArr[length];
        kotlin.jvm.internal.i.b(null);
        Object obj2 = zVar.f328a[length];
        throw null;
    }

    public static final void g(Object obj, InterfaceC0425c interfaceC0425c) {
        if (!(interfaceC0425c instanceof h)) {
            interfaceC0425c.resumeWith(obj);
            return;
        }
        h hVar = (h) interfaceC0425c;
        AbstractC1558s abstractC1558s = hVar.f293d;
        Throwable a3 = C0294f.a(obj);
        Object c1554n = a3 == null ? obj : new C1554n(a3, false);
        h3.c cVar = hVar.f294e;
        cVar.getContext();
        if (abstractC1558s.t()) {
            hVar.f295f = c1554n;
            hVar.f15988c = 1;
            abstractC1558s.s(cVar.getContext(), hVar);
            return;
        }
        AbstractC1534I a4 = l0.a();
        if (a4.f15997c >= 4294967296L) {
            hVar.f295f = c1554n;
            hVar.f15988c = 1;
            d3.f fVar = a4.f15999e;
            if (fVar == null) {
                fVar = new d3.f();
                a4.f15999e = fVar;
            }
            fVar.addLast(hVar);
            return;
        }
        a4.w(true);
        try {
            T t4 = (T) cVar.getContext().n(C1559t.f16059b);
            if (t4 == null || t4.a()) {
                Object obj2 = hVar.f296g;
                InterfaceC0430h context = cVar.getContext();
                Object l4 = l(context, obj2);
                n0 m4 = l4 != f284f ? AbstractC1562w.m(cVar, context, l4) : null;
                try {
                    cVar.resumeWith(obj);
                } finally {
                    if (m4 == null || m4.T()) {
                        f(context, l4);
                    }
                }
            } else {
                CancellationException w4 = ((d0) t4).w();
                hVar.b(c1554n, w4);
                hVar.resumeWith(O3.l.h(w4));
            }
            while (a4.y()) {
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
    public static final long i(String str, long j4, long j5, long j6) {
        String str2;
        boolean z;
        String str3;
        Long valueOf;
        int i4 = w.f322a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j4;
        }
        AbstractC0457a.d(10);
        int length = str2.length();
        if (length != 0) {
            int i5 = 0;
            char charAt = str2.charAt(0);
            long j7 = -9223372036854775807L;
            if (kotlin.jvm.internal.i.f(charAt, 48) < 0) {
                z = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z = false;
                        i5 = 1;
                    } else if (charAt == '-') {
                        j7 = Long.MIN_VALUE;
                        i5 = 1;
                    }
                }
            } else {
                z = false;
            }
            long j8 = 0;
            long j9 = -256204778801521550L;
            while (i5 < length) {
                int digit = Character.digit((int) str2.charAt(i5), 10);
                if (digit >= 0) {
                    if (j8 >= j9) {
                        str3 = str2;
                    } else if (j9 == -256204778801521550L) {
                        str3 = str2;
                        j9 = j7 / 10;
                        if (j8 < j9) {
                            valueOf = null;
                            break;
                        }
                    }
                    long j10 = j8 * 10;
                    long j11 = digit;
                    if (j10 < j7 + j11) {
                        valueOf = null;
                        break;
                    }
                    j8 = j10 - j11;
                    i5++;
                    str2 = str3;
                }
            }
            str3 = str2;
            valueOf = z ? Long.valueOf(j8) : Long.valueOf(-j8);
            if (valueOf != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str3 + '\'').toString());
            }
            long longValue = valueOf.longValue();
            if (j5 <= longValue && longValue <= j6) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j5 + ".." + j6 + ", but is '" + longValue + '\'').toString());
        }
        str3 = str2;
        valueOf = null;
        if (valueOf != null) {
        }
    }

    public static int j(int i4, int i5, String str) {
        return (int) i(str, i4, 1, (i5 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(InterfaceC0430h interfaceC0430h) {
        Object e4 = interfaceC0430h.e(0, x.f323f);
        kotlin.jvm.internal.i.b(e4);
        return e4;
    }

    public static final Object l(InterfaceC0430h interfaceC0430h, Object obj) {
        if (obj == null) {
            obj = k(interfaceC0430h);
        }
        if (obj == 0) {
            return f284f;
        }
        if (obj instanceof Integer) {
            return interfaceC0430h.e(new z(((Number) obj).intValue(), interfaceC0430h), x.f325h);
        }
        AbstractC0005f.x(obj);
        throw null;
    }
}
