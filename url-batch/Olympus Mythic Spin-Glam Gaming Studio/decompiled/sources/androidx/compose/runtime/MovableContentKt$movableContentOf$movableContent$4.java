package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;

/* compiled from: MovableContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$movableContent$4 implements Function3 {
    final /* synthetic */ Function6 $content;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Object[]) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Object[] objArr, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743481490, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:142)");
        }
        this.$content.invoke(objArr[0], objArr[1], objArr[2], objArr[3], composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
