package O1;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f2226e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f2227a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f2228b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2229c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f2230d;

    public a(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        this.f2228b = str;
        this.f2229c = i2;
        this.f2230d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f2226e.newThread(new B3.c(this, 5, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f2228b + " Thread #" + this.f2227a.getAndIncrement());
        return newThread;
    }
}
