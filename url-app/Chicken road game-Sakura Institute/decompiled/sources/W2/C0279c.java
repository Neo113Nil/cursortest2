package W2;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: W2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279c extends AbstractC0275a {

    /* renamed from: j, reason: collision with root package name */
    public final Thread f4251j;

    /* renamed from: k, reason: collision with root package name */
    public final U f4252k;

    public C0279c(CoroutineContext coroutineContext, Thread thread, U u4) {
        super(coroutineContext, true);
        this.f4251j = thread;
        this.f4252k = u4;
    }

    @Override // W2.k0
    public final void A(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f4251j;
        if (Intrinsics.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
