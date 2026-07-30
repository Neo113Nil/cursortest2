package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* loaded from: classes5.dex */
class c extends ChannelFlow {
    private final f6.p block;

    public /* synthetic */ c(f6.p pVar, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow, int i9, kotlin.jvm.internal.o oVar) {
        this(pVar, (i9 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    static /* synthetic */ <T> Object collectTo$suspendImpl(c cVar, kotlinx.coroutines.channels.j jVar, kotlin.coroutines.c cVar2) {
        Object coroutine_suspended;
        Object invoke = cVar.block.invoke(jVar, cVar2);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return invoke == coroutine_suspended ? invoke : y5.w.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected Object collectTo(kotlinx.coroutines.channels.j jVar, kotlin.coroutines.c cVar) {
        return collectTo$suspendImpl(this, jVar, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected ChannelFlow create(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        return new c(this.block, coroutineContext, i8, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return "block[" + this.block + "] -> " + super.toString();
    }

    public c(f6.p pVar, CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        super(coroutineContext, i8, bufferOverflow);
        this.block = pVar;
    }
}
