package com.baidu.ar.arplay.representation;

/* loaded from: classes.dex */
public class Vector4f extends Renderable {
    private static final long serialVersionUID = 1;
    public float[] points;

    public Vector4f() {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.points = fArr;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
    }

    public void add(Vector3f vector3f, float f8) {
        float[] fArr = this.points;
        fArr[0] = fArr[0] + vector3f.x();
        float[] fArr2 = this.points;
        fArr2[1] = fArr2[1] + vector3f.y();
        float[] fArr3 = this.points;
        fArr3[2] = fArr3[2] + vector3f.z();
        float[] fArr4 = this.points;
        fArr4[3] = fArr4[3] + f8;
    }

    public boolean compareTo(Vector4f vector4f) {
        float[] fArr = this.points;
        float f8 = fArr[0];
        float[] fArr2 = vector4f.points;
        return f8 == fArr2[0] && fArr[1] == fArr2[1] && fArr[2] == fArr2[2] && fArr[3] == fArr2[3];
    }

    public void copyFromV3f(Vector3f vector3f, float f8) {
        this.points[0] = vector3f.x();
        this.points[1] = vector3f.y();
        this.points[2] = vector3f.z();
        this.points[3] = f8;
    }

    public void copyVec4(Vector4f vector4f) {
        float[] fArr = this.points;
        float[] fArr2 = vector4f.points;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[3];
    }

    public float dotProduct(Vector4f vector4f) {
        float[] fArr = this.points;
        float f8 = fArr[0];
        float[] fArr2 = vector4f.points;
        return (f8 * fArr2[0]) + (fArr[1] * fArr2[1]) + (fArr[2] * fArr2[2]) + (fArr[3] * fArr2[3]);
    }

    public float getW() {
        return this.points[3];
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

    public void lerp(Vector4f vector4f, Vector4f vector4f2, float f8) {
        float[] fArr = vector4f2.points;
        float[] fArr2 = this.points;
        float f9 = 1.0f * f8;
        float f10 = fArr2[0] * f9;
        float[] fArr3 = vector4f.points;
        fArr[0] = f10 + (fArr3[0] * f8);
        fArr[1] = (fArr2[1] * f9) + (fArr3[1] * f8);
        fArr[2] = (fArr2[2] * f9) + (fArr3[2] * f8);
        fArr[3] = (fArr2[3] * f9) + (fArr3[3] * f8);
    }

    public void multiplyByScalar(float f8) {
        float[] fArr = this.points;
        fArr[0] = fArr[0] * f8;
        fArr[1] = fArr[1] * f8;
        fArr[2] = fArr[2] * f8;
        fArr[3] = fArr[3] * f8;
    }

    public void normalize() {
        float[] fArr = this.points;
        float f8 = fArr[3];
        if (f8 == 0.0f) {
            return;
        }
        fArr[0] = fArr[0] / f8;
        fArr[1] = fArr[1] / f8;
        fArr[2] = fArr[2] / f8;
        double sqrt = Math.sqrt((r3 * r3) + (r5 * r5) + (r7 * r7));
        float[] fArr2 = this.points;
        fArr2[0] = (float) (fArr2[0] / sqrt);
        fArr2[1] = (float) (fArr2[1] / sqrt);
        fArr2[2] = (float) (fArr2[2] / sqrt);
    }

    public void setW(float f8) {
        this.points[3] = f8;
    }

    public void setX(float f8) {
        this.points[0] = f8;
    }

    public void setXYZW(float f8, float f9, float f10, float f11) {
        float[] fArr = this.points;
        fArr[0] = f8;
        fArr[1] = f9;
        fArr[2] = f10;
        fArr[3] = f11;
    }

    public void setY(float f8) {
        this.points[1] = f8;
    }

    public void setZ(float f8) {
        this.points[2] = f8;
    }

    public void subdivide(Vector4f vector4f) {
        float[] fArr = this.points;
        float f8 = fArr[0];
        float[] fArr2 = vector4f.points;
        fArr[0] = f8 / fArr2[0];
        fArr[1] = fArr[1] / fArr2[1];
        fArr[2] = fArr[2] / fArr2[2];
        fArr[3] = fArr[3] / fArr2[3];
    }

    public void subtract(Vector4f vector4f) {
        float[] fArr = this.points;
        float f8 = fArr[0];
        float[] fArr2 = vector4f.points;
        fArr[0] = f8 - fArr2[0];
        fArr[1] = fArr[1] - fArr2[1];
        fArr[2] = fArr[2] - fArr2[2];
        fArr[3] = fArr[3] - fArr2[3];
    }

    public float[] toArray() {
        return this.points;
    }

    public String toString() {
        return "X:" + this.points[0] + " Y:" + this.points[1] + " Z:" + this.points[2] + " W:" + this.points[3];
    }

    public float w() {
        return this.points[3];
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

    public Vector4f(float f8, float f9, float f10, float f11) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.points = fArr;
        fArr[0] = f8;
        fArr[1] = f9;
        fArr[2] = f10;
        fArr[3] = f11;
    }

    public void add(Vector4f vector4f) {
        float[] fArr = this.points;
        float f8 = fArr[0];
        float[] fArr2 = vector4f.points;
        fArr[0] = f8 + fArr2[0];
        fArr[1] = fArr[1] + fArr2[1];
        fArr[2] = fArr[2] + fArr2[2];
        fArr[3] = fArr[3] + fArr2[3];
    }

    public void subtract(Vector4f vector4f, Vector4f vector4f2) {
        float[] fArr = this.points;
        float f8 = fArr[0];
        float[] fArr2 = vector4f.points;
        vector4f2.setXYZW(f8 - fArr2[0], fArr[1] - fArr2[1], fArr[2] - fArr2[2], fArr[3] - fArr2[3]);
    }

    public void w(float f8) {
        this.points[3] = f8;
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

    public Vector4f(Vector3f vector3f, float f8) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.points = fArr;
        fArr[0] = vector3f.x();
        this.points[1] = vector3f.y();
        this.points[2] = vector3f.z();
        this.points[3] = f8;
    }
}
