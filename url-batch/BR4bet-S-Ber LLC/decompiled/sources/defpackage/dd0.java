package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class dd0 {
    public static final jd0 a;
    public static final t7 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new kd0();
        } else {
            a = new jd0();
        }
        b = new t7(Float.class, "translationAlpha", 10);
        new t7(Rect.class, "clipBounds", 11);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.X(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.Y(view, i);
    }
}
