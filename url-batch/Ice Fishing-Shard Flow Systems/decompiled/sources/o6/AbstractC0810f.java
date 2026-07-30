package o6;

import R5.l;
import R5.m;
import R5.n;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0810f {
    private static volatile Choreographer choreographer;

    static {
        Object n7;
        try {
            l lVar = n.f2421d;
            n7 = new C0809e(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            l lVar2 = n.f2421d;
            n7 = V6.b.n(th);
        }
        if (n7 instanceof m) {
            n7 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
