package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 6, 0}, xi = 176)
/* loaded from: classes13.dex */
public final class LazyGridDslKt$itemsIndexed$8 extends Lambda implements Function2 {
    final /* synthetic */ Object[] $items;
    final /* synthetic */ Function3 $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$itemsIndexed$8(Function3 function3, Object[] objArr) {
        super(2);
        this.$span = function3;
        this.$items = objArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return GridItemSpan.m431boximpl(m450invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
    }

    /* renamed from: invoke-_-orMbw, reason: not valid java name */
    public final long m450invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
        Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
        return ((GridItemSpan) this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.$items[i])).getPackedValue();
    }
}
