package w1;

import G1.AbstractC0001b;
import a.AbstractC0058a;
import c1.AbstractC0106c;
import i1.InterfaceC0192l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r1.AbstractC0366p;
import r1.AbstractC0369t;
import r1.C0361k;
import r1.C0362l;
import r1.C0367q;
import r1.E;
import r1.N;
import r1.V;
import r1.c0;
import r1.d0;
import r1.f0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final V.q f4462a = new V.q("NO_DECISION", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final V.q f4463b = new V.q("CLOSED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final V.q f4464c = new V.q("UNDEFINED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final V.q f4465d = new V.q("REUSABLE_CLAIMED", 1);
    public static final V.q e = new V.q("CONDITION_FALSE", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final V.q f4466f = new V.q("NO_THREAD_ELEMENTS", 1);

    public static final void a(InterfaceC0192l interfaceC0192l, Object obj, a1.i iVar) {
        W0.c b2 = b(interfaceC0192l, obj, null);
        if (b2 != null) {
            AbstractC0369t.e(iVar, b2);
        }
    }

    public static final W0.c b(InterfaceC0192l interfaceC0192l, Object obj, W0.c cVar) {
        try {
            interfaceC0192l.g(obj);
        } catch (Throwable th) {
            if (cVar == null || cVar.getCause() == th) {
                return new W0.c("Exception in undelivered element handler for " + obj, th);
            }
            AbstractC0058a.a(cVar, th);
        }
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, w1.t] */
    /* JADX WARN: Type inference failed for: r3v4, types: [w1.t] */
    public static final Object c(long j, t1.j jVar) {
        t1.c cVar = t1.c.i;
        while (true) {
            long j2 = jVar.f4500c;
            if (j2 >= j && !jVar.c()) {
                return jVar;
            }
            Object obj = d.f4469a.get(jVar);
            V.q qVar = f4463b;
            if (obj == qVar) {
                return qVar;
            }
            ?? r3 = (t) ((d) obj);
            if (r3 != 0) {
                jVar = r3;
            } else {
                ?? r12 = (t) cVar.d(Long.valueOf(j2 + 1), jVar);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f4469a;
                    if (atomicReferenceFieldUpdater.compareAndSet(jVar, null, r12)) {
                        if (jVar.c()) {
                            jVar.d();
                        }
                        jVar = r12;
                    } else if (atomicReferenceFieldUpdater.get(jVar) != null) {
                        break;
                    }
                }
            }
        }
    }

    public static final t d(Object obj) {
        if (obj == f4463b) {
            throw new IllegalStateException("Does not contain segment");
        }
        j1.h.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (t) obj;
    }

    public static final void e(a1.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = e.f4471a.iterator();
        while (it.hasNext()) {
            try {
                ((s1.b) it.next()).D(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0058a.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC0058a.a(th, new f(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean f(Object obj) {
        return obj == f4463b;
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

    public static final void h(a1.i iVar, Object obj) {
        if (obj == f4466f) {
            return;
        }
        if (!(obj instanceof y)) {
            j1.h.c(iVar.q(null, w.f4504d), "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            throw new ClassCastException();
        }
        y yVar = (y) obj;
        c0[] c0VarArr = yVar.f4508b;
        int length = c0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        c0 c0Var = c0VarArr[length];
        j1.h.b(null);
        Object obj2 = yVar.f4507a[length];
        throw null;
    }

    public static final void i(a1.d dVar, Object obj, InterfaceC0192l interfaceC0192l) {
        if (!(dVar instanceof g)) {
            dVar.resumeWith(obj);
            return;
        }
        g gVar = (g) dVar;
        Throwable a2 = W0.f.a(obj);
        Object c0362l = a2 == null ? interfaceC0192l != null ? new C0362l(obj, interfaceC0192l) : obj : new C0361k(a2, false);
        AbstractC0106c abstractC0106c = gVar.e;
        abstractC0106c.getContext();
        AbstractC0366p abstractC0366p = gVar.f4474d;
        if (abstractC0366p.E()) {
            gVar.f4475f = c0362l;
            gVar.f4099c = 1;
            abstractC0366p.D(abstractC0106c.getContext(), gVar);
            return;
        }
        E a3 = d0.a();
        if (a3.f4040c >= 4294967296L) {
            gVar.f4475f = c0362l;
            gVar.f4099c = 1;
            X0.i iVar = a3.e;
            if (iVar == null) {
                iVar = new X0.i();
                a3.e = iVar;
            }
            iVar.addLast(gVar);
            return;
        }
        a3.H(true);
        try {
            N n2 = (N) abstractC0106c.getContext().d(C0367q.f4090b);
            if (n2 == null || n2.a()) {
                Object obj2 = gVar.f4476g;
                a1.i context = abstractC0106c.getContext();
                Object m2 = m(context, obj2);
                f0 l2 = m2 != f4466f ? AbstractC0369t.l(abstractC0106c, context, m2) : null;
                try {
                    abstractC0106c.resumeWith(obj);
                } finally {
                    if (l2 == null || l2.H()) {
                        h(context, m2);
                    }
                }
            } else {
                CancellationException o2 = ((V) n2).o();
                gVar.b(c0362l, o2);
                gVar.resumeWith(H1.d.r(o2));
            }
            while (a3.I()) {
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
    public static final long k(String str, long j, long j2, long j3) {
        String str2;
        int i;
        Long valueOf;
        long j4;
        int i2 = v.f4502a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        H1.d.m(10);
        int length = str2.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str2.charAt(0);
            long j5 = -9223372036854775807L;
            if (j1.h.f(charAt, 48) < 0) {
                if (length != 1) {
                    if (charAt == '+') {
                        i = 0;
                        i3 = 1;
                        long j6 = 0;
                        long j7 = -256204778801521550L;
                        while (i3 < length) {
                            int digit = Character.digit((int) str2.charAt(i3), 10);
                            if (digit >= 0) {
                                if (j6 < j7) {
                                    if (j7 == -256204778801521550L) {
                                        j7 = j5 / 10;
                                        if (j6 < j7) {
                                        }
                                    }
                                }
                                long j8 = j6 * 10;
                                long j9 = digit;
                                if (j8 >= j5 + j9) {
                                    j6 = j8 - j9;
                                    i3++;
                                }
                            }
                        }
                        valueOf = i == 0 ? Long.valueOf(j6) : Long.valueOf(-j6);
                        if (valueOf == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = valueOf.longValue();
                        if (j2 <= longValue) {
                            j4 = j3;
                            if (longValue <= j4) {
                                return longValue;
                            }
                        } else {
                            j4 = j3;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j4 + ", but is '" + longValue + '\'').toString());
                    }
                    if (charAt == '-') {
                        j5 = Long.MIN_VALUE;
                        i3 = 1;
                    }
                }
            }
            i = i3;
            long j62 = 0;
            long j72 = -256204778801521550L;
            while (i3 < length) {
            }
            valueOf = i == 0 ? Long.valueOf(j62) : Long.valueOf(-j62);
            if (valueOf == null) {
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static int l(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) k(str, i, i2, i3);
    }

    public static final Object m(a1.i iVar, Object obj) {
        if (obj == null) {
            obj = iVar.q(0, w.f4503c);
            j1.h.b(obj);
        }
        if (obj == 0) {
            return f4466f;
        }
        if (obj instanceof Integer) {
            return iVar.q(new y(((Number) obj).intValue(), iVar), w.e);
        }
        AbstractC0001b.i(obj);
        throw null;
    }
}
