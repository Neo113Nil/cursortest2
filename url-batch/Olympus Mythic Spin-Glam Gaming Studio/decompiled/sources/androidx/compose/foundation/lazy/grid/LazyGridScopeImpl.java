package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridScopeImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R)\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00118\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScopeImpl;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "<init>", "()V", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals$foundation_release", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "", "hasCustomSpans", "Z", "getHasCustomSpans$foundation_release", "()Z", "setHasCustomSpans$foundation_release", "(Z)V", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "DefaultSpan", "Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LazyGridScopeImpl implements LazyGridScope {
    private boolean hasCustomSpans;
    private final MutableIntervalList intervals = new MutableIntervalList();
    private final Function2 DefaultSpan = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScopeImpl$DefaultSpan$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return GridItemSpan.m431boximpl(m467invoke_orMbw((LazyGridItemSpanScope) obj, ((Number) obj2).intValue()));
        }

        /* renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m467invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return LazyGridSpanKt.GridItemSpan(1);
        }
    };

    /* renamed from: getIntervals$foundation_release, reason: from getter */
    public final MutableIntervalList getIntervals() {
        return this.intervals;
    }

    /* renamed from: getHasCustomSpans$foundation_release, reason: from getter */
    public final boolean getHasCustomSpans() {
        return this.hasCustomSpans;
    }
}
