package p2;

import H2.AbstractC0080b;
import M1.B;
import e2.AbstractC0381e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.AbstractC0546s;
import k2.AbstractC0552y;
import k2.C0544p;
import k2.C0545q;
import k2.C0547t;
import k2.InterfaceC0548u;
import k2.O;
import k2.X;
import k2.o0;
import k2.p0;
import k2.u0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final j1.p f6761a = new j1.p("CLOSED", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final j1.p f6762b = new j1.p("UNDEFINED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final j1.p f6763c = new j1.p("REUSABLE_CLAIMED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final j1.p f6764d = new j1.p("NO_THREAD_ELEMENTS", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final C0545q f6765e = new C0545q(4);

    /* renamed from: f, reason: collision with root package name */
    public static final C0545q f6766f = new C0545q(5);

    /* renamed from: g, reason: collision with root package name */
    public static final C0545q f6767g = new C0545q(6);

    public static final void a(Y1.c cVar, Object obj, P1.i iVar) {
        L1.f b2 = b(cVar, obj, null);
        if (b2 != null) {
            AbstractC0552y.l(iVar, b2);
        }
    }

    public static final L1.f b(Y1.c cVar, Object obj, L1.f fVar) {
        try {
            cVar.j(obj);
        } catch (Throwable th) {
            if (fVar == null || fVar.getCause() == th) {
                return new L1.f("Exception in undelivered element handler for " + obj, th);
            }
            B.o(fVar, th);
        }
        return fVar;
    }

    public static final void c(int i3) {
        if (i3 < 1) {
            throw new IllegalArgumentException(AbstractC0080b.h("Expected positive parallelism level, but got ", i3).toString());
        }
    }

    public static final Object d(s sVar, long j3, Y1.e eVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (sVar.f6806c >= j3 && !sVar.c()) {
                return sVar;
            }
            Object obj = b.f6768a.get(sVar);
            j1.p pVar = f6761a;
            if (obj == pVar) {
                return pVar;
            }
            s sVar2 = (s) ((b) obj);
            if (sVar2 == null) {
                sVar2 = (s) eVar.g(Long.valueOf(sVar.f6806c + 1), sVar);
                do {
                    atomicReferenceFieldUpdater = b.f6768a;
                    if (atomicReferenceFieldUpdater.compareAndSet(sVar, null, sVar2)) {
                        if (sVar.c()) {
                            sVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(sVar) == null);
            }
            sVar = sVar2;
        }
    }

    public static final s e(Object obj) {
        if (obj != f6761a) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void f(P1.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.f6771a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0548u) it.next()).D(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    B.o(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            B.o(th, new e(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean g(Object obj) {
        return obj == f6761a;
    }

    public static final Object h(Object obj, Object obj2) {
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

    public static final void i(P1.i iVar, Object obj) {
        if (obj == f6764d) {
            return;
        }
        if (!(obj instanceof w)) {
            Object r3 = iVar.r(null, f6766f);
            Z1.i.d(r3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0080b.r(r3);
            throw null;
        }
        w wVar = (w) obj;
        o0[] o0VarArr = wVar.f6812b;
        int length = o0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        o0 o0Var = o0VarArr[length];
        Z1.i.c(null);
        Object obj2 = wVar.f6811a[length];
        throw null;
    }

    public static final void j(P1.d dVar, Object obj) {
        if (!(dVar instanceof f)) {
            dVar.resumeWith(obj);
            return;
        }
        f fVar = (f) dVar;
        Throwable a3 = L1.m.a(obj);
        Object c0544p = a3 == null ? obj : new C0544p(a3, false);
        AbstractC0546s abstractC0546s = fVar.f6774g;
        R1.c cVar = fVar.f6775h;
        if (abstractC0546s.Q(cVar.getContext())) {
            fVar.f6776i = c0544p;
            fVar.f5311f = 1;
            abstractC0546s.P(cVar.getContext(), fVar);
            return;
        }
        O a4 = p0.a();
        if (a4.W()) {
            fVar.f6776i = c0544p;
            fVar.f5311f = 1;
            a4.T(fVar);
            return;
        }
        a4.V(true);
        try {
            X x3 = (X) cVar.getContext().k(C0547t.f5390e);
            if (x3 == null || x3.b()) {
                Object obj2 = fVar.f6777j;
                P1.i context = cVar.getContext();
                Object n3 = n(context, obj2);
                u0 x4 = n3 != f6764d ? AbstractC0552y.x(cVar, context, n3) : null;
                try {
                    cVar.resumeWith(obj);
                } finally {
                    if (x4 == null || x4.h0()) {
                        i(context, n3);
                    }
                }
            } else {
                fVar.resumeWith(I2.l.t(x3.m()));
            }
            while (a4.Y()) {
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
    public static final long k(String str, long j3, long j4, long j5) {
        String str2;
        int i3;
        Long valueOf;
        long j6;
        int i4 = u.f6808a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j3;
        }
        AbstractC0381e.m(10);
        int length = str2.length();
        if (length != 0) {
            int i5 = 0;
            char charAt = str2.charAt(0);
            long j7 = -9223372036854775807L;
            if (Z1.i.g(charAt, 48) < 0) {
                if (length != 1) {
                    if (charAt == '+') {
                        i3 = 0;
                        i5 = 1;
                        long j8 = 0;
                        long j9 = -256204778801521550L;
                        while (i5 < length) {
                            int digit = Character.digit((int) str2.charAt(i5), 10);
                            if (digit >= 0) {
                                if (j8 < j9) {
                                    if (j9 == -256204778801521550L) {
                                        j9 = j7 / 10;
                                        if (j8 < j9) {
                                        }
                                    }
                                }
                                long j10 = j8 * 10;
                                long j11 = digit;
                                if (j10 >= j7 + j11) {
                                    j8 = j10 - j11;
                                    i5++;
                                }
                            }
                        }
                        valueOf = i3 == 0 ? Long.valueOf(j8) : Long.valueOf(-j8);
                        if (valueOf == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = valueOf.longValue();
                        if (j4 <= longValue) {
                            j6 = j5;
                            if (longValue <= j6) {
                                return longValue;
                            }
                        } else {
                            j6 = j5;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j6 + ", but is '" + longValue + '\'').toString());
                    }
                    if (charAt == '-') {
                        j7 = Long.MIN_VALUE;
                        i5 = 1;
                    }
                }
            }
            i3 = i5;
            long j82 = 0;
            long j92 = -256204778801521550L;
            while (i5 < length) {
            }
            valueOf = i3 == 0 ? Long.valueOf(j82) : Long.valueOf(-j82);
            if (valueOf == null) {
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static int l(String str, int i3, int i4, int i5, int i6) {
        if ((i6 & 4) != 0) {
            i4 = 1;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return (int) k(str, i3, i4, i5);
    }

    public static final Object m(P1.i iVar) {
        Object r3 = iVar.r(0, f6765e);
        Z1.i.c(r3);
        return r3;
    }

    public static final Object n(P1.i iVar, Object obj) {
        if (obj == null) {
            obj = m(iVar);
        }
        if (obj == 0) {
            return f6764d;
        }
        if (obj instanceof Integer) {
            return iVar.r(new w(((Number) obj).intValue(), iVar), f6767g);
        }
        AbstractC0080b.r(obj);
        throw null;
    }
}
