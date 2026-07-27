package X2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1342q;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4365a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object a4;
        try {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            a4 = new d(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            a4 = AbstractC1343r.a(th);
        }
        if (a4 instanceof C1342q) {
            a4 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.d(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
