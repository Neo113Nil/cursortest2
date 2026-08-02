package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afm extends kra implements krx {
    int a;
    final /* synthetic */ ael b;
    final /* synthetic */ aek c;
    final /* synthetic */ krx d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(ael aelVar, aek aekVar, krx krxVar, kqj kqjVar) {
        super(2, kqjVar);
        this.b = aelVar;
        this.c = aekVar;
        this.d = krxVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afm) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        kqp kqpVar = kqp.a;
        int i = this.a;
        ixc.Y(obj);
        if (i == 0) {
            kvm kvmVar = (kvm) this.e;
            kvj kvjVar = kwa.a;
            kxf i2 = lcv.a.i();
            afl aflVar = new afl(this.b, this.c, kvmVar, this.d, null);
            this.a = 1;
            if (ixg.f(i2, aflVar, this) == kqpVar) {
                return kqpVar;
            }
        }
        return kow.a;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        afm afmVar = new afm(this.b, this.c, this.d, kqjVar);
        afmVar.e = obj;
        return afmVar;
    }
}
