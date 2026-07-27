package a2;

import B1.o;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0412a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f4906e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f4907a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f4908b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4909c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f4910d;

    public ThreadFactoryC0412a(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        this.f4908b = str;
        this.f4909c = i2;
        this.f4910d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f4906e.newThread(new o(this, 4, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f4908b + " Thread #" + this.f4907a.getAndIncrement());
        return newThread;
    }
}
