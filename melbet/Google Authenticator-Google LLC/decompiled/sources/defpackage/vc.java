package defpackage;

import android.graphics.Path;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vc {
    public char a;
    public final float[] b;

    public vc(vc vcVar) {
        this.a = vcVar.a;
        float[] fArr = vcVar.b;
        this.b = pi.v(fArr, fArr.length);
    }

    public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = d4 * sin;
        double d6 = d4;
        double d7 = f4;
        double d8 = f6;
        double d9 = (((-f) * sin) + (d6 * cos)) / d8;
        double d10 = (((-f3) * sin) + (d7 * cos)) / d8;
        double d11 = d9 - d10;
        double d12 = f5;
        double d13 = ((d3 * cos) + d5) / d12;
        double d14 = ((f3 * cos) + (d7 * sin)) / d12;
        double d15 = d13 - d14;
        double d16 = (d15 * d15) + (d11 * d11);
        if (d16 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d17 = (1.0d / d16) - 0.25d;
        if (d17 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d16);
            float sqrt = (float) (Math.sqrt(d16) / 1.99999d);
            a(path, f, f2, f3, f4, f5 * sqrt, sqrt * f6, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d17);
        double d18 = (d9 + d10) / 2.0d;
        double d19 = d15 * sqrt2;
        double d20 = (d13 + d14) / 2.0d;
        double d21 = sqrt2 * d11;
        if (z == z2) {
            d = d20 - d21;
            d2 = d18 + d19;
        } else {
            d = d20 + d21;
            d2 = d18 - d19;
        }
        double d22 = d2;
        double d23 = d;
        double atan2 = Math.atan2(d9 - d22, d13 - d);
        double atan22 = Math.atan2(d10 - d22, d14 - d23) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 += atan22 > 0.0d ? -6.283185307179586d : 6.283185307179586d;
        }
        double d24 = d23 * d12;
        double d25 = d22 * d8;
        double d26 = d24 * cos;
        double d27 = d25 * sin;
        double d28 = d24 * sin;
        double d29 = d25 * cos;
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d30 = -d12;
        double d31 = d30 * cos2;
        double d32 = d8 * sin2;
        double d33 = d30 * sin2;
        double d34 = d8 * cos2;
        double d35 = (sin3 * d33) + (cos3 * d34);
        double d36 = (d31 * sin3) - (d32 * cos3);
        double d37 = d3;
        int i = 0;
        double d38 = atan2;
        while (i < ceil) {
            double d39 = d12;
            double d40 = (atan22 / ceil) + d38;
            double sin4 = Math.sin(d40);
            double cos4 = Math.cos(d40);
            double d41 = d40 - d38;
            double tan = Math.tan(d41 / 2.0d);
            double sin5 = (Math.sin(d41) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
            int i2 = ceil;
            double d42 = d37 + (d36 * sin5);
            path.rLineTo(0.0f, 0.0f);
            double d43 = d28 + d29 + (d39 * sin2 * cos4) + (d34 * sin4);
            double d44 = ((d26 - d27) + ((d39 * cos2) * cos4)) - (d32 * sin4);
            double d45 = (sin4 * d33) + (cos4 * d34);
            double d46 = (d31 * sin4) - (d32 * cos4);
            path.cubicTo((float) d42, (float) (d6 + (d35 * sin5)), (float) (d44 - (sin5 * d46)), (float) (d43 - (sin5 * d45)), (float) d44, (float) d43);
            i++;
            d6 = d43;
            d33 = d33;
            d37 = d44;
            cos2 = cos2;
            atan22 = atan22;
            d35 = d45;
            d12 = d39;
            d36 = d46;
            sin2 = sin2;
            ceil = i2;
            d38 = d40;
        }
    }

    public vc(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }
}
