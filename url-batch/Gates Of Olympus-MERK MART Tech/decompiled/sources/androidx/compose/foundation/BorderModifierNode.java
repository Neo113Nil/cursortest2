package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
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
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: Border.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ,\u0010%\u001a\u00020&*\u00020'2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020,H\u0002JC\u0010-\u001a\u00020&*\u00020'2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010(\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0004\b3\u00104J\f\u00105\u001a\u000206*\u000207H\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "widthParameter", "Landroidx/compose/ui/unit/Dp;", "brushParameter", "Landroidx/compose/ui/graphics/Brush;", "shapeParameter", "Landroidx/compose/ui/graphics/Shape;", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "shouldAutoInvalidate", "", "getShouldAutoInvalidate", "()Z", "isImportantForBounds", "borderCache", "Landroidx/compose/foundation/BorderCache;", "value", "width", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "F", "brush", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "shape", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "drawGenericBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "fillArea", "strokeWidth", "", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "applySemantics", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode implements SemanticsModifierNode {
    public static final int $stable = 8;
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private final boolean isImportantForBounds;
    private Shape shape;
    private final boolean shouldAutoInvalidate;
    private float width;

    public /* synthetic */ BorderModifierNode(float f, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, shape);
    }

    private BorderModifierNode(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new Function1() { // from class: androidx.compose.foundation.BorderModifierNode$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DrawResult drawWithCacheModifierNode$lambda$0;
                drawWithCacheModifierNode$lambda$0 = BorderModifierNode.drawWithCacheModifierNode$lambda$0(BorderModifierNode.this, (CacheDrawScope) obj);
                return drawWithCacheModifierNode$lambda$0;
            }
        }));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: isImportantForBounds, reason: from getter */
    public boolean getIsImportantForBounds() {
        return this.isImportantForBounds;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m325setWidth0680j_4(float f) {
        if (Dp.m8232equalsimpl0(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final void setBrush(Brush brush) {
        if (Intrinsics.areEqual(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final void setShape(Shape shape) {
        if (Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
        SemanticsModifierNodeKt.invalidateSemantics(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawWithCacheModifierNode$lambda$0(BorderModifierNode borderModifierNode, CacheDrawScope cacheDrawScope) {
        DrawResult drawContentWithoutBorder;
        DrawResult m318drawRectBorderNsqcLGU;
        if (cacheDrawScope.mo465toPx0680j_4(borderModifierNode.width) < 0.0f || Size.m5216getMinDimensionimpl(cacheDrawScope.m4928getSizeNHjbRc()) <= 0.0f) {
            drawContentWithoutBorder = BorderKt.drawContentWithoutBorder(cacheDrawScope);
            return drawContentWithoutBorder;
        }
        float f = 2;
        float min = Math.min(Dp.m8232equalsimpl0(borderModifierNode.width, Dp.INSTANCE.m8245getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo465toPx0680j_4(borderModifierNode.width)), (float) Math.ceil(Size.m5216getMinDimensionimpl(cacheDrawScope.m4928getSizeNHjbRc()) / f));
        float f2 = min / f;
        long m5140constructorimpl = Offset.m5140constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.m4928getSizeNHjbRc() >> 32)) - min;
        long m5208constructorimpl = Size.m5208constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope.m4928getSizeNHjbRc() & 4294967295L)) - min) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
        boolean z = f * min > Size.m5216getMinDimensionimpl(cacheDrawScope.m4928getSizeNHjbRc());
        Outline mo366createOutlinePq9zytI = borderModifierNode.shape.mo366createOutlinePq9zytI(cacheDrawScope.m4928getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
        if (mo366createOutlinePq9zytI instanceof Outline.Generic) {
            return borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.brush, (Outline.Generic) mo366createOutlinePq9zytI, z, min);
        }
        if (mo366createOutlinePq9zytI instanceof Outline.Rounded) {
            return borderModifierNode.m323drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode.brush, (Outline.Rounded) mo366createOutlinePq9zytI, m5140constructorimpl, m5208constructorimpl, z, min);
        }
        if (mo366createOutlinePq9zytI instanceof Outline.Rectangle) {
            m318drawRectBorderNsqcLGU = BorderKt.m318drawRectBorderNsqcLGU(cacheDrawScope, borderModifierNode.brush, m5140constructorimpl, m5208constructorimpl, z, min);
            return m318drawRectBorderNsqcLGU;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f6, code lost:
    
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m5620equalsimpl(r8, r6 != null ? androidx.compose.ui.graphics.ImageBitmapConfig.m5618boximpl(r6.mo5257getConfig_sVssgQ()) : null) != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0152  */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final DrawResult drawGenericBorder(CacheDrawScope cacheDrawScope, final Brush brush, final Outline.Generic generic, boolean z, float f) {
        int m5626getArgb8888_sVssgQ;
        ColorFilter colorFilter;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        CanvasDrawScope canvasDrawScope;
        CanvasDrawScope canvasDrawScope2;
        float f2;
        float f3;
        float f4;
        float f5;
        CanvasDrawScope canvasDrawScope3;
        DrawContext drawContext;
        long mo5895getSizeNHjbRc;
        DrawContext drawContext2;
        long j;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.BorderModifierNode$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit drawGenericBorder$lambda$0;
                    drawGenericBorder$lambda$0 = BorderModifierNode.drawGenericBorder$lambda$0(Outline.Generic.this, brush, (ContentDrawScope) obj);
                    return drawGenericBorder$lambda$0;
                }
            });
        }
        if (brush instanceof SolidColor) {
            m5626getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m5625getAlpha8_sVssgQ();
            colorFilter = ColorFilter.Companion.m5434tintxETnrds$default(ColorFilter.INSTANCE, Color.m5392copywmQWz5c$default(((SolidColor) brush).getValue(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), 0, 2, null);
        } else {
            m5626getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m5626getArgb8888_sVssgQ();
            colorFilter = null;
        }
        int i = m5626getArgb8888_sVssgQ;
        final Rect bounds = generic.getPath().getBounds();
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        Path obtainPath = borderCache.obtainPath();
        obtainPath.reset();
        Path.addRect$default(obtainPath, bounds, null, 2, null);
        obtainPath.mo5282opN5in7k0(obtainPath, generic.getPath(), PathOperation.INSTANCE.m5701getDifferenceb3I0S0c());
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        final long m8393constructorimpl = IntSize.m8393constructorimpl((((int) Math.ceil(bounds.getBottom() - bounds.getTop())) & 4294967295L) | (((int) Math.ceil(bounds.getRight() - bounds.getLeft())) << 32));
        BorderCache borderCache2 = this.borderCache;
        Intrinsics.checkNotNull(borderCache2);
        ImageBitmap imageBitmap = borderCache2.imageBitmap;
        Canvas canvas = borderCache2.canvas;
        ImageBitmapConfig m5618boximpl = imageBitmap != null ? ImageBitmapConfig.m5618boximpl(imageBitmap.mo5257getConfig_sVssgQ()) : null;
        boolean z2 = false;
        if (!(m5618boximpl == null ? false : ImageBitmapConfig.m5621equalsimpl0(m5618boximpl.m5624unboximpl(), ImageBitmapConfig.INSTANCE.m5626getArgb8888_sVssgQ()))) {
        }
        z2 = true;
        try {
            try {
                try {
                    try {
                        if (imageBitmap == null || canvas == null) {
                            objectRef = objectRef3;
                        } else {
                            objectRef = objectRef3;
                            if (Float.intBitsToFloat((int) (cacheDrawScope.m4928getSizeNHjbRc() >> 32)) <= imageBitmap.getWidth() && Float.intBitsToFloat((int) (cacheDrawScope.m4928getSizeNHjbRc() & 4294967295L)) <= imageBitmap.getHeight() && z2) {
                                objectRef2 = objectRef;
                                ?? r11 = imageBitmap;
                                Canvas canvas2 = canvas;
                                canvasDrawScope = borderCache2.canvasDrawScope;
                                if (canvasDrawScope == null) {
                                    canvasDrawScope = new CanvasDrawScope();
                                    borderCache2.canvasDrawScope = canvasDrawScope;
                                }
                                CanvasDrawScope canvasDrawScope4 = canvasDrawScope;
                                long m8410toSizeozmzZPI = IntSizeKt.m8410toSizeozmzZPI(m8393constructorimpl);
                                LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
                                CanvasDrawScope.DrawParams drawParams = canvasDrawScope4.getDrawParams();
                                final Ref.ObjectRef objectRef4 = objectRef2;
                                Density density = drawParams.getDensity();
                                LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
                                Canvas canvas3 = drawParams.getCanvas();
                                long size = drawParams.getSize();
                                CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope4.getDrawParams();
                                drawParams2.setDensity(cacheDrawScope);
                                drawParams2.setLayoutDirection(layoutDirection);
                                drawParams2.setCanvas(canvas2);
                                drawParams2.m5894setSizeuvyYCjk(m8410toSizeozmzZPI);
                                canvas2.save();
                                canvasDrawScope2 = canvasDrawScope4;
                                DrawScope.m5968drawRectnJ9OG0$default(canvasDrawScope2, Color.INSTANCE.m5419getBlack0d7_KjU(), 0L, m8410toSizeozmzZPI, 0.0f, null, null, BlendMode.INSTANCE.m5306getClear0nO6VwU(), 58, null);
                                f2 = -bounds.getLeft();
                                f3 = -bounds.getTop();
                                canvasDrawScope2.getDrawContext().getTransform().translate(f2, f3);
                                f4 = f2;
                                canvasDrawScope3 = canvasDrawScope2;
                                final ColorFilter colorFilter2 = colorFilter;
                                f5 = f3;
                                DrawScope.m5963drawPathGBMwjPU$default(canvasDrawScope3, generic.getPath(), brush, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                                float f6 = 1;
                                float intBitsToFloat = (Float.intBitsToFloat((int) (canvasDrawScope3.mo5974getSizeNHjbRc() >> 32)) + f6) / Float.intBitsToFloat((int) (canvasDrawScope3.mo5974getSizeNHjbRc() >> 32));
                                float intBitsToFloat2 = (Float.intBitsToFloat((int) (canvasDrawScope3.mo5974getSizeNHjbRc() & 4294967295L)) + f6) / Float.intBitsToFloat((int) (canvasDrawScope3.mo5974getSizeNHjbRc() & 4294967295L));
                                long mo5973getCenterF1C5BW0 = canvasDrawScope3.mo5973getCenterF1C5BW0();
                                drawContext = canvasDrawScope3.getDrawContext();
                                mo5895getSizeNHjbRc = drawContext.mo5895getSizeNHjbRc();
                                drawContext.getCanvas().save();
                                drawContext.getTransform().mo5902scale0AR0LA0(intBitsToFloat, intBitsToFloat2, mo5973getCenterF1C5BW0);
                                j = mo5895getSizeNHjbRc;
                                DrawScope.m5963drawPathGBMwjPU$default(canvasDrawScope3, obtainPath, brush, 0.0f, null, null, BlendMode.INSTANCE.m5306getClear0nO6VwU(), 28, null);
                                drawContext.getCanvas().restore();
                                drawContext.mo5896setSizeuvyYCjk(j);
                                canvasDrawScope3.getDrawContext().getTransform().translate(-f4, -f5);
                                canvas2.restore();
                                CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope4.getDrawParams();
                                drawParams3.setDensity(density);
                                drawParams3.setLayoutDirection(layoutDirection2);
                                drawParams3.setCanvas(canvas3);
                                drawParams3.m5894setSizeuvyYCjk(size);
                                r11.prepareToDraw();
                                objectRef4.element = r11;
                                return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.BorderModifierNode$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit drawGenericBorder$lambda$3;
                                        drawGenericBorder$lambda$3 = BorderModifierNode.drawGenericBorder$lambda$3(Rect.this, objectRef4, m8393constructorimpl, colorFilter2, (ContentDrawScope) obj);
                                        return drawGenericBorder$lambda$3;
                                    }
                                });
                            }
                        }
                        DrawScope.m5963drawPathGBMwjPU$default(canvasDrawScope3, obtainPath, brush, 0.0f, null, null, BlendMode.INSTANCE.m5306getClear0nO6VwU(), 28, null);
                        drawContext.getCanvas().restore();
                        drawContext.mo5896setSizeuvyYCjk(j);
                        canvasDrawScope3.getDrawContext().getTransform().translate(-f4, -f5);
                        canvas2.restore();
                        CanvasDrawScope.DrawParams drawParams32 = canvasDrawScope4.getDrawParams();
                        drawParams32.setDensity(density);
                        drawParams32.setLayoutDirection(layoutDirection2);
                        drawParams32.setCanvas(canvas3);
                        drawParams32.m5894setSizeuvyYCjk(size);
                        r11.prepareToDraw();
                        objectRef4.element = r11;
                        return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.BorderModifierNode$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit drawGenericBorder$lambda$3;
                                drawGenericBorder$lambda$3 = BorderModifierNode.drawGenericBorder$lambda$3(Rect.this, objectRef4, m8393constructorimpl, colorFilter2, (ContentDrawScope) obj);
                                return drawGenericBorder$lambda$3;
                            }
                        });
                    } catch (Throwable th) {
                        th = th;
                        drawContext2 = drawContext;
                        drawContext2.getCanvas().restore();
                        drawContext2.mo5896setSizeuvyYCjk(j);
                        throw th;
                    }
                    drawContext.getTransform().mo5902scale0AR0LA0(intBitsToFloat, intBitsToFloat2, mo5973getCenterF1C5BW0);
                    j = mo5895getSizeNHjbRc;
                } catch (Throwable th2) {
                    th = th2;
                    drawContext2 = drawContext;
                    j = mo5895getSizeNHjbRc;
                }
                DrawScope.m5963drawPathGBMwjPU$default(canvasDrawScope3, generic.getPath(), brush, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                float f62 = 1;
                float intBitsToFloat3 = (Float.intBitsToFloat((int) (canvasDrawScope3.mo5974getSizeNHjbRc() >> 32)) + f62) / Float.intBitsToFloat((int) (canvasDrawScope3.mo5974getSizeNHjbRc() >> 32));
                float intBitsToFloat22 = (Float.intBitsToFloat((int) (canvasDrawScope3.mo5974getSizeNHjbRc() & 4294967295L)) + f62) / Float.intBitsToFloat((int) (canvasDrawScope3.mo5974getSizeNHjbRc() & 4294967295L));
                long mo5973getCenterF1C5BW02 = canvasDrawScope3.mo5973getCenterF1C5BW0();
                drawContext = canvasDrawScope3.getDrawContext();
                mo5895getSizeNHjbRc = drawContext.mo5895getSizeNHjbRc();
                drawContext.getCanvas().save();
            } catch (Throwable th3) {
                th = th3;
                canvasDrawScope3.getDrawContext().getTransform().translate(-f4, -f5);
                throw th;
            }
            f4 = f2;
            canvasDrawScope3 = canvasDrawScope2;
            final ColorFilter colorFilter22 = colorFilter;
            f5 = f3;
        } catch (Throwable th4) {
            th = th4;
            f4 = f2;
            f5 = f3;
            canvasDrawScope3 = canvasDrawScope2;
        }
        objectRef2 = objectRef;
        imageBitmap = ImageBitmapKt.m5631ImageBitmapx__hDU$default((int) (m8393constructorimpl >> 32), (int) (m8393constructorimpl & 4294967295L), i, false, null, 24, null);
        borderCache2.imageBitmap = imageBitmap;
        canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmap);
        borderCache2.canvas = canvas;
        ?? r112 = imageBitmap;
        Canvas canvas22 = canvas;
        canvasDrawScope = borderCache2.canvasDrawScope;
        if (canvasDrawScope == null) {
        }
        CanvasDrawScope canvasDrawScope42 = canvasDrawScope;
        long m8410toSizeozmzZPI2 = IntSizeKt.m8410toSizeozmzZPI(m8393constructorimpl);
        LayoutDirection layoutDirection3 = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams4 = canvasDrawScope42.getDrawParams();
        final Ref.ObjectRef objectRef42 = objectRef2;
        Density density2 = drawParams4.getDensity();
        LayoutDirection layoutDirection22 = drawParams4.getLayoutDirection();
        Canvas canvas32 = drawParams4.getCanvas();
        long size2 = drawParams4.getSize();
        CanvasDrawScope.DrawParams drawParams22 = canvasDrawScope42.getDrawParams();
        drawParams22.setDensity(cacheDrawScope);
        drawParams22.setLayoutDirection(layoutDirection3);
        drawParams22.setCanvas(canvas22);
        drawParams22.m5894setSizeuvyYCjk(m8410toSizeozmzZPI2);
        canvas22.save();
        canvasDrawScope2 = canvasDrawScope42;
        DrawScope.m5968drawRectnJ9OG0$default(canvasDrawScope2, Color.INSTANCE.m5419getBlack0d7_KjU(), 0L, m8410toSizeozmzZPI2, 0.0f, null, null, BlendMode.INSTANCE.m5306getClear0nO6VwU(), 58, null);
        f2 = -bounds.getLeft();
        f3 = -bounds.getTop();
        canvasDrawScope2.getDrawContext().getTransform().translate(f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawGenericBorder$lambda$0(Outline.Generic generic, Brush brush, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        DrawScope.m5963drawPathGBMwjPU$default(contentDrawScope, generic.getPath(), brush, 0.0f, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawGenericBorder$lambda$3(Rect rect, Ref.ObjectRef objectRef, long j, ColorFilter colorFilter, ContentDrawScope contentDrawScope) {
        float f;
        contentDrawScope.drawContent();
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        float left = rect.getLeft();
        float top = rect.getTop();
        contentDrawScope2.getDrawContext().getTransform().translate(left, top);
        try {
        } catch (Throwable th) {
            th = th;
            f = top;
        }
        try {
            DrawScope.m5957drawImageAZ2fEMs$default(contentDrawScope2, (ImageBitmap) objectRef.element, 0L, j, 0L, 0L, 0.0f, null, colorFilter, 0, 0, 890, null);
            contentDrawScope2.getDrawContext().getTransform().translate(-left, -top);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            left = left;
            f = top;
            contentDrawScope2.getDrawContext().getTransform().translate(-left, -f);
            throw th;
        }
    }

    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    private final DrawResult m323drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        final Path createRoundRectPath;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long m5198getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m5198getTopLeftCornerRadiuskKHJgLs();
            final float f2 = f / 2;
            final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.BorderModifierNode$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit drawRoundRectBorder_JqoCqck$lambda$0;
                    drawRoundRectBorder_JqoCqck$lambda$0 = BorderModifierNode.drawRoundRectBorder_JqoCqck$lambda$0(z, brush, m5198getTopLeftCornerRadiuskKHJgLs, f2, f, j, j2, stroke, (ContentDrawScope) obj);
                    return drawRoundRectBorder_JqoCqck$lambda$0;
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        createRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.foundation.BorderModifierNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit drawRoundRectBorder_JqoCqck$lambda$1;
                drawRoundRectBorder_JqoCqck$lambda$1 = BorderModifierNode.drawRoundRectBorder_JqoCqck$lambda$1(Path.this, brush, (ContentDrawScope) obj);
                return drawRoundRectBorder_JqoCqck$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawRoundRectBorder_JqoCqck$lambda$0(boolean z, Brush brush, long j, float f, float f2, long j2, long j3, Stroke stroke, ContentDrawScope contentDrawScope) {
        long m319shrinkKibmq7A;
        contentDrawScope.drawContent();
        if (z) {
            DrawScope.m5969drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, j, 0.0f, null, null, 0, 246, null);
        } else if (Float.intBitsToFloat((int) (j >> 32)) >= f) {
            m319shrinkKibmq7A = BorderKt.m319shrinkKibmq7A(j, f);
            DrawScope.m5969drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j2, j3, m319shrinkKibmq7A, 0.0f, stroke, null, 0, 208, null);
        } else {
            ContentDrawScope contentDrawScope2 = contentDrawScope;
            float intBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo5974getSizeNHjbRc() >> 32)) - f2;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo5974getSizeNHjbRc() & 4294967295L)) - f2;
            int m5381getDifferencertfAjoo = ClipOp.INSTANCE.m5381getDifferencertfAjoo();
            DrawContext drawContext = contentDrawScope2.getDrawContext();
            long mo5895getSizeNHjbRc = drawContext.mo5895getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo5898clipRectN_I0leg(f2, f2, intBitsToFloat, intBitsToFloat2, m5381getDifferencertfAjoo);
                DrawScope.m5969drawRoundRectZuiqVtQ$default(contentDrawScope2, brush, 0L, 0L, j, 0.0f, null, null, 0, 246, null);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo5896setSizeuvyYCjk(mo5895getSizeNHjbRc);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit drawRoundRectBorder_JqoCqck$lambda$1(Path path, Brush brush, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        DrawScope.m5963drawPathGBMwjPU$default(contentDrawScope, path, brush, 0.0f, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, this.shape);
    }
}
