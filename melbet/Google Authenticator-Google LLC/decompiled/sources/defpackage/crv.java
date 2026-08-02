package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class crv extends cms implements cmw {
    private static final bxm k;
    private static final ow l = new ow(null);
    private static final ox m;

    static {
        cru cruVar = new cru();
        m = cruVar;
        k = new bxm("ClientTelemetry.API", cruVar);
    }

    public crv(Context context, crh crhVar) {
        super(context, null, k, crhVar, cmr.a);
    }

    public final ddi a(crg crgVar) {
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{cle.a};
        cpaVar.b(false);
        cpaVar.a = new ciu(crgVar, 6);
        return super.i(2, cpaVar.a());
    }
}
