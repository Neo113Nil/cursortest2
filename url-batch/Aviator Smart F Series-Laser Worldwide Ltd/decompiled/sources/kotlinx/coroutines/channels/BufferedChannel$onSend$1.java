package kotlinx.coroutines.channels;

import f6.q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import y5.w;

/* loaded from: classes5.dex */
/* synthetic */ class BufferedChannel$onSend$1 extends FunctionReferenceImpl implements q {
    public static final BufferedChannel$onSend$1 INSTANCE = new BufferedChannel$onSend$1();

    BufferedChannel$onSend$1() {
        super(3, BufferedChannel.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // f6.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BufferedChannel) obj, (kotlinx.coroutines.selects.j) obj2, obj3);
        return w.INSTANCE;
    }

    public final void invoke(BufferedChannel bufferedChannel, kotlinx.coroutines.selects.j jVar, Object obj) {
        bufferedChannel.registerSelectForSend(jVar, obj);
    }
}
