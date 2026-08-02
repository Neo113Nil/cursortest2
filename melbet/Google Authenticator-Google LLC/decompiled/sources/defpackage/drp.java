package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drp {
    private static final String e = "drp";
    public final dsf a;
    public final SelectedAccountDisc b;
    public final dja c = new dro(this);
    public final kee d = new kee(this, null);
    private final boolean f;

    public drp(SelectedAccountDisc selectedAccountDisc, dsf dsfVar, gzp gzpVar, boolean z) {
        this.a = dsfVar;
        this.b = selectedAccountDisc;
        this.f = z;
        dru druVar = new dru(dsfVar, selectedAccountDisc);
        heg hegVar = new heg(4);
        hegVar.h(druVar);
        gzp gzpVar2 = dsfVar.e.b;
        selectedAccountDisc.d = new drk(hegVar.g(), 2);
    }

    public final void a(Object obj) {
        if (this.f) {
            return;
        }
        dsf dsfVar = this.a;
        jkj k = jnu.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        jnu jnuVar = (jnu) jkpVar;
        jnuVar.d = 8;
        jnuVar.b |= 2;
        if (!jkpVar.M()) {
            k.t();
        }
        jkp jkpVar2 = k.b;
        jnu jnuVar2 = (jnu) jkpVar2;
        jnuVar2.f = 8;
        jnuVar2.b |= 32;
        if (!jkpVar2.M()) {
            k.t();
        }
        jkp jkpVar3 = k.b;
        jnu jnuVar3 = (jnu) jkpVar3;
        jnuVar3.e = 3;
        jnuVar3.b = 8 | jnuVar3.b;
        if (!jkpVar3.M()) {
            k.t();
        }
        efc efcVar = dsfVar.f;
        jnu jnuVar4 = (jnu) k.b;
        jnuVar4.c = 36;
        jnuVar4.b |= 1;
        efcVar.a(obj, (jnu) k.q());
    }

    public final void b() {
        String string;
        Object obj;
        dsf dsfVar = this.a;
        dsg dsgVar = dsfVar.b;
        if (!dsgVar.d()) {
            dih.W(new dlj(this, 9));
            return;
        }
        SelectedAccountDisc selectedAccountDisc = this.b;
        gzp gzpVar = dsfVar.h;
        Context context = selectedAccountDisc.getContext();
        if (dsgVar.g().isEmpty()) {
            string = context.getString(R.string.og_account_particle_disc_no_accounts_available_a11y);
        } else {
            Object a = dsgVar.a();
            if (a == null) {
                string = context.getString(R.string.og_account_and_settings) + "\n" + context.getString(R.string.og_choose_an_account_title);
            } else {
                AccountParticleDisc accountParticleDisc = selectedAccountDisc.b;
                Object obj2 = accountParticleDisc.k;
                String str = "";
                if (!a.equals(obj2)) {
                    Log.w(e, String.format("Disc account not the same as selected account.%s", obj2 == null ? " Disc account null" : ""));
                }
                dov dovVar = dsfVar.c;
                Object obj3 = accountParticleDisc.k;
                if (obj3 != null) {
                    boolean z = dih.l(obj3, dovVar).a;
                    String R = hoq.R(dovVar.f(obj3));
                    String R2 = z ? "" : hoq.R(dovVar.d(obj3));
                    if (R.isEmpty() && R2.isEmpty()) {
                        R = dovVar.c(obj3);
                    } else if (R.isEmpty()) {
                        R = R2;
                    } else if (!R2.isEmpty() && !R.equals(R2)) {
                        R = a.ag(R2, R, " ");
                    }
                    dze dzeVar = accountParticleDisc.p;
                    String str2 = null;
                    dpn dpnVar = (dzeVar == null || (obj = dzeVar.b) == null) ? null : (dpn) ((dpo) obj).a.e();
                    String str3 = dpnVar == null ? null : dpnVar.c;
                    if (str3 != null) {
                        String trim = str3.trim();
                        if (!trim.isEmpty()) {
                            str2 = !trim.endsWith(".") ? String.valueOf(trim).concat(".") : trim;
                        }
                    }
                    String c = accountParticleDisc.c();
                    if (str2 != null && c != null) {
                        str = a.ag(str2, c, " ");
                    } else if (str2 != null) {
                        str = str2;
                    } else if (c != null) {
                        str = c;
                    }
                    str = !str.isEmpty() ? a.ag(str, R, "\n") : R;
                }
                string = context.getString(R.string.og_account_and_settings);
                if (!str.isEmpty()) {
                    string = context.getString(R.string.og_signed_in_as_account, str) + "\n" + string;
                }
            }
        }
        dih.W(new drn(this, string, 0));
    }

    public final void c() {
        dsg dsgVar = this.a.b;
        if (dsgVar.d()) {
            dih.W(new drn(this, dsgVar, 2));
        }
    }
}
