package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class kb0 extends jb0 {
    public static final rb0 v;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        v = rb0.g(null, windowInsets);
    }

    public kb0(rb0 rb0Var, WindowInsets windowInsets) {
        super(rb0Var, windowInsets);
    }

    @Override // defpackage.gb0, defpackage.ob0
    public to h(int i) {
        Insets insets;
        insets = this.c.getInsets(pb0.a(i));
        return to.d(insets);
    }

    @Override // defpackage.gb0, defpackage.ob0
    public to i(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(pb0.a(i));
        return to.d(insetsIgnoringVisibility);
    }

    @Override // defpackage.gb0, defpackage.ob0
    public final void d(View view) {
    }
}
