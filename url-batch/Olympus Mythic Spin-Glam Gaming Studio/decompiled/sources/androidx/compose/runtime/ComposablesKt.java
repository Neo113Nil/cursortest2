package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composables.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"", "invalidApplier", "()V", "Landroidx/compose/runtime/CompositionContext;", "rememberCompositionContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "currentRecomposeScope", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "getCurrentCompositeKeyHash$annotations", "currentCompositeKeyHash", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCurrentCompositeKeyHashCode", "(Landroidx/compose/runtime/Composer;I)J", "currentCompositeKeyHashCode", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ComposablesKt {
    public static final RecomposeScope getCurrentRecomposeScope(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394957799, i, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:205)");
        }
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        composer.recordUsed(recomposeScope);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return recomposeScope;
    }

    public static final int getCurrentCompositeKeyHash(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524444915, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:241)");
        }
        int compoundKeyHash = composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compoundKeyHash;
    }

    public static final long getCurrentCompositeKeyHashCode(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-168259424, i, -1, "androidx.compose.runtime.<get-currentCompositeKeyHashCode> (Composables.kt:257)");
        }
        long compositeKeyHashCode = composer.getCompositeKeyHashCode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return compositeKeyHashCode;
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final CompositionContext rememberCompositionContext(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1165786124, i, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:505)");
        }
        CompositionContext buildContext = composer.buildContext();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buildContext;
    }
}
