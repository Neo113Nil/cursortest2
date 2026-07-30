package u6;

import kotlin.coroutines.CoroutineContext;
import n6.Q;

/* loaded from: classes.dex */
public abstract class h extends Q {

    /* renamed from: i, reason: collision with root package name */
    public ExecutorC0951c f8110i;

    @Override // n6.AbstractC0786t
    public final void E(CoroutineContext coroutineContext, Runnable runnable) {
        ExecutorC0951c.g(this.f8110i, runnable, 6);
    }

    @Override // n6.AbstractC0786t
    public final void F(CoroutineContext coroutineContext, Runnable runnable) {
        ExecutorC0951c.g(this.f8110i, runnable, 2);
    }
}
