package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afl extends kra implements krx {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ael d;
    final /* synthetic */ aek e;
    final /* synthetic */ kvm f;
    final /* synthetic */ krx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afl(ael aelVar, aek aekVar, kvm kvmVar, krx krxVar, kqj kqjVar) {
        super(2, kqjVar);
        this.d = aelVar;
        this.e = aekVar;
        this.f = kvmVar;
        this.g = krxVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afl) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099 A[RETURN] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        Throwable th;
        Object obj2;
        aej aejVar;
        aej aejVar2;
        Object obj3;
        kwu kwuVar;
        aep aepVar;
        Object obj4;
        kqp kqpVar = kqp.a;
        if (this.c == 0) {
            ixc.Y(obj);
            ael aelVar = this.d;
            if (aelVar.c != aek.a) {
                ksw kswVar = new ksw();
                ksw kswVar2 = new ksw();
                try {
                    aek aekVar = this.e;
                    kvm kvmVar = this.f;
                    krx krxVar = this.g;
                    this.a = kswVar;
                    this.b = kswVar2;
                    this.c = 1;
                    kuw kuwVar = new kuw(ixe.d(this), 1);
                    kuwVar.y();
                    aei aeiVar = aej.Companion;
                    aekVar.getClass();
                    int ordinal = aekVar.ordinal();
                    if (ordinal == 2) {
                        aejVar = aej.ON_CREATE;
                    } else if (ordinal == 3) {
                        aejVar = aej.ON_START;
                    } else if (ordinal != 4) {
                        aejVar2 = null;
                        kswVar2.a = new afk(aejVar2, kswVar, kvmVar, aei.a(aekVar), kuwVar, new ldx(), krxVar);
                        Object obj5 = kswVar2.a;
                        obj5.getClass();
                        aelVar.a((aep) obj5);
                        if (kuwVar.l() != kqpVar) {
                            return kqpVar;
                        }
                        obj2 = kswVar;
                        obj4 = kswVar2;
                    } else {
                        aejVar = aej.ON_RESUME;
                    }
                    aejVar2 = aejVar;
                    kswVar2.a = new afk(aejVar2, kswVar, kvmVar, aei.a(aekVar), kuwVar, new ldx(), krxVar);
                    Object obj52 = kswVar2.a;
                    obj52.getClass();
                    aelVar.a((aep) obj52);
                    if (kuwVar.l() != kqpVar) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = kswVar;
                    obj3 = kswVar2;
                    kwuVar = (kwu) ((ksw) obj2).a;
                    if (kwuVar != null) {
                    }
                    aepVar = (aep) ((ksw) obj3).a;
                    if (aepVar != null) {
                    }
                }
            }
            return kow.a;
        }
        Object obj6 = this.b;
        obj2 = this.a;
        try {
            ixc.Y(obj);
            obj4 = obj6;
        } catch (Throwable th3) {
            th = th3;
            obj3 = obj6;
            kwuVar = (kwu) ((ksw) obj2).a;
            if (kwuVar != null) {
                kwuVar.s(null);
            }
            aepVar = (aep) ((ksw) obj3).a;
            if (aepVar != null) {
                throw th;
            }
            this.d.c(aepVar);
            throw th;
        }
        kwu kwuVar2 = (kwu) ((ksw) obj2).a;
        if (kwuVar2 != null) {
            kwuVar2.s(null);
        }
        aep aepVar2 = (aep) ((ksw) obj4).a;
        if (aepVar2 != null) {
            this.d.c(aepVar2);
        }
        return kow.a;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        return new afl(this.d, this.e, this.f, this.g, kqjVar);
    }
}
