package le;

import ge.c1;
import ge.g0;
import ge.p0;
import ge.u1;
import ge.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.i0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a8.f f5964a = new a8.f("CLOSED", 3);

    /* renamed from: b, reason: collision with root package name */
    public static final a8.f f5965b = new a8.f("UNDEFINED", 3);

    /* renamed from: c, reason: collision with root package name */
    public static final a8.f f5966c = new a8.f("REUSABLE_CLAIMED", 3);

    public static final void a(int i3) {
        if (i3 >= 1) {
            return;
        }
        a2.r.h(v4.a.j(i3, "Expected positive parallelism level, but got "));
    }

    public static final Object b(s sVar, long j, Function2 function2) {
        while (true) {
            if (sVar.f5999c >= j && !sVar.c()) {
                return sVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f5967a;
            Object obj = atomicReferenceFieldUpdater.get(sVar);
            a8.f fVar = f5964a;
            if (obj == fVar) {
                return fVar;
            }
            s sVar2 = (s) ((c) obj);
            if (sVar2 == null) {
                sVar2 = (s) function2.invoke(Long.valueOf(sVar.f5999c + 1), sVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(sVar, null, sVar2)) {
                    if (atomicReferenceFieldUpdater.get(sVar) != null) {
                        break;
                    }
                }
                if (sVar.c()) {
                    sVar.d();
                }
            }
            sVar = sVar2;
        }
    }

    public static final s c(Object obj) {
        if (obj != f5964a) {
            return (s) obj;
        }
        i0.l("Does not contain segment");
        return null;
    }

    public static final void d(Throwable th, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = e.f5970a.iterator();
        while (it.hasNext()) {
            try {
                ((ge.v) it.next()).J(th, coroutineContext);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    hd.b.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                try {
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
                } catch (Throwable unused) {
                }
            }
        }
        try {
            hd.b.a(th, new f(coroutineContext));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
        } catch (Throwable unused3) {
        }
    }

    public static final boolean e(Object obj) {
        return obj == f5964a;
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

    public static final void g(Object obj, ld.a aVar) {
        if (!(aVar instanceof g)) {
            aVar.resumeWith(obj);
            return;
        }
        g gVar = (g) aVar;
        ge.t tVar = gVar.f5973r;
        nd.c cVar = gVar.f5974s;
        Throwable a9 = hd.n.a(obj);
        Object qVar = a9 == null ? obj : new ge.q(a9, false);
        if (i(tVar, cVar.getContext())) {
            gVar.f5975t = qVar;
            gVar.f4361i = 1;
            h(tVar, cVar.getContext(), gVar);
            return;
        }
        p0 a10 = u1.a();
        if (a10.f4390i >= 4294967296L) {
            gVar.f5975t = qVar;
            gVar.f4361i = 1;
            a10.Q(gVar);
            return;
        }
        a10.R(true);
        try {
            c1 c1Var = (c1) cVar.getContext().m(ge.u.f4403e);
            if (c1Var == null || c1Var.d()) {
                Object obj2 = gVar.f5976u;
                CoroutineContext context = cVar.getContext();
                Object c10 = v.c(context, obj2);
                z1 c11 = c10 != v.f6002a ? ge.r.c(cVar, context, c10) : null;
                try {
                    cVar.resumeWith(obj);
                } finally {
                    if (c11 == null || c11.j0()) {
                        v.a(context, c10);
                    }
                }
            } else {
                gVar.resumeWith(cf.c.n(c1Var.x()));
            }
            while (a10.T()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void h(ge.t tVar, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            tVar.L(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new g0(th, tVar, coroutineContext);
        }
    }

    public static final boolean i(ge.t tVar, CoroutineContext coroutineContext) {
        try {
            return tVar.N(coroutineContext);
        } catch (Throwable th) {
            throw new g0(th, tVar, coroutineContext);
        }
    }

    public static final long j(String str, long j, long j3, long j10) {
        String str2;
        int i3 = u.f6001a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long x10 = StringsKt.x(str2);
        if (x10 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = x10.longValue();
        if (j3 <= longValue && longValue <= j10) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j10 + ", but is '" + longValue + '\'').toString());
    }

    public static int k(String str, int i3, int i10) {
        return (int) j(str, i3, 1, (i10 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
