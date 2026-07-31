package androidx.work;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Operation.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 176)
@DebugMetadata(c = "androidx.work.OperationKt", f = "Operation.kt", l = {39}, m = "await")
/* loaded from: classes14.dex */
final class OperationKt$await$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    OperationKt$await$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OperationKt.await(null, this);
    }
}
