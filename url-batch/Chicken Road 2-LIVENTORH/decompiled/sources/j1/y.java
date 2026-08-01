package j1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f1970a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f1971b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f1970a = new e0();
        } else {
            f1970a = new d0();
        }
        f1971b = new b(Float.class, "translationAlpha", 5);
        new b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i4, int i5, int i6) {
        f1970a.t0(view, i, i4, i5, i6);
    }

    public static void b(View view, int i) {
        f1970a.n0(view, i);
    }
}
