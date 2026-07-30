package T7;

import O7.AbstractC0395u;
import O7.AbstractC0399y;
import O7.C0391p;
import O7.C0396v;
import O7.P;
import O7.Y;
import O7.h0;
import O7.p0;
import O7.q0;
import O7.w0;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q7.AbstractC4940i;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final v f3126a = new v("NO_DECISION", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final v f3127b = new v("CLOSED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final v f3128c = new v("UNDEFINED", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final v f3129d = new v("REUSABLE_CLAIMED", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final v f3130e = new v("CONDITION_FALSE", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final v f3131f = new v("NO_THREAD_ELEMENTS", 0);

    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(CL.i(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(t tVar, long j9, E7.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (tVar.f3166v >= j9 && !tVar.c()) {
                return tVar;
            }
            Object obj = d.f3134n.get(tVar);
            v vVar = f3127b;
            if (obj == vVar) {
                return vVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f3166v + 1), tVar);
                do {
                    atomicReferenceFieldUpdater = d.f3134n;
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

    public static final t c(Object obj) {
        if (obj != f3127b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, InterfaceC5138i interfaceC5138i) {
        Throwable runtimeException;
        Iterator it = f.f3137a.iterator();
        while (it.hasNext()) {
            try {
                ((P7.b) it.next()).p(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    com.bumptech.glide.d.b(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            com.bumptech.glide.d.b(th, new g(interfaceC5138i));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f3127b;
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

    public static final void g(InterfaceC5138i interfaceC5138i, Object obj) {
        if (obj == f3131f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object m8 = interfaceC5138i.m(null, x.f3173v);
            kotlin.jvm.internal.h.c(m8, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            D.y.r(m8);
            throw null;
        }
        z zVar = (z) obj;
        p0[] p0VarArr = zVar.f3179b;
        int length = p0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        p0 p0Var = p0VarArr[length];
        kotlin.jvm.internal.h.b(null);
        Object obj2 = zVar.f3178a[length];
        throw null;
    }

    public static final void h(Object obj, InterfaceC5133d interfaceC5133d) {
        if (!(interfaceC5133d instanceof h)) {
            interfaceC5133d.resumeWith(obj);
            return;
        }
        h hVar = (h) interfaceC5133d;
        Throwable a9 = AbstractC4940i.a(obj);
        Object c0391p = a9 == null ? obj : new C0391p(a9, false);
        AbstractC5219c abstractC5219c = hVar.f3141x;
        abstractC5219c.getContext();
        AbstractC0395u abstractC0395u = hVar.f3140w;
        if (abstractC0395u.z()) {
            hVar.f3142y = c0391p;
            hVar.f2550v = 1;
            abstractC0395u.p(abstractC5219c.getContext(), hVar);
            return;
        }
        P a10 = q0.a();
        if (a10.f2568v >= 4294967296L) {
            hVar.f3142y = c0391p;
            hVar.f2550v = 1;
            a10.B(hVar);
            return;
        }
        a10.D(true);
        try {
            Y y6 = (Y) abstractC5219c.getContext().i(C0396v.f2634u);
            if (y6 == null || y6.j()) {
                Object obj2 = hVar.f3143z;
                InterfaceC5138i context = abstractC5219c.getContext();
                Object m8 = m(context, obj2);
                w0 x3 = m8 != f3131f ? AbstractC0399y.x(abstractC5219c, context, m8) : null;
                try {
                    abstractC5219c.resumeWith(obj);
                } finally {
                    if (x3 == null || x3.X()) {
                        g(context, m8);
                    }
                }
            } else {
                CancellationException w9 = ((h0) y6).w();
                hVar.b(c0391p, w9);
                hVar.resumeWith(com.bumptech.glide.f.e(w9));
            }
            while (a10.F()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final long j(String str, long j9, long j10, long j11) {
        String str2;
        int i = w.f3171a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j9;
        }
        Long K8 = M7.q.K(str2);
        if (K8 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = K8.longValue();
        if (j10 <= longValue && longValue <= j11) {
            return longValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j10);
        com.anythink.basead.b.c.i.x(sb, "..", j11, ", but is '");
        sb.append(longValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int k(int i, int i4, String str) {
        return (int) j(str, i, 1, (i4 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object l(InterfaceC5138i interfaceC5138i) {
        Object m8 = interfaceC5138i.m(0, x.f3172u);
        kotlin.jvm.internal.h.b(m8);
        return m8;
    }

    public static final Object m(InterfaceC5138i interfaceC5138i, Object obj) {
        if (obj == null) {
            obj = l(interfaceC5138i);
        }
        if (obj == 0) {
            return f3131f;
        }
        if (obj instanceof Integer) {
            return interfaceC5138i.m(new z(((Number) obj).intValue(), interfaceC5138i), x.f3174w);
        }
        D.y.r(obj);
        throw null;
    }
}
