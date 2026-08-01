package h3;

import android.graphics.Color;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4441a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(double d10, double d11, double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        double pow = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double pow2 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        double pow3 = d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static int b(int i3, int i10) {
        int alpha = Color.alpha(i10);
        int alpha2 = Color.alpha(i3);
        int i11 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i11, c(Color.red(i3), alpha2, Color.red(i10), alpha, i11), c(Color.green(i3), alpha2, Color.green(i10), alpha, i11), c(Color.blue(i3), alpha2, Color.blue(i10), alpha, i11));
    }

    public static int c(int i3, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (((255 - i10) * (i11 * i12)) + ((i3 * 255) * i10)) / (i13 * 255);
    }
}
