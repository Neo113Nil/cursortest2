package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class kzn extends lar {
    private final krx d;

    public kzn(krx krxVar, kqn kqnVar, int i, int i2) {
        super(kqnVar, i, i2);
        this.d = krxVar;
    }

    static /* synthetic */ Object f(kzn kznVar, kzd kzdVar, kqj kqjVar) {
        Object a = kznVar.d.a(kzdVar, kqjVar);
        return a == kqp.a ? a : kow.a;
    }

    @Override // defpackage.lar
    public Object b(kzd kzdVar, kqj kqjVar) {
        return f(this, kzdVar, kqjVar);
    }

    @Override // defpackage.lar
    protected lar c(kqn kqnVar, int i, int i2) {
        return new kzn(this.d, kqnVar, 0, 2);
    }

    @Override // defpackage.lar
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
