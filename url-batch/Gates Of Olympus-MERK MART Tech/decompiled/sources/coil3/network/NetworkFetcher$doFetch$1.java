package coil3.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NetworkFetcher.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", i = {0, 0, 1, 2}, l = {86, 105, 136}, m = "doFetch", n = {"snapshot", "cacheResponse", "snapshot", "snapshot"}, s = {"L$0", "L$1", "L$0", "L$0"}, v = 1)
/* loaded from: classes3.dex */
final class NetworkFetcher$doFetch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetworkFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkFetcher$doFetch$1(NetworkFetcher networkFetcher, Continuation<? super NetworkFetcher$doFetch$1> continuation) {
        super(continuation);
        this.this$0 = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object doFetch;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        doFetch = this.this$0.doFetch(this);
        return doFetch;
    }
}
