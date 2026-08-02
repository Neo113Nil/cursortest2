package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kzo implements kzr {
    final /* synthetic */ kzp a;
    final /* synthetic */ ksw b;
    final /* synthetic */ kzr c;

    public kzo(kzp kzpVar, ksw kswVar, kzr kzrVar) {
        this.a = kzpVar;
        this.b = kswVar;
        this.c = kzrVar;
    }

    @Override // defpackage.kzr
    public final Object cg(Object obj, kqj kqjVar) {
        ksw kswVar = this.b;
        Object obj2 = kswVar.a;
        if (obj2 != lbd.a && ((Boolean) this.a.b.a(obj2, obj)).booleanValue()) {
            return kow.a;
        }
        kswVar.a = obj;
        return this.c.cg(obj, kqjVar);
    }
}
