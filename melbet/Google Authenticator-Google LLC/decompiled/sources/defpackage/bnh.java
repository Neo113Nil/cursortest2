package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.authenticator2.addfirstotp.AddFirstOtpActivity;
import com.google.android.apps.authenticator2.editotp.EditOtpActivity;
import com.google.android.apps.authenticator2.enterkey.EnterKeyActivity;
import com.google.android.apps.authenticator2.howitworks.GoogleAccountSyncingIntroductionActivity;
import com.google.android.apps.authenticator2.howitworks.HowItWorksActivity;
import com.google.android.apps.authenticator2.loginrequirement.LoginRequirementActivity;
import com.google.android.apps.authenticator2.main.MainActivity;
import com.google.android.apps.authenticator2.migration.MigrationActivity;
import com.google.android.apps.authenticator2.settings.SettingsActivity;
import com.google.apps.tiktok.account.ui.onegoogle.expresssignin.selector.ExpressSignInActivity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnh implements boj, bqr, brd, bro, brz, bsu, bue, bxi, cbq, fsr, fzd, gjh, gmj, jqp, jrp {
    final jsb a;
    final jsb b;
    final jsb c;
    final jsb d;
    final jsb e;
    final jsb f;
    final jsb g;
    final jsb h;
    final jsb i;
    final jsb j;
    final jsb k;
    final jsb l;
    final jsb m;
    private final bnl n;
    private final bna o;
    private final bmz p;
    private final bnh q = this;

    public bnh(bnl bnlVar, bna bnaVar, bmz bmzVar, jpu jpuVar) {
        this.n = bnlVar;
        this.o = bnaVar;
        this.p = bmzVar;
        jrw a = jrx.a(jpuVar);
        this.a = a;
        fsn fsnVar = new fsn(a, bmzVar.d, bmzVar.e);
        this.b = fsnVar;
        jrw jrwVar = jsd.a;
        List c = iwj.c(1);
        List c2 = iwj.c(0);
        c.add(bnlVar.np);
        jsd jsdVar = new jsd(c, c2);
        this.c = jsdVar;
        jsb c3 = jrv.c(new emo(jsdVar, 17));
        this.d = c3;
        jsb jsbVar = bof.a;
        this.e = jsbVar;
        jsb c4 = jrv.c(new gaa(bmzVar.d, a, bmzVar.m, 9, (short[][]) null));
        this.f = c4;
        jsb c5 = jrv.c(new dko(a, c3, bmzVar.l, jsbVar, c4, 11, (boolean[][]) null));
        this.g = c5;
        fsm fsmVar = new fsm(a, bmzVar.n);
        this.h = fsmVar;
        bnu bnuVar = new bnu(fud.a, 1, null);
        this.i = bnuVar;
        this.j = jsbVar;
        this.k = jsbVar;
        this.l = jsbVar;
        this.m = jrv.c(new gpf(a, bmzVar.k, fsnVar, bmzVar.e, c5, fsmVar, c3, bmzVar.l, bnlVar.nB, bnlVar.jc, jsbVar, bnuVar, jsbVar, jsbVar, jsbVar, 1, null));
    }

    @Override // defpackage.boj
    public final boi a() {
        bmz bmzVar = this.p;
        Activity a = bmzVar.a();
        if (a instanceof AddFirstOtpActivity) {
            return new boi((AddFirstOtpActivity) a, bmzVar.b());
        }
        throw new IllegalStateException(bnq.c((di) a, boi.class));
    }

    @Override // defpackage.bqr
    public final bqq b() {
        bmz bmzVar = this.p;
        Activity a = bmzVar.a();
        if (a instanceof EditOtpActivity) {
            return new bqq((EditOtpActivity) a, bmzVar.b());
        }
        throw new IllegalStateException(bnq.c((di) a, bqq.class));
    }

    @Override // defpackage.brd
    public final brc c() {
        bmz bmzVar = this.p;
        Activity a = bmzVar.a();
        if (a instanceof EnterKeyActivity) {
            return new brc((EnterKeyActivity) a, bmzVar.b());
        }
        throw new IllegalStateException(bnq.c((di) a, brc.class));
    }

    @Override // defpackage.bro
    public final brn d() {
        Activity a = this.p.a();
        if (a instanceof GoogleAccountSyncingIntroductionActivity) {
            return new brn(a, (byte[]) null);
        }
        throw new IllegalStateException(bnq.c((di) a, brn.class));
    }

    @Override // defpackage.brz
    public final bry e() {
        Activity a = this.p.a();
        if (a instanceof HowItWorksActivity) {
            return new bry((HowItWorksActivity) a, (char[]) null);
        }
        throw new IllegalStateException(bnq.c((di) a, bry.class));
    }

    @Override // defpackage.bsu
    public final bst f() {
        Activity a = this.p.a();
        if (a instanceof LoginRequirementActivity) {
            return new bst((LoginRequirementActivity) a);
        }
        throw new IllegalStateException(bnq.c((di) a, bst.class));
    }

    @Override // defpackage.bue
    public final bud g() {
        bmz bmzVar = this.p;
        Activity a = bmzVar.a();
        if (!(a instanceof MainActivity)) {
            throw new IllegalStateException(bnq.c((di) a, bud.class));
        }
        bnl bnlVar = this.n;
        return new bud((MainActivity) a, bmzVar.b(), new fye((Context) bnlVar.nS.a, (fcu) bnlVar.iY.b(), (fwm) bnlVar.gk.b()));
    }

    @Override // defpackage.bxi
    public final bxh h() {
        bmz bmzVar = this.p;
        Activity a = bmzVar.a();
        if (a instanceof MigrationActivity) {
            return new bxh((MigrationActivity) a, bmzVar.b());
        }
        throw new IllegalStateException(bnq.c((di) a, bxh.class));
    }

    @Override // defpackage.cbq
    public final cbp i() {
        Activity a = this.p.a();
        if (a instanceof SettingsActivity) {
            return new cbp((SettingsActivity) a);
        }
        throw new IllegalStateException(bnq.c((di) a, cbp.class));
    }

    @Override // defpackage.fsr
    public final frz j() {
        return (frz) this.m.b();
    }

    @Override // defpackage.fzd
    public final fzc k() {
        Activity a = this.p.a();
        if (a instanceof ExpressSignInActivity) {
            return new fzc((ExpressSignInActivity) a, gzp.h(new e()), gzp.h(new cka((byte[]) null)));
        }
        throw new IllegalStateException(bnq.c((di) a, fzc.class));
    }

    @Override // defpackage.gjh
    public final gkj l() {
        return (gkj) this.f.b();
    }

    @Override // defpackage.gmj
    public final gzp m() {
        return gzp.h(frv.a(((ftr) this.g.b()).g()));
    }

    @Override // defpackage.jqp
    public final bnt n() {
        return new bnt(this.n, this.o, this.p, this.q);
    }
}
