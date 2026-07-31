package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {445}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class ScrollDraggableState$drag$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function2 $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScrollDraggableState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollDraggableState$drag$2(ScrollDraggableState scrollDraggableState, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scrollDraggableState;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        ScrollDraggableState$drag$2 scrollDraggableState$drag$2 = new ScrollDraggableState$drag$2(this.this$0, this.$block, continuation);
        scrollDraggableState$drag$2.L$0 = obj;
        return scrollDraggableState$drag$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation continuation) {
        return ((ScrollDraggableState$drag$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.setLatestScrollScope((ScrollScope) this.L$0);
            Function2 function2 = this.$block;
            ScrollDraggableState scrollDraggableState = this.this$0;
            this.label = 1;
            if (function2.invoke(scrollDraggableState, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
