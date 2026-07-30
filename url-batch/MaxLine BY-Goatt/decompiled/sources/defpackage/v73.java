package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class v73 extends u73 {
    public static final c83 v;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        v = c83.c(null, windowInsets);
    }

    public v73(c83 c83Var, WindowInsets windowInsets) {
        super(c83Var, windowInsets);
    }

    @Override // defpackage.r73, defpackage.z73
    public z21 h(int i) {
        return z21.c(this.c.getInsets(a83.a(i)));
    }

    @Override // defpackage.r73, defpackage.z73
    public z21 i(int i) {
        return z21.c(this.c.getInsetsIgnoringVisibility(a83.a(i)));
    }

    @Override // defpackage.r73, defpackage.z73
    public boolean t(int i) {
        return this.c.isVisible(a83.a(i));
    }

    @Override // defpackage.r73, defpackage.z73
    public final void d(View view) {
    }
}
