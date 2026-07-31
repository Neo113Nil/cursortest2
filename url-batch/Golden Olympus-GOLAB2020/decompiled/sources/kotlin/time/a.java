package kotlin.time;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.ranges.g;
import kotlin.text.StringsKt;
import n2.AbstractC3266a;
import n2.EnumC3267b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C0233a f41281c = new C0233a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final long f41282d = h(0);

    /* renamed from: e, reason: collision with root package name */
    private static final long f41283e;

    /* renamed from: f, reason: collision with root package name */
    private static final long f41284f;

    /* renamed from: b, reason: collision with root package name */
    private final long f41285b;

    /* renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    public static final class C0233a {
        public /* synthetic */ C0233a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f41283e;
        }

        public final long b() {
            return a.f41282d;
        }

        public final long c(String value) {
            long p4;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                p4 = b.p(value, true);
                return p4;
            } catch (IllegalArgumentException e4) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e4);
            }
        }

        private C0233a() {
        }
    }

    static {
        long j4;
        long j5;
        j4 = b.j(4611686018427387903L);
        f41283e = j4;
        j5 = b.j(-4611686018427387903L);
        f41284f = j5;
    }

    private /* synthetic */ a(long j4) {
        this.f41285b = j4;
    }

    public static final boolean A(long j4) {
        return j4 < 0;
    }

    public static final long B(long j4, long j5) {
        long k4;
        long m4;
        if (z(j4)) {
            if (w(j5) || (j5 ^ j4) >= 0) {
                return j4;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (z(j5)) {
            return j5;
        }
        if ((((int) j4) & 1) != (((int) j5) & 1)) {
            return x(j4) ? c(j4, u(j4), u(j5)) : c(j4, u(j5), u(j4));
        }
        long u4 = u(j4) + u(j5);
        if (y(j4)) {
            m4 = b.m(u4);
            return m4;
        }
        k4 = b.k(u4);
        return k4;
    }

    public static final int C(long j4, EnumC3267b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) g.l(E(j4, unit), -2147483648L, 2147483647L);
    }

    public static final String D(long j4) {
        StringBuilder sb = new StringBuilder();
        if (A(j4)) {
            sb.append('-');
        }
        sb.append("PT");
        long j5 = j(j4);
        long m4 = m(j5);
        int q4 = q(j5);
        int s4 = s(j5);
        int r4 = r(j5);
        long j6 = z(j4) ? 9999999999999L : m4;
        boolean z4 = false;
        boolean z5 = j6 != 0;
        boolean z6 = (s4 == 0 && r4 == 0) ? false : true;
        if (q4 != 0 || (z6 && z5)) {
            z4 = true;
        }
        if (z5) {
            sb.append(j6);
            sb.append('H');
        }
        if (z4) {
            sb.append(q4);
            sb.append('M');
        }
        if (z6 || (!z5 && !z4)) {
            d(j4, sb, s4, r4, 9, "S", true);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final long E(long j4, EnumC3267b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j4 == f41283e) {
            return Long.MAX_VALUE;
        }
        if (j4 == f41284f) {
            return Long.MIN_VALUE;
        }
        return c.b(u(j4), t(j4), unit);
    }

    public static String F(long j4) {
        if (j4 == 0) {
            return "0s";
        }
        if (j4 == f41283e) {
            return "Infinity";
        }
        if (j4 == f41284f) {
            return "-Infinity";
        }
        boolean A4 = A(j4);
        StringBuilder sb = new StringBuilder();
        if (A4) {
            sb.append('-');
        }
        long j5 = j(j4);
        long l4 = l(j5);
        int k4 = k(j5);
        int q4 = q(j5);
        int s4 = s(j5);
        int r4 = r(j5);
        int i4 = 0;
        boolean z4 = l4 != 0;
        boolean z5 = k4 != 0;
        boolean z6 = q4 != 0;
        boolean z7 = (s4 == 0 && r4 == 0) ? false : true;
        if (z4) {
            sb.append(l4);
            sb.append('d');
            i4 = 1;
        }
        if (z5 || (z4 && (z6 || z7))) {
            int i5 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(k4);
            sb.append('h');
            i4 = i5;
        }
        if (z6 || (z7 && (z5 || z4))) {
            int i6 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(q4);
            sb.append('m');
            i4 = i6;
        }
        if (z7) {
            int i7 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            if (s4 != 0 || z4 || z5 || z6) {
                d(j4, sb, s4, r4, 9, "s", false);
            } else if (r4 >= 1000000) {
                d(j4, sb, r4 / 1000000, r4 % 1000000, 6, "ms", false);
            } else if (r4 >= 1000) {
                d(j4, sb, r4 / 1000, r4 % 1000, 3, "us", false);
            } else {
                sb.append(r4);
                sb.append("ns");
            }
            i4 = i7;
        }
        if (A4 && i4 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static final long G(long j4) {
        long i4;
        i4 = b.i(-u(j4), ((int) j4) & 1);
        return i4;
    }

    private static final long c(long j4, long j5, long j6) {
        long o4;
        long j7;
        long n4;
        long n5;
        long l4;
        o4 = b.o(j6);
        long j8 = j5 + o4;
        if (!new f(-4611686018426L, 4611686018426L).f(j8)) {
            j7 = b.j(g.l(j8, -4611686018427387903L, 4611686018427387903L));
            return j7;
        }
        n4 = b.n(o4);
        long j9 = j6 - n4;
        n5 = b.n(j8);
        l4 = b.l(n5 + j9);
        return l4;
    }

    private static final void d(long j4, StringBuilder sb, int i4, int i5, int i6, String str, boolean z4) {
        sb.append(i4);
        if (i5 != 0) {
            sb.append(JwtParser.SEPARATOR_CHAR);
            String p02 = StringsKt.p0(String.valueOf(i5), i6, '0');
            int i7 = -1;
            int length = p02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i8 = length - 1;
                    if (p02.charAt(length) != '0') {
                        i7 = length;
                        break;
                    } else if (i8 < 0) {
                        break;
                    } else {
                        length = i8;
                    }
                }
            }
            int i9 = i7 + 1;
            if (z4 || i9 >= 3) {
                sb.append((CharSequence) p02, 0, ((i7 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) p02, 0, i9);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ a e(long j4) {
        return new a(j4);
    }

    public static int g(long j4, long j5) {
        long j6 = j4 ^ j5;
        if (j6 < 0 || (((int) j6) & 1) == 0) {
            return Intrinsics.compare(j4, j5);
        }
        int i4 = (((int) j4) & 1) - (((int) j5) & 1);
        return A(j4) ? -i4 : i4;
    }

    public static long h(long j4) {
        if (AbstractC3266a.a()) {
            if (y(j4)) {
                if (!new f(-4611686018426999999L, 4611686018426999999L).f(u(j4))) {
                    throw new AssertionError(u(j4) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new f(-4611686018427387903L, 4611686018427387903L).f(u(j4))) {
                    throw new AssertionError(u(j4) + " ms is out of milliseconds range");
                }
                if (new f(-4611686018426L, 4611686018426L).f(u(j4))) {
                    throw new AssertionError(u(j4) + " ms is denormalized");
                }
            }
        }
        return j4;
    }

    public static boolean i(long j4, Object obj) {
        return (obj instanceof a) && j4 == ((a) obj).H();
    }

    public static final long j(long j4) {
        return A(j4) ? G(j4) : j4;
    }

    public static final int k(long j4) {
        if (z(j4)) {
            return 0;
        }
        return (int) (m(j4) % 24);
    }

    public static final long l(long j4) {
        return E(j4, EnumC3267b.f41385i);
    }

    public static final long m(long j4) {
        return E(j4, EnumC3267b.f41384h);
    }

    public static final long n(long j4) {
        return (x(j4) && w(j4)) ? u(j4) : E(j4, EnumC3267b.f41381e);
    }

    public static final long o(long j4) {
        return E(j4, EnumC3267b.f41383g);
    }

    public static final long p(long j4) {
        return E(j4, EnumC3267b.f41382f);
    }

    public static final int q(long j4) {
        if (z(j4)) {
            return 0;
        }
        return (int) (o(j4) % 60);
    }

    public static final int r(long j4) {
        if (z(j4)) {
            return 0;
        }
        return (int) (x(j4) ? b.n(u(j4) % 1000) : u(j4) % 1000000000);
    }

    public static final int s(long j4) {
        if (z(j4)) {
            return 0;
        }
        return (int) (p(j4) % 60);
    }

    private static final EnumC3267b t(long j4) {
        return y(j4) ? EnumC3267b.f41379c : EnumC3267b.f41381e;
    }

    private static final long u(long j4) {
        return j4 >> 1;
    }

    public static int v(long j4) {
        return Long.hashCode(j4);
    }

    public static final boolean w(long j4) {
        return !z(j4);
    }

    private static final boolean x(long j4) {
        return (((int) j4) & 1) == 1;
    }

    private static final boolean y(long j4) {
        return (((int) j4) & 1) == 0;
    }

    public static final boolean z(long j4) {
        return j4 == f41283e || j4 == f41284f;
    }

    public final /* synthetic */ long H() {
        return this.f41285b;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return f(((a) obj).H());
    }

    public boolean equals(Object obj) {
        return i(this.f41285b, obj);
    }

    public int f(long j4) {
        return g(this.f41285b, j4);
    }

    public int hashCode() {
        return v(this.f41285b);
    }

    public String toString() {
        return F(this.f41285b);
    }
}
