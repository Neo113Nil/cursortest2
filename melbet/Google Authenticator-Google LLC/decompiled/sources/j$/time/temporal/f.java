package j$.time.temporal;

import j$.time.chrono.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract class f implements n {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ f[] b;

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.n
            public final boolean f(k kVar) {
                if (!kVar.c(a.DAY_OF_YEAR) || !kVar.c(a.MONTH_OF_YEAR) || !kVar.c(a.YEAR)) {
                    return false;
                }
                f fVar2 = h.a;
                return j$.nio.file.attribute.a.A(kVar).equals(s.c);
            }

            @Override // j$.time.temporal.n
            public final q g(k kVar) {
                if (!f(kVar)) {
                    j$.time.i.a("Unsupported field: DayOfQuarter");
                    return null;
                }
                long o = kVar.o(f.QUARTER_OF_YEAR);
                if (o != 1) {
                    return o == 2 ? q.f(1L, 91L) : (o == 3 || o == 4) ? q.f(1L, 92L) : range();
                }
                long o2 = kVar.o(a.YEAR);
                s.c.getClass();
                return s.w(o2) ? q.f(1L, 91L) : q.f(1L, 90L);
            }

            @Override // j$.time.temporal.n
            public final long h(k kVar) {
                if (!f(kVar)) {
                    j$.time.i.a("Unsupported field: DayOfQuarter");
                    return 0L;
                }
                int f = kVar.f(a.DAY_OF_YEAR);
                int f2 = kVar.f(a.MONTH_OF_YEAR);
                long o = kVar.o(a.YEAR);
                int i = (f2 - 1) / 3;
                s.c.getClass();
                return f - f.a[i + (s.w(o) ? 4 : 0)];
            }

            @Override // j$.time.temporal.n
            public final Temporal j(Temporal temporal, long j) {
                long h = h(temporal);
                range().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.a((j - h) + temporal.o(aVar), aVar);
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return q.g(90L, 92L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.n
            public final boolean f(k kVar) {
                if (!kVar.c(a.MONTH_OF_YEAR)) {
                    return false;
                }
                f fVar3 = h.a;
                return j$.nio.file.attribute.a.A(kVar).equals(s.c);
            }

            @Override // j$.time.temporal.n
            public final q g(k kVar) {
                if (f(kVar)) {
                    return range();
                }
                j$.time.i.a("Unsupported field: QuarterOfYear");
                return null;
            }

            @Override // j$.time.temporal.n
            public final long h(k kVar) {
                if (f(kVar)) {
                    return (kVar.o(a.MONTH_OF_YEAR) + 2) / 3;
                }
                j$.time.i.a("Unsupported field: QuarterOfYear");
                return 0L;
            }

            @Override // j$.time.temporal.n
            public final Temporal j(Temporal temporal, long j) {
                long h = h(temporal);
                range().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.a(((j - h) * 3) + temporal.o(aVar), aVar);
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return q.f(1L, 4L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.n
            public final boolean f(k kVar) {
                if (!kVar.c(a.EPOCH_DAY)) {
                    return false;
                }
                f fVar4 = h.a;
                return j$.nio.file.attribute.a.A(kVar).equals(s.c);
            }

            @Override // j$.time.temporal.n
            public final q g(k kVar) {
                if (f(kVar)) {
                    return q.f(1L, f.o(f.n(j$.time.j.v(kVar))));
                }
                j$.time.i.a("Unsupported field: WeekOfWeekBasedYear");
                return null;
            }

            @Override // j$.time.temporal.n
            public final long h(k kVar) {
                if (f(kVar)) {
                    return f.k(j$.time.j.v(kVar));
                }
                j$.time.i.a("Unsupported field: WeekOfWeekBasedYear");
                return 0L;
            }

            @Override // j$.time.temporal.n
            public final Temporal j(Temporal temporal, long j) {
                range().b(j, this);
                return temporal.b(j$.nio.file.attribute.a.F(j, h(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return q.g(52L, 53L);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.n
            public final boolean f(k kVar) {
                if (!kVar.c(a.EPOCH_DAY)) {
                    return false;
                }
                f fVar5 = h.a;
                return j$.nio.file.attribute.a.A(kVar).equals(s.c);
            }

            @Override // j$.time.temporal.n
            public final q g(k kVar) {
                if (f(kVar)) {
                    return a.YEAR.b;
                }
                j$.time.i.a("Unsupported field: WeekBasedYear");
                return null;
            }

            @Override // j$.time.temporal.n
            public final long h(k kVar) {
                if (f(kVar)) {
                    return f.n(j$.time.j.v(kVar));
                }
                j$.time.i.a("Unsupported field: WeekBasedYear");
                return 0L;
            }

            @Override // j$.time.temporal.n
            public final Temporal j(Temporal temporal, long j) {
                if (!f(temporal)) {
                    j$.time.i.a("Unsupported field: WeekBasedYear");
                    return null;
                }
                int a2 = a.YEAR.b.a(j, f.WEEK_BASED_YEAR);
                j$.time.j v = j$.time.j.v(temporal);
                int f = v.f(a.DAY_OF_WEEK);
                int k = f.k(v);
                if (k == 53 && f.o(a2) == 52) {
                    k = 52;
                }
                return temporal.g(j$.time.j.E(a2, 1, 4).H(((k - 1) * 7) + (f - r3.f(r6))));
            }

            @Override // j$.time.temporal.n
            public final q range() {
                return a.YEAR.b;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = fVar4;
        b = new f[]{fVar, fVar2, fVar3, fVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static int k(j$.time.j jVar) {
        int ordinal = jVar.x().ordinal();
        int y = jVar.y() - 1;
        int i = (3 - ordinal) + y;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (y < i3) {
            return (int) q.f(1L, o(n(jVar.N(180).J(-1L)))).d;
        }
        int i4 = ((y - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && jVar.B())) {
            return i4;
        }
        return 1;
    }

    public static int n(j$.time.j jVar) {
        int i = jVar.a;
        int y = jVar.y();
        if (y <= 3) {
            return y - jVar.x().ordinal() < -2 ? i - 1 : i;
        }
        if (y >= 363) {
            return ((y - 363) - (jVar.B() ? 1 : 0)) - jVar.x().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }

    public static int o(int i) {
        j$.time.j E = j$.time.j.E(i, 1, 1);
        if (E.x() != j$.time.d.THURSDAY) {
            return (E.x() == j$.time.d.WEDNESDAY && E.B()) ? 53 : 52;
        }
        return 53;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) b.clone();
    }

    @Override // j$.time.temporal.n
    public final boolean isDateBased() {
        return true;
    }
}
