package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class apq {
    public static final apr a;
    static final Property b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new apv();
        } else {
            a = new apu();
        }
        b = new apo(Float.class);
        new app(Rect.class);
    }

    static float a(View view) {
        return a.a(view);
    }

    static void b(View view, int i, int i2, int i3, int i4) {
        a.b(view, i, i2, i3, i4);
    }

    static void c(View view, float f) {
        a.c(view, f);
    }

    static void d(View view, int i) {
        a.d(view, i);
    }
}
