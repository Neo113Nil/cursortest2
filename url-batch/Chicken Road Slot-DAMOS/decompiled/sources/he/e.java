package he;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import hd.l;
import hd.m;
import hd.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4538a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object mVar;
        try {
            l lVar = n.f4511e;
            mVar = new d(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            l lVar2 = n.f4511e;
            mVar = new m(th);
        }
        if (mVar instanceof m) {
            mVar = null;
        }
    }

    public static final Handler a(Looper looper) {
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
