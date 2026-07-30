package n;

import K.i;
import a.AbstractC0415a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4800d extends AbstractC0415a {

    /* renamed from: n, reason: collision with root package name */
    public final Object f39616n = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final ExecutorService f39617u = Executors.newFixedThreadPool(4, new ThreadFactoryC4799c());

    /* renamed from: v, reason: collision with root package name */
    public volatile Handler f39618v;

    public static Handler J(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return i.b(looper);
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
