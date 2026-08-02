package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.ChannelResult;

/* loaded from: classes3.dex */
public final /* synthetic */ class BufferedChannel$onReceiveCatching$2 extends FunctionReferenceImpl implements Function3 {
    public static final BufferedChannel$onReceiveCatching$2 INSTANCE = new BufferedChannel$onReceiveCatching$2(3, BufferedChannel.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BufferedChannel bufferedChannel = (BufferedChannel) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.sendersAndCloseStatus$volatile$FU;
        bufferedChannel.getClass();
        if (obj3 == BufferedChannelKt.CHANNEL_CLOSED) {
            obj3 = new ChannelResult.Closed(bufferedChannel.getCloseCause());
        }
        return new ChannelResult(obj3);
    }
}
