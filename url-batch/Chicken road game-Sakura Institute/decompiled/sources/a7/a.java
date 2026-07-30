package a7;

import a0.m;
import a8.d;
import r6.k;
import v1.g;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final long f524g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f525h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f526i = 0;

    /* renamed from: f, reason: collision with root package name */
    public final long f527f;

    static {
        int i7 = b.f528a;
        f524g = d.B(4611686018427387903L);
        f525h = d.B(-4611686018427387903L);
    }

    public /* synthetic */ a(long j8) {
        this.f527f = j8;
    }

    public static final long a(long j8, long j9) {
        long j10 = 1000000;
        long j11 = j9 / j10;
        long j12 = j8 + j11;
        if (-4611686018426L > j12 || j12 >= 4611686018427L) {
            return d.B(g.f(j12, -4611686018427387903L, 4611686018427387903L));
        }
        long j13 = ((j12 * j10) + (j9 - (j11 * j10))) << 1;
        int i7 = b.f528a;
        return j13;
    }

    public static final void e(StringBuilder sb, int i7, int i8, int i9, String str, boolean z8) {
        CharSequence charSequence;
        sb.append(i7);
        if (i8 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i8);
            k.f(valueOf, "<this>");
            if (i9 < 0) {
                throw new IllegalArgumentException(m.g(i9, "Desired length ", " is less than zero."));
            }
            if (i9 <= valueOf.length()) {
                charSequence = valueOf.subSequence(0, valueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i9);
                int length = i9 - valueOf.length();
                int i10 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i10 == length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                sb2.append((CharSequence) valueOf);
                charSequence = sb2;
            }
            String obj = charSequence.toString();
            int i11 = -1;
            int length2 = obj.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i12 = length2 - 1;
                    if (obj.charAt(length2) != '0') {
                        i11 = length2;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        length2 = i12;
                    }
                }
            }
            int i13 = i11 + 1;
            if (z8 || i13 >= 3) {
                sb.append((CharSequence) obj, 0, ((i11 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) obj, 0, i13);
            }
        }
        sb.append(str);
    }

    public static final boolean g(long j8) {
        return j8 == f524g || j8 == f525h;
    }

    public static final long h(long j8, long j9) {
        if (g(j8)) {
            if (!g(j9) || (j9 ^ j8) >= 0) {
                return j8;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (g(j9)) {
            return j9;
        }
        int i7 = ((int) j8) & 1;
        if (i7 != (((int) j9) & 1)) {
            return i7 == 1 ? a(j8 >> 1, j9 >> 1) : a(j9 >> 1, j8 >> 1);
        }
        long j10 = (j8 >> 1) + (j9 >> 1);
        if (i7 != 0) {
            return d.C(j10);
        }
        if (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) {
            return d.B(j10 / 1000000);
        }
        long j11 = j10 << 1;
        int i8 = b.f528a;
        return j11;
    }

    public static final long l(long j8, c cVar) {
        k.f(cVar, "unit");
        if (j8 == f524g) {
            return Long.MAX_VALUE;
        }
        if (j8 == f525h) {
            return Long.MIN_VALUE;
        }
        long j9 = j8 >> 1;
        c cVar2 = (((int) j8) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS;
        k.f(cVar2, "sourceUnit");
        return cVar.f536f.convert(j9, cVar2.f536f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j8 = ((a) obj).f527f;
        long j9 = this.f527f;
        long j10 = j9 ^ j8;
        if (j10 >= 0 && (((int) j10) & 1) != 0) {
            int i7 = (((int) j9) & 1) - (((int) j8) & 1);
            return j9 < 0 ? -i7 : i7;
        }
        if (j9 < j8) {
            return -1;
        }
        return j9 == j8 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f527f == ((a) obj).f527f;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f527f);
    }

    public final String toString() {
        long j8;
        int l8;
        int i7;
        long j9;
        int i8;
        int i9;
        long j10 = this.f527f;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f524g) {
            return "Infinity";
        }
        if (j10 == f525h) {
            return "-Infinity";
        }
        boolean z8 = j10 < 0;
        StringBuilder sb = new StringBuilder();
        if (z8) {
            sb.append('-');
        }
        if (j10 < 0) {
            j10 = (((int) j10) & 1) + ((-(j10 >> 1)) << 1);
            int i10 = b.f528a;
        }
        long l9 = l(j10, c.DAYS);
        int l10 = g(j10) ? 0 : (int) (l(j10, c.HOURS) % 24);
        if (g(j10)) {
            j8 = 0;
            l8 = 0;
        } else {
            j8 = 0;
            l8 = (int) (l(j10, c.MINUTES) % 60);
        }
        int l11 = g(j10) ? 0 : (int) (l(j10, c.SECONDS) % 60);
        if (g(j10)) {
            i7 = 1;
            i8 = 0;
        } else {
            if ((((int) j10) & 1) == 1) {
                i7 = 1;
                j9 = ((j10 >> 1) % 1000) * 1000000;
            } else {
                i7 = 1;
                j9 = (j10 >> 1) % 1000000000;
            }
            i8 = (int) j9;
        }
        int i11 = l9 != j8 ? i7 : 0;
        int i12 = l10 != 0 ? i7 : 0;
        int i13 = l8 != 0 ? i7 : 0;
        int i14 = (l11 == 0 && i8 == 0) ? 0 : i7;
        if (i11 != 0) {
            sb.append(l9);
            sb.append('d');
            i9 = i7;
        } else {
            i9 = 0;
        }
        if (i12 != 0 || (i11 != 0 && (i13 != 0 || i14 != 0))) {
            int i15 = i9 + 1;
            if (i9 > 0) {
                sb.append(' ');
            }
            sb.append(l10);
            sb.append('h');
            i9 = i15;
        }
        if (i13 != 0 || (i14 != 0 && (i12 != 0 || i11 != 0))) {
            int i16 = i9 + 1;
            if (i9 > 0) {
                sb.append(' ');
            }
            sb.append(l8);
            sb.append('m');
            i9 = i16;
        }
        if (i14 != 0) {
            int i17 = i9 + 1;
            if (i9 > 0) {
                sb.append(' ');
            }
            if (l11 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
                e(sb, l11, i8, 9, "s", false);
            } else if (i8 >= 1000000) {
                e(sb, i8 / 1000000, i8 % 1000000, 6, "ms", false);
            } else if (i8 >= 1000) {
                e(sb, i8 / 1000, i8 % 1000, 3, "us", false);
            } else {
                sb.append(i8);
                sb.append("ns");
            }
            i9 = i17;
        }
        if (z8 && i9 > i7) {
            sb.insert(i7, '(').append(')');
        }
        String sb2 = sb.toString();
        k.e(sb2, "toString(...)");
        return sb2;
    }
}
