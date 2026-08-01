package s1;

import W0.e;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import j1.h;

/* loaded from: classes.dex */
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object r2;
        try {
            r2 = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            r2 = H1.d.r(th);
        }
        if (r2 instanceof e) {
            r2 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            h.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
