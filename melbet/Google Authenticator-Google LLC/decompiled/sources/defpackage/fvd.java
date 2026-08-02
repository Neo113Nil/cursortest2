package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fvd implements fuo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fvd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, koe] */
    @Override // defpackage.fuo
    public final hvi a(fun funVar) {
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            hvi aJ = hnu.aJ(null);
            ((iwq) obj).k(aJ, "com.google.apps.tiktok.account.data.AllAccounts");
            return aJ;
        }
        if (i == 1) {
            ((ftf) this.a).a();
            return hnu.aJ(null);
        }
        if (i != 2) {
            return ((gqn) this.a.b()).e();
        }
        fyc fycVar = new fyc(funVar.a, 0);
        Object obj2 = this.a;
        return ((fye) obj2).b.a(fycVar, huf.a);
    }
}
