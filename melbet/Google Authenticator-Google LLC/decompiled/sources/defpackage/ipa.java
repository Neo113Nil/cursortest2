package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ipa implements ibg {
    static final ipa a = new ipa();
    private static final ibf b;
    private static final ibf c;
    private static final ibf d;
    private static final ibf e;

    static {
        jed jedVar = new jed("supportedFormats");
        jxh jxhVar = new jxh((byte[]) null);
        jxhVar.a = 1;
        jedVar.b(jxhVar.d());
        b = jedVar.a();
        jed jedVar2 = new jed("durationMs");
        jxh jxhVar2 = new jxh((byte[]) null);
        jxhVar2.a = 2;
        jedVar2.b(jxhVar2.d());
        c = jedVar2.a();
        jed jedVar3 = new jed("errorCode");
        jxh jxhVar3 = new jxh((byte[]) null);
        jxhVar3.a = 3;
        jedVar3.b(jxhVar3.d());
        d = jedVar3.a();
        jed jedVar4 = new jed("allowManualInput");
        jxh jxhVar4 = new jxh((byte[]) null);
        jxhVar4.a = 4;
        jedVar4.b(jxhVar4.d());
        e = jedVar4.a();
    }

    @Override // defpackage.ibd
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        iwq iwqVar = (iwq) obj;
        ibh ibhVar = (ibh) obj2;
        ibhVar.b(b, iwqVar.a);
        ibhVar.b(c, iwqVar.b);
        ibhVar.b(d, iwqVar.c);
        ibhVar.b(e, iwqVar.d);
    }
}
