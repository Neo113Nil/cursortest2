package kotlinx.coroutines.channels;

import f6.q;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
/* synthetic */ class BufferedChannel$onReceive$2 extends FunctionReferenceImpl implements q {
    public static final BufferedChannel$onReceive$2 INSTANCE = new BufferedChannel$onReceive$2();

    BufferedChannel$onReceive$2() {
        super(3, BufferedChannel.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // f6.q
    public final Object invoke(BufferedChannel bufferedChannel, Object obj, Object obj2) {
        Object processResultSelectReceive;
        processResultSelectReceive = bufferedChannel.processResultSelectReceive(obj, obj2);
        return processResultSelectReceive;
    }
}
