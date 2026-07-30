package j$.time.chrono;

import defpackage.l42;
import j$.time.LocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class y extends d {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient z b;
    public final transient int c;

    public y(LocalDate localDate) {
        if (localDate.Z(d)) {
            j$.time.h.a("JapaneseDate before Meiji 6 is not supported");
            throw null;
        }
        z p = z.p(localDate);
        this.b = p;
        this.c = (localDate.getYear() - p.b.getYear()) + 1;
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 4, this);
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
        return this.b;
    }

    public final y P(long j, j$.time.temporal.b bVar) {
        return (y) super.l(j, (j$.time.temporal.s) bVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b R(j$.time.temporal.p pVar) {
        return (y) super.R(pVar);
    }

    @Override // j$.time.chrono.b
    public final int U() {
        z q = this.b.q();
        int U = (q == null || q.b.getYear() != this.a.getYear()) ? this.a.U() : q.b.W() - 1;
        return this.c == 1 ? U - (this.b.b.W() - 1) : U;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final y i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (y) super.i(j, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (g(aVar) == j) {
            return this;
        }
        int[] iArr = x.a;
        int i = iArr[aVar.ordinal()];
        if (i == 3 || i == 8 || i == 9) {
            w wVar = w.c;
            int a = wVar.z(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return Z(this.a.m0(wVar.D(this.b, a)));
            }
            if (i2 == 8) {
                return Z(this.a.m0(wVar.D(z.r(a), this.c)));
            }
            if (i2 == 9) {
                return Z(this.a.m0(a));
            }
        }
        return Z(this.a.i(j, qVar));
    }

    public final y Z(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new y(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final b a(long j, j$.time.temporal.s sVar) {
        return (y) super.a(j, sVar);
    }

    public final y a0(j$.time.a0 a0Var) {
        return (y) super.m(a0Var);
    }

    @Override // j$.time.chrono.b
    public final m d() {
        return w.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.a.equals(((y) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.b, j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).isDateBased() : qVar != null && qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.P(this);
        }
        switch (x.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 2:
                int i = this.c;
                LocalDate localDate = this.a;
                return i == 1 ? (localDate.W() - this.b.b.W()) + 1 : localDate.W();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
            case 8:
                return this.b.a;
            default:
                return this.a.g(qVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        w.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* renamed from: j */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (y) super.m(localDate);
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
        int i = x.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.u.f(1L, this.a.a0());
        }
        if (i == 2) {
            return j$.time.temporal.u.f(1L, U());
        }
        if (i != 3) {
            return w.c.z(aVar);
        }
        int year = this.b.b.getYear();
        return this.b.q() != null ? j$.time.temporal.u.f(1L, (r5.b.getYear() - year) + 1) : j$.time.temporal.u.f(1L, 999999999 - year);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b l(long j, j$.time.temporal.s sVar) {
        return (y) super.l(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b m(j$.time.temporal.n nVar) {
        return (y) super.m(nVar);
    }

    @Override // j$.time.chrono.b
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return (y) super.a(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j, j$.time.temporal.s sVar) {
        return (y) super.l(j, sVar);
    }

    public y(z zVar, int i, LocalDate localDate) {
        if (!localDate.Z(d)) {
            this.b = zVar;
            this.c = i;
            this.a = localDate;
            return;
        }
        j$.time.h.a("JapaneseDate before Meiji 6 is not supported");
        throw null;
    }
}
