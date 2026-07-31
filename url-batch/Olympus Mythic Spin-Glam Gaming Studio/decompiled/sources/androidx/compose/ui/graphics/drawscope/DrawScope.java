package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DrawScope.kt */
@DrawScopeMarker
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 c2\u00020\u0001:\u0001cJ!\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006Jm\u0010\u001a\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019Jm\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ[\u0010%\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J[\u0010%\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'JQ\u0010,\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+Jy\u0010,\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020-2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u00104\u001a\u000203H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106Je\u0010;\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u00108\u001a\u0002072\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:Je\u0010;\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u00108\u001a\u0002072\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=J[\u0010B\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010>\u001a\u00020\f2\b\b\u0002\u0010?\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJs\u0010I\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\f2\u0006\u0010D\u001a\u00020\f2\u0006\u0010F\u001a\u00020E2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJO\u0010N\u001a\u00020\u00172\u0006\u0010K\u001a\u00020J2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJO\u0010N\u001a\u00020\u00172\u0006\u0010K\u001a\u00020J2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010PJs\u0010W\u001a\u00020\u00172\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00030Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001d\u0010?\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001d\u0010 \u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b^\u0010]R\u0014\u0010b\u001a\u00020_8&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006dÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/geometry/Offset;", "offset", "offsetSize-PENXr5M", "(JJ)J", "offsetSize", "Landroidx/compose/ui/graphics/Brush;", "brush", "start", "end", "", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "Landroidx/compose/ui/graphics/Color;", "color", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "topLeft", "size", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "drawRect-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "Landroidx/compose/ui/graphics/Path;", "path", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getCenter-F1C5BW0", "()J", "getSize-NH-jbRc", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface DrawScope extends Density {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* renamed from: drawArc-yD3GUKo */
    void mo1669drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo1670drawCircleVaOC9Bg(long color, float radius, long center, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawImage-gbVJVH8 */
    void mo1672drawImagegbVJVH8(ImageBitmap image, long topLeft, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawLine-1RTmtNc */
    void mo1673drawLine1RTmtNc(Brush brush, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo1674drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPath-GBMwjPU */
    void mo1675drawPathGBMwjPU(Path path, Brush brush, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPath-LG529CI */
    void mo1676drawPathLG529CI(Path path, long color, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo1677drawPointsF8ZwMP8(List points, int pointMode, long color, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRect-AsUm42w */
    void mo1678drawRectAsUm42w(Brush brush, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRect-n-J9OG0 */
    void mo1679drawRectnJ9OG0(long color, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo1680drawRoundRectZuiqVtQ(Brush brush, long topLeft, long size, long cornerRadius, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo1681drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, DrawStyle style, float alpha, ColorFilter colorFilter, int blendMode);

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    default long mo1707getCenterF1C5BW0() {
        return SizeKt.m1342getCenteruvyYCjk(getDrawContext().mo1685getSizeNHjbRc());
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo1708getSizeNHjbRc() {
        return getDrawContext().mo1685getSizeNHjbRc();
    }

    /* renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
    static /* synthetic */ void m1697drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.mo1673drawLine1RTmtNc(brush, j, j2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.INSTANCE.m1715getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : colorFilter, (i3 & 256) != 0 ? INSTANCE.m1709getDefaultBlendMode0nO6VwU() : i2);
    }

    /* renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
    static /* synthetic */ void m1698drawLineNGM6Ib0$default(DrawScope drawScope, long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.mo1674drawLineNGM6Ib0(j, j2, j3, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? Stroke.INSTANCE.m1715getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : colorFilter, (i3 & 256) != 0 ? INSTANCE.m1709getDefaultBlendMode0nO6VwU() : i2);
    }

    /* renamed from: drawRect-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m1702drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long m1308getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m1308getZeroF1C5BW0() : j;
        drawScope.mo1678drawRectAsUm42w(brush, m1308getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1706offsetSizePENXr5M(drawScope.mo1708getSizeNHjbRc(), m1308getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? INSTANCE.m1709getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m1703drawRectnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long m1308getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m1308getZeroF1C5BW0() : j2;
        drawScope.mo1679drawRectnJ9OG0(j, m1308getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1706offsetSizePENXr5M(drawScope.mo1708getSizeNHjbRc(), m1308getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? INSTANCE.m1709getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
    static /* synthetic */ void m1696drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.mo1672drawImagegbVJVH8(imageBitmap, (i2 & 2) != 0 ? Offset.INSTANCE.m1308getZeroF1C5BW0() : j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 16) != 0 ? null : colorFilter, (i2 & 32) != 0 ? INSTANCE.m1709getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
    static /* synthetic */ void m1695drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long m2558getZeronOccac = (i3 & 2) != 0 ? IntOffset.INSTANCE.m2558getZeronOccac() : j;
        long IntSize = (i3 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2;
        drawScope.mo1671drawImageAZ2fEMs(imageBitmap, m2558getZeronOccac, IntSize, (i3 & 8) != 0 ? IntOffset.INSTANCE.m2558getZeronOccac() : j3, (i3 & 16) != 0 ? IntSize : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i3 & 128) != 0 ? null : colorFilter, (i3 & 256) != 0 ? INSTANCE.m1709getDefaultBlendMode0nO6VwU() : i, (i3 & 512) != 0 ? INSTANCE.m1710getDefaultFilterQualityfv9h1I() : i2);
    }

    /* renamed from: drawImage-AZ2fEMs */
    default void mo1671drawImageAZ2fEMs(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(style, "style");
        m1695drawImageAZ2fEMs$default(this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, 0, 512, null);
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
    static /* synthetic */ void m1704drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long m1308getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m1308getZeroF1C5BW0() : j;
        drawScope.mo1680drawRoundRectZuiqVtQ(brush, m1308getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1706offsetSizePENXr5M(drawScope.mo1708getSizeNHjbRc(), m1308getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? CornerRadius.INSTANCE.m1287getZerokKHJgLs() : j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 64) != 0 ? null : colorFilter, (i2 & 128) != 0 ? INSTANCE.m1709getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
    static /* synthetic */ void m1705drawRoundRectuAw5IA$default(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long m1308getZeroF1C5BW0 = (i2 & 2) != 0 ? Offset.INSTANCE.m1308getZeroF1C5BW0() : j2;
        drawScope.mo1681drawRoundRectuAw5IA(j, m1308getZeroF1C5BW0, (i2 & 4) != 0 ? drawScope.m1706offsetSizePENXr5M(drawScope.mo1708getSizeNHjbRc(), m1308getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? CornerRadius.INSTANCE.m1287getZerokKHJgLs() : j4, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? null : colorFilter, (i2 & 128) != 0 ? INSTANCE.m1709getDefaultBlendMode0nO6VwU() : i);
    }

    /* compiled from: DrawScope.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
    static /* synthetic */ void m1694drawCircleVaOC9Bg$default(DrawScope drawScope, long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        drawScope.mo1670drawCircleVaOC9Bg(j, (i2 & 2) != 0 ? Size.m1334getMinDimensionimpl(drawScope.mo1708getSizeNHjbRc()) / 2.0f : f, (i2 & 4) != 0 ? drawScope.mo1707getCenterF1C5BW0() : j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? INSTANCE.m1709getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
    static /* synthetic */ void m1693drawArcyD3GUKo$default(DrawScope drawScope, long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long m1308getZeroF1C5BW0 = (i2 & 16) != 0 ? Offset.INSTANCE.m1308getZeroF1C5BW0() : j2;
        drawScope.mo1669drawArcyD3GUKo(j, f, f2, z, m1308getZeroF1C5BW0, (i2 & 32) != 0 ? drawScope.m1706offsetSizePENXr5M(drawScope.mo1708getSizeNHjbRc(), m1308getZeroF1C5BW0) : j3, (i2 & 64) != 0 ? 1.0f : f3, (i2 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 256) != 0 ? null : colorFilter, (i2 & 512) != 0 ? INSTANCE.m1709getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawPath-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m1700drawPathLG529CI$default(DrawScope drawScope, Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        drawScope.mo1676drawPathLG529CI(path, j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i2 & 16) != 0 ? null : colorFilter, (i2 & 32) != 0 ? INSTANCE.m1709getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
    static /* synthetic */ void m1699drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
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
            i = INSTANCE.m1709getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo1675drawPathGBMwjPU(path, brush, f2, drawStyle2, colorFilter2, i);
    }

    /* renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
    static /* synthetic */ void m1701drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope.mo1677drawPointsF8ZwMP8(list, i, j, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? StrokeCap.INSTANCE.m1594getButtKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & 128) != 0 ? null : colorFilter, (i4 & 256) != 0 ? INSTANCE.m1709getDefaultBlendMode0nO6VwU() : i3);
    }

    /* renamed from: offsetSize-PENXr5M, reason: not valid java name */
    private default long m1706offsetSizePENXr5M(long j, long j2) {
        return SizeKt.Size(Size.m1335getWidthimpl(j) - Offset.m1297getXimpl(j2), Size.m1333getHeightimpl(j) - Offset.m1298getYimpl(j2));
    }

    /* compiled from: DrawScope.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "()V", "DefaultBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultBlendMode-0nO6VwU", "()I", "I", "DefaultFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getDefaultFilterQuality-f-v9h1I", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.INSTANCE.m1421getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.INSTANCE.m1482getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m1709getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m1710getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }
}
