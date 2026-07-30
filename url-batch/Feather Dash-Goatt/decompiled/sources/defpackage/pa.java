package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pa implements oq0 {
    public static final pa a = new pa();
    public static final wx b = wx.a("eventTimeMs");
    public static final wx c = wx.a("eventCode");
    public static final wx d = wx.a("eventUptimeMs");
    public static final wx e = wx.a("sourceExtension");
    public static final wx f = wx.a("sourceExtensionJsonProto3");
    public static final wx g = wx.a("timezoneOffsetSeconds");
    public static final wx h = wx.a("networkConnectionInfo");

    @Override // defpackage.tv
    public final void a(Object obj, Object obj2) {
        ti0 ti0Var = (ti0) obj;
        pq0 pq0Var = (pq0) obj2;
        pq0Var.e(b, ((qb) ti0Var).a);
        qb qbVar = (qb) ti0Var;
        pq0Var.a(c, qbVar.b);
        pq0Var.e(d, qbVar.c);
        pq0Var.a(e, qbVar.d);
        pq0Var.a(f, qbVar.e);
        pq0Var.e(g, qbVar.f);
        pq0Var.a(h, qbVar.g);
    }
}
