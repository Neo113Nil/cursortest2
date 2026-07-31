package G5;

import F5.j;
import a.AbstractC0219a;
import i6.g;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final long f862g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f863h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f864i = 0;

    /* renamed from: f, reason: collision with root package name */
    public final long f865f;

    static {
        int i7 = b.f866a;
        f862g = AbstractC0219a.k(4611686018427387903L);
        f863h = AbstractC0219a.k(-4611686018427387903L);
    }

    public static final long a(long j4, long j7) {
        long j8 = 1000000;
        long j9 = j7 / j8;
        long j10 = j4 + j9;
        if (-4611686018426L > j10 || j10 >= 4611686018427L) {
            return AbstractC0219a.k(g.i(j10));
        }
        return AbstractC0219a.m((j10 * j8) + (j7 - (j9 * j8)));
    }

    public static final void b(StringBuilder sb, int i7, int i8, int i9, String str, boolean z5) {
        sb.append(i7);
        if (i8 != 0) {
            sb.append('.');
            String W6 = j.W(String.valueOf(i8), i9);
            int i10 = -1;
            int length = W6.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (W6.charAt(length) != '0') {
                        i10 = length;
                        break;
                    } else if (i11 < 0) {
                        break;
                    } else {
                        length = i11;
                    }
                }
            }
            int i12 = i10 + 1;
            if (z5 || i12 >= 3) {
                sb.append((CharSequence) W6, 0, ((i10 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) W6, 0, i12);
            }
        }
        sb.append(str);
    }

    public static final int c(long j4) {
        if (d(j4)) {
            return 0;
        }
        return (int) ((((int) j4) & 1) == 1 ? ((j4 >> 1) % 1000) * 1000000 : (j4 >> 1) % 1000000000);
    }

    public static final boolean d(long j4) {
        return j4 == f862g || j4 == f863h;
    }

    public static final long e(long j4, long j7) {
        if (d(j4)) {
            if (!d(j7) || (j7 ^ j4) >= 0) {
                return j4;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (d(j7)) {
            return j7;
        }
        int i7 = ((int) j4) & 1;
        if (i7 != (((int) j7) & 1)) {
            return i7 == 1 ? a(j4 >> 1, j7 >> 1) : a(j7 >> 1, j4 >> 1);
        }
        long j8 = (j4 >> 1) + (j7 >> 1);
        return i7 == 0 ? (-4611686018426999999L > j8 || j8 >= 4611686018427000000L) ? AbstractC0219a.k(j8 / 1000000) : AbstractC0219a.m(j8) : AbstractC0219a.l(j8);
    }

    public static final long f(long j4, c unit) {
        i.e(unit, "unit");
        if (j4 == f862g) {
            return Long.MAX_VALUE;
        }
        if (j4 == f863h) {
            return Long.MIN_VALUE;
        }
        long j7 = j4 >> 1;
        c sourceUnit = (((int) j4) & 1) == 0 ? c.f867g : c.f868h;
        i.e(sourceUnit, "sourceUnit");
        return unit.f874f.convert(j7, sourceUnit.f874f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j4 = ((a) obj).f865f;
        long j7 = this.f865f;
        long j8 = j7 ^ j4;
        if (j8 < 0 || (((int) j8) & 1) == 0) {
            return i.h(j7, j4);
        }
        int i7 = (((int) j7) & 1) - (((int) j4) & 1);
        return j7 < 0 ? -i7 : i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f865f == ((a) obj).f865f;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f865f);
    }

    public final String toString() {
        long j4;
        int f7;
        long j7 = this.f865f;
        if (j7 == 0) {
            return "0s";
        }
        if (j7 == f862g) {
            return "Infinity";
        }
        if (j7 == f863h) {
            return "-Infinity";
        }
        int i7 = 0;
        boolean z5 = j7 < 0;
        StringBuilder sb = new StringBuilder();
        if (z5) {
            sb.append('-');
        }
        if (j7 < 0) {
            j7 = (((int) j7) & 1) + ((-(j7 >> 1)) << 1);
            int i8 = b.f866a;
        }
        long f8 = f(j7, c.f872l);
        int f9 = d(j7) ? 0 : (int) (f(j7, c.f871k) % 24);
        if (d(j7)) {
            j4 = 0;
            f7 = 0;
        } else {
            j4 = 0;
            f7 = (int) (f(j7, c.f870j) % 60);
        }
        int f10 = d(j7) ? 0 : (int) (f(j7, c.f869i) % 60);
        int c7 = c(j7);
        boolean z6 = f8 != j4;
        boolean z7 = f9 != 0;
        boolean z8 = f7 != 0;
        boolean z9 = (f10 == 0 && c7 == 0) ? false : true;
        if (z6) {
            sb.append(f8);
            sb.append('d');
            i7 = 1;
        }
        if (z7 || (z6 && (z8 || z9))) {
            int i9 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            sb.append(f9);
            sb.append('h');
            i7 = i9;
        }
        if (z8 || (z9 && (z7 || z6))) {
            int i10 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            sb.append(f7);
            sb.append('m');
            i7 = i10;
        }
        if (z9) {
            int i11 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            if (f10 != 0 || z6 || z7 || z8) {
                b(sb, f10, c7, 9, "s", false);
            } else if (c7 >= 1000000) {
                b(sb, c7 / 1000000, c7 % 1000000, 6, "ms", false);
            } else if (c7 >= 1000) {
                b(sb, c7 / 1000, c7 % 1000, 3, "us", false);
            } else {
                sb.append(c7);
                sb.append("ns");
            }
            i7 = i11;
        }
        if (z5 && i7 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
