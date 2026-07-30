package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.coroutines.e;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class n6 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        Choreographer choreographer = Choreographer.getInstance();
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            p6 p6Var = new p6(choreographer, Handler.createAsync(myLooper));
            return e.c(p6Var, p6Var.p);
        }
        dd0.j("no Looper on this thread");
        return null;
    }
}
