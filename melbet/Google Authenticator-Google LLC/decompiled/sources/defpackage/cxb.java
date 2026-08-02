package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cxb implements ThreadFactory {
    private final /* synthetic */ int a;
    private final Object b;

    public cxb(int i, byte[] bArr) {
        this.a = i;
        this.b = new AtomicInteger(0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            Thread newThread = this.b.newThread(runnable);
            if (newThread == null) {
                throw new NullPointerException("Default ThreadFactory returned null thread");
            }
            newThread.setName("punch".concat(String.valueOf(newThread.getName())));
            return newThread;
        }
        if (i != 1) {
            return this.b.newThread(new ath(runnable, 17));
        }
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + ((AtomicInteger) this.b).getAndIncrement());
        return thread;
    }

    public cxb(ThreadFactory threadFactory, int i) {
        this.a = i;
        this.b = threadFactory;
    }

    public cxb(int i) {
        this.a = i;
        this.b = Executors.defaultThreadFactory();
    }
}
