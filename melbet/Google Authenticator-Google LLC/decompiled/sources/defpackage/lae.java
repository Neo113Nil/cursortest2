package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lae implements kzq {
    final /* synthetic */ kzq a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public lae(kzq kzqVar, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = kzqVar;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kry] */
    @Override // defpackage.kzq
    public final Object a(kzr kzrVar, kqj kqjVar) {
        if (this.d != 0) {
            Object a = this.a.a(new dvp(kzrVar, (ehr) this.b, (dvq) this.c), kqjVar);
            return a == kqp.a ? a : kow.a;
        }
        Object f = ixl.f(kzrVar, new kzq[]{this.a, this.b}, new aji(17), new laf((kry) this.c, (kqj) null, 0), kqjVar);
        return f == kqp.a ? f : kow.a;
    }
}
