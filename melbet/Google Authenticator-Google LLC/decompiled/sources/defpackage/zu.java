package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zu extends zt {
    static final zz g;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        g = zz.q(windowInsets, null);
    }

    public zu(zz zzVar, WindowInsets windowInsets) {
        super(zzVar, windowInsets);
    }

    @Override // defpackage.zs, defpackage.zo, defpackage.zw
    public vb a(int i) {
        Insets insets;
        insets = this.a.getInsets(zy.a(i));
        return vb.e(insets);
    }

    @Override // defpackage.zs, defpackage.zo, defpackage.zw
    public vb c(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.a.getInsetsIgnoringVisibility(zy.a(i));
        return vb.e(insetsIgnoringVisibility);
    }

    @Override // defpackage.zo, defpackage.zw
    public void i(View view) {
    }
}
