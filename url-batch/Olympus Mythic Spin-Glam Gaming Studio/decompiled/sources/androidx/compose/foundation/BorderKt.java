package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Border.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0002\u0010\u0005\u001a/\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001aA\u0010\u001b\u001a\u00020\u0011*\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001aW\u0010$\u001a\u00020\u0011*\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001aA\u0010(\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a/\u0010-\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b-\u0010.\u001a\u001f\u00100\u001a\u00020+2\u0006\u0010/\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101\u001a!\u00106\u001a\u000202*\u0002022\u0006\u00103\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/ui/graphics/Shape;", "shape", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/ui/graphics/Brush;", "brush", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/node/Ref;", "Landroidx/compose/foundation/BorderCache;", "obtain", "(Landroidx/compose/ui/node/Ref;)Landroidx/compose/foundation/BorderCache;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "drawContentWithoutBorder", "(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", "borderCacheRef", "Landroidx/compose/ui/graphics/Outline$Generic;", "outline", "", "fillArea", "", "strokeWidth", "drawGenericBorder", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Generic;ZF)Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "borderSize", "drawRoundRectBorder-SYlcjDY", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "drawRoundRectBorder", "strokeWidthPx", "drawRectBorder-NsqcLGU", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;", "drawRectBorder", "Landroidx/compose/ui/graphics/Path;", "targetPath", "Landroidx/compose/ui/geometry/RoundRect;", "roundedRect", "createRoundRectPath", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/RoundRect;FZ)Landroidx/compose/ui/graphics/Path;", "widthPx", "createInsetRoundedRect", "(FLandroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/RoundRect;", "Landroidx/compose/ui/geometry/CornerRadius;", "value", "shrink-Kibmq7A", "(JF)J", "shrink", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BorderKt {
    public static final Modifier border(Modifier modifier, BorderStroke border, Shape shape) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m162borderziNgDLE(modifier, border.getWidth(), border.getBrush(), shape);
    }

    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m162borderziNgDLE(Modifier border, final float f, final Brush brush, final Shape shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return ComposedModifierKt.composed(border, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.BorderKt$border-ziNgDLE$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("border");
                inspectorInfo.getProperties().set("width", Dp.m2505boximpl(f));
                if (brush instanceof SolidColor) {
                    inspectorInfo.getProperties().set("color", Color.m1441boximpl(((SolidColor) brush).getValue()));
                    inspectorInfo.setValue(Color.m1441boximpl(((SolidColor) brush).getValue()));
                } else {
                    inspectorInfo.getProperties().set("brush", brush);
                }
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.foundation.BorderKt$border$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1498088849);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Ref();
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                final Ref ref = (Ref) rememberedValue;
                Modifier.Companion companion = Modifier.INSTANCE;
                final float f2 = f;
                final Shape shape2 = shape;
                final Brush brush2 = brush;
                Modifier then = composed.then(DrawModifierKt.drawWithCache(companion, new Function1() { // from class: androidx.compose.foundation.BorderKt$border$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                        DrawResult drawContentWithoutBorder;
                        DrawResult m163drawRectBorderNsqcLGU;
                        DrawResult m164drawRoundRectBorderSYlcjDY;
                        DrawResult drawGenericBorder;
                        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                        if (drawWithCache.mo271toPx0680j_4(f2) < 0.0f || Size.m1334getMinDimensionimpl(drawWithCache.m1236getSizeNHjbRc()) <= 0.0f) {
                            drawContentWithoutBorder = BorderKt.drawContentWithoutBorder(drawWithCache);
                            return drawContentWithoutBorder;
                        }
                        float f3 = 2;
                        float min = Math.min(Dp.m2509equalsimpl0(f2, Dp.INSTANCE.m2514getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(drawWithCache.mo271toPx0680j_4(f2)), (float) Math.ceil(Size.m1334getMinDimensionimpl(drawWithCache.m1236getSizeNHjbRc()) / f3));
                        float f4 = min / f3;
                        long Offset = OffsetKt.Offset(f4, f4);
                        long Size = SizeKt.Size(Size.m1335getWidthimpl(drawWithCache.m1236getSizeNHjbRc()) - min, Size.m1333getHeightimpl(drawWithCache.m1236getSizeNHjbRc()) - min);
                        boolean z = f3 * min > Size.m1334getMinDimensionimpl(drawWithCache.m1236getSizeNHjbRc());
                        Outline mo184createOutlinePq9zytI = shape2.mo184createOutlinePq9zytI(drawWithCache.m1236getSizeNHjbRc(), drawWithCache.getLayoutDirection(), drawWithCache);
                        if (mo184createOutlinePq9zytI instanceof Outline.Generic) {
                            drawGenericBorder = BorderKt.drawGenericBorder(drawWithCache, ref, brush2, (Outline.Generic) mo184createOutlinePq9zytI, z, min);
                            return drawGenericBorder;
                        }
                        if (mo184createOutlinePq9zytI instanceof Outline.Rounded) {
                            m164drawRoundRectBorderSYlcjDY = BorderKt.m164drawRoundRectBorderSYlcjDY(drawWithCache, ref, brush2, (Outline.Rounded) mo184createOutlinePq9zytI, Offset, Size, z, min);
                            return m164drawRoundRectBorderSYlcjDY;
                        }
                        if (!(mo184createOutlinePq9zytI instanceof Outline.Rectangle)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        m163drawRectBorderNsqcLGU = BorderKt.m163drawRectBorderNsqcLGU(drawWithCache, brush2, Offset, Size, z, min);
                        return m163drawRectBorderNsqcLGU;
                    }
                }));
                composer.endReplaceableGroup();
                return then;
            }
        });
    }

    private static final BorderCache obtain(Ref ref) {
        BorderCache borderCache = (BorderCache) ref.getValue();
        if (borderCache != null) {
            return borderCache;
        }
        BorderCache borderCache2 = new BorderCache(null, null, null, null, 15, null);
        ref.setValue(borderCache2);
        return borderCache2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b7, code lost:
    
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m1501equalsimpl(r13, r4 != null ? androidx.compose.ui.graphics.ImageBitmapConfig.m1499boximpl(r4.mo1356getConfig_sVssgQ()) : null) != false) goto L23;
     */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final DrawResult drawGenericBorder(CacheDrawScope cacheDrawScope, Ref ref, final Brush brush, final Outline.Generic generic, boolean z, float f) {
        int m1507getArgb8888_sVssgQ;
        ColorFilter colorFilter;
        ImageBitmap imageBitmap;
        Canvas canvas;
        ?? r11;
        Canvas canvas2;
        CanvasDrawScope canvasDrawScope;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.BorderKt$drawGenericBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ContentDrawScope) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ContentDrawScope onDrawWithContent) {
                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.drawContent();
                    DrawScope.m1699drawPathGBMwjPU$default(onDrawWithContent, Outline.Generic.this.getPath(), brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        if (brush instanceof SolidColor) {
            m1507getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m1506getAlpha8_sVssgQ();
            colorFilter = ColorFilter.Companion.m1464tintxETnrds$default(ColorFilter.INSTANCE, ((SolidColor) brush).getValue(), 0, 2, null);
        } else {
            m1507getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m1507getArgb8888_sVssgQ();
            colorFilter = null;
        }
        final Rect bounds = generic.getPath().getBounds();
        BorderCache obtain = obtain(ref);
        Path obtainPath = obtain.obtainPath();
        obtainPath.reset();
        obtainPath.addRect(bounds);
        obtainPath.mo1379opN5in7k0(obtainPath, generic.getPath(), PathOperation.INSTANCE.m1556getDifferenceb3I0S0c());
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final long IntSize = IntSizeKt.IntSize((int) Math.ceil(bounds.getWidth()), (int) Math.ceil(bounds.getHeight()));
        imageBitmap = obtain.imageBitmap;
        canvas = obtain.canvas;
        ImageBitmapConfig m1499boximpl = imageBitmap != null ? ImageBitmapConfig.m1499boximpl(imageBitmap.mo1356getConfig_sVssgQ()) : null;
        boolean z2 = false;
        if (!(m1499boximpl == null ? false : ImageBitmapConfig.m1502equalsimpl0(m1499boximpl.getValue(), ImageBitmapConfig.INSTANCE.m1507getArgb8888_sVssgQ()))) {
        }
        z2 = true;
        if (imageBitmap == null || canvas == null || Size.m1335getWidthimpl(cacheDrawScope.m1236getSizeNHjbRc()) > imageBitmap.getWidth() || Size.m1333getHeightimpl(cacheDrawScope.m1236getSizeNHjbRc()) > imageBitmap.getHeight() || !z2) {
            ImageBitmap m1512ImageBitmapx__hDU$default = ImageBitmapKt.m1512ImageBitmapx__hDU$default(IntSize.m2567getWidthimpl(IntSize), IntSize.m2566getHeightimpl(IntSize), m1507getArgb8888_sVssgQ, false, null, 24, null);
            obtain.imageBitmap = m1512ImageBitmapx__hDU$default;
            Canvas Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(m1512ImageBitmapx__hDU$default);
            obtain.canvas = Canvas;
            r11 = m1512ImageBitmapx__hDU$default;
            canvas2 = Canvas;
        } else {
            r11 = imageBitmap;
            canvas2 = canvas;
        }
        canvasDrawScope = obtain.canvasDrawScope;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            obtain.canvasDrawScope = canvasDrawScope;
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        long m2572toSizeozmzZPI = IntSizeKt.m2572toSizeozmzZPI(IntSize);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas3 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas2);
        drawParams2.m1684setSizeuvyYCjk(m2572toSizeozmzZPI);
        canvas2.save();
        long m1456getBlack0d7_KjU = Color.INSTANCE.m1456getBlack0d7_KjU();
        BlendMode.Companion companion = BlendMode.INSTANCE;
        DrawScope.m1703drawRectnJ9OG0$default(canvasDrawScope2, m1456getBlack0d7_KjU, 0L, m2572toSizeozmzZPI, 0.0f, null, null, companion.m1394getClear0nO6VwU(), 58, null);
        float f2 = -bounds.getLeft();
        float f3 = -bounds.getTop();
        canvasDrawScope2.getDrawContext().getTransform().translate(f2, f3);
        DrawScope.m1699drawPathGBMwjPU$default(canvasDrawScope2, generic.getPath(), brush, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        float f4 = 1;
        float m1335getWidthimpl = (Size.m1335getWidthimpl(canvasDrawScope2.mo1708getSizeNHjbRc()) + f4) / Size.m1335getWidthimpl(canvasDrawScope2.mo1708getSizeNHjbRc());
        float m1333getHeightimpl = (Size.m1333getHeightimpl(canvasDrawScope2.mo1708getSizeNHjbRc()) + f4) / Size.m1333getHeightimpl(canvasDrawScope2.mo1708getSizeNHjbRc());
        long mo1707getCenterF1C5BW0 = canvasDrawScope2.mo1707getCenterF1C5BW0();
        DrawContext drawContext = canvasDrawScope2.getDrawContext();
        long mo1685getSizeNHjbRc = drawContext.mo1685getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1691scale0AR0LA0(m1335getWidthimpl, m1333getHeightimpl, mo1707getCenterF1C5BW0);
        DrawScope.m1699drawPathGBMwjPU$default(canvasDrawScope2, obtainPath, brush, 0.0f, null, null, companion.m1394getClear0nO6VwU(), 28, null);
        drawContext.getCanvas().restore();
        drawContext.mo1686setSizeuvyYCjk(mo1685getSizeNHjbRc);
        canvasDrawScope2.getDrawContext().getTransform().translate(-f2, -f3);
        canvas2.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas3);
        drawParams3.m1684setSizeuvyYCjk(size);
        r11.prepareToDraw();
        ref$ObjectRef.element = r11;
        final ColorFilter colorFilter2 = colorFilter;
        return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.BorderKt$drawGenericBorder$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                float left = Rect.this.getLeft();
                float top = Rect.this.getTop();
                Ref$ObjectRef<ImageBitmap> ref$ObjectRef2 = ref$ObjectRef;
                long j = IntSize;
                ColorFilter colorFilter3 = colorFilter2;
                onDrawWithContent.getDrawContext().getTransform().translate(left, top);
                DrawScope.m1695drawImageAZ2fEMs$default(onDrawWithContent, ref$ObjectRef2.element, 0L, j, 0L, 0L, 0.0f, null, colorFilter3, 0, 0, 890, null);
                onDrawWithContent.getDrawContext().getTransform().translate(-left, -top);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-SYlcjDY, reason: not valid java name */
    public static final DrawResult m164drawRoundRectBorderSYlcjDY(CacheDrawScope cacheDrawScope, Ref ref, final Brush brush, Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long topLeftCornerRadius = rounded.getRoundRect().getTopLeftCornerRadius();
            final float f2 = f / 2;
            final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ContentDrawScope) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull ContentDrawScope onDrawWithContent) {
                    long m165shrinkKibmq7A;
                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.drawContent();
                    if (z) {
                        DrawScope.m1704drawRoundRectZuiqVtQ$default(onDrawWithContent, brush, 0L, 0L, topLeftCornerRadius, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float m1282getXimpl = CornerRadius.m1282getXimpl(topLeftCornerRadius);
                    float f3 = f2;
                    if (m1282getXimpl < f3) {
                        float f4 = f;
                        float m1335getWidthimpl = Size.m1335getWidthimpl(onDrawWithContent.mo1708getSizeNHjbRc()) - f;
                        float m1333getHeightimpl = Size.m1333getHeightimpl(onDrawWithContent.mo1708getSizeNHjbRc()) - f;
                        int m1439getDifferencertfAjoo = ClipOp.INSTANCE.m1439getDifferencertfAjoo();
                        Brush brush2 = brush;
                        long j3 = topLeftCornerRadius;
                        DrawContext drawContext = onDrawWithContent.getDrawContext();
                        long mo1685getSizeNHjbRc = drawContext.mo1685getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        drawContext.getTransform().mo1688clipRectN_I0leg(f4, f4, m1335getWidthimpl, m1333getHeightimpl, m1439getDifferencertfAjoo);
                        DrawScope.m1704drawRoundRectZuiqVtQ$default(onDrawWithContent, brush2, 0L, 0L, j3, 0.0f, null, null, 0, 246, null);
                        drawContext.getCanvas().restore();
                        drawContext.mo1686setSizeuvyYCjk(mo1685getSizeNHjbRc);
                        return;
                    }
                    Brush brush3 = brush;
                    long j4 = j;
                    long j5 = j2;
                    m165shrinkKibmq7A = BorderKt.m165shrinkKibmq7A(topLeftCornerRadius, f3);
                    DrawScope.m1704drawRoundRectZuiqVtQ$default(onDrawWithContent, brush3, j4, j5, m165shrinkKibmq7A, 0.0f, stroke, null, 0, 208, null);
                }
            });
        }
        final Path createRoundRectPath = createRoundRectPath(obtain(ref).obtainPath(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                DrawScope.m1699drawPathGBMwjPU$default(onDrawWithContent, Path.this, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m163drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j, long j2, boolean z, float f) {
        final long m1308getZeroF1C5BW0 = z ? Offset.INSTANCE.m1308getZeroF1C5BW0() : j;
        final long m1236getSizeNHjbRc = z ? cacheDrawScope.m1236getSizeNHjbRc() : j2;
        final DrawStyle stroke = z ? Fill.INSTANCE : new Stroke(f, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                DrawScope.m1702drawRectAsUm42w$default(onDrawWithContent, Brush.this, m1308getZeroF1C5BW0, m1236getSizeNHjbRc, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    private static final Path createRoundRectPath(Path path, RoundRect roundRect, float f, boolean z) {
        path.reset();
        path.addRoundRect(roundRect);
        if (!z) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect(createInsetRoundedRect(f, roundRect));
            path.mo1379opN5in7k0(path, Path, PathOperation.INSTANCE.m1556getDifferenceb3I0S0c());
        }
        return path;
    }

    private static final RoundRect createInsetRoundedRect(float f, RoundRect roundRect) {
        return new RoundRect(f, f, roundRect.getWidth() - f, roundRect.getHeight() - f, m165shrinkKibmq7A(roundRect.getTopLeftCornerRadius(), f), m165shrinkKibmq7A(roundRect.getTopRightCornerRadius(), f), m165shrinkKibmq7A(roundRect.getBottomRightCornerRadius(), f), m165shrinkKibmq7A(roundRect.getBottomLeftCornerRadius(), f), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m165shrinkKibmq7A(long j, float f) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m1282getXimpl(j) - f), Math.max(0.0f, CornerRadius.m1283getYimpl(j) - f));
    }
}
