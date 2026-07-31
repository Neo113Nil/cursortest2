package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;

/* compiled from: MovableContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$movableContent$3 implements Function3 {
    final /* synthetic */ Function5 $content;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Triple) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Triple triple, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(triple) : composer.changedInstance(triple) ? 4 : 2;
        }
        if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846116651, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:113)");
        }
        this.$content.invoke(triple.getFirst(), triple.getSecond(), triple.getThird(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
