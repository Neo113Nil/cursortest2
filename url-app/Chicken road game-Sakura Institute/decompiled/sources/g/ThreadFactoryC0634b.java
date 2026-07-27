package g;

import B1.C0097d;
import j2.C0713c;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0634b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6665a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6666b;

    public ThreadFactoryC0634b(C0097d c0097d) {
        this.f6665a = 1;
        this.f6666b = c0097d;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f6665a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f6666b).getAndIncrement());
                return thread;
            default:
                ((C0097d) this.f6666b).getClass();
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("FirebaseDatabaseWorker");
                newThread.setDaemon(true);
                newThread.setUncaughtExceptionHandler(new C0713c(this));
                return newThread;
        }
    }

    public ThreadFactoryC0634b() {
        this.f6665a = 0;
        this.f6666b = new AtomicInteger(0);
    }
}
