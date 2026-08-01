package d2;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m0 implements Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ge.h f3475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f3476e;

    public m0(ge.h hVar, n0 n0Var, Function1 function1) {
        this.f3475d = hVar;
        this.f3476e = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object mVar;
        Function1 function1 = this.f3476e;
        try {
            hd.l lVar = hd.n.f4511e;
            mVar = function1.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            hd.l lVar2 = hd.n.f4511e;
            mVar = new hd.m(th);
        }
        this.f3475d.resumeWith(mVar);
    }
}
