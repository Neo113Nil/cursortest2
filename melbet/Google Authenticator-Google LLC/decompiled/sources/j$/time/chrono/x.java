package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class x extends d {
    public static final j$.time.j d = j$.time.j.E(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient j$.time.j a;
    public final transient y b;
    public final transient int c;

    public x(j$.time.j jVar) {
        if (jVar.A(d)) {
            j$.time.i.d("JapaneseDate before Meiji 6 is not supported");
            throw null;
        }
        y t = y.t(jVar);
        this.b = t;
        this.c = (jVar.a - t.b.a) + 1;
        this.a = jVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 4, this);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final x a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (x) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (o(aVar) == j) {
            return this;
        }
        int[] iArr = w.a;
        int i = iArr[aVar.ordinal()];
        j$.time.j jVar = this.a;
        if (i == 3 || i == 8 || i == 9) {
            int a = v.c.o(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 3) {
                return C(this.b, a);
            }
            if (i2 == 8) {
                return C(y.v(a), this.c);
            }
            if (i2 == 9) {
                return B(jVar.O(a));
            }
        }
        return B(jVar.a(j, nVar));
    }

    public final x B(j$.time.j jVar) {
        return jVar.equals(this.a) ? this : new x(jVar);
    }

    public final x C(y yVar, int i) {
        v.c.getClass();
        if (yVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = yVar.b.a;
        int i3 = (i2 + i) - 1;
        if (i == 1 || (i3 >= -999999999 && i3 <= 999999999 && i3 >= i2 && yVar == y.t(j$.time.j.E(i3, 1, 1)))) {
            return B(this.a.O(i3));
        }
        j$.time.i.d("Invalid yearOfEra value");
        return null;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b b(long j, TemporalUnit temporalUnit) {
        return (x) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || nVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || nVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).isDateBased() : nVar != null && nVar.f(this);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.a.equals(((x) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal g(j$.time.j jVar) {
        return (x) super.g(jVar);
    }

    @Override // j$.time.chrono.b
    public final a getChronology() {
        return v.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    @Override // j$.time.chrono.d, j$.time.temporal.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        int i;
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        if (!c(nVar)) {
            j$.time.i.a("Unsupported field: ".concat(String.valueOf(nVar)));
            return null;
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i2 = w.a[aVar.ordinal()];
        j$.time.j jVar = this.a;
        if (i2 == 1) {
            return j$.time.temporal.q.f(1L, jVar.C());
        }
        y yVar = this.b;
        if (i2 != 2) {
            if (i2 != 3) {
                return v.c.o(aVar);
            }
            int i3 = yVar.b.a;
            return yVar.u() != null ? j$.time.temporal.q.f(1L, (r8.b.a - i3) + 1) : j$.time.temporal.q.f(1L, 999999999 - i3);
        }
        y u = yVar.u();
        if (u != null) {
            j$.time.j jVar2 = u.b;
            if (jVar2.a == jVar.a) {
                i = jVar2.y() - 1;
                if (this.c == 1) {
                    i -= yVar.b.y() - 1;
                }
                return j$.time.temporal.q.f(1L, i);
            }
        }
        i = jVar.B() ? 366 : 365;
        if (this.c == 1) {
        }
        return j$.time.temporal.q.f(1L, i);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        v.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: l */
    public final b n(long j, TemporalUnit temporalUnit) {
        return (x) super.n(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return (x) super.n(j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long o(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.h(this);
        }
        int i = w.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.c;
        y yVar = this.b;
        j$.time.j jVar = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (jVar.y() - yVar.b.y()) + 1 : jVar.y();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                j$.time.i.a("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0L;
            case 8:
                return yVar.a;
            default:
                return jVar.o(nVar);
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long p() {
        return this.a.p();
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e q(j$.time.n nVar) {
        return new g(this, nVar);
    }

    @Override // j$.time.chrono.d
    public final m u() {
        return this.b;
    }

    @Override // j$.time.chrono.d
    public final b w(long j) {
        return B(this.a.H(j));
    }

    @Override // j$.time.chrono.d
    public final b x(long j) {
        return B(this.a.I(j));
    }

    @Override // j$.time.chrono.d
    public final b y(long j) {
        return B(this.a.J(j));
    }

    @Override // j$.time.chrono.d
    /* renamed from: z */
    public final b g(j$.time.temporal.l lVar) {
        return (x) super.g(lVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (x) super.b(j, temporalUnit);
    }
}
