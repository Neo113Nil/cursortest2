package com.baidu.ar.arplay.representation;

import android.util.Log;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes.dex */
public class Number3D {
    public static final int M00 = 0;
    public static final int M01 = 4;
    public static final int M02 = 8;
    public static final int M03 = 12;
    public static final int M10 = 1;
    public static final int M11 = 5;
    public static final int M12 = 9;
    public static final int M13 = 13;
    public static final int M20 = 2;
    public static final int M21 = 6;
    public static final int M22 = 10;
    public static final int M23 = 14;
    public static final int M30 = 3;
    public static final int M31 = 7;
    public static final int M32 = 11;
    public static final int M33 = 15;
    private static Number3D _temp = new Number3D();

    /* renamed from: x, reason: collision with root package name */
    public float f1723x;

    /* renamed from: y, reason: collision with root package name */
    public float f1724y;

    /* renamed from: z, reason: collision with root package name */
    public float f1725z;

    /* renamed from: com.baidu.ar.arplay.representation.Number3D$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$baidu$ar$arplay$representation$Number3D$Axis;

        static {
            int[] iArr = new int[Axis.values().length];
            $SwitchMap$com$baidu$ar$arplay$representation$Number3D$Axis = iArr;
            try {
                iArr[Axis.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baidu$ar$arplay$representation$Number3D$Axis[Axis.Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baidu$ar$arplay$representation$Number3D$Axis[Axis.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum Axis {
        X,
        Y,
        Z
    }

    public Number3D() {
        this.f1723x = 0.0f;
        this.f1724y = 0.0f;
        this.f1725z = 0.0f;
    }

    public static Number3D getAxisVector(Axis axis) {
        Number3D number3D = new Number3D();
        int i8 = AnonymousClass1.$SwitchMap$com$baidu$ar$arplay$representation$Number3D$Axis[axis.ordinal()];
        if (i8 == 1) {
            number3D.setAll(1.0f, 0.0f, 0.0f);
        } else if (i8 == 2) {
            number3D.setAll(0.0f, 1.0f, 0.0f);
        } else if (i8 == 3) {
            number3D.setAll(0.0f, 0.0f, 1.0f);
        }
        return number3D;
    }

    public static Number3D getUpVector() {
        return new Number3D(0.0f, 1.0f, 0.0f);
    }

    public static Number3D lerp(Number3D number3D, Number3D number3D2, float f8) {
        Number3D number3D3 = new Number3D();
        float f9 = number3D.f1723x;
        number3D3.f1723x = f9 + ((number3D2.f1723x - f9) * f8);
        float f10 = number3D.f1724y;
        number3D3.f1724y = f10 + ((number3D2.f1724y - f10) * f8);
        float f11 = number3D.f1725z;
        number3D3.f1725z = f11 + ((number3D2.f1725z - f11) * f8);
        return number3D3;
    }

    public Number3D add(float f8, float f9, float f10) {
        this.f1723x += f8;
        this.f1724y += f9;
        this.f1725z += f10;
        return this;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Number3D m90clone() {
        return new Number3D(this.f1723x, this.f1724y, this.f1725z);
    }

    public Number3D cross(Number3D number3D) {
        _temp.setAllFrom(this);
        float f8 = number3D.f1724y;
        Number3D number3D2 = _temp;
        float f9 = number3D2.f1725z;
        float f10 = number3D.f1725z;
        this.f1723x = (f8 * f9) - (number3D2.f1724y * f10);
        float f11 = number3D2.f1723x;
        float f12 = number3D.f1723x;
        this.f1724y = (f10 * f11) - (f9 * f12);
        this.f1725z = (f12 * number3D2.f1724y) - (number3D.f1724y * f11);
        return this;
    }

    public float distanceTo(Number3D number3D) {
        float f8 = this.f1723x - number3D.f1723x;
        float f9 = this.f1724y - number3D.f1724y;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = this.f1725z - number3D.f1725z;
        return (float) Math.sqrt(f10 + (f11 * f11));
    }

    public float dot(Number3D number3D) {
        return (this.f1723x * number3D.f1723x) + (this.f1724y * number3D.f1724y) + (this.f1725z * number3D.f1725z);
    }

    public boolean equals(Object obj) {
        Number3D number3D = obj instanceof Number3D ? (Number3D) obj : null;
        return number3D != null && number3D.f1723x == this.f1723x && number3D.f1724y == this.f1724y && number3D.f1725z == this.f1725z;
    }

    public String formatIntToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append((int) this.f1723x);
        stringBuffer.append(", ");
        stringBuffer.append((int) this.f1724y);
        stringBuffer.append(", ");
        stringBuffer.append((int) this.f1725z);
        return stringBuffer.toString();
    }

    public Quaternion getRotationTo(Number3D number3D) {
        Quaternion quaternion = new Quaternion();
        normalize();
        number3D.normalize();
        float dot = dot(this, number3D);
        if (dot >= 1.0f) {
            quaternion.loadIdentityQuat();
        }
        if (dot < -0.999999f) {
            Number3D cross = cross(getAxisVector(Axis.X), this);
            if (cross.length() == 0.0f) {
                cross = cross(getAxisVector(Axis.Y), this);
            }
            cross.normalize();
            quaternion.setAxisAngle(new Vector3f(cross.f1723x, cross.f1724y, cross.f1725z), (float) Math.toDegrees(3.141592653589793d));
        } else {
            double sqrt = Math.sqrt((dot + 1.0f) * 2.0f);
            double d8 = 1.0d / sqrt;
            Number3D cross2 = cross(this, number3D);
            float[] fArr = quaternion.points;
            fArr[0] = (float) (cross2.f1723x * d8);
            fArr[1] = (float) (cross2.f1724y * d8);
            fArr[2] = (float) (cross2.f1725z * d8);
            fArr[3] = (float) (sqrt * 0.5d);
            quaternion.normalize();
        }
        return quaternion;
    }

    public Number3D inverse() {
        return new Number3D(-this.f1723x, -this.f1724y, -this.f1725z);
    }

    public float length() {
        float f8 = this.f1723x;
        float f9 = this.f1724y;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = this.f1725z;
        return (float) Math.sqrt(f10 + (f11 * f11));
    }

    public void lerpSelf(Number3D number3D, Number3D number3D2, float f8) {
        float f9 = number3D.f1723x;
        this.f1723x = f9 + ((number3D2.f1723x - f9) * f8);
        float f10 = number3D.f1724y;
        this.f1724y = f10 + ((number3D2.f1724y - f10) * f8);
        float f11 = number3D.f1725z;
        this.f1725z = f11 + ((number3D2.f1725z - f11) * f8);
    }

    public Number3D multiply(float f8) {
        this.f1723x *= f8;
        this.f1724y *= f8;
        this.f1725z *= f8;
        return this;
    }

    public float normalize() {
        float f8 = this.f1723x;
        float f9 = this.f1724y;
        float f10 = (f8 * f8) + (f9 * f9);
        float f11 = this.f1725z;
        double sqrt = Math.sqrt(f10 + (f11 * f11));
        if (sqrt != i.DOUBLE_EPSILON && sqrt != 1.0d) {
            sqrt = 1.0d / sqrt;
            this.f1723x = (float) (this.f1723x * sqrt);
            this.f1724y = (float) (this.f1724y * sqrt);
            this.f1725z = (float) (this.f1725z * sqrt);
        }
        return (float) sqrt;
    }

    public void project(float[] fArr) {
        if (fArr == null || fArr.length <= 15) {
            return;
        }
        float f8 = this.f1723x;
        float f9 = fArr[3] * f8;
        float f10 = this.f1724y;
        float f11 = f9 + (fArr[7] * f10);
        float f12 = this.f1725z;
        float f13 = f11 + (fArr[11] * f12) + fArr[15];
        setAll(((((fArr[0] * f8) + (fArr[4] * f10)) + (fArr[8] * f12)) + fArr[12]) / f13, ((((fArr[1] * f8) + (fArr[5] * f10)) + (fArr[9] * f12)) + fArr[13]) / f13, ((((f8 * fArr[2]) + (f10 * fArr[6])) + (f12 * fArr[10])) + fArr[14]) / f13);
    }

    public void rotateX(float f8) {
        double d8 = f8;
        double cos = Math.cos(d8);
        double sin = Math.sin(d8);
        _temp.setAll(this.f1723x, this.f1724y, this.f1725z);
        double d9 = _temp.f1725z;
        this.f1724y = (float) ((r11.f1724y * cos) - (d9 * sin));
        this.f1725z = (float) ((r11.f1724y * sin) + (d9 * cos));
    }

    public void rotateY(float f8) {
        double d8 = f8;
        double cos = Math.cos(d8);
        double sin = Math.sin(d8);
        _temp.setAll(this.f1723x, this.f1724y, this.f1725z);
        double d9 = _temp.f1725z;
        this.f1723x = (float) ((r11.f1723x * cos) + (d9 * sin));
        this.f1725z = (float) ((r11.f1723x * (-sin)) + (d9 * cos));
    }

    public void rotateZ(float f8) {
        double d8 = f8;
        double cos = Math.cos(d8);
        double sin = Math.sin(d8);
        _temp.setAll(this.f1723x, this.f1724y, this.f1725z);
        double d9 = _temp.f1724y;
        this.f1723x = (float) ((r11.f1723x * cos) - (d9 * sin));
        this.f1724y = (float) ((r11.f1723x * sin) + (d9 * cos));
    }

    public void setAll(double d8, double d9, double d10) {
        this.f1723x = (float) d8;
        this.f1724y = (float) d9;
        this.f1725z = (float) d10;
    }

    public void setAllFrom(Number3D number3D) {
        this.f1723x = number3D.f1723x;
        this.f1724y = number3D.f1724y;
        this.f1725z = number3D.f1725z;
    }

    public Number3D subtract(Number3D number3D) {
        this.f1723x -= number3D.f1723x;
        this.f1724y -= number3D.f1724y;
        this.f1725z -= number3D.f1725z;
        return this;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f1723x);
        stringBuffer.append(", ");
        stringBuffer.append(this.f1724y);
        stringBuffer.append(", ");
        stringBuffer.append(this.f1725z);
        return stringBuffer.toString();
    }

    public Number3D(double d8, double d9, double d10) {
        this.f1723x = (float) d8;
        this.f1724y = (float) d9;
        this.f1725z = (float) d10;
    }

    public static Number3D cross(Number3D number3D, Number3D number3D2) {
        float f8 = number3D2.f1724y;
        float f9 = number3D.f1725z;
        float f10 = number3D2.f1725z;
        float f11 = number3D.f1724y;
        float f12 = number3D.f1723x;
        float f13 = number3D2.f1723x;
        return new Number3D((f8 * f9) - (f10 * f11), (f10 * f12) - (f9 * f13), (f13 * f11) - (f8 * f12));
    }

    public static float dot(Number3D number3D, Number3D number3D2) {
        return (number3D.f1723x * number3D2.f1723x) + (number3D.f1724y * number3D2.f1724y) + (number3D.f1725z * number3D2.f1725z);
    }

    public static Number3D multiply(Number3D number3D, float f8) {
        return new Number3D(number3D.f1723x * f8, number3D.f1724y * f8, number3D.f1725z * f8);
    }

    public static Number3D subtract(Number3D number3D, Number3D number3D2) {
        return new Number3D(number3D.f1723x - number3D2.f1723x, number3D.f1724y - number3D2.f1724y, number3D.f1725z - number3D2.f1725z);
    }

    public Number3D add(Number3D number3D) {
        this.f1723x += number3D.f1723x;
        this.f1724y += number3D.f1724y;
        this.f1725z += number3D.f1725z;
        return this;
    }

    public void setAll(float f8, float f9, float f10) {
        this.f1723x = f8;
        this.f1724y = f9;
        this.f1725z = f10;
    }

    public Number3D(float f8, float f9, float f10) {
        this.f1723x = f8;
        this.f1724y = f9;
        this.f1725z = f10;
    }

    public static Number3D add(Number3D number3D, Number3D number3D2) {
        return new Number3D(number3D.f1723x + number3D2.f1723x, number3D.f1724y + number3D2.f1724y, number3D.f1725z + number3D2.f1725z);
    }

    public static Number3D multiply(Number3D number3D, Number3D number3D2) {
        return new Number3D(number3D.f1723x * number3D2.f1723x, number3D.f1724y * number3D2.f1724y, number3D.f1725z * number3D2.f1725z);
    }

    public Number3D(Number3D number3D) {
        this.f1723x = number3D.f1723x;
        this.f1724y = number3D.f1724y;
        this.f1725z = number3D.f1725z;
    }

    public void multiply(Number3D number3D) {
        this.f1723x *= number3D.f1723x;
        this.f1724y *= number3D.f1724y;
        this.f1725z *= number3D.f1725z;
    }

    public Number3D(String[] strArr) {
        if (strArr.length != 3) {
            Log.e(Number3D.class.getSimpleName(), "Number3D should be initialized with 3 values");
        }
        try {
            this.f1723x = Float.parseFloat(strArr[0]);
            this.f1724y = Float.parseFloat(strArr[1]);
            this.f1725z = Float.parseFloat(strArr[2]);
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
    }

    public void multiply(float[] fArr) {
        float f8 = this.f1723x;
        float f9 = this.f1724y;
        float f10 = this.f1725z;
        this.f1723x = (fArr[0] * f8) + (fArr[4] * f9) + (fArr[8] * f10) + fArr[12];
        this.f1724y = (fArr[1] * f8) + (fArr[5] * f9) + (fArr[9] * f10) + fArr[13];
        this.f1725z = (f8 * fArr[2]) + (f9 * fArr[6]) + (f10 * fArr[10]) + fArr[14];
    }
}
