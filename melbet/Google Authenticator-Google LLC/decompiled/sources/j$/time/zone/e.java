package j$.time.zone;

import j$.time.Instant;
import j$.time.c0;
import j$.time.chrono.s;
import j$.time.j;
import j$.time.l;
import j$.time.n;
import j$.time.o;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class e implements Serializable {
    public static final long[] i = new long[0];
    public static final d[] j = new d[0];
    public static final l[] k = new l[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final c0[] b;
    public final long[] c;
    public final l[] d;
    public final c0[] e;
    public final d[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    public e(long[] jArr, c0[] c0VarArr, long[] jArr2, c0[] c0VarArr2, d[] dVarArr) {
        this.a = jArr;
        this.b = c0VarArr;
        this.c = jArr2;
        this.e = c0VarArr2;
        this.f = dVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                c0 c0Var = c0VarArr2[i2];
                int i3 = i2 + 1;
                c0 c0Var2 = c0VarArr2[i3];
                l x = l.x(jArr2[i2], 0, c0Var);
                int i4 = c0Var.a;
                if (c0Var2.a > i4) {
                    arrayList.add(x);
                    arrayList.add(x.z(c0Var2.a - i4));
                } else {
                    arrayList.add(x.z(r3 - i4));
                    arrayList.add(x);
                }
                i2 = i3;
            }
            this.d = (l[]) arrayList.toArray(new l[arrayList.size()]);
        }
        this.g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(l lVar, b bVar) {
        l lVar2 = bVar.b;
        l lVar3 = bVar.b;
        c0 c0Var = bVar.d;
        c0 c0Var2 = bVar.c;
        if (c0Var.a > c0Var2.a) {
            if (!lVar.v(lVar2)) {
                return lVar.v(lVar3.z((long) (c0Var.a - c0Var2.a))) ? bVar : c0Var;
            }
            return c0Var2;
        }
        if (lVar.v(lVar2)) {
            if (lVar.v(lVar3.z(c0Var.a - c0Var2.a))) {
                return c0Var2;
            }
        }
    }

    public static int c(long j2, c0 c0Var) {
        return j.F(j$.nio.file.attribute.a.B(j2 + c0Var.a, 86400L)).a;
    }

    public static c0 g(int i2) {
        return c0.C(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i2) {
        b[] bVarArr;
        final int i3;
        int i4;
        j u;
        Integer valueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.h;
        b[] bVarArr2 = (b[]) concurrentHashMap.get(valueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        int i5 = 2100;
        final int i6 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArr3 = l;
            if (i2 < 1800) {
                return bVarArr3;
            }
            l lVar = l.c;
            j E = j.E(i2 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.k(0L);
            long v = j$.nio.file.attribute.a.v(new l(E, n.h[0]), this.b[0]);
            int offset = timeZone.getOffset(v * 1000);
            long j2 = 31968000 + v;
            while (v < j2) {
                long j3 = v + 7776000;
                if (offset != timeZone.getOffset(j3 * 1000)) {
                    while (j3 - v > 1) {
                        long B = j$.nio.file.attribute.a.B(j3 + v, 2L);
                        timeZone = timeZone;
                        if (timeZone.getOffset(B * 1000) == offset) {
                            v = B;
                        } else {
                            j3 = B;
                        }
                    }
                    if (timeZone.getOffset(v * 1000) == offset) {
                        v = j3;
                    }
                    c0 g = g(offset);
                    int offset2 = timeZone.getOffset(v * 1000);
                    c0 g2 = g(offset2);
                    if (c(v, g2) == i2) {
                        b[] bVarArr4 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                        bVarArr4[bVarArr4.length - 1] = new b(v, g, g2);
                        offset = offset2;
                        bVarArr3 = bVarArr4;
                    } else {
                        offset = offset2;
                    }
                } else {
                    v = j3;
                }
            }
            if (1916 <= i2 && i2 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, bVarArr3);
            }
            return bVarArr3;
        }
        int i7 = 1;
        long j4 = 1;
        d[] dVarArr = this.f;
        b[] bVarArr5 = new b[dVarArr.length];
        int i8 = 0;
        while (i8 < dVarArr.length) {
            d dVar = dVarArr[i8];
            c0 c0Var = dVar.h;
            int i9 = c0Var.a;
            j$.time.d dVar2 = dVar.c;
            byte b = dVar.b;
            o oVar = dVar.a;
            if (b < 0) {
                int i10 = i7;
                i4 = i9;
                long j5 = i2;
                s.c.getClass();
                int u2 = oVar.u(s.w(j5)) + 1 + b;
                j jVar = j.d;
                j$.time.temporal.a.YEAR.k(j5);
                bVarArr = bVarArr5;
                j$.time.temporal.a.DAY_OF_MONTH.k(u2);
                u = j.u(i2, oVar.getValue(), u2);
                if (dVar2 != null) {
                    final int value = dVar2.getValue();
                    i3 = i10;
                    u = u.g(new j$.time.temporal.l() { // from class: j$.time.temporal.m
                        @Override // j$.time.temporal.l
                        public final Temporal j(Temporal temporal) {
                            int i11 = i3;
                            int i12 = value;
                            switch (i11) {
                                case 0:
                                    int f = temporal.f(a.DAY_OF_WEEK);
                                    if (f == i12) {
                                        return temporal;
                                    }
                                    return temporal.b(f - i12 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                                default:
                                    int f2 = temporal.f(a.DAY_OF_WEEK);
                                    if (f2 == i12) {
                                        return temporal;
                                    }
                                    return temporal.n(i12 - f2 >= 0 ? 7 - r2 : -r2, ChronoUnit.DAYS);
                            }
                        }
                    });
                } else {
                    i3 = i10;
                }
            } else {
                bVarArr = bVarArr5;
                i3 = i7;
                i4 = i9;
                j jVar2 = j.d;
                j$.time.temporal.a.YEAR.k(i2);
                j$.time.temporal.a.DAY_OF_MONTH.k(b);
                u = j.u(i2, oVar.getValue(), b);
                if (dVar2 != null) {
                    final int value2 = dVar2.getValue();
                    u = u.g(new j$.time.temporal.l() { // from class: j$.time.temporal.m
                        @Override // j$.time.temporal.l
                        public final Temporal j(Temporal temporal) {
                            int i11 = i6;
                            int i12 = value2;
                            switch (i11) {
                                case 0:
                                    int f = temporal.f(a.DAY_OF_WEEK);
                                    if (f == i12) {
                                        return temporal;
                                    }
                                    return temporal.b(f - i12 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                                default:
                                    int f2 = temporal.f(a.DAY_OF_WEEK);
                                    if (f2 == i12) {
                                        return temporal;
                                    }
                                    return temporal.n(i12 - f2 >= 0 ? 7 - r2 : -r2, ChronoUnit.DAYS);
                            }
                        }
                    });
                }
            }
            long j6 = j4;
            if (dVar.e) {
                u = u.H(j6);
            }
            l w = l.w(u, dVar.d);
            c cVar = dVar.f;
            c0 c0Var2 = dVar.g;
            int ordinal = cVar.ordinal();
            if (ordinal == 0) {
                w = w.z(i4 - c0.e.a);
            } else if (ordinal == 2) {
                w = w.z(i4 - c0Var2.a);
            }
            bVarArr[i8] = new b(w, c0Var, dVar.i);
            i8++;
            j4 = j6;
            i7 = i3;
            bVarArr5 = bVarArr;
            i5 = 2100;
        }
        b[] bVarArr6 = bVarArr5;
        if (i2 >= i5) {
            return bVarArr6;
        }
        concurrentHashMap.putIfAbsent(valueOf, bVarArr6);
        return bVarArr6;
    }

    public final c0 d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return g(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f.length;
        c0[] c0VarArr = this.e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return c0VarArr[binarySearch + 1];
        }
        b[] b = b(c(epochSecond, c0VarArr[c0VarArr.length - 1]));
        b bVar = null;
        for (int i2 = 0; i2 < b.length; i2++) {
            bVar = b[i2];
            if (epochSecond < bVar.a) {
                return bVar.c;
            }
        }
        return bVar.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r10.t(r1) > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0081, code lost:
    
        if (r10.b.E() <= r1.b.E()) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(l lVar) {
        boolean z;
        Object obj = null;
        c0[] c0VarArr = this.b;
        int i2 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] b = b(lVar.a.a);
            if (b.length == 0) {
                return g(timeZone.getOffset(j$.nio.file.attribute.a.v(lVar, c0VarArr[0]) * 1000));
            }
            int length = b.length;
            while (i2 < length) {
                b bVar = b[i2];
                Object a = a(lVar, bVar);
                if ((a instanceof b) || a.equals(bVar.c)) {
                    return a;
                }
                i2++;
                obj = a;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return c0VarArr[0];
        }
        int length2 = this.f.length;
        l[] lVarArr = this.d;
        if (length2 > 0) {
            l lVar2 = lVarArr[lVarArr.length - 1];
            if (lVar2 == null) {
                long p = lVar.a.p();
                long p2 = lVar2.a.p();
                if (p <= p2) {
                    if (p == p2) {
                    }
                    z = false;
                }
                z = true;
            }
            if (z) {
                b[] b2 = b(lVar.a.a);
                int length3 = b2.length;
                while (i2 < length3) {
                    b bVar2 = b2[i2];
                    Object a2 = a(lVar, bVar2);
                    if ((a2 instanceof b) || a2.equals(bVar2.c)) {
                        return a2;
                    }
                    i2++;
                    obj = a2;
                }
                return obj;
            }
        }
        int binarySearch = Arrays.binarySearch(lVarArr, lVar);
        c0[] c0VarArr2 = this.e;
        if (binarySearch == -1) {
            return c0VarArr2[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else if (binarySearch < lVarArr.length - 1) {
            int i3 = binarySearch + 1;
            if (lVarArr[binarySearch].equals(lVarArr[i3])) {
                binarySearch = i3;
            }
        }
        if ((binarySearch & 1) != 0) {
            return c0VarArr2[(binarySearch / 2) + 1];
        }
        l lVar3 = lVarArr[binarySearch];
        l lVar4 = lVarArr[binarySearch + 1];
        int i4 = binarySearch / 2;
        c0 c0Var = c0VarArr2[i4];
        c0 c0Var2 = c0VarArr2[i4 + 1];
        return c0Var2.a > c0Var.a ? new b(lVar3, c0Var, c0Var2) : new b(lVar4, c0Var, c0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Objects.equals(this.g, eVar.g) && Arrays.equals(this.a, eVar.a) && Arrays.equals(this.b, eVar.b) && Arrays.equals(this.c, eVar.c) && Arrays.equals(this.e, eVar.e) && Arrays.equals(this.f, eVar.f);
    }

    public final List f(l lVar) {
        Object e = e(lVar);
        if (!(e instanceof b)) {
            return Collections.singletonList((c0) e);
        }
        b bVar = (b) e;
        c0 c0Var = bVar.d;
        int i2 = c0Var.a;
        c0 c0Var2 = bVar.c;
        if (i2 > c0Var2.a) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {c0Var2, c0Var};
        ArrayList arrayList = new ArrayList(2);
        for (int i3 = 0; i3 < 2; i3++) {
            Object obj = objArr[i3];
            obj.getClass();
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) ^ ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e));
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + String.valueOf(this.b[r3.length - 1]) + "]";
    }

    public e(c0 c0Var) {
        c0[] c0VarArr = {c0Var};
        this.b = c0VarArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = c0VarArr;
        this.f = j;
        this.g = null;
    }

    public e(TimeZone timeZone) {
        c0[] c0VarArr = {g(timeZone.getRawOffset())};
        this.b = c0VarArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = c0VarArr;
        this.f = j;
        this.g = timeZone;
    }
}
