package t1;

import H1.l;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import k1.e;

/* loaded from: classes.dex */
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object w2;
        try {
            w2 = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            w2 = l.w(th);
        }
        if (w2 instanceof X0.d) {
            w2 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            e.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
