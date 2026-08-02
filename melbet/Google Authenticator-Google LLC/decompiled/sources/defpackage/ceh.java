package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ceh implements ibg {
    static final ceh a = new ceh();
    private static final ibf b;
    private static final ibf c;

    static {
        jed jedVar = new jed("logSource");
        jxh jxhVar = new jxh((byte[]) null);
        jxhVar.a = 1;
        jedVar.b(jxhVar.d());
        b = jedVar.a();
        jed jedVar2 = new jed("logEventDropped");
        jxh jxhVar2 = new jxh((byte[]) null);
        jxhVar2.a = 2;
        jedVar2.b(jxhVar2.d());
        c = jedVar2.a();
    }

    @Override // defpackage.ibd
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        cfh cfhVar = (cfh) obj;
        ibh ibhVar = (ibh) obj2;
        ibhVar.b(b, cfhVar.a);
        ibhVar.b(c, cfhVar.b);
    }
}
