package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class wo0 extends vo0 {
    public static final dp0 v;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        v = dp0.g(null, windowInsets);
    }

    public wo0(dp0 dp0Var, WindowInsets windowInsets) {
        super(dp0Var, windowInsets);
    }

    @Override // defpackage.so0, defpackage.ap0
    public fv h(int i) {
        Insets insets;
        insets = this.c.getInsets(bp0.a(i));
        return fv.d(insets);
    }

    @Override // defpackage.so0, defpackage.ap0
    public fv i(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(bp0.a(i));
        return fv.d(insetsIgnoringVisibility);
    }

    @Override // defpackage.so0, defpackage.ap0
    public final void d(View view) {
    }
}
