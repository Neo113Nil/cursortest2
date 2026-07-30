package com.facebook.appevents.ml;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Operator {
    public static final Operator INSTANCE = new Operator();

    private Operator() {
    }

    public static final void addmv(MTensor mTensor, MTensor mTensor2) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return;
        }
        try {
            mTensor.getClass();
            mTensor2.getClass();
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            int shape3 = mTensor.getShape(2);
            float[] data = mTensor.getData();
            float[] data2 = mTensor2.getData();
            for (int i = 0; i < shape; i++) {
                for (int i2 = 0; i2 < shape2; i2++) {
                    for (int i3 = 0; i3 < shape3; i3++) {
                        int i4 = (i2 * shape3) + (i * shape2 * shape3) + i3;
                        data[i4] = data[i4] + data2[i3];
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
        }
    }

    public static final MTensor concatenate(MTensor[] mTensorArr) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            mTensorArr.getClass();
            int shape = mTensorArr[0].getShape(0);
            int i = 0;
            for (MTensor mTensor : mTensorArr) {
                i += mTensor.getShape(1);
            }
            MTensor mTensor2 = new MTensor(new int[]{shape, i});
            float[] data = mTensor2.getData();
            for (int i2 = 0; i2 < shape; i2++) {
                int i3 = i2 * i;
                int length = mTensorArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    float[] data2 = mTensorArr[i4].getData();
                    int shape2 = mTensorArr[i4].getShape(1);
                    System.arraycopy(data2, i2 * shape2, data, i3, shape2);
                    i3 += shape2;
                }
            }
            return mTensor2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final MTensor conv1D(MTensor mTensor, MTensor mTensor2) {
        MTensor mTensor3;
        MTensor mTensor4 = null;
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            mTensor.getClass();
            mTensor2.getClass();
            int i = 0;
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            int shape3 = mTensor.getShape(2);
            int shape4 = mTensor2.getShape(0);
            int i2 = (shape2 - shape4) + 1;
            int shape5 = mTensor2.getShape(2);
            MTensor mTensor5 = new MTensor(new int[]{shape, i2, shape5});
            float[] data = mTensor.getData();
            float[] data2 = mTensor5.getData();
            float[] data3 = mTensor2.getData();
            int i3 = 0;
            while (i3 < shape) {
                int i4 = i;
                while (i4 < shape5) {
                    int i5 = i;
                    while (i5 < i2) {
                        float f = 0.0f;
                        while (i < shape4) {
                            mTensor3 = mTensor4;
                            for (int i6 = 0; i6 < shape3; i6++) {
                                try {
                                    f = (data[((i + i5) * shape3) + (shape2 * shape3 * i3) + i6] * data3[(((i * shape3) + i6) * shape5) + i4]) + f;
                                } catch (Throwable th) {
                                    th = th;
                                    CrashShieldHandler.handleThrowable(th, Operator.class);
                                    return mTensor3;
                                }
                            }
                            i++;
                            mTensor4 = mTensor3;
                        }
                        MTensor mTensor6 = mTensor4;
                        data2[(i5 * shape5) + (i2 * shape5 * i3) + i4] = f;
                        i5++;
                        mTensor4 = mTensor6;
                        i = 0;
                    }
                    i4++;
                    i = 0;
                }
                i3++;
                i = 0;
            }
            return mTensor5;
        } catch (Throwable th2) {
            th = th2;
            mTensor3 = null;
        }
    }

    public static final MTensor dense(MTensor mTensor, MTensor mTensor2, MTensor mTensor3) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            mTensor.getClass();
            mTensor2.getClass();
            mTensor3.getClass();
            int shape = mTensor.getShape(0);
            int shape2 = mTensor3.getShape(0);
            MTensor mul = mul(mTensor, mTensor2);
            float[] data = mTensor3.getData();
            float[] data2 = mul.getData();
            for (int i = 0; i < shape; i++) {
                for (int i2 = 0; i2 < shape2; i2++) {
                    int i3 = (i * shape2) + i2;
                    data2[i3] = data2[i3] + data[i2];
                }
            }
            return mul;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final MTensor embedding(String[] strArr, int i, MTensor mTensor) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            strArr.getClass();
            mTensor.getClass();
            int length = strArr.length;
            int shape = mTensor.getShape(1);
            MTensor mTensor2 = new MTensor(new int[]{length, i, shape});
            float[] data = mTensor2.getData();
            float[] data2 = mTensor.getData();
            for (int i2 = 0; i2 < length; i2++) {
                int[] vectorize = Utils.INSTANCE.vectorize(strArr[i2], i);
                for (int i3 = 0; i3 < i; i3++) {
                    System.arraycopy(data2, vectorize[i3] * shape, data, (shape * i3) + (shape * i * i2), shape);
                }
            }
            return mTensor2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final void flatten(MTensor mTensor, int i) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return;
        }
        try {
            mTensor.getClass();
            if (i >= mTensor.getShapeSize()) {
                return;
            }
            int shapeSize = mTensor.getShapeSize();
            int i2 = 1;
            for (int i3 = i; i3 < shapeSize; i3++) {
                i2 *= mTensor.getShape(i3);
            }
            int[] iArr = new int[i + 1];
            for (int i4 = 0; i4 < i; i4++) {
                iArr[i4] = mTensor.getShape(i4);
            }
            iArr[i] = i2;
            mTensor.reshape(iArr);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
        }
    }

    public static final MTensor maxPool1D(MTensor mTensor, int i) {
        MTensor mTensor2;
        MTensor mTensor3 = null;
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            mTensor.getClass();
            int i2 = 0;
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            int shape3 = mTensor.getShape(2);
            int i3 = (shape2 - i) + 1;
            MTensor mTensor4 = new MTensor(new int[]{shape, i3, shape3});
            float[] data = mTensor.getData();
            float[] data2 = mTensor4.getData();
            int i4 = 0;
            while (i4 < shape) {
                int i5 = i2;
                while (i5 < shape3) {
                    int i6 = i2;
                    while (i6 < i3) {
                        int i7 = i6 * shape3;
                        int i8 = (i4 * i3 * shape3) + i7 + i5;
                        int i9 = (i4 * shape2 * shape3) + i7 + i5;
                        data2[i8] = Float.MIN_VALUE;
                        int i10 = i2;
                        while (i10 < i) {
                            mTensor2 = mTensor3;
                            try {
                                data2[i8] = Math.max(data2[i8], data[(i10 * shape3) + i9]);
                                i10++;
                                mTensor3 = mTensor2;
                            } catch (Throwable th) {
                                th = th;
                                CrashShieldHandler.handleThrowable(th, Operator.class);
                                return mTensor2;
                            }
                        }
                        i6++;
                        i2 = 0;
                    }
                    i5++;
                    i2 = 0;
                }
                i4++;
                i2 = 0;
            }
            return mTensor4;
        } catch (Throwable th2) {
            th = th2;
            mTensor2 = mTensor3;
        }
    }

    public static final MTensor mul(MTensor mTensor, MTensor mTensor2) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            mTensor.getClass();
            mTensor2.getClass();
            int shape = mTensor.getShape(0);
            int shape2 = mTensor2.getShape(0);
            int shape3 = mTensor2.getShape(1);
            MTensor mTensor3 = new MTensor(new int[]{shape, shape3});
            float[] data = mTensor.getData();
            float[] data2 = mTensor2.getData();
            float[] data3 = mTensor3.getData();
            for (int i = 0; i < shape; i++) {
                for (int i2 = 0; i2 < shape3; i2++) {
                    int i3 = (i * shape3) + i2;
                    data3[i3] = 0.0f;
                    for (int i4 = 0; i4 < shape2; i4++) {
                        data3[i3] = (data[(i * shape2) + i4] * data2[(i4 * shape3) + i2]) + data3[i3];
                    }
                }
            }
            return mTensor3;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final void relu(MTensor mTensor) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return;
        }
        try {
            mTensor.getClass();
            float[] data = mTensor.getData();
            int length = data.length;
            for (int i = 0; i < length; i++) {
                if (data[i] < 0.0f) {
                    data[i] = 0.0f;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
        }
    }

    public static final void softmax(MTensor mTensor) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return;
        }
        try {
            mTensor.getClass();
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            float[] data = mTensor.getData();
            for (int i = 0; i < shape; i++) {
                int i2 = i * shape2;
                int i3 = i2 + shape2;
                float f = Float.MIN_VALUE;
                for (int i4 = i2; i4 < i3; i4++) {
                    float f2 = data[i4];
                    if (f2 > f) {
                        f = f2;
                    }
                }
                float f3 = 0.0f;
                for (int i5 = i2; i5 < i3; i5++) {
                    float exp = (float) Math.exp(data[i5] - f);
                    data[i5] = exp;
                    f3 += exp;
                }
                while (i2 < i3) {
                    data[i2] = data[i2] / f3;
                    i2++;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
        }
    }

    public static final MTensor transpose2D(MTensor mTensor) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            mTensor.getClass();
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            MTensor mTensor2 = new MTensor(new int[]{shape2, shape});
            float[] data = mTensor.getData();
            float[] data2 = mTensor2.getData();
            for (int i = 0; i < shape; i++) {
                for (int i2 = 0; i2 < shape2; i2++) {
                    data2[(i2 * shape) + i] = data[(i * shape2) + i2];
                }
            }
            return mTensor2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }

    public static final MTensor transpose3D(MTensor mTensor) {
        if (CrashShieldHandler.isObjectCrashing(Operator.class)) {
            return null;
        }
        try {
            mTensor.getClass();
            int shape = mTensor.getShape(0);
            int shape2 = mTensor.getShape(1);
            int shape3 = mTensor.getShape(2);
            MTensor mTensor2 = new MTensor(new int[]{shape3, shape2, shape});
            float[] data = mTensor.getData();
            float[] data2 = mTensor2.getData();
            for (int i = 0; i < shape; i++) {
                for (int i2 = 0; i2 < shape2; i2++) {
                    for (int i3 = 0; i3 < shape3; i3++) {
                        data2[(i2 * shape) + (i3 * shape * shape2) + i] = data[(i2 * shape3) + (i * shape2 * shape3) + i3];
                    }
                }
            }
            return mTensor2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Operator.class);
            return null;
        }
    }
}
