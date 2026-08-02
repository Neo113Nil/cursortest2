package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cee implements ibg {
    static final cee a = new cee();
    private static final ibf b;
    private static final ibf c;
    private static final ibf d;
    private static final ibf e;

    static {
        jed jedVar = new jed("window");
        jxh jxhVar = new jxh((byte[]) null);
        jxhVar.a = 1;
        jedVar.b(jxhVar.d());
        b = jedVar.a();
        jed jedVar2 = new jed("logSourceMetrics");
        jxh jxhVar2 = new jxh((byte[]) null);
        jxhVar2.a = 2;
        jedVar2.b(jxhVar2.d());
        c = jedVar2.a();
        jed jedVar3 = new jed("globalMetrics");
        jxh jxhVar3 = new jxh((byte[]) null);
        jxhVar3.a = 3;
        jedVar3.b(jxhVar3.d());
        d = jedVar3.a();
        jed jedVar4 = new jed("appNamespace");
        jxh jxhVar4 = new jxh((byte[]) null);
        jxhVar4.a = 4;
        jedVar4.b(jxhVar4.d());
        e = jedVar4.a();
    }

    @Override // defpackage.ibd
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        cfd cfdVar = (cfd) obj;
        ibh ibhVar = (ibh) obj2;
        ibhVar.b(b, cfdVar.a);
        ibhVar.b(c, cfdVar.b);
        ibhVar.b(d, cfdVar.c);
        ibhVar.b(e, cfdVar.d);
    }
}
