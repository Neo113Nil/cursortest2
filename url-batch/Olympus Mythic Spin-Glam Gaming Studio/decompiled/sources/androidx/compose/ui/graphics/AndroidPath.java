package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.PathOperation;
import com.yandex.div.core.timer.TimerController;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidPath.android.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u001bJ?\u0010#\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010$J?\u0010'\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010$J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J%\u00103\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u00012\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u00020\u000eH\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b6\u00105J\u001d\u00109\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010;J-\u0010B\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020\u00012\u0006\u0010?\u001a\u00020>H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR-\u0010U\u001a\u00020O2\u0006\u0010P\u001a\u00020O8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010V\u001a\u00020\b8VX\u0096\u0004¢\u0006\f\u0012\u0004\bX\u00105\u001a\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010W\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPath;", "Landroidx/compose/ui/graphics/Path;", "Landroid/graphics/Path;", "internalPath", "<init>", "(Landroid/graphics/Path;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "_rectIsValid", "(Landroidx/compose/ui/geometry/Rect;)Z", "", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "", "moveTo", "(FF)V", "dx", "dy", "relativeMoveTo", "lineTo", "relativeLineTo", "x1", "y1", "x2", "y2", "quadraticBezierTo", "(FFFF)V", "dx1", "dy1", "dx2", "dy2", "relativeQuadraticBezierTo", "x3", "y3", "cubicTo", "(FFFFFF)V", "dx3", "dy3", "relativeCubicTo", "addRect", "(Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "addRoundRect", "(Landroidx/compose/ui/geometry/RoundRect;)V", "path", "Landroidx/compose/ui/geometry/Offset;", "offset", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addPath", "close", "()V", TimerController.RESET_COMMAND, "translate-k-4lQ0M", "(J)V", "translate", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "path1", "path2", "Landroidx/compose/ui/graphics/PathOperation;", "operation", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "op", "Landroid/graphics/Path;", "getInternalPath", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "", "radii", "[F", "Landroid/graphics/Matrix;", "mMatrix", "Landroid/graphics/Matrix;", "Landroidx/compose/ui/graphics/PathFillType;", "value", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "fillType", "isConvex", "()Z", "isConvex$annotations", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidPath implements Path {
    private final android.graphics.Path internalPath;
    private final android.graphics.Matrix mMatrix;
    private final float[] radii;
    private final RectF rectF;

    public AndroidPath(android.graphics.Path internalPath) {
        Intrinsics.checkNotNullParameter(internalPath, "internalPath");
        this.internalPath = internalPath;
        this.rectF = new RectF();
        this.radii = new float[8];
        this.mMatrix = new android.graphics.Matrix();
    }

    public /* synthetic */ AndroidPath(android.graphics.Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new android.graphics.Path() : path);
    }

    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public void mo1380setFillTypeoQ8Xj4U(int i) {
        Path.FillType fillType;
        android.graphics.Path path = this.internalPath;
        if (PathFillType.m1544equalsimpl0(i, PathFillType.INSTANCE.m1548getEvenOddRgk1Os())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void moveTo(float x, float y) {
        this.internalPath.moveTo(x, y);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeMoveTo(float dx, float dy) {
        this.internalPath.rMoveTo(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void lineTo(float x, float y) {
        this.internalPath.lineTo(x, y);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeLineTo(float dx, float dy) {
        this.internalPath.rLineTo(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticBezierTo(float x1, float y1, float x2, float y2) {
        this.internalPath.quadTo(x1, y1, x2, y2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticBezierTo(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void cubicTo(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.internalPath.cubicTo(x1, y1, x2, y2, x3, y3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeCubicTo(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this.internalPath.rCubicTo(dx1, dy1, dx2, dy2, dx3, dy3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (!_rectIsValid(rect)) {
            throw new IllegalStateException("Check failed.");
        }
        this.rectF.set(RectHelper_androidKt.toAndroidRectF(rect));
        this.internalPath.addRect(this.rectF, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "roundRect");
        this.rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        this.radii[0] = CornerRadius.m1282getXimpl(roundRect.getTopLeftCornerRadius());
        this.radii[1] = CornerRadius.m1283getYimpl(roundRect.getTopLeftCornerRadius());
        this.radii[2] = CornerRadius.m1282getXimpl(roundRect.getTopRightCornerRadius());
        this.radii[3] = CornerRadius.m1283getYimpl(roundRect.getTopRightCornerRadius());
        this.radii[4] = CornerRadius.m1282getXimpl(roundRect.getBottomRightCornerRadius());
        this.radii[5] = CornerRadius.m1283getYimpl(roundRect.getBottomRightCornerRadius());
        this.radii[6] = CornerRadius.m1282getXimpl(roundRect.getBottomLeftCornerRadius());
        this.radii[7] = CornerRadius.m1283getYimpl(roundRect.getBottomLeftCornerRadius());
        this.internalPath.addRoundRect(this.rectF, this.radii, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public void mo1378addPathUv8p0NA(Path path, long offset) {
        Intrinsics.checkNotNullParameter(path, "path");
        android.graphics.Path path2 = this.internalPath;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.addPath(((AndroidPath) path).getInternalPath(), Offset.m1297getXimpl(offset), Offset.m1298getYimpl(offset));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public void mo1381translatek4lQ0M(long offset) {
        this.mMatrix.reset();
        this.mMatrix.setTranslate(Offset.m1297getXimpl(offset), Offset.m1298getYimpl(offset));
        this.internalPath.transform(this.mMatrix);
    }

    @Override // androidx.compose.ui.graphics.Path
    public Rect getBounds() {
        this.internalPath.computeBounds(this.rectF, true);
        RectF rectF = this.rectF;
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* renamed from: op-N5in7k0, reason: not valid java name */
    public boolean mo1379opN5in7k0(Path path1, Path path2, int operation) {
        Path.Op op;
        Intrinsics.checkNotNullParameter(path1, "path1");
        Intrinsics.checkNotNullParameter(path2, "path2");
        PathOperation.Companion companion = PathOperation.INSTANCE;
        if (PathOperation.m1552equalsimpl0(operation, companion.m1556getDifferenceb3I0S0c())) {
            op = Path.Op.DIFFERENCE;
        } else if (PathOperation.m1552equalsimpl0(operation, companion.m1557getIntersectb3I0S0c())) {
            op = Path.Op.INTERSECT;
        } else if (PathOperation.m1552equalsimpl0(operation, companion.m1558getReverseDifferenceb3I0S0c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = PathOperation.m1552equalsimpl0(operation, companion.m1559getUnionb3I0S0c()) ? Path.Op.UNION : Path.Op.XOR;
        }
        android.graphics.Path path = this.internalPath;
        if (!(path1 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path internalPath = ((AndroidPath) path1).getInternalPath();
        if (!(path2 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return path.op(internalPath, ((AndroidPath) path2).getInternalPath(), op);
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    private final boolean _rectIsValid(Rect rect) {
        if (Float.isNaN(rect.getLeft())) {
            throw new IllegalStateException("Rect.left is NaN");
        }
        if (Float.isNaN(rect.getTop())) {
            throw new IllegalStateException("Rect.top is NaN");
        }
        if (Float.isNaN(rect.getRight())) {
            throw new IllegalStateException("Rect.right is NaN");
        }
        if (Float.isNaN(rect.getBottom())) {
            throw new IllegalStateException("Rect.bottom is NaN");
        }
        return true;
    }
}
