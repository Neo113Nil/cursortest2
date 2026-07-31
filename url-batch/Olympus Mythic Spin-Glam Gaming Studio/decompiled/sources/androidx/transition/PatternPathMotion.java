package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes3.dex */
public class PatternPathMotion extends PathMotion {
    private final Path mPatternPath;
    private final Matrix mTempMatrix;

    @Override // androidx.transition.PathMotion
    public Path getPath(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float distance = distance(f5, f6);
        double atan2 = Math.atan2(f6, f5);
        this.mTempMatrix.setScale(distance, distance);
        this.mTempMatrix.postRotate((float) Math.toDegrees(atan2));
        this.mTempMatrix.postTranslate(f, f2);
        Path path = new Path();
        this.mPatternPath.transform(this.mTempMatrix, path);
        return path;
    }

    private static float distance(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }
}
