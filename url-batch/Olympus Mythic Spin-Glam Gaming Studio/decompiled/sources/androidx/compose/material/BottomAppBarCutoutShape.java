package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0015\u001a\u00020\f*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010-\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/material/BottomAppBarCutoutShape;", "Landroidx/compose/ui/graphics/Shape;", "cutoutShape", "Landroidx/compose/material/FabPlacement;", "fabPlacement", "<init>", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/FabPlacement;)V", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "", "addCutoutShape", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "", "cutoutStartPosition", "cutoutEndPosition", "cutoutRadius", "roundedEdgeRadius", "verticalOffset", "addRoundedEdges", "(Landroidx/compose/ui/graphics/Path;FFFFF)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/Shape;", "getCutoutShape", "()Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material/FabPlacement;", "getFabPlacement", "()Landroidx/compose/material/FabPlacement;", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class BottomAppBarCutoutShape implements Shape {
    private final Shape cutoutShape;
    private final FabPlacement fabPlacement;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomAppBarCutoutShape)) {
            return false;
        }
        BottomAppBarCutoutShape bottomAppBarCutoutShape = (BottomAppBarCutoutShape) other;
        return Intrinsics.areEqual(this.cutoutShape, bottomAppBarCutoutShape.cutoutShape) && Intrinsics.areEqual(this.fabPlacement, bottomAppBarCutoutShape.fabPlacement);
    }

    public int hashCode() {
        return (this.cutoutShape.hashCode() * 31) + this.fabPlacement.hashCode();
    }

    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.cutoutShape + ", fabPlacement=" + this.fabPlacement + ')';
    }

    public BottomAppBarCutoutShape(Shape cutoutShape, FabPlacement fabPlacement) {
        Intrinsics.checkNotNullParameter(cutoutShape, "cutoutShape");
        Intrinsics.checkNotNullParameter(fabPlacement, "fabPlacement");
        this.cutoutShape = cutoutShape;
        this.fabPlacement = fabPlacement;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo184createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        Path.addRect(new Rect(0.0f, 0.0f, Size.m1335getWidthimpl(size), Size.m1333getHeightimpl(size)));
        Path Path2 = AndroidPath_androidKt.Path();
        addCutoutShape(Path2, layoutDirection, density);
        Path2.mo1379opN5in7k0(Path, Path2, PathOperation.INSTANCE.m1556getDifferenceb3I0S0c());
        return new Outline.Generic(Path2);
    }

    private final void addCutoutShape(Path path, LayoutDirection layoutDirection, Density density) {
        float f;
        float f2;
        f = AppBarKt.BottomAppBarCutoutOffset;
        float mo271toPx0680j_4 = density.mo271toPx0680j_4(f);
        float f3 = 2 * mo271toPx0680j_4;
        long Size = SizeKt.Size(this.fabPlacement.getWidth() + f3, this.fabPlacement.getHeight() + f3);
        float left = this.fabPlacement.getLeft() - mo271toPx0680j_4;
        float m1335getWidthimpl = left + Size.m1335getWidthimpl(Size);
        float m1333getHeightimpl = Size.m1333getHeightimpl(Size) / 2.0f;
        OutlineKt.addOutline(path, this.cutoutShape.mo184createOutlinePq9zytI(Size, layoutDirection, density));
        path.mo1381translatek4lQ0M(OffsetKt.Offset(left, -m1333getHeightimpl));
        if (Intrinsics.areEqual(this.cutoutShape, RoundedCornerShapeKt.getCircleShape())) {
            f2 = AppBarKt.BottomAppBarRoundedEdgeRadius;
            addRoundedEdges(path, left, m1335getWidthimpl, m1333getHeightimpl, density.mo271toPx0680j_4(f2), 0.0f);
        }
    }

    private final void addRoundedEdges(Path path, float f, float f2, float f3, float f4, float f5) {
        float f6 = -((float) Math.sqrt((f3 * f3) - (f5 * f5)));
        float f7 = f3 + f6;
        float f8 = f + f7;
        float f9 = f2 - f7;
        Pair calculateRoundedEdgeIntercept = AppBarKt.calculateRoundedEdgeIntercept(f6 - 1.0f, f5, f3);
        float floatValue = ((Number) calculateRoundedEdgeIntercept.component1()).floatValue() + f3;
        float floatValue2 = ((Number) calculateRoundedEdgeIntercept.component2()).floatValue() - f5;
        path.moveTo(f8 - f4, 0.0f);
        path.quadraticBezierTo(f8 - 1.0f, 0.0f, f + floatValue, floatValue2);
        path.lineTo(f2 - floatValue, floatValue2);
        path.quadraticBezierTo(f9 + 1.0f, 0.0f, f4 + f9, 0.0f);
        path.close();
    }
}
