package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function6;

/* compiled from: MovableContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class MovableContentKt$movableContentWithReceiverOf$4 implements Function6 {
    final /* synthetic */ MovableContent $movableContent;

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        invoke(obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, int i) {
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
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composer.changed(obj4) : composer.changedInstance(obj4) ? 2048 : 1024;
        }
        if (!composer.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(572330192, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:252)");
        }
        composer.insertMovableContent(this.$movableContent, new Object[]{obj, obj2, obj3, obj4});
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
