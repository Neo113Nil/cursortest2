package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: CompositionLocal.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000e\u001a>\u0010\u0015\u001a\u00020\u00122\u001a\u0010\u0011\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f\"\u0006\u0012\u0002\b\u00030\u00102\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"T", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "Lkotlin/Function0;", "defaultFactory", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "compositionLocalOf", "(Landroidx/compose/runtime/SnapshotMutationPolicy;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/ProvidableCompositionLocal;", "staticCompositionLocalOf", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "defaultComputation", "compositionLocalWithComputedDefaultOf", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "", "Landroidx/compose/runtime/Composable;", "content", "CompositionLocalProvider", "([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositionLocalKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompositionLocalProvider$lambda$0(ProvidedValue[] providedValueArr, Function2 function2, int i, Composer composer, int i2) {
        CompositionLocalProvider(providedValueArr, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, function0);
    }

    public static final ProvidableCompositionLocal compositionLocalOf(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0) {
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy, function0);
    }

    public static final ProvidableCompositionLocal staticCompositionLocalOf(Function0 function0) {
        return new StaticProvidableCompositionLocal(function0);
    }

    public static final ProvidableCompositionLocal compositionLocalWithComputedDefaultOf(Function1 function1) {
        return new ComputedProvidableCompositionLocal(function1);
    }

    public static final void CompositionLocalProvider(final ProvidedValue[] providedValueArr, final Function2 function2, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(415205898);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(415205898, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:367)");
        }
        startRestartGroup.startProviders(providedValueArr);
        function2.invoke(startRestartGroup, Integer.valueOf((i >> 3) & 14));
        startRestartGroup.endProviders();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.runtime.CompositionLocalKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CompositionLocalProvider$lambda$0;
                    CompositionLocalProvider$lambda$0 = CompositionLocalKt.CompositionLocalProvider$lambda$0(providedValueArr, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CompositionLocalProvider$lambda$0;
                }
            });
        }
    }
}
