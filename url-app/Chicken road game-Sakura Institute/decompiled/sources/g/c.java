package g;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3656a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3657b;

    public c(b1.b bVar) {
        this.f3656a = 1;
        this.f3657b = bVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3656a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f3657b).getAndIncrement());
                return thread;
            default:
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("FirebaseDatabaseWorker");
                newThread.setDaemon(true);
                newThread.setUncaughtExceptionHandler(new o5.c(this));
                return newThread;
        }
    }

    public c() {
        this.f3656a = 0;
        this.f3657b = new AtomicInteger(0);
    }
}
