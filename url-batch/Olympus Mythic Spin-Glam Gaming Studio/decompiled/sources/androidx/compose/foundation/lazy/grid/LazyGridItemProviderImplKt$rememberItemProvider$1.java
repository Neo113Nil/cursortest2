package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGridItemProviderImpl.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$1", f = "LazyGridItemProviderImpl.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LazyGridItemProviderImplKt$rememberItemProvider$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ MutableState<IntRange> $nearestItemsRangeState;
    final /* synthetic */ LazyGridState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyGridItemProviderImplKt$rememberItemProvider$1(LazyGridState lazyGridState, MutableState<IntRange> mutableState, Continuation continuation) {
        super(2, continuation);
        this.$state = lazyGridState;
        this.$nearestItemsRangeState = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new LazyGridItemProviderImplKt$rememberItemProvider$1(this.$state, this.$nearestItemsRangeState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((LazyGridItemProviderImplKt$rememberItemProvider$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyGridState lazyGridState = this.$state;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$1.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final IntRange mo4828invoke() {
                    IntRange calculateNearestItemsRange;
                    calculateNearestItemsRange = LazyGridItemProviderImplKt.calculateNearestItemsRange(LazyGridState.this.getFirstVisibleItemIndex());
                    return calculateNearestItemsRange;
                }
            });
            final MutableState<IntRange> mutableState = this.$nearestItemsRangeState;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderImplKt$rememberItemProvider$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(IntRange intRange, Continuation continuation) {
                    MutableState.this.setValue(intRange);
                    return Unit.INSTANCE;
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
