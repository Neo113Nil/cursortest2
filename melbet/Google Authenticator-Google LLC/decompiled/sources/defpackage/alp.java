package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class alp extends kra implements krx {
    int a;
    final /* synthetic */ ajw b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ krt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alp(ajw ajwVar, boolean z, boolean z2, krt krtVar, kqj kqjVar) {
        super(2, kqjVar);
        this.b = ajwVar;
        this.c = z;
        this.d = z2;
        this.e = krtVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alp) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        kqp kqpVar = kqp.a;
        int i = this.a;
        ixc.Y(obj);
        if (i != 0) {
            return obj;
        }
        ajw ajwVar = this.b;
        alo aloVar = new alo(!(ajwVar.q() && ajwVar.r()) && this.c, this.d, ajwVar, null, this.e);
        this.a = 1;
        Object v = ajwVar.v(aloVar, this);
        return v == kqpVar ? kqpVar : v;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        return new alp(this.b, this.c, this.d, this.e, kqjVar);
    }
}
