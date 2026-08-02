package j$.nio.file.attribute;

import j$.time.chrono.b;
import j$.time.chrono.e;
import j$.time.chrono.i;
import j$.time.chrono.j;
import j$.time.chrono.m;
import j$.time.chrono.s;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.k;
import j$.time.temporal.n;
import j$.time.temporal.o;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.r;
import j$.util.stream.c0;
import j$.util.stream.d0;
import j$.util.stream.j0;
import j$.util.stream.l;
import j$.util.stream.m0;
import j$.util.stream.q;
import j$.util.stream.t;
import j$.util.stream.u;
import j$.util.stream.w;
import j$.util.stream.x;
import j$.util.stream.y;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class a implements m0 {
    public static j$.time.chrono.a A(k kVar) {
        Objects.a(kVar, "temporal");
        j$.time.chrono.a aVar = (j$.time.chrono.a) kVar.k(o.b);
        s sVar = s.c;
        if (aVar != null) {
            return aVar;
        }
        Objects.a(sVar, "defaultObj");
        return sVar;
    }

    public static /* synthetic */ long B(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ long C(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long D(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long E(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            if ((j2 != Long.MIN_VALUE) | (j >= 0)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long F(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static String G(Object obj, Object obj2) {
        String str;
        String obj3;
        String str2 = "null";
        if (obj == null || (str = obj.toString()) == null) {
            str = "null";
        }
        int length = str.length();
        if (obj2 != null && (obj3 = obj2.toString()) != null) {
            str2 = obj3;
        }
        int length2 = str2.length();
        char[] cArr = new char[length + length2 + 1];
        str.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str2.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static c0 H(Spliterator spliterator, boolean z) {
        spliterator.getClass();
        int i = j0.f;
        int characteristics = spliterator.characteristics();
        return new c0(spliterator, ((characteristics & 4) == 0 || spliterator.getComparator() == null) ? i & characteristics : i & characteristics & (-5), z);
    }

    public static Temporal c(b bVar, Temporal temporal) {
        return temporal.a(bVar.p(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static int d(b bVar, b bVar2) {
        int compare = Long.compare(bVar.p(), bVar2.p());
        if (compare != 0) {
            return compare;
        }
        return bVar.getChronology().j().compareTo(bVar2.getChronology().j());
    }

    public static int g(e eVar, e eVar2) {
        int compareTo = eVar.toLocalDate().compareTo(eVar2.toLocalDate());
        return (compareTo == 0 && (compareTo = eVar.toLocalTime().compareTo(eVar2.toLocalTime())) == 0) ? eVar.getChronology().j().compareTo(eVar2.getChronology().j()) : compareTo;
    }

    public static int h(j jVar, j jVar2) {
        int compare = Long.compare(jVar.toEpochSecond(), jVar2.toEpochSecond());
        return (compare == 0 && (compare = jVar.toLocalTime().d - jVar2.toLocalTime().d) == 0 && (compare = jVar.toLocalDateTime().r(jVar2.toLocalDateTime())) == 0 && (compare = jVar.getZone().u().compareTo(jVar2.getZone().u())) == 0) ? jVar.getChronology().j().compareTo(jVar2.getChronology().j()) : compare;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object i(ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
        loop0: while (true) {
            Object obj2 = concurrentMap.get(obj);
            while (true) {
                Object apply = biFunction.apply(obj, obj2);
                if (apply != null) {
                    if (obj2 == null) {
                        obj2 = concurrentMap.putIfAbsent(obj, apply);
                        if (obj2 == null) {
                            break loop0;
                        }
                    } else if (concurrentMap.replace(obj, obj2, apply)) {
                        break;
                    }
                } else if (obj2 == null || concurrentMap.remove(obj, obj2)) {
                    return null;
                }
            }
        }
    }

    public static void j(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        biConsumer.getClass();
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static int k(j jVar, n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return o.a(jVar, nVar);
        }
        int i = i.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? jVar.toLocalDateTime().f(nVar) : jVar.getOffset().a;
        }
        j$.time.i.a("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    public static int l(m mVar, n nVar) {
        return nVar == j$.time.temporal.a.ERA ? mVar.getValue() : o.a(mVar, nVar);
    }

    public static long m(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static long n(m mVar, n nVar) {
        if (nVar == j$.time.temporal.a.ERA) {
            return mVar.getValue();
        }
        if (!(nVar instanceof j$.time.temporal.a)) {
            return nVar.h(mVar);
        }
        j$.time.i.a("Unsupported field: ".concat(String.valueOf(nVar)));
        return 0L;
    }

    public static boolean o(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean p(b bVar, n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).isDateBased() : nVar != null && nVar.f(bVar);
    }

    public static boolean q(m mVar, n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.ERA : nVar != null && nVar.f(mVar);
    }

    public static Object r(b bVar, j$.time.format.b bVar2) {
        if (bVar2 == o.a || bVar2 == o.e || bVar2 == o.d || bVar2 == o.g) {
            return null;
        }
        return bVar2 == o.b ? bVar.getChronology() : bVar2 == o.c ? ChronoUnit.DAYS : bVar2.a(bVar);
    }

    public static Object s(e eVar, j$.time.format.b bVar) {
        if (bVar == o.a || bVar == o.e || bVar == o.d) {
            return null;
        }
        return bVar == o.g ? eVar.toLocalTime() : bVar == o.b ? eVar.getChronology() : bVar == o.c ? ChronoUnit.NANOS : bVar.a(eVar);
    }

    public static Object t(j jVar, j$.time.format.b bVar) {
        return (bVar == o.e || bVar == o.a) ? jVar.getZone() : bVar == o.d ? jVar.getOffset() : bVar == o.g ? jVar.toLocalTime() : bVar == o.b ? jVar.getChronology() : bVar == o.c ? ChronoUnit.NANOS : bVar.a(jVar);
    }

    public static Object u(m mVar, j$.time.format.b bVar) {
        return bVar == o.c ? ChronoUnit.ERAS : o.c(mVar, bVar);
    }

    public static long v(e eVar, j$.time.c0 c0Var) {
        Objects.a(c0Var, "offset");
        return ((eVar.toLocalDate().p() * 86400) + eVar.toLocalTime().F()) - c0Var.a;
    }

    public static long w(j jVar) {
        return ((jVar.toLocalDate().p() * 86400) + jVar.toLocalTime().F()) - jVar.getOffset().a;
    }

    public static j$.util.stream.k x(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new t() : new q(j, intFunction);
    }

    public static l y(l lVar, j$.time.format.b bVar) {
        if (lVar.f() <= 0) {
            return lVar;
        }
        long count = lVar.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) bVar.apply((int) count);
        new u(lVar, objArr).invoke();
        return new j$.util.stream.m(objArr);
    }

    public static void z(Iterator it, Consumer consumer) {
        if (it instanceof r) {
            ((r) it).forEachRemaining(consumer);
            return;
        }
        consumer.getClass();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    @Override // j$.util.stream.m0
    public Object a(d0 d0Var, Spliterator spliterator) {
        w wVar = (w) this;
        x xVar = new x(wVar.c, wVar.b, wVar.a);
        d0Var.a(d0Var.g(xVar), spliterator);
        return xVar.get();
    }

    public int characteristics() {
        return 16448;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.m0
    public Object e(d0 d0Var, Spliterator spliterator) {
        return ((x) new y(this, d0Var, spliterator).invoke()).get();
    }

    public long estimateSize() {
        return 0L;
    }

    public Spliterator trySplit() {
        return null;
    }
}
