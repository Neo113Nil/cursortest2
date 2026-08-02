package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cek implements ibg {
    static final cek a = new cek();
    private static final ibf b;
    private static final ibf c;

    static {
        jed jedVar = new jed("startMs");
        jxh jxhVar = new jxh((byte[]) null);
        jxhVar.a = 1;
        jedVar.b(jxhVar.d());
        b = jedVar.a();
        jed jedVar2 = new jed("endMs");
        jxh jxhVar2 = new jxh((byte[]) null);
        jxhVar2.a = 2;
        jedVar2.b(jxhVar2.d());
        c = jedVar2.a();
    }

    @Override // defpackage.ibd
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        cfj cfjVar = (cfj) obj;
        ibh ibhVar = (ibh) obj2;
        ibhVar.a(b, cfjVar.a);
        ibhVar.a(c, cfjVar.b);
    }
}
