package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.t;
import j$.time.l;
import j$.time.n;
import j$.time.temporal.o;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class f implements Serializable {
    public static final long[] i = new long[0];
    public static final e[] j = new e[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final e[] f;
    public final TimeZone g;
    public final transient ConcurrentMap h = new ConcurrentHashMap();

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                boolean s = bVar.s();
                LocalDateTime localDateTime = bVar.b;
                if (s) {
                    arrayList.add(localDateTime);
                    arrayList.add(bVar.b.Z(bVar.d.b - bVar.c.b));
                } else {
                    arrayList.add(localDateTime.Z(bVar.d.b - bVar.c.b));
                    arrayList.add(bVar.b);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        if (bVar.s()) {
            if (localDateTime.G(localDateTime2)) {
                return bVar.c;
            }
            if (!localDateTime.G(bVar.b.Z(bVar.d.b - bVar.c.b))) {
                return bVar.d;
            }
        } else {
            if (!localDateTime.G(localDateTime2)) {
                return bVar.d;
            }
            if (localDateTime.G(bVar.b.Z(bVar.d.b - bVar.c.b))) {
                return bVar.c;
            }
        }
        return bVar;
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(Math.floorDiv(j2 + zoneOffset.b, 86400L)).getYear();
    }

    public static ZoneOffset h(int i2) {
        return ZoneOffset.b0(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public final b[] b(int i2) {
        LocalDate B;
        b[] bVarArr = l;
        Integer valueOf = Integer.valueOf(i2);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.h).get(valueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j2 = 1;
        int i3 = 0;
        int i4 = 1;
        if (this.g != null) {
            if (i2 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.c;
            LocalDate of = LocalDate.of(i2 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.Z(0L);
            long w = new LocalDateTime(of, l.h[0]).w(this.b[0]);
            long j3 = 1000;
            int offset = this.g.getOffset(w * 1000);
            long j4 = 31968000 + w;
            while (w < j4) {
                long j5 = w + 7776000;
                long j6 = j3;
                if (offset != this.g.getOffset(j5 * j6)) {
                    while (j5 - w > j2) {
                        long floorDiv = Math.floorDiv(j5 + w, 2L);
                        if (this.g.getOffset(floorDiv * j6) == offset) {
                            w = floorDiv;
                        } else {
                            j5 = floorDiv;
                        }
                        j2 = 1;
                    }
                    if (this.g.getOffset(w * j6) == offset) {
                        w = j5;
                    }
                    ZoneOffset h = h(offset);
                    int offset2 = this.g.getOffset(w * j6);
                    ZoneOffset h2 = h(offset2);
                    if (c(w, h2) == i2) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(w, h, h2);
                    }
                    offset = offset2;
                } else {
                    w = j5;
                }
                j3 = j6;
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                ((ConcurrentHashMap) this.h).putIfAbsent(valueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i5 = 0;
        while (i5 < eVarArr.length) {
            e eVar = eVarArr[i5];
            byte b = eVar.b;
            n nVar = eVar.a;
            if (b < 0) {
                long j7 = i2;
                int B2 = nVar.B(t.c.X(j7)) + 1 + eVar.b;
                LocalDate localDate = LocalDate.d;
                j$.time.temporal.a.YEAR.Z(j7);
                j$.time.temporal.a.DAY_OF_MONTH.Z(B2);
                B = LocalDate.B(i2, nVar.getValue(), B2);
                j$.time.e eVar2 = eVar.c;
                if (eVar2 != null) {
                    B = B.j(new o(eVar2.getValue(), i4));
                }
            } else {
                LocalDate localDate2 = LocalDate.d;
                j$.time.temporal.a.YEAR.Z(i2);
                j$.time.temporal.a.DAY_OF_MONTH.Z(b);
                B = LocalDate.B(i2, nVar.getValue(), b);
                j$.time.e eVar3 = eVar.c;
                if (eVar3 != null) {
                    B = B.j(new o(eVar3.getValue(), i3));
                }
            }
            if (eVar.e) {
                B = B.f0(1L);
            }
            LocalDateTime J = LocalDateTime.J(B, eVar.d);
            d dVar = eVar.f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.h;
            int i6 = c.a[dVar.ordinal()];
            if (i6 == 1) {
                J = J.Z(zoneOffset2.b - ZoneOffset.UTC.b);
            } else if (i6 == 2) {
                J = J.Z(zoneOffset2.b - zoneOffset.b);
            }
            bVarArr3[i5] = new b(J, eVar.h, eVar.i);
            i5++;
            i3 = 0;
        }
        if (i2 < 2100) {
            ((ConcurrentHashMap) this.h).putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            long j2 = instant.a;
            return h(timeZone.getOffset((j2 >= 0 || instant.b <= 0) ? Math.addExact(Math.multiplyExact(j2, 1000L), instant.b / 1000000) : Math.addExact(Math.multiplyExact(j2 + 1, 1000L), (instant.b / 1000000) - 1000)));
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f.length > 0) {
            if (epochSecond > this.c[r9.length - 1]) {
                b[] b = b(c(epochSecond, this.e[r9.length - 1]));
                b bVar = null;
                for (int i2 = 0; i2 < b.length; i2++) {
                    bVar = b[i2];
                    if (epochSecond < bVar.a) {
                        return bVar.c;
                    }
                }
                return bVar.d;
            }
        }
        int binarySearch = Arrays.binarySearch(this.c, epochSecond);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.e[binarySearch + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r9.s(r0) > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
    
        if (r9.b.f0() <= r0.b.f0()) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(LocalDateTime localDateTime) {
        boolean z;
        Object obj = null;
        int i2 = 0;
        if (this.g != null) {
            b[] b = b(localDateTime.a.getYear());
            if (b.length == 0) {
                return h(this.g.getOffset(localDateTime.w(this.b[0]) * 1000));
            }
            int length = b.length;
            while (i2 < length) {
                b bVar = b[i2];
                Object a = a(localDateTime, bVar);
                if ((a instanceof b) || a.equals(bVar.c)) {
                    return a;
                }
                i2++;
                obj = a;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        if (this.f.length > 0) {
            LocalDateTime[] localDateTimeArr = this.d;
            LocalDateTime localDateTime2 = localDateTimeArr[localDateTimeArr.length - 1];
            if (localDateTime2 != null) {
                localDateTime.getClass();
            } else {
                long epochDay = localDateTime.a.toEpochDay();
                long epochDay2 = localDateTime2.a.toEpochDay();
                if (epochDay <= epochDay2) {
                    if (epochDay == epochDay2) {
                    }
                    z = false;
                }
                z = true;
            }
            if (z) {
                b[] b2 = b(localDateTime.a.getYear());
                int length2 = b2.length;
                while (i2 < length2) {
                    b bVar2 = b2[i2];
                    Object a2 = a(localDateTime, bVar2);
                    if ((a2 instanceof b) || a2.equals(bVar2.c)) {
                        return a2;
                    }
                    i2++;
                    obj = a2;
                }
                return obj;
            }
        }
        int binarySearch = Arrays.binarySearch(this.d, localDateTime);
        if (binarySearch == -1) {
            return this.e[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            Object[] objArr = this.d;
            if (binarySearch < objArr.length - 1) {
                int i3 = binarySearch + 1;
                if (objArr[binarySearch].equals(objArr[i3])) {
                    binarySearch = i3;
                }
            }
        }
        if ((binarySearch & 1) != 0) {
            return this.e[(binarySearch / 2) + 1];
        }
        LocalDateTime[] localDateTimeArr2 = this.d;
        LocalDateTime localDateTime3 = localDateTimeArr2[binarySearch];
        LocalDateTime localDateTime4 = localDateTimeArr2[binarySearch + 1];
        ZoneOffset[] zoneOffsetArr = this.e;
        int i4 = binarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr[i4];
        ZoneOffset zoneOffset2 = zoneOffsetArr[i4 + 1];
        return zoneOffset2.b > zoneOffset.b ? new b(localDateTime3, zoneOffset, zoneOffset2) : new b(localDateTime4, zoneOffset, zoneOffset2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.g, fVar.g) && Arrays.equals(this.a, fVar.a) && Arrays.equals(this.b, fVar.b) && Arrays.equals(this.c, fVar.c) && Arrays.equals(this.e, fVar.e) && Arrays.equals(this.f, fVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final List f(LocalDateTime localDateTime) {
        Object e = e(localDateTime);
        if (!(e instanceof b)) {
            return Collections.singletonList((ZoneOffset) e);
        }
        b bVar = (b) e;
        return bVar.s() ? Collections.EMPTY_LIST : j$.time.b.c(new Object[]{bVar.c, bVar.d});
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffset = h(timeZone.getRawOffset());
        } else if (this.c.length == 0) {
            zoneOffset = this.b[0];
        } else {
            int binarySearch = Arrays.binarySearch(this.a, instant.getEpochSecond());
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            zoneOffset = this.b[binarySearch + 1];
        }
        return !zoneOffset.equals(d(instant));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) ^ ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e));
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.b[r3.length - 1] + "]";
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {h(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }
}
