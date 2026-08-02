package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cef implements ibg {
    static final cef a = new cef();
    private static final ibf b;

    static {
        jed jedVar = new jed("storageMetrics");
        jxh jxhVar = new jxh((byte[]) null);
        jxhVar.a = 1;
        jedVar.b(jxhVar.d());
        b = jedVar.a();
    }

    @Override // defpackage.ibd
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((ibh) obj2).b(b, ((cfe) obj).a);
    }
}
