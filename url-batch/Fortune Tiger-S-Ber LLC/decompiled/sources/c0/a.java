package c0;

import android.graphics.Color;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f976a = new ThreadLocal();

    public static int a(double d4, double d5, double d6) {
        double d7 = (((-0.4986d) * d6) + (((-1.5372d) * d5) + (3.2406d * d4))) / 100.0d;
        double d8 = ((0.0415d * d6) + ((1.8758d * d5) + ((-0.9689d) * d4))) / 100.0d;
        double d9 = ((1.057d * d6) + (((-0.204d) * d5) + (0.0557d * d4))) / 100.0d;
        double pow = d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d;
        double pow2 = d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d;
        double pow3 = d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static int b(int i4, int i5) {
        int alpha = Color.alpha(i5);
        int alpha2 = Color.alpha(i4);
        int i6 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i6, c(Color.red(i4), alpha2, Color.red(i5), alpha, i6), c(Color.green(i4), alpha2, Color.green(i5), alpha, i6), c(Color.blue(i4), alpha2, Color.blue(i5), alpha, i6));
    }

    public static int c(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((255 - i5) * (i6 * i7)) + ((i4 * 255) * i5)) / (i8 * 255);
    }

    public static int d(int i4, int i5) {
        if (i5 < 0 || i5 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i4 & 16777215) | (i5 << 24);
    }
}
