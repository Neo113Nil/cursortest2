package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qa implements oq0 {
    public static final qa a = new qa();
    public static final wx b = wx.a("requestTimeMs");
    public static final wx c = wx.a("requestUptimeMs");
    public static final wx d = wx.a("clientInfo");
    public static final wx e = wx.a("logSource");
    public static final wx f = wx.a("logSourceName");
    public static final wx g = wx.a("logEvent");
    public static final wx h = wx.a("qosTier");

    @Override // defpackage.tv
    public final void a(Object obj, Object obj2) {
        wi0 wi0Var = (wi0) obj;
        pq0 pq0Var = (pq0) obj2;
        pq0Var.e(b, ((rb) wi0Var).a);
        rb rbVar = (rb) wi0Var;
        pq0Var.e(c, rbVar.b);
        pq0Var.a(d, rbVar.c);
        pq0Var.a(e, rbVar.d);
        pq0Var.a(f, rbVar.e);
        pq0Var.a(g, rbVar.f);
        pq0Var.a(h, t01.d);
    }
}
