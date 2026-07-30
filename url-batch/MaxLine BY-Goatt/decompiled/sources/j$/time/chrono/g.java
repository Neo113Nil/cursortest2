package j$.time.chrono;

import defpackage.l42;
import j$.time.LocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class g implements e, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient b a;
    public final transient j$.time.l b;

    public g(b bVar, j$.time.l lVar) {
        Objects.requireNonNull(lVar, "time");
        this.a = bVar;
        this.b = lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static g s(m mVar, j$.time.temporal.m mVar2) {
        g gVar = (g) mVar2;
        if (mVar.equals(gVar.d())) {
            return gVar;
        }
        j$.time.h.e("Chronology mismatch, required: ", mVar.q(), gVar.d().q());
        return null;
    }

    private Object writeReplace() {
        return new f0((byte) 2, this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final g l(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return s(this.a.d(), sVar.s(this, j));
        }
        switch (f.a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return G(this.a, 0L, 0L, 0L, j);
            case 2:
                g P = P(this.a.l(j / 86400000000L, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.b);
                return P.G(P.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                g P2 = P(this.a.l(j / 86400000, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.b);
                return P2.G(P2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return G(this.a, 0L, 0L, j, 0L);
            case 5:
                return G(this.a, 0L, j, 0L, 0L);
            case 6:
                return G(this.a, j, 0L, 0L, 0L);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                g P3 = P(this.a.l(j / 256, (j$.time.temporal.s) j$.time.temporal.b.DAYS), this.b);
                return P3.G(P3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return P(this.a.l(j, sVar), this.b);
        }
    }

    @Override // j$.time.chrono.e
    public final j F(j$.time.y yVar) {
        return l.B(yVar, null, this);
    }

    public final g G(b bVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.l lVar = this.b;
        if (j5 == 0) {
            return P(bVar, lVar);
        }
        long j6 = j / 24;
        long f0 = lVar.f0();
        long j7 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + f0;
        long floorDiv = Math.floorDiv(j7, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long floorMod = Math.floorMod(j7, 86400000000000L);
        return P(bVar.l(floorDiv, (j$.time.temporal.s) j$.time.temporal.b.DAYS), floorMod == f0 ? this.b : j$.time.l.W(floorMod));
    }

    @Override // j$.time.temporal.m
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final g i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return s(this.a.d(), qVar.W(this, j));
        }
        boolean a0 = ((j$.time.temporal.a) qVar).a0();
        b bVar = this.a;
        return a0 ? P(bVar, this.b.i(j, qVar)) : P(bVar.i(j, qVar), this.b);
    }

    public final g P(j$.time.temporal.m mVar, j$.time.l lVar) {
        b bVar = this.a;
        return (bVar == mVar && this.b == lVar) ? this : new g(d.s(bVar.d(), mVar), lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).a0() ? this.b.e(qVar) : this.a.e(qVar) : k(qVar).a(g(qVar), qVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.s(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.isDateBased() || aVar.a0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).a0() ? this.b.g(qVar) : this.a.g(qVar) : qVar.P(this);
    }

    @Override // j$.time.chrono.e
    public final j$.time.l h() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // j$.time.temporal.m
    /* renamed from: j */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return localDate != null ? P(localDate, this.b) : s(this.a.d(), (g) localDate.c(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return (((j$.time.temporal.a) qVar).a0() ? this.b : this.a).k(qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.chrono.e
    public final b n() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }
}
