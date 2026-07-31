package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/runtime/RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", TelemetryCategory.EXCEPTION, "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    final /* synthetic */ CompositionErrorContextImpl $traceContext$inlined;
    final /* synthetic */ RememberedCoroutineScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key key, CompositionErrorContextImpl compositionErrorContextImpl, RememberedCoroutineScope rememberedCoroutineScope) {
        super(key);
        this.$traceContext$inlined = compositionErrorContextImpl;
        this.this$0 = rememberedCoroutineScope;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        CoroutineContext coroutineContext;
        CoroutineContext coroutineContext2;
        this.$traceContext$inlined.attachComposeStackTrace(exception, this.this$0);
        coroutineContext = this.this$0.overlayContext;
        CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key;
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(key);
        if (coroutineExceptionHandler != null) {
            coroutineExceptionHandler.handleException(context, exception);
            return;
        }
        coroutineContext2 = this.this$0.parentContext;
        CoroutineExceptionHandler coroutineExceptionHandler2 = (CoroutineExceptionHandler) coroutineContext2.get(key);
        if (coroutineExceptionHandler2 == null) {
            throw exception;
        }
        coroutineExceptionHandler2.handleException(context, exception);
    }
}
