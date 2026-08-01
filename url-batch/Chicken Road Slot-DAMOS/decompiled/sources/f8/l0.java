package f8;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class l0 {
    public static a a(ListenableFuture listenableFuture, Class cls, z zVar, Executor executor) {
        int i3 = c.f4119z;
        a aVar = new a(listenableFuture, cls, zVar);
        listenableFuture.a(aVar, z4.w.I(executor, aVar));
        return aVar;
    }

    public static Object b(Future future) {
        Object obj;
        if (!future.isDone()) {
            kotlin.collections.i0.l(k7.e.y("Future was expected to be done: %s", future));
            return null;
        }
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static n0 c(Exception exc) {
        n0 n0Var = new n0();
        n0Var.m(exc);
        return n0Var;
    }

    public static o0 d(Object obj) {
        return obj == null ? o0.f4157e : new o0(obj);
    }

    public static ListenableFuture e(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        k0 k0Var = new k0();
        k0Var.f4155v = listenableFuture;
        listenableFuture.a(k0Var, d0.f4128d);
        return k0Var;
    }

    public static t f(ListenableFuture listenableFuture, a8.d dVar, Executor executor) {
        int i3 = u.f4182y;
        t tVar = new t(listenableFuture, dVar);
        listenableFuture.a(tVar, z4.w.I(executor, tVar));
        return tVar;
    }

    public static s g(ListenableFuture listenableFuture, z zVar, Executor executor) {
        int i3 = u.f4182y;
        executor.getClass();
        s sVar = new s(listenableFuture, zVar);
        listenableFuture.a(sVar, z4.w.I(executor, sVar));
        return sVar;
    }
}
