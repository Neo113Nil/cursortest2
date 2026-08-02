package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chb extends cms implements cmw {
    private static final bxm k;
    private static final ow l = new ow(null);
    private static final ox m;

    static {
        cgz cgzVar = new cgz();
        m = cgzVar;
        k = new bxm("Audit.API", cgzVar);
    }

    public chb(Context context) {
        super(context, null, k, null, cmr.a);
    }

    public final ddi a(chd chdVar) {
        cpa cpaVar = new cpa();
        cpaVar.c = 6901;
        cpaVar.a = new ciu(chdVar, 1);
        return super.i(1, cpaVar.a());
    }
}
