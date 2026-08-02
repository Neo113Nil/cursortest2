package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbe extends kqw implements kzr, kqx {
    public final kzr a;
    public final kqn b;
    public final int c;
    private kqn d;
    private kqj e;

    public lbe(kzr kzrVar, kqn kqnVar) {
        super(lbb.a, kqo.a);
        this.a = kzrVar;
        this.b = kqnVar;
        this.c = ((Number) kqnVar.fold(0, new gjo(9))).intValue();
    }

    @Override // defpackage.kqu
    protected final Object b(Object obj) {
        Throwable a = kon.a(obj);
        if (a != null) {
            this.d = new lay(a, bU());
        }
        kqj kqjVar = this.e;
        if (kqjVar != null) {
            kqjVar.ca(obj);
        }
        return kqp.a;
    }

    @Override // defpackage.kqw, defpackage.kqj
    public final kqn bU() {
        kqn kqnVar = this.d;
        return kqnVar == null ? kqo.a : kqnVar;
    }

    @Override // defpackage.kzr
    public final Object cg(Object obj, kqj kqjVar) {
        try {
            kqn bU = kqjVar.bU();
            ixi.i(bU);
            kqn kqnVar = this.d;
            if (kqnVar != bU) {
                if (kqnVar instanceof lay) {
                    throw new IllegalStateException(ksp.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((lay) kqnVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                }
                if (((Number) bU.fold(0, new lbh(this, 0))).intValue() != this.c) {
                    throw new IllegalStateException("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + bU + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                }
                this.d = bU;
            }
            this.e = kqjVar;
            kry kryVar = lbg.a;
            kzr kzrVar = this.a;
            kzrVar.getClass();
            Object a = kryVar.a(kzrVar, obj, this);
            if (!ksp.b(a, kqp.a)) {
                this.e = null;
            }
            kqp kqpVar = kqp.a;
            if (a == kqpVar) {
                kqjVar.getClass();
            }
            return a == kqpVar ? a : kow.a;
        } catch (Throwable th) {
            this.d = new lay(th, kqjVar.bU());
            throw th;
        }
    }

    @Override // defpackage.kqu, defpackage.kqx
    public final StackTraceElement f() {
        return null;
    }

    @Override // defpackage.kqu, defpackage.kqx
    public final kqx g() {
        kqj kqjVar = this.e;
        if (kqjVar instanceof kqx) {
            return (kqx) kqjVar;
        }
        return null;
    }

    @Override // defpackage.kqw, defpackage.kqu
    public final void h() {
        super.h();
    }
}
