package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class knm extends hsw {
    public final iws a;

    public knm(iws iwsVar) {
        this.a = iwsVar;
    }

    @Override // defpackage.hsw
    protected final String a() {
        gzo T = hoq.T(this);
        T.b("clientCall", this.a);
        return T.toString();
    }

    @Override // defpackage.hsw
    protected final void l() {
        this.a.r("GrpcFuture was cancelled", null);
    }
}
