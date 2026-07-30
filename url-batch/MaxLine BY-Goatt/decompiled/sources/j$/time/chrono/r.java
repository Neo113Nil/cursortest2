package j$.time.chrono;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import defpackage.l42;
import j$.time.LocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class r extends d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient p a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    public r(p pVar, long j) {
        int i = (int) j;
        pVar.Z();
        if (i < pVar.e || i >= pVar.f) {
            j$.time.h.a("Hijrah date out of range");
            throw null;
        }
        int binarySearch = Arrays.binarySearch(pVar.d, i);
        binarySearch = binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
        int[] iArr = {pVar.b0(binarySearch), ((pVar.g + binarySearch) % 12) + 1, (i - pVar.d[binarySearch]) + 1};
        this.a = pVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 6, this);
    }

    @Override // j$.time.chrono.d
    public final b J(long j) {
        return j == 0 ? this : a0(Math.addExact(this.b, (int) j), this.c, this.d);
    }

    @Override // j$.time.chrono.b
    public final e L(j$.time.l lVar) {
        return new g(this, lVar);
    }

    @Override // j$.time.chrono.b
    public final n N() {
        return s.AH;
    }

    public final int P() {
        return this.a.f0(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b R(j$.time.temporal.p pVar) {
        return (r) super.R(pVar);
    }

    @Override // j$.time.chrono.b
    public final int U() {
        return this.a.f0(this.b, 12);
    }

    @Override // j$.time.chrono.d
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final r B(long j) {
        return new r(this.a, toEpochDay() + j);
    }

    @Override // j$.time.chrono.d
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final r G(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        p pVar = this.a;
        long floorDiv = Math.floorDiv(j2, 12L);
        if (floorDiv >= pVar.b0(0) && floorDiv <= pVar.b0(pVar.d.length - 1) - 1) {
            return a0((int) floorDiv, ((int) Math.floorMod(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.c("Invalid Hijrah year: " + floorDiv);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final b a(long j, j$.time.temporal.s sVar) {
        return (r) super.a(j, sVar);
    }

    public final r a0(int i, int i2, int i3) {
        int d0 = this.a.d0(i, i2);
        if (i3 > d0) {
            i3 = d0;
        }
        return new r(this.a, i, i2, i3);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final r i(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (r) super.i(j, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        this.a.z(aVar).b(j, aVar);
        int i = (int) j;
        switch (q.a[aVar.ordinal()]) {
            case 1:
                return a0(this.b, this.c, i);
            case 2:
                return B(Math.min(i, U()) - P());
            case 3:
                return B((j - g(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return B(j - (((int) Math.floorMod(toEpochDay() + 3, 7L)) + 1));
            case 5:
                return B(j - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return B(j - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return new r(this.a, j);
            case 8:
                return B((j - g(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return a0(this.b, i, this.d);
            case 10:
                return G(j - (((this.b * 12) + this.c) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return a0(i, this.c, this.d);
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return a0(i, this.c, this.d);
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return a0(1 - this.b, this.c, this.d);
            default:
                throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.b
    public final m d() {
        return this.a;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.b == rVar.b && this.c == rVar.c && this.d == rVar.d && this.a.equals(rVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.q qVar) {
        int i;
        int i2;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.P(this);
        }
        switch (q.a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                i = this.d;
                return i;
            case 2:
                i = P();
                return i;
            case 3:
                i2 = (this.d - 1) / 7;
                i = i2 + 1;
                return i;
            case 4:
                i2 = (int) Math.floorMod(toEpochDay() + 3, 7L);
                i = i2 + 1;
                return i;
            case 5:
                i2 = (this.d - 1) % 7;
                i = i2 + 1;
                return i;
            case 6:
                i2 = (P() - 1) % 7;
                i = i2 + 1;
                return i;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return toEpochDay();
            case 8:
                i2 = (P() - 1) / 7;
                i = i2 + 1;
                return i;
            case 9:
                i = this.c;
                return i;
            case 10:
                return ((this.b * 12) + this.c) - 1;
            case 11:
                i = this.b;
                return i;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                i = this.b;
                return i;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return ((i & (-2048)) ^ 2100100019) ^ (((i << 11) + (i2 << 6)) + i3);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* renamed from: j */
    public final j$.time.temporal.m m(LocalDate localDate) {
        return (r) super.m(localDate);
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
        int i = q.a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.a.z(aVar) : j$.time.temporal.u.f(1L, 5L) : j$.time.temporal.u.f(1L, U()) : j$.time.temporal.u.f(1L, this.a.d0(this.b, this.c));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b l(long j, j$.time.temporal.s sVar) {
        return (r) super.l(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b m(j$.time.temporal.n nVar) {
        return (r) super.m(nVar);
    }

    @Override // j$.time.chrono.b
    public final long toEpochDay() {
        return this.a.c0(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.b
    public final boolean y() {
        return this.a.X(this.b);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return (r) super.a(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j, j$.time.temporal.s sVar) {
        return (r) super.l(j, sVar);
    }

    public r(p pVar, int i, int i2, int i3) {
        pVar.c0(i, i2, i3);
        this.a = pVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
