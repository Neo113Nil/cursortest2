package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lbk implements kzr {
    private final kqn a;
    private final Object b;
    private final krx c;

    public lbk(kzr kzrVar, kqn kqnVar) {
        this.a = kqnVar;
        this.b = ldd.a(kqnVar);
        this.c = new ajy(kzrVar, (kqj) null, 4);
    }

    @Override // defpackage.kzr
    public final Object cg(Object obj, kqj kqjVar) {
        Object a = ixk.a(this.a, obj, this.b, this.c, kqjVar);
        return a == kqp.a ? a : kow.a;
    }
}
