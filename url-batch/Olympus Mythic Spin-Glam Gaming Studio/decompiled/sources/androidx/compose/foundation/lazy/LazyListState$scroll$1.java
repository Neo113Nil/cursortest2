package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyListState.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {257, 258}, m = "scroll")
/* loaded from: classes11.dex */
final class LazyListState$scroll$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LazyListState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListState$scroll$1(LazyListState lazyListState, Continuation continuation) {
        super(continuation);
        this.this$0 = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.scroll(null, null, this);
    }
}
