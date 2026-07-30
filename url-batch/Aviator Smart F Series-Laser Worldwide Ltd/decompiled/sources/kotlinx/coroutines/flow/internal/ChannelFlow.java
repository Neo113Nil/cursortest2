package kotlinx.coroutines.flow.internal;

import f6.p;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.k0;
import y5.w;

/* loaded from: classes5.dex */
public abstract class ChannelFlow implements i {
    public final int capacity;
    public final CoroutineContext context;
    public final BufferOverflow onBufferOverflow;

    public ChannelFlow(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        this.context = coroutineContext;
        this.capacity = i8;
        this.onBufferOverflow = bufferOverflow;
    }

    static /* synthetic */ <T> Object collect$suspendImpl(ChannelFlow channelFlow, kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object coroutineScope = j0.coroutineScope(new ChannelFlow$collect$2(fVar, channelFlow, null), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return coroutineScope == coroutine_suspended ? coroutineScope : w.INSTANCE;
    }

    protected String additionalToStringProps() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.internal.i, kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
    public Object collect(kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
        return collect$suspendImpl(this, fVar, cVar);
    }

    protected abstract Object collectTo(kotlinx.coroutines.channels.j jVar, kotlin.coroutines.c cVar);

    protected abstract ChannelFlow create(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow);

    public kotlinx.coroutines.flow.e dropChannelOperators() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.internal.i
    public kotlinx.coroutines.flow.e fuse(CoroutineContext coroutineContext, int i8, BufferOverflow bufferOverflow) {
        CoroutineContext plus = coroutineContext.plus(this.context);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i9 = this.capacity;
            if (i9 != -3) {
                if (i8 != -3) {
                    if (i9 != -2) {
                        if (i8 != -2) {
                            i8 += i9;
                            if (i8 < 0) {
                                i8 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i8 = i9;
            }
            bufferOverflow = this.onBufferOverflow;
        }
        return (s.areEqual(plus, this.context) && i8 == this.capacity && bufferOverflow == this.onBufferOverflow) ? this : create(plus, i8, bufferOverflow);
    }

    public final p getCollectToFun$kotlinx_coroutines_core() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    public final int getProduceCapacity$kotlinx_coroutines_core() {
        int i8 = this.capacity;
        if (i8 == -3) {
            return -2;
        }
        return i8;
    }

    public ReceiveChannel produceImpl(i0 i0Var) {
        return ProduceKt.produce$default(i0Var, this.context, getProduceCapacity$kotlinx_coroutines_core(), this.onBufferOverflow, CoroutineStart.ATOMIC, null, getCollectToFun$kotlinx_coroutines_core(), 16, null);
    }

    public String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList(4);
        String additionalToStringProps = additionalToStringProps();
        if (additionalToStringProps != null) {
            arrayList.add(additionalToStringProps);
        }
        if (this.context != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(k0.getClassSimpleName(this));
        sb.append('[');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb.append(joinToString$default);
        sb.append(']');
        return sb.toString();
    }
}
