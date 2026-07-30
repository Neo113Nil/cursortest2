package s6;

import R5.C0164d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import l0.C0654a;
import n6.AbstractC0786t;
import n6.C0784q;
import n6.C0787u;
import n6.InterfaceC0788v;
import n6.P;
import n6.X;
import n6.f0;
import n6.o0;
import n6.u0;
import o6.C0806b;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0898a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0654a f7818a = new C0654a("CLOSED", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final C0654a f7819b = new C0654a("UNDEFINED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final C0654a f7820c = new C0654a("REUSABLE_CLAIMED", 1);

    public static final void a(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException(C4.p.g(i2, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(r rVar, long j, Function2 function2) {
        while (true) {
            if (rVar.f7854c >= j && !rVar.c()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f7821a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            C0654a c0654a = f7818a;
            if (obj == c0654a) {
                return c0654a;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) function2.invoke(Long.valueOf(rVar.f7854c + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.c()) {
                    rVar.d();
                }
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f7818a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = d.f7824a.iterator();
        while (it.hasNext()) {
            try {
                ((C0806b) ((InterfaceC0788v) it.next())).E(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    C0164d.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            C0164d.a(th, new e(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f7818a;
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

    public static final void g(V5.b bVar, Object obj) {
        if (!(bVar instanceof f)) {
            bVar.resumeWith(obj);
            return;
        }
        f fVar = (f) bVar;
        Throwable a7 = R5.n.a(obj);
        Object c0784q = a7 == null ? obj : new C0784q(a7, false);
        AbstractC0786t abstractC0786t = fVar.f7827l;
        X5.c cVar = fVar.f7828m;
        if (abstractC0786t.G(cVar.getContext())) {
            fVar.f7829n = c0784q;
            fVar.f7010i = 1;
            fVar.f7827l.E(cVar.getContext(), fVar);
            return;
        }
        P a8 = o0.a();
        if (a8.f7027i >= 4294967296L) {
            fVar.f7829n = c0784q;
            fVar.f7010i = 1;
            a8.J(fVar);
            return;
        }
        a8.L(true);
        try {
            X x7 = (X) cVar.getContext().g(C0787u.f7085e);
            if (x7 == null || x7.a()) {
                Object obj2 = fVar.f7830o;
                CoroutineContext context = cVar.getContext();
                Object c7 = u.c(context, obj2);
                u0 b7 = c7 != u.f7857a ? n6.r.b(cVar, context, c7) : null;
                try {
                    cVar.resumeWith(obj);
                    Unit unit = Unit.f6114a;
                } finally {
                    if (b7 == null || b7.Z()) {
                        u.a(context, c7);
                    }
                }
            } else {
                fVar.resumeWith(V6.b.n(((f0) x7).w()));
            }
            while (a8.N()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final long h(String str, long j, long j7, long j8) {
        String str2;
        int i2 = t.f7856a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long I7 = StringsKt.I(str2);
        if (I7 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = I7.longValue();
        if (j7 <= longValue && longValue <= j8) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j7 + ".." + j8 + ", but is '" + longValue + '\'').toString());
    }

    public static int i(String str, int i2, int i5) {
        return (int) h(str, i2, 1, (i5 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
