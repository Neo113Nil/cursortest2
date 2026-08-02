package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zq extends zp {
    public zq(zz zzVar, WindowInsets windowInsets) {
        super(zzVar, windowInsets);
    }

    @Override // defpackage.zo, defpackage.zw
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq)) {
            return false;
        }
        zq zqVar = (zq) obj;
        return Objects.equals(this.a, zqVar.a) && Objects.equals(this.b, zqVar.b) && s(this.c, zqVar.c);
    }

    @Override // defpackage.zw
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.zw
    public xf y() {
        DisplayCutout displayCutout;
        displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new xf(displayCutout);
    }

    @Override // defpackage.zw
    public zz z() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.a.consumeDisplayCutout();
        return zz.q(consumeDisplayCutout, null);
    }
}
