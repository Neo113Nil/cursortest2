package j$.time.chrono;

import j$.time.LocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class d0 extends d {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient LocalDate a;

    public d0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 7, this);
    }

    @Override // j$.time.chrono.d
    public final b B(long j) {
        return Z(this.a.f0(j));
    }

    @Override // j$.time.chrono.d
    public final b G(long j) {
        return Z(this.a.g0(j));
    }

    @Override // j$.time.chrono.d
    public final b J(long j) {
        return Z(this.a.i0(j));
    }

    @Override // j$.time.chrono.b
    public final e L(j$.time.l lVar) {
        return new g(this, lVar);
    }

    @Override // j$.time.chrono.b
    public final n N() {
        return P() >= 1 ? e0.ROC : e0.BEFORE_ROC;
    }

    public final int P() {
        return this.a.getYear() - 1911;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b R(j$.time.temporal.p pVar) {
        return (d0) super.R(pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d0 i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (d0) super.i(j, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (g(aVar) == j) {
            return this;
        }
        int[] iArr = c0.a;
        int i = iArr[aVar.ordinal()];
        if (i != 4) {
            if (i == 5) {
                b0.c.z(aVar).b(j, aVar);
                return Z(this.a.g0(j - (((P() * 12) + this.a.getMonthValue()) - 1)));
            }
            if (i != 6) {
            }
        }
        int a = b0.c.z(aVar).a(j, aVar);
        int i2 = iArr[aVar.ordinal()];
        if (i2 == 4) {
            return Z(this.a.m0(P() >= 1 ? a + 1911 : 1912 - a));
        }
        if (i2 == 6) {
            return Z(this.a.m0(a + 1911));
        }
        if (i2 == 7) {
            return Z(this.a.m0(1912 - P()));
        }
        return Z(this.a.i(j, qVar));
    }

    public final d0 Z(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new d0(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final b a(long j, j$.time.temporal.s sVar) {
        return (d0) super.a(j, sVar);
    }

    @Override // j$.time.chrono.b
    public final m d() {
        return b0.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return this.a.equals(((d0) obj).a);
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.P(this);
        }
        int i = c0.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i == 4) {
            int P = P();
            if (P < 1) {
                P = 1 - P;
            }
            return P;
        }
        if (i == 5) {
            return ((P() * 12) + this.a.getMonthValue()) - 1;
        }
        if (i == 6) {
            return P();
        }
        if (i != 7) {
            return this.a.g(qVar);
        }
        return P() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        b0.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* renamed from: j */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (d0) super.m(localDate);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.B(this);
        }
        if (!f(qVar)) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = c0.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.k(qVar);
        }
        if (i != 4) {
            return b0.c.z(aVar);
        }
        j$.time.temporal.u uVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.u.f(1L, P() <= 0 ? (-uVar.a) + 1912 : uVar.d - 1911);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b l(long j, j$.time.temporal.s sVar) {
        return (d0) super.l(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b m(j$.time.temporal.n nVar) {
        return (d0) super.m(nVar);
    }

    @Override // j$.time.chrono.b
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return (d0) super.a(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j, j$.time.temporal.s sVar) {
        return (d0) super.l(j, sVar);
    }
}
