package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.MeasureResult;
import com.ironsource.X3;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyGridMeasureResult.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bo\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u000f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b*\u0010 R\u001a\u0010\u0010\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b+\u0010 R\u001a\u0010\u0011\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b,\u0010 R\u001a\u0010\u0012\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b-\u0010#R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0015\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b1\u0010 R \u00106\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0005028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u0010 R\u0014\u0010:\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010 ¨\u0006;"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLine;", "firstVisibleLine", "", "firstVisibleLineScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", X3.i.n, "afterContentPadding", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;I)V", "", "placeChildren", "()V", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLine;", "getFirstVisibleLine", "()Landroidx/compose/foundation/lazy/grid/LazyMeasuredLine;", "I", "getFirstVisibleLineScrollOffset", "()I", "Z", "getCanScrollForward", "()Z", "F", "getConsumedScroll", "()F", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "getViewportStartOffset", "getViewportEndOffset", "getTotalItemsCount", "getReverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getAfterContentPadding", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private final boolean canScrollForward;
    private final float consumedScroll;
    private final LazyMeasuredLine firstVisibleLine;
    private final int firstVisibleLineScrollOffset;
    private final Orientation orientation;
    private final boolean reverseLayout;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List visibleItemsInfo;

    @Override // androidx.compose.ui.layout.MeasureResult
    public Map getAlignmentLines() {
        return this.$$delegate_0.getAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.$$delegate_0.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.$$delegate_0.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.$$delegate_0.placeChildren();
    }

    public LazyGridMeasureResult(LazyMeasuredLine lazyMeasuredLine, int i, boolean z, float f, MeasureResult measureResult, List visibleItemsInfo, int i2, int i3, int i4, boolean z2, Orientation orientation, int i5) {
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(visibleItemsInfo, "visibleItemsInfo");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.firstVisibleLine = lazyMeasuredLine;
        this.firstVisibleLineScrollOffset = i;
        this.canScrollForward = z;
        this.consumedScroll = f;
        this.visibleItemsInfo = visibleItemsInfo;
        this.viewportStartOffset = i2;
        this.viewportEndOffset = i3;
        this.totalItemsCount = i4;
        this.reverseLayout = z2;
        this.orientation = orientation;
        this.afterContentPadding = i5;
        this.$$delegate_0 = measureResult;
    }

    public final LazyMeasuredLine getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public List getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }
}
