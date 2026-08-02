package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvp {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(kqj kqjVar) {
        Object X;
        if (kqjVar instanceof lcc) {
            return ((lcc) kqjVar).toString();
        }
        try {
            X = kqjVar + "@" + b(kqjVar);
        } catch (Throwable th) {
            X = ixc.X(th);
        }
        if (kon.a(X) != null) {
            X = kqjVar.getClass().getName() + "@" + b(kqjVar);
        }
        return (String) X;
    }

    public static void d(int i, krx krxVar, Object obj, kqj kqjVar) {
        Object a;
        int i2 = i - 1;
        if (i2 == 0) {
            jav.l(krxVar, obj, kqjVar);
            return;
        }
        if (i2 == 2) {
            ixe.d(ixe.c(krxVar, obj, kqjVar)).ca(kow.a);
            return;
        }
        if (i2 != 3) {
            return;
        }
        try {
            kqn bU = kqjVar.bU();
            Object b = ldd.b(bU, null);
            try {
                if (krxVar instanceof kqu) {
                    ksy.b(krxVar, 2);
                    a = krxVar.a(obj, kqjVar);
                } else {
                    a = ixe.b(krxVar, obj, kqjVar);
                }
                if (a != kqp.a) {
                    kqjVar.ca(a);
                }
            } finally {
                ldd.c(bU, b);
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof kvw) {
                th = ((kvw) th).a;
            }
            kqjVar.ca(ixc.X(th));
        }
    }

    public static boolean e(int i) {
        return i == 2;
    }

    public static final Object f(krx krxVar, kqj kqjVar) {
        lcy lcyVar = new lcy(kqjVar.bU(), kqjVar);
        return jav.j(lcyVar, true, lcyVar, krxVar);
    }

    public static final kvm g(kqn kqnVar) {
        if (kqnVar.get(kwu.d) == null) {
            kqnVar = kqnVar.plus(new kww());
        }
        return new lby(kqnVar, 0);
    }

    public static final Throwable h(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        koc.b(runtimeException, th);
        return runtimeException;
    }

    public static final void i(kqn kqnVar, Throwable th) {
        if (th instanceof kvw) {
            th = ((kvw) th).a;
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) kqnVar.get(CoroutineExceptionHandler.c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(kqnVar, th);
            } else {
                ixl.b(kqnVar, th);
            }
        } catch (Throwable th2) {
            ixl.b(kqnVar, h(th, th2));
        }
    }
}
