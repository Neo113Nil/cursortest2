package coil3.network.okhttp.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallFactoryNetworkClient.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.okhttp.internal.CallFactoryNetworkClientKt", f = "CallFactoryNetworkClient.kt", i = {0}, l = {39}, m = "readByteString", n = {"buffer"}, s = {"L$0"}, v = 1)
/* loaded from: classes3.dex */
final class CallFactoryNetworkClientKt$readByteString$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    CallFactoryNetworkClientKt$readByteString$1(Continuation<? super CallFactoryNetworkClientKt$readByteString$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object readByteString;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readByteString = CallFactoryNetworkClientKt.readByteString(null, this);
        return readByteString;
    }
}
