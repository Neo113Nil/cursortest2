package Q4;

import D0.p;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2016a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2017b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f2018c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadFactory f2019d;

    public e(int i7) {
        this.f2016a = i7;
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f2018c = new AtomicInteger();
                this.f2019d = Executors.defaultThreadFactory();
                this.f2017b = "GAC_Executor";
                break;
            default:
                ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
                this.f2018c = new AtomicInteger();
                this.f2017b = "okhttp-dispatch";
                this.f2019d = defaultThreadFactory;
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f2016a) {
            case 0:
                Thread newThread = this.f2019d.newThread(runnable);
                newThread.setUncaughtExceptionHandler(new d(newThread.getUncaughtExceptionHandler()));
                try {
                    newThread.setDaemon(true);
                    newThread.setName(this.f2017b + "-" + this.f2018c.incrementAndGet());
                    newThread.setContextClassLoader(null);
                } catch (SecurityException unused) {
                }
                return newThread;
            default:
                Thread newThread2 = this.f2019d.newThread(new p(runnable, 1));
                newThread2.setName(this.f2017b + "[" + this.f2018c.getAndIncrement() + "]");
                return newThread2;
        }
    }
}
