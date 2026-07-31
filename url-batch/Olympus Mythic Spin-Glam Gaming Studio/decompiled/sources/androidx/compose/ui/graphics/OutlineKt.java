package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Outline.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aQ\u0010\u0013\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aQ\u0010\u0013\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0016\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0016\u0010\u001d\u001a\u00020\u001c*\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u0016\u0010\u001a\u001a\u00020\u0019*\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001f\u001a\u0016\u0010\u001d\u001a\u00020\u001c*\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001f\u001a\u0013\u0010!\u001a\u00020 *\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Outline;", "outline", "", "addOutline", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Outline;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", "color", "", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawOutline-wDX37Ww", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOutline", "Landroidx/compose/ui/graphics/Brush;", "brush", "drawOutline-hn5TExg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "(Landroidx/compose/ui/geometry/Rect;)J", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/geometry/RoundRect;", "(Landroidx/compose/ui/geometry/RoundRect;)J", "", "hasSameCornerRadius", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OutlineKt {
    public static final void addOutline(Path path, Outline outline) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(outline, "outline");
        if (outline instanceof Outline.Rectangle) {
            path.addRect(((Outline.Rectangle) outline).getRect());
        } else if (outline instanceof Outline.Rounded) {
            path.addRoundRect(((Outline.Rounded) outline).getRoundRect());
        } else {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            Path.m1540addPathUv8p0NA$default(path, ((Outline.Generic) outline).getPath(), 0L, 2, null);
        }
    }

    /* renamed from: drawOutline-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m1529drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = DrawScope.INSTANCE.m1709getDefaultBlendMode0nO6VwU();
        }
        m1528drawOutlinehn5TExg(drawScope, outline, brush, f2, drawStyle2, colorFilter2, i);
    }

    private static final long topLeft(Rect rect) {
        return OffsetKt.Offset(rect.getLeft(), rect.getTop());
    }

    private static final long size(Rect rect) {
        return SizeKt.Size(rect.getWidth(), rect.getHeight());
    }

    private static final long topLeft(RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
    }

    private static final long size(RoundRect roundRect) {
        return SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
    }

    /* renamed from: drawOutline-hn5TExg, reason: not valid java name */
    public static final void m1528drawOutlinehn5TExg(DrawScope drawOutline, Outline outline, Brush brush, float f, DrawStyle style, ColorFilter colorFilter, int i) {
        Path path;
        Intrinsics.checkNotNullParameter(drawOutline, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(style, "style");
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawOutline.mo1678drawRectAsUm42w(brush, topLeft(rect), size(rect), f, style, colorFilter, i);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawOutline.mo1680drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m1282getXimpl(roundRect.getBottomLeftCornerRadius()), 0.0f, 2, null), f, style, colorFilter, i);
                return;
            }
        } else {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            path = ((Outline.Generic) outline).getPath();
        }
        drawOutline.mo1675drawPathGBMwjPU(path, brush, f, style, colorFilter, i);
    }

    /* renamed from: drawOutline-wDX37Ww, reason: not valid java name */
    public static final void m1530drawOutlinewDX37Ww(DrawScope drawOutline, Outline outline, long j, float f, DrawStyle style, ColorFilter colorFilter, int i) {
        Path path;
        Intrinsics.checkNotNullParameter(drawOutline, "$this$drawOutline");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(style, "style");
        if (outline instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline).getRect();
            drawOutline.mo1679drawRectnJ9OG0(j, topLeft(rect), size(rect), f, style, colorFilter, i);
            return;
        }
        if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            path = rounded.getRoundRectPath();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                drawOutline.mo1681drawRoundRectuAw5IA(j, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m1282getXimpl(roundRect.getBottomLeftCornerRadius()), 0.0f, 2, null), style, f, colorFilter, i);
                return;
            }
        } else {
            if (!(outline instanceof Outline.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            path = ((Outline.Generic) outline).getPath();
        }
        drawOutline.mo1676drawPathLG529CI(path, j, f, style, colorFilter, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasSameCornerRadius(RoundRect roundRect) {
        return ((CornerRadius.m1282getXimpl(roundRect.getBottomLeftCornerRadius()) > CornerRadius.m1282getXimpl(roundRect.getBottomRightCornerRadius()) ? 1 : (CornerRadius.m1282getXimpl(roundRect.getBottomLeftCornerRadius()) == CornerRadius.m1282getXimpl(roundRect.getBottomRightCornerRadius()) ? 0 : -1)) == 0 && (CornerRadius.m1282getXimpl(roundRect.getBottomRightCornerRadius()) > CornerRadius.m1282getXimpl(roundRect.getTopRightCornerRadius()) ? 1 : (CornerRadius.m1282getXimpl(roundRect.getBottomRightCornerRadius()) == CornerRadius.m1282getXimpl(roundRect.getTopRightCornerRadius()) ? 0 : -1)) == 0 && (CornerRadius.m1282getXimpl(roundRect.getTopRightCornerRadius()) > CornerRadius.m1282getXimpl(roundRect.getTopLeftCornerRadius()) ? 1 : (CornerRadius.m1282getXimpl(roundRect.getTopRightCornerRadius()) == CornerRadius.m1282getXimpl(roundRect.getTopLeftCornerRadius()) ? 0 : -1)) == 0) && ((CornerRadius.m1283getYimpl(roundRect.getBottomLeftCornerRadius()) > CornerRadius.m1283getYimpl(roundRect.getBottomRightCornerRadius()) ? 1 : (CornerRadius.m1283getYimpl(roundRect.getBottomLeftCornerRadius()) == CornerRadius.m1283getYimpl(roundRect.getBottomRightCornerRadius()) ? 0 : -1)) == 0 && (CornerRadius.m1283getYimpl(roundRect.getBottomRightCornerRadius()) > CornerRadius.m1283getYimpl(roundRect.getTopRightCornerRadius()) ? 1 : (CornerRadius.m1283getYimpl(roundRect.getBottomRightCornerRadius()) == CornerRadius.m1283getYimpl(roundRect.getTopRightCornerRadius()) ? 0 : -1)) == 0 && (CornerRadius.m1283getYimpl(roundRect.getTopRightCornerRadius()) > CornerRadius.m1283getYimpl(roundRect.getTopLeftCornerRadius()) ? 1 : (CornerRadius.m1283getYimpl(roundRect.getTopRightCornerRadius()) == CornerRadius.m1283getYimpl(roundRect.getTopLeftCornerRadius()) ? 0 : -1)) == 0);
    }
}
