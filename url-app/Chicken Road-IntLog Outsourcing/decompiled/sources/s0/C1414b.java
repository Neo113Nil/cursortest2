package s0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1414b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f11751a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1413a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f11752b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1413a(true));

    /* renamed from: c, reason: collision with root package name */
    public final z f11753c;

    /* renamed from: d, reason: collision with root package name */
    public final k f11754d;

    /* renamed from: e, reason: collision with root package name */
    public final U.e f11755e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11756f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11757g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11758h;

    public C1414b(l1.j jVar) {
        Handler handler;
        Handler handler2;
        String str = AbstractC1412A.f11748a;
        this.f11753c = new z();
        this.f11754d = new k();
        U.e eVar = new U.e();
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler2 = A.d.a(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e3) {
                e = e3;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                eVar.f3053a = handler2;
                this.f11755e = eVar;
                this.f11756f = 4;
                this.f11757g = Integer.MAX_VALUE;
                this.f11758h = 20;
            } catch (InstantiationException e6) {
                e = e6;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                eVar.f3053a = handler2;
                this.f11755e = eVar;
                this.f11756f = 4;
                this.f11757g = Integer.MAX_VALUE;
                this.f11758h = 20;
            } catch (NoSuchMethodException e7) {
                e = e7;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                eVar.f3053a = handler2;
                this.f11755e = eVar;
                this.f11756f = 4;
                this.f11757g = Integer.MAX_VALUE;
                this.f11758h = 20;
            } catch (InvocationTargetException e8) {
                Throwable cause = e8.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(cause);
                }
                throw ((Error) cause);
            }
            handler2 = handler;
        }
        eVar.f3053a = handler2;
        this.f11755e = eVar;
        this.f11756f = 4;
        this.f11757g = Integer.MAX_VALUE;
        this.f11758h = 20;
    }
}
