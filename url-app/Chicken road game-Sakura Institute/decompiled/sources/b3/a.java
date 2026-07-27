package b3;

import A.AbstractC0017m;
import W2.A0;
import W2.AbstractC0296s;
import W2.AbstractC0298u;
import W2.B;
import W2.C0294p;
import W2.C0299v;
import W2.InterfaceC0280c0;
import W2.InterfaceC0300w;
import W2.U;
import W2.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1331f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f5646a = new t("CLOSED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final t f5647b = new t("UNDEFINED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final t f5648c = new t("REUSABLE_CLAIMED", 0);

    public static final void a(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        I1.b b4 = b(function1, obj, null);
        if (b4 != null) {
            B.i(b4, coroutineContext);
        }
    }

    public static final I1.b b(Function1 function1, Object obj, I1.b bVar) {
        try {
            function1.invoke(obj);
        } catch (Throwable th) {
            if (bVar == null || bVar.getCause() == th) {
                return new I1.b("Exception in undelivered element handler for " + obj, th);
            }
            C1331f.a(bVar, th);
        }
        return bVar;
    }

    public static final void c(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(AbstractC0017m.g(i2, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object d(r rVar, long j4, Function2 function2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (rVar.f5686c >= j4 && !rVar.c()) {
                return rVar;
            }
            Object obj = b.f5649a.get(rVar);
            t tVar = f5646a;
            if (obj == tVar) {
                return tVar;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) function2.h(Long.valueOf(rVar.f5686c + 1), rVar);
                do {
                    atomicReferenceFieldUpdater = b.f5649a;
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
        if (obj != f5646a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void f(Throwable th, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = d.f5652a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0300w) it.next()).y(th, coroutineContext);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    C1331f.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            C1331f.a(th, new e(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean g(Object obj) {
        return obj == f5646a;
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

    public static final void i(C2.a aVar, Object obj) {
        if (!(aVar instanceof f)) {
            aVar.u(obj);
            return;
        }
        f fVar = (f) aVar;
        Throwable a4 = AbstractC1341p.a(obj);
        Object c0294p = a4 == null ? obj : new C0294p(a4, false);
        AbstractC0298u abstractC0298u = fVar.f5655j;
        E2.c cVar = fVar.f5656k;
        if (abstractC0298u.u(cVar.p())) {
            fVar.f5657l = c0294p;
            fVar.f4224i = 1;
            fVar.f5655j.t(cVar.p(), fVar);
            return;
        }
        U a5 = u0.a();
        if (a5.E()) {
            fVar.f5657l = c0294p;
            fVar.f4224i = 1;
            a5.B(fVar);
            return;
        }
        a5.D(true);
        try {
            InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) cVar.p().k(C0299v.f4296e);
            if (interfaceC0280c0 == null || interfaceC0280c0.b()) {
                Object obj2 = fVar.f5658m;
                CoroutineContext p4 = cVar.p();
                Object c4 = v.c(p4, obj2);
                A0 b4 = c4 != v.f5691a ? AbstractC0296s.b(cVar, p4, c4) : null;
                try {
                    cVar.u(obj);
                    Unit unit = Unit.f7487a;
                } finally {
                    if (b4 == null || b4.k0()) {
                        v.a(p4, c4);
                    }
                }
            } else {
                fVar.u(AbstractC1343r.a(interfaceC0280c0.g()));
            }
            while (a5.G()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final long j(String str, long j4, long j5, long j6) {
        String str2;
        int i2 = u.f5690a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j4;
        }
        Long g4 = kotlin.text.t.g(str2);
        if (g4 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = g4.longValue();
        if (j5 <= longValue && longValue <= j6) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j5 + ".." + j6 + ", but is '" + longValue + '\'').toString());
    }

    public static int k(int i2, int i4, int i5, int i6, String str) {
        if ((i6 & 4) != 0) {
            i4 = 1;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return (int) j(str, i2, i4, i5);
    }
}
