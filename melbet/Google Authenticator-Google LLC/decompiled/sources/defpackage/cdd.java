package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdd implements ibg {
    public static final cdd a = new cdd();
    private static final ibf b = ibf.a("networkType");
    private static final ibf c = ibf.a("mobileSubtype");

    @Override // defpackage.ibd
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        cec cecVar = (cec) obj;
        ibh ibhVar = (ibh) obj2;
        ibhVar.b(b, cecVar.b());
        ibhVar.b(c, cecVar.a());
    }
}
