package B;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f145a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(double d7, double d8, double d9) {
        double d10 = (((-0.4986d) * d9) + (((-1.5372d) * d8) + (3.2406d * d7))) / 100.0d;
        double d11 = ((0.0415d * d9) + ((1.8758d * d8) + ((-0.9689d) * d7))) / 100.0d;
        double d12 = ((1.057d * d9) + (((-0.204d) * d8) + (0.0557d * d7))) / 100.0d;
        double pow = d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d;
        double pow2 = d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d;
        double pow3 = d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static int b(int i2, int i5) {
        int alpha = Color.alpha(i5);
        int alpha2 = Color.alpha(i2);
        int i7 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i7, c(Color.red(i2), alpha2, Color.red(i5), alpha, i7), c(Color.green(i2), alpha2, Color.green(i5), alpha, i7), c(Color.blue(i2), alpha2, Color.blue(i5), alpha, i7));
    }

    public static int c(int i2, int i5, int i7, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        return (((255 - i5) * (i7 * i8)) + ((i2 * 255) * i5)) / (i9 * 255);
    }
}
