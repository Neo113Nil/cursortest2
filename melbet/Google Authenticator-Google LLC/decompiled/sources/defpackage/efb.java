package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class efb extends efc {
    public static final cjp a = cjp.a(78315553, jom.LOGGER_OVERRIDE_PROVIDER);
    private final dov b;
    private final cji c;
    private final cji d;
    private final String e;

    public efb(dov dovVar, Context context) {
        List list = cji.n;
        cjd cjdVar = new cjd(context, "ONEGOOGLE_MOBILE");
        cjdVar.e = new box(2);
        cji a2 = cjdVar.a();
        cji f = cji.f(context, "ONEGOOGLE_MOBILE");
        this.c = a2;
        this.d = f;
        this.b = dovVar;
        this.e = context.getApplicationContext().getPackageName();
    }

    @Override // defpackage.efc, defpackage.efd
    public final void a(Object obj, jnu jnuVar) {
        cjf g;
        dov dovVar = this.b;
        int i = dovVar.a(obj).a;
        if (i == 4) {
            return;
        }
        if (i == 1 && (obj == null || !dovVar.i(obj))) {
            i = 2;
        }
        int a2 = imn.a(jnuVar.c);
        boolean z = false;
        hoq.x((a2 == 0 || a2 == 1) ? false : true);
        int a3 = imm.a(jnuVar.d);
        hoq.x((a3 == 0 || a3 == 1) ? false : true);
        int B = a.B(jnuVar.f);
        if (B != 0 && B != 1) {
            z = true;
        }
        hoq.x(z);
        jkj k = jnv.a.k();
        jkj C = jnuVar.C();
        String str = this.e;
        if (!C.b.M()) {
            C.t();
        }
        jnu jnuVar2 = (jnu) C.b;
        str.getClass();
        jnuVar2.b |= 64;
        jnuVar2.g = str;
        jnu jnuVar3 = (jnu) C.q();
        if (!k.b.M()) {
            k.t();
        }
        jnv jnvVar = (jnv) k.b;
        jnuVar3.getClass();
        jnvVar.c = jnuVar3;
        jnvVar.b |= 1;
        jnv jnvVar2 = (jnv) k.q();
        int i2 = i - 1;
        if (i2 != 0) {
            g = i2 != 1 ? this.d.g(jnvVar2) : this.c.g(jnvVar2);
        } else {
            g = this.c.g(jnvVar2);
            g.e(String.valueOf(dovVar.d(obj)));
        }
        g.g((imn.a(jnuVar.c) != 0 ? r9 : 1) - 1);
        g.b();
    }
}
