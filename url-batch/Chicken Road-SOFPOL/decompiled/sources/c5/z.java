package c5;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f1741a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f1742b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f1741a = new f0();
        } else {
            f1741a = new e0();
        }
        f1742b = new b(Float.class, "translationAlpha", 5);
        new b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i8, int i9, int i10) {
        f1741a.E(view, i, i8, i9, i10);
    }

    public static void b(View view, int i) {
        f1741a.z(view, i);
    }
}
