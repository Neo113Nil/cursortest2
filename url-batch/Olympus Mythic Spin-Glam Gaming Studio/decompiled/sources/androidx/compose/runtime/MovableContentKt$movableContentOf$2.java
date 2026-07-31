package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: MovableContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MovableContentKt$movableContentOf$2 implements Function3 {
    final /* synthetic */ MovableContent $movableContent;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Object obj, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj) ? 4 : 2;
        }
        if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032736913, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:63)");
        }
        composer.insertMovableContent(this.$movableContent, obj);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
