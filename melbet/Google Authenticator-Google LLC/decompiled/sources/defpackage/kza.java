package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kza extends kyo {
    private final int e;
    private final int f;

    public kza(int i, int i2) {
        super(i);
        this.e = i;
        this.f = i2;
        if (i2 != 1) {
            if (i <= 0) {
                throw new IllegalArgumentException(a.ai(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            }
            return;
        }
        int i3 = ksx.a;
        throw new IllegalArgumentException("This implementation does not support suspension for senders, use " + new ksj(kyo.class).c() + " instead");
    }

    private final Object B(Object obj) {
        kyx kyxVar;
        int i;
        kza kzaVar;
        ldb ldbVar = kyq.d;
        kyx kyxVar2 = (kyx) this.c.a;
        while (true) {
            long b = this.a.b();
            long j = 1152921504606846975L & b;
            boolean w = super.w(b, false);
            long j2 = kyq.b;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (kyxVar2.b != j3) {
                kyxVar = super.p(j3, kyxVar2);
                if (kyxVar != null) {
                    kzaVar = this;
                    i = i2;
                } else if (w) {
                    return new kyu(this.n());
                }
            } else {
                kyxVar = kyxVar2;
                i = i2;
                kzaVar = this;
            }
            Object obj2 = obj;
            int a = super.a(kyxVar, i, obj2, j, ldbVar, w);
            kza kzaVar2 = kzaVar;
            kyxVar2 = kyxVar;
            if (a == 0) {
                kyxVar2.o();
                return kow.a;
            }
            if (a == 1) {
                return kow.a;
            }
            if (a == 2) {
                if (w) {
                    kyxVar2.r();
                    return new kyu(kzaVar2.n());
                }
                kzaVar2.q((kyxVar2.b * j2) + i);
                return kow.a;
            }
            if (a == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (a == 4) {
                if (j < kzaVar2.b()) {
                    kyxVar2.o();
                }
                return new kyu(kzaVar2.n());
            }
            kyxVar2.o();
            this = kzaVar2;
            obj = obj2;
        }
    }

    @Override // defpackage.kyo, defpackage.kzg
    public final Object h(Object obj, kqj kqjVar) {
        Object B = B(obj);
        if (!(B instanceof kyu)) {
            return kow.a;
        }
        kyw.b(B);
        throw n();
    }

    @Override // defpackage.kyo, defpackage.kzg
    public final Object j(Object obj) {
        return B(obj);
    }

    @Override // defpackage.kyo
    protected final boolean z() {
        return this.f == 2;
    }
}
