package com.baidu.ar.arplay.representation;

/* loaded from: classes.dex */
public class Quaternion extends Vector4f {
    private static final long serialVersionUID = -7148812599404359073L;
    public Quaternion bufferQuaternion;
    private boolean dirty = false;
    private Matrixf4x4 matrix = new Matrixf4x4();

    public Quaternion() {
        loadIdentityQuat();
    }

    private void convertQuatToMatrix() {
        float[] fArr = this.points;
        float f8 = fArr[0];
        float f9 = fArr[1];
        float f10 = fArr[2];
        float f11 = fArr[3];
        float f12 = f9 * f9 * 2.0f;
        float f13 = f10 * f10 * 2.0f;
        this.matrix.setX0((1.0f - f12) - f13);
        float f14 = f8 * f9 * 2.0f;
        float f15 = f11 * f10 * 2.0f;
        this.matrix.setX1(f14 + f15);
        float f16 = f8 * f10 * 2.0f;
        float f17 = f11 * f9 * 2.0f;
        this.matrix.setX2(f16 - f17);
        this.matrix.setX3(0.0f);
        this.matrix.setY0(f14 - f15);
        float f18 = 1.0f - ((f8 * f8) * 2.0f);
        this.matrix.setY1(f18 - f13);
        float f19 = f9 * f10 * 2.0f;
        float f20 = f11 * f8 * 2.0f;
        this.matrix.setY2(f19 + f20);
        this.matrix.setY3(0.0f);
        this.matrix.setZ0(f16 + f17);
        this.matrix.setZ1(f19 - f20);
        this.matrix.setZ2(f18 - f12);
        this.matrix.setZ3(0.0f);
        this.matrix.setW0(0.0f);
        this.matrix.setW1(0.0f);
        this.matrix.setW2(0.0f);
        this.matrix.setW3(1.0f);
    }

    private void generateQuaternionFromMatrix() {
        float f8;
        float f9;
        float f10;
        float f11;
        float[] matrix = this.matrix.getMatrix();
        int[] iArr = this.matrix.size() == 16 ? this.matrix.isColumnMajor() ? Matrixf4x4.MAT_IND_COL_IN16_WITH3X3 : Matrixf4x4.MAT_IND_ROW_IN16_WITH3X3 : this.matrix.isColumnMajor() ? Matrixf4x4.MAT_IND_COL_IN9_WITH3X3 : Matrixf4x4.MAT_IND_ROW_IN9_WITH3X3;
        int i8 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        int i12 = iArr[4];
        int i13 = iArr[5];
        int i14 = iArr[6];
        int i15 = iArr[7];
        int i16 = iArr[8];
        if (this.matrix.size() >= 9) {
            float f12 = matrix[i8];
            float f13 = matrix[i12];
            float f14 = matrix[i16];
            float f15 = f12 + f13 + f14;
            if (f15 > 0.0f) {
                float sqrt = ((float) Math.sqrt(f15 + 1.0d)) * 2.0f;
                f8 = 0.25f * sqrt;
                f9 = (matrix[i15] - matrix[i13]) / sqrt;
                f10 = (matrix[i10] - matrix[i14]) / sqrt;
                f11 = (matrix[i11] - matrix[i9]) / sqrt;
            } else if (f12 > f13 && f12 > f14) {
                float sqrt2 = ((float) Math.sqrt(((f12 + 1.0d) - f13) - f14)) * 2.0f;
                f8 = (matrix[i15] - matrix[i13]) / sqrt2;
                f9 = 0.25f * sqrt2;
                float f16 = (matrix[i9] + matrix[i11]) / sqrt2;
                f11 = (matrix[i10] + matrix[i14]) / sqrt2;
                f10 = f16;
            } else if (f13 > f14) {
                float sqrt3 = ((float) Math.sqrt(((f13 + 1.0d) - f12) - f14)) * 2.0f;
                f8 = (matrix[i10] - matrix[i14]) / sqrt3;
                f9 = (matrix[i9] + matrix[i11]) / sqrt3;
                f10 = sqrt3 * 0.25f;
                f11 = (matrix[i13] + matrix[i15]) / sqrt3;
            } else {
                float sqrt4 = ((float) Math.sqrt(((f14 + 1.0d) - f12) - f13)) * 2.0f;
                f8 = (matrix[i11] - matrix[i9]) / sqrt4;
                f9 = (matrix[i10] + matrix[i14]) / sqrt4;
                f10 = (matrix[i13] + matrix[i15]) / sqrt4;
                f11 = sqrt4 * 0.25f;
            }
            setX(f9);
            setY(f10);
            setZ(f11);
            setW(f8);
        }
    }

