package defpackage;

import android.content.Context;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ecb extends dpp {
    public boolean b;
    public Object c;
    private final dov d;
    private final dpo e;
    private her f = hix.b;

    public ecb(Context context, dov dovVar, hac hacVar, aer aerVar) {
        this.d = dovVar;
        gyf gyfVar = gyf.a;
        String str = ebt.a;
        this.e = new dpo(gzp.h(new dpn(null, new dqg(new drv(2), String.valueOf(ebt.a).concat(".getYellowAlertBadge")), context.getString(R.string.og_important_account_alert_badge_a11y_label), 2)), gyfVar);
        ((aez) hacVar.bB()).d(aerVar, new ph(this, 8));
    }

    @Override // defpackage.dpp
    public final void a(Object obj) {
        fao.c();
        this.c = obj;
        Object obj2 = gyf.a;
        if (obj != null) {
            cvi cviVar = (cvi) dih.aq(this.d, obj, this.f, cvi.a);
            if (cviVar != null && !this.b) {
                iiz iizVar = cviVar.b;
                if (iizVar == null) {
                    iizVar = iiz.a;
                }
                ija ijaVar = iizVar.b;
                if (ijaVar == null) {
                    ijaVar = ija.a;
                }
                int x = a.x(ijaVar.b);
                if (x != 0 && x == 3) {
                    obj2 = gzp.h(this.e);
                }
            }
        }
        this.a.i(obj2);
    }

    public final void b(her herVar) {
        this.f = herVar;
        dih.W(new dlj(this, 18));
    }
}
