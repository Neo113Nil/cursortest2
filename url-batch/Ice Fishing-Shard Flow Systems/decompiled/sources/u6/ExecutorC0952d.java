package u6;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import n6.AbstractC0786t;
import n6.Q;
import s6.AbstractC0898a;
import s6.t;

/* renamed from: u6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0952d extends Q implements Executor {

    /* renamed from: i, reason: collision with root package name */
    public static final ExecutorC0952d f8106i = new ExecutorC0952d();

    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC0786t f8107l;

    static {
        l lVar = l.f8120i;
        int i2 = t.f7856a;
        if (64 >= i2) {
            i2 = 64;
        }
        f8107l = lVar.H(AbstractC0898a.i("kotlinx.coroutines.io.parallelism", i2, 12));
    }

    @Override // n6.AbstractC0786t
    public final void E(CoroutineContext coroutineContext, Runnable runnable) {
        f8107l.E(coroutineContext, runnable);
    }

    @Override // n6.AbstractC0786t
    public final void F(CoroutineContext coroutineContext, Runnable runnable) {
        f8107l.F(coroutineContext, runnable);
    }

    @Override // n6.AbstractC0786t
    public final AbstractC0786t H(int i2) {
        return l.f8120i.H(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        E(kotlin.coroutines.g.f6146d, runnable);
    }

    @Override // n6.AbstractC0786t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
