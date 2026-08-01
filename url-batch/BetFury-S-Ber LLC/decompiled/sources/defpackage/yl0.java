package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class yl0 implements View.OnApplyWindowInsetsListener {
    public dp0 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ q40 c;

    public yl0(View view, q40 q40Var) {
        this.b = view;
        this.c = q40Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        dp0 g = dp0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        q40 q40Var = this.c;
        if (i < 30) {
            zl0.a(windowInsets, this.b);
            if (g.equals(this.a)) {
                return q40Var.i(view, g).f();
            }
        }
        this.a = g;
        dp0 i2 = q40Var.i(view, g);
        if (i >= 30) {
            return i2.f();
        }
        WeakHashMap weakHashMap = hm0.a;
        view.requestApplyInsets();
        return i2.f();
    }
}
