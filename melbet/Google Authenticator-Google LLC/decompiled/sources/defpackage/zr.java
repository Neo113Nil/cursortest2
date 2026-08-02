package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zr extends zq {
    private vb f;
    private vb g;
    private vb j;

    public zr(zz zzVar, WindowInsets windowInsets) {
        super(zzVar, windowInsets);
        this.f = null;
        this.g = null;
        this.j = null;
    }

    @Override // defpackage.zw
    public vb A() {
        Insets mandatorySystemGestureInsets;
        vb vbVar = this.g;
        if (vbVar != null) {
            return vbVar;
        }
        mandatorySystemGestureInsets = this.a.getMandatorySystemGestureInsets();
        vb e = vb.e(mandatorySystemGestureInsets);
        this.g = e;
        return e;
    }

    @Override // defpackage.zw
    public vb B() {
        Insets systemGestureInsets;
        vb vbVar = this.f;
        if (vbVar != null) {
            return vbVar;
        }
        systemGestureInsets = this.a.getSystemGestureInsets();
        vb e = vb.e(systemGestureInsets);
        this.f = e;
        return e;
    }

    @Override // defpackage.zw
    public vb C() {
        Insets tappableElementInsets;
        vb vbVar = this.j;
        if (vbVar != null) {
            return vbVar;
        }
        tappableElementInsets = this.a.getTappableElementInsets();
        vb e = vb.e(tappableElementInsets);
        this.j = e;
        return e;
    }

    @Override // defpackage.zo, defpackage.zw
    public zz e(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.a.inset(i, i2, i3, i4);
        return zz.q(inset, null);
    }

    @Override // defpackage.zp, defpackage.zw
    public void w(vb vbVar) {
    }
}
