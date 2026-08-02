package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class erv extends ery {
    public erv(lgc lgcVar, boolean z) {
        super(z, lgcVar);
    }

    private final lgc e() {
        return this.a ? this.b : d();
    }

    @Override // defpackage.ery
    public final eru a(String str) {
        lgc e = e();
        return e.equals(lgc.a) ? eru.a : eru.b(e);
    }

    @Override // defpackage.ery
    public final lgc b(eru eruVar) {
        return this.b;
    }

    @Override // defpackage.ery
    public final lgc c(eru eruVar) {
        return e();
    }
}
