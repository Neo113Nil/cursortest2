package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class t90 {
    public static final ba0 a;
    public static final u9 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new ca0();
        } else {
            a = new ba0();
        }
        b = new u9(Float.class, "translationAlpha", 5);
        new u9(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.l(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.m(view, i);
    }
}
