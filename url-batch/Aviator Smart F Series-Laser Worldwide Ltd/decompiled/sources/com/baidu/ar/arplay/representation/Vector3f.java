package com.baidu.ar.arplay.representation;

/* loaded from: classes.dex */
public class Vector3f extends Renderable {
    private static final long serialVersionUID = -4565578579900616220L;
    public float[] points;

    public Vector3f() {
        this.points = new float[3];
    }

    public void add(float f8) {
        float[] fArr = this.points;
        fArr[0] = fArr[0] + f8;
        fArr[1] = fArr[1] + f8;
        fArr[2] = fArr[2] + f8;
    }

    public void clone(Vector3f vector3f) {
        System.arraycopy(vector3f.points, 0, this.points, 0, 3);
    }

    public Vector3f crossProduct(Vector3f vector3f) {
        Vector3f vector3f2 = new Vector3f();
        crossProduct(vector3f, vector3f2);
        return vector3f2;
    }

    public float dotProduct(Vector3f vector3f) {
        float[] fArr = this.points;
        float f8 = fArr[0];
        float[] fArr2 = vector3f.points;
        return (f8 * fArr2[0]) + (fArr[1] * fArr2[1]) + (fArr[2] * fArr2[2]);
    }

    public float getLength() {
        float[] fArr = this.points;
        float f8 = fArr[0];
        float f9 = fArr[1];
        float f10 = fArr[2];
        return (float) Math.sqrt((f8 * f8) + (f9 * f9) + (f10 * f10));
    }

    public float getX() {
        return this.points[0];
    }

    public float getY() {
        return this.points[1];
    }

    public float getZ() {
        return this.points[2];
    }

    public void multiplyByScalar(float f8) {
        float[] fArr = this.points;
        fArr[0] = fArr[0] * f8;
        fArr[1] = fArr[1] * f8;
        fArr[2] = fArr[2] * f8;
    }

    public void normalize() {
        float[] fArr = this.points;
        float f8 = fArr[0];
        float f9 = fArr[1];
        float f10 = fArr[2];
        double sqrt = Math.sqrt((f8 * f8) + (f9 * f9) + (f10 * f10));
        float[] fArr2 = this.points;
        fArr2[0] = (float) (fArr2[0] / sqrt);
        fArr2[1] = (float) (fArr2[1] / sqrt);
        fArr2[2] = (float) (fArr2[2] / sqrt);
    }

    public void setX(float f8) {
        this.points[0] = f8;
    }

    public void setXYZ(float f8, float f9, float f10) {
        float[] fArr = this.points;
        fArr[0] = f8;
        fArr[1] = f9;
        fArr[2] = f10;
    }

    public void setY(float f8) {
        this.points[1] = f8;
    }

    public void setZ(float f8) {
        this.points[2] = f8;
    }

    public void subtract(Vector3f vector3f) {
        float[] fArr = this.points;
        float f8 = fArr[0];
        float[] fArr2 = vector3f.points;
        fArr[0] = f8 - fArr2[0];
        fArr[1] = fArr[1] - fArr2[1];
        fArr[2] = fArr[2] - fArr2[2];
    }

    public float[] toArray() {
        return this.points;
    }

    public String toString() {
        return "X:" + this.points[0] + " Y:" + this.points[1] + " Z:" + this.points[2];
    }

    public float x() {
        return this.points[0];
    }

    public float y() {
        return this.points[1];
    }

    public float z() {
        return this.points[2];
    }

    public Vector3f(float f8) {
        this.points = new float[]{f8, f8, f8};
    }

    public void add(Vector3f vector3f) {
        float[] fArr = this.points;
        float f8 = fArr[0];
        float[] fArr2 = vector3f.points;
        fArr[0] = f8 + fArr2[0];
        fArr[1] = fArr[1] + fArr2[1];
        fArr[2] = fArr[2] + fArr2[2];
    }

    public void clone(float[] fArr) {
        System.arraycopy(fArr, 0, this.points, 0, 3);
    }

    public void crossProduct(Vector3f vector3f, Vector3f vector3f2) {
        float[] fArr = this.points;
        float f8 = fArr[1];
        float[] fArr2 = vector3f.points;
        vector3f2.setX((f8 * fArr2[2]) - (fArr[2] * fArr2[1]));
        float[] fArr3 = this.points;
        float f9 = fArr3[2];
        float[] fArr4 = vector3f.points;
        vector3f2.setY((f9 * fArr4[0]) - (fArr3[0] * fArr4[2]));
        float[] fArr5 = this.points;
        float f10 = fArr5[0];
        float[] fArr6 = vector3f.points;
        vector3f2.setZ((f10 * fArr6[1]) - (fArr5[1] * fArr6[0]));
    }

    public void x(float f8) {
        this.points[0] = f8;
    }

    public void y(float f8) {
        this.points[1] = f8;
    }

    public void z(float f8) {
        this.points[2] = f8;
    }

    public Vector3f(float f8, float f9, float f10) {
        this.points = new float[]{f8, f9, f10};
    }

    public Vector3f(Vector3f vector3f) {
        this.points = new float[]{r4[0], r4[1], r4[2]};
        float[] fArr = vector3f.points;
    }

    public Vector3f(Vector4f vector4f) {
        this.points = new float[3];
        if (vector4f.w() != 0.0f) {
            this.points[0] = vector4f.x() / vector4f.w();
            this.points[1] = vector4f.y() / vector4f.w();
            this.points[2] = vector4f.z() / vector4f.w();
        } else {
            this.points[0] = vector4f.x();
            this.points[1] = vector4f.y();
            this.points[2] = vector4f.z();
        }
    }
}
