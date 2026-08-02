package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdc implements ibg {
    public static final cdc a = new cdc();
    private static final ibf b = ibf.a("requestTimeMs");
    private static final ibf c = ibf.a("requestUptimeMs");
    private static final ibf d = ibf.a("clientInfo");
    private static final ibf e = ibf.a("logSource");
    private static final ibf f = ibf.a("logSourceName");
    private static final ibf g = ibf.a("logEvent");
    private static final ibf h = ibf.a("qosTier");

    @Override // defpackage.ibd
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        cdy cdyVar = (cdy) obj;
        ibh ibhVar = (ibh) obj2;
        ibhVar.a(b, cdyVar.a());
        ibhVar.a(c, cdyVar.b());
        ibhVar.b(d, cdyVar.c());
        ibhVar.b(e, cdyVar.e());
        ibhVar.b(f, cdyVar.f());
        ibhVar.b(g, cdyVar.g());
        ibhVar.b(h, cdyVar.d());
    }
}
