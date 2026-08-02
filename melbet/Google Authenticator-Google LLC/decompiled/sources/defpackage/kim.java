package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kim extends kgc {
    final jxr h;
    final kae i;
    final jww j;
    final /* synthetic */ kin k;
    private final long l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kim(kin kinVar, jxr jxrVar, kae kaeVar, jww jwwVar) {
        super(r3.d(jwwVar), r3.j, jwwVar.b);
        this.k = kinVar;
        kiq kiqVar = kinVar.c;
        this.h = jxrVar;
        this.i = kaeVar;
        this.j = jwwVar;
        this.l = System.nanoTime();
    }

    @Override // defpackage.kgc
    protected final void f() {
        this.k.c.m.execute(new kgf(this, 15));
    }

    final void k() {
        kfv kfvVar;
        jxr a = this.h.a();
        try {
            iws d = this.k.d(this.i, this.j.d(jxb.f, Long.valueOf(System.nanoTime() - this.l)));
            synchronized (this) {
                kfvVar = null;
                if (this.g == null) {
                    super.j(d);
                    kgb kgbVar = this.f;
                    if (kgbVar == null) {
                        this.e = null;
                        this.d = true;
                    } else {
                        super.i(kgbVar);
                        kfvVar = new kfv(this, this.c);
                    }
                }
            }
            kin kinVar = this.k;
            if (kfvVar == null) {
                kinVar.c.m.execute(new kgf(this, 15));
            } else {
                kinVar.c.d(this.j).execute(new kga(this, kfvVar, 16));
            }
        } finally {
            this.h.f(a);
        }
    }
}
