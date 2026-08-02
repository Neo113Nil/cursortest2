package defpackage;

import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class efv implements efu {
    private final dme a;
    private final hac b;
    private final ekx c;

    public efv(dov dovVar, dqy dqyVar, dme dmeVar, hac hacVar) {
        this.a = dmeVar;
        this.b = hacVar;
        this.c = new ekx((efu) this, new ehn(this, dmeVar, null), dovVar, dqyVar);
    }

    private final bqd h(int i) {
        return g(i, gyf.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dqy, java.lang.Object] */
    @Override // defpackage.efu
    public final void a(View view, int i) {
        fao.c();
        ekx ekxVar = this.c;
        efq efqVar = new efq(ekxVar, view, i);
        view.addOnAttachStateChangeListener(efqVar);
        ekxVar.e(view, i, ekxVar.c.a());
        int i2 = yq.a;
        if (view.isAttachedToWindow()) {
            efqVar.onViewAttachedToWindow(view);
        }
    }

    @Override // defpackage.efu
    public final void b(View view, int i) {
        fao.c();
        this.a.b().b(view, h(i));
    }

    @Override // defpackage.efu
    public final void c(View view, int i) {
        fao.c();
        dlb b = this.a.b();
        bqd h = h(i);
        if (dla.b(view) == null) {
            b.b(view, h);
        }
    }

    @Override // defpackage.efu
    public final void d(View view, int i, dkq dkqVar) {
        fao.c();
        dlb b = this.a.b();
        bqd h = h(i);
        h.b(dkqVar);
        b.b(view, h);
    }

    @Override // defpackage.efu
    public final void e(View view) {
        fao.c();
        dlb b = this.a.b();
        fao.c();
        dks b2 = dla.b(view);
        if (b2 == null) {
            cka ckaVar = b.a;
            dih.e(new NullPointerException("Tried to unbind a view without an associated CVE. This indicates a GIL instrumentation error. Is `ViewVisualElements#unbind` being invoked unconditionally when `ViewVisualElements#bind` is invoked conditionally?"));
            return;
        }
        dla dlaVar = b2.b;
        if (dlaVar.h.f()) {
            View view2 = dlaVar.a;
            view2.removeOnAttachStateChangeListener(dlaVar);
            int i = yq.a;
            if (view2.isAttachedToWindow()) {
                dlaVar.onViewDetachedFromWindow(view2);
            }
        }
        dlaVar.e = null;
        dlaVar.a.setTag(R.id.ve_tag, null);
        hoq.H(!b2.b.c);
        b2.b = null;
    }

    @Override // defpackage.efu
    public final void f(cfe cfeVar, View view) {
        dkv a = this.a.a();
        dkt dktVar = (dkt) view.getTag(R.id.interaction_info_tag);
        if (dktVar != null) {
            cfeVar.b(dktVar);
            view.setTag(R.id.interaction_info_tag, null);
        }
        a.a(cfeVar.a(), view);
    }

    public final bqd g(int i, gzp gzpVar) {
        dkr j;
        this.a.c();
        hac hacVar = this.b;
        bqd h = cka.h(i);
        dkr dkrVar = (dkr) hacVar.bB();
        if (dkrVar != null) {
            h.c(dkrVar);
            return h;
        }
        if (gzpVar.f()) {
            efo efoVar = (efo) gzpVar.b();
            int i2 = efoVar.b - 1;
            if (i2 != 0) {
                j = i2 != 1 ? dih.k() : dih.i();
            } else {
                String str = efoVar.a;
                str.getClass();
                j = dih.j(str);
            }
            h.c(j);
        }
        return h;
    }
}
