package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import org.chromium.net.UrlRequest;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class q extends d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient o a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public q(o oVar, long j) {
        int i = (int) j;
        oVar.w();
        if (i < oVar.e || i >= oVar.f) {
            j$.time.i.d("Hijrah date out of range");
            throw null;
        }
        int binarySearch = Arrays.binarySearch(oVar.d, i);
        binarySearch = binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
        int i2 = oVar.g;
        int[] iArr = {(binarySearch + i2) / 12, ((i2 + binarySearch) % 12) + 1, (i - oVar.d[binarySearch]) + 1};
        this.a = oVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 6, this);
    }

    public final int A() {
        return this.a.B(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.d
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final q w(long j) {
        return new q(this.a, p() + j);
    }

    @Override // j$.time.chrono.d
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final q x(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        long B = j$.nio.file.attribute.a.B(j2, 12L);
        int i = this.a.g;
        if (B >= i / 12 && B <= (((r4.d.length - 1) + i) / 12) - 1) {
            return D((int) B, ((int) j$.nio.file.attribute.a.C(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.c("Invalid Hijrah year: " + B);
    }

    public final q D(int i, int i2, int i3) {
        o oVar = this.a;
        int z = oVar.z(i, i2);
        if (i3 > z) {
            i3 = z;
        }
        return new q(oVar, i, i2, i3);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final q a(long j, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return (q) super.a(j, nVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) nVar;
        o oVar = this.a;
        oVar.o(aVar).b(j, aVar);
        int i = (int) j;
        int i2 = p.a[aVar.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return D(i5, i4, i);
            case 2:
                return w(Math.min(i, oVar.B(i5, 12)) - A());
            case 3:
                return w((j - o(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return w(j - (((int) j$.nio.file.attribute.a.C(p() + 3, 7L)) + 1));
            case 5:
                return w(j - o(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return w(j - o(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new q(oVar, j);
            case 8:
                return w((j - o(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return D(i5, i, i3);
            case 10:
                return x(j - (((i5 * 12) + i4) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return D(i, i4, i3);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return D(i, i4, i3);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return D(1 - i5, i4, i3);
            default:
                j$.time.i.a("Unsupported field: ".concat(String.valueOf(nVar)));
                return null;
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b b(long j, TemporalUnit temporalUnit) {
        return (q) super.b(j, temporalUnit);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.b == qVar.b && this.c == qVar.c && this.d == qVar.d && this.a.equals(qVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal g(j$.time.j jVar) {
        return (q) super.g(jVar);
    }

    @Override // j$.time.chrono.b
    public final a getChronology() {
        return this.a;
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
        int i = p.a[aVar.ordinal()];
        int i2 = this.b;
        return i != 1 ? i != 2 ? i != 3 ? this.a.o(aVar) : j$.time.temporal.q.f(1L, 5L) : j$.time.temporal.q.f(1L, r3.B(i2, 12)) : j$.time.temporal.q.f(1L, r3.z(i2, this.c));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return ((i & (-2048)) ^ 2100100019) ^ (((i << 11) + (this.c << 6)) + this.d);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: l */
    public final b n(long j, TemporalUnit temporalUnit) {
        return (q) super.n(j, temporalUnit);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return (q) super.n(j, chronoUnit);
    }

    @Override // j$.time.temporal.k
    public final long o(j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.h(this);
        }
        int i = p.a[((j$.time.temporal.a) nVar).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return A();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.nio.file.attribute.a.C(p() + 3, 7L)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((A() - 1) % 7) + 1;
            case 7:
                return p();
            case 8:
                return ((A() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((i4 * 12) + i2) - 1;
            case 11:
                return i4;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return i4;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return i4 <= 1 ? 0 : 1;
            default:
                j$.time.i.a("Unsupported field: ".concat(String.valueOf(nVar)));
                return 0L;
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long p() {
        return this.a.y(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e q(j$.time.n nVar) {
        return new g(this, nVar);
    }

    @Override // j$.time.chrono.d
    public final m u() {
        return r.AH;
    }

    @Override // j$.time.chrono.d
    public final b y(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return D(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.d
    /* renamed from: z */
    public final b g(j$.time.temporal.l lVar) {
        return (q) super.g(lVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal b(long j, TemporalUnit temporalUnit) {
        return (q) super.b(j, temporalUnit);
    }

    public q(o oVar, int i, int i2, int i3) {
        oVar.y(i, i2, i3);
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
