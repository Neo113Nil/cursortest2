package f5;

import android.os.StrictMode;
import androidx.room.b0;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f3364e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f3365a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f3366b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3367c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f3368d;

    public a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f3366b = str;
        this.f3367c = i7;
        this.f3368d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f3364e.newThread(new b0(this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f3366b + " Thread #" + this.f3365a.getAndIncrement());
        return newThread;
    }
}
