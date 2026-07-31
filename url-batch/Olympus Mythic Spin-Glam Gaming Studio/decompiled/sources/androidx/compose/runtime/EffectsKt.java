package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: Effects.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\n\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\n\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\n\u0010\r\u001a=\u0010\u0012\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aG\u0010\u0012\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0014\u001aQ\u0010\u0012\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0016\u001aK\u0010\u0012\u001a\u00020\u00012\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0017\"\u0004\u0018\u00010\u00052\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0019\u001a\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lkotlin/Function0;", "", "effect", "SideEffect", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "key1", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "DisposableEffect", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "block", "LaunchedEffect", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "keys", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/compose/runtime/Composer;", "composer", "createCompositionCoroutineScope", "(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;", "InternalDisposableEffectScope", "Landroidx/compose/runtime/DisposableEffectScope;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EffectsKt {
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();

    public static final void SideEffect(Function0 function0, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:51)");
        }
        composer.recordSideEffect(function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void DisposableEffect(Object obj, Function1 function1, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:153)");
        }
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new DisposableEffectImpl(function1);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void DisposableEffect(Object obj, Object obj2, Function1 function1, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:190)");
        }
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new DisposableEffectImpl(function1);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, Function2 function2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:341)");
        }
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new LaunchedEffectImpl(applyCoroutineContext, function2);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, Object obj2, Function2 function2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new LaunchedEffectImpl(applyCoroutineContext, function2);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, Function2 function2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:384)");
        }
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new LaunchedEffectImpl(applyCoroutineContext, function2);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object[] objArr, Function2 function2, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:407)");
        }
        CoroutineContext applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, function2));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final CoroutineScope createCompositionCoroutineScope(CoroutineContext coroutineContext, Composer composer) {
        CompletableJob Job$default;
        if (coroutineContext.get(Job.Key) != null) {
            Job$default = JobKt__JobKt.Job$default(null, 1, null);
            Job$default.completeExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return CoroutineScopeKt.CoroutineScope(Job$default);
        }
        return new RememberedCoroutineScope(composer.getApplyCoroutineContext(), coroutineContext);
    }
}
