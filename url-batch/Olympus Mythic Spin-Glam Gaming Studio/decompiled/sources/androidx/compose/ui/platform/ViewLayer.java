package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewLayer.android.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 w2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002wxB7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\u0010\u000eJ\b\u00106\u001a\u00020\u000bH\u0016J\u0010\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u000209H\u0014J\u0010\u0010:\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\nH\u0016J\b\u0010;\u001a\u00020\u000bH\u0016J\b\u0010<\u001a\u00020\u000bH\u0016J\u001d\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020?H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u001bH\u0016J%\u0010F\u001a\u00020?2\u0006\u0010G\u001a\u00020?2\u0006\u0010E\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010IJ\u001d\u0010J\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020KH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ0\u0010N\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020Q2\u0006\u0010T\u001a\u00020QH\u0014J\b\u0010U\u001a\u00020\u000bH\u0002J\u001d\u0010V\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020XH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bY\u0010MJ*\u0010Z\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016J\b\u0010[\u001a\u00020\u000bH\u0016J§\u0001\u0010\\\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020\u00102\u0006\u0010^\u001a\u00020\u00102\u0006\u0010_\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u00102\u0006\u0010a\u001a\u00020\u00102\u0006\u0010b\u001a\u00020\u00102\u0006\u0010c\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\u00102\u0006\u0010e\u001a\u00020\u00102\u0006\u0010f\u001a\u00020\u00102\u0006\u0010g\u001a\u00020(2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u001b2\b\u0010k\u001a\u0004\u0018\u00010l2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020n2\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020sH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bt\u0010uJ\b\u0010v\u001a\u00020\u000bH\u0002R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0019\u0010'\u001a\u00020(X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010)R\u0016\u0010*\u001a\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010&\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006y"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "container", "Landroidx/compose/ui/platform/DrawChildContainer;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "invalidateParentLayer", "Lkotlin/Function0;", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "value", "", "cameraDistancePx", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipBoundsCache", "Landroid/graphics/Rect;", "clipToBounds", "", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "drawnWithZ", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "layerId", "", "getLayerId", "()J", "mTransformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "manualClipPath", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "matrixCache", "Landroidx/compose/ui/platform/LayerMatrixCache;", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerViewId", "getOwnerViewId", "destroy", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "drawLayer", "forceLayout", "invalidate", "isInLayer", X3.i.L, "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "onLayout", "changed", "l", "", "t", "r", "b", "resetClipBounds", n.g, "size", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "reuseLayer", "updateDisplayList", "updateLayerProperties", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "spotShadowColor", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "updateLayerProperties-NHXXZp8", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "updateOutlineResolver", "Companion", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    private static boolean hasRetrievedMethod;
    private static Field recreateDisplayList;
    private static boolean shouldUseDispatchDraw;
    private static Method updateDisplayListIfDirtyMethod;
    private final CanvasHolder canvasHolder;
    private Rect clipBoundsCache;
    private boolean clipToBounds;
    private final DrawChildContainer container;
    private Function1 drawBlock;
    private boolean drawnWithZ;
    private Function0 invalidateParentLayer;
    private boolean isInvalidated;
    private long mTransformOrigin;
    private final LayerMatrixCache matrixCache;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Function2 getMatrix = new Function2() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((View) obj, (Matrix) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view, @NotNull Matrix matrix) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            matrix.set(view.getMatrix());
        }
    };
    private static final ViewOutlineProvider OutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            OutlineResolver outlineResolver;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outlineResolver = ((ViewLayer) view).outlineResolver;
            Outline outline2 = outlineResolver.getOutline();
            Intrinsics.checkNotNull(outline2);
            outline.set(outline2);
        }
    };

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @NotNull
    public final DrawChildContainer getContainer() {
        return this.container;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayer(AndroidComposeView ownerView, DrawChildContainer container, Function1 drawBlock, Function0 invalidateParentLayer) {
        super(ownerView.getContext());
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.ownerView = ownerView;
        this.container = container;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.outlineResolver = new OutlineResolver(ownerView.getDensity());
        this.canvasHolder = new CanvasHolder();
        this.matrixCache = new LayerMatrixCache(getMatrix);
        this.mTransformOrigin = TransformOrigin.INSTANCE.m1627getCenterSzJe1aQ();
        setWillNotDraw(false);
        setId(View.generateViewId());
        container.addView(this);
    }

    private final Path getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.getOutlineClipSupported()) {
            return null;
        }
        return this.outlineResolver.getClipPath();
    }

    /* renamed from: isInvalidated, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    public long getLayerId() {
        return getId();
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return UniqueDrawingIdApi29.getUniqueDrawingId(this.ownerView);
        }
        return -1L;
    }

    /* compiled from: ViewLayer.android.kt */
    @RequiresApi
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$UniqueDrawingIdApi29;", "", "()V", "getUniqueDrawingId", "", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
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

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: updateLayerProperties-NHXXZp8 */
    public void mo2072updateLayerPropertiesNHXXZp8(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, Shape shape, boolean clip, RenderEffect renderEffect, long ambientShadowColor, long spotShadowColor, LayoutDirection layoutDirection, Density density) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.mTransformOrigin = transformOrigin;
        setScaleX(scaleX);
        setScaleY(scaleY);
        setAlpha(alpha);
        setTranslationX(translationX);
        setTranslationY(translationY);
        setElevation(shadowElevation);
        setRotation(rotationZ);
        setRotationX(rotationX);
        setRotationY(rotationY);
        setPivotX(TransformOrigin.m1622getPivotFractionXimpl(this.mTransformOrigin) * getWidth());
        setPivotY(TransformOrigin.m1623getPivotFractionYimpl(this.mTransformOrigin) * getHeight());
        setCameraDistancePx(cameraDistance);
        this.clipToBounds = clip && shape == RectangleShapeKt.getRectangleShape();
        resetClipBounds();
        boolean z = getManualClipPath() != null;
        setClipToOutline(clip && shape != RectangleShapeKt.getRectangleShape());
        boolean update = this.outlineResolver.update(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        updateOutlineResolver();
        boolean z2 = getManualClipPath() != null;
        if (z != z2 || (z2 && update)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.mo4828invoke();
        }
        this.matrixCache.invalidate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            ViewLayerVerificationHelper28 viewLayerVerificationHelper28 = ViewLayerVerificationHelper28.INSTANCE;
            viewLayerVerificationHelper28.setOutlineAmbientShadowColor(this, ColorKt.m1471toArgb8_81llA(ambientShadowColor));
            viewLayerVerificationHelper28.setOutlineSpotShadowColor(this, ColorKt.m1471toArgb8_81llA(spotShadowColor));
        }
        if (i >= 31) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this, renderEffect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo2068isInLayerk4lQ0M(long position) {
        float m1297getXimpl = Offset.m1297getXimpl(position);
        float m1298getYimpl = Offset.m1298getYimpl(position);
        if (this.clipToBounds) {
            return 0.0f <= m1297getXimpl && m1297getXimpl < ((float) getWidth()) && 0.0f <= m1298getYimpl && m1298getYimpl < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.m2138isInOutlinek4lQ0M(position);
        }
        return true;
    }

    private final void updateOutlineResolver() {
        setOutlineProvider(this.outlineResolver.getOutline() != null ? OutlineProvider : null);
    }

    private final void resetClipBounds() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.checkNotNull(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo2071resizeozmzZPI(long size) {
        int m2567getWidthimpl = IntSize.m2567getWidthimpl(size);
        int m2566getHeightimpl = IntSize.m2566getHeightimpl(size);
        if (m2567getWidthimpl == getWidth() && m2566getHeightimpl == getHeight()) {
            return;
        }
        float f = m2567getWidthimpl;
        setPivotX(TransformOrigin.m1622getPivotFractionXimpl(this.mTransformOrigin) * f);
        float f2 = m2566getHeightimpl;
        setPivotY(TransformOrigin.m1623getPivotFractionYimpl(this.mTransformOrigin) * f2);
        this.outlineResolver.m2139updateuvyYCjk(SizeKt.Size(f, f2));
        updateOutlineResolver();
        layout(getLeft(), getTop(), getLeft() + m2567getWidthimpl, getTop() + m2566getHeightimpl);
        resetClipBounds();
        this.matrixCache.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo2070movegyyYBs(long position) {
        int m2553getXimpl = IntOffset.m2553getXimpl(position);
        if (m2553getXimpl != getLeft()) {
            offsetLeftAndRight(m2553getXimpl - getLeft());
            this.matrixCache.invalidate();
        }
        int m2554getYimpl = IntOffset.m2554getYimpl(position);
        if (m2554getYimpl != getTop()) {
            offsetTopAndBottom(m2554getYimpl - getTop());
            this.matrixCache.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z = getElevation() > 0.0f;
        this.drawnWithZ = z;
        if (z) {
            canvas.enableZ();
        }
        this.container.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.disableZ();
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        CanvasHolder canvasHolder = this.canvasHolder;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            androidCanvas.save();
            this.outlineResolver.clipToOutline(androidCanvas);
            z = true;
        }
        Function1 function1 = this.drawBlock;
        if (function1 != null) {
            function1.invoke(androidCanvas);
        }
        if (z) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.recycle$ui_release(this);
        this.container.removeViewInLayout(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (!this.isInvalidated || shouldUseDispatchDraw) {
            return;
        }
        setInvalidated(false);
        INSTANCE.updateDisplayList(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo2069mapOffset8S9VItk(long point, boolean inverse) {
        if (inverse) {
            float[] m2122calculateInverseMatrixbWbORWo = this.matrixCache.m2122calculateInverseMatrixbWbORWo(this);
            return m2122calculateInverseMatrixbWbORWo != null ? androidx.compose.ui.graphics.Matrix.m1518mapMKHz9U(m2122calculateInverseMatrixbWbORWo, point) : Offset.INSTANCE.m1306getInfiniteF1C5BW0();
        }
        return androidx.compose.ui.graphics.Matrix.m1518mapMKHz9U(this.matrixCache.m2123calculateMatrixGrdbGEg(this), point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect rect, boolean inverse) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (inverse) {
            float[] m2122calculateInverseMatrixbWbORWo = this.matrixCache.m2122calculateInverseMatrixbWbORWo(this);
            if (m2122calculateInverseMatrixbWbORWo != null) {
                androidx.compose.ui.graphics.Matrix.m1519mapimpl(m2122calculateInverseMatrixbWbORWo, rect);
                return;
            } else {
                rect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
        }
        androidx.compose.ui.graphics.Matrix.m1519mapimpl(this.matrixCache.m2123calculateMatrixGrdbGEg(this), rect);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(Function1 drawBlock, Function0 invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.container.addView(this);
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = TransformOrigin.INSTANCE.m1627getCenterSzJe1aQ();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "updateDisplayList", "(Landroid/view/View;)V", "", "<set-?>", "hasRetrievedMethod", "Z", "getHasRetrievedMethod", "()Z", "shouldUseDispatchDraw", "getShouldUseDispatchDraw", "setShouldUseDispatchDraw$ui_release", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.hasRetrievedMethod;
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.shouldUseDispatchDraw;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z) {
            ViewLayer.shouldUseDispatchDraw = z;
        }

        public final void updateDisplayList(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            try {
                if (!getHasRetrievedMethod()) {
                    ViewLayer.hasRetrievedMethod = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.updateDisplayListIfDirtyMethod = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        ViewLayer.recreateDisplayList = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.updateDisplayListIfDirtyMethod = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.updateDisplayListIfDirtyMethod;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.recreateDisplayList;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.recreateDisplayList;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.updateDisplayListIfDirtyMethod;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
        }
    }
}
