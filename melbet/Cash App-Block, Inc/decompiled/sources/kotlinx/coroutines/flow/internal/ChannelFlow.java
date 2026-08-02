package kotlinx.coroutines.flow.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.util.coroutines.CoroutinesKt$until$2;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public abstract class ChannelFlow implements FusibleFlow {
    public final int capacity;
    public final CoroutineContext context;
    public final BufferOverflow onBufferOverflow;

    public ChannelFlow(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        this.context = coroutineContext;
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
    }

    public String additionalToStringProps() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object coroutineScope = JobKt.coroutineScope(new CoroutinesKt$until$2(flowCollector, this, (Continuation) null, 15), continuation);
        return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
    }

    public abstract Object collectTo(ProducerScope producerScope, Continuation continuation);

    public abstract ChannelFlow create(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow);

    public Flow dropChannelOperators() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow fuse(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        CoroutineContext coroutineContext2 = this.context;
        CoroutineContext plus = coroutineContext.plus(coroutineContext2);
        BufferOverflow bufferOverflow2 = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow3 = this.onBufferOverflow;
        int i2 = this.capacity;
        if (bufferOverflow == bufferOverflow2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            bufferOverflow = bufferOverflow3;
        }
        return (Intrinsics.areEqual(plus, coroutineContext2) && i == i2 && bufferOverflow == bufferOverflow3) ? this : create(plus, i, bufferOverflow);
    }

    public ReceiveChannel produceImpl(CoroutineScope coroutineScope) {
        int i = this.capacity;
        if (i == -3) {
            i = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        Function2 preferenceFlow$flow$1 = new PreferenceFlow$flow$1(this, (Continuation) null, 22);
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.newCoroutineContext(this.context, coroutineScope), PapaEvent.Channel$default(i, this.onBufferOverflow, null, 4));
        producerCoroutine.start(coroutineStart, producerCoroutine, preferenceFlow$flow$1);
        return producerCoroutine;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String additionalToStringProps = additionalToStringProps();
        if (additionalToStringProps != null) {
            arrayList.add(additionalToStringProps);
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext = this.context;
        if (coroutineContext != emptyCoroutineContext) {
            arrayList.add("context=" + coroutineContext);
        }
        int i = this.capacity;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow2 = this.onBufferOverflow;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62), ']');
    }
}
