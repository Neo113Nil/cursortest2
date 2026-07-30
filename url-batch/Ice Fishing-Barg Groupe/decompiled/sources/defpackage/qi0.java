package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class qi0 {
    public static final /* synthetic */ int PxuCJdSBwIXG = 0;
    private static volatile Choreographer choreographer;

    static {
        Object uv1Var;
        try {
            uv1Var = new pi0(PxuCJdSBwIXG(Looper.getMainLooper()));
        } catch (Throwable th) {
            uv1Var = new uv1(th);
        }
        if (uv1Var instanceof uv1) {
            uv1Var = null;
        }
    }

    public static final Handler PxuCJdSBwIXG(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        invoke.getClass();
        return (Handler) invoke;
    }
}
