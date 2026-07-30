package androidx.constraintlayout.core.motion.utils;

import com.github.mikephil.charting.utils.i;

/* loaded from: classes.dex */
public class LinearCurveFit extends CurveFit {
    private static final String TAG = "LinearCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;
    private double[] mT;
    private double mTotalLength;
    private double[][] mY;

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        this.mTotalLength = Double.NaN;
        int length = dArr2[0].length;
        this.mSlopeTemp = new double[length];
        this.mT = dArr;
        this.mY = dArr2;
        if (length > 2) {
            double d8 = 0.0d;
            double d9 = 0.0d;
            int i8 = 0;
            while (i8 < dArr.length) {
                double d10 = dArr2[i8][0];
                if (i8 > 0) {
                    Math.hypot(d10 - d8, d10 - d9);
                }
                i8++;
                d8 = d10;
                d9 = d8;
            }
            this.mTotalLength = i.DOUBLE_EPSILON;
        }
    }

    private double getLength2D(double d8) {
        if (Double.isNaN(this.mTotalLength)) {
            return i.DOUBLE_EPSILON;
        }
        double[] dArr = this.mT;
        int length = dArr.length;
        if (d8 <= dArr[0]) {
            return i.DOUBLE_EPSILON;
        }
        int i8 = length - 1;
        if (d8 >= dArr[i8]) {
            return this.mTotalLength;
        }
        double d9 = 0.0d;
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i9 = 0;
        while (i9 < i8) {
            double[] dArr2 = this.mY[i9];
            double d12 = dArr2[0];
            double d13 = dArr2[1];
            if (i9 > 0) {
                d9 += Math.hypot(d12 - d10, d13 - d11);
            }
            double[] dArr3 = this.mT;
            double d14 = dArr3[i9];
            if (d8 == d14) {
                return d9;
            }
            int i10 = i9 + 1;
            double d15 = dArr3[i10];
            if (d8 < d15) {
                double d16 = (d8 - d14) / (d15 - d14);
                double[][] dArr4 = this.mY;
                double[] dArr5 = dArr4[i9];
                double d17 = dArr5[0];
                double[] dArr6 = dArr4[i10];
                double d18 = 1.0d - d16;
                return d9 + Math.hypot(d13 - ((dArr5[1] * d18) + (dArr6[1] * d16)), d12 - ((d17 * d18) + (dArr6[0] * d16)));
            }
            i9 = i10;
            d10 = d12;
            d11 = d13;
        }
        return i.DOUBLE_EPSILON;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d8, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int i8 = 0;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            double d9 = dArr2[0];
            if (d8 <= d9) {
                getSlope(d9, this.mSlopeTemp);
                for (int i9 = 0; i9 < length2; i9++) {
                    dArr[i9] = this.mY[0][i9] + ((d8 - this.mT[0]) * this.mSlopeTemp[i9]);
                }
                return;
            }
            int i10 = length - 1;
            double d10 = dArr2[i10];
            if (d8 >= d10) {
                getSlope(d10, this.mSlopeTemp);
                while (i8 < length2) {
                    dArr[i8] = this.mY[i10][i8] + ((d8 - this.mT[i10]) * this.mSlopeTemp[i8]);
                    i8++;
                }
                return;
            }
        } else {
            if (d8 <= dArr2[0]) {
                for (int i11 = 0; i11 < length2; i11++) {
                    dArr[i11] = this.mY[0][i11];
                }
                return;
            }
            int i12 = length - 1;
            if (d8 >= dArr2[i12]) {
                while (i8 < length2) {
                    dArr[i8] = this.mY[i12][i8];
                    i8++;
                }
                return;
            }
        }
        int i13 = 0;
        while (i13 < length - 1) {
            if (d8 == this.mT[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = this.mY[i13][i14];
                }
            }
            double[] dArr3 = this.mT;
            int i15 = i13 + 1;
            double d11 = dArr3[i15];
            if (d8 < d11) {
                double d12 = dArr3[i13];
                double d13 = (d8 - d12) / (d11 - d12);
                while (i8 < length2) {
                    double[][] dArr4 = this.mY;
                    dArr[i8] = (dArr4[i13][i8] * (1.0d - d13)) + (dArr4[i15][i8] * d13);
                    i8++;
                }
                return;
            }
            i13 = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:
    
        if (r13 >= r4) goto L4;
     */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getSlope(double d8, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int length2 = this.mY[0].length;
        double d9 = dArr2[0];
        if (d8 > d9) {
            d9 = dArr2[length - 1];
        }
        d8 = d9;
        int i8 = 0;
        while (i8 < length - 1) {
            double[] dArr3 = this.mT;
            int i9 = i8 + 1;
            double d10 = dArr3[i9];
            if (d8 <= d10) {
                double d11 = d10 - dArr3[i8];
                for (int i10 = 0; i10 < length2; i10++) {
                    double[][] dArr4 = this.mY;
                    dArr[i10] = (dArr4[i9][i10] - dArr4[i8][i10]) / d11;
                }
                return;
            }
            i8 = i9;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0012, code lost:
    
        if (r8 >= r3) goto L4;
     */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double getSlope(double d8, int i8) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i9 = 0;
        double d9 = dArr[0];
        if (d8 >= d9) {
            d9 = dArr[length - 1];
        }
        d8 = d9;
        while (i9 < length - 1) {
            double[] dArr2 = this.mT;
            int i10 = i9 + 1;
            double d10 = dArr2[i10];
            if (d8 <= d10) {
                double d11 = d10 - dArr2[i9];
                double[][] dArr3 = this.mY;
                return (dArr3[i10][i8] - dArr3[i9][i8]) / d11;
            }
            i9 = i10;
        }
        return i.DOUBLE_EPSILON;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d8, float[] fArr) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i8 = 0;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            double d9 = dArr[0];
            if (d8 <= d9) {
                getSlope(d9, this.mSlopeTemp);
                for (int i9 = 0; i9 < length2; i9++) {
                    fArr[i9] = (float) (this.mY[0][i9] + ((d8 - this.mT[0]) * this.mSlopeTemp[i9]));
                }
                return;
            }
            int i10 = length - 1;
            double d10 = dArr[i10];
            if (d8 >= d10) {
                getSlope(d10, this.mSlopeTemp);
                while (i8 < length2) {
                    fArr[i8] = (float) (this.mY[i10][i8] + ((d8 - this.mT[i10]) * this.mSlopeTemp[i8]));
                    i8++;
                }
                return;
            }
        } else {
            if (d8 <= dArr[0]) {
                for (int i11 = 0; i11 < length2; i11++) {
                    fArr[i11] = (float) this.mY[0][i11];
                }
                return;
            }
            int i12 = length - 1;
            if (d8 >= dArr[i12]) {
                while (i8 < length2) {
                    fArr[i8] = (float) this.mY[i12][i8];
                    i8++;
                }
                return;
            }
        }
        int i13 = 0;
        while (i13 < length - 1) {
            if (d8 == this.mT[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) this.mY[i13][i14];
                }
            }
            double[] dArr2 = this.mT;
            int i15 = i13 + 1;
            double d11 = dArr2[i15];
            if (d8 < d11) {
                double d12 = dArr2[i13];
                double d13 = (d8 - d12) / (d11 - d12);
                while (i8 < length2) {
                    double[][] dArr3 = this.mY;
                    fArr[i8] = (float) ((dArr3[i13][i8] * (1.0d - d13)) + (dArr3[i15][i8] * d13));
                    i8++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d8, int i8) {
        double d9;
        double d10;
        double slope;
        double[] dArr = this.mT;
        int length = dArr.length;
        int i9 = 0;
        if (this.mExtrapolate) {
            double d11 = dArr[0];
            if (d8 <= d11) {
                d9 = this.mY[0][i8];
                d10 = d8 - d11;
                slope = getSlope(d11, i8);
            } else {
                int i10 = length - 1;
                double d12 = dArr[i10];
                if (d8 >= d12) {
                    d9 = this.mY[i10][i8];
                    d10 = d8 - d12;
                    slope = getSlope(d12, i8);
                }
            }
            return d9 + (d10 * slope);
        }
        if (d8 <= dArr[0]) {
            return this.mY[0][i8];
        }
        int i11 = length - 1;
        if (d8 >= dArr[i11]) {
            return this.mY[i11][i8];
        }
        while (i9 < length - 1) {
            double[] dArr2 = this.mT;
            double d13 = dArr2[i9];
            if (d8 == d13) {
                return this.mY[i9][i8];
            }
            int i12 = i9 + 1;
            double d14 = dArr2[i12];
            if (d8 < d14) {
                double d15 = (d8 - d13) / (d14 - d13);
                double[][] dArr3 = this.mY;
                return (dArr3[i9][i8] * (1.0d - d15)) + (dArr3[i12][i8] * d15);
            }
            i9 = i12;
        }
        return i.DOUBLE_EPSILON;
    }
}
