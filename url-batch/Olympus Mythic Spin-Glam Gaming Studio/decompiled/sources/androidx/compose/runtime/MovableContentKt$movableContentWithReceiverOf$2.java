package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: MovableContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class MovableContentKt$movableContentWithReceiverOf$2 implements Function4 {
    final /* synthetic */ MovableContent $movableContent;

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Object obj, Object obj2, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2) ? 32 : 16;
        }
        if (!composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1349529900, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:197)");
        }
        composer.insertMovableContent(this.$movableContent, TuplesKt.to(obj, obj2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
