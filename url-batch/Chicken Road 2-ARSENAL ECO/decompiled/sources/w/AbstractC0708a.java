package w;

import android.graphics.Color;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0708a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6125a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(int i7, int i8) {
        int alpha = Color.alpha(i8);
        int alpha2 = Color.alpha(i7);
        int i9 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i9, b(Color.red(i7), alpha2, Color.red(i8), alpha, i9), b(Color.green(i7), alpha2, Color.green(i8), alpha, i9), b(Color.blue(i7), alpha2, Color.blue(i8), alpha, i9));
    }

    public static int b(int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        return (((255 - i8) * (i9 * i10)) + ((i7 * 255) * i8)) / (i11 * 255);
    }
}
