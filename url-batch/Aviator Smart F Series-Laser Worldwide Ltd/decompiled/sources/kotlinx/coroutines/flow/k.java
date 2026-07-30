package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.l1;

/* loaded from: classes5.dex */
final class k implements n, a, kotlinx.coroutines.flow.internal.i {
    private final /* synthetic */ n $$delegate_0;
    private final l1 job;

    public k(n nVar, l1 l1Var) {
        this.job = l1Var;
        this.$$delegate_0 = nVar;
    }

    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    public Object collect(f fVar, kotlin.coroutines.c cVar) {
        return this.$$delegate_0.collect(fVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.i
    public e fuse(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        return o.fuseSharedFlow(this, coroutineContext, i8, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.n
    public List<Object> getReplayCache() {
        return this.$$delegate_0.getReplayCache();
    }
}
