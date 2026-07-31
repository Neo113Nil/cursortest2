package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyGridItemPlacementAnimator.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR+\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/lazy/grid/ItemInfo;", "", "", "index", "crossAxisSize", "crossAxisOffset", "<init>", "(III)V", "I", "getIndex", "()I", "setIndex", "(I)V", "getCrossAxisSize", "setCrossAxisSize", "getCrossAxisOffset", "setCrossAxisOffset", "Landroidx/compose/ui/unit/IntOffset;", "notAnimatableDelta", "J", "getNotAnimatableDelta-nOcc-ac", "()J", "setNotAnimatableDelta--gyyYBs", "(J)V", "", "Landroidx/compose/foundation/lazy/grid/PlaceableInfo;", "placeables", "Ljava/util/List;", "getPlaceables", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
final class ItemInfo {
    private int crossAxisOffset;
    private int crossAxisSize;
    private int index;
    private long notAnimatableDelta = IntOffset.INSTANCE.m2558getZeronOccac();
    private final List placeables = new ArrayList();

    public ItemInfo(int i, int i2, int i3) {
        this.index = i;
        this.crossAxisSize = i2;
        this.crossAxisOffset = i3;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final void setCrossAxisSize(int i) {
        this.crossAxisSize = i;
    }

    public final int getCrossAxisOffset() {
        return this.crossAxisOffset;
    }

    public final void setCrossAxisOffset(int i) {
        this.crossAxisOffset = i;
    }

    /* renamed from: getNotAnimatableDelta-nOcc-ac, reason: not valid java name and from getter */
    public final long getNotAnimatableDelta() {
        return this.notAnimatableDelta;
    }

    /* renamed from: setNotAnimatableDelta--gyyYBs, reason: not valid java name */
    public final void m446setNotAnimatableDeltagyyYBs(long j) {
        this.notAnimatableDelta = j;
    }

    public final List getPlaceables() {
        return this.placeables;
    }
}
