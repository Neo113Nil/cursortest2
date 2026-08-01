package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import e3.k;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends g8.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6636a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f6637b = Executors.newFixedThreadPool(4, new c());

    /* renamed from: c, reason: collision with root package name */
    public volatile Handler f6638c;

    public static Handler Q(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return k.b(looper);
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
