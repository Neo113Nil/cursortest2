package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zs extends zr {
    static final zz f;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f = zz.q(windowInsets, null);
    }

    public zs(zz zzVar, WindowInsets windowInsets) {
        super(zzVar, windowInsets);
    }

    @Override // defpackage.zo, defpackage.zw
    public vb a(int i) {
        Insets insets;
        insets = this.a.getInsets(zx.a(i));
        return vb.e(insets);
    }

    @Override // defpackage.zo, defpackage.zw
    public vb c(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.a.getInsetsIgnoringVisibility(zx.a(i));
        return vb.e(insetsIgnoringVisibility);
    }

    @Override // defpackage.zo, defpackage.zw
    public final void h(View view) {
    }
}
