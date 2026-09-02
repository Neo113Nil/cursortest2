package q1;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0596a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f5754e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f5755a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f5756b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5757c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f5758d;

    public ThreadFactoryC0596a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f5756b = str;
        this.f5757c = i7;
        this.f5758d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f5754e.newThread(new G4.c(this, 9, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f5756b + " Thread #" + this.f5755a.getAndIncrement());
        return newThread;
    }
}
