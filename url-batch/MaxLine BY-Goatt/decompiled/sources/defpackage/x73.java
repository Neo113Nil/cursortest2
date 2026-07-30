package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class x73 extends w73 {
    public static final c83 w;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        w = c83.c(null, windowInsets);
    }

    public x73(c83 c83Var, WindowInsets windowInsets) {
        super(c83Var, windowInsets);
    }

    @Override // defpackage.v73, defpackage.r73, defpackage.z73
    public z21 h(int i) {
        return z21.c(this.c.getInsets(b83.a(i)));
    }

    @Override // defpackage.v73, defpackage.r73, defpackage.z73
    public z21 i(int i) {
        return z21.c(this.c.getInsetsIgnoringVisibility(b83.a(i)));
    }

    @Override // defpackage.v73, defpackage.r73, defpackage.z73
    public boolean t(int i) {
        return this.c.isVisible(b83.a(i));
    }

    @Override // defpackage.r73, defpackage.z73
    public void o(View view) {
    }
}
