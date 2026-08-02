package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyk implements kyc {
    public Object a = kyq.p;
    public kuw b;
    final /* synthetic */ kyo c;

    public kyk(kyo kyoVar) {
        this.c = kyoVar;
    }

    @Override // defpackage.kyc
    public final void D(lbx lbxVar, int i) {
        kuw kuwVar = this.b;
        if (kuwVar != null) {
            kuwVar.D(lbxVar, i);
        }
    }

    public final Object a(kqj kqjVar) {
        boolean z = true;
        if (this.a == kyq.p || this.a == kyq.l) {
            kyo kyoVar = this.c;
            kuk kukVar = kyoVar.d;
            kyx kyxVar = (kyx) kukVar.a;
            while (true) {
                boolean z2 = false;
                if (kyoVar.x()) {
                    this.a = kyq.l;
                    Throwable l = kyoVar.l();
                    if (l != null) {
                        throw lda.b(l);
                    }
                    z = false;
                } else {
                    kuj kujVar = kyoVar.b;
                    long b = kujVar.b();
                    long j = kyq.b;
                    long j2 = b / j;
                    int i = (int) (b % j);
                    if (kyxVar.b != j2) {
                        kyx o = kyoVar.o(j2, kyxVar);
                        if (o != null) {
                            kyxVar = o;
                        } else {
                            continue;
                        }
                    }
                    kyo kyoVar2 = kyoVar;
                    Object k = kyoVar2.k(kyxVar, i, b, null);
                    ldb ldbVar = kyq.m;
                    if (k == ldbVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    ldb ldbVar2 = kyq.o;
                    if (k == ldbVar2) {
                        if (b < kyoVar2.c()) {
                            kyxVar.o();
                        }
                        kyoVar = kyoVar2;
                    } else {
                        ldb ldbVar3 = kyq.n;
                        if (k == ldbVar3) {
                            kuw c = ixg.c(ixe.d(kqjVar));
                            try {
                                this.b = c;
                                Object k2 = kyoVar2.k(kyxVar, i, b, this);
                                if (k2 == ldbVar) {
                                    D(kyxVar, i);
                                } else {
                                    kuw kuwVar = null;
                                    if (k2 == ldbVar2) {
                                        if (b < kyoVar2.c()) {
                                            kyxVar.o();
                                        }
                                        kyx kyxVar2 = (kyx) kukVar.a;
                                        while (true) {
                                            if (kyoVar2.x()) {
                                                kuw kuwVar2 = this.b;
                                                kuwVar2.getClass();
                                                this.b = kuwVar;
                                                this.a = kyq.l;
                                                Throwable l2 = kyoVar2.l();
                                                if (l2 == null) {
                                                    kuwVar2.ca(Boolean.valueOf(z2));
                                                } else {
                                                    if (kvo.b) {
                                                        l2 = lda.a(l2, kuwVar2);
                                                    }
                                                    kuwVar2.ca(ixc.X(l2));
                                                }
                                            } else {
                                                long b2 = kujVar.b();
                                                kuj kujVar2 = kujVar;
                                                long j3 = b2 / j;
                                                int i2 = (int) (b2 % j);
                                                if (kyxVar2.b != j3) {
                                                    kyx o2 = kyoVar2.o(j3, kyxVar2);
                                                    if (o2 != null) {
                                                        kyxVar2 = o2;
                                                    } else {
                                                        continue;
                                                        kujVar = kujVar2;
                                                        kuwVar = null;
                                                        z2 = false;
                                                    }
                                                }
                                                Object k3 = kyoVar2.k(kyxVar2, i2, b2, this);
                                                if (k3 == ldbVar) {
                                                    D(kyxVar2, i2);
                                                    break;
                                                }
                                                if (k3 == ldbVar2) {
                                                    if (b2 < kyoVar2.c()) {
                                                        kyxVar2.o();
                                                    }
                                                    kujVar = kujVar2;
                                                    kuwVar = null;
                                                    z2 = false;
                                                } else {
                                                    if (k3 == ldbVar3) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kyxVar2.o();
                                                    this.a = k3;
                                                    this.b = null;
                                                }
                                            }
                                        }
                                    } else {
                                        kyxVar.o();
                                        this.a = k2;
                                        this.b = null;
                                    }
                                    c.k(true);
                                }
                                return c.l();
                            } catch (Throwable th) {
                                c.A();
                                throw th;
                            }
                        }
                        kyxVar.o();
                        this.a = k;
                        z = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object b() {
        Object obj = this.a;
        ldb ldbVar = kyq.p;
        if (obj == ldbVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.a = ldbVar;
        if (obj != kyq.l) {
            return obj;
        }
        throw lda.b(this.c.m());
    }
}
