package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zp extends zo {
    private vb f;

    public zp(zz zzVar, WindowInsets windowInsets) {
        super(zzVar, windowInsets);
        this.f = null;
    }

    @Override // defpackage.zw
    public final vb t() {
        vb vbVar = this.f;
        if (vbVar != null) {
            return vbVar;
        }
        WindowInsets windowInsets = this.a;
        vb d = vb.d(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.f = d;
        return d;
    }

    @Override // defpackage.zw
    public zz u() {
        return zz.q(this.a.consumeStableInsets(), null);
    }

    @Override // defpackage.zw
    public zz v() {
        return zz.q(this.a.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.zw
    public void w(vb vbVar) {
        this.f = vbVar;
    }

    @Override // defpackage.zw
    public boolean x() {
        return this.a.isConsumed();
    }
}
