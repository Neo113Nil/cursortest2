package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.material.opensearchbar.OpenSearchBar;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyq {
    public final bd a;
    public final frv b;
    public int c;
    public dsf d;
    public dsg e;
    private final iee h;
    public final dja g = new fyp(this);
    public boolean f = true;

    public fyq(Activity activity, bd bdVar, frv frvVar, iee ieeVar) {
        hoq.H(activity instanceof di);
        this.a = bdVar;
        this.b = frvVar;
        this.h = ieeVar;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, jpt] */
    public final void a(OpenSearchBar openSearchBar) {
        duh duhVar;
        iyi iyiVar;
        hac csmVar;
        hac hacVar;
        hac csmVar2;
        if (openSearchBar == null) {
            return;
        }
        Menu f = openSearchBar.f();
        if (!this.f) {
            f.removeItem(R.id.action_tiktok_og_account_menu);
            return;
        }
        MenuItem findItem = f.findItem(R.id.action_tiktok_og_account_menu);
        if (findItem == null) {
            findItem = f.add(0, R.id.action_tiktok_og_account_menu, 100, (CharSequence) null);
            findItem.setShowAsAction(2);
            findItem.setActionView(R.layout.selected_account_disc_open_search_bar);
            SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) findItem.getActionView().findViewById(R.id.selected_account_disc);
            iee ieeVar = this.h;
            bd bdVar = this.a;
            dsf dsfVar = this.d;
            bdVar.getClass();
            dsfVar.getClass();
            selectedAccountDisc.getClass();
            gjl gjlVar = new gjl(dsfVar);
            Object obj = ieeVar.e;
            boolean g = jtp.a.bB().g(selectedAccountDisc.getContext());
            Object b = ieeVar.b.b();
            b.getClass();
            dtp dtpVar = new dtp((gzp) obj, (duh) b, gjlVar);
            dst dstVar = new dst(bdVar, dsfVar, selectedAccountDisc, dtpVar, (gzp) ieeVar.c, g);
            ebv ebvVar = dsfVar.e;
            aer V = dih.V(bdVar);
            Context e = ebvVar.n.e(selectedAccountDisc.getContext());
            Object obj2 = ieeVar.d;
            iyi iyiVar2 = new iyi(e, yj.j(V));
            duh duhVar2 = dtpVar.a;
            Object b2 = duhVar2.b().o.b();
            b2.getClass();
            if (((duv) ((gzp) b2).e()) != null) {
                throw null;
            }
            csm csmVar3 = new csm(9);
            dvi a = duhVar2.b().a();
            if (a != null) {
                duhVar = duhVar2;
                iyiVar = iyiVar2;
                csmVar = hoq.v(new dsr(iyiVar, a, dtpVar, selectedAccountDisc, 1));
            } else {
                duhVar = duhVar2;
                iyiVar = iyiVar2;
                csmVar = new csm(10);
            }
            dvq b3 = duhVar.b().b();
            if (b3 != null) {
                hacVar = csmVar;
                csmVar2 = hoq.v(new dsr(iyiVar, b3, dtpVar, selectedAccountDisc, 0));
            } else {
                hacVar = csmVar;
                csmVar2 = new csm(11);
            }
            Object obj3 = ieeVar.g;
            selectedAccountDisc.h = csmVar3;
            selectedAccountDisc.i = hacVar;
            selectedAccountDisc.j = csmVar2;
            selectedAccountDisc.k = g;
            ebz ebzVar = ebvVar.j;
            duhVar.b().k();
            dsg dsgVar = dsfVar.b;
            if (dsgVar.d()) {
                ieeVar.f(dsfVar);
            } else {
                dss dssVar = new dss(dsgVar, ieeVar, dsfVar);
                dsgVar.e(dssVar);
                V.L().a(new nv(dsgVar, dssVar, 6));
            }
            dtd h = duhVar.b().h();
            dov dovVar = dsfVar.c;
            Resources resources = selectedAccountDisc.getContext().getResources();
            resources.getClass();
            iyi iyiVar3 = new iyi(resources, h, duhVar.b().i().j());
            AccountParticleDisc accountParticleDisc = selectedAccountDisc.b;
            dovVar.getClass();
            accountParticleDisc.o.e(new dpz(iyiVar3, dovVar));
            Object obj4 = ieeVar.a;
            fao.c();
            bd bdVar2 = dstVar.a;
            aer V2 = dih.V(bdVar2);
            bdVar2.G();
            dsf dsfVar2 = dstVar.b;
            SelectedAccountDisc selectedAccountDisc2 = dstVar.d;
            dtp dtpVar2 = dstVar.c;
            fao.c();
            dso dsoVar = new dso(selectedAccountDisc2, new dsm(bdVar2.F(), dsfVar2, bdVar2.D(), dtpVar2), dsfVar2);
            ebz ebzVar2 = dsfVar2.e.j;
            gzp.h(dsfVar2.n);
            drp drpVar = dstVar.e;
            SelectedAccountDisc selectedAccountDisc3 = drpVar.b;
            dsf dsfVar3 = drpVar.a;
            selectedAccountDisc3.e = dsfVar3;
            efu efuVar = dsfVar3.k;
            efuVar.a(selectedAccountDisc3, 75245);
            AccountParticleDisc accountParticleDisc2 = selectedAccountDisc3.b;
            accountParticleDisc2.e();
            accountParticleDisc2.i(selectedAccountDisc3.g);
            accountParticleDisc2.f(dsfVar3.i, dsfVar3.c);
            accountParticleDisc2.d(efuVar);
            selectedAccountDisc3.getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size);
            accountParticleDisc2.a();
            gzp gzpVar = dsfVar3.e.b;
            if (selectedAccountDisc3.k) {
                selectedAccountDisc3.post(new ajx((Object) selectedAccountDisc3, (Object) dsfVar3, (Object) V2, 14, (short[]) null));
            } else {
                selectedAccountDisc3.b(dsfVar3, V2);
            }
            fu fuVar = new fu(drpVar, 3);
            fu fuVar2 = new fu(drpVar, 4);
            selectedAccountDisc3.addOnAttachStateChangeListener(fuVar);
            selectedAccountDisc3.addOnAttachStateChangeListener(fuVar2);
            int i = yq.a;
            if (selectedAccountDisc3.isAttachedToWindow()) {
                fuVar.onViewAttachedToWindow(selectedAccountDisc3);
                fuVar2.onViewAttachedToWindow(selectedAccountDisc3);
            }
            dsoVar.d = new dlj(dstVar, 12);
            fao.c();
            abb abbVar = new abb(dsoVar, new dsn(dsoVar), 2);
            View view = dsoVar.a;
            view.addOnAttachStateChangeListener(abbVar);
            if (view.isAttachedToWindow()) {
                abbVar.onViewAttachedToWindow(view);
            }
            view.setEnabled(dsoVar.b.d());
            dsm dsmVar = dsoVar.c;
            dtp dtpVar3 = dsmVar.d;
            view.setOnClickListener(new drl(dsoVar, new dsl(dsmVar.b, dsmVar.a, dsmVar.c, dtpVar3.a, dtpVar3.b), 2));
        }
        findItem.setEnabled(this.e.d());
    }

    public final void b(OpenSearchBar openSearchBar) {
        fao.c();
        this.c = R.id.open_search_bar;
        a(openSearchBar);
    }
}
