package y3;

import O3.l;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import c3.C0293e;
import kotlin.jvm.internal.i;

/* renamed from: y3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1579d {
    private static volatile Choreographer choreographer;

    static {
        Object h2;
        try {
            h2 = new C1578c(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            h2 = l.h(th);
        }
        if (h2 instanceof C0293e) {
            h2 = null;
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
