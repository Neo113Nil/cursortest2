package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alr extends kra implements krx {
    int a;
    final /* synthetic */ ajw b;
    final /* synthetic */ boolean c;
    final /* synthetic */ krt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alr(kqj kqjVar, ajw ajwVar, boolean z, krt krtVar) {
        super(2, kqjVar);
        this.b = ajwVar;
        this.c = z;
        this.d = krtVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alr) c((kvm) obj, (kqj) obj2)).b(kow.a);
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
        ehp ehpVar = new ehp(this.c, ajwVar, (kqj) null, this.d, 1);
        this.a = 1;
        Object v = ajwVar.v(ehpVar, this);
        return v == kqpVar ? kqpVar : v;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        return new alr(kqjVar, this.b, this.c, this.d);
    }
}
