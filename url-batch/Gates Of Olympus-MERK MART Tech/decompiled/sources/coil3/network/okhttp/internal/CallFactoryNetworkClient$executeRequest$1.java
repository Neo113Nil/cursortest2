package coil3.network.okhttp.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallFactoryNetworkClient.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", f = "CallFactoryNetworkClient.kt", i = {0, 1}, l = {24, 24, 25}, m = "executeRequest-impl", n = {"block", "block"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes3.dex */
final class CallFactoryNetworkClient$executeRequest$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    CallFactoryNetworkClient$executeRequest$1(Continuation<? super CallFactoryNetworkClient$executeRequest$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CallFactoryNetworkClient.m9207executeRequestimpl(null, null, null, this);
    }
}
