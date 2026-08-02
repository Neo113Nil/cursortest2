package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class BufferedChannel$onReceive$2 extends FunctionReferenceImpl implements Function3 {
    public static final BufferedChannel$onReceive$2 INSTANCE = new BufferedChannel$onReceive$2(3, BufferedChannel.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BufferedChannel bufferedChannel = (BufferedChannel) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.sendersAndCloseStatus$volatile$FU;
        bufferedChannel.getClass();
        if (obj3 != BufferedChannelKt.CHANNEL_CLOSED) {
            return obj3;
        }
        throw bufferedChannel.getReceiveException();
    }
}
