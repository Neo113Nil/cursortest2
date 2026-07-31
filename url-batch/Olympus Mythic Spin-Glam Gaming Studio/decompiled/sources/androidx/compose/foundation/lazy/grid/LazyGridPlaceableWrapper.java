package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LazyMeasuredItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridPlaceableWrapper;", "", "Landroidx/compose/ui/unit/IntOffset;", "offset", "Landroidx/compose/ui/layout/Placeable;", "placeable", "parentData", "<init>", "(JLandroidx/compose/ui/layout/Placeable;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getOffset-nOcc-ac", "()J", "Landroidx/compose/ui/layout/Placeable;", "getPlaceable", "()Landroidx/compose/ui/layout/Placeable;", "Ljava/lang/Object;", "getParentData", "()Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LazyGridPlaceableWrapper {
    private final long offset;
    private final Object parentData;
    private final Placeable placeable;

    public /* synthetic */ LazyGridPlaceableWrapper(long j, Placeable placeable, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, placeable, obj);
    }

    private LazyGridPlaceableWrapper(long j, Placeable placeable, Object obj) {
        this.offset = j;
        this.placeable = placeable;
        this.parentData = obj;
    }

    public final Placeable getPlaceable() {
        return this.placeable;
    }

    public final Object getParentData() {
        return this.parentData;
    }
}
