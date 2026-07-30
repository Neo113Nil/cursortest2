package kotlinx.coroutines;

import kotlin.Result;

/* loaded from: classes3.dex */
final class b2 extends r1 {
    private final kotlin.coroutines.c continuation;

    public b2(kotlin.coroutines.c cVar) {
        this.continuation = cVar;
    }

    @Override // kotlinx.coroutines.r1, kotlinx.coroutines.d0, f6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y5.w.INSTANCE;
    }

    @Override // kotlinx.coroutines.d0
    public void invoke(Throwable th) {
        kotlin.coroutines.c cVar = this.continuation;
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m348constructorimpl(y5.w.INSTANCE));
    }
}