    public void addQuat(Quaternion quaternion) {
        this.dirty = true;
        addQuat(quaternion, this);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Quaternion m91clone() {
        Quaternion quaternion = new Quaternion();
        quaternion.copyVec4(this);
        return quaternion;
    }

    public void copyFromVec3(Vector3f vector3f, float f8) {
        copyFromV3f(vector3f, f8);
    }

    public Matrixf4x4 getMatrix4x4() {
        if (this.dirty) {
            convertQuatToMatrix();
            this.dirty = false;
        }
        return this.matrix;
    }

    public final void loadIdentityQuat() {
        this.dirty = true;
        setX(0.0f);
        setY(0.0f);
        setZ(0.0f);
        setW(1.0f);
    }

    public void multiplyByQuat(Quaternion quaternion) {
        if (this.bufferQuaternion == null) {
            this.bufferQuaternion = new Quaternion();
        }
        this.dirty = true;
        this.bufferQuaternion.copyVec4(this);
        multiplyByQuat(quaternion, this.bufferQuaternion);
        copyVec4(this.bufferQuaternion);
    }

    public void normalise() {
        this.dirty = true;
        float[] fArr = this.points;
        float f8 = fArr[3];
        float f9 = fArr[0];
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = fArr[1];
        float f12 = fArr[2];
        float sqrt = (float) Math.sqrt(f10 + (f11 * f11) + (f12 * f12));
        float[] fArr2 = this.points;
        fArr2[3] = fArr2[3] / sqrt;
        fArr2[0] = fArr2[0] / sqrt;
        fArr2[1] = fArr2[1] / sqrt;
        fArr2[2] = fArr2[2] / sqrt;
    }

    @Override // com.baidu.ar.arplay.representation.Vector4f
    public void normalize() {
        normalise();
    }

    public void set(Quaternion quaternion) {
        this.dirty = true;
        copyVec4(quaternion);
    }

    public void setAxisAngle(Vector3f vector3f, float f8) {
        double d8 = f8 / 2.0f;
        float sin = (float) Math.sin(Math.toRadians(d8));
        setX(vector3f.getX() * sin);
        setY(vector3f.getY() * sin);
        setZ(vector3f.getZ() * sin);
        setW((float) Math.cos(Math.toRadians(d8)));
        this.dirty = true;
    }

    public void setAxisAngleRad(Vector3f vector3f, double d8) {
        setAxisAngle(vector3f, (float) Math.toDegrees(d8));
    }

    public void setColumnMajor(float[] fArr) {
        this.matrix.setMatrix(fArr);
        this.matrix.setColumnMajor(true);
        generateQuaternionFromMatrix();
    }

    public void setEulerAngle(float f8, float f9, float f10) {
        double radians = Math.toRadians(f10);
        double radians2 = Math.toRadians(f9);
        double radians3 = Math.toRadians(f8);
        double d8 = radians / 2.0d;
        double cos = Math.cos(d8);
        double sin = Math.sin(d8);
        double d9 = radians2 / 2.0d;
        double cos2 = Math.cos(d9);
        double sin2 = Math.sin(d9);
        double d10 = radians3 / 2.0d;
        double cos3 = Math.cos(d10);
        double sin3 = Math.sin(d10);
        double d11 = cos * cos2;
        double d12 = sin * sin2;
        setW((float) ((d11 * cos3) - (d12 * sin3)));
        setX((float) ((d11 * sin3) + (d12 * cos3)));
        double d13 = sin * cos2;
        double d14 = cos * sin2;
        setY((float) ((d13 * cos3) + (d14 * sin3)));
        setZ((float) ((d14 * cos3) - (d13 * sin3)));
        this.dirty = true;
    }

    public void setRowMajor(float[] fArr) {
        this.matrix.setMatrix(fArr);
        this.matrix.setColumnMajor(false);
        generateQuaternionFromMatrix();
    }

    public void slerp(Quaternion quaternion, Quaternion quaternion2, float f8) {
        float dotProduct = dotProduct(quaternion);
        if (dotProduct < 0.0f) {
            Quaternion quaternion3 = new Quaternion();
            dotProduct = -dotProduct;
            float[] fArr = quaternion3.points;
            float[] fArr2 = quaternion.points;
            fArr[0] = -fArr2[0];
            fArr[1] = -fArr2[1];
            fArr[2] = -fArr2[2];
            fArr[3] = -fArr2[3];
            quaternion = quaternion3;
        }
        if (Math.abs(dotProduct) >= 1.0d) {
            float[] fArr3 = quaternion2.points;
            float[] fArr4 = this.points;
            fArr3[0] = fArr4[0];
            fArr3[1] = fArr4[1];
            fArr3[2] = fArr4[2];
            fArr3[3] = fArr4[3];
            return;
        }
        double sqrt = Math.sqrt(1.0d - (dotProduct * dotProduct));
        double acos = Math.acos(dotProduct);
        double sin = Math.sin((1.0f - f8) * acos) / sqrt;
        double sin2 = Math.sin(f8 * acos) / sqrt;
        float[] fArr5 = quaternion2.points;
        float[] fArr6 = this.points;
        float[] fArr7 = quaternion.points;
        fArr5[3] = (float) ((fArr6[3] * sin) + (fArr7[3] * sin2));
        fArr5[0] = (float) ((fArr6[0] * sin) + (fArr7[0] * sin2));
        fArr5[1] = (float) ((fArr6[1] * sin) + (fArr7[1] * sin2));
        fArr5[2] = (float) ((fArr6[2] * sin) + (fArr7[2] * sin2));
    }

    public void subQuat(Quaternion quaternion) {
        this.dirty = true;
        subQuat(quaternion, this);
    }

    public void toAxisAngle(Vector4f vector4f) {
        float f8;
        float f9;
        float f10;
        if (getW() > 1.0f) {
            normalise();
        }
        float degrees = ((float) Math.toDegrees(Math.acos(getW()))) * 2.0f;
        float sqrt = (float) Math.sqrt(1.0f - (getW() * getW()));
        if (sqrt < 0.001d) {
            float[] fArr = this.points;
            f9 = fArr[0];
            f10 = fArr[1];
            f8 = fArr[2];
        } else {
            float[] fArr2 = this.points;
            float f11 = fArr2[0] / sqrt;
            float f12 = fArr2[1] / sqrt;
            f8 = fArr2[2] / sqrt;
            f9 = f11;
            f10 = f12;
        }
        float[] fArr3 = vector4f.points;
        fArr3[0] = f9;
        fArr3[1] = f10;
        fArr3[2] = f8;
        fArr3[3] = degrees;
    }

    public double[] toEulerAngles() {
        float w7 = this.points[1] * 2.0f * getW();
        float[] fArr = this.points;
        double d8 = w7 - ((fArr[0] * 2.0f) * fArr[2]);
        float f8 = fArr[1];
        float[] fArr2 = this.points;
        float w8 = this.points[0] * 2.0f * getW();
        float[] fArr3 = this.points;
        float f9 = fArr3[1] * 2.0f;
        float f10 = fArr3[2];
        float f11 = fArr3[0];
        return new double[]{Math.atan2(d8, (1.0f - ((f8 * f8) * 2.0f)) - ((r8 * r8) * 2.0f)), Math.asin((fArr2[0] * 2.0f * fArr2[1]) + (fArr2[2] * 2.0f * getW())), Math.atan2(w8 - (f9 * f10), (1.0f - ((f11 * f11) * 2.0f)) - ((f10 * f10) * 2.0f))};
    }

    @Override // com.baidu.ar.arplay.representation.Vector4f
    public String toString() {
        return "{X: " + getX() + ", Y:" + getY() + ", Z:" + getZ() + ", W:" + getW() + "}";
    }

    public void addQuat(Quaternion quaternion, Quaternion quaternion2) {
        quaternion2.setX(getX() + quaternion.getX());
        quaternion2.setY(getY() + quaternion.getY());
        quaternion2.setZ(getZ() + quaternion.getZ());
        quaternion2.setW(getW() + quaternion.getW());
    }

    public void multiplyByQuat(Quaternion quaternion, Quaternion quaternion2) {
        Vector4f vector4f = new Vector4f();
        if (quaternion != quaternion2) {
            float[] fArr = quaternion2.points;
            float[] fArr2 = this.points;
            float f8 = fArr2[3];
            float[] fArr3 = quaternion.points;
            float f9 = f8 * fArr3[3];
            float f10 = fArr2[0];
            float f11 = fArr3[0];
            float f12 = fArr2[1];
            float f13 = fArr3[1];
            float f14 = fArr2[2];
            float f15 = fArr3[2];
            fArr[3] = ((f9 - (f10 * f11)) - (f12 * f13)) - (f14 * f15);
            float f16 = fArr2[3];
            float f17 = fArr3[3];
            fArr[0] = (((f11 * f16) + (f10 * f17)) + (f12 * f15)) - (f14 * f13);
            float f18 = fArr3[0];
            float f19 = fArr2[0];
            fArr[1] = (((f13 * f16) + (f12 * f17)) + (f14 * f18)) - (f19 * f15);
            fArr[2] = (((f16 * f15) + (f14 * f17)) + (f19 * fArr3[1])) - (fArr2[1] * f18);
            return;
        }
        float[] fArr4 = vector4f.points;
        float[] fArr5 = quaternion.points;
        float f20 = fArr5[0];
        fArr4[0] = f20;
        float f21 = fArr5[1];
        fArr4[1] = f21;
        float f22 = fArr5[2];
        fArr4[2] = f22;
        float f23 = fArr5[3];
        fArr4[3] = f23;
        float[] fArr6 = quaternion2.points;
        float[] fArr7 = this.points;
        float f24 = fArr7[3] * f23;
        float f25 = fArr7[0];
        float f26 = fArr7[1];
        float f27 = fArr7[2];
        fArr6[3] = ((f24 - (f25 * f20)) - (f26 * f21)) - (f27 * f22);
        float f28 = fArr7[3];
        float f29 = fArr4[3];
        fArr6[0] = (((f20 * f28) + (f25 * f29)) + (f26 * f22)) - (f27 * f21);
        float f30 = fArr4[0];
        float f31 = fArr7[0];
        fArr6[1] = (((f21 * f28) + (f26 * f29)) + (f27 * f30)) - (f31 * f22);
        fArr6[2] = (((f28 * f22) + (f27 * f29)) + (f31 * fArr4[1])) - (fArr7[1] * f30);
    }

    public void subQuat(Quaternion quaternion, Quaternion quaternion2) {
        quaternion2.setX(getX() - quaternion.getX());
        quaternion2.setY(getY() - quaternion.getY());
        quaternion2.setZ(getZ() - quaternion.getZ());
        quaternion2.setW(getW() - quaternion.getW());
    }
}
