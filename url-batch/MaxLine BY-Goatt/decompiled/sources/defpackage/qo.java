package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qo extends e0 {
    public final Thread r;
    public final pi0 s;

    public qo(CoroutineContext coroutineContext, Thread thread, pi0 pi0Var) {
        super(coroutineContext, true);
        this.r = thread;
        this.s = pi0Var;
    }

    @Override // defpackage.n61
    public final void k(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.r;
        if (Intrinsics.b(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
