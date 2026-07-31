package o2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
class P0 extends AbstractC3317a {
    public P0(CoroutineContext coroutineContext, boolean z4) {
        super(coroutineContext, true, z4);
    }

    @Override // o2.D0
    protected boolean f0(Throwable th) {
        AbstractC3315I.a(getContext(), th);
        return true;
    }
}
