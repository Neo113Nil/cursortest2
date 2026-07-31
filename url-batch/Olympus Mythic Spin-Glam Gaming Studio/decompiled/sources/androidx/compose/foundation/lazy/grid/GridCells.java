package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyGridDsl.kt */
@Stable
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0002\b\tJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells;", "", "calculateCrossAxisCellSizes", "", "", "Landroidx/compose/ui/unit/Density;", "availableSize", "spacing", "Adaptive", "Fixed", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface GridCells {
    List calculateCrossAxisCellSizes(Density density, int i, int i2);

    /* compiled from: LazyGridDsl.kt */
    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "Landroidx/compose/ui/unit/Density;", "", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", "(Landroidx/compose/ui/unit/Density;II)Ljava/util/List;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "count", "I", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Fixed implements GridCells {
        private final int count;

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List calculateCrossAxisCellSizes(Density density, int i, int i2) {
            List calculateCellsCrossAxisSizeImpl;
            Intrinsics.checkNotNullParameter(density, "<this>");
            calculateCellsCrossAxisSizeImpl = LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i, this.count, i2);
            return calculateCellsCrossAxisSizeImpl;
        }

        public int hashCode() {
            return -this.count;
        }

        public boolean equals(Object other) {
            return (other instanceof Fixed) && this.count == ((Fixed) other).count;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @StabilityInferred
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells$Adaptive;", "Landroidx/compose/foundation/lazy/grid/GridCells;", "Landroidx/compose/ui/unit/Density;", "", "availableSize", "spacing", "", "calculateCrossAxisCellSizes", "(Landroidx/compose/ui/unit/Density;II)Ljava/util/List;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/unit/Dp;", SDKConstants.PARAM_CONTEXT_MIN_SIZE, "F", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Adaptive implements GridCells {
        private final float minSize;

        @Override // androidx.compose.foundation.lazy.grid.GridCells
        public List calculateCrossAxisCellSizes(Density density, int i, int i2) {
            List calculateCellsCrossAxisSizeImpl;
            Intrinsics.checkNotNullParameter(density, "<this>");
            calculateCellsCrossAxisSizeImpl = LazyGridDslKt.calculateCellsCrossAxisSizeImpl(i, Math.max((i + i2) / (density.mo265roundToPx0680j_4(this.minSize) + i2), 1), i2);
            return calculateCellsCrossAxisSizeImpl;
        }

        public int hashCode() {
            return Dp.m2510hashCodeimpl(this.minSize);
        }

        public boolean equals(Object other) {
            return (other instanceof Adaptive) && Dp.m2509equalsimpl0(this.minSize, ((Adaptive) other).minSize);
        }
    }
}
