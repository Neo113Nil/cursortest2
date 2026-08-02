package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajy extends kra implements krx {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajy(krt krtVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.b = krtVar;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((ajy) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
        if (i == 1) {
            return ((ajy) c((kvm) obj, (kqj) obj2)).b(kow.a);
        }
        if (i == 2) {
            return ((ajy) c((kzd) obj, (kqj) obj2)).b(kow.a);
        }
        if (i != 3) {
            return ((ajy) c(obj, (kqj) obj2)).b(kow.a);
        }
        return ((ajy) c((kzr) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kzr] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, krx] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, krt] */
    @Override // defpackage.kqu
    public final Object b(Object obj) {
        int i = this.d;
        if (i == 0) {
            kqp kqpVar = kqp.a;
            if (this.a != 0) {
                ixc.Y(obj);
                return obj;
            }
            ixc.Y(obj);
            if (((kvm) this.c).bV().get(ake.b) == null) {
                throw new IllegalStateException("Expected a TransactionElement in the CoroutineContext but none was found.");
            }
            ?? r4 = this.b;
            this.a = 1;
            Object a = r4.a(this);
            return a == kqpVar ? kqpVar : a;
        }
        if (i == 1) {
            kqp kqpVar2 = kqp.a;
            if (this.a != 0) {
                ixc.Y(obj);
            } else {
                ixc.Y(obj);
                kvm kvmVar = (kvm) this.c;
                ?? r2 = this.b;
                this.a = 1;
                if (r2.a(kvmVar, this) == kqpVar2) {
                    return kqpVar2;
                }
            }
            return kow.a;
        }
        if (i == 2) {
            kqp kqpVar3 = kqp.a;
            if (this.a != 0) {
                ixc.Y(obj);
            } else {
                ixc.Y(obj);
                kzd kzdVar = (kzd) this.c;
                Object obj2 = this.b;
                this.a = 1;
                if (((lar) obj2).b(kzdVar, this) == kqpVar3) {
                    return kqpVar3;
                }
            }
            return kow.a;
        }
        if (i != 3) {
            kqp kqpVar4 = kqp.a;
            int i2 = this.a;
            ixc.Y(obj);
            if (i2 == 0) {
                Object obj3 = this.c;
                ?? r22 = this.b;
                this.a = 1;
                if (r22.cg(obj3, this) == kqpVar4) {
                    return kqpVar4;
                }
            }
            return kow.a;
        }
        kqp kqpVar5 = kqp.a;
        if (this.a != 0) {
            ixc.Y(obj);
        } else {
            ixc.Y(obj);
            kzr kzrVar = (kzr) this.c;
            Object obj4 = this.b;
            this.a = 1;
            if (((las) obj4).f(kzrVar, this) == kqpVar5) {
                return kqpVar5;
            }
        }
        return kow.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, krx] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kzr] */
    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        int i = this.d;
        if (i == 0) {
            ajy ajyVar = new ajy((krt) this.b, kqjVar, 0);
            ajyVar.c = obj;
            return ajyVar;
        }
        if (i == 1) {
            ajy ajyVar2 = new ajy((krx) this.b, kqjVar, 1);
            ajyVar2.c = obj;
            return ajyVar2;
        }
        if (i == 2) {
            ajy ajyVar3 = new ajy((lar) this.b, kqjVar, 2);
            ajyVar3.c = obj;
            return ajyVar3;
        }
        if (i != 3) {
            ajy ajyVar4 = new ajy((kzr) this.b, kqjVar, 4);
            ajyVar4.c = obj;
            return ajyVar4;
        }
        ajy ajyVar5 = new ajy((las) this.b, kqjVar, 3);
        ajyVar5.c = obj;
        return ajyVar5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajy(krx krxVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.b = krxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajy(kzr kzrVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.b = kzrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajy(lar larVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.b = larVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajy(las lasVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.d = i;
        this.b = lasVar;
    }
}
