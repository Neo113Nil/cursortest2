package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class w50 {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object j31Var;
        try {
            i31 i31Var = k31.d;
            j31Var = new v50(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        if (j31Var instanceof j31) {
            j31Var = null;
        }
    }

    public static final Handler a(Looper looper) {
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        invoke.getClass();
        return (Handler) invoke;
    }
}
