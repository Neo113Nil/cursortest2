package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* compiled from: LazyGridScopeImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R,\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\b8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R.\u0010\u0014\u001a\u0019\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\b¢\u0006\u0002\b\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "", "Lkotlin/Function1;", "", "key", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "Lkotlin/jvm/functions/Function2;", "getSpan", "()Lkotlin/jvm/functions/Function2;", "type", "getType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "", "Landroidx/compose/runtime/Composable;", "item", "Lkotlin/jvm/functions/Function4;", "getItem", "()Lkotlin/jvm/functions/Function4;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LazyGridIntervalContent {
    private final Function4 item;
    private final Function1 key;
    private final Function2 span;
    private final Function1 type;

    public final Function1 getKey() {
        return this.key;
    }

    public final Function2 getSpan() {
        return this.span;
    }

    public final Function1 getType() {
        return this.type;
    }

    public final Function4 getItem() {
        return this.item;
    }
}
