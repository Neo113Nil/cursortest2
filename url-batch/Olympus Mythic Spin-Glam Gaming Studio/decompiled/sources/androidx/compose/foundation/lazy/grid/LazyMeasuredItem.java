package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.X3;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LazyMeasuredItem.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001Bp\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017JE\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b)\u0010$R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b*\u0010$R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u001d\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u00100R\u0017\u00101\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u0010$R\u0017\u00103\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b4\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyMeasuredItem;", "", "Landroidx/compose/foundation/lazy/grid/ItemIndex;", "index", "key", "", "isVertical", "", "crossAxisSize", "mainAxisSpacing", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/ui/unit/IntOffset;", "visualOffset", "<init>", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;II[Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "rawMainAxisOffset", "rawCrossAxisOffset", "layoutWidth", "layoutHeight", "row", "column", "lineMainAxisSize", "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", X3.i.L, "(IIIIIII)Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;", "I", "getIndex-VZbfaAc", "()I", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Z", "getCrossAxisSize", "getMainAxisSpacing", "Landroidx/compose/ui/unit/LayoutDirection;", "[Landroidx/compose/ui/layout/Placeable;", "getPlaceables", "()[Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "J", "mainAxisSize", "getMainAxisSize", "mainAxisSizeWithSpacings", "getMainAxisSizeWithSpacings", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LazyMeasuredItem {
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private final int crossAxisSize;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private final int mainAxisSize;
    private final int mainAxisSizeWithSpacings;
    private final int mainAxisSpacing;
    private final Placeable[] placeables;
    private final LazyGridItemPlacementAnimator placementAnimator;
    private final boolean reverseLayout;
    private final long visualOffset;

    public /* synthetic */ LazyMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, Placeable[] placeableArr, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, z, i2, i3, z2, layoutDirection, i4, i5, placeableArr, lazyGridItemPlacementAnimator, j);
    }

    private LazyMeasuredItem(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, Placeable[] placeableArr, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j) {
        this.index = i;
        this.key = obj;
        this.isVertical = z;
        this.crossAxisSize = i2;
        this.mainAxisSpacing = i3;
        this.reverseLayout = z2;
        this.layoutDirection = layoutDirection;
        this.beforeContentPadding = i4;
        this.afterContentPadding = i5;
        this.placeables = placeableArr;
        this.placementAnimator = lazyGridItemPlacementAnimator;
        this.visualOffset = j;
        int i6 = 0;
        for (Placeable placeable : placeableArr) {
            i6 = Math.max(i6, this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = i6;
        this.mainAxisSizeWithSpacings = i6 + this.mainAxisSpacing;
    }

    /* renamed from: getIndex-VZbfaAc, reason: not valid java name and from getter */
    public final int getIndex() {
        return this.index;
    }

    public final Object getKey() {
        return this.key;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LazyGridPositionedItem position(int rawMainAxisOffset, int rawCrossAxisOffset, int layoutWidth, int layoutHeight, int row, int column, int lineMainAxisSize) {
        long IntOffset;
        long IntOffset2;
        long IntSize;
        int i;
        ArrayList arrayList = new ArrayList();
        boolean z = this.isVertical;
        int i2 = z ? layoutHeight : layoutWidth;
        int i3 = this.reverseLayout ? (i2 - rawMainAxisOffset) - this.mainAxisSize : rawMainAxisOffset;
        int i4 = (z && this.layoutDirection == LayoutDirection.Rtl) ? ((z ? layoutWidth : layoutHeight) - rawCrossAxisOffset) - this.crossAxisSize : rawCrossAxisOffset;
        if (z) {
            IntOffset = IntOffsetKt.IntOffset(i4, i3);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i3, i4);
        }
        int lastIndex = this.reverseLayout ? ArraysKt.getLastIndex(this.placeables) : 0;
        while (true) {
            boolean z2 = this.reverseLayout;
            if (z2) {
                if (lastIndex < 0) {
                    break;
                }
                arrayList.add(!z2 ? 0 : arrayList.size(), new LazyGridPlaceableWrapper(IntOffset, this.placeables[lastIndex], this.placeables[lastIndex].getParentData(), null));
                lastIndex = !this.reverseLayout ? lastIndex - 1 : lastIndex + 1;
            } else {
                if (lastIndex >= this.placeables.length) {
                    break;
                }
                arrayList.add(!z2 ? 0 : arrayList.size(), new LazyGridPlaceableWrapper(IntOffset, this.placeables[lastIndex], this.placeables[lastIndex].getParentData(), null));
                if (!this.reverseLayout) {
                }
            }
        }
        if (this.isVertical) {
            IntOffset2 = IntOffsetKt.IntOffset(rawCrossAxisOffset, rawMainAxisOffset);
        } else {
            IntOffset2 = IntOffsetKt.IntOffset(rawMainAxisOffset, rawCrossAxisOffset);
        }
        long j = IntOffset2;
        int i5 = this.index;
        Object obj = this.key;
        if (this.isVertical) {
            IntSize = IntSizeKt.IntSize(this.crossAxisSize, this.mainAxisSize);
        } else {
            IntSize = IntSizeKt.IntSize(this.mainAxisSize, this.crossAxisSize);
        }
        long j2 = IntSize;
        int i6 = this.mainAxisSpacing;
        boolean z3 = this.reverseLayout;
        if (!z3) {
            i = this.beforeContentPadding;
        } else {
            i = this.afterContentPadding;
        }
        return new LazyGridPositionedItem(j, IntOffset, i5, obj, row, column, j2, lineMainAxisSize, i6, -i, i2 + (!z3 ? this.afterContentPadding : this.beforeContentPadding), this.isVertical, arrayList, this.placementAnimator, this.visualOffset, null);
    }
}
