package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class i0 extends d {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient j$.time.j a;

    public i0(j$.time.j jVar) {
        Objects.a(jVar, "isoDate");
        this.a = jVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 8, this);
    }

    public final int A() {
        return this.a.a + 543;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i0 a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (i0) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        if (o(aVar) == j) {
            return this;
        }
        int[] iArr = h0.a;
        int i = iArr[aVar.ordinal()];
        j$.time.j jVar = this.a;
        if (i != 4) {
            if (i == 5) {
                g0.c.o(aVar).b(j, aVar);
                return C(jVar.I(j - (((A() * 12) + jVar.b) - 1)));
            }
            if (i != 6) {
            }
        }
        int a = g0.c.o(aVar).a(j, aVar);
        int i2 = iArr[aVar.ordinal()];
        if (i2 == 4) {
            if (A() < 1) {
                a = 1 - a;
            }
            return C(jVar.O(a - 543));
        }
        if (i2 == 6) {
            return C(jVar.O(a - 543));
        }
        if (i2 == 7) {
            return C(jVar.O((-542) - A()));
        }
        return C(jVar.a(j, nVar));
    }

    public final i0 C(j$.time.j jVar) {
        return jVar.equals(this.a) ? this : new i0(jVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b b(long j, TemporalUnit temporalUnit) {
        return (i0) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            return this.a.equals(((i0) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal g(j$.time.j jVar) {
        return (i0) super.g(jVar);
    }

    @Override // j$.time.chrono.b
    public final a getChronology() {
        return g0.c;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.g(this);
        }
        if (!j$.nio.file.attribute.a.p(this, nVar)) {
            j$.time.i.a("Unsupported field: ".concat(String.valueOf(nVar)));
            return null;
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        int i = h0.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.h(nVar);
        }
        if (i != 4) {
            return g0.c.o(aVar);
        }
        j$.time.temporal.q qVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.q.f(1L, A() <= 0 ? (-(qVar.a + 543)) + 1 : qVar.d + 543);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        g0.c.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: l */
    public final b n(long j, TemporalUnit temporalUnit) {
        return (i0) super.n(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return (i0) super.n(j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long o(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.h(this);
        }
        int i = h0.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i == 4) {
            int A = A();
            if (A < 1) {
                A = 1 - A;
            }
            return A;
        }
        j$.time.j jVar = this.a;
        if (i == 5) {
            return ((A() * 12) + jVar.b) - 1;
        }
        if (i == 6) {
            return A();
        }
        if (i != 7) {
            return jVar.o(nVar);
        }
        return A() < 1 ? 0 : 1;
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
        return A() >= 1 ? j0.BE : j0.BEFORE_BE;
    }

    @Override // j$.time.chrono.d
    public final b w(long j) {
        return C(this.a.H(j));
    }

    @Override // j$.time.chrono.d
    public final b x(long j) {
        return C(this.a.I(j));
    }

    @Override // j$.time.chrono.d
    public final b y(long j) {
        return C(this.a.J(j));
    }

    @Override // j$.time.chrono.d
    /* renamed from: z */
    public final b g(j$.time.temporal.l lVar) {
        return (i0) super.g(lVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (i0) super.b(j, temporalUnit);
    }
}
