package coil3.network;

import coil3.fetch.FetchResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: ConcurrentRequestStrategy.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0096@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcoil3/network/UncoordinatedConcurrentRequestStrategy;", "Lcoil3/network/ConcurrentRequestStrategy;", "<init>", "()V", "apply", "Lcoil3/fetch/FetchResult;", "key", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class UncoordinatedConcurrentRequestStrategy implements ConcurrentRequestStrategy {
    @Override // coil3.network.ConcurrentRequestStrategy
    public Object apply(String str, Function1<? super Continuation<? super FetchResult>, ? extends Object> function1, Continuation<? super FetchResult> continuation) {
        return function1.invoke(continuation);
    }
}
