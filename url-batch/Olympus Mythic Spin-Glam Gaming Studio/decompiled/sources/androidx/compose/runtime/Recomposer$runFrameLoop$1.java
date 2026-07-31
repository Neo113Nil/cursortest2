package androidx.compose.runtime;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Recomposer.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", l = {1030, IronSourceError.ERROR_IS_LOAD_DURING_SHOW}, m = "runFrameLoop")
/* loaded from: classes11.dex */
final class Recomposer$runFrameLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runFrameLoop$1(Recomposer recomposer, Continuation continuation) {
        super(continuation);
        this.this$0 = recomposer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object runFrameLoop;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        runFrameLoop = this.this$0.runFrameLoop(null, null, this);
        return runFrameLoop;
    }
}
