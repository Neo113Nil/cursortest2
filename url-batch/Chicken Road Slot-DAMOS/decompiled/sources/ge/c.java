package ge;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: r, reason: collision with root package name */
    public final Thread f4338r;

    /* renamed from: s, reason: collision with root package name */
    public final p0 f4339s;

    public c(CoroutineContext coroutineContext, Thread thread, p0 p0Var) {
        super(coroutineContext, true);
        this.f4338r = thread;
        this.f4339s = p0Var;
    }

    @Override // ge.k1
    public final void k(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f4338r;
        if (Intrinsics.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
