package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.PointerInputScope;
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

/* compiled from: CoreTextField.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", f = "CoreTextField.kt", l = {947}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class CoreTextFieldKt$TextFieldCursorHandle$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ TextDragObserver $observer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$TextFieldCursorHandle$1(TextDragObserver textDragObserver, Continuation continuation) {
        super(2, continuation);
        this.$observer = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        CoreTextFieldKt$TextFieldCursorHandle$1 coreTextFieldKt$TextFieldCursorHandle$1 = new CoreTextFieldKt$TextFieldCursorHandle$1(this.$observer, continuation);
        coreTextFieldKt$TextFieldCursorHandle$1.L$0 = obj;
        return coreTextFieldKt$TextFieldCursorHandle$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((CoreTextFieldKt$TextFieldCursorHandle$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            TextDragObserver textDragObserver = this.$observer;
            this.label = 1;
            if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == coroutine_suspended) {
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
