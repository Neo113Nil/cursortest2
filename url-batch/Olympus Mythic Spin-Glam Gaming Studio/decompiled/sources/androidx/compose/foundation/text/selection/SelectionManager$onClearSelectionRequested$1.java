package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.unity3d.mediation.LevelPlayAdError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectionManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", f = "SelectionManager.kt", l = {LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class SelectionManager$onClearSelectionRequested$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function0 $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionManager$onClearSelectionRequested$1(SelectionManager selectionManager, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.this$0 = selectionManager;
        this.$block = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        SelectionManager$onClearSelectionRequested$1 selectionManager$onClearSelectionRequested$1 = new SelectionManager$onClearSelectionRequested$1(this.this$0, this.$block, continuation);
        selectionManager$onClearSelectionRequested$1.L$0 = obj;
        return selectionManager$onClearSelectionRequested$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((SelectionManager$onClearSelectionRequested$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object detectNonConsumingTap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            SelectionManager selectionManager = this.this$0;
            final Function0 function0 = this.$block;
            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m665invokek4lQ0M(((Offset) obj2).getPackedValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m665invokek4lQ0M(long j) {
                    Function0.this.mo4828invoke();
                }
            };
            this.label = 1;
            detectNonConsumingTap = selectionManager.detectNonConsumingTap(pointerInputScope, function1, this);
            if (detectNonConsumingTap == coroutine_suspended) {
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
