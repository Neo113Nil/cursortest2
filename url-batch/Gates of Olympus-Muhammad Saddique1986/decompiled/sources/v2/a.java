package v2;

import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q2.AbstractC0831s;
import q2.AbstractC0837y;
import q2.C0829p;
import q2.C0830q;
import q2.C0832t;
import q2.InterfaceC0833u;
import q2.O;
import q2.X;
import q2.o0;
import q2.p0;
import q2.u0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final m1.q f9782a = new m1.q("CLOSED", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final m1.q f9783b = new m1.q("UNDEFINED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final m1.q f9784c = new m1.q("REUSABLE_CLAIMED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final m1.q f9785d = new m1.q("NO_THREAD_ELEMENTS", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final C0830q f9786e = new C0830q(4);

    /* renamed from: f, reason: collision with root package name */
    public static final C0830q f9787f = new C0830q(5);

    /* renamed from: g, reason: collision with root package name */
    public static final C0830q f9788g = new C0830q(6);

    public static final void a(InterfaceC0424c interfaceC0424c, Object obj, V1.i iVar) {
        C1.c b3 = b(interfaceC0424c, obj, null);
        if (b3 != null) {
            AbstractC0837y.m(iVar, b3);
        }
    }

    public static final C1.c b(InterfaceC0424c interfaceC0424c, Object obj, C1.c cVar) {
        try {
            interfaceC0424c.n(obj);
        } catch (Throwable th) {
            if (cVar == null || cVar.getCause() == th) {
                return new C1.c("Exception in undelivered element handler for " + obj, th);
            }
            R1.a.a(cVar, th);
        }
        return cVar;
    }

    public static final void c(int i3) {
        if (i3 < 1) {
            throw new IllegalArgumentException(A.k.h("Expected positive parallelism level, but got ", i3).toString());
        }
    }

    public static final Object d(r rVar, long j3, InterfaceC0426e interfaceC0426e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (rVar.f9826c >= j3 && !rVar.c()) {
                return rVar;
            }
            Object obj = b.f9789a.get(rVar);
            m1.q qVar = f9782a;
            if (obj == qVar) {
                return qVar;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) interfaceC0426e.h(Long.valueOf(rVar.f9826c + 1), rVar);
                do {
                    atomicReferenceFieldUpdater = b.f9789a;
                    if (atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                        if (rVar.c()) {
                            rVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(rVar) == null);
            }
            rVar = rVar2;
        }
    }

    public static final r e(Object obj) {
        if (obj != f9782a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void f(V1.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.f9792a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0833u) it.next()).y(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    R1.a.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            R1.a.a(th, new e(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean g(Object obj) {
        return obj == f9782a;
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

    public static final void i(V1.i iVar, Object obj) {
        if (obj == f9785d) {
            return;
        }
        if (!(obj instanceof v)) {
            Object e3 = iVar.e(null, f9787f);
            f2.j.d(e3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            A.k.r(e3);
            throw null;
        }
        v vVar = (v) obj;
        o0[] o0VarArr = vVar.f9832b;
        int length = o0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        o0 o0Var = o0VarArr[length];
        f2.j.c(null);
        Object obj2 = vVar.f9831a[length];
        throw null;
    }

    public static final void j(V1.d dVar, Object obj) {
        if (!(dVar instanceof f)) {
            dVar.u(obj);
            return;
        }
        f fVar = (f) dVar;
        Throwable a3 = R1.l.a(obj);
        Object c0829p = a3 == null ? obj : new C0829p(a3, false);
        AbstractC0831s abstractC0831s = fVar.f9795g;
        X1.c cVar = fVar.f9796h;
        if (abstractC0831s.F(cVar.t())) {
            fVar.f9797i = c0829p;
            fVar.f7850f = 1;
            abstractC0831s.D(cVar.t(), fVar);
            return;
        }
        O a4 = p0.a();
        if (a4.L()) {
            fVar.f9797i = c0829p;
            fVar.f7850f = 1;
            a4.I(fVar);
            return;
        }
        a4.K(true);
        try {
            X x3 = (X) cVar.t().v(C0832t.f7929e);
            if (x3 == null || x3.b()) {
                Object obj2 = fVar.f9798j;
                V1.i t3 = cVar.t();
                Object n3 = n(t3, obj2);
                u0 y3 = n3 != f9785d ? AbstractC0837y.y(cVar, t3, n3) : null;
                try {
                    cVar.u(obj);
                } finally {
                    if (y3 == null || y3.l0()) {
                        i(t3, n3);
                    }
                }
            } else {
                fVar.u(R1.a.b(x3.g()));
            }
            while (a4.N()) {
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
        int i4 = t.f9828a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j3;
        }
        n.r.i(10);
        int length = str2.length();
        if (length != 0) {
            int i5 = 0;
            char charAt = str2.charAt(0);
            long j7 = -9223372036854775807L;
            if (f2.j.g(charAt, 48) < 0) {
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

    public static final Object m(V1.i iVar) {
        Object e3 = iVar.e(0, f9786e);
        f2.j.c(e3);
        return e3;
    }

    public static final Object n(V1.i iVar, Object obj) {
        if (obj == null) {
            obj = m(iVar);
        }
        if (obj == 0) {
            return f9785d;
        }
        if (obj instanceof Integer) {
            return iVar.e(new v(((Number) obj).intValue(), iVar), f9788g);
        }
        A.k.r(obj);
        throw null;
    }
}
