package N0;

import F0.i;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import o.g;
import u0.C0243c;

/* loaded from: classes.dex */
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object f2;
        try {
            f2 = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            f2 = g.f(th);
        }
        if (f2 instanceof C0243c) {
            f2 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            i.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
