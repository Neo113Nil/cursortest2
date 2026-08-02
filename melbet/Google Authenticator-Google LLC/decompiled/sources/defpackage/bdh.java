package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdh implements bml {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bdh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, wq] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, wq] */
    @Override // defpackage.bml
    public final /* synthetic */ Object a() {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ifn ifnVar = (ifn) obj;
            return new bcz((cme) ifnVar.c, ifnVar.a);
        }
        car carVar = (car) obj;
        Object obj2 = carVar.b;
        Object obj3 = carVar.c;
        Object obj4 = carVar.a;
        Object obj5 = carVar.e;
        bdj bdjVar = (bdj) obj5;
        bfc bfcVar = (bfc) obj4;
        return new bdn((bfc) obj2, (bfc) obj3, bfcVar, bdjVar, (bdj) carVar.f, carVar.d);
    }
}
