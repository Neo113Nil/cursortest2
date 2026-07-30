package defpackage;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class q6 implements Choreographer.FrameCallback {
    public final /* synthetic */ tf d;
    public final /* synthetic */ Function1 e;

    public q6(tf tfVar, r6 r6Var, Function1 function1) {
        this.d = tfVar;
        this.e = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object j31Var;
        Function1 function1 = this.e;
        try {
            i31 i31Var = k31.d;
            j31Var = function1.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            i31 i31Var2 = k31.d;
            j31Var = new j31(th);
        }
        this.d.l(j31Var);
    }
}
