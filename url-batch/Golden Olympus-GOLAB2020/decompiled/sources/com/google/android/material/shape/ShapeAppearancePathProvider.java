package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class ShapeAppearancePathProvider {
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
    }

    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i4);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i4);
    }

    static final class ShapeAppearancePathSpec {
        public final RectF bounds;
        public final float interpolation;
        public final Path path;
        public final PathListener pathListener;
        public final ShapeAppearanceModel shapeAppearanceModel;

        ShapeAppearancePathSpec(ShapeAppearanceModel shapeAppearanceModel, float f4, RectF rectF, PathListener pathListener, Path path) {
            this.pathListener = pathListener;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.interpolation = f4;
            this.bounds = rectF;
            this.path = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i4 = 0; i4 < 4; i4++) {
            this.cornerPaths[i4] = new ShapePath();
            this.cornerTransforms[i4] = new Matrix();
            this.edgeTransforms[i4] = new Matrix();
        }
    }

    private float angleOfEdge(int i4) {
        return (i4 + 1) * 90;
    }

    private void appendCornerPath(ShapeAppearancePathSpec shapeAppearancePathSpec, int i4) {
        this.scratch[0] = this.cornerPaths[i4].getStartX();
        this.scratch[1] = this.cornerPaths[i4].getStartY();
        this.cornerTransforms[i4].mapPoints(this.scratch);
        if (i4 == 0) {
            Path path = shapeAppearancePathSpec.path;
            float[] fArr = this.scratch;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = shapeAppearancePathSpec.path;
            float[] fArr2 = this.scratch;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.cornerPaths[i4].applyToPath(this.cornerTransforms[i4], shapeAppearancePathSpec.path);
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onCornerPathCreated(this.cornerPaths[i4], this.cornerTransforms[i4], i4);
        }
    }

    private void appendEdgePath(ShapeAppearancePathSpec shapeAppearancePathSpec, int i4) {
        int i5 = (i4 + 1) % 4;
        this.scratch[0] = this.cornerPaths[i4].getEndX();
        this.scratch[1] = this.cornerPaths[i4].getEndY();
        this.cornerTransforms[i4].mapPoints(this.scratch);
        this.scratch2[0] = this.cornerPaths[i5].getStartX();
        this.scratch2[1] = this.cornerPaths[i5].getStartY();
        this.cornerTransforms[i5].mapPoints(this.scratch2);
        float f4 = this.scratch[0];
        float[] fArr = this.scratch2;
        float max = Math.max(((float) Math.hypot(f4 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float edgeCenterForIndex = getEdgeCenterForIndex(shapeAppearancePathSpec.bounds, i4);
        this.shapePath.reset(0.0f, 0.0f);
        EdgeTreatment edgeTreatmentForIndex = getEdgeTreatmentForIndex(i4, shapeAppearancePathSpec.shapeAppearanceModel);
        edgeTreatmentForIndex.getEdgePath(max, edgeCenterForIndex, shapeAppearancePathSpec.interpolation, this.shapePath);
        this.edgePath.reset();
        this.shapePath.applyToPath(this.edgeTransforms[i4], this.edgePath);
        if (this.edgeIntersectionCheckEnabled && (edgeTreatmentForIndex.forceIntersection() || pathOverlapsCorner(this.edgePath, i4) || pathOverlapsCorner(this.edgePath, i5))) {
            Path path = this.edgePath;
            path.op(path, this.boundsPath, Path.Op.DIFFERENCE);
            this.scratch[0] = this.shapePath.getStartX();
            this.scratch[1] = this.shapePath.getStartY();
            this.edgeTransforms[i4].mapPoints(this.scratch);
            Path path2 = this.overlappedEdgePath;
            float[] fArr2 = this.scratch;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.shapePath.applyToPath(this.edgeTransforms[i4], this.overlappedEdgePath);
        } else {
            this.shapePath.applyToPath(this.edgeTransforms[i4], shapeAppearancePathSpec.path);
        }
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onEdgePathCreated(this.shapePath, this.edgeTransforms[i4], i4);
        }
    }

    private void getCoordinatesOfCorner(int i4, RectF rectF, PointF pointF) {
        if (i4 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i4 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i4 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private CornerSize getCornerSizeForIndex(int i4, ShapeAppearanceModel shapeAppearanceModel) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? shapeAppearanceModel.getTopRightCornerSize() : shapeAppearanceModel.getTopLeftCornerSize() : shapeAppearanceModel.getBottomLeftCornerSize() : shapeAppearanceModel.getBottomRightCornerSize();
    }

    private CornerTreatment getCornerTreatmentForIndex(int i4, ShapeAppearanceModel shapeAppearanceModel) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? shapeAppearanceModel.getTopRightCorner() : shapeAppearanceModel.getTopLeftCorner() : shapeAppearanceModel.getBottomLeftCorner() : shapeAppearanceModel.getBottomRightCorner();
    }

    private float getEdgeCenterForIndex(RectF rectF, int i4) {
        float[] fArr = this.scratch;
        ShapePath shapePath = this.cornerPaths[i4];
        fArr[0] = shapePath.endX;
        fArr[1] = shapePath.endY;
        this.cornerTransforms[i4].mapPoints(fArr);
        return (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - this.scratch[0]) : Math.abs(rectF.centerY() - this.scratch[1]);
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int i4, ShapeAppearanceModel shapeAppearanceModel) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? shapeAppearanceModel.getRightEdge() : shapeAppearanceModel.getTopEdge() : shapeAppearanceModel.getLeftEdge() : shapeAppearanceModel.getBottomEdge();
    }

    public static ShapeAppearancePathProvider getInstance() {
        return Lazy.INSTANCE;
    }

    private boolean pathOverlapsCorner(Path path, int i4) {
        this.cornerPath.reset();
        this.cornerPaths[i4].applyToPath(this.cornerTransforms[i4], this.cornerPath);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.cornerPath.computeBounds(rectF, true);
        path.op(this.cornerPath, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void setCornerPathAndTransform(ShapeAppearancePathSpec shapeAppearancePathSpec, int i4) {
        getCornerTreatmentForIndex(i4, shapeAppearancePathSpec.shapeAppearanceModel).getCornerPath(this.cornerPaths[i4], 90.0f, shapeAppearancePathSpec.interpolation, shapeAppearancePathSpec.bounds, getCornerSizeForIndex(i4, shapeAppearancePathSpec.shapeAppearanceModel));
        float angleOfEdge = angleOfEdge(i4);
        this.cornerTransforms[i4].reset();
        getCoordinatesOfCorner(i4, shapeAppearancePathSpec.bounds, this.pointF);
        Matrix matrix = this.cornerTransforms[i4];
        PointF pointF = this.pointF;
        matrix.setTranslate(pointF.x, pointF.y);
        this.cornerTransforms[i4].preRotate(angleOfEdge);
    }

    private void setEdgePathAndTransform(int i4) {
        this.scratch[0] = this.cornerPaths[i4].getEndX();
        this.scratch[1] = this.cornerPaths[i4].getEndY();
        this.cornerTransforms[i4].mapPoints(this.scratch);
        float angleOfEdge = angleOfEdge(i4);
        this.edgeTransforms[i4].reset();
        Matrix matrix = this.edgeTransforms[i4];
        float[] fArr = this.scratch;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.edgeTransforms[i4].preRotate(angleOfEdge);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f4, RectF rectF, Path path) {
        calculatePath(shapeAppearanceModel, f4, rectF, null, path);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f4, RectF rectF, PathListener pathListener, Path path) {
        path.rewind();
        this.overlappedEdgePath.rewind();
        this.boundsPath.rewind();
        this.boundsPath.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f4, rectF, pathListener, path);
        for (int i4 = 0; i4 < 4; i4++) {
            setCornerPathAndTransform(shapeAppearancePathSpec, i4);
            setEdgePathAndTransform(i4);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            appendCornerPath(shapeAppearancePathSpec, i5);
            appendEdgePath(shapeAppearancePathSpec, i5);
        }
        path.close();
        this.overlappedEdgePath.close();
        if (this.overlappedEdgePath.isEmpty()) {
            return;
        }
        path.op(this.overlappedEdgePath, Path.Op.UNION);
    }
}
