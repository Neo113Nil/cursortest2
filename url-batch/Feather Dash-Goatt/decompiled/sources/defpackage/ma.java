package defpackage;

import com.appsflyer.AdRevenueScheme;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ma implements oq0 {
    public static final ma a = new ma();
    public static final wx b = wx.a("sdkVersion");
    public static final wx c = wx.a("model");
    public static final wx d = wx.a("hardware");
    public static final wx e = wx.a("device");
    public static final wx f = wx.a("product");
    public static final wx g = wx.a("osBuild");
    public static final wx h = wx.a("manufacturer");
    public static final wx i = wx.a("fingerprint");
    public static final wx j = wx.a("locale");
    public static final wx k = wx.a(AdRevenueScheme.COUNTRY);
    public static final wx l = wx.a("mccMnc");
    public static final wx m = wx.a("applicationBuild");

    @Override // defpackage.tv
    public final void a(Object obj, Object obj2) {
        l3 l3Var = (l3) obj;
        pq0 pq0Var = (pq0) obj2;
        pq0Var.a(b, ((db) l3Var).a);
        db dbVar = (db) l3Var;
        pq0Var.a(c, dbVar.b);
        pq0Var.a(d, dbVar.c);
        pq0Var.a(e, dbVar.d);
        pq0Var.a(f, dbVar.e);
        pq0Var.a(g, dbVar.f);
        pq0Var.a(h, dbVar.g);
        pq0Var.a(i, dbVar.h);
        pq0Var.a(j, dbVar.i);
        pq0Var.a(k, dbVar.j);
        pq0Var.a(l, dbVar.k);
        pq0Var.a(m, dbVar.l);
    }
}
