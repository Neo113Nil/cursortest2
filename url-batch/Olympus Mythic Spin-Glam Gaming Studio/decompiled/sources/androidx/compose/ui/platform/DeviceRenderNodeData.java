package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.RenderEffect;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceRenderNode.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0007R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0007R\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0007R\u0017\u0010\u001c\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0007R\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\"\u0010(\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\"\u0010+\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R\"\u0010.\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\"\u00101\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0012\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u00104R\"\u00105\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0012\u001a\u0004\b6\u0010\u0007\"\u0004\b7\u00104R\"\u00108\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010 \u001a\u0004\b9\u0010\"\"\u0004\b:\u0010$R\"\u0010;\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010 \u001a\u0004\b<\u0010\"\"\u0004\b=\u0010$R\"\u0010>\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010 \u001a\u0004\b?\u0010\"\"\u0004\b@\u0010$R\"\u0010A\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010 \u001a\u0004\bB\u0010\"\"\u0004\bC\u0010$R\"\u0010D\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010 \u001a\u0004\bE\u0010\"\"\u0004\bF\u0010$R\"\u0010G\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010 \u001a\u0004\bH\u0010\"\"\u0004\bI\u0010$R\"\u0010J\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010P\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR\"\u0010S\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010 \u001a\u0004\bT\u0010\"\"\u0004\bU\u0010$R$\u0010W\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\¨\u0006]"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNodeData;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "uniqueId", "J", "getUniqueId", "()J", "left", "I", "getLeft", ViewHierarchyConstants.DIMENSION_TOP_KEY, "getTop", "right", "getRight", "bottom", "getBottom", "width", "getWidth", "height", "getHeight", "", "scaleX", "F", "getScaleX", "()F", "setScaleX", "(F)V", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "elevation", "getElevation", "setElevation", "ambientShadowColor", "getAmbientShadowColor", "setAmbientShadowColor", "(I)V", "spotShadowColor", "getSpotShadowColor", "setSpotShadowColor", "rotationZ", "getRotationZ", "setRotationZ", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "cameraDistance", "getCameraDistance", "setCameraDistance", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "clipToOutline", "Z", "getClipToOutline", "()Z", "setClipToOutline", "(Z)V", "clipToBounds", "getClipToBounds", "setClipToBounds", "alpha", "getAlpha", "setAlpha", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeviceRenderNodeData {
    private float alpha;
    private int ambientShadowColor;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) other;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Intrinsics.areEqual((Object) Float.valueOf(this.scaleX), (Object) Float.valueOf(deviceRenderNodeData.scaleX)) && Intrinsics.areEqual((Object) Float.valueOf(this.scaleY), (Object) Float.valueOf(deviceRenderNodeData.scaleY)) && Intrinsics.areEqual((Object) Float.valueOf(this.translationX), (Object) Float.valueOf(deviceRenderNodeData.translationX)) && Intrinsics.areEqual((Object) Float.valueOf(this.translationY), (Object) Float.valueOf(deviceRenderNodeData.translationY)) && Intrinsics.areEqual((Object) Float.valueOf(this.elevation), (Object) Float.valueOf(deviceRenderNodeData.elevation)) && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Intrinsics.areEqual((Object) Float.valueOf(this.rotationZ), (Object) Float.valueOf(deviceRenderNodeData.rotationZ)) && Intrinsics.areEqual((Object) Float.valueOf(this.rotationX), (Object) Float.valueOf(deviceRenderNodeData.rotationX)) && Intrinsics.areEqual((Object) Float.valueOf(this.rotationY), (Object) Float.valueOf(deviceRenderNodeData.rotationY)) && Intrinsics.areEqual((Object) Float.valueOf(this.cameraDistance), (Object) Float.valueOf(deviceRenderNodeData.cameraDistance)) && Intrinsics.areEqual((Object) Float.valueOf(this.pivotX), (Object) Float.valueOf(deviceRenderNodeData.pivotX)) && Intrinsics.areEqual((Object) Float.valueOf(this.pivotY), (Object) Float.valueOf(deviceRenderNodeData.pivotY)) && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Intrinsics.areEqual((Object) Float.valueOf(this.alpha), (Object) Float.valueOf(deviceRenderNodeData.alpha)) && Intrinsics.areEqual(this.renderEffect, deviceRenderNodeData.renderEffect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((Long.hashCode(this.uniqueId) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.elevation)) * 31) + Integer.hashCode(this.ambientShadowColor)) * 31) + Integer.hashCode(this.spotShadowColor)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31;
        boolean z = this.clipToOutline;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.clipToBounds;
        int hashCode2 = (((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Float.hashCode(this.alpha)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        return hashCode2 + (renderEffect == null ? 0 : renderEffect.hashCode());
    }

    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ')';
    }
}
