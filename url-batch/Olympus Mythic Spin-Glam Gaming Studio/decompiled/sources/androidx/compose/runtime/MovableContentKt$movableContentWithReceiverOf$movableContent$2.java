package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* compiled from: MovableContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MovableContentKt$movableContentWithReceiverOf$movableContent$2 implements Function3 {
    final /* synthetic */ Function4 $content;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Pair) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Pair pair, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(pair) : composer.changedInstance(pair) ? 4 : 2;
        }
        if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-95003188, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:196)");
        }
        this.$content.invoke(pair.getFirst(), pair.getSecond(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
