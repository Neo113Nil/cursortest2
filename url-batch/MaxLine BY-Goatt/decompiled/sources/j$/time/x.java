package j$.time;

import j$.time.format.e0;
import j$.time.format.f0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class x implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    static {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.m(j$.time.temporal.a.YEAR, 4, 10, f0.EXCEEDS_PAD);
        uVar.d('-');
        uVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        uVar.q(Locale.getDefault(), e0.SMART, null);
    }

    public x(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 12, this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final x l(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (x) sVar.s(this, j);
        }
        switch (w.b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return G(j);
            case 2:
                return J(j);
            case 3:
                return J(Math.multiplyExact(j, 10L));
            case 4:
                return J(Math.multiplyExact(j, 100L));
            case 5:
                return J(Math.multiplyExact(j, 1000L));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return i(Math.addExact(g(aVar), j), aVar);
            default:
                h.d("Unsupported unit: ", sVar);
                return null;
        }
    }

    public final x G(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return P(aVar.b.a(Math.floorDiv(j2, 12L), aVar), ((int) Math.floorMod(j2, 12L)) + 1);
    }

    public final x J(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return P(aVar.b.a(this.a + j, aVar), this.b);
    }

    public final x P(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new x(i, i2);
    }

    @Override // j$.time.temporal.m
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final x i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (x) qVar.W(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.Z(j);
        int i = w.a[aVar.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.Z(i2);
            return P(this.a, i2);
        }
        if (i == 2) {
            return G(j - s());
        }
        if (i == 3) {
            if (this.a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            j$.time.temporal.a.YEAR.Z(i3);
            return P(i3, this.b);
        }
        if (i == 4) {
            int i4 = (int) j;
            j$.time.temporal.a.YEAR.Z(i4);
            return P(i4, this.b);
        }
        if (i != 5) {
            throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
        }
        if (g(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.a;
        j$.time.temporal.a.YEAR.Z(i5);
        return P(i5, this.b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = l(Long.MAX_VALUE, sVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.l(j2, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(a0 a0Var) {
        return a0Var == j$.time.temporal.r.b ? j$.time.chrono.t.c : a0Var == j$.time.temporal.r.c ? j$.time.temporal.b.MONTHS : super.b(a0Var);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (j$.time.chrono.m.r(mVar).equals(j$.time.chrono.t.c)) {
            return mVar.i(s(), j$.time.temporal.a.PROLEPTIC_MONTH);
        }
        h.a("Adjustment only supported on ISO date-time");
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x xVar = (x) obj;
        int i = this.a - xVar.a;
        return i == 0 ? this.b - xVar.b : i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.q qVar) {
        return k(qVar).a(g(qVar), qVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.a == xVar.a && this.b == xVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.PROLEPTIC_MONTH || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        int i;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.P(this);
        }
        int i2 = w.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return s();
            }
            if (i2 == 3) {
                int i3 = this.a;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
            }
            i = this.a;
        }
        return i;
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    @Override // j$.time.temporal.m
    /* renamed from: j */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (x) localDate.c(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(qVar);
    }

    public final long s() {
        return ((this.a * 12) + this.b) - 1;
    }

    public final String toString() {
        int abs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        int i = this.a;
        if (abs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }
}
