package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class zb0 implements View.OnApplyWindowInsetsListener {
    public ye0 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ zy c;

    public zb0(View view, zy zyVar) {
        this.b = view;
        this.c = zyVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        ye0 g = ye0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        zy zyVar = this.c;
        if (i < 30) {
            ac0.a(windowInsets, this.b);
            if (g.equals(this.a)) {
                return zyVar.l(view, g).f();
            }
        }
        this.a = g;
        ye0 l = zyVar.l(view, g);
        if (i >= 30) {
            return l.f();
        }
        WeakHashMap weakHashMap = ic0.a;
        view.requestApplyInsets();
        return l.f();
    }
}
