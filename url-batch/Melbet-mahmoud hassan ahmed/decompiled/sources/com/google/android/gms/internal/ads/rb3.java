package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class rb3 extends tb3 {
    public static <V> qb3<V> a(Iterable<? extends cc3<? extends V>> iterable) {
        return new qb3<>(false, e73.t(iterable), null);
    }

    @SafeVarargs
    public static <V> qb3<V> b(cc3<? extends V>... cc3VarArr) {
        return new qb3<>(false, e73.v(cc3VarArr), null);
    }

    public static <V> qb3<V> c(Iterable<? extends cc3<? extends V>> iterable) {
        return new qb3<>(true, e73.t(iterable), null);
    }

    @SafeVarargs
    public static <V> qb3<V> d(cc3<? extends V>... cc3VarArr) {
        return new qb3<>(true, e73.v(cc3VarArr), null);
    }

    public static <V> cc3<List<V>> e(Iterable<? extends cc3<? extends V>> iterable) {
        return new ya3(e73.t(iterable), true);
    }

    public static <V, X extends Throwable> cc3<V> f(cc3<? extends V> cc3Var, Class<X> cls, e43<? super X, ? extends V> e43Var, Executor executor) {
        r93 r93Var = new r93(cc3Var, cls, e43Var);
        cc3Var.b(r93Var, jc3.c(executor, r93Var));
        return r93Var;
    }

    public static <V, X extends Throwable> cc3<V> g(cc3<? extends V> cc3Var, Class<X> cls, xa3<? super X, ? extends V> xa3Var, Executor executor) {
        q93 q93Var = new q93(cc3Var, cls, xa3Var);
        cc3Var.b(q93Var, jc3.c(executor, q93Var));
        return q93Var;
    }

    public static <V> cc3<V> h(Throwable th) {
        Objects.requireNonNull(th);
        return new ub3(th);
    }

    public static <V> cc3<V> i(V v6) {
        return v6 == null ? (cc3<V>) vb3.f13287g : new vb3(v6);
    }

    public static cc3<Void> j() {
        return vb3.f13287g;
    }

    public static <O> cc3<O> k(Callable<O> callable, Executor executor) {
        rc3 rc3Var = new rc3(callable);
        executor.execute(rc3Var);
        return rc3Var;
    }

    public static <O> cc3<O> l(wa3<O> wa3Var, Executor executor) {
        rc3 rc3Var = new rc3(wa3Var);
        executor.execute(rc3Var);
        return rc3Var;
    }

    public static <I, O> cc3<O> m(cc3<I> cc3Var, e43<? super I, ? extends O> e43Var, Executor executor) {
        int i7 = ma3.f8472o;
        Objects.requireNonNull(e43Var);
        la3 la3Var = new la3(cc3Var, e43Var);
        cc3Var.b(la3Var, jc3.c(executor, la3Var));
        return la3Var;
    }

    public static <I, O> cc3<O> n(cc3<I> cc3Var, xa3<? super I, ? extends O> xa3Var, Executor executor) {
        int i7 = ma3.f8472o;
        Objects.requireNonNull(executor);
        ka3 ka3Var = new ka3(cc3Var, xa3Var);
        cc3Var.b(ka3Var, jc3.c(executor, ka3Var));
        return ka3Var;
    }

    public static <V> cc3<V> o(cc3<V> cc3Var, long j7, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return cc3Var.isDone() ? cc3Var : oc3.G(cc3Var, j7, timeUnit, scheduledExecutorService);
    }

    public static <V> V p(Future<V> future) {
        if (future.isDone()) {
            return (V) tc3.a(future);
        }
        throw new IllegalStateException(b53.b("Future was expected to be done: %s", future));
    }

    public static <V> V q(Future<V> future) {
        try {
            return (V) tc3.a(future);
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof Error) {
                throw new gb3((Error) cause);
            }
            throw new sc3(cause);
        }
    }

    public static <V> void r(cc3<V> cc3Var, nb3<? super V> nb3Var, Executor executor) {
        Objects.requireNonNull(nb3Var);
        cc3Var.b(new ob3(cc3Var, nb3Var), executor);
    }
}
