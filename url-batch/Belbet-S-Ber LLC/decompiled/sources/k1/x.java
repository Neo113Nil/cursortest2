package k1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f2379a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f2380b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2379a = new e0();
        } else {
            f2379a = new d0();
        }
        f2380b = new b(Float.class, "translationAlpha", 5);
        new b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i4, int i5, int i6) {
        f2379a.Z(view, i, i4, i5, i6);
    }

    public static void b(View view, int i) {
        f2379a.U(view, i);
    }
}
