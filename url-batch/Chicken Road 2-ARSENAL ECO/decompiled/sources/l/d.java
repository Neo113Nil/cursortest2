package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class d extends A3.c {

    /* renamed from: b, reason: collision with root package name */
    public final Object f5239b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f5240c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Handler f5241d;

    public d() {
        super(14);
        this.f5239b = new Object();
        this.f5240c = Executors.newFixedThreadPool(4, new ThreadFactoryC0485b());
    }

    public static Handler o0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0486c.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
