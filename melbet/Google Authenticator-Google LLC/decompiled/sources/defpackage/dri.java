package defpackage;

import android.graphics.ColorFilter;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dri extends kr {
    public final dov a;
    public final gzp e;
    public Object f;
    public hel g;
    private final dpd h;
    private final dqy i;
    private final efu j;
    private final dqu k;
    private final int m;
    private final fym o;
    private final List l = new ArrayList();
    private final dja n = new drg(this);

    public dri(dre dreVar, drd drdVar, jnu jnuVar, efu efuVar, int i, dqu dquVar) {
        dpd dpdVar = dreVar.a;
        dpdVar.getClass();
        this.h = dpdVar;
        dov dovVar = dreVar.b;
        dovVar.getClass();
        this.a = dovVar;
        dqy dqyVar = dreVar.c;
        dqyVar.getClass();
        this.i = dqyVar;
        this.e = dreVar.e;
        this.j = efuVar;
        this.k = dquVar;
        efc efcVar = dreVar.d;
        efcVar.getClass();
        jnuVar.getClass();
        this.o = new fym(dqyVar, efcVar, jnuVar, efuVar, new drf(drdVar));
        this.m = i;
    }

    @Override // defpackage.kr
    public final int a() {
        return this.l.size();
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ lp d(ViewGroup viewGroup, int i) {
        return new drc(viewGroup, this.a, this.h, this.e, this.k, this.m, this.j);
    }

    @Override // defpackage.kr
    public final void j(RecyclerView recyclerView) {
        dqy dqyVar = this.i;
        dqyVar.e(this.n);
        this.f = dqyVar.a();
        this.g = hel.o(((drb) dqyVar).g());
        gzp gzpVar = this.k.a;
        t();
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ void k(lp lpVar, int i) {
        List list = this.l;
        drc drcVar = (drc) lpVar;
        fym fymVar = this.o;
        Object obj = list.get(i);
        int i2 = 1;
        drl drlVar = new drl(fymVar, obj, i2, null);
        AccountParticle accountParticle = drcVar.t;
        accountParticle.l = true;
        accountParticle.b(drcVar.w);
        drcVar.x = obj;
        accountParticle.m.k(obj, new edo(drcVar, i2));
        gzp gzpVar = drcVar.u;
        accountParticle.setOnClickListener(drlVar);
        accountParticle.j.setAlpha(1.0f);
        accountParticle.k.setAlpha(1.0f);
        AccountParticleDisc accountParticleDisc = accountParticle.i;
        accountParticleDisc.setAlpha(1.0f);
        accountParticleDisc.a.setColorFilter((ColorFilter) null);
        accountParticle.findViewById(R.id.og_account_deactivated_help_tooltip).setVisibility(8);
        gzp gzpVar2 = drcVar.v;
    }

    @Override // defpackage.kr
    public final void l(RecyclerView recyclerView) {
        this.i.f(this.n);
        gzp gzpVar = this.k.a;
        this.l.clear();
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ void n(lp lpVar) {
        drc drcVar = (drc) lpVar;
        AccountParticle accountParticle = drcVar.t;
        accountParticle.e(drcVar.w);
        accountParticle.l = false;
        gzp gzpVar = drcVar.v;
    }

    public final void t() {
        fao.c();
        List list = this.l;
        ArrayList arrayList = new ArrayList(list);
        gzp gzpVar = this.k.a;
        ArrayList arrayList2 = new ArrayList(this.g);
        Object obj = this.f;
        if (obj != null) {
            arrayList2.remove(obj);
        }
        ey a = fd.a(new drh(this, arrayList, arrayList2));
        list.clear();
        list.addAll(arrayList2);
        a.a(new ev(this));
    }
}
