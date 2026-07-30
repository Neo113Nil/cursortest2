package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class l implements j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient g a;
    public final transient ZoneOffset b;
    public final transient j$.time.y c;

    public l(j$.time.y yVar, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "dateTime");
        this.a = gVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.requireNonNull(yVar, "zone");
        this.c = yVar;
    }

    public static l B(j$.time.y yVar, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "localDateTime");
        Objects.requireNonNull(yVar, "zone");
        if (yVar instanceof ZoneOffset) {
            return new l(yVar, (ZoneOffset) yVar, gVar);
        }
        j$.time.zone.f B = yVar.B();
        LocalDateTime B2 = LocalDateTime.B(gVar);
        List f = B.f(B2);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() == 0) {
            Object e = B.e(B2);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            gVar = gVar.G(gVar.a, 0L, 0L, j$.time.f.B(bVar.d.b - bVar.c.b, 0).a, 0L);
            zoneOffset = bVar.d;
        } else {
            if (zoneOffset == null || !f.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) f.get(0);
            }
            gVar = gVar;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new l(yVar, zoneOffset, gVar);
    }

    public static l G(m mVar, Instant instant, j$.time.y yVar) {
        ZoneOffset d = yVar.B().d(instant);
        Objects.requireNonNull(d, "offset");
        return new l(yVar, d, (g) mVar.I(LocalDateTime.P(instant.getEpochSecond(), instant.getNano(), d)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static l s(m mVar, j$.time.temporal.m mVar2) {
        l lVar = (l) mVar2;
        if (mVar.equals(lVar.d())) {
            return lVar;
        }
        j$.time.h.e("Chronology mismatch, required: ", mVar.q(), lVar.d().q());
        return null;
    }

    private Object writeReplace() {
        return new f0((byte) 3, this);
    }

    @Override // j$.time.chrono.j
    public final j E(j$.time.y yVar) {
        return B(yVar, this.b, this.a);
    }

    @Override // j$.time.temporal.m
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final l l(long j, j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.b ? (l) m(this.a.l(j, sVar)) : s(d(), sVar.s(this, j));
    }

    @Override // j$.time.chrono.j
    public final j$.time.y K() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && compareTo((j) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.s(this);
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c.hashCode(), 3) ^ (this.a.hashCode() ^ this.b.b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return s(d(), qVar.W(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i = k.a[aVar.ordinal()];
        if (i == 1) {
            return l(j - Y(), j$.time.temporal.b.SECONDS);
        }
        if (i != 2) {
            return B(this.c, this.b, this.a.i(j, qVar));
        }
        ZoneOffset b0 = ZoneOffset.b0(aVar.b.a(j, aVar));
        return G(d(), Instant.ofEpochSecond(this.a.w(b0), r5.b.d), this.c);
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset o() {
        return this.b;
    }

    public final String toString() {
        String str = this.a.toString() + this.b.c;
        ZoneOffset zoneOffset = this.b;
        j$.time.y yVar = this.c;
        if (zoneOffset == yVar) {
            return str;
        }
        return str + "[" + yVar.toString() + "]";
    }

    @Override // j$.time.chrono.j
    public final e x() {
        return this.a;
    }
}
