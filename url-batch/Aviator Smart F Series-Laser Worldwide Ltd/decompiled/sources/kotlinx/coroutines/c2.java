package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
class c2 extends a {
    public c2(CoroutineContext coroutineContext, boolean z7) {
        super(coroutineContext, true, z7);
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean handleJobException(Throwable th) {
        h0.handleCoroutineException(getContext(), th);
        return true;
    }
}
