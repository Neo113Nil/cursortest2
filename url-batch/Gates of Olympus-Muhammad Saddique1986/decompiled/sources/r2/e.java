package r2;

import R1.k;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import f2.j;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8208a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object b3;
        try {
            b3 = new d(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            b3 = R1.a.b(th);
        }
        if (b3 instanceof k) {
            b3 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            j.d(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
