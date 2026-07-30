package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class od extends p {
    public final Thread j;
    public final ew k;

    public od(CoroutineContext coroutineContext, Thread thread, ew ewVar) {
        super(coroutineContext, true);
        this.j = thread;
        this.k = ewVar;
    }

    @Override // defpackage.qb0
    public final void A(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.j;
        if (Intrinsics.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
