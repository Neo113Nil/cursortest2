package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: ScrollableState.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/foundation/gestures/DefaultScrollableState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Lkotlin/Function1;", "", "onDelta", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "(F)F", "Lkotlin/jvm/functions/Function1;", "getOnDelta", "()Lkotlin/jvm/functions/Function1;", "scrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/runtime/MutableState;", "", "isScrollingState", "Landroidx/compose/runtime/MutableState;", "isScrollInProgress", "()Z", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DefaultScrollableState implements ScrollableState {
    private final MutableState isScrollingState;
    private final Function1 onDelta;
    private final MutatorMutex scrollMutex;
    private final ScrollScope scrollScope;

    public DefaultScrollableState(Function1 onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        this.onDelta = onDelta;
        this.scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
            @Override // androidx.compose.foundation.gestures.ScrollScope
            public float scrollBy(float pixels) {
                return ((Number) DefaultScrollableState.this.getOnDelta().invoke(Float.valueOf(pixels))).floatValue();
            }
        };
        this.scrollMutex = new MutatorMutex();
        this.isScrollingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public final Function1 getOnDelta() {
        return this.onDelta;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new DefaultScrollableState$scroll$2(this, mutatePriority, function2, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return ((Number) this.onDelta.invoke(Float.valueOf(delta))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return ((Boolean) this.isScrollingState.getValue()).booleanValue();
    }
}
