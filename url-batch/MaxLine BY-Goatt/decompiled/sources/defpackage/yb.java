package defpackage;

import android.view.Choreographer;
import defpackage.aa2;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yb implements Choreographer.FrameCallback {
    public final /* synthetic */ fs m;
    public final /* synthetic */ Function1 n;

    public yb(fs fsVar, zb zbVar, Function1 function1) {
        this.m = fsVar;
        this.n = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object ba2Var;
        Function1 function1 = this.n;
        try {
            aa2.a aVar = aa2.m;
            ba2Var = function1.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            aa2.a aVar2 = aa2.m;
            ba2Var = new ba2(th);
        }
        this.m.resumeWith(ba2Var);
    }
}
