package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dsy extends kra implements krx {
    Object a;
    Object b;
    boolean c;
    boolean d;
    int e;
    final /* synthetic */ dtd f;
    final /* synthetic */ cid g;
    final /* synthetic */ boolean h;
    final /* synthetic */ ehr i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsy(dtd dtdVar, cid cidVar, boolean z, ehr ehrVar, kqj kqjVar) {
        super(2, kqjVar);
        this.f = dtdVar;
        this.g = cidVar;
        this.h = z;
        this.i = ehrVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsy) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        kvs g;
        kvs g2;
        Object f;
        kvs kvsVar;
        Object b;
        kvs kvsVar2;
        jho jhoVar;
        Object b2;
        jho jhoVar2;
        boolean z;
        Object b3;
        boolean z2;
        kqp kqpVar = kqp.a;
        int i = this.e;
        if (i == 0) {
            ixc.Y(obj);
            kvm kvmVar = (kvm) this.j;
            dtd dtdVar = this.f;
            cid cidVar = this.g;
            kvs g3 = ixg.g(kvmVar, new alg(dtdVar, cidVar, (kqj) null, 4));
            g = ixg.g(kvmVar, new alg(dtdVar, cidVar, (kqj) null, 5, (byte[]) null));
            g2 = ixg.g(kvmVar, new alg(dtdVar, cidVar, (kqj) null, 6, (char[]) null));
            boolean z3 = this.h;
            this.j = g3;
            this.a = g;
            this.b = g2;
            this.e = 1;
            f = kvp.f(new dtc(dtdVar, z3, cidVar, null), this);
            if (f != kqpVar) {
                kvsVar = g3;
            }
            return kqpVar;
        }
        if (i != 1) {
            if (i == 2) {
                jhoVar = (jho) this.b;
                kvs kvsVar3 = (kvs) this.a;
                kvs kvsVar4 = (kvs) this.j;
                ixc.Y(obj);
                g = kvsVar4;
                kvsVar2 = kvsVar3;
                b = obj;
                boolean booleanValue = ((Boolean) b).booleanValue();
                this.j = kvsVar2;
                this.a = jhoVar;
                this.b = null;
                this.c = booleanValue;
                this.e = 3;
                b2 = g.b(this);
                if (b2 != kqpVar) {
                    jhoVar2 = jhoVar;
                    z = booleanValue;
                    boolean booleanValue2 = ((Boolean) b2).booleanValue();
                    this.j = jhoVar2;
                    this.a = null;
                    this.c = z;
                    this.d = booleanValue2;
                    this.e = 4;
                    b3 = kvsVar2.b(this);
                    if (b3 != kqpVar) {
                    }
                }
                return kqpVar;
            }
            if (i != 3) {
                z2 = this.d;
                z = this.c;
                jho jhoVar3 = (jho) this.j;
                ixc.Y(obj);
                jhoVar2 = jhoVar3;
                b3 = obj;
                jfq jfqVar = new jfq(z, z2, ((Boolean) b3).booleanValue(), jhoVar2);
                dtd dtdVar2 = this.f;
                dtdVar2.k = new jfr(ixd.r(dtdVar2.k.a, new kol(this.i.a.c, jfqVar)));
                return jfqVar;
            }
            z = this.c;
            jho jhoVar4 = (jho) this.a;
            kvs kvsVar5 = (kvs) this.j;
            ixc.Y(obj);
            kvsVar2 = kvsVar5;
            jhoVar2 = jhoVar4;
            b2 = obj;
            boolean booleanValue22 = ((Boolean) b2).booleanValue();
            this.j = jhoVar2;
            this.a = null;
            this.c = z;
            this.d = booleanValue22;
            this.e = 4;
            b3 = kvsVar2.b(this);
            if (b3 != kqpVar) {
                z2 = booleanValue22;
                jfq jfqVar2 = new jfq(z, z2, ((Boolean) b3).booleanValue(), jhoVar2);
                dtd dtdVar22 = this.f;
                dtdVar22.k = new jfr(ixd.r(dtdVar22.k.a, new kol(this.i.a.c, jfqVar2)));
                return jfqVar2;
            }
            return kqpVar;
        }
        g2 = (kvs) this.b;
        kvs kvsVar6 = (kvs) this.a;
        kvsVar = (kvs) this.j;
        ixc.Y(obj);
        g = kvsVar6;
        f = obj;
        jho jhoVar5 = (jho) f;
        this.j = g;
        this.a = g2;
        this.b = jhoVar5;
        this.e = 2;
        b = kvsVar.b(this);
        if (b != kqpVar) {
            kvsVar2 = g2;
            jhoVar = jhoVar5;
            boolean booleanValue3 = ((Boolean) b).booleanValue();
            this.j = kvsVar2;
            this.a = jhoVar;
            this.b = null;
            this.c = booleanValue3;
            this.e = 3;
            b2 = g.b(this);
            if (b2 != kqpVar) {
            }
        }
        return kqpVar;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        dsy dsyVar = new dsy(this.f, this.g, this.h, this.i, kqjVar);
        dsyVar.j = obj;
        return dsyVar;
    }
}
