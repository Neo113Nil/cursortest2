package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckz extends cms {
    private static final bxm k;
    private static final ow l = new ow(null);
    private static final ox m;

    static {
        cky ckyVar = new cky();
        m = ckyVar;
        k = new bxm("ClearcutLoggerSampling.API", ckyVar);
    }

    public ckz(Context context) {
        super(context, null, k, cmk.a, cmr.a);
    }

    public final ddi a(clc clcVar) {
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{cjs.b};
        cpaVar.b(false);
        cpaVar.a = new ciu(clcVar, 3);
        return super.i(0, cpaVar.a());
    }
}
