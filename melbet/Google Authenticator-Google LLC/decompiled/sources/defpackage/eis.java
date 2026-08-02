package defpackage;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eis implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/PrimesExecutorsModule$DefaultRejectedExecutionHandler", "rejectedExecution", 76, "PrimesExecutorsModule.java")).u("Service rejected execution of %s", runnable);
    }
}
