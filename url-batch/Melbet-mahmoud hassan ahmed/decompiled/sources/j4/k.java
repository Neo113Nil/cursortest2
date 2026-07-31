package j4;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k {
    @Deprecated
    public static <TResult> h<TResult> a(@RecentlyNonNull Executor executor, @RecentlyNonNull Callable<TResult> callable) {
        r3.o.j(executor, "Executor must not be null");
        r3.o.j(callable, "Callback must not be null");
        b0 b0Var = new b0();
        executor.execute(new c0(b0Var, callable));
        return b0Var;
    }

    public static <TResult> h<TResult> b(@RecentlyNonNull Exception exc) {
        b0 b0Var = new b0();
        b0Var.p(exc);
        return b0Var;
    }

    public static <TResult> h<TResult> c(@RecentlyNonNull TResult tresult) {
        b0 b0Var = new b0();
        b0Var.n(tresult);
        return b0Var;
    }
}
