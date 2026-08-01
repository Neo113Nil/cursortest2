package m8;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f6572e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f6573a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f6574b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6575c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f6576d;

    public a(String str, int i3, StrictMode.ThreadPolicy threadPolicy) {
        this.f6574b = str;
        this.f6575c = i3;
        this.f6576d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f6572e.newThread(new a6.f(15, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f6574b + " Thread #" + this.f6573a.getAndIncrement());
        return newThread;
    }
}
