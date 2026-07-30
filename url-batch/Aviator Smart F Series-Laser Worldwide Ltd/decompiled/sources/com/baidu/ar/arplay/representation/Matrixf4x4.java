package com.baidu.ar.arplay.representation;

import android.util.Log;

/* loaded from: classes.dex */
public class Matrixf4x4 {
    public static final String TAG = "Matrixf4x4";
    public static final int[] MAT_IND_COL_IN9_WITH3X3 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    public static final int[] MAT_IND_COL_IN16_WITH3X3 = {0, 1, 2, 4, 5, 6, 8, 9, 10};
    public static final int[] MAT_IND_ROW_IN9_WITH3X3 = {0, 3, 6, 1, 4, 7, 3, 5, 8};
    public static final int[] MAT_IND_ROW_IN16_WITH3X3 = {0, 4, 8, 1, 5, 9, 2, 6, 10};
    public static final int[] MAT_IND_COL_IN16_WITH4X4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    public static final int[] MAT_IND_ROW_IN16_WITH4X4 = {0, 4, 8, 12, 1, 5, 9, 13, 2, 6, 10, 14, 3, 7, 11, 15};
    private boolean colMaj = true;
    private boolean matrixValid = false;
    public float[] matrix = new float[16];

    public Matrixf4x4() {
        loadIndentity();
    }

    public static Matrixf4x4 lookAtLH(Vector3f vector3f, Vector3f vector3f2, Vector3f vector3f3) {
        if (vector3f == null || vector3f2 == null || vector3f3 == null) {
            return null;
        }
        Vector3f vector3f4 = new Vector3f(vector3f2);
        vector3f4.subtract(vector3f);
        vector3f4.normalize();
        Vector3f vector3f5 = new Vector3f();
        new Vector3f(vector3f3).crossProduct(vector3f4, vector3f5);
        vector3f5.normalize();
        Vector3f vector3f6 = new Vector3f();
        new Vector3f(vector3f4).crossProduct(vector3f5, vector3f6);
        Matrixf4x4 matrixf4x4 = new Matrixf4x4();
        matrixf4x4.setX0(vector3f5.getX());
        matrixf4x4.setY0(vector3f5.getY());
        matrixf4x4.setZ0(vector3f5.getZ());
        matrixf4x4.setX1(vector3f6.getX());
        matrixf4x4.setY1(vector3f6.getY());
        matrixf4x4.setZ1(vector3f6.getZ());
        matrixf4x4.setX2(vector3f4.getX());
        matrixf4x4.setY2(vector3f4.getY());
        matrixf4x4.setZ2(vector3f4.getZ());
        matrixf4x4.setW0(-vector3f5.dotProduct(vector3f));
        matrixf4x4.setW1(-vector3f6.dotProduct(vector3f));
        matrixf4x4.setW2(-vector3f4.dotProduct(vector3f));
        return matrixf4x4;
    }

    public float[] getMatrix() {
        return this.matrix;
    }

    public boolean isColumnMajor() {
        return this.colMaj;
    }

    public boolean isMatrixValid() {
        return this.matrixValid;
    }

    public final void loadIndentity() {
        Matrix.setIdentityM(this.matrix, 0);
        this.matrixValid = true;
    }

