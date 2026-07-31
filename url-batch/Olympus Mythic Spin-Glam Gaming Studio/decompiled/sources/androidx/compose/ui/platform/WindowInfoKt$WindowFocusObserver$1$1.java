package androidx.compose.ui.platform;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WindowInfo.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1", f = "WindowInfo.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class WindowInfoKt$WindowFocusObserver$1$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ State<Function1> $callback;
    final /* synthetic */ WindowInfo $windowInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WindowInfoKt$WindowFocusObserver$1$1(WindowInfo windowInfo, State<? extends Function1> state, Continuation continuation) {
        super(2, continuation);
        this.$windowInfo = windowInfo;
        this.$callback = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new WindowInfoKt$WindowFocusObserver$1$1(this.$windowInfo, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((WindowInfoKt$WindowFocusObserver$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final WindowInfo windowInfo = this.$windowInfo;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final Boolean mo4828invoke() {
                    return Boolean.valueOf(WindowInfo.this.isWindowFocused());
                }
            });
            final State<Function1> state = this.$callback;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), continuation);
                }

                public final Object emit(boolean z, Continuation continuation) {
                    Object invoke = ((Function1) State.this.getValue()).invoke(Boxing.boxBoolean(z));
                    return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
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
