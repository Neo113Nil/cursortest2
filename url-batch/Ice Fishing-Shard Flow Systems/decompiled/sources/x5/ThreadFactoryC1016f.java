package x5;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: x5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1016f implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8381a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8382b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f8383c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadFactory f8384d;

    public ThreadFactoryC1016f(int i2) {
        this.f8381a = i2;
        switch (i2) {
            case 1:
                this.f8383c = new AtomicInteger();
                this.f8384d = Executors.defaultThreadFactory();
                this.f8382b = "GAC_Executor";
                break;
            default:
                ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
                this.f8383c = new AtomicInteger();
                this.f8382b = "okhttp-dispatch";
                this.f8384d = defaultThreadFactory;
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f8381a) {
            case 0:
                Thread newThread = this.f8384d.newThread(runnable);
                newThread.setUncaughtExceptionHandler(new C1015e(newThread.getUncaughtExceptionHandler()));
                try {
                    newThread.setDaemon(true);
                    newThread.setName(this.f8382b + "-" + this.f8383c.incrementAndGet());
                    newThread.setContextClassLoader(null);
                } catch (SecurityException unused) {
                }
                return newThread;
            default:
                Thread newThread2 = this.f8384d.newThread(new T1.i(runnable, 2));
                int andIncrement = this.f8383c.getAndIncrement();
                int length = String.valueOf(andIncrement).length();
                String str = this.f8382b;
                StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1);
                sb.append(str);
                sb.append("[");
                sb.append(andIncrement);
                sb.append("]");
                newThread2.setName(sb.toString());
                return newThread2;
        }
    }
}
