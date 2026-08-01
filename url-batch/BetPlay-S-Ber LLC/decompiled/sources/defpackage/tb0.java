package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class tb0 extends sb0 {
    public static final ac0 v;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        v = ac0.g(null, windowInsets);
    }

    public tb0(ac0 ac0Var, WindowInsets windowInsets) {
        super(ac0Var, windowInsets);
    }

    @Override // defpackage.pb0, defpackage.xb0
    public ip h(int i) {
        Insets insets;
        insets = this.c.getInsets(yb0.a(i));
        return ip.d(insets);
    }

    @Override // defpackage.pb0, defpackage.xb0
    public ip i(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(yb0.a(i));
        return ip.d(insetsIgnoringVisibility);
    }

    @Override // defpackage.pb0, defpackage.xb0
    public final void d(View view) {
    }
}
