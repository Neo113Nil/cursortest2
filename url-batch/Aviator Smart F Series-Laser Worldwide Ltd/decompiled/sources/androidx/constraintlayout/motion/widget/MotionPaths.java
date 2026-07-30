package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.arthenica.ffmpegkit.x;
import com.github.mikephil.charting.utils.i;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
class MotionPaths implements Comparable<MotionPaths> {
    static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] sNames = {"position", "x", "y", x.KEY_WIDTH, x.KEY_HEIGHT, "pathRotate"};
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    LinkedHashMap<String, ConstraintAttribute> mAttributes;
    float mHeight;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPosition;
    float mRelativeAngle;
    MotionController mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float mTime;
    float mWidth;
    float mX;
    float mY;
    int mDrawPath = 0;
    float mPathRotate = Float.NaN;
    float mProgress = Float.NaN;

    MotionPaths() {
        int i8 = Key.UNSET;
        this.mPathMotionArc = i8;
        this.mAnimateRelativeTo = i8;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f8, float f9) {
        return (Float.isNaN(f8) || Float.isNaN(f9)) ? Float.isNaN(f8) != Float.isNaN(f9) : Math.abs(f8 - f9) > 1.0E-6f;
    }

    private static float xRotate(float f8, float f9, float f10, float f11, float f12, float f13) {
        return (((f12 - f10) * f9) - ((f13 - f11) * f8)) + f10;
    }

    private static float yRotate(float f8, float f9, float f10, float f11, float f12, float f13) {
        return ((f12 - f10) * f8) + ((f13 - f11) * f9) + f11;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = constraint.propertySet.mProgress;
        this.mRelativeAngle = constraint.layout.circleAngle;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.mAttributes.put(str, constraintAttribute);
            }
        }
    }

    public void configureRelativeTo(MotionController motionController) {
        motionController.getPos(this.mProgress);
    }

    void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z7) {
        boolean diff = diff(this.mX, motionPaths.mX);
        boolean diff2 = diff(this.mY, motionPaths.mY);
        zArr[0] = zArr[0] | diff(this.mPosition, motionPaths.mPosition);
        boolean z8 = diff | diff2 | z7;
        zArr[1] = zArr[1] | z8;
        zArr[2] = z8 | zArr[2];
        zArr[3] = zArr[3] | diff(this.mWidth, motionPaths.mWidth);
        zArr[4] = diff(this.mHeight, motionPaths.mHeight) | zArr[4];
    }

    void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.mPosition, this.mX, this.mY, this.mWidth, this.mHeight, this.mPathRotate};
        int i8 = 0;
        for (int i9 : iArr) {
            if (i9 < 6) {
                dArr[i8] = fArr[r4];
                i8++;
            }
        }
    }

    void getBounds(int[] iArr, double[] dArr, float[] fArr, int i8) {
        float f8 = this.mWidth;
        float f9 = this.mHeight;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            float f10 = (float) dArr[i9];
            int i10 = iArr[i9];
            if (i10 == 3) {
                f8 = f10;
            } else if (i10 == 4) {
                f9 = f10;
            }
        }
        fArr[i8] = f8;
        fArr[i8 + 1] = f9;
    }

    void getCenter(double d8, int[] iArr, double[] dArr, float[] fArr, int i8) {
        float f8 = this.mX;
        float f9 = this.mY;
        float f10 = this.mWidth;
        float f11 = this.mHeight;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            float f12 = (float) dArr[i9];
            int i10 = iArr[i9];
            if (i10 == 1) {
                f8 = f12;
            } else if (i10 == 2) {
                f9 = f12;
            } else if (i10 == 3) {
                f10 = f12;
            } else if (i10 == 4) {
                f11 = f12;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d8, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d9 = f13;
            double d10 = f8;
            double d11 = f9;
            f8 = (float) ((d9 + (Math.sin(d11) * d10)) - (f10 / 2.0f));
            f9 = (float) ((f14 - (d10 * Math.cos(d11))) - (f11 / 2.0f));
        }
        fArr[i8] = f8 + (f10 / 2.0f) + 0.0f;
        fArr[i8 + 1] = f9 + (f11 / 2.0f) + 0.0f;
    }

    void getCenterVelocity(double d8, int[] iArr, double[] dArr, float[] fArr, int i8) {
        float f8 = this.mX;
        float f9 = this.mY;
        float f10 = this.mWidth;
        float f11 = this.mHeight;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            float f12 = (float) dArr[i9];
            int i10 = iArr[i9];
            if (i10 == 1) {
                f8 = f12;
            } else if (i10 == 2) {
                f9 = f12;
            } else if (i10 == 3) {
                f10 = f12;
            } else if (i10 == 4) {
                f11 = f12;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d8, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d9 = f13;
            double d10 = f8;
            double d11 = f9;
            f8 = (float) ((d9 + (Math.sin(d11) * d10)) - (f10 / 2.0f));
            f9 = (float) ((f14 - (d10 * Math.cos(d11))) - (f11 / 2.0f));
        }
        fArr[i8] = f8 + (f10 / 2.0f) + 0.0f;
        fArr[i8 + 1] = f9 + (f11 / 2.0f) + 0.0f;
    }

    int getCustomData(String str, double[] dArr, int i8) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        int i9 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i8] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        constraintAttribute.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        while (i9 < numberOfInterpolatedValues) {
            dArr[i8] = r2[i9];
            i9++;
            i8++;
        }
        return numberOfInterpolatedValues;
    }

    int getCustomDataCount(String str) {
        ConstraintAttribute constraintAttribute = this.mAttributes.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    void getRect(int[] iArr, double[] dArr, float[] fArr, int i8) {
        float f8 = this.mX;
        float f9 = this.mY;
        float f10 = this.mWidth;
        float f11 = this.mHeight;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            float f12 = (float) dArr[i9];
            int i10 = iArr[i9];
            if (i10 == 1) {
                f8 = f12;
            } else if (i10 == 2) {
                f9 = f12;
            } else if (i10 == 3) {
                f10 = f12;
            } else if (i10 == 4) {
                f11 = f12;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d8 = f8;
            double d9 = f9;
            float sin = (float) ((centerX + (Math.sin(d9) * d8)) - (f10 / 2.0f));
            f9 = (float) ((centerY - (d8 * Math.cos(d9))) - (f11 / 2.0f));
            f8 = sin;
        }
        float f13 = f10 + f8;
        float f14 = f11 + f9;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i8] = f8 + 0.0f;
        fArr[i8 + 1] = f9 + 0.0f;
        fArr[i8 + 2] = f13 + 0.0f;
        fArr[i8 + 3] = f9 + 0.0f;
        fArr[i8 + 4] = f13 + 0.0f;
        fArr[i8 + 5] = f14 + 0.0f;
        fArr[i8 + 6] = f8 + 0.0f;
        fArr[i8 + 7] = f14 + 0.0f;
    }

    boolean hasCustomData(String str) {
        return this.mAttributes.containsKey(str);
    }

    void initAxis(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f8 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f8;
        this.mDrawPath = keyPosition.mDrawPath;
        float f9 = Float.isNaN(keyPosition.mPercentWidth) ? f8 : keyPosition.mPercentWidth;
        float f10 = Float.isNaN(keyPosition.mPercentHeight) ? f8 : keyPosition.mPercentHeight;
        float f11 = motionPaths2.mWidth;
        float f12 = motionPaths.mWidth;
        float f13 = f11 - f12;
        float f14 = motionPaths2.mHeight;
        float f15 = motionPaths.mHeight;
        float f16 = f14 - f15;
        this.mPosition = this.mTime;
        float f17 = (f12 / 2.0f) + motionPaths.mX;
        float f18 = motionPaths.mY + (f15 / 2.0f);
        float f19 = motionPaths2.mX + (f11 / 2.0f);
        float f20 = motionPaths2.mY + (f14 / 2.0f);
        if (f17 > f19) {
            f17 = f19;
            f19 = f17;
        }
        if (f18 <= f20) {
            f18 = f20;
            f20 = f18;
        }
        float f21 = f19 - f17;
        float f22 = f18 - f20;
        float f23 = (f13 * f9) / 2.0f;
        this.mX = (int) ((r13 + (f21 * f8)) - f23);
        float f24 = (f16 * f10) / 2.0f;
        this.mY = (int) ((r1 + (f22 * f8)) - f24);
        this.mWidth = (int) (f12 + r9);
        this.mHeight = (int) (f15 + r12);
        float f25 = Float.isNaN(keyPosition.mPercentX) ? f8 : keyPosition.mPercentX;
        float f26 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f8 = keyPosition.mPercentY;
        }
        float f27 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 0;
        this.mX = (int) (((motionPaths.mX + (f25 * f21)) + (f27 * f22)) - f23);
        this.mY = (int) (((motionPaths.mY + (f21 * f26)) + (f22 * f8)) - f24);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f8 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f8;
        this.mDrawPath = keyPosition.mDrawPath;
        float f9 = Float.isNaN(keyPosition.mPercentWidth) ? f8 : keyPosition.mPercentWidth;
        float f10 = Float.isNaN(keyPosition.mPercentHeight) ? f8 : keyPosition.mPercentHeight;
        float f11 = motionPaths2.mWidth;
        float f12 = motionPaths.mWidth;
        float f13 = motionPaths2.mHeight;
        float f14 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f15 = motionPaths.mX;
        float f16 = motionPaths.mY;
        float f17 = (motionPaths2.mX + (f11 / 2.0f)) - ((f12 / 2.0f) + f15);
        float f18 = (motionPaths2.mY + (f13 / 2.0f)) - (f16 + (f14 / 2.0f));
        float f19 = ((f11 - f12) * f9) / 2.0f;
        this.mX = (int) ((f15 + (f17 * f8)) - f19);
        float f20 = ((f13 - f14) * f10) / 2.0f;
        this.mY = (int) ((f16 + (f18 * f8)) - f20);
        this.mWidth = (int) (f12 + r9);
        this.mHeight = (int) (f14 + r12);
        float f21 = Float.isNaN(keyPosition.mPercentX) ? f8 : keyPosition.mPercentX;
        float f22 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f8 = keyPosition.mPercentY;
        }
        float f23 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 0;
        this.mX = (int) (((motionPaths.mX + (f21 * f17)) + (f23 * f18)) - f19);
        this.mY = (int) (((motionPaths.mY + (f17 * f22)) + (f18 * f8)) - f20);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f8 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f8;
        this.mDrawPath = keyPosition.mDrawPath;
        float f9 = Float.isNaN(keyPosition.mPercentWidth) ? f8 : keyPosition.mPercentWidth;
        float f10 = Float.isNaN(keyPosition.mPercentHeight) ? f8 : keyPosition.mPercentHeight;
        float f11 = motionPaths2.mWidth - motionPaths.mWidth;
        float f12 = motionPaths2.mHeight - motionPaths.mHeight;
        this.mPosition = this.mTime;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f8 = keyPosition.mPercentX;
        }
        float f13 = motionPaths.mX;
        float f14 = motionPaths.mWidth;
        float f15 = motionPaths.mY;
        float f16 = motionPaths.mHeight;
        float f17 = (motionPaths2.mX + (motionPaths2.mWidth / 2.0f)) - ((f14 / 2.0f) + f13);
        float f18 = (motionPaths2.mY + (motionPaths2.mHeight / 2.0f)) - ((f16 / 2.0f) + f15);
        float f19 = f17 * f8;
        float f20 = (f11 * f9) / 2.0f;
        this.mX = (int) ((f13 + f19) - f20);
        float f21 = f8 * f18;
        float f22 = (f12 * f10) / 2.0f;
        this.mY = (int) ((f15 + f21) - f22);
        this.mWidth = (int) (f14 + r7);
        this.mHeight = (int) (f16 + r8);
        float f23 = Float.isNaN(keyPosition.mPercentY) ? 0.0f : keyPosition.mPercentY;
        this.mMode = 1;
        float f24 = (int) ((motionPaths.mX + f19) - f20);
        float f25 = (int) ((motionPaths.mY + f21) - f22);
        this.mX = f24 + ((-f18) * f23);
        this.mY = f25 + (f17 * f23);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void initPolar(int i8, int i9, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float min;
        float f8;
        float f9 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f9;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mMode = keyPosition.mPositionType;
        float f10 = Float.isNaN(keyPosition.mPercentWidth) ? f9 : keyPosition.mPercentWidth;
        float f11 = Float.isNaN(keyPosition.mPercentHeight) ? f9 : keyPosition.mPercentHeight;
        float f12 = motionPaths2.mWidth;
        float f13 = motionPaths.mWidth;
        float f14 = motionPaths2.mHeight;
        float f15 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        this.mWidth = (int) (f13 + ((f12 - f13) * f10));
        this.mHeight = (int) (f15 + ((f14 - f15) * f11));
        if (keyPosition.mPositionType != 2) {
            float f16 = Float.isNaN(keyPosition.mPercentX) ? f9 : keyPosition.mPercentX;
            float f17 = motionPaths2.mX;
            float f18 = motionPaths.mX;
            this.mX = (f16 * (f17 - f18)) + f18;
            if (!Float.isNaN(keyPosition.mPercentY)) {
                f9 = keyPosition.mPercentY;
            }
            float f19 = motionPaths2.mY;
            float f20 = motionPaths.mY;
            this.mY = (f9 * (f19 - f20)) + f20;
        } else {
            if (Float.isNaN(keyPosition.mPercentX)) {
                float f21 = motionPaths2.mX;
                float f22 = motionPaths.mX;
                min = ((f21 - f22) * f9) + f22;
            } else {
                min = Math.min(f11, f10) * keyPosition.mPercentX;
            }
            this.mX = min;
            if (Float.isNaN(keyPosition.mPercentY)) {
                float f23 = motionPaths2.mY;
                float f24 = motionPaths.mY;
                f8 = (f9 * (f23 - f24)) + f24;
            } else {
                f8 = keyPosition.mPercentY;
            }
            this.mY = f8;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void initScreen(int i8, int i9, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f8 = keyPosition.mFramePosition / 100.0f;
        this.mTime = f8;
        this.mDrawPath = keyPosition.mDrawPath;
        float f9 = Float.isNaN(keyPosition.mPercentWidth) ? f8 : keyPosition.mPercentWidth;
        float f10 = Float.isNaN(keyPosition.mPercentHeight) ? f8 : keyPosition.mPercentHeight;
        float f11 = motionPaths2.mWidth;
        float f12 = motionPaths.mWidth;
        float f13 = motionPaths2.mHeight;
        float f14 = motionPaths.mHeight;
        this.mPosition = this.mTime;
        float f15 = motionPaths.mX;
        float f16 = motionPaths.mY;
        float f17 = motionPaths2.mX + (f11 / 2.0f);
        float f18 = motionPaths2.mY + (f13 / 2.0f);
        float f19 = (f11 - f12) * f9;
        this.mX = (int) ((f15 + ((f17 - ((f12 / 2.0f) + f15)) * f8)) - (f19 / 2.0f));
        float f20 = (f13 - f14) * f10;
        this.mY = (int) ((f16 + ((f18 - (f16 + (f14 / 2.0f))) * f8)) - (f20 / 2.0f));
        this.mWidth = (int) (f12 + f19);
        this.mHeight = (int) (f14 + f20);
        this.mMode = 2;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.mX = (int) (keyPosition.mPercentX * (i8 - ((int) this.mWidth)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.mY = (int) (keyPosition.mPercentY * (i9 - ((int) this.mHeight)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void setBounds(float f8, float f9, float f10, float f11) {
        this.mX = f8;
        this.mY = f9;
        this.mWidth = f10;
        this.mHeight = f11;
    }

    void setDpDt(float f8, float f9, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f14 = (float) dArr[i8];
            double d8 = dArr2[i8];
            int i9 = iArr[i8];
            if (i9 == 1) {
                f10 = f14;
            } else if (i9 == 2) {
                f12 = f14;
            } else if (i9 == 3) {
                f11 = f14;
            } else if (i9 == 4) {
                f13 = f14;
            }
        }
        float f15 = f10 - ((0.0f * f11) / 2.0f);
        float f16 = f12 - ((0.0f * f13) / 2.0f);
        fArr[0] = (f15 * (1.0f - f8)) + (((f11 * 1.0f) + f15) * f8) + 0.0f;
        fArr[1] = (f16 * (1.0f - f9)) + (((f13 * 1.0f) + f16) * f9) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void setView(float f8, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z7) {
        float f9;
        float f10;
        float f11 = this.mX;
        float f12 = this.mY;
        float f13 = this.mWidth;
        float f14 = this.mHeight;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i8 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i8];
            this.mTempDelta = new double[i8];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i9 = 0; i9 < iArr.length; i9++) {
            double[] dArr4 = this.mTempValue;
            int i10 = iArr[i9];
            dArr4[i10] = dArr[i9];
            this.mTempDelta[i10] = dArr2[i9];
        }
        float f15 = Float.NaN;
        int i11 = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i11 >= dArr5.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr5[i11]);
            double d8 = i.DOUBLE_EPSILON;
            if (isNaN && (dArr3 == null || dArr3[i11] == i.DOUBLE_EPSILON)) {
                f10 = f15;
            } else {
                if (dArr3 != null) {
                    d8 = dArr3[i11];
                }
                if (!Double.isNaN(this.mTempValue[i11])) {
                    d8 = this.mTempValue[i11] + d8;
                }
                f10 = f15;
                float f20 = (float) d8;
                float f21 = (float) this.mTempDelta[i11];
                if (i11 == 1) {
                    f15 = f10;
                    f16 = f21;
                    f11 = f20;
                } else if (i11 == 2) {
                    f15 = f10;
                    f17 = f21;
                    f12 = f20;
                } else if (i11 == 3) {
                    f15 = f10;
                    f18 = f21;
                    f13 = f20;
                } else if (i11 == 4) {
                    f15 = f10;
                    f19 = f21;
                    f14 = f20;
                } else if (i11 == 5) {
                    f15 = f20;
                }
                i11++;
            }
            f15 = f10;
            i11++;
        }
        float f22 = f15;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(f8, fArr, fArr2);
            float f23 = fArr[0];
            float f24 = fArr[1];
            float f25 = fArr2[0];
            float f26 = fArr2[1];
            double d9 = f11;
            double d10 = f12;
            float sin = (float) ((f23 + (Math.sin(d10) * d9)) - (f13 / 2.0f));
            f9 = f14;
            float cos = (float) ((f24 - (Math.cos(d10) * d9)) - (f14 / 2.0f));
            double d11 = f16;
            double d12 = f17;
            float sin2 = (float) (f25 + (Math.sin(d10) * d11) + (Math.cos(d10) * d9 * d12));
            float cos2 = (float) ((f26 - (d11 * Math.cos(d10))) + (d9 * Math.sin(d10) * d12));
            if (dArr2.length >= 2) {
                dArr2[0] = sin2;
                dArr2[1] = cos2;
            }
            if (!Float.isNaN(f22)) {
                view.setRotation((float) (f22 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f11 = sin;
            f12 = cos;
        } else {
            f9 = f14;
            if (!Float.isNaN(f22)) {
                view.setRotation(f22 + ((float) Math.toDegrees(Math.atan2(f17 + (f19 / 2.0f), f16 + (f18 / 2.0f)))) + 0.0f);
            }
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).layout(f11, f12, f13 + f11, f12 + f9);
            return;
        }
        float f27 = f11 + 0.5f;
        int i12 = (int) f27;
        float f28 = f12 + 0.5f;
        int i13 = (int) f28;
        int i14 = (int) (f27 + f13);
        int i15 = (int) (f28 + f9);
        int i16 = i14 - i12;
        int i17 = i15 - i13;
        if (i16 != view.getMeasuredWidth() || i17 != view.getMeasuredHeight() || z7) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
        }
        view.layout(i12, i13, i14, i15);
    }

    public void setupRelative(MotionController motionController, MotionPaths motionPaths) {
        double d8 = ((this.mX + (this.mWidth / 2.0f)) - motionPaths.mX) - (motionPaths.mWidth / 2.0f);
        double d9 = ((this.mY + (this.mHeight / 2.0f)) - motionPaths.mY) - (motionPaths.mHeight / 2.0f);
        this.mRelativeToController = motionController;
        this.mX = (float) Math.hypot(d9, d8);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.mY = (float) (Math.atan2(d9, d8) + 1.5707963267948966d);
        } else {
            this.mY = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull MotionPaths motionPaths) {
        return Float.compare(this.mPosition, motionPaths.mPosition);
    }

    MotionPaths(int i8, int i9, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        int i10 = Key.UNSET;
        this.mPathMotionArc = i10;
        this.mAnimateRelativeTo = i10;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.mAttributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != Key.UNSET) {
            initPolar(i8, i9, keyPosition, motionPaths, motionPaths2);
            return;
        }
        int i11 = keyPosition.mPositionType;
        if (i11 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
            return;
        }
        if (i11 == 2) {
            initScreen(i8, i9, keyPosition, motionPaths, motionPaths2);
        } else if (i11 != 3) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initAxis(keyPosition, motionPaths, motionPaths2);
        }
    }

    void getCenter(double d8, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f8;
        float f9 = this.mX;
        float f10 = this.mY;
        float f11 = this.mWidth;
        float f12 = this.mHeight;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            float f17 = (float) dArr[i8];
            float f18 = (float) dArr2[i8];
            int i9 = iArr[i8];
            if (i9 == 1) {
                f9 = f17;
                f13 = f18;
            } else if (i9 == 2) {
                f10 = f17;
                f15 = f18;
            } else if (i9 == 3) {
                f11 = f17;
                f14 = f18;
            } else if (i9 == 4) {
                f12 = f17;
                f16 = f18;
            }
        }
        float f19 = 2.0f;
        float f20 = (f14 / 2.0f) + f13;
        float f21 = (f16 / 2.0f) + f15;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d8, fArr3, fArr4);
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            float f24 = fArr4[0];
            float f25 = fArr4[1];
            double d9 = f9;
            double d10 = f10;
            f8 = f11;
            float sin = (float) ((f22 + (Math.sin(d10) * d9)) - (f11 / 2.0f));
            float cos = (float) ((f23 - (d9 * Math.cos(d10))) - (f12 / 2.0f));
            double d11 = f13;
            double d12 = f15;
            float sin2 = (float) (f24 + (Math.sin(d10) * d11) + (Math.cos(d10) * d12));
            f21 = (float) ((f25 - (d11 * Math.cos(d10))) + (Math.sin(d10) * d12));
            f20 = sin2;
            f9 = sin;
            f10 = cos;
            f19 = 2.0f;
        } else {
            f8 = f11;
        }
        fArr[0] = f9 + (f8 / f19) + 0.0f;
        fArr[1] = f10 + (f12 / f19) + 0.0f;
        fArr2[0] = f20;
        fArr2[1] = f21;
    }
}
