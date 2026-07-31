package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: Effects.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R0\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/runtime/LaunchedEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "parentCoroutineContext", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "task", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "onRemembered", "()V", "onForgotten", "onAbandoned", "context", "", TelemetryCategory.EXCEPTION, "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/jvm/functions/Function2;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LaunchedEffectImpl implements RememberObserver, CoroutineExceptionHandler {
    private Job job;
    private final CoroutineContext parentCoroutineContext;
    private final CoroutineScope scope;
    private final Function2 task;

    public LaunchedEffectImpl(CoroutineContext coroutineContext, Function2 function2) {
        this.parentCoroutineContext = coroutineContext;
        this.task = function2;
        this.scope = CoroutineScopeKt.CoroutineScope(coroutineContext.plus(coroutineContext.get(CompositionErrorContextImpl.INSTANCE) != null ? this : EmptyCoroutineContext.INSTANCE));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return CoroutineExceptionHandler.DefaultImpls.fold(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineExceptionHandler.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineExceptionHandler.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineExceptionHandler.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        Job launch$default;
        Job job = this.job;
        if (job != null) {
            JobKt__JobKt.cancel$default(job, "Old job was still running!", null, 2, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, this.task, 3, null);
        this.job = launch$default;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Job job = this.job;
        if (job != null) {
            job.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Job job = this.job;
        if (job != null) {
            job.cancel(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key getKey() {
        return CoroutineExceptionHandler.Key;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext context, Throwable exception) {
        CompositionErrorContextImpl compositionErrorContextImpl = (CompositionErrorContextImpl) context.get(CompositionErrorContextImpl.INSTANCE);
        if (compositionErrorContextImpl != null) {
            compositionErrorContextImpl.attachComposeStackTrace(exception, this);
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.parentCoroutineContext.get(CoroutineExceptionHandler.Key);
        if (coroutineExceptionHandler == null) {
            throw exception;
        }
        coroutineExceptionHandler.handleException(context, exception);
    }
}
