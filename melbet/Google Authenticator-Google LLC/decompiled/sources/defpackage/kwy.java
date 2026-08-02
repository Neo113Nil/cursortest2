package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kwy extends kuw {
    private final kxb f;

    public kwy(kqj kqjVar, kxb kxbVar) {
        super(kqjVar, 1);
        this.f = kxbVar;
    }

    @Override // defpackage.kuw
    protected final String p() {
        return "AwaitContinuation";
    }

    @Override // defpackage.kuw
    public final Throwable q(kwu kwuVar) {
        Throwable d;
        Object B = this.f.B();
        return (!(B instanceof kxa) || (d = ((kxa) B).d()) == null) ? B instanceof kve ? ((kve) B).b : kwuVar.p() : d;
    }
}
