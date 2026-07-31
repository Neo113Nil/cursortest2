package b7;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import c6.h;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1536a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object l3;
        try {
            l3 = new e(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            l3 = s6.a.l(th);
        }
        if (l3 instanceof h) {
            l3 = null;
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
