package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
final class d2 extends kotlinx.coroutines.internal.c0 {
    public d2(CoroutineContext coroutineContext, kotlin.coroutines.c cVar) {
        super(coroutineContext, cVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(Throwable th) {
        return false;
    }
}
