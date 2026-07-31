package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: LazyListScopeImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R.\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "", "Lkotlin/Function1;", "", "key", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "type", "getType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Landroidx/compose/runtime/Composable;", "item", "Lkotlin/jvm/functions/Function4;", "getItem", "()Lkotlin/jvm/functions/Function4;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LazyListIntervalContent {
    private final Function4 item;
    private final Function1 key;
    private final Function1 type;

    public final Function1 getKey() {
        return this.key;
    }

    public final Function1 getType() {
        return this.type;
    }

    public final Function4 getItem() {
        return this.item;
    }
}
