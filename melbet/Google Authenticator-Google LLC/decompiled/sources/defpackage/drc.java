package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drc extends lp {
    public final AccountParticle t;
    public final gzp u;
    public final gzp v;
    public final efu w;
    public Object x;

    public drc(ViewGroup viewGroup, dov dovVar, dpd dpdVar, gzp gzpVar, dqu dquVar, int i, efu efuVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.account_list_item, viewGroup, false));
        C(this.a, i, i);
        AccountParticle accountParticle = (AccountParticle) this.a.findViewById(R.id.account_list_item_particle);
        this.t = accountParticle;
        this.u = gzpVar;
        this.v = dquVar.a;
        this.w = efuVar;
        C(accountParticle, accountParticle.getResources().getDimensionPixelSize(R.dimen.account_particle_avatar_margin_start), 0);
        accountParticle.i.i(true);
        accountParticle.i.e();
        accountParticle.i.f(dpdVar, dovVar);
        accountParticle.m = new fym(accountParticle, dovVar, dquVar);
        gzp gzpVar2 = dquVar.a;
    }

    private static void C(View view, int i, int i2) {
        int i3 = yq.a;
        view.setPaddingRelative(view.getPaddingStart() + i, view.getPaddingTop(), view.getPaddingEnd() + i2, view.getPaddingBottom());
    }
}
