package n6;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770c extends AbstractC0768a {

    /* renamed from: l, reason: collision with root package name */
    public final Thread f7040l;

    /* renamed from: m, reason: collision with root package name */
    public final P f7041m;

    public C0770c(CoroutineContext coroutineContext, Thread thread, P p7) {
        super(coroutineContext, true);
        this.f7040l = thread;
        this.f7041m = p7;
    }

    @Override // n6.f0
    public final void l(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f7040l;
        if (Intrinsics.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
