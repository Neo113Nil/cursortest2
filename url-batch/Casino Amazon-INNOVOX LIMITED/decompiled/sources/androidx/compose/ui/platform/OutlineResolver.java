package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: OutlineResolver.android.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u0018\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\u00020.2\u0006\u0010&\u001a\u00020\u001eø\u0001\u0000¢\u0006\u0004\b6\u00107J6\u00105\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%2\u0006\u00108\u001a\u00020#2\u0006\u0010-\u001a\u00020\u00062\u0006\u00109\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003J\b\u0010:\u001a\u00020.H\u0002J\u0010\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u00020\rH\u0002J\u0010\u0010=\u001a\u00020.2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020.2\u0006\u0010A\u001a\u00020*H\u0002J0\u0010B\u001a\u00020\u0006*\u0004\u0018\u00010*2\u0006\u0010C\u001a\u00020!2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020#H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010FR\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\tR\u000e\u0010\u001b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\u00020\u001eX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001fR\u0016\u0010 \u001a\u00020!X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\u00020\u001eX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001fR\u0010\u0010'\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "<set-?>", "", "cacheIsDirty", "getCacheIsDirty$ui_release", "()Z", "cachedOutline", "Landroid/graphics/Outline;", "cachedRrectPath", "Landroidx/compose/ui/graphics/Path;", "calculatedOutline", "Landroidx/compose/ui/graphics/Outline;", "clipPath", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "isSupportedOutline", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "outline", "getOutline", "()Landroid/graphics/Outline;", "outlineClipSupported", "getOutlineClipSupported", "outlineNeeded", "outlinePath", "rectSize", "Landroidx/compose/ui/geometry/Size;", "J", "rectTopLeft", "Landroidx/compose/ui/geometry/Offset;", "roundedCornerRadius", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "size", "tmpOpPath", "tmpPath", "tmpRoundRect", "Landroidx/compose/ui/geometry/RoundRect;", "tmpTouchPointPath", "usePathForClip", "clipToOutline", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "isInOutline", ViewProps.POSITION, "isInOutline-k-4lQ0M", "(J)Z", "update", "update-uvyYCjk", "(J)V", "alpha", "elevation", "updateCache", "updateCacheWithPath", "composePath", "updateCacheWithRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "updateCacheWithRoundRect", "roundRect", "isSameBounds", TypedValues.Cycle.S_WAVE_OFFSET, "radius", "isSameBounds-4L21HEs", "(Landroidx/compose/ui/geometry/RoundRect;JJF)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlineResolver {
    public static final int $stable = 8;
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private Path cachedRrectPath;
    private androidx.compose.ui.graphics.Outline calculatedOutline;
    private Density density;
    private boolean isSupportedOutline = true;
    private LayoutDirection layoutDirection;
    private boolean outlineNeeded;
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private Shape shape;
    private long size;
    private Path tmpOpPath;
    private Path tmpPath;
    private RoundRect tmpRoundRect;
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver(Density density) {
        this.density = density;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.size = Size.INSTANCE.m371getZeroNHjbRc();
        this.shape = RectangleShapeKt.getRectangleShape();
        this.rectTopLeft = Offset.INSTANCE.m309getZeroF1C5BW0();
        this.rectSize = Size.INSTANCE.m371getZeroNHjbRc();
        this.layoutDirection = LayoutDirection.Ltr;
    }

    /* renamed from: getCacheIsDirty$ui_release, reason: from getter */
    public final boolean getCacheIsDirty() {
        return this.cacheIsDirty;
    }

    public final Outline getOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    public final boolean update(Shape shape, float alpha, boolean clipToOutline, float elevation, LayoutDirection layoutDirection, Density density) {
        this.cachedOutline.setAlpha(alpha);
        boolean areEqual = Intrinsics.areEqual(this.shape, shape);
        boolean z = !areEqual;
        if (!areEqual) {
            this.shape = shape;
            this.cacheIsDirty = true;
        }
        boolean z2 = clipToOutline || elevation > 0.0f;
        if (this.outlineNeeded != z2) {
            this.outlineNeeded = z2;
            this.cacheIsDirty = true;
        }
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            this.cacheIsDirty = true;
        }
        if (!Intrinsics.areEqual(this.density, density)) {
            this.density = density;
            this.cacheIsDirty = true;
        }
        return z;
    }

    /* renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m2187isInOutlinek4lQ0M(long position) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.calculatedOutline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Offset.m293getXimpl(position), Offset.m294getYimpl(position), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (m2186isSameBounds4L21HEs(r1, r20.rectTopLeft, r20.rectSize, r6) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void clipToOutline(Canvas canvas) {
        Path clipPath = getClipPath();
        if (clipPath != null) {
            Canvas.m505clipPathmtrdDE$default(canvas, clipPath, 0, 2, null);
            return;
        }
        float f = this.roundedCornerRadius;
        if (f > 0.0f) {
            Path path = this.tmpPath;
            RoundRect roundRect = this.tmpRoundRect;
            OutlineResolver outlineResolver = path != null ? this : this;
            RoundRect m347RoundRectgG7oq9Y = RoundRectKt.m347RoundRectgG7oq9Y(Offset.m293getXimpl(outlineResolver.rectTopLeft), Offset.m294getYimpl(outlineResolver.rectTopLeft), Offset.m293getXimpl(outlineResolver.rectTopLeft) + Size.m362getWidthimpl(outlineResolver.rectSize), Offset.m294getYimpl(outlineResolver.rectTopLeft) + Size.m359getHeightimpl(outlineResolver.rectSize), CornerRadiusKt.CornerRadius$default(outlineResolver.roundedCornerRadius, 0.0f, 2, null));
            if (path == null) {
                path = AndroidPath_androidKt.Path();
            } else {
                path.reset();
            }
            path.addRoundRect(m347RoundRectgG7oq9Y);
            outlineResolver.tmpRoundRect = m347RoundRectgG7oq9Y;
            outlineResolver.tmpPath = path;
            Canvas.m505clipPathmtrdDE$default(canvas, path, 0, 2, null);
            return;
        }
        Canvas.m506clipRectN_I0leg$default(canvas, Offset.m293getXimpl(this.rectTopLeft), Offset.m294getYimpl(this.rectTopLeft), Size.m362getWidthimpl(this.rectSize) + Offset.m293getXimpl(this.rectTopLeft), Size.m359getHeightimpl(this.rectSize) + Offset.m294getYimpl(this.rectTopLeft), 0, 16, null);
    }

    /* renamed from: update-uvyYCjk, reason: not valid java name */
    public final void m2188updateuvyYCjk(long size) {
        if (Size.m358equalsimpl0(this.size, size)) {
            return;
        }
        this.size = size;
        this.cacheIsDirty = true;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.INSTANCE.m309getZeroF1C5BW0();
            long j = this.size;
            this.rectSize = j;
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if (this.outlineNeeded && Size.m362getWidthimpl(j) > 0.0f && Size.m359getHeightimpl(this.size) > 0.0f) {
                this.isSupportedOutline = true;
                androidx.compose.ui.graphics.Outline mo842createOutlinePq9zytI = this.shape.mo842createOutlinePq9zytI(this.size, this.layoutDirection, this.density);
                this.calculatedOutline = mo842createOutlinePq9zytI;
                if (mo842createOutlinePq9zytI instanceof Outline.Rectangle) {
                    updateCacheWithRect(((Outline.Rectangle) mo842createOutlinePq9zytI).getRect());
                    return;
                } else if (mo842createOutlinePq9zytI instanceof Outline.Rounded) {
                    updateCacheWithRoundRect(((Outline.Rounded) mo842createOutlinePq9zytI).getRoundRect());
                    return;
                } else {
                    if (mo842createOutlinePq9zytI instanceof Outline.Generic) {
                        updateCacheWithPath(((Outline.Generic) mo842createOutlinePq9zytI).getPath());
                        return;
                    }
                    return;
                }
            }
            this.cachedOutline.setEmpty();
        }
    }

    private final void updateCacheWithRect(Rect rect) {
        this.rectTopLeft = OffsetKt.Offset(rect.getLeft(), rect.getTop());
        this.rectSize = SizeKt.Size(rect.getWidth(), rect.getHeight());
        this.cachedOutline.setRect(MathKt.roundToInt(rect.getLeft()), MathKt.roundToInt(rect.getTop()), MathKt.roundToInt(rect.getRight()), MathKt.roundToInt(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float m268getXimpl = CornerRadius.m268getXimpl(roundRect.m343getTopLeftCornerRadiuskKHJgLs());
        this.rectTopLeft = OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
        this.rectSize = SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
        if (RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(MathKt.roundToInt(roundRect.getLeft()), MathKt.roundToInt(roundRect.getTop()), MathKt.roundToInt(roundRect.getRight()), MathKt.roundToInt(roundRect.getBottom()), m268getXimpl);
            this.roundedCornerRadius = m268getXimpl;
            return;
        }
        Path path = this.cachedRrectPath;
        if (path == null) {
            path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = path;
        }
        path.reset();
        path.addRoundRect(roundRect);
        updateCacheWithPath(path);
    }

    private final void updateCacheWithPath(Path composePath) {
        if (Build.VERSION.SDK_INT > 28 || composePath.isConvex()) {
            android.graphics.Outline outline = this.cachedOutline;
            if (composePath instanceof AndroidPath) {
                outline.setConvexPath(((AndroidPath) composePath).getInternalPath());
                this.usePathForClip = !this.cachedOutline.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = composePath;
    }

    /* renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m2186isSameBounds4L21HEs(RoundRect roundRect, long j, long j2, float f) {
        return roundRect != null && RoundRectKt.isSimple(roundRect) && roundRect.getLeft() == Offset.m293getXimpl(j) && roundRect.getTop() == Offset.m294getYimpl(j) && roundRect.getRight() == Offset.m293getXimpl(j) + Size.m362getWidthimpl(j2) && roundRect.getBottom() == Offset.m294getYimpl(j) + Size.m359getHeightimpl(j2) && CornerRadius.m268getXimpl(roundRect.m343getTopLeftCornerRadiuskKHJgLs()) == f;
    }
}
