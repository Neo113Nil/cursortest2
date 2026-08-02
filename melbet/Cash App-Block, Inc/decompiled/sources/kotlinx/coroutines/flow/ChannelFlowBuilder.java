package kotlinx.coroutines.flow;

import com.squareup.preferences.PreferenceFlow$flow$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public class ChannelFlowBuilder extends ChannelFlow {
    public final /* synthetic */ int $r8$classId;
    public final Object block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelFlowBuilder(Object obj, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2) {
        super(coroutineContext, i, bufferOverflow);
        this.$r8$classId = i2;
        this.block = obj;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope producerScope, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.block;
        switch (i) {
            case 0:
                Object invoke = ((Function2) obj).invoke(producerScope, continuation);
                if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                SendingCollector sendingCollector = new SendingCollector(producerScope);
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    JobKt.launch$default(producerScope, null, null, new PreferenceFlow$flow$1((Flow) it.next(), sendingCollector, null, 23), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow create(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        int i2 = this.$r8$classId;
        Object obj = this.block;
        switch (i2) {
            case 0:
                return new ChannelFlowBuilder((Function2) obj, coroutineContext, i, bufferOverflow, 0);
            default:
                return new ChannelFlowBuilder((Iterable) obj, coroutineContext, i, bufferOverflow, 1);
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel produceImpl(CoroutineScope coroutineScope) {
        switch (this.$r8$classId) {
            case 1:
                Function2 preferenceFlow$flow$1 = new PreferenceFlow$flow$1(this, (Continuation) null, 22);
                BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
                CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
                ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.newCoroutineContext(this.context, coroutineScope), PapaEvent.Channel$default(this.capacity, bufferOverflow, null, 4));
                producerCoroutine.start(coroutineStart, producerCoroutine, preferenceFlow$flow$1);
                return producerCoroutine;
            default:
                return super.produceImpl(coroutineScope);
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "block[" + ((Function2) this.block) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }
}
