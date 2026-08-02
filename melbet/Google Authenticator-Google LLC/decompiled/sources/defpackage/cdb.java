package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdb implements ibg {
    public static final cdb a = new cdb();
    private static final ibf b = ibf.a("eventTimeMs");
    private static final ibf c = ibf.a("eventCode");
    private static final ibf d = ibf.a("complianceData");
    private static final ibf e = ibf.a("eventUptimeMs");
    private static final ibf f = ibf.a("sourceExtension");
    private static final ibf g = ibf.a("sourceExtensionJsonProto3");
    private static final ibf h = ibf.a("timezoneOffsetSeconds");
    private static final ibf i = ibf.a("networkConnectionInfo");
    private static final ibf j = ibf.a("experimentIds");

    @Override // defpackage.ibd
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        cdx cdxVar = (cdx) obj;
        ibh ibhVar = (ibh) obj2;
        ibhVar.a(b, cdxVar.a());
        ibhVar.b(c, cdxVar.g());
        ibhVar.b(d, cdxVar.d());
        ibhVar.a(e, cdxVar.b());
        ibhVar.b(f, cdxVar.i());
        ibhVar.b(g, cdxVar.h());
        ibhVar.a(h, cdxVar.c());
        ibhVar.b(i, cdxVar.f());
        ibhVar.b(j, cdxVar.e());
    }
}
