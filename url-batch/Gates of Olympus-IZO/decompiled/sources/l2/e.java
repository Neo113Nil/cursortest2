package l2;

import I2.l;
import Z1.i;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5552a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object t3;
        try {
            t3 = new d(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            t3 = l.t(th);
        }
        if (t3 instanceof L1.l) {
            t3 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            i.d(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
