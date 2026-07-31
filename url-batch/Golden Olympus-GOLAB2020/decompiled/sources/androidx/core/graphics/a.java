package androidx.core.graphics;

import android.graphics.Color;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f11769a = new ThreadLocal();

    public static void a(int i4, int i5, int i6, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d4 = i4 / 255.0d;
        double pow = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        double d5 = i5 / 255.0d;
        double pow2 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d6 = i6 / 255.0d;
        double pow3 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
        dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
        dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
    }

    public static int b(double d4, double d5, double d6) {
        double d7 = (((3.2406d * d4) + ((-1.5372d) * d5)) + ((-0.4986d) * d6)) / 100.0d;
        double d8 = ((((-0.9689d) * d4) + (1.8758d * d5)) + (0.0415d * d6)) / 100.0d;
        double d9 = (((0.0557d * d4) + ((-0.204d) * d5)) + (1.057d * d6)) / 100.0d;
        return Color.rgb(i((int) Math.round((d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE), i((int) Math.round((d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE), i((int) Math.round((d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public static int c(int i4, int i5, float f4) {
        float f5 = 1.0f - f4;
        return Color.argb((int) ((Color.alpha(i4) * f5) + (Color.alpha(i5) * f4)), (int) ((Color.red(i4) * f5) + (Color.red(i5) * f4)), (int) ((Color.green(i4) * f5) + (Color.green(i5) * f4)), (int) ((Color.blue(i4) * f5) + (Color.blue(i5) * f4)));
    }

    public static double d(int i4) {
        double[] j4 = j();
        e(i4, j4);
        return j4[1] / 100.0d;
    }

    public static void e(int i4, double[] dArr) {
        a(Color.red(i4), Color.green(i4), Color.blue(i4), dArr);
    }

    private static int f(int i4, int i5) {
        return 255 - (((255 - i5) * (255 - i4)) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int g(int i4, int i5) {
        int alpha = Color.alpha(i5);
        int alpha2 = Color.alpha(i4);
        int f4 = f(alpha2, alpha);
        return Color.argb(f4, h(Color.red(i4), alpha2, Color.red(i5), alpha, f4), h(Color.green(i4), alpha2, Color.green(i5), alpha, f4), h(Color.blue(i4), alpha2, Color.blue(i5), alpha, f4));
    }

    private static int h(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((i4 * KotlinVersion.MAX_COMPONENT_VALUE) * i5) + ((i6 * i7) * (255 - i5))) / (i8 * KotlinVersion.MAX_COMPONENT_VALUE);
    }

    private static int i(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : Math.min(i4, i6);
    }

    private static double[] j() {
        ThreadLocal threadLocal = f11769a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int k(int i4, int i5) {
        if (i5 < 0 || i5 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i4 & 16777215) | (i5 << 24);
    }
}
