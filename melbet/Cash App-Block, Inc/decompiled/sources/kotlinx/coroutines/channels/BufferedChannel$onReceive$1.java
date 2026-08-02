package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.SelectInstance;

/* loaded from: classes9.dex */
public final /* synthetic */ class BufferedChannel$onReceive$1 extends FunctionReferenceImpl implements Function3 {
    public static final BufferedChannel$onReceive$1 INSTANCE = new BufferedChannel$onReceive$1(3, BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.sendersAndCloseStatus$volatile$FU;
        ((BufferedChannel) obj).registerSelectForReceive((SelectInstance) obj2);
        return Unit.INSTANCE;
    }
}
