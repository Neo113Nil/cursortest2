package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alq extends kra implements krx {
    int a;
    final /* synthetic */ kqn b;
    final /* synthetic */ ajw c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ krt f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alq(kqn kqnVar, ajw ajwVar, boolean z, boolean z2, krt krtVar, kqj kqjVar) {
        super(2, kqjVar);
        this.b = kqnVar;
        this.c = ajwVar;
        this.d = z;
        this.e = z2;
        this.f = krtVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alq) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        kqp kqpVar = kqp.a;
        int i = this.a;
        ixc.Y(obj);
        if (i != 0) {
            return obj;
        }
        kqn kqnVar = this.b;
        alp alpVar = new alp(this.c, this.d, this.e, this.f, null);
        this.a = 1;
        Object f = ixg.f(kqnVar, alpVar, this);
        return f == kqpVar ? kqpVar : f;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        return new alq(this.b, this.c, this.d, this.e, this.f, kqjVar);
    }
}
