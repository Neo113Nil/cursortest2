package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: RepeatOnLifecycle.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a@\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "block", "repeatOnLifecycle", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RepeatOnLifecycleKt {
    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.getState() == Lifecycle.State.DESTROYED) {
            return Unit.INSTANCE;
        }
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, function2, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }
}
