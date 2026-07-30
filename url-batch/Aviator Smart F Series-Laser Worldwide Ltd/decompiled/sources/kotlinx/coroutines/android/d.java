package kotlinx.coroutines.android;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.n;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v1;

/* loaded from: classes3.dex */
public abstract class d extends v1 implements p0 {
    public /* synthetic */ d(o oVar) {
        this();
    }

    @Override // kotlinx.coroutines.p0
    public Object delay(long j8, kotlin.coroutines.c cVar) {
        return p0.a.delay(this, j8, cVar);
    }

    @Override // kotlinx.coroutines.v1
    public abstract d getImmediate();

    public u0 invokeOnTimeout(long j8, Runnable runnable, CoroutineContext coroutineContext) {
        return p0.a.invokeOnTimeout(this, j8, runnable, coroutineContext);
    }

    /* renamed from: scheduleResumeAfterDelay */
    public abstract /* synthetic */ void mo1294scheduleResumeAfterDelay(long j8, n nVar);

    private d() {
    }
}
