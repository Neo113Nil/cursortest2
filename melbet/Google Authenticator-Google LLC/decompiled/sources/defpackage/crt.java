package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class crt extends cms implements cmw {
    private static final bxm k;
    private static final ow l = new ow(null);
    private static final ox m;

    static {
        crs crsVar = new crs();
        m = crsVar;
        k = new bxm("ClientThrottling.API", crsVar);
    }

    public crt(Context context) {
        super(context, null, k, cmk.a, cmr.a);
    }

    public final void a(cpt cptVar) {
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{cle.c};
        cpaVar.b(false);
        cpaVar.a = new ciu(cptVar, 5);
        super.i(2, cpaVar.a());
    }
}
