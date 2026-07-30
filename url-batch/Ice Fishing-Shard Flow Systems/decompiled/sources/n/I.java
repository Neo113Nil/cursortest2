package n;

import android.view.View;

/* loaded from: classes.dex */
public abstract class I {
    public static int a(View view) {
        return view.getTextAlignment();
    }

    public static int b(View view) {
        return view.getTextDirection();
    }

    public static void c(View view, int i2) {
        view.setTextAlignment(i2);
    }

    public static void d(View view, int i2) {
        view.setTextDirection(i2);
    }
}
