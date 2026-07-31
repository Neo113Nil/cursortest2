package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: InfiniteAnimationPolicy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "withInfiniteAnimationFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InfiniteAnimationPolicyKt {
    public static final Object withInfiniteAnimationFrameNanos(Function1 function1, Continuation continuation) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) continuation.getContext().get(InfiniteAnimationPolicy.INSTANCE);
        if (infiniteAnimationPolicy == null) {
            return MonotonicFrameClockKt.withFrameNanos(function1, continuation);
        }
        return infiniteAnimationPolicy.onInfiniteOperation(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(function1, null), continuation);
    }
}
