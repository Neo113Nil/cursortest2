package j$.time;

import j$.time.format.e0;
import j$.time.format.f0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class v implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.m(j$.time.temporal.a.YEAR, 4, 10, f0.EXCEEDS_PAD);
        uVar.q(Locale.getDefault(), e0.SMART, null);
    }

    public v(int i) {
        this.a = i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static v s(int i) {
        j$.time.temporal.a.YEAR.Z(i);
        return new v(i);
    }

    private Object writeReplace() {
        return new t((byte) 11, this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final v l(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (v) sVar.s(this, j);
        }
        int i = u.b[((j$.time.temporal.b) sVar).ordinal()];
        if (i == 1) {
            return G(j);
        }
        if (i == 2) {
            return G(Math.multiplyExact(j, 10L));
        }
        if (i == 3) {
            return G(Math.multiplyExact(j, 100L));
        }
        if (i == 4) {
            return G(Math.multiplyExact(j, 1000L));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return i(Math.addExact(g(aVar), j), aVar);
        }
        h.d("Unsupported unit: ", sVar);
        return null;
    }

    public final v G(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return s(aVar.b.a(this.a + j, aVar));
    }

    @Override // j$.time.temporal.m
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final v i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (v) qVar.W(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.Z(j);
        int i = u.a[aVar.ordinal()];
        if (i == 1) {
            if (this.a < 1) {
                j = 1 - j;
            }
            return s((int) j);
        }
        if (i == 2) {
            return s((int) j);
        }
        if (i == 3) {
            return g(j$.time.temporal.a.ERA) == j ? this : s(1 - this.a);
        }
        throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
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
        return a0Var == j$.time.temporal.r.b ? j$.time.chrono.t.c : a0Var == j$.time.temporal.r.c ? j$.time.temporal.b.YEARS : super.b(a0Var);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (j$.time.chrono.m.r(mVar).equals(j$.time.chrono.t.c)) {
            return mVar.i(this.a, j$.time.temporal.a.YEAR);
        }
        h.a("Adjustment only supported on ISO date-time");
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((v) obj).a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.q qVar) {
        return k(qVar).a(g(qVar), qVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.a == ((v) obj).a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.P(this);
        }
        int i = u.a[((j$.time.temporal.a) qVar).ordinal()];
        if (i == 1) {
            int i2 = this.a;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.a;
        }
        if (i == 3) {
            return this.a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.t(d.a("Unsupported field: ", qVar));
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.m
    /* renamed from: j */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (v) localDate.c(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(qVar);
    }

    public final String toString() {
        return Integer.toString(this.a);
    }
}
