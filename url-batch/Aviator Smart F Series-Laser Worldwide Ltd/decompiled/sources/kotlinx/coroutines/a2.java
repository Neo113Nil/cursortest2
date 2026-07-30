package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: classes3.dex */
final class a2 extends r1 {
    private final o continuation;

    public a2(o oVar) {
        this.continuation = oVar;
    }

    @Override // kotlinx.coroutines.r1, kotlinx.coroutines.d0, f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y5.w.INSTANCE;
    }

    @Override // kotlinx.coroutines.d0
    public void invoke(Throwable th) {
        Object state$kotlinx_coroutines_core = getJob().getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof b0) {
            o oVar = this.continuation;
            Result.a aVar = Result.Companion;
            oVar.resumeWith(Result.m348constructorimpl(y5.g.createFailure(((b0) state$kotlinx_coroutines_core).cause)));
        } else {
            o oVar2 = this.continuation;
            Result.a aVar2 = Result.Companion;
            oVar2.resumeWith(Result.m348constructorimpl(s1.unboxState(state$kotlinx_coroutines_core)));
        }
    }
}
