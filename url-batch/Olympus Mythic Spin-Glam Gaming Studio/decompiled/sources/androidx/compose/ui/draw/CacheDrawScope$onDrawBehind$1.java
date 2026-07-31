package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CacheDrawScope$onDrawBehind$1 extends Lambda implements Function1 {
    final /* synthetic */ Function1 $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CacheDrawScope$onDrawBehind$1(Function1 function1) {
        super(1);
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull ContentDrawScope onDrawWithContent) {
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        this.$block.invoke(onDrawWithContent);
        onDrawWithContent.drawContent();
    }
}
