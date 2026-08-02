package defpackage;

import android.content.Context;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class csg extends cms implements cmw {
    private static final bxm k;
    private static final ow l = new ow(null);
    private static final ox m;

    static {
        csd csdVar = new csd();
        m = csdVar;
        k = new bxm("ModuleInstall.API", csdVar);
    }

    public csg(Context context) {
        super(context, null, k, cmk.a, cmr.a);
    }

    public final ddi a(cmx... cmxVarArr) {
        oy.au(cmxVarArr[0], "Requested API must not be null.");
        csa a = csa.a(Arrays.asList(cmxVarArr), false);
        if (a.a.isEmpty()) {
            return dih.w(new crx(true, 0));
        }
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{cye.a};
        cpaVar.c = 27301;
        cpaVar.b(false);
        cpaVar.a = new ciu(a, 7);
        return super.i(0, cpaVar.a());
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public final ddi b(cfe cfeVar) {
        csa a = csa.a(cfeVar.a, true);
        if (a.a.isEmpty()) {
            return dih.w(new crz(0, false));
        }
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{cye.a};
        cpaVar.b(true);
        cpaVar.c = 27304;
        cpaVar.a = new ciu(a, 8);
        return super.i(0, cpaVar.a());
    }
}
