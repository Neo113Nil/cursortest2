package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.baidu.ar.util.SystemInfoUtil;
import com.github.mikephil.charting.utils.i;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class ViewTimeCycle extends TimeCycleSplineSet {
    private static final String TAG = "ViewTimeCycle";

    static class AlphaSet extends ViewTimeCycle {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setAlpha(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    public static class CustomSet extends ViewTimeCycle {
        String mAttributeName;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;
        SparseArray<float[]> mWaveProperties = new SparseArray<>();

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(SystemInfoUtil.COMMA)[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i8, float f8, float f9, int i9, float f10) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            this.mCurveFit.getPos(f8, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f9 = fArr[fArr.length - 2];
            float f10 = fArr[fArr.length - 1];
            long j9 = j8 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(view, this.mAttributeName, 0);
                this.mLastCycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.mLastCycle = 0.0f;
                }
            }
            float f11 = (float) ((this.mLastCycle + ((j9 * 1.0E-9d) * f9)) % 1.0d);
            this.mLastCycle = f11;
            this.mLastTime = j8;
            float calcWave = calcWave(f11);
            this.mContinue = false;
            int i8 = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i8 >= fArr2.length) {
                    break;
                }
                boolean z7 = this.mContinue;
                float f12 = this.mTempValues[i8];
                this.mContinue = z7 | (((double) f12) != i.DOUBLE_EPSILON);
                fArr2[i8] = (f12 * calcWave) + f10;
                i8++;
            }
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mCache);
            if (f9 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i8) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i9 = numberOfInterpolatedValues + 2;
            this.mTempValues = new float[i9];
            this.mCache = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i9);
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i10);
                ConstraintAttribute valueAt = this.mConstraintAttributeList.valueAt(i10);
                float[] valueAt2 = this.mWaveProperties.valueAt(i10);
                dArr[i10] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i11 = 0;
                while (true) {
                    if (i11 < this.mTempValues.length) {
                        dArr2[i10][i11] = r7[i11];
                        i11++;
                    }
                }
                double[] dArr3 = dArr2[i10];
                dArr3[numberOfInterpolatedValues] = valueAt2[0];
                dArr3[numberOfInterpolatedValues + 1] = valueAt2[1];
            }
            this.mCurveFit = CurveFit.get(i8, dArr, dArr2);
        }

        public void setPoint(int i8, ConstraintAttribute constraintAttribute, float f8, int i9, float f9) {
            this.mConstraintAttributeList.append(i8, constraintAttribute);
            this.mWaveProperties.append(i8, new float[]{f8, f9});
            this.mWaveShape = Math.max(this.mWaveShape, i9);
        }
    }

    static class ElevationSet extends ViewTimeCycle {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setElevation(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    public static class PathRotate extends ViewTimeCycle {
        public boolean setPathRotate(View view, KeyCache keyCache, float f8, long j8, double d8, double d9) {
            view.setRotation(get(f8, j8, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d9, d8))));
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            return this.mContinue;
        }
    }

    static class ProgressSet extends ViewTimeCycle {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f8, j8, view, keyCache));
            } else {
                if (this.mNoMethod) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.mNoMethod = true;
                    method = null;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(get(f8, j8, view, keyCache)));
                    } catch (IllegalAccessException e8) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e8);
                    } catch (InvocationTargetException e9) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e9);
                    }
                }
            }
            return this.mContinue;
        }
    }

    static class RotationSet extends ViewTimeCycle {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setRotation(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    static class RotationXset extends ViewTimeCycle {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setRotationX(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    static class RotationYset extends ViewTimeCycle {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setRotationY(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    static class ScaleXset extends ViewTimeCycle {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setScaleX(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    static class ScaleYset extends ViewTimeCycle {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setScaleY(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    static class TranslationXset extends ViewTimeCycle {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setTranslationX(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    static class TranslationYset extends ViewTimeCycle {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setTranslationY(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    static class TranslationZset extends ViewTimeCycle {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f8, long j8, KeyCache keyCache) {
            view.setTranslationZ(get(f8, j8, view, keyCache));
            return this.mContinue;
        }
    }

    public static ViewTimeCycle makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static ViewTimeCycle makeSpline(String str, long j8) {
        ViewTimeCycle rotationXset;
        str.hashCode();
        switch (str) {
            case "rotationX":
                rotationXset = new RotationXset();
                break;
            case "rotationY":
                rotationXset = new RotationYset();
                break;
            case "translationX":
                rotationXset = new TranslationXset();
                break;
            case "translationY":
                rotationXset = new TranslationYset();
                break;
            case "translationZ":
                rotationXset = new TranslationZset();
                break;
            case "progress":
                rotationXset = new ProgressSet();
                break;
            case "scaleX":
                rotationXset = new ScaleXset();
                break;
            case "scaleY":
                rotationXset = new ScaleYset();
                break;
            case "rotation":
                rotationXset = new RotationSet();
                break;
            case "elevation":
                rotationXset = new ElevationSet();
                break;
            case "transitionPathRotate":
                rotationXset = new PathRotate();
                break;
            case "alpha":
                rotationXset = new AlphaSet();
                break;
            default:
                return null;
        }
        rotationXset.setStartTime(j8);
        return rotationXset;
    }

    public float get(float f8, long j8, View view, KeyCache keyCache) {
        this.mCurveFit.getPos(f8, this.mCache);
        float[] fArr = this.mCache;
        float f9 = fArr[1];
        if (f9 == 0.0f) {
            this.mContinue = false;
            return fArr[2];
        }
        if (Float.isNaN(this.mLastCycle)) {
            float floatValue = keyCache.getFloatValue(view, this.mType, 0);
            this.mLastCycle = floatValue;
            if (Float.isNaN(floatValue)) {
                this.mLastCycle = 0.0f;
            }
        }
        float f10 = (float) ((this.mLastCycle + (((j8 - this.mLastTime) * 1.0E-9d) * f9)) % 1.0d);
        this.mLastCycle = f10;
        keyCache.setFloatValue(view, this.mType, 0, f10);
        this.mLastTime = j8;
        float f11 = this.mCache[0];
        float calcWave = (calcWave(this.mLastCycle) * f11) + this.mCache[2];
        this.mContinue = (f11 == 0.0f && f9 == 0.0f) ? false : true;
        return calcWave;
    }

    public abstract boolean setProperty(View view, float f8, long j8, KeyCache keyCache);
}
