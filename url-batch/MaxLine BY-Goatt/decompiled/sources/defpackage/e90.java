package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e90 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Object b;

    public e90() {
        this.a = 0;
        this.b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
            default:
                Thread newThread = ((ThreadFactory) obj).newThread(runnable);
                newThread.setName("ScionFrontendApi");
                return newThread;
        }
    }

    public e90(dg3 dg3Var) {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
    }
}
