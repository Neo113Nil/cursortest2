package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u001c\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\rJ\u001e\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", "<init>", "(IIII)V", "Landroidx/compose/ui/unit/Constraints;", "c", "Landroidx/compose/foundation/layout/LayoutOrientation;", X3.i.n, "(JLandroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toBoxConstraints-OenEA2s", "(Landroidx/compose/foundation/layout/LayoutOrientation;)J", "toBoxConstraints", "copy", "(IIII)Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMainAxisMin", "getMainAxisMax", "getCrossAxisMin", "getCrossAxisMax", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OrientationIndependentConstraints {
    private final int crossAxisMax;
    private final int crossAxisMin;
    private final int mainAxisMax;
    private final int mainAxisMin;

    public /* synthetic */ OrientationIndependentConstraints(long j, LayoutOrientation layoutOrientation, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, layoutOrientation);
    }

    public static /* synthetic */ OrientationIndependentConstraints copy$default(OrientationIndependentConstraints orientationIndependentConstraints, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = orientationIndependentConstraints.mainAxisMin;
        }
        if ((i5 & 2) != 0) {
            i2 = orientationIndependentConstraints.mainAxisMax;
        }
        if ((i5 & 4) != 0) {
            i3 = orientationIndependentConstraints.crossAxisMin;
        }
        if ((i5 & 8) != 0) {
            i4 = orientationIndependentConstraints.crossAxisMax;
        }
        return orientationIndependentConstraints.copy(i, i2, i3, i4);
    }

    public final OrientationIndependentConstraints copy(int mainAxisMin, int mainAxisMax, int crossAxisMin, int crossAxisMax) {
        return new OrientationIndependentConstraints(mainAxisMin, mainAxisMax, crossAxisMin, crossAxisMax);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrientationIndependentConstraints)) {
            return false;
        }
        OrientationIndependentConstraints orientationIndependentConstraints = (OrientationIndependentConstraints) other;
        return this.mainAxisMin == orientationIndependentConstraints.mainAxisMin && this.mainAxisMax == orientationIndependentConstraints.mainAxisMax && this.crossAxisMin == orientationIndependentConstraints.crossAxisMin && this.crossAxisMax == orientationIndependentConstraints.crossAxisMax;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.mainAxisMin) * 31) + Integer.hashCode(this.mainAxisMax)) * 31) + Integer.hashCode(this.crossAxisMin)) * 31) + Integer.hashCode(this.crossAxisMax);
    }

    public String toString() {
        return "OrientationIndependentConstraints(mainAxisMin=" + this.mainAxisMin + ", mainAxisMax=" + this.mainAxisMax + ", crossAxisMin=" + this.crossAxisMin + ", crossAxisMax=" + this.crossAxisMax + ')';
    }

    public OrientationIndependentConstraints(int i, int i2, int i3, int i4) {
        this.mainAxisMin = i;
        this.mainAxisMax = i2;
        this.crossAxisMin = i3;
        this.crossAxisMax = i4;
    }

    public final int getMainAxisMin() {
        return this.mainAxisMin;
    }

    public final int getMainAxisMax() {
        return this.mainAxisMax;
    }

    public final int getCrossAxisMin() {
        return this.crossAxisMin;
    }

    public final int getCrossAxisMax() {
        return this.crossAxisMax;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private OrientationIndependentConstraints(long j, LayoutOrientation layoutOrientation) {
        this(layoutOrientation == r0 ? Constraints.m2489getMinWidthimpl(j) : Constraints.m2488getMinHeightimpl(j), layoutOrientation == r0 ? Constraints.m2487getMaxWidthimpl(j) : Constraints.m2486getMaxHeightimpl(j), layoutOrientation == r0 ? Constraints.m2488getMinHeightimpl(j) : Constraints.m2489getMinWidthimpl(j), layoutOrientation == r0 ? Constraints.m2486getMaxHeightimpl(j) : Constraints.m2487getMaxWidthimpl(j));
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public final long m328toBoxConstraintsOenEA2s(LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return ConstraintsKt.Constraints(this.mainAxisMin, this.mainAxisMax, this.crossAxisMin, this.crossAxisMax);
        }
        return ConstraintsKt.Constraints(this.crossAxisMin, this.crossAxisMax, this.mainAxisMin, this.mainAxisMax);
    }
}
