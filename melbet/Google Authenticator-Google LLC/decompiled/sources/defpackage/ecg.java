package defpackage;

import android.content.Context;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ecg extends dpp {
    public final ecj b;
    public Object c;
    public hel d;
    public boolean e;
    private final dqv f;
    private final Context g;

    public ecg(Context context, aer aerVar, dqv dqvVar) {
        int i = hel.d;
        this.d = his.a;
        this.g = context;
        this.f = dqvVar;
        this.b = new ecj(context);
        dqvVar.d(aerVar, new ph(this, 9));
    }

    @Override // defpackage.dpp
    public final void a(Object obj) {
        Object h;
        fao.c();
        this.c = obj;
        if (obj == null) {
            h = gyf.a;
        } else {
            int i = hel.d;
            heg hegVar = new heg(4);
            hegVar.j(this.d);
            hegVar.h(this.c);
            hel g = hegVar.g();
            dqv dqvVar = this.f;
            if (dqvVar.m(g)) {
                Context context = this.g;
                Context applicationContext = context.getApplicationContext();
                final int am = dih.am(context, R.attr.ogRedColorOnSurface);
                String str = ebt.a;
                h = gzp.h(new dpo(gzp.h(new dpn(null, new dqg(new gzf() { // from class: ebs
                    @Override // defpackage.gzf
                    public final Object a(Object obj2) {
                        Context context2 = (Context) obj2;
                        String str2 = ebt.a;
                        return ebt.a(context2, ecy.b(context2).a, am);
                    }
                }, String.valueOf(ebt.a).concat(".getRedAlertBadge")), applicationContext.getString(R.string.og_critical_security_alert_badge_label_a11y), 3)), (this.e && hnu.Z(g, new bqg(dqvVar, 10))) ? gzp.h(dja.m(null, null, this.b, 3)) : gyf.a));
            } else {
                h = gyf.a;
            }
        }
        this.a.i(h);
    }
}
