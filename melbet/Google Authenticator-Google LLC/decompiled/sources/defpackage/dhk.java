package defpackage;

import java.util.HashSet;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dhk implements ThreadFactory {
    private final dhl a;
    private final dhn b;
    private final AtomicInteger c = new AtomicInteger(1000);

    public dhk(dhn dhnVar, ThreadFactory threadFactory) {
        this.b = dhnVar;
        this.a = new dhl(threadFactory);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int size;
        dhl dhlVar = this.a;
        Thread newThread = dhlVar.newThread(runnable);
        if (dhm.b()) {
            HashSet hashSet = dhlVar.a;
            synchronized (hashSet) {
                size = hashSet.size();
            }
            if (size >= 1000) {
                while (true) {
                    AtomicInteger atomicInteger = this.c;
                    int i = atomicInteger.get();
                    if (size < i) {
                        break;
                    }
                    if (atomicInteger.compareAndSet(i, i + i)) {
                        dhm.a(this.b, this.a.a(), new dhq(a.ai(size, "Number of blocking threads ", " exceeds starvation threshold of 1000")));
                    }
                }
            }
        }
        return newThread;
    }
}
