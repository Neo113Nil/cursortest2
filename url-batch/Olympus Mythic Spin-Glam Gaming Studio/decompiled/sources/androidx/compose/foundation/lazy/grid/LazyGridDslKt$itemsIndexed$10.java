package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 6, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class LazyGridDslKt$itemsIndexed$10 extends Lambda implements Function4 {
    final /* synthetic */ Function5 $itemContent;
    final /* synthetic */ Object[] $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$itemsIndexed$10(Function5 function5, Object[] objArr) {
        super(4);
        this.$itemContent = function5;
        this.$items = objArr;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyGridItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull LazyGridItemScope items, int i, @Nullable Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 14) == 0) {
            i3 = (composer.changed(items) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composer.changed(i) ? 32 : 16;
        }
        if ((i3 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            this.$itemContent.invoke(items, Integer.valueOf(i), this.$items[i], composer, Integer.valueOf(i3 & 126));
        }
    }
}
