package T1;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f2563e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f2564a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f2565b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2566c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f2567d;

    public a(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        this.f2565b = str;
        this.f2566c = i2;
        this.f2567d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f2563e.newThread(new A.j(this, 10, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f2565b + " Thread #" + this.f2564a.getAndIncrement());
        return newThread;
    }
}
