package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccu implements ibg {
    public static final ccu a = new ccu();
    private static final ibf b = ibf.a("sdkVersion");
    private static final ibf c = ibf.a("model");
    private static final ibf d = ibf.a("hardware");
    private static final ibf e = ibf.a("device");
    private static final ibf f = ibf.a("product");
    private static final ibf g = ibf.a("osBuild");
    private static final ibf h = ibf.a("manufacturer");
    private static final ibf i = ibf.a("fingerprint");
    private static final ibf j = ibf.a("locale");
    private static final ibf k = ibf.a("country");
    private static final ibf l = ibf.a("mccMnc");
    private static final ibf m = ibf.a("applicationBuild");

    @Override // defpackage.ibd
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        cct cctVar = (cct) obj;
        ibh ibhVar = (ibh) obj2;
        ibhVar.b(b, cctVar.a());
        ibhVar.b(c, cctVar.j());
        ibhVar.b(d, cctVar.f());
        ibhVar.b(e, cctVar.d());
        ibhVar.b(f, cctVar.l());
        ibhVar.b(g, cctVar.k());
        ibhVar.b(h, cctVar.h());
        ibhVar.b(i, cctVar.e());
        ibhVar.b(j, cctVar.g());
        ibhVar.b(k, cctVar.c());
        ibhVar.b(l, cctVar.i());
        ibhVar.b(m, cctVar.b());
    }
}
