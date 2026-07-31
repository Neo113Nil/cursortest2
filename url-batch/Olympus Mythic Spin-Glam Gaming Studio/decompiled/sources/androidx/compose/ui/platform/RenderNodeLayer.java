package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.X3;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RenderNodeLayer.android.kt */
@RequiresApi
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0002ghB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J§\u0001\u0010.\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u001d\u00103\u001a\u00020!2\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u001d\u00108\u001a\u00020\u00072\u0006\u00105\u001a\u000204H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\u00020\u00072\u0006\u00100\u001a\u000209H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u00107J\u000f\u0010<\u001a\u00020\u0007H\u0016¢\u0006\u0004\b<\u0010\u000eJ\u0017\u0010=\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\u0011J\u000f\u0010>\u001a\u00020\u0007H\u0016¢\u0006\u0004\b>\u0010\u000eJ\u000f\u0010?\u001a\u00020\u0007H\u0016¢\u0006\u0004\b?\u0010\u000eJ%\u0010D\u001a\u00020/2\u0006\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ\u001f\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u00020E2\u0006\u0010A\u001a\u00020!H\u0016¢\u0006\u0004\bG\u0010HJ1\u0010I\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016¢\u0006\u0004\bI\u0010JR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010K\u001a\u0004\bL\u0010MR$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010NR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010OR$\u0010Q\u001a\u00020!2\u0006\u0010P\u001a\u00020!8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010RR\u0016\u0010Y\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010RR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001f\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010dR\u0014\u0010e\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006i"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "triggerRepaint", "()V", "canvas", "clipRenderNode", "(Landroidx/compose/ui/graphics/Canvas;)V", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "updateLayerProperties-NHXXZp8", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "updateLayerProperties", "Landroidx/compose/ui/geometry/Offset;", X3.i.L, "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "(J)V", n.g, "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "invalidate", "drawLayer", "updateDisplayList", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "reuseLayer", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "value", "isDirty", "Z", "setDirty", "(Z)V", "Landroidx/compose/ui/platform/OutlineResolver;", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "isDestroyed", "drawnWithZ", "Landroidx/compose/ui/graphics/Paint;", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "matrixCache", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "J", "renderNode", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Companion", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {
    private static final Function2 getMatrix = new Function2() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((DeviceRenderNode) obj, (Matrix) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull DeviceRenderNode rn, @NotNull Matrix matrix) {
            Intrinsics.checkNotNullParameter(rn, "rn");
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            rn.getMatrix(matrix);
        }
    };
    private final CanvasHolder canvasHolder;
    private Function1 drawBlock;
    private boolean drawnWithZ;
    private Function0 invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private final LayerMatrixCache matrixCache;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;
    private final DeviceRenderNode renderNode;
    private Paint softwareLayerPaint;
    private long transformOrigin;

    public RenderNodeLayer(AndroidComposeView ownerView, Function1 drawBlock, Function0 invalidateParentLayer) {
        DeviceRenderNode renderNodeApi23;
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.ownerView = ownerView;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.outlineResolver = new OutlineResolver(ownerView.getDensity());
        this.matrixCache = new LayerMatrixCache(getMatrix);
        this.canvasHolder = new CanvasHolder();
        this.transformOrigin = TransformOrigin.INSTANCE.m1627getCenterSzJe1aQ();
        if (Build.VERSION.SDK_INT >= 29) {
            renderNodeApi23 = new RenderNodeApi29(ownerView);
        } else {
            renderNodeApi23 = new RenderNodeApi23(ownerView);
        }
        renderNodeApi23.setHasOverlappingRendering(true);
        this.renderNode = renderNodeApi23;
    }

    private final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    /* compiled from: RenderNodeLayer.android.kt */
    @RequiresApi
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29;", "", "()V", "getUniqueDrawingId", "", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class UniqueDrawingIdApi29 {
        public static final UniqueDrawingIdApi29 INSTANCE = new UniqueDrawingIdApi29();

        private UniqueDrawingIdApi29() {
        }

        @DoNotInline
        public static final long getUniqueDrawingId(@NotNull View view) {
            long uniqueDrawingId;
            Intrinsics.checkNotNullParameter(view, "view");
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: updateLayerProperties-NHXXZp8 */
    public void mo2072updateLayerPropertiesNHXXZp8(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, Shape shape, boolean clip, RenderEffect renderEffect, long ambientShadowColor, long spotShadowColor, LayoutDirection layoutDirection, Density density) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.transformOrigin = transformOrigin;
        boolean z = false;
        boolean z2 = this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported();
        this.renderNode.setScaleX(scaleX);
        this.renderNode.setScaleY(scaleY);
        this.renderNode.setAlpha(alpha);
        this.renderNode.setTranslationX(translationX);
        this.renderNode.setTranslationY(translationY);
        this.renderNode.setElevation(shadowElevation);
        this.renderNode.setAmbientShadowColor(ColorKt.m1471toArgb8_81llA(ambientShadowColor));
        this.renderNode.setSpotShadowColor(ColorKt.m1471toArgb8_81llA(spotShadowColor));
        this.renderNode.setRotationZ(rotationZ);
        this.renderNode.setRotationX(rotationX);
        this.renderNode.setRotationY(rotationY);
        this.renderNode.setCameraDistance(cameraDistance);
        this.renderNode.setPivotX(TransformOrigin.m1622getPivotFractionXimpl(transformOrigin) * this.renderNode.getWidth());
        this.renderNode.setPivotY(TransformOrigin.m1623getPivotFractionYimpl(transformOrigin) * this.renderNode.getHeight());
        this.renderNode.setClipToOutline(clip && shape != RectangleShapeKt.getRectangleShape());
        this.renderNode.setClipToBounds(clip && shape == RectangleShapeKt.getRectangleShape());
        this.renderNode.setRenderEffect(renderEffect);
        boolean update = this.outlineResolver.update(shape, this.renderNode.getAlpha(), this.renderNode.getClipToOutline(), this.renderNode.getElevation(), layoutDirection, density);
        this.renderNode.setOutline(this.outlineResolver.getOutline());
        if (this.renderNode.getClipToOutline() && !this.outlineResolver.getOutlineClipSupported()) {
            z = true;
        }
        if (z2 != z || (z && update)) {
            invalidate();
        } else {
            triggerRepaint();
        }
        if (!this.drawnWithZ && this.renderNode.getElevation() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.mo4828invoke();
        }
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo2068isInLayerk4lQ0M(long position) {
        float m1297getXimpl = Offset.m1297getXimpl(position);
        float m1298getYimpl = Offset.m1298getYimpl(position);
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= m1297getXimpl && m1297getXimpl < ((float) this.renderNode.getWidth()) && 0.0f <= m1298getYimpl && m1298getYimpl < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.getClipToOutline()) {
            return this.outlineResolver.m2138isInOutlinek4lQ0M(position);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo2071resizeozmzZPI(long size) {
        int m2567getWidthimpl = IntSize.m2567getWidthimpl(size);
        int m2566getHeightimpl = IntSize.m2566getHeightimpl(size);
        float f = m2567getWidthimpl;
        this.renderNode.setPivotX(TransformOrigin.m1622getPivotFractionXimpl(this.transformOrigin) * f);
        float f2 = m2566getHeightimpl;
        this.renderNode.setPivotY(TransformOrigin.m1623getPivotFractionYimpl(this.transformOrigin) * f2);
        DeviceRenderNode deviceRenderNode = this.renderNode;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + m2567getWidthimpl, this.renderNode.getTop() + m2566getHeightimpl)) {
            this.outlineResolver.m2139updateuvyYCjk(SizeKt.Size(f, f2));
            this.renderNode.setOutline(this.outlineResolver.getOutline());
            invalidate();
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo2070movegyyYBs(long position) {
        int left = this.renderNode.getLeft();
        int top = this.renderNode.getTop();
        int m2553getXimpl = IntOffset.m2553getXimpl(position);
        int m2554getYimpl = IntOffset.m2554getYimpl(position);
        if (left == m2553getXimpl && top == m2554getYimpl) {
            return;
        }
        this.renderNode.offsetLeftAndRight(m2553getXimpl - left);
        this.renderNode.offsetTopAndBottom(m2554getYimpl - top);
        triggerRepaint();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    private final void triggerRepaint() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            boolean z = this.renderNode.getElevation() > 0.0f;
            this.drawnWithZ = z;
            if (z) {
                canvas.enableZ();
            }
            this.renderNode.drawInto(nativeCanvas);
            if (this.drawnWithZ) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = this.renderNode.getLeft();
        float top = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.getAlpha() < 1.0f) {
            Paint paint = this.softwareLayerPaint;
            if (paint == null) {
                paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = paint;
            }
            paint.setAlpha(this.renderNode.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, paint.getInternalPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.mo1348concat58bKbWc(this.matrixCache.m2123calculateMatrixGrdbGEg(this.renderNode));
        clipRenderNode(canvas);
        Function1 function1 = this.drawBlock;
        if (function1 != null) {
            function1.invoke(canvas);
        }
        canvas.restore();
        setDirty(false);
    }

    private final void clipRenderNode(Canvas canvas) {
        if (this.renderNode.getClipToOutline() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.clipToOutline(canvas);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.isDirty || !this.renderNode.getHasDisplayList()) {
            setDirty(false);
            Path clipPath = (!this.renderNode.getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) ? null : this.outlineResolver.getClipPath();
            Function1 function1 = this.drawBlock;
            if (function1 != null) {
                this.renderNode.record(this.canvasHolder, clipPath, function1);
            }
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.getHasDisplayList()) {
            this.renderNode.discardDisplayList();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.requestClearInvalidObservations();
        this.ownerView.recycle$ui_release(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo2069mapOffset8S9VItk(long point, boolean inverse) {
        if (inverse) {
            float[] m2122calculateInverseMatrixbWbORWo = this.matrixCache.m2122calculateInverseMatrixbWbORWo(this.renderNode);
            return m2122calculateInverseMatrixbWbORWo != null ? androidx.compose.ui.graphics.Matrix.m1518mapMKHz9U(m2122calculateInverseMatrixbWbORWo, point) : Offset.INSTANCE.m1306getInfiniteF1C5BW0();
        }
        return androidx.compose.ui.graphics.Matrix.m1518mapMKHz9U(this.matrixCache.m2123calculateMatrixGrdbGEg(this.renderNode), point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect rect, boolean inverse) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (inverse) {
            float[] m2122calculateInverseMatrixbWbORWo = this.matrixCache.m2122calculateInverseMatrixbWbORWo(this.renderNode);
            if (m2122calculateInverseMatrixbWbORWo == null) {
                rect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                androidx.compose.ui.graphics.Matrix.m1519mapimpl(m2122calculateInverseMatrixbWbORWo, rect);
                return;
            }
        }
        androidx.compose.ui.graphics.Matrix.m1519mapimpl(this.matrixCache.m2123calculateMatrixGrdbGEg(this.renderNode), rect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(Function1 drawBlock, Function0 invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = TransformOrigin.INSTANCE.m1627getCenterSzJe1aQ();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }
}
