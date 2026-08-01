package f1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f1726a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f1727b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f1726a = new e0();
        } else {
            f1726a = new d0();
        }
        f1727b = new b(Float.class, "translationAlpha", 5);
        new b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i4, int i5, int i6, int i7) {
        f1726a.W(view, i4, i5, i6, i7);
    }

    public static void b(View view, int i4) {
        f1726a.V(view, i4);
    }
}
