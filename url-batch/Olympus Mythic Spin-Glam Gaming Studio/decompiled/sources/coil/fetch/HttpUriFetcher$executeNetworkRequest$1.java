package coil.fetch;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpUriFetcher.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "executeNetworkRequest")
/* loaded from: classes15.dex */
final class HttpUriFetcher$executeNetworkRequest$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpUriFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpUriFetcher$executeNetworkRequest$1(HttpUriFetcher httpUriFetcher, Continuation continuation) {
        super(continuation);
        this.this$0 = httpUriFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object executeNetworkRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeNetworkRequest = this.this$0.executeNetworkRequest(null, this);
        return executeNetworkRequest;
    }
}
