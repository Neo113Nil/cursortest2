package defpackage;

import android.view.View;
import com.google.android.apps.authenticator2.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwe implements dtx {
    public final jiw a;
    public final jit b;
    public jhy c;
    public jhy d;
    public jhy e;
    public final ebp f;
    public final jhy g;
    public final int h;
    public final int i;
    public final jiu j;
    public final gjl k;
    private final String l;
    private final gzp m;
    private final gzp n;
    private final int o;
    private final jiu p;
    private final int q;
    private final int r;
    private final int s;

    public dwe(jiw jiwVar, gjl gjlVar, jit jitVar, String str, dtd dtdVar, gzp gzpVar, gzp gzpVar2) {
        this.a = jiwVar;
        this.k = gjlVar;
        this.b = jitVar;
        this.l = str;
        this.m = gzpVar;
        this.n = gzpVar2;
        Object obj = gjlVar.i;
        int i = 3;
        int i2 = 0;
        jhy jhyVar = null;
        if (obj != null && jitVar != null) {
            this.c = b(ixc.b(str != null ? new jhh(R.string.og_bento_use_product_without_an_account, str) : new jhh(R.string.og_bento_use_without_an_account_fallback)), new jha(10, null), 90140, this.s, jiwVar.a(new dwd(obj, i)), 2);
        }
        if (dih.ap(gjlVar.a)) {
            this.d = eos.D(new jhh(R.string.og_add_another_account), new jha(7, null), 90141, this.q, jiwVar.a(new dwd(this, i2)));
            this.e = eos.D(new jhh(R.string.og_manage_accounts), new jha(9, null), 90142, this.r, jiwVar.a(new dwd(this, 4)));
        }
        dtdVar.b(jitVar, this);
        int generateViewId = View.generateViewId();
        this.o = generateViewId;
        int i3 = 2;
        ebp a = gjlVar.b ? dsk.a(null, gjlVar.a, gzpVar2.a(new ccb(new dvm(2), 18))) : null;
        this.f = a;
        jiu a2 = jiwVar.a(new dwd(this, i3));
        this.p = a2;
        this.q = View.generateViewId();
        this.r = View.generateViewId();
        if (a != null) {
            String str2 = a.d;
            str2.getClass();
            jhyVar = b(ixc.b(new jhh(str2)), new jha(8, null), a.e, generateViewId, a2, 1);
        }
        this.g = jhyVar;
        this.h = View.generateViewId();
        this.s = View.generateViewId();
        this.i = View.generateViewId();
        this.j = jiwVar.a(new dvm(3));
    }

    public static final jhy b(List list, jgu jguVar, int i, int i2, jiu jiuVar, int i3) {
        return new jhy(new jim(new jig(jguVar), new jhq(list, jhb.b, 2, (Integer) 2, (List) kpk.a), null, null, null, null, null, i3, 0, 1788), i2, jhb.i, jiuVar, (kri) null, i, 80);
    }

    @Override // defpackage.dtx
    public final void a(jfq jfqVar) {
        jfqVar.getClass();
        this.c = jfqVar.d ? this.c : null;
    }
}
