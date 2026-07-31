package androidx.compose.foundation;

import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.LayoutDirection;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BH\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\r*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\r*\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R!\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/foundation/Background;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/Shape;", "shape", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawRect", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "drawOutline", "draw", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/ui/graphics/Brush;", "F", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/geometry/Size;", "lastSize", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/LayoutDirection;", "lastLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/graphics/Outline;", "lastOutline", "Landroidx/compose/ui/graphics/Outline;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Background extends InspectorValueInfo implements DrawModifier {
    private final float alpha;
    private final Brush brush;
    private final Color color;
    private LayoutDirection lastLayoutDirection;
    private Outline lastOutline;
    private Size lastSize;
    private final Shape shape;

    public /* synthetic */ Background(Color color, Brush brush, float f, Shape shape, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(color, brush, f, shape, function1);
    }

    public /* synthetic */ Background(Color color, Brush brush, float f, Shape shape, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : color, (i & 2) != 0 ? null : brush, (i & 4) != 0 ? 1.0f : f, shape, function1, null);
    }

    private Background(Color color, Brush brush, float f, Shape shape, Function1 function1) {
        super(function1);
        this.color = color;
        this.brush = brush;
        this.alpha = f;
        this.shape = shape;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        if (this.shape == RectangleShapeKt.getRectangleShape()) {
            drawRect(contentDrawScope);
        } else {
            drawOutline(contentDrawScope);
        }
        contentDrawScope.drawContent();
    }

    private final void drawRect(ContentDrawScope contentDrawScope) {
        Color color = this.color;
        if (color != null) {
            DrawScope.m1703drawRectnJ9OG0$default(contentDrawScope, color.getValue(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            DrawScope.m1702drawRectAsUm42w$default(contentDrawScope, brush, 0L, 0L, this.alpha, null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
        }
    }

    private final void drawOutline(ContentDrawScope contentDrawScope) {
        Outline mo184createOutlinePq9zytI;
        if (Size.m1331equalsimpl(contentDrawScope.mo1708getSizeNHjbRc(), this.lastSize) && contentDrawScope.getLayoutDirection() == this.lastLayoutDirection) {
            mo184createOutlinePq9zytI = this.lastOutline;
            Intrinsics.checkNotNull(mo184createOutlinePq9zytI);
        } else {
            mo184createOutlinePq9zytI = this.shape.mo184createOutlinePq9zytI(contentDrawScope.mo1708getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
        }
        Color color = this.color;
        if (color != null) {
            color.getValue();
            OutlineKt.m1530drawOutlinewDX37Ww(contentDrawScope, mo184createOutlinePq9zytI, this.color.getValue(), (r17 & 4) != 0 ? 1.0f : 0.0f, (r17 & 8) != 0 ? Fill.INSTANCE : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? DrawScope.INSTANCE.m1709getDefaultBlendMode0nO6VwU() : 0);
        }
        Brush brush = this.brush;
        if (brush != null) {
            OutlineKt.m1529drawOutlinehn5TExg$default(contentDrawScope, mo184createOutlinePq9zytI, brush, this.alpha, null, null, 0, 56, null);
        }
        this.lastOutline = mo184createOutlinePq9zytI;
        this.lastSize = Size.m1329boximpl(contentDrawScope.mo1708getSizeNHjbRc());
    }

    public int hashCode() {
        Color color = this.color;
        int m1453hashCodeimpl = (color != null ? Color.m1453hashCodeimpl(color.getValue()) : 0) * 31;
        Brush brush = this.brush;
        return ((((m1453hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    public boolean equals(Object other) {
        Background background = other instanceof Background ? (Background) other : null;
        return background != null && Intrinsics.areEqual(this.color, background.color) && Intrinsics.areEqual(this.brush, background.brush) && this.alpha == background.alpha && Intrinsics.areEqual(this.shape, background.shape);
    }

    public String toString() {
        return "Background(color=" + this.color + ", brush=" + this.brush + ", alpha = " + this.alpha + ", shape=" + this.shape + ')';
    }
}
