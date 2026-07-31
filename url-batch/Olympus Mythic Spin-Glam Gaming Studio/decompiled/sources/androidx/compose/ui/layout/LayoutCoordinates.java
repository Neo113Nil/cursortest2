package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

/* compiled from: LayoutCoordinates.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0005J%\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\u00020\u00168&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "", "Landroidx/compose/ui/geometry/Offset;", "relativeToWindow", "windowToLocal-MK-Hz9U", "(J)J", "windowToLocal", "relativeToLocal", "localToWindow-MK-Hz9U", "localToWindow", "localToRoot-MK-Hz9U", "localToRoot", "sourceCoordinates", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "localPositionOf", "", "clipBounds", "Landroidx/compose/ui/geometry/Rect;", "localBoundingBoxOf", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "isAttached", "()Z", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface LayoutCoordinates {

    /* compiled from: LayoutCoordinates.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    LayoutCoordinates getParentLayoutCoordinates();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo1946getSizeYbymL2g();

    boolean isAttached();

    Rect localBoundingBoxOf(LayoutCoordinates sourceCoordinates, boolean clipBounds);

    /* renamed from: localPositionOf-R5De75A, reason: not valid java name */
    long mo1947localPositionOfR5De75A(LayoutCoordinates sourceCoordinates, long relativeToSource);

    /* renamed from: localToRoot-MK-Hz9U, reason: not valid java name */
    long mo1948localToRootMKHz9U(long relativeToLocal);

    /* renamed from: localToWindow-MK-Hz9U, reason: not valid java name */
    long mo1949localToWindowMKHz9U(long relativeToLocal);

    /* renamed from: windowToLocal-MK-Hz9U, reason: not valid java name */
    long mo1950windowToLocalMKHz9U(long relativeToWindow);

    static /* synthetic */ Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z);
    }
}
