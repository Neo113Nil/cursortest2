package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

/* loaded from: classes4.dex */
public class ShapeAppearancePathProvider {
    protected static final int BOTTOM_LEFT_CORNER_INDEX = 2;
    protected static final int BOTTOM_RIGHT_CORNER_INDEX = 1;
    protected static final int TOP_LEFT_CORNER_INDEX = 3;
    protected static final int TOP_RIGHT_CORNER_INDEX = 0;
    private final ShapePath[] cornerPaths = new ShapePath[4];
    private final Matrix[] cornerTransforms = new Matrix[4];
    private final Matrix[] edgeTransforms = new Matrix[4];
    private final PointF pointF = new PointF();
    private final Path overlappedEdgePath = new Path();
    private final Path boundsPath = new Path();
    private final ShapePath shapePath = new ShapePath();
    private final float[] scratch = new float[2];
    private final float[] scratch2 = new float[2];
    private final Path edgePath = new Path();
    private final Path cornerPath = new Path();
    private boolean edgeIntersectionCheckEnabled = true;

    private static class Lazy {
        static final ShapeAppearancePathProvider INSTANCE = new ShapeAppearancePathProvider();

        private Lazy() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i8);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i8);
    }

    static final class ShapeAppearancePathSpec {

        @NonNull
        public final RectF bounds;
        public final float interpolation;

        @NonNull
        public final Path path;

        @Nullable
        public final PathListener pathListener;

        @NonNull
        public final ShapeAppearanceModel shapeAppearanceModel;

        ShapeAppearancePathSpec(@NonNull ShapeAppearanceModel shapeAppearanceModel, float f8, RectF rectF, @Nullable PathListener pathListener, Path path) {
            this.pathListener = pathListener;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.interpolation = f8;
            this.bounds = rectF;
            this.path = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i8 = 0; i8 < 4; i8++) {
            this.cornerPaths[i8] = new ShapePath();
            this.cornerTransforms[i8] = new Matrix();
            this.edgeTransforms[i8] = new Matrix();
        }
    }

    private float angleOfEdge(int i8) {
        return ((i8 + 1) % 4) * 90;
    }

    private void appendCornerPath(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i8) {
        this.scratch[0] = this.cornerPaths[i8].getStartX();
        this.scratch[1] = this.cornerPaths[i8].getStartY();
        this.cornerTransforms[i8].mapPoints(this.scratch);
        if (i8 == 0) {
            Path path = shapeAppearancePathSpec.path;
            float[] fArr = this.scratch;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = shapeAppearancePathSpec.path;
            float[] fArr2 = this.scratch;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.cornerPaths[i8].applyToPath(this.cornerTransforms[i8], shapeAppearancePathSpec.path);
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onCornerPathCreated(this.cornerPaths[i8], this.cornerTransforms[i8], i8);
        }
    }

    private void appendEdgePath(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i8) {
        int i9 = (i8 + 1) % 4;
        this.scratch[0] = this.cornerPaths[i8].getEndX();
        this.scratch[1] = this.cornerPaths[i8].getEndY();
        this.cornerTransforms[i8].mapPoints(this.scratch);
        this.scratch2[0] = this.cornerPaths[i9].getStartX();
        this.scratch2[1] = this.cornerPaths[i9].getStartY();
        this.cornerTransforms[i9].mapPoints(this.scratch2);
        float f8 = this.scratch[0];
        float[] fArr = this.scratch2;
        float max = Math.max(((float) Math.hypot(f8 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float edgeCenterForIndex = getEdgeCenterForIndex(shapeAppearancePathSpec.bounds, i8);
        this.shapePath.reset(0.0f, 0.0f);
        EdgeTreatment edgeTreatmentForIndex = getEdgeTreatmentForIndex(i8, shapeAppearancePathSpec.shapeAppearanceModel);
        edgeTreatmentForIndex.getEdgePath(max, edgeCenterForIndex, shapeAppearancePathSpec.interpolation, this.shapePath);
        this.edgePath.reset();
        this.shapePath.applyToPath(this.edgeTransforms[i8], this.edgePath);
        if (this.edgeIntersectionCheckEnabled && (edgeTreatmentForIndex.forceIntersection() || pathOverlapsCorner(this.edgePath, i8) || pathOverlapsCorner(this.edgePath, i9))) {
            Path path = this.edgePath;
            path.op(path, this.boundsPath, Path.Op.DIFFERENCE);
            this.scratch[0] = this.shapePath.getStartX();
            this.scratch[1] = this.shapePath.getStartY();
            this.edgeTransforms[i8].mapPoints(this.scratch);
            Path path2 = this.overlappedEdgePath;
            float[] fArr2 = this.scratch;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.shapePath.applyToPath(this.edgeTransforms[i8], this.overlappedEdgePath);
        } else {
            this.shapePath.applyToPath(this.edgeTransforms[i8], shapeAppearancePathSpec.path);
        }
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onEdgePathCreated(this.shapePath, this.edgeTransforms[i8], i8);
        }
    }

    private void getCoordinatesOfCorner(int i8, @NonNull RectF rectF, @NonNull PointF pointF) {
        if (i8 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i8 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i8 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private CornerTreatment getCornerTreatmentForIndex(int i8, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? shapeAppearanceModel.getTopRightCorner() : shapeAppearanceModel.getTopLeftCorner() : shapeAppearanceModel.getBottomLeftCorner() : shapeAppearanceModel.getBottomRightCorner();
    }

    private float getEdgeCenterForIndex(@NonNull RectF rectF, int i8) {
        float[] fArr = this.scratch;
        ShapePath shapePath = this.cornerPaths[i8];
        fArr[0] = shapePath.endX;
        fArr[1] = shapePath.endY;
        this.cornerTransforms[i8].mapPoints(fArr);
        return (i8 == 1 || i8 == 3) ? Math.abs(rectF.centerX() - this.scratch[0]) : Math.abs(rectF.centerY() - this.scratch[1]);
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int i8, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? shapeAppearanceModel.getRightEdge() : shapeAppearanceModel.getTopEdge() : shapeAppearanceModel.getLeftEdge() : shapeAppearanceModel.getBottomEdge();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @UiThread
    public static ShapeAppearancePathProvider getInstance() {
        return Lazy.INSTANCE;
    }

    private boolean pathOverlapsCorner(Path path, int i8) {
        this.cornerPath.reset();
        this.cornerPaths[i8].applyToPath(this.cornerTransforms[i8], this.cornerPath);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.cornerPath.computeBounds(rectF, true);
        path.op(this.cornerPath, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void setCornerPathAndTransform(@NonNull ShapeAppearancePathSpec shapeAppearancePathSpec, int i8, @Nullable float[] fArr) {
        getCornerTreatmentForIndex(i8, shapeAppearancePathSpec.shapeAppearanceModel).getCornerPath(this.cornerPaths[i8], 90.0f, shapeAppearancePathSpec.interpolation, shapeAppearancePathSpec.bounds, fArr == null ? getCornerSizeForIndex(i8, shapeAppearancePathSpec.shapeAppearanceModel) : new ClampedCornerSize(fArr[i8]));
        float angleOfEdge = angleOfEdge(i8);
        this.cornerTransforms[i8].reset();
        getCoordinatesOfCorner(i8, shapeAppearancePathSpec.bounds, this.pointF);
        Matrix matrix = this.cornerTransforms[i8];
        PointF pointF = this.pointF;
        matrix.setTranslate(pointF.x, pointF.y);
        this.cornerTransforms[i8].preRotate(angleOfEdge);
    }

    private void setEdgePathAndTransform(int i8) {
        this.scratch[0] = this.cornerPaths[i8].getEndX();
        this.scratch[1] = this.cornerPaths[i8].getEndY();
        this.cornerTransforms[i8].mapPoints(this.scratch);
        float angleOfEdge = angleOfEdge(i8);
        this.edgeTransforms[i8].reset();
        Matrix matrix = this.edgeTransforms[i8];
        float[] fArr = this.scratch;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.edgeTransforms[i8].preRotate(angleOfEdge);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f8, RectF rectF, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, f8, rectF, null, path);
    }

    @NonNull
    CornerSize getCornerSizeForIndex(int i8, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? shapeAppearanceModel.getTopRightCornerSize() : shapeAppearanceModel.getTopLeftCornerSize() : shapeAppearanceModel.getBottomLeftCornerSize() : shapeAppearanceModel.getBottomRightCornerSize();
    }

    void setEdgeIntersectionCheckEnable(boolean z7) {
        this.edgeIntersectionCheckEnabled = z7;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f8, RectF rectF, PathListener pathListener, @NonNull Path path) {
        calculatePath(shapeAppearanceModel, null, f8, rectF, pathListener, path);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void calculatePath(@NonNull ShapeAppearanceModel shapeAppearanceModel, @Nullable float[] fArr, float f8, RectF rectF, PathListener pathListener, @NonNull Path path) {
        path.rewind();
        this.overlappedEdgePath.rewind();
        this.boundsPath.rewind();
        this.boundsPath.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f8, rectF, pathListener, path);
        for (int i8 = 0; i8 < 4; i8++) {
            setCornerPathAndTransform(shapeAppearancePathSpec, i8, fArr);
            setEdgePathAndTransform(i8);
        }
        for (int i9 = 0; i9 < 4; i9++) {
            appendCornerPath(shapeAppearancePathSpec, i9);
            appendEdgePath(shapeAppearancePathSpec, i9);
        }
        path.close();
        this.overlappedEdgePath.close();
        if (this.overlappedEdgePath.isEmpty()) {
            return;
        }
        path.op(this.overlappedEdgePath, Path.Op.UNION);
    }
}
