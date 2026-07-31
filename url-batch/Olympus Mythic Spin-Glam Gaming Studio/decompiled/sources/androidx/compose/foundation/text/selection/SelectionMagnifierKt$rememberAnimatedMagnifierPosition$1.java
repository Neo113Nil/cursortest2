package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SelectionMagnifier.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
    final /* synthetic */ State<Offset> $targetValue$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(State<Offset> state, Animatable<Offset, AnimationVector2D> animatable, Continuation continuation) {
        super(2, continuation);
        this.$targetValue$delegate = state;
        this.$animatable = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(this.$targetValue$delegate, this.$animatable, continuation);
        selectionMagnifierKt$rememberAnimatedMagnifierPosition$1.L$0 = obj;
        return selectionMagnifierKt$rememberAnimatedMagnifierPosition$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            final State<Offset> state = this.$targetValue$delegate;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    return Offset.m1288boximpl(m637invokeF1C5BW0());
                }

                /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                public final long m637invokeF1C5BW0() {
                    long m631rememberAnimatedMagnifierPosition$lambda1;
                    m631rememberAnimatedMagnifierPosition$lambda1 = SelectionMagnifierKt.m631rememberAnimatedMagnifierPosition$lambda1(state);
                    return m631rememberAnimatedMagnifierPosition$lambda1;
                }
            });
            final Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return m638emit3MmeM6k(((Offset) obj2).getPackedValue(), continuation);
                }

                /* renamed from: emit-3MmeM6k, reason: not valid java name */
                public final Object m638emit3MmeM6k(long j, Continuation continuation) {
                    Job launch$default;
                    if (OffsetKt.m1310isSpecifiedk4lQ0M(((Offset) Animatable.this.getValue()).getPackedValue()) && OffsetKt.m1310isSpecifiedk4lQ0M(j) && Offset.m1298getYimpl(((Offset) Animatable.this.getValue()).getPackedValue()) != Offset.m1298getYimpl(j)) {
                        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(Animatable.this, j, null), 3, null);
                        return launch$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? launch$default : Unit.INSTANCE;
                    }
                    Object snapTo = Animatable.this.snapTo(Offset.m1288boximpl(j), continuation);
                    return snapTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(flowCollector, this) == coroutine_suspended) {
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
