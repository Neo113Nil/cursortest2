package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyListScopeImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
final class LazyListScopeImpl$item$3 extends Lambda implements Function4 {
    final /* synthetic */ Function3 $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListScopeImpl$item$3(Function3 function3) {
        super(4);
        this.$content = function3;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull LazyItemScope $receiver, int i, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        if ((i2 & 14) == 0) {
            i2 |= composer.changed($receiver) ? 4 : 2;
        }
        if ((i2 & 651) == 130 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            this.$content.invoke($receiver, composer, Integer.valueOf(i2 & 14));
        }
    }
}
