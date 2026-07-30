package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0795c extends V6.b {

    /* renamed from: b, reason: collision with root package name */
    public final Object f7108b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f7109c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Handler f7110d;

    public C0795c() {
        super(18);
        this.f7108b = new Object();
        this.f7109c = Executors.newFixedThreadPool(4, new ThreadFactoryC0794b());
    }

    public static Handler T(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C.b.b(looper);
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