    public void multiplyMatrix(float[] fArr, int i8, float[] fArr2, int i9) {
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                int i12 = i9 + i11;
                float f8 = fArr2[i12];
                float[] fArr3 = this.matrix;
                int i13 = (i10 * 4) + i11;
                fArr2[i12] = f8 + (fArr3[i13] * fArr[i8 + i10]);
                int i14 = i9 + 4 + i11;
                fArr2[i14] = fArr2[i14] + (fArr3[i13] * fArr[i8 + 4 + i10]);
                int i15 = i9 + 8 + i11;
                fArr2[i15] = fArr2[i15] + (fArr3[i13] * fArr[i8 + 8 + i10]);
                int i16 = i9 + 12 + i11;
                fArr2[i16] = fArr2[i16] + (fArr3[i13] * fArr[i8 + 12 + i10]);
            }
        }
    }

    public void multiplyMatrix4x4ByMatrix(Matrixf4x4 matrixf4x4) {
        if (this.matrixValid && matrixf4x4.isMatrixValid()) {
            float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            multiplyMatrix(matrixf4x4.getMatrix(), 0, fArr, 0);
            matrixf4x4.setMatrix(fArr);
            return;
        }
        Log.e(TAG, "matrixMatrix is invalid, internal is " + this.matrix.length + " long , input matrix is " + matrixf4x4.getMatrix().length + " long");
    }

    @Deprecated
    public void multiplyVector3fByMatrix(Vector3f vector3f) {
        float f8;
        float f9;
        if (!this.matrixValid || this.matrix.length != 9) {
            Log.e(TAG, "matrixMatrix is invalid, is " + this.matrix.length + " long, this function expects the internal matrix to be of size 9");
            return;
        }
        float[] array = vector3f.toArray();
        int i8 = 0;
        float f10 = 0.0f;
        if (this.colMaj) {
            f8 = 0.0f;
            float f11 = 0.0f;
            while (i8 < 3) {
                float[] fArr = this.matrix;
                float f12 = fArr[i8];
                float f13 = array[i8];
                f11 += f12 * f13;
                f8 += fArr[i8 + 3] * f13;
                f10 += fArr[i8 + 6] * f13;
                i8++;
            }
            float f14 = f11;
            f9 = f10;
            f10 = f14;
        } else {
            f8 = 0.0f;
            f9 = 0.0f;
            while (i8 < 3) {
                int i9 = i8 * 3;
                float[] fArr2 = this.matrix;
                float f15 = fArr2[i9];
                float f16 = array[i8];
                f10 += f15 * f16;
                f8 += fArr2[i9 + 1] * f16;
                f9 += fArr2[i9 + 2] * f16;
                i8++;
            }
        }
        vector3f.setX(f10);
        vector3f.setY(f8);
        vector3f.setZ(f9);
    }

    public void multiplyVector4fByMatrix(Vector4f vector4f) {
        float f8;
        float f9;
        float f10;
        if (!this.matrixValid || this.matrix.length != 16) {
            Log.e(TAG, "matrixMatrix is invalid, is " + this.matrix.length + " long, this equation expects a 16 value matrix");
            return;
        }
        float[] array = vector4f.toArray();
        int i8 = 0;
        float f11 = 0.0f;
        if (this.colMaj) {
            f9 = 0.0f;
            f8 = 0.0f;
            f10 = 0.0f;
            while (i8 < 4) {
                int i9 = i8 * 4;
                float[] fArr = this.matrix;
                float f12 = fArr[i9];
                float f13 = array[i8];
                f11 += f12 * f13;
                f9 += fArr[i9 + 1] * f13;
                f8 += fArr[i9 + 2] * f13;
                f10 += fArr[i9 + 3] * f13;
                i8++;
            }
        } else {
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            while (i8 < 4) {
                float[] fArr2 = this.matrix;
                float f17 = fArr2[i8];
                float f18 = array[i8];
                f16 += f17 * f18;
                f15 += fArr2[i8 + 4] * f18;
                f14 += fArr2[i8 + 8] * f18;
                f11 += fArr2[i8 + 12] * f18;
                i8++;
            }
            float f19 = f15;
            f8 = f14;
            f9 = f19;
            float f20 = f16;
            f10 = f11;
            f11 = f20;
        }
        vector4f.setX(f11);
        vector4f.setY(f9);
        vector4f.setZ(f8);
        vector4f.setW(f10);
    }

    public void setColumnMajor(boolean z7) {
        this.colMaj = z7;
    }

    public void setMatrix(float[] fArr) {
        this.matrix = fArr;
        if (fArr.length == 16 || fArr.length == 9) {
            this.matrixValid = true;
            return;
        }
        this.matrixValid = false;
        Log.e(TAG, "matrixMatrix set is invalid, size is " + fArr.length + " expected 9 or 16");
    }

    public void setMatrixValues(float[] fArr) {
        if (this.matrix.length != fArr.length) {
            Log.e(TAG, "matrixMatrix set is invalid, size is " + fArr.length + " expected 9 or 16");
        }
        for (int i8 = 0; i8 < fArr.length; i8++) {
            this.matrix[i8] = fArr[i8];
        }
    }

    public void setW0(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH4X4[12]] = f8;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH4X4[12]] = f8;
                }
            }
        }
    }

    public void setW1(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH4X4[13]] = f8;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH4X4[13]] = f8;
                }
            }
        }
    }

    public void setW2(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH4X4[14]] = f8;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH4X4[14]] = f8;
                }
            }
        }
    }

    public void setW3(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH4X4[15]] = f8;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH4X4[15]] = f8;
                }
            }
        }
    }

    public void setX0(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH3X3[0]] = f8;
                    return;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH3X3[0]] = f8;
                    return;
                }
            }
            if (this.colMaj) {
                fArr[MAT_IND_COL_IN9_WITH3X3[0]] = f8;
            } else {
                fArr[MAT_IND_ROW_IN9_WITH3X3[0]] = f8;
            }
        }
    }

    public void setX1(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH3X3[1]] = f8;
                    return;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH3X3[1]] = f8;
                    return;
                }
            }
            if (this.colMaj) {
                fArr[MAT_IND_COL_IN9_WITH3X3[1]] = f8;
            } else {
                fArr[MAT_IND_ROW_IN9_WITH3X3[1]] = f8;
            }
        }
    }

    public void setX2(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH3X3[2]] = f8;
                    return;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH3X3[2]] = f8;
                    return;
                }
            }
            if (this.colMaj) {
                fArr[MAT_IND_COL_IN9_WITH3X3[2]] = f8;
            } else {
                fArr[MAT_IND_ROW_IN9_WITH3X3[2]] = f8;
            }
        }
    }

    public void setX3(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH4X4[3]] = f8;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH4X4[3]] = f8;
                }
            }
        }
    }

    public void setY0(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH3X3[3]] = f8;
                    return;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH3X3[3]] = f8;
                    return;
                }
            }
            if (this.colMaj) {
                fArr[MAT_IND_COL_IN9_WITH3X3[3]] = f8;
            } else {
                fArr[MAT_IND_ROW_IN9_WITH3X3[3]] = f8;
            }
        }
    }

    public void setY1(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH3X3[4]] = f8;
                    return;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH3X3[4]] = f8;
                    return;
                }
            }
            if (this.colMaj) {
                fArr[MAT_IND_COL_IN9_WITH3X3[4]] = f8;
            } else {
                fArr[MAT_IND_ROW_IN9_WITH3X3[4]] = f8;
            }
        }
    }

    public void setY2(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH3X3[5]] = f8;
                    return;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH3X3[5]] = f8;
                    return;
                }
            }
            if (this.colMaj) {
                fArr[MAT_IND_COL_IN9_WITH3X3[5]] = f8;
            } else {
                fArr[MAT_IND_ROW_IN9_WITH3X3[5]] = f8;
            }
        }
    }

    public void setY3(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH4X4[7]] = f8;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH4X4[7]] = f8;
                }
            }
        }
    }

    public void setZ0(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH3X3[6]] = f8;
                    return;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH3X3[6]] = f8;
                    return;
                }
            }
            if (this.colMaj) {
                fArr[MAT_IND_COL_IN9_WITH3X3[6]] = f8;
            } else {
                fArr[MAT_IND_ROW_IN9_WITH3X3[6]] = f8;
            }
        }
    }

    public void setZ1(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH3X3[7]] = f8;
                    return;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH3X3[7]] = f8;
                    return;
                }
            }
            if (this.colMaj) {
                fArr[MAT_IND_COL_IN9_WITH3X3[7]] = f8;
            } else {
                fArr[MAT_IND_ROW_IN9_WITH3X3[7]] = f8;
            }
        }
    }

    public void setZ2(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH3X3[8]] = f8;
                    return;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH3X3[8]] = f8;
                    return;
                }
            }
            if (this.colMaj) {
                fArr[MAT_IND_COL_IN9_WITH3X3[8]] = f8;
            } else {
                fArr[MAT_IND_ROW_IN9_WITH3X3[8]] = f8;
            }
        }
    }

    public void setZ3(float f8) {
        if (this.matrixValid) {
            float[] fArr = this.matrix;
            if (fArr.length == 16) {
                if (this.colMaj) {
                    fArr[MAT_IND_COL_IN16_WITH4X4[11]] = f8;
                } else {
                    fArr[MAT_IND_ROW_IN16_WITH4X4[11]] = f8;
                }
            }
        }
    }

    public int size() {
        return this.matrix.length;
    }

    public void transpose() {
        if (this.matrixValid) {
            int i8 = 0;
            if (this.matrix.length != 16) {
                float[] fArr = new float[9];
                while (i8 < 3) {
                    int i9 = i8 * 3;
                    float[] fArr2 = this.matrix;
                    fArr[i9] = fArr2[i8];
                    fArr[i9 + 1] = fArr2[i8 + 3];
                    fArr[i9 + 2] = fArr2[i8 + 6];
                    i8++;
                }
                this.matrix = fArr;
                return;
            }
            float[] fArr3 = new float[16];
            while (i8 < 4) {
                int i10 = i8 * 4;
                float[] fArr4 = this.matrix;
                fArr3[i10] = fArr4[i8];
                fArr3[i10 + 1] = fArr4[i8 + 4];
                fArr3[i10 + 2] = fArr4[i8 + 8];
                fArr3[i10 + 3] = fArr4[i8 + 12];
                i8++;
            }
            this.matrix = fArr3;
        }
    }
}
