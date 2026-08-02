package y2;

import E1.AbstractC0033i;
import a.AbstractC0129a;
import b2.C0192f;
import c2.C0204b;
import d2.InterfaceC0300c;
import f2.AbstractC0326c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1148j;
import t2.AbstractC1208s;
import t2.AbstractC1212w;
import t2.C1204n;
import t2.C1209t;
import t2.J;
import t2.U;
import t2.e0;
import t2.k0;
import t2.l0;
import t2.n0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1148j f10831a = new C1148j("NO_DECISION");

    /* renamed from: b, reason: collision with root package name */
    public static final C1148j f10832b = new C1148j("CLOSED");

    /* renamed from: c, reason: collision with root package name */
    public static final C1148j f10833c = new C1148j("UNDEFINED");

    /* renamed from: d, reason: collision with root package name */
    public static final C1148j f10834d = new C1148j("REUSABLE_CLAIMED");

    /* renamed from: e, reason: collision with root package name */
    public static final C1148j f10835e = new C1148j("CONDITION_FALSE");
    public static final C1148j f = new C1148j("NO_THREAD_ELEMENTS");

    public static final Object a(t tVar, long j3, l2.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (tVar.f10866c >= j3 && !tVar.c()) {
                return tVar;
            }
            Object obj = d.f10838a.get(tVar);
            C1148j c1148j = f10832b;
            if (obj == c1148j) {
                return c1148j;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f10866c + 1), tVar);
                do {
                    atomicReferenceFieldUpdater = d.f10838a;
                    if (atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                        if (tVar.c()) {
                            tVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(tVar) == null);
            }
            tVar = tVar2;
        }
    }

    public static final t b(Object obj) {
        if (obj != f10832b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(d2.h hVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f10841a.iterator();
        while (it.hasNext()) {
            try {
                ((u2.b) it.next()).c(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0129a.e(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC0129a.e(th, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean d(Object obj) {
        return obj == f10832b;
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

    public static final void f(d2.h hVar, Object obj) {
        if (obj == f) {
            return;
        }
        if (!(obj instanceof y)) {
            Object l3 = hVar.l(null, w.f10869g);
            kotlin.jvm.internal.j.c(l3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0033i.p(l3);
            throw null;
        }
        y yVar = (y) obj;
        k0[] k0VarArr = yVar.f10874b;
        int length = k0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        k0 k0Var = k0VarArr[length];
        kotlin.jvm.internal.j.b(null);
        Object obj2 = yVar.f10873a[length];
        throw null;
    }

    public static final void g(InterfaceC0300c interfaceC0300c, Object obj) {
        if (!(interfaceC0300c instanceof h)) {
            interfaceC0300c.f(obj);
            return;
        }
        h hVar = (h) interfaceC0300c;
        Throwable a3 = C0192f.a(obj);
        Object c1204n = a3 == null ? obj : new C1204n(a3, false);
        AbstractC0326c abstractC0326c = hVar.f10845e;
        abstractC0326c.getContext();
        AbstractC1208s abstractC1208s = hVar.f10844d;
        if (abstractC1208s.d()) {
            hVar.f = c1204n;
            hVar.f10376c = 1;
            abstractC1208s.c(abstractC0326c.getContext(), hVar);
            return;
        }
        J a4 = l0.a();
        if (a4.f10384c >= 4294967296L) {
            hVar.f = c1204n;
            hVar.f10376c = 1;
            C0204b c0204b = a4.f10386e;
            if (c0204b == null) {
                c0204b = new C0204b();
                a4.f10386e = c0204b;
            }
            c0204b.addLast(hVar);
            return;
        }
        a4.g(true);
        try {
            U u3 = (U) abstractC0326c.getContext().h(C1209t.f10441b);
            if (u3 == null || u3.a()) {
                Object obj2 = hVar.f10846g;
                d2.h context = abstractC0326c.getContext();
                Object l3 = l(context, obj2);
                n0 n3 = l3 != f ? AbstractC1212w.n(abstractC0326c, context, l3) : null;
                try {
                    abstractC0326c.f(obj);
                } finally {
                    if (n3 == null || n3.W()) {
                        f(context, l3);
                    }
                }
            } else {
                CancellationException z = ((e0) u3).z();
                hVar.b(c1204n, z);
                hVar.f(android.support.v4.media.session.a.k(z));
            }
            while (a4.m()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i(String str, long j3, long j4, long j5) {
        String str2;
        Long l3;
        int i3;
        int i4;
        int i5;
        int i6 = v.f10868a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j3;
        }
        int length = str2.length();
        if (length != 0) {
            int i7 = 0;
            char charAt = str2.charAt(0);
            long j6 = -9223372036854775807L;
            if ((charAt < '0' ? (char) 65535 : charAt == '0' ? (char) 0 : (char) 1) < 0) {
                if (length != 1) {
                    if (charAt == '+') {
                        i3 = 0;
                        i7 = 1;
                        boolean z = true;
                        long j7 = 0;
                        long j8 = -256204778801521550L;
                        while (i7 < length) {
                            boolean z2 = z;
                            int digit = Character.digit((int) str2.charAt(i7), 10);
                            if (digit >= 0) {
                                if (j7 >= j8) {
                                    i4 = length;
                                    i5 = i7;
                                } else if (j8 == -256204778801521550L) {
                                    i4 = length;
                                    i5 = i7;
                                    j8 = j6 / 10;
                                    if (j7 < j8) {
                                    }
                                }
                                long j9 = j7 * 10;
                                long j10 = digit;
                                if (j9 >= j6 + j10) {
                                    j7 = j9 - j10;
                                    i7 = i5 + 1;
                                    z = z2;
                                    length = i4;
                                }
                            }
                        }
                        if (i3 == 0) {
                            j7 = -j7;
                        }
                        l3 = Long.valueOf(j7);
                        if (l3 == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = l3.longValue();
                        if (j4 <= longValue && longValue <= j5) {
                            return longValue;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j5 + ", but is '" + longValue + '\'').toString());
                    }
                    if (charAt == '-') {
                        j6 = Long.MIN_VALUE;
                        i7 = 1;
                    }
                }
            }
            i3 = i7;
            boolean z3 = true;
            long j72 = 0;
            long j82 = -256204778801521550L;
            while (i7 < length) {
            }
            if (i3 == 0) {
            }
            l3 = Long.valueOf(j72);
            if (l3 == null) {
            }
        }
        l3 = null;
        if (l3 == null) {
        }
    }

    public static int j(int i3, int i4, String str) {
        return (int) i(str, i3, 1, (i4 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(d2.h hVar) {
        Object l3 = hVar.l(0, w.f);
        kotlin.jvm.internal.j.b(l3);
        return l3;
    }

    public static final Object l(d2.h hVar, Object obj) {
        if (obj == null) {
            obj = k(hVar);
        }
        if (obj == 0) {
            return f;
        }
        if (obj instanceof Integer) {
            return hVar.l(new y(((Number) obj).intValue(), hVar), w.f10870h);
        }
        AbstractC0033i.p(obj);
        throw null;
    }
}
