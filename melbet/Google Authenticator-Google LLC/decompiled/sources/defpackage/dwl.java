package defpackage;

import android.view.View;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwl {
    public final jgn a;
    public final jgn b;
    public final gjl c;
    private final jiw d;
    private final gzp e;
    private final int f;
    private final int g;

    public dwl(jiw jiwVar, gjl gjlVar, gzp gzpVar) {
        this.d = jiwVar;
        this.c = gjlVar;
        this.e = gzpVar;
        int generateViewId = View.generateViewId();
        this.f = generateViewId;
        this.g = View.generateViewId();
        dwy dwyVar = (dwy) gzpVar.e();
        if (dwyVar != null) {
            ixc.b(new jic(new jhy(new jim(new jig(new jha(15, null)), new jhq(dwyVar.e(), jhb.b, 2, (Integer) 2, 16), null, null, null, null, null, 1, 0, 1788), generateViewId, jhb.i, jiwVar.a(new dwd(this, 6)), (kri) null, 90143, 80)));
        }
        dwy dwyVar2 = (dwy) gzpVar.e();
        this.a = dwyVar2 != null ? a(dwyVar2.d(), new dwd(this, 7), 90535, new jha(16, null), 2) : null;
        this.b = a(new jhh(R.string.og_account_particle_disc_no_accounts_available_a11y), new dwd(this, 8), 90771, null, 1);
    }

    private final jgn a(jhh jhhVar, krt krtVar, int i, jgu jguVar, int i2) {
        return new jgn(ixc.b(jhhVar), this.d.a(new dwd(krtVar, 5)), i, jhb.d, new jgk(jhb.e), jguVar, i2);
    }
}
