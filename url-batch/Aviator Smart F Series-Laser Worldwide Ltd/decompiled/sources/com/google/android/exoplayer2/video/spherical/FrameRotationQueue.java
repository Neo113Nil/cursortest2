package com.google.android.exoplayer2.video.spherical;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;

@Deprecated
/* loaded from: classes3.dex */
final class FrameRotationQueue {
    private boolean recenterMatrixComputed;
    private final float[] recenterMatrix = new float[16];
    private final float[] rotationMatrix = new float[16];
    private final TimedValueQueue<float[]> rotations = new TimedValueQueue<>();

    public static void computeRecenterMatrix(float[] fArr, float[] fArr2) {
        GlUtil.setToIdentity(fArr);
        float f8 = fArr2[10];
        float f9 = fArr2[8];
        float sqrt = (float) Math.sqrt((f8 * f8) + (f9 * f9));
        float f10 = fArr2[10];
        fArr[0] = f10 / sqrt;
        float f11 = fArr2[8];
        fArr[2] = f11 / sqrt;
        fArr[8] = (-f11) / sqrt;
        fArr[10] = f10 / sqrt;
    }

    private static void getRotationMatrixFromAngleAxis(float[] fArr, float[] fArr2) {
        float f8 = fArr2[0];
        float f9 = -fArr2[1];
        float f10 = -fArr2[2];
        float length = Matrix.length(f8, f9, f10);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f8 / length, f9 / length, f10 / length);
        } else {
            GlUtil.setToIdentity(fArr);
        }
    }

    public boolean pollRotationMatrix(float[] fArr, long j8) {
        float[] pollFloor = this.rotations.pollFloor(j8);
        if (pollFloor == null) {
            return false;
        }
        getRotationMatrixFromAngleAxis(this.rotationMatrix, pollFloor);
        if (!this.recenterMatrixComputed) {
            computeRecenterMatrix(this.recenterMatrix, this.rotationMatrix);
            this.recenterMatrixComputed = true;
        }
        Matrix.multiplyMM(fArr, 0, this.recenterMatrix, 0, this.rotationMatrix, 0);
        return true;
    }

    public void reset() {
        this.rotations.clear();
        this.recenterMatrixComputed = false;
    }

    public void setRotation(long j8, float[] fArr) {
        this.rotations.add(j8, fArr);
    }
}
