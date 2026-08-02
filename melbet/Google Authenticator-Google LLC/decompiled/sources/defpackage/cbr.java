package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.authenticator2.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbr extends cbo implements gjg, glw, guo {
    private boolean aj;
    private cbw d;
    private Context e;
    private final ael ak = new ael(this);
    private final gsu f = new gsu(this);

    @Deprecated
    public cbr() {
        fao.c();
    }

    @Override // defpackage.ezy, defpackage.aij, defpackage.bd
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f.i();
        try {
            View I = super.I(layoutInflater, viewGroup, bundle);
            gta.o();
            return I;
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bd, defpackage.aer
    public final ael L() {
        return this.ak;
    }

    @Override // defpackage.ezy, defpackage.bd
    public final void V(Bundle bundle) {
        this.f.i();
        try {
            super.V(bundle);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezy, defpackage.bd
    public final void W(int i, int i2, Intent intent) {
        gut a = this.f.a("Fragment:onActivityResult");
        try {
            super.W(i, i2, intent);
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbo, defpackage.ezy, defpackage.bd
    public final void X(Activity activity) {
        this.f.i();
        try {
            super.X(activity);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezy, defpackage.bd
    public final void Z() {
        gut c = this.f.c();
        try {
            super.Z();
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bd
    public final void aA(int i, int i2) {
        this.f.h(i, i2);
        gta.o();
    }

    @Override // defpackage.guo
    public final gvz aH() {
        return this.f.a;
    }

    @Override // defpackage.glw
    public final Locale aI() {
        return hnu.bj(this);
    }

    @Override // defpackage.guo
    public final void aJ(gvz gvzVar, boolean z) {
        this.f.g(gvzVar, z);
    }

    @Override // defpackage.guo
    public final void aK(gvz gvzVar) {
        this.f.b = gvzVar;
    }

    @Override // defpackage.cbo
    protected final /* synthetic */ jqq aL() {
        return new gmb(this);
    }

    @Override // defpackage.gjg
    /* renamed from: aN, reason: merged with bridge method [inline-methods] */
    public final cbw z() {
        cbw cbwVar = this.d;
        if (cbwVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.aj) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cbwVar;
    }

    @Override // defpackage.ezy, defpackage.bd
    public final void aa() {
        this.f.i();
        try {
            super.aa();
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezy, defpackage.bd
    public final void ac() {
        gut c = this.f.c();
        try {
            super.ac();
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezy, defpackage.aij, defpackage.bd
    public final void ad(View view, Bundle bundle) {
        this.f.i();
        try {
            super.ad(view, bundle);
            View J = z().b.J();
            boh bohVar = new boh(10);
            int i = yq.a;
            yi.c(J, bohVar);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bd
    public final boolean as(MenuItem menuItem) {
        gut a = this.f.a("Fragment:onOptionsItemSelected");
        try {
            boolean y = ((ezy) this).c.y();
            a.close();
            return y;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bd
    public final LayoutInflater bv(Bundle bundle) {
        this.f.i();
        try {
            LayoutInflater at = at();
            LayoutInflater cloneInContext = at.cloneInContext(new jrg(at, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new glx(this, cloneInContext));
            gta.o();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cbo, defpackage.bd
    public final void e(Context context) {
        this.f.i();
        try {
            if (this.aj) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.e(context);
            if (this.d == null) {
                cbx cbxVar = (cbx) hnu.bh(this, cbx.class);
                gty aA = hoq.aA(52, cbr.class, "CreatePeer");
                try {
                    this.d = cbxVar.f();
                    aA.close();
                    this.ag.a(new glr(this.f, this.ak));
                } finally {
                }
            }
            aeh aehVar = this.F;
            if (aehVar instanceof guo) {
                gsu gsuVar = this.f;
                if (gsuVar.a == null) {
                    gsuVar.g(((guo) aehVar).aH(), true);
                }
            }
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezy, defpackage.aij, defpackage.bd
    public final void f(Bundle bundle) {
        this.f.i();
        try {
            super.f(bundle);
            cbw z = z();
            gez gezVar = z.f;
            cby cbyVar = z.c;
            gezVar.g(R.id.privacy_screen_checked_subscription, new btf(cbyVar, 9), new bua(z, 2));
            gezVar.g(R.id.privacy_screen_time_subscription, new btf(cbyVar, 10), new bua(z, 3));
            gbi gbiVar = z.e;
            gbiVar.h(z.g);
            gbiVar.h(z.h);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezy, defpackage.aij, defpackage.bd
    public final void g() {
        gut c = this.f.c();
        try {
            super.g();
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezy, defpackage.bd
    public final void h() {
        gut b = this.f.b();
        try {
            super.h();
            this.aj = true;
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezy, defpackage.aij, defpackage.bd
    public final void i(Bundle bundle) {
        this.f.i();
        try {
            super.i(bundle);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezy, defpackage.aij, defpackage.bd
    public final void j() {
        this.f.i();
        try {
            super.j();
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ezy, defpackage.aij, defpackage.bd
    public final void k() {
        this.f.i();
        try {
            super.k();
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bd
    public final void l(Bundle bundle) {
        this.f.i();
        try {
            super.l(bundle);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aij
    public final void r(String str) {
        cbw z = z();
        cbr cbrVar = z.b;
        air airVar = ((aij) cbrVar).a;
        if (airVar == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context y = cbrVar.y();
        int i = 1;
        airVar.f(true);
        int i2 = ain.a;
        Object[] objArr = new Object[2];
        String[] strArr = {String.valueOf(Preference.class.getPackage().getName()).concat("."), String.valueOf(SwitchPreference.class.getPackage().getName()).concat(".")};
        XmlResourceParser xml = y.getResources().getXml(R.xml.preferences);
        try {
            Preference a = ain.a(xml, y, objArr, airVar, strArr);
            xml.close();
            PreferenceScreen preferenceScreen = (PreferenceScreen) a;
            preferenceScreen.z(airVar);
            int i3 = 0;
            airVar.f(false);
            PreferenceScreen preferenceScreen2 = preferenceScreen;
            if (str != null) {
                Preference l = preferenceScreen.l(str);
                boolean z2 = l instanceof PreferenceScreen;
                preferenceScreen2 = l;
                if (!z2) {
                    throw new IllegalArgumentException(a.Z(str, "Preference object with key ", " is not a PreferenceScreen"));
                }
            }
            cbrVar.p(preferenceScreen2);
            z.j = (SwitchPreferenceCompat) cbrVar.a(cbrVar.bs().getString(R.string.privacy_screen_toggle));
            z.k = (ListPreference) cbrVar.a(cbrVar.bs().getString(R.string.screen_lock_preferences));
            ListPreference listPreference = z.k;
            final gva gvaVar = z.d;
            final cbs cbsVar = new cbs(z, i);
            final String str2 = "SettingsFragmentPeer:clickPrivacyScreenTimeChanged";
            listPreference.n = new aia() { // from class: gwp
                @Override // defpackage.aia
                public final boolean a(Preference preference, Object obj) {
                    aia aiaVar = aia.this;
                    if (gta.u()) {
                        return aiaVar.a(preference, obj);
                    }
                    gtt f = gvaVar.f(str2, 261);
                    try {
                        boolean a2 = aiaVar.a(preference, obj);
                        f.close();
                        return a2;
                    } catch (Throwable th) {
                        try {
                            f.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            };
            SwitchPreferenceCompat switchPreferenceCompat = z.j;
            final cbs cbsVar2 = new cbs(z, i3);
            final String str3 = "SettingsFragmentPeer:clickPrivacyScreenToggle";
            switchPreferenceCompat.n = new aia() { // from class: gwp
                @Override // defpackage.aia
                public final boolean a(Preference preference, Object obj) {
                    aia aiaVar = aia.this;
                    if (gta.u()) {
                        return aiaVar.a(preference, obj);
                    }
                    gtt f = gvaVar.f(str3, 261);
                    try {
                        boolean a2 = aiaVar.a(preference, obj);
                        f.close();
                        return a2;
                    } catch (Throwable th) {
                        try {
                            f.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            };
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    @Override // defpackage.cbo, defpackage.bd
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        if (this.e == null) {
            this.e = new glx(this, super.x());
        }
        return this.e;
    }
}
