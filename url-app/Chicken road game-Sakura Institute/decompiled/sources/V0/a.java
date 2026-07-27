package V0;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class a {
    static {
        new ThreadLocal();
    }

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
}
