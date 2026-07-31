package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PausableMonotonicFrameClock.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {61, 62}, m = "withFrameNanos")
/* loaded from: classes10.dex */
final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PausableMonotonicFrameClock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, Continuation continuation) {
        super(continuation);
        this.this$0 = pausableMonotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.withFrameNanos(null, this);
    }
}
