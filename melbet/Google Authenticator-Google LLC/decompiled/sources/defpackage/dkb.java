package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dkb extends iwv {
    public dka b;
    public final eqa d;
    public final Object a = new Object();
    public boolean c = false;

    public dkb(eqa eqaVar) {
        this.d = eqaVar;
        if (hoq.S("application/grpc")) {
            return;
        }
        eqaVar.k = "application/grpc";
    }

    @Override // defpackage.iwv
    public final jxb a() {
        synchronized (this.a) {
            if (this.b != null) {
                return new jxb();
            }
            dka dkaVar = new dka(this.d);
            this.b = dkaVar;
            return dkaVar;
        }
    }
}
