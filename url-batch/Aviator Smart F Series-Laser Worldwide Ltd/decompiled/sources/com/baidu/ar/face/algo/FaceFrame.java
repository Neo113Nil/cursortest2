package com.baidu.ar.face.algo;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FaceFrame {
    public static final int FACE_ANIMATION_POINTS_COUNT = 95;
    public static final int FACE_LANDMARKS_COUNT = 190;
    public static final int FACE_MAX_COUNT = 4;
    public float[] animatePointsArray;
    public List<FAUPoint2D[]> animatePointsList;
    public List<float[]> animationValuesList;
    public List<FAUFaceBox> faceBoxes;
    public float[] faceBoxesArray;
    public int[] faceIDList;
    public List<float[]> headPoses;
    public int mProcessResult;
    public float[] trackedPointsArray;
    public List<FAUPoint2D[]> trackedPointsList;
    public List<String[]> triggersList;

    public List<FAUPoint2D[]> getAnimatePointsList() {
        if (this.animatePointsArray != null) {
            this.animatePointsList = new ArrayList();
            int length = this.animatePointsArray.length / FACE_LANDMARKS_COUNT;
            for (int i8 = 0; i8 < length; i8++) {
                int i9 = i8 * FACE_LANDMARKS_COUNT;
                FAUPoint2D[] fAUPoint2DArr = new FAUPoint2D[95];
                for (int i10 = 0; i10 < 95; i10++) {
                    FAUPoint2D fAUPoint2D = new FAUPoint2D();
                    FAUPoint2D fAUPoint2D2 = fAUPoint2DArr[i10];
                    float[] fArr = this.animatePointsArray;
                    int i11 = (i10 * 2) + i9;
                    fAUPoint2D2.f2224x = fArr[i11];
                    fAUPoint2D2.f2225y = fArr[i11 + 1];
                    fAUPoint2DArr[i10] = fAUPoint2D;
                }
                this.animatePointsList.add(fAUPoint2DArr);
            }
            this.animatePointsArray = null;
        }
        return this.animatePointsList;
    }

    public List<float[]> getAnimationValuesList() {
        return this.animationValuesList;
    }

    public List<FAUFaceBox> getFaceBoxes() {
        if (this.faceBoxesArray != null) {
            this.faceBoxes = new ArrayList();
            int length = this.faceBoxesArray.length / 5;
            for (int i8 = 0; i8 < length; i8++) {
                float[] fArr = this.faceBoxesArray;
                int i9 = i8 * 5;
                this.faceBoxes.add(new FAUFaceBox(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3], fArr[i9 + 4]));
            }
            this.faceBoxesArray = null;
        }
        return this.faceBoxes;
    }

    public int[] getFaceIDList() {
        return this.faceIDList;
    }

    public List<float[]> getHeadPoses() {
        return this.headPoses;
    }

    public int getProcessResult() {
        return this.mProcessResult;
    }

    public float[] getTrackedPointsArray() {
        return this.trackedPointsArray;
    }

    public List<FAUPoint2D[]> getTrackedPointsList() {
        if (this.trackedPointsArray != null) {
            this.trackedPointsList = new ArrayList();
            int length = this.trackedPointsArray.length / 380;
            for (int i8 = 0; i8 < length; i8++) {
                int i9 = i8 * 380;
                FAUPoint2D[] fAUPoint2DArr = new FAUPoint2D[FACE_LANDMARKS_COUNT];
                for (int i10 = 0; i10 < 190; i10++) {
                    FAUPoint2D fAUPoint2D = new FAUPoint2D();
                    float[] fArr = this.trackedPointsArray;
                    int i11 = (i10 * 2) + i9;
                    fAUPoint2D.f2224x = fArr[i11];
                    fAUPoint2D.f2225y = fArr[i11 + 1];
                    fAUPoint2DArr[i10] = fAUPoint2D;
                }
                this.trackedPointsList.add(fAUPoint2DArr);
            }
            this.trackedPointsArray = null;
        }
        return this.trackedPointsList;
    }

    public List<String[]> getTriggersList() {
        return this.triggersList;
    }
}
