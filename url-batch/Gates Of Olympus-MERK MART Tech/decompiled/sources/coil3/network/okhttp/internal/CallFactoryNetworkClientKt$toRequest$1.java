package coil3.network.okhttp.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallFactoryNetworkClient.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.okhttp.internal.CallFactoryNetworkClientKt", f = "CallFactoryNetworkClient.kt", i = {0, 0}, l = {32}, m = "toRequest", n = {"$this$toRequest", "request"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes3.dex */
final class CallFactoryNetworkClientKt$toRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    CallFactoryNetworkClientKt$toRequest$1(Continuation<? super CallFactoryNetworkClientKt$toRequest$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object request;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        request = CallFactoryNetworkClientKt.toRequest(null, this);
        return request;
    }
}
