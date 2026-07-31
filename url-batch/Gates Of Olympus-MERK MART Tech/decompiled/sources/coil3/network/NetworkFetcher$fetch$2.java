package coil3.network;

import coil3.fetch.FetchResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NetworkFetcher.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class NetworkFetcher$fetch$2 extends FunctionReferenceImpl implements Function1<Continuation<? super FetchResult>, Object>, SuspendFunction {
    NetworkFetcher$fetch$2(Object obj) {
        super(1, obj, NetworkFetcher.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super FetchResult> continuation) {
        Object doFetch;
        doFetch = ((NetworkFetcher) this.receiver).doFetch(continuation);
        return doFetch;
    }
}
