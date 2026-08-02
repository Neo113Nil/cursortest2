package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afj extends kra implements krx {
    Object a;
    Object b;
    int c;
    final /* synthetic */ krx d;
    final /* synthetic */ ldx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afj(ldx ldxVar, krx krxVar, kqj kqjVar) {
        super(2, kqjVar);
        this.e = ldxVar;
        this.d = krxVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afj) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002b, code lost:
    
        if (r7.b(r6) != r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        ldx ldxVar;
        krx krxVar;
        Throwable th;
        Object obj2;
        kqp kqpVar = kqp.a;
        int i = this.c;
        try {
            if (i == 0) {
                ixc.Y(obj);
                ldxVar = this.e;
                krx krxVar2 = this.d;
                this.a = ldxVar;
                this.b = krxVar2;
                this.c = 1;
                krxVar = krxVar2;
            } else {
                if (i != 1) {
                    obj2 = this.a;
                    try {
                        ixc.Y(obj);
                        ((ldx) obj2).c();
                        return kow.a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((ldx) obj2).c();
                        throw th;
                    }
                }
                Object obj3 = this.b;
                Object obj4 = this.a;
                ixc.Y(obj);
                ldxVar = obj4;
                krxVar = obj3;
            }
            ajy ajyVar = new ajy(krxVar, (kqj) null, 1);
            this.a = ldxVar;
            this.b = null;
            this.c = 2;
            if (kvp.f(ajyVar, this) != kqpVar) {
                obj2 = ldxVar;
                ((ldx) obj2).c();
                return kow.a;
            }
            return kqpVar;
        } catch (Throwable th3) {
            ldx ldxVar2 = ldxVar;
            th = th3;
            obj2 = ldxVar2;
            ((ldx) obj2).c();
            throw th;
        }
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        return new afj(this.e, this.d, kqjVar);
    }
}
