package v2;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import o2.AbstractC3313G;
import o2.AbstractC3340l0;
import t2.H;
import t2.J;

/* renamed from: v2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC3467b extends AbstractC3340l0 implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public static final ExecutorC3467b f46462e = new ExecutorC3467b();

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC3313G f46463f;

    static {
        int e4;
        C3478m c3478m = C3478m.f46483d;
        e4 = J.e("kotlinx.coroutines.io.parallelism", kotlin.ranges.g.d(64, H.a()), 0, 0, 12, null);
        f46463f = c3478m.j(e4);
    }

    private ExecutorC3467b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        g(kotlin.coroutines.g.f41113b, runnable);
    }

    @Override // o2.AbstractC3313G
    public void g(CoroutineContext coroutineContext, Runnable runnable) {
        f46463f.g(coroutineContext, runnable);
    }

    @Override // o2.AbstractC3313G
    public void h(CoroutineContext coroutineContext, Runnable runnable) {
        f46463f.h(coroutineContext, runnable);
    }

    @Override // o2.AbstractC3313G
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // o2.AbstractC3340l0
    public Executor p() {
        return this;
    }
}
