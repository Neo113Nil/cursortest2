package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputFilter;
import com.unity3d.mediation.LevelPlayAdError;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilter$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK}, m = "withTimeout")
/* loaded from: classes10.dex */
final class SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1(SuspendingPointerInputFilter.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, Continuation continuation) {
        super(continuation);
        this.this$0 = pointerEventHandlerCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.withTimeout(0L, null, this);
    }
}
