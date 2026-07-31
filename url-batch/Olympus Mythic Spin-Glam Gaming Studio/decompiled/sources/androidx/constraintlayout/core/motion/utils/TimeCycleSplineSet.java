package androidx.constraintlayout.core.motion.utils;

import com.ironsource.X3;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes14.dex */
public abstract class TimeCycleSplineSet {
    protected static float VAL_2PI = 6.2831855f;
    protected int count;
    protected long last_time;
    protected CurveFit mCurveFit;
    protected String mType;
    protected int mWaveShape = 0;
    protected int[] mTimePoints = new int[10];
    protected float[][] mValues = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    protected float[] mCache = new float[3];
    protected boolean mContinue = false;
    protected float last_cycle = Float.NaN;

    public static class CustomSet extends TimeCycleSplineSet {
    }

    public static class CustomVarSet extends TimeCycleSplineSet {
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.count; i++) {
            str = str + X3.j.d + this.mTimePoints[i] + " , " + decimalFormat.format(this.mValues[i]) + "] ";
        }
        return str;
    }

    public void setType(String str) {
        this.mType = str;
    }

    protected float calcWave(float f) {
        float abs;
        switch (this.mWaveShape) {
            case 1:
                return Math.signum(f * VAL_2PI);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * VAL_2PI);
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f * VAL_2PI);
        }
        return 1.0f - abs;
    }

    protected void setStartTime(long j) {
        this.last_time = j;
    }

    public void setPoint(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.mTimePoints;
        int i3 = this.count;
        iArr[i3] = i;
        float[] fArr = this.mValues[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.mWaveShape = Math.max(this.mWaveShape, i2);
        this.count++;
    }

    public void setup(int i) {
        int i2;
        int i3 = this.count;
        if (i3 == 0) {
            System.err.println("Error no points added to " + this.mType);
            return;
        }
        Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i3 - 1);
        int i4 = 1;
        int i5 = 0;
        while (true) {
            int[] iArr = this.mTimePoints;
            if (i4 >= iArr.length) {
                break;
            }
            if (iArr[i4] != iArr[i4 - 1]) {
                i5++;
            }
            i4++;
        }
        if (i5 == 0) {
            i5 = 1;
        }
        double[] dArr = new double[i5];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i5, 3);
        int i6 = 0;
        for (0; i2 < this.count; i2 + 1) {
            if (i2 > 0) {
                int[] iArr2 = this.mTimePoints;
                i2 = iArr2[i2] == iArr2[i2 - 1] ? i2 + 1 : 0;
            }
            dArr[i6] = this.mTimePoints[i2] * 0.01d;
            double[] dArr3 = dArr2[i6];
            float[] fArr = this.mValues[i2];
            dArr3[0] = fArr[0];
            dArr3[1] = fArr[1];
            dArr3[2] = fArr[2];
            i6++;
        }
        this.mCurveFit = CurveFit.get(i, dArr, dArr2);
    }

    protected static class Sort {
        static void doubleQuickSort(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int partition = partition(iArr, fArr, i4, i6);
                    iArr2[i5] = partition - 1;
                    iArr2[i3 - 1] = i4;
                    int i7 = i3 + 1;
                    iArr2[i3] = i6;
                    i3 += 2;
                    iArr2[i7] = partition + 1;
                } else {
                    i3 = i5;
                }
            }
        }

        private static int partition(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    swap(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            swap(iArr, fArr, i4, i2);
            return i4;
        }

        private static void swap(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }
}
