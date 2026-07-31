package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DragGestureDetectorCopy.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", l = {123, 161}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
/* loaded from: classes6.dex */
final class DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorCopyKt.m837awaitHorizontalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
    }
}
