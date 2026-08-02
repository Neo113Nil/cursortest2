package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cww extends cms implements cvd {
    public static final cwr k;
    public static final cwk l;
    private static final cws m;
    private static final bxm n;
    private static final ow o = new ow(null);

    static {
        cws cwsVar = new cws();
        m = cwsVar;
        n = new bxm("InAppReach.API", cwsVar);
        k = cwr.a;
        l = new cwk(cwq.a);
    }

    public cww(Context context) {
        super(context, null, n, cmk.a, cmr.a);
    }

    @Override // defpackage.cvd
    public final void a(String str, ijw ijwVar, String str2) {
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{cvb.d};
        cpaVar.a = new dds(str, ijwVar, str2, 1);
        cpaVar.c = 28017;
        super.i(0, cpaVar.a());
    }
}
