package com.baidu.ar;

import com.baidu.ar.arplay.representation.Vector4f;

/* loaded from: classes.dex */
public class v8 {
    public static void a(double[] dArr, Vector4f vector4f) {
        if (dArr.length == 16) {
            double[] dArr2 = {vector4f.toArray()[0], vector4f.toArray()[1], vector4f.toArray()[2], vector4f.toArray()[3]};
            double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
            double d9 = 0.0d;
            double d10 = 0.0d;
            double d11 = 0.0d;
            for (int i8 = 0; i8 < 4; i8++) {
                int i9 = i8 * 4;
                double d12 = dArr[i9];
                double d13 = dArr2[i8];
                d11 += d12 * d13;
                d10 += dArr[i9 + 1] * d13;
                d9 += dArr[i9 + 2] * d13;
                d8 += dArr[i9 + 3] * d13;
            }
            vector4f.setX((float) d11);
            vector4f.setY((float) d10);
            vector4f.setZ((float) d9);
            vector4f.setW((float) d8);
        }
    }

    public static boolean a(float[] fArr, int i8, double[] dArr, int i9) {
        double d8 = dArr[i9];
        double d9 = dArr[i9 + 1];
        double d10 = dArr[i9 + 2];
        double d11 = dArr[i9 + 3];
        double d12 = dArr[i9 + 4];
        double d13 = dArr[i9 + 5];
        double d14 = dArr[i9 + 6];
        double d15 = dArr[i9 + 7];
        double d16 = dArr[i9 + 8];
        double d17 = dArr[i9 + 9];
        double d18 = dArr[i9 + 10];
        double d19 = dArr[i9 + 11];
        double d20 = dArr[i9 + 12];
        double d21 = dArr[i9 + 13];
        double d22 = dArr[i9 + 14];
        double d23 = dArr[i9 + 15];
        double d24 = d18 * d23;
        double d25 = d22 * d19;
        double d26 = d14 * d23;
        double d27 = d22 * d15;
        double d28 = d14 * d19;
        double d29 = d18 * d15;
        double d30 = d10 * d23;
        double d31 = d22 * d11;
        double d32 = d10 * d19;
        double d33 = d18 * d11;
        double d34 = d10 * d15;
        double d35 = d14 * d11;
        double d36 = (((d24 * d13) + (d27 * d17)) + (d28 * d21)) - (((d25 * d13) + (d26 * d17)) + (d29 * d21));
        double d37 = (((d25 * d9) + (d30 * d17)) + (d33 * d21)) - (((d24 * d9) + (d31 * d17)) + (d32 * d21));
        double d38 = (((d26 * d9) + (d31 * d13)) + (d34 * d21)) - (((d27 * d9) + (d30 * d13)) + (d35 * d21));
        double d39 = (((d29 * d9) + (d32 * d13)) + (d35 * d17)) - (((d28 * d9) + (d33 * d13)) + (d34 * d17));
        double d40 = (((d25 * d12) + (d26 * d16)) + (d29 * d20)) - (((d24 * d12) + (d27 * d16)) + (d28 * d20));
        double d41 = (((d24 * d8) + (d31 * d16)) + (d32 * d20)) - (((d25 * d8) + (d30 * d16)) + (d33 * d20));
        double d42 = (((d27 * d8) + (d30 * d12)) + (d35 * d20)) - (((d26 * d8) + (d31 * d12)) + (d34 * d20));
        double d43 = (((d28 * d8) + (d33 * d12)) + (d34 * d16)) - (((d29 * d8) + (d32 * d12)) + (d35 * d16));
        double d44 = d16 * d21;
        double d45 = d20 * d17;
        double d46 = d12 * d21;
        double d47 = d20 * d13;
        double d48 = d12 * d17;
        double d49 = d16 * d13;
        double d50 = d21 * d8;
        double d51 = d20 * d9;
        double d52 = d17 * d8;
        double d53 = d16 * d9;
        double d54 = d13 * d8;
        double d55 = d9 * d12;
        double d56 = (((d44 * d15) + (d47 * d19)) + (d48 * d23)) - (((d45 * d15) + (d46 * d19)) + (d49 * d23));
        double d57 = (((d45 * d11) + (d50 * d19)) + (d53 * d23)) - (((d44 * d11) + (d51 * d19)) + (d52 * d23));
        double d58 = (((d46 * d11) + (d51 * d15)) + (d54 * d23)) - (((d47 * d11) + (d50 * d15)) + (d23 * d55));
        double d59 = (((d49 * d11) + (d52 * d15)) + (d55 * d19)) - (((d11 * d48) + (d15 * d53)) + (d19 * d54));
        double d60 = (((d46 * d18) + (d49 * d22)) + (d45 * d14)) - (((d48 * d22) + (d44 * d14)) + (d47 * d18));
        double d61 = (((d52 * d22) + (d44 * d10)) + (d51 * d18)) - (((d50 * d18) + (d53 * d22)) + (d45 * d10));
        double d62 = (((d50 * d14) + (d55 * d22)) + (d47 * d10)) - (((d22 * d54) + (d46 * d10)) + (d51 * d14));
        double d63 = (((d54 * d18) + (d48 * d10)) + (d53 * d14)) - (((d52 * d14) + (d55 * d18)) + (d49 * d10));
        double d64 = (d8 * d36) + (d12 * d37) + (d16 * d38) + (d20 * d39);
        if (d64 == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            return false;
        }
        double d65 = 1.0d / d64;
        fArr[i8] = (float) (d36 * d65);
        fArr[i8 + 1] = (float) (d37 * d65);
        fArr[i8 + 2] = (float) (d38 * d65);
        fArr[i8 + 3] = (float) (d39 * d65);
        fArr[i8 + 4] = (float) (d40 * d65);
        fArr[i8 + 5] = (float) (d41 * d65);
        fArr[i8 + 6] = (float) (d42 * d65);
        fArr[i8 + 7] = (float) (d43 * d65);
        fArr[i8 + 8] = (float) (d56 * d65);
        fArr[i8 + 9] = (float) (d57 * d65);
        fArr[i8 + 10] = (float) (d58 * d65);
        fArr[i8 + 11] = (float) (d59 * d65);
        fArr[i8 + 12] = (float) (d60 * d65);
        fArr[i8 + 13] = (float) (d61 * d65);
        fArr[i8 + 14] = (float) (d62 * d65);
        fArr[i8 + 15] = (float) (d63 * d65);
        return true;
    }
}
