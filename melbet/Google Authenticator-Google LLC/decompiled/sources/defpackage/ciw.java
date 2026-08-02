package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ciw extends cms implements cmw {
    private static final bxm k;
    private static final ow l = new ow(null);
    private static final ox m;

    static {
        civ civVar = new civ();
        m = civVar;
        k = new bxm("AccountDataService.API", civVar);
    }

    public ciw(Context context) {
        super(context, null, k, cmj.a, new cmq().a());
    }

    public final ddi a(String str) {
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{chg.e};
        cpaVar.a = new ciu(str, 0);
        cpaVar.c = 1649;
        return super.i(1, cpaVar.a());
    }
}
