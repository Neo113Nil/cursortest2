package coil.fetch;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HttpUriFetcher.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER, 105}, m = "fetch")
/* loaded from: classes15.dex */
final class HttpUriFetcher$fetch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpUriFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpUriFetcher$fetch$1(HttpUriFetcher httpUriFetcher, Continuation continuation) {
        super(continuation);
        this.this$0 = httpUriFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetch(this);
    }
}
