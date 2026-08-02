package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyx implements aec {
    public final bd a;
    public final frz b;
    public final gbi c;
    final dsg d;
    public frv f;
    public fuf g;
    private final gva h;
    private final aec i;
    private final cbp k;
    private final dja j = new fyt(this);
    public final gbj e = new fyu(this);

    public fyx(bd bdVar, frz frzVar, gzp gzpVar, cbp cbpVar, gbi gbiVar, gva gvaVar) {
        fyv fyvVar = new fyv(this);
        this.i = fyvVar;
        this.f = null;
        this.g = null;
        this.a = bdVar;
        this.b = frzVar;
        this.k = cbpVar;
        this.c = gbiVar;
        this.h = gvaVar;
        dsg dsgVar = new dsg(new fyz(gzpVar));
        this.d = dsgVar;
        dsgVar.a.a = false;
        if (cbpVar.h()) {
            hoq.H(bdVar.L().c == aek.b);
            bdVar.L().a(fyvVar);
        }
        bdVar.L().a(this);
        bdVar.aE().b("tiktok_og_model_saved_instance_state", new bn(this, 7));
    }

    private final void i(fuf fufVar) {
        cbp cbpVar = this.k;
        if (!cbpVar.h()) {
            this.b.h(fufVar.a);
            return;
        }
        gbi gbiVar = this.c;
        ful fulVar = fufVar.b;
        new fzu(fulVar.c, fulVar.g, fulVar.k);
        gbiVar.j(cbp.k(cbpVar.i()), new cbp(fufVar.a), this.e);
    }

    @Override // defpackage.aec
    public final void a(aer aerVar) {
        bd bdVar = this.a;
        Bundle a = bdVar.aE().d() ? bdVar.aE().a("tiktok_og_model_saved_instance_state") : null;
        if (a != null) {
            this.f = (frv) a.getParcelable("active_account_id");
        }
        this.d.e(this.j);
    }

    @Override // defpackage.aec
    public final void b(aer aerVar) {
        this.d.f(this.j);
    }

    public final fuf g(frv frvVar) {
        if (frvVar == null) {
            return null;
        }
        hel g = this.d.g();
        int i = ((his) g).c;
        int i2 = 0;
        while (i2 < i) {
            fuf fufVar = (fuf) g.get(i2);
            i2++;
            if (frvVar.equals(fufVar.a)) {
                return fufVar;
            }
        }
        return null;
    }

    final void h(fuf fufVar) {
        if (gta.u()) {
            i(fufVar);
            return;
        }
        gtt f = this.h.f("Nav: Switch Account", 114);
        try {
            i(fufVar);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aec
    public final /* synthetic */ void bJ(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void d(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void e(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void f(aer aerVar) {
    }
}
