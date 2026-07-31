package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* compiled from: AndroidCanvas.android.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u000e\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J=\u0010.\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00162\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J%\u00103\u001a\u00020\t2\u0006\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u0017\u00107\u001a\u000204*\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J-\u0010<\u001a\u00020\t2\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J7\u0010=\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b=\u0010>JG\u0010A\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bA\u0010BJ-\u0010G\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010FJO\u0010L\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00162\u0006\u0010H\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u00162\u0006\u0010K\u001a\u00020J2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\t2\u0006\u00100\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bN\u0010OJ-\u0010U\u001a\u00020\t2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJE\u0010^\u001a\u00020\t2\u0006\u0010Q\u001a\u00020P2\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020V2\u0006\u0010[\u001a\u00020X2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\\\u0010]J3\u0010\n\u001a\u00020\t2\u0006\u0010`\u001a\u00020_2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\tH\u0016¢\u0006\u0004\bc\u0010\u0003J\u000f\u0010d\u001a\u00020\tH\u0016¢\u0006\u0004\bd\u0010\u0003R,\u0010g\u001a\u00060ej\u0002`f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bg\u0010h\u0012\u0004\bm\u0010\u0003\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010p\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006r"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "<init>", "()V", "", "Landroidx/compose/ui/geometry/Offset;", "points", "Landroidx/compose/ui/graphics/Paint;", "paint", "", "drawPoints", "(Ljava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "", "stepBy", "drawLines", "(Ljava/util/List;Landroidx/compose/ui/graphics/Paint;I)V", "save", "restore", "Landroidx/compose/ui/geometry/Rect;", "bounds", "saveLayer", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;)V", "", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", "path", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "toRegionOp", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "(FFFFLandroidx/compose/ui/graphics/Paint;)V", "radiusX", "radiusY", "drawRoundRect", "(FFFFFFLandroidx/compose/ui/graphics/Paint;)V", "center", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "(FFFFFFZLandroidx/compose/ui/graphics/Paint;)V", "drawPath", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "enableZ", "disableZ", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "internalCanvas", "Landroid/graphics/Canvas;", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "Landroid/graphics/Rect;", "srcRect", "Landroid/graphics/Rect;", "dstRect", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AndroidCanvas implements Canvas {
    private final Rect dstRect;
    private android.graphics.Canvas internalCanvas;
    private final Rect srcRect;

    private final void drawPoints(List points, Paint paint) {
        int size = points.size();
        for (int i = 0; i < size; i++) {
            long packedValue = ((Offset) points.get(i)).getPackedValue();
            this.internalCanvas.drawPoint(Offset.m1297getXimpl(packedValue), Offset.m1298getYimpl(packedValue), paint.getInternalPaint());
        }
    }

    public AndroidCanvas() {
        android.graphics.Canvas canvas;
        canvas = AndroidCanvas_androidKt.EmptyCanvas;
        this.internalCanvas = canvas;
        this.srcRect = new Rect();
        this.dstRect = new Rect();
    }

    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public final void setInternalCanvas(android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(androidx.compose.ui.geometry.Rect bounds, Paint paint) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.getInternalPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float dx, float dy) {
        this.internalCanvas.translate(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float sx, float sy) {
        this.internalCanvas.scale(sx, sy);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float degrees) {
        this.internalCanvas.rotate(degrees);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc, reason: not valid java name */
    public void mo1348concat58bKbWc(float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (MatrixKt.m1527isIdentity58bKbWc(matrix)) {
            return;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m1359setFromEL8BTi8(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg, reason: not valid java name */
    public void mo1347clipRectN_I0leg(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, m1354toRegionOp7u2Bmg(clipOp));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E, reason: not valid java name */
    public void mo1346clipPathmtrdDE(Path path, int clipOp) {
        Intrinsics.checkNotNullParameter(path, "path");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).getInternalPath(), m1354toRegionOp7u2Bmg(clipOp));
    }

    /* renamed from: toRegionOp--7u2Bmg, reason: not valid java name */
    public final Region.Op m1354toRegionOp7u2Bmg(int i) {
        return ClipOp.m1435equalsimpl0(i, ClipOp.INSTANCE.m1439getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g, reason: not valid java name */
    public void mo1352drawLineWko1d7g(long p1, long p2, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawLine(Offset.m1297getXimpl(p1), Offset.m1298getYimpl(p1), Offset.m1297getXimpl(p2), Offset.m1298getYimpl(p2), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float left, float top, float right, float bottom, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawRect(left, top, right, bottom, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float left, float top, float right, float bottom, float radiusX, float radiusY, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawRoundRect(left, top, right, bottom, radiusX, radiusY, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo, reason: not valid java name */
    public void mo1349drawCircle9KIMszo(long center, float radius, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawCircle(Offset.m1297getXimpl(center), Offset.m1298getYimpl(center), radius, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I, reason: not valid java name */
    public void mo1350drawImaged4ec7I(ImageBitmap image, long topLeftOffset, Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(image), Offset.m1297getXimpl(topLeftOffset), Offset.m1298getYimpl(topLeftOffset), paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0, reason: not valid java name */
    public void mo1351drawImageRectHPBpro0(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(image);
        Rect rect = this.srcRect;
        rect.left = IntOffset.m2553getXimpl(srcOffset);
        rect.top = IntOffset.m2554getYimpl(srcOffset);
        rect.right = IntOffset.m2553getXimpl(srcOffset) + IntSize.m2567getWidthimpl(srcSize);
        rect.bottom = IntOffset.m2554getYimpl(srcOffset) + IntSize.m2566getHeightimpl(srcSize);
        Unit unit = Unit.INSTANCE;
        Rect rect2 = this.dstRect;
        rect2.left = IntOffset.m2553getXimpl(dstOffset);
        rect2.top = IntOffset.m2554getYimpl(dstOffset);
        rect2.right = IntOffset.m2553getXimpl(dstOffset) + IntSize.m2567getWidthimpl(dstSize);
        rect2.bottom = IntOffset.m2554getYimpl(dstOffset) + IntSize.m2566getHeightimpl(dstSize);
        canvas.drawBitmap(asAndroidBitmap, rect, rect2, paint.getInternalPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY, reason: not valid java name */
    public void mo1353drawPointsO7TthRY(int pointMode, List points, Paint paint) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        PointMode.Companion companion = PointMode.INSTANCE;
        if (PointMode.m1562equalsimpl0(pointMode, companion.m1566getLinesr_lszbg())) {
            drawLines(points, paint, 2);
        } else if (PointMode.m1562equalsimpl0(pointMode, companion.m1568getPolygonr_lszbg())) {
            drawLines(points, paint, 1);
        } else if (PointMode.m1562equalsimpl0(pointMode, companion.m1567getPointsr_lszbg())) {
            drawPoints(points, paint);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    private final void drawLines(List points, Paint paint, int stepBy) {
        if (points.size() < 2) {
            return;
        }
        IntProgression step = RangesKt.step(RangesKt.until(0, points.size() - 1), stepBy);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
            return;
        }
        while (true) {
            long packedValue = ((Offset) points.get(first)).getPackedValue();
            long packedValue2 = ((Offset) points.get(first + 1)).getPackedValue();
            this.internalCanvas.drawLine(Offset.m1297getXimpl(packedValue), Offset.m1298getYimpl(packedValue), Offset.m1297getXimpl(packedValue2), Offset.m1298getYimpl(packedValue2), paint.getInternalPaint());
            if (first == last) {
                return;
            } else {
                first += step2;
            }
        }
    }
}
