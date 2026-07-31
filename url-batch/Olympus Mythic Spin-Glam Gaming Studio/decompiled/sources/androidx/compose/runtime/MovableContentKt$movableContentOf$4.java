package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;

/* compiled from: MovableContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MovableContentKt$movableContentOf$4 implements Function5 {
    final /* synthetic */ MovableContent $movableContent;

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke(obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Object obj, Object obj2, Object obj3, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composer.changed(obj3) : composer.changedInstance(obj3) ? 256 : 128;
        }
        if (!composer.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1477386365, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:115)");
        }
        composer.insertMovableContent(this.$movableContent, new Triple(obj, obj2, obj3));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
