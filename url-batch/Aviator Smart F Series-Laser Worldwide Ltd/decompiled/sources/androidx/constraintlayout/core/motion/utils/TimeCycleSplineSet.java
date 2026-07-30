package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import com.baidu.ar.util.SystemInfoUtil;
import com.github.mikephil.charting.utils.i;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class TimeCycleSplineSet {
    protected static final int CURVE_OFFSET = 2;
    protected static final int CURVE_PERIOD = 1;
    protected static final int CURVE_VALUE = 0;
    private static final String TAG = "SplineSet";
    protected static float sVal2PI = 6.2831855f;
    protected int mCount;
    protected CurveFit mCurveFit;
    protected long mLastTime;
    protected String mType;
    protected int mWaveShape = 0;
    protected int[] mTimePoints = new int[10];
    protected float[][] mValues = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    protected float[] mCache = new float[3];
    protected boolean mContinue = false;
    protected float mLastCycle = Float.NaN;

    public static class CustomSet extends TimeCycleSplineSet {
        String mAttributeName;
        KeyFrameArray.CustomArray mConstraintAttributeList;
        float[] mCustomCache;
        float[] mTempValues;
        KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            this.mAttributeName = str.split(SystemInfoUtil.COMMA)[1];
            this.mConstraintAttributeList = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i8, float f8, float f9, int i9, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean setProperty(MotionWidget motionWidget, float f8, long j8, KeyCache keyCache) {
            this.mCurveFit.getPos(f8, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f9 = fArr[fArr.length - 2];
            float f10 = fArr[fArr.length - 1];
            long j9 = j8 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
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
                float[] fArr2 = this.mCustomCache;
                if (i8 >= fArr2.length) {
                    break;
                }
                boolean z7 = this.mContinue;
                float f12 = this.mTempValues[i8];
                this.mContinue = z7 | (((double) f12) != i.DOUBLE_EPSILON);
                fArr2[i8] = (f12 * calcWave) + f10;
                i8++;
            }
            motionWidget.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), this.mCustomCache);
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
            this.mCustomCache = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i9);
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i10);
                CustomAttribute valueAt = this.mConstraintAttributeList.valueAt(i10);
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

        public void setPoint(int i8, CustomAttribute customAttribute, float f8, int i9, float f9) {
            this.mConstraintAttributeList.append(i8, customAttribute);
            this.mWaveProperties.append(i8, new float[]{f8, f9});
            this.mWaveShape = Math.max(this.mWaveShape, i9);
        }
    }

    public static class CustomVarSet extends TimeCycleSplineSet {
        String mAttributeName;
        KeyFrameArray.CustomVar mConstraintAttributeList;
        float[] mCustomCache;
        float[] mTempValues;
        KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();

        public CustomVarSet(String str, KeyFrameArray.CustomVar customVar) {
            this.mAttributeName = str.split(SystemInfoUtil.COMMA)[1];
            this.mConstraintAttributeList = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i8, float f8, float f9, int i9, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean setProperty(MotionWidget motionWidget, float f8, long j8, KeyCache keyCache) {
            this.mCurveFit.getPos(f8, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f9 = fArr[fArr.length - 2];
            float f10 = fArr[fArr.length - 1];
            long j9 = j8 - this.mLastTime;
            if (Float.isNaN(this.mLastCycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
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
                float[] fArr2 = this.mCustomCache;
                if (i8 >= fArr2.length) {
                    break;
                }
                boolean z7 = this.mContinue;
                float f12 = this.mTempValues[i8];
                this.mContinue = z7 | (((double) f12) != i.DOUBLE_EPSILON);
                fArr2[i8] = (f12 * calcWave) + f10;
                i8++;
            }
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mCustomCache);
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
            this.mCustomCache = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i9);
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i10);
                CustomVariable valueAt = this.mConstraintAttributeList.valueAt(i10);
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

        public void setPoint(int i8, CustomVariable customVariable, float f8, int i9, float f9) {
            this.mConstraintAttributeList.append(i8, customVariable);
            this.mWaveProperties.append(i8, new float[]{f8, f9});
            this.mWaveShape = Math.max(this.mWaveShape, i9);
        }
    }

    protected static class Sort {
        protected Sort() {
        }

        static void doubleQuickSort(int[] iArr, float[][] fArr, int i8, int i9) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i9;
            iArr2[1] = i8;
            int i10 = 2;
            while (i10 > 0) {
                int i11 = iArr2[i10 - 1];
                int i12 = i10 - 2;
                int i13 = iArr2[i12];
                if (i11 < i13) {
                    int partition = partition(iArr, fArr, i11, i13);
                    iArr2[i12] = partition - 1;
                    iArr2[i10 - 1] = i11;
                    int i14 = i10 + 1;
                    iArr2[i10] = i13;
                    i10 += 2;
                    iArr2[i14] = partition + 1;
                } else {
                    i10 = i12;
                }
            }
        }

        private static int partition(int[] iArr, float[][] fArr, int i8, int i9) {
            int i10 = iArr[i9];
            int i11 = i8;
            while (i8 < i9) {
                if (iArr[i8] <= i10) {
                    swap(iArr, fArr, i11, i8);
                    i11++;
                }
                i8++;
            }
            swap(iArr, fArr, i11, i9);
            return i11;
        }

        private static void swap(int[] iArr, float[][] fArr, int i8, int i9) {
            int i10 = iArr[i8];
            iArr[i8] = iArr[i9];
            iArr[i9] = i10;
            float[] fArr2 = fArr[i8];
            fArr[i8] = fArr[i9];
            fArr[i9] = fArr2;
        }
    }

    protected float calcWave(float f8) {
        float abs;
        switch (this.mWaveShape) {
            case 1:
                return Math.signum(f8 * sVal2PI);
            case 2:
                abs = Math.abs(f8);
                break;
            case 3:
                return (((f8 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f8 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f8 * sVal2PI);
            case 6:
                float abs2 = 1.0f - Math.abs(((f8 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f8 * sVal2PI);
        }
        return 1.0f - abs;
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int i8, float f8, float f9, int i9, float f10) {
        int[] iArr = this.mTimePoints;
        int i10 = this.mCount;
        iArr[i10] = i8;
        float[] fArr = this.mValues[i10];
        fArr[0] = f8;
        fArr[1] = f9;
        fArr[2] = f10;
        this.mWaveShape = Math.max(this.mWaveShape, i9);
        this.mCount++;
    }

    protected void setStartTime(long j8) {
        this.mLastTime = j8;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(int i8) {
        int i9;
        int i10 = this.mCount;
        if (i10 == 0) {
            System.err.println("Error no points added to " + this.mType);
            return;
        }
        Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i10 - 1);
        int i11 = 1;
        int i12 = 0;
        while (true) {
            int[] iArr = this.mTimePoints;
            if (i11 >= iArr.length) {
                break;
            }
            if (iArr[i11] != iArr[i11 - 1]) {
                i12++;
            }
            i11++;
        }
        if (i12 == 0) {
            i12 = 1;
        }
        double[] dArr = new double[i12];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i12, 3);
        int i13 = 0;
        while (i9 < this.mCount) {
            if (i9 > 0) {
                int[] iArr2 = this.mTimePoints;
                i9 = iArr2[i9] == iArr2[i9 + (-1)] ? i9 + 1 : 0;
            }
            dArr[i13] = this.mTimePoints[i9] * 0.01d;
            double[] dArr3 = dArr2[i13];
            float[] fArr = this.mValues[i9];
            dArr3[0] = fArr[0];
            dArr3[1] = fArr[1];
            dArr3[2] = fArr[2];
            i13++;
        }
        this.mCurveFit = CurveFit.get(i8, dArr, dArr2);
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i8 = 0; i8 < this.mCount; i8++) {
            str = str + "[" + this.mTimePoints[i8] + " , " + decimalFormat.format(this.mValues[i8]) + "] ";
        }
        return str;
    }
}
