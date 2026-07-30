package kotlinx.coroutines.scheduling;

import j6.v;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.internal.h0;
import kotlinx.coroutines.internal.j0;

/* loaded from: classes5.dex */
public final class a extends ExecutorCoroutineDispatcher implements Executor {
    public static final a INSTANCE = new a();

    /* renamed from: default, reason: not valid java name */
    private static final CoroutineDispatcher f7default;

    static {
        int coerceAtLeast;
        int systemProp$default;
        l lVar = l.INSTANCE;
        coerceAtLeast = v.coerceAtLeast(64, h0.getAVAILABLE_PROCESSORS());
        systemProp$default = j0.systemProp$default("kotlinx.coroutines.io.parallelism", coerceAtLeast, 0, 0, 12, (Object) null);
        f7default = lVar.limitedParallelism(systemProp$default);
    }

    private a() {
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo1293dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        f7default.mo1293dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        f7default.dispatchYield(coroutineContext, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo1293dispatch(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor getExecutor() {
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i8) {
        return l.INSTANCE.limitedParallelism(i8);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.IO";
    }
}
