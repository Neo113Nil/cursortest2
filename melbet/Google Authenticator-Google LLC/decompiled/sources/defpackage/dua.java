package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dua extends eb {
    public jis aj;
    private final koi ak;

    public dua() {
        koi a = koc.a(3, new dfh(new dfh(this, 11), 12));
        int i = ksx.a;
        this.ak = new agf(new ksj(dub.class), new dfh(a, 13), new dtz(this, a, 0), new dfh(a, 14));
    }

    private final dub aF() {
        return (dub) this.ak.a();
    }

    @Override // defpackage.eb, defpackage.ar
    public final Dialog a(Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(y(), R.style.Theme_GoogleMaterial3_DayNight_Dialog_Alert);
        jis jisVar = aF().a;
        if (jisVar != null) {
            this.aj = jisVar;
        } else if (this.aj != null) {
            dub aF = aF();
            jis jisVar2 = this.aj;
            if (jisVar2 == null) {
                ksp.a("data");
                jisVar2 = null;
            }
            aF.a = jisVar2;
        }
        jis jisVar3 = this.aj;
        if (jisVar3 == null) {
            super.q(false, false);
            return new fhm(y(), 0).b();
        }
        fhm fhmVar = new fhm(contextThemeWrapper, R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog_Centered);
        fhmVar.t(jisVar3.a);
        fhmVar.m(jisVar3.b);
        fhmVar.r(jisVar3.c, new bum(jisVar3, this, 2));
        fhmVar.o(jisVar3.e, null);
        fhmVar.j(jisVar3.f.intValue());
        return fhmVar.b();
    }
}
