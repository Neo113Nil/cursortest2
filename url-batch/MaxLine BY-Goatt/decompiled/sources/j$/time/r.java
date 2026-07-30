package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class r implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final l a;
    public final ZoneOffset b;

    static {
        l lVar = l.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        lVar.getClass();
        new r(lVar, zoneOffset);
        l lVar2 = l.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        lVar2.getClass();
        new r(lVar2, zoneOffset2);
    }

    public r(l lVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(lVar, "time");
        this.a = lVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 9, this);
    }

    public final r B(l lVar, ZoneOffset zoneOffset) {
        return (this.a == lVar && this.b.equals(zoneOffset)) ? this : new r(lVar, zoneOffset);
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
        if (a0Var == j$.time.temporal.r.d || a0Var == j$.time.temporal.r.e) {
            return this.b;
        }
        if (((a0Var == j$.time.temporal.r.a) || (a0Var == j$.time.temporal.r.b)) || a0Var == j$.time.temporal.r.f) {
            return null;
        }
        return a0Var == j$.time.temporal.r.g ? this.a : a0Var == j$.time.temporal.r.c ? j$.time.temporal.b.NANOS : a0Var.j(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(this.a.f0(), j$.time.temporal.a.NANO_OF_DAY).i(this.b.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        boolean equals = this.b.equals(rVar.b);
        l lVar = this.a;
        if (equals) {
            return lVar.compareTo(rVar.a);
        }
        int compare = Long.compare(lVar.f0() - (this.b.b * 1000000000), rVar.a.f0() - (rVar.b.b * 1000000000));
        return compare == 0 ? this.a.compareTo(rVar.a) : compare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.a.equals(rVar.a) && this.b.equals(rVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).a0() || qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.b : this.a.g(qVar) : qVar.P(this);
    }

    public final int hashCode() {
        return this.b.b ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (r) qVar.W(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        l lVar = this.a;
        if (qVar != aVar) {
            return B(lVar.i(j, qVar), this.b);
        }
        j$.time.temporal.a aVar2 = (j$.time.temporal.a) qVar;
        return B(lVar, ZoneOffset.b0(aVar2.b.a(j, aVar2)));
    }

    @Override // j$.time.temporal.m
    /* renamed from: j */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (r) localDate.c(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.OFFSET_SECONDS ? ((j$.time.temporal.a) qVar).b : this.a.k(qVar) : qVar.B(this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final r l(long j, j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.b ? B(this.a.l(j, sVar), this.b) : (r) sVar.s(this, j);
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }
}
