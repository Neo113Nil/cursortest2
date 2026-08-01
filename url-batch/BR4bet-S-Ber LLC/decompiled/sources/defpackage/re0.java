package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class re0 extends qe0 {
    public static final ye0 v;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        v = ye0.g(null, windowInsets);
    }

    public re0(ye0 ye0Var, WindowInsets windowInsets) {
        super(ye0Var, windowInsets);
    }

    @Override // defpackage.ne0, defpackage.ve0
    public er h(int i) {
        Insets insets;
        insets = this.c.getInsets(we0.a(i));
        return er.d(insets);
    }

    @Override // defpackage.ne0, defpackage.ve0
    public er i(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(we0.a(i));
        return er.d(insetsIgnoringVisibility);
    }

    @Override // defpackage.ne0, defpackage.ve0
    public final void d(View view) {
    }
}
