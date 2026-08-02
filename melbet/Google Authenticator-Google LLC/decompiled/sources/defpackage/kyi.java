package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyi {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object X;
        try {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, Looper.getMainLooper());
            invoke.getClass();
            X = new kyg((Handler) invoke, null, false);
        } catch (Throwable th) {
            X = ixc.X(th);
        }
    }
}
