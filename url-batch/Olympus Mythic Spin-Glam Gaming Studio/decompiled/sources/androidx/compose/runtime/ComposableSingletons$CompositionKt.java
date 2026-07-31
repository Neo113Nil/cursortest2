package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: Composition.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$CompositionKt {
    public static final ComposableSingletons$CompositionKt INSTANCE = new ComposableSingletons$CompositionKt();
    private static Function2 lambda$954879418 = ComposableLambdaKt.composableLambdaInstance(954879418, false, new Function2() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda$954879418$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(954879418, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$954879418.<anonymous> (Composition.kt:620)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2 lambda$1918065384 = ComposableLambdaKt.composableLambdaInstance(1918065384, false, new Function2() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda$1918065384$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1918065384, i, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda$1918065384.<anonymous> (Composition.kt:854)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2 getLambda$1918065384$runtime() {
        return lambda$1918065384;
    }

    public final Function2 getLambda$954879418$runtime() {
        return lambda$954879418;
    }
}
