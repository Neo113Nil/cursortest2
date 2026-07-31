package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RenderNodeApi23.android.kt */
@RequiresApi
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b3\b\u0001\u0018\u0000 \u0084\u00012\u00020\u0001:\u0002\u0084\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ5\u0010$\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010\u001bR\"\u0010\u0013\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u00106\u001a\u0004\b:\u00108\"\u0004\b;\u0010\u001bR\"\u0010\u0014\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010\u001bR\"\u0010\u0015\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u00106\u001a\u0004\b>\u00108\"\u0004\b?\u0010\u001bR$\u0010A\u001a\u0004\u0018\u00010@8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010H\u001a\u00020\u00162\u0006\u0010G\u001a\u00020\u00168\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u00108R\u0014\u0010Q\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u00108R$\u0010W\u001a\u00020R2\u0006\u0010G\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010Z\u001a\u00020R2\u0006\u0010G\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bX\u0010T\"\u0004\bY\u0010VR$\u0010]\u001a\u00020R2\u0006\u0010G\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b[\u0010T\"\u0004\b\\\u0010VR$\u0010`\u001a\u00020R2\u0006\u0010G\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b^\u0010T\"\u0004\b_\u0010VR$\u0010c\u001a\u00020R2\u0006\u0010G\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\ba\u0010T\"\u0004\bb\u0010VR$\u0010f\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bd\u00108\"\u0004\be\u0010\u001bR$\u0010i\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bg\u00108\"\u0004\bh\u0010\u001bR$\u0010l\u001a\u00020R2\u0006\u0010G\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bj\u0010T\"\u0004\bk\u0010VR$\u0010o\u001a\u00020R2\u0006\u0010G\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bm\u0010T\"\u0004\bn\u0010VR$\u0010r\u001a\u00020R2\u0006\u0010G\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bp\u0010T\"\u0004\bq\u0010VR$\u0010u\u001a\u00020R2\u0006\u0010G\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bs\u0010T\"\u0004\bt\u0010VR$\u0010x\u001a\u00020R2\u0006\u0010G\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bv\u0010T\"\u0004\bw\u0010VR$\u0010{\u001a\u00020R2\u0006\u0010G\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\by\u0010T\"\u0004\bz\u0010VR$\u0010~\u001a\u00020\u00162\u0006\u0010G\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b|\u0010K\"\u0004\b}\u0010MR&\u0010\u0081\u0001\u001a\u00020R2\u0006\u0010G\u001a\u00020R8V@VX\u0096\u000e¢\u0006\r\u001a\u0004\b\u007f\u0010T\"\u0005\b\u0080\u0001\u0010VR\u0016\u0010\u0083\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010K¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "discardDisplayListInternal", "()V", "Landroid/view/RenderNode;", "renderNode", "verifyShadowColorProperties", "(Landroid/view/RenderNode;)V", "Landroid/graphics/Outline;", "outline", "setOutline", "(Landroid/graphics/Outline;)V", "", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "", "setPosition", "(IIII)Z", "offset", "offsetLeftAndRight", "(I)V", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "record", "(Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "drawInto", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "setHasOverlappingRendering", "(Z)Z", "discardDisplayList", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/RenderNode;", "I", "getLeft", "()I", "setLeft", "getTop", "setTop", "getRight", "setRight", "getBottom", "setBottom", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "value", "clipToBounds", "Z", "getClipToBounds", "()Z", "setClipToBounds", "(Z)V", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getAmbientShadowColor", "setAmbientShadowColor", "ambientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "setClipToOutline", "clipToOutline", "getAlpha", "setAlpha", "alpha", "getHasDisplayList", "hasDisplayList", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RenderNodeApi23 implements DeviceRenderNode {
    private static boolean needToValidateAccess = true;
    private static boolean testFailCreateRenderNode;
    private int bottom;
    private boolean clipToBounds;
    private int left;
    private final AndroidComposeView ownerView;
    private RenderEffect renderEffect;
    private final RenderNode renderNode;
    private int right;
    private int top;

    public RenderNodeApi23(AndroidComposeView ownerView) {
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        this.ownerView = ownerView;
        RenderNode create = RenderNode.create("Compose", ownerView);
        Intrinsics.checkNotNullExpressionValue(create, "create(\"Compose\", ownerView)");
        this.renderNode = create;
        if (needToValidateAccess) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            verifyShadowColorProperties(create);
            discardDisplayListInternal();
            needToValidateAccess = false;
        }
        if (testFailCreateRenderNode) {
            throw new NoClassDefFoundError();
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.left;
    }

    public void setLeft(int i) {
        this.left = i;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getTop() {
        return this.top;
    }

    public void setTop(int i) {
        this.top = i;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getRight() {
        return this.right;
    }

    public void setRight(int i) {
        this.right = i;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.bottom;
    }

    public void setBottom(int i) {
        this.bottom = i;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return getRight() - getLeft();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleX(float f) {
        this.renderNode.setScaleX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleY(float f) {
        this.renderNode.setScaleY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationX(float f) {
        this.renderNode.setTranslationX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationY(float f) {
        this.renderNode.setTranslationY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getElevation() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setElevation(float f) {
        this.renderNode.setElevation(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(this.renderNode, i);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setSpotShadowColor(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(this.renderNode, i);
        }
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationZ(float f) {
        this.renderNode.setRotation(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationX(float f) {
        this.renderNode.setRotationX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationY(float f) {
        this.renderNode.setRotationY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f) {
        this.renderNode.setCameraDistance(-f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotX(float f) {
        this.renderNode.setPivotX(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotY(float f) {
        this.renderNode.setPivotY(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z) {
        this.renderNode.setClipToOutline(z);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z) {
        this.clipToBounds = z;
        this.renderNode.setClipToBounds(z);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public float getAlpha() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setAlpha(float f) {
        this.renderNode.setAlpha(f);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void setOutline(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setPosition(int left, int top, int right, int bottom) {
        setLeft(left);
        setTop(top);
        setRight(right);
        setBottom(bottom);
        return this.renderNode.setLeftTopRightBottom(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int offset) {
        setLeft(getLeft() + offset);
        setRight(getRight() + offset);
        this.renderNode.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int offset) {
        setTop(getTop() + offset);
        setBottom(getBottom() + offset);
        this.renderNode.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void record(CanvasHolder canvasHolder, Path clipPath, Function1 drawBlock) {
        Intrinsics.checkNotNullParameter(canvasHolder, "canvasHolder");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        DisplayListCanvas start = this.renderNode.start(getWidth(), getHeight());
        Intrinsics.checkNotNullExpressionValue(start, "renderNode.start(width, height)");
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas((Canvas) start);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (clipPath != null) {
            androidCanvas.save();
            androidx.compose.ui.graphics.Canvas.m1429clipPathmtrdDE$default(androidCanvas, clipPath, 0, 2, null);
        }
        drawBlock.invoke(androidCanvas);
        if (clipPath != null) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.renderNode.end(start);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void getMatrix(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.renderNode.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void drawInto(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean hasOverlappingRendering) {
        return this.renderNode.setHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override // androidx.compose.ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        discardDisplayListInternal();
    }

    private final void discardDisplayListInternal() {
        RenderNodeVerificationHelper24.INSTANCE.discardDisplayList(this.renderNode);
    }

    private final void verifyShadowColorProperties(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = RenderNodeVerificationHelper28.INSTANCE;
            renderNodeVerificationHelper28.setAmbientShadowColor(renderNode, renderNodeVerificationHelper28.getAmbientShadowColor(renderNode));
            renderNodeVerificationHelper28.setSpotShadowColor(renderNode, renderNodeVerificationHelper28.getSpotShadowColor(renderNode));
        }
    }
}
