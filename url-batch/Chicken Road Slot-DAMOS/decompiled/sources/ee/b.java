package ee;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f3956e = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final long f3957i = i.b(4611686018427387903L);

    /* renamed from: r, reason: collision with root package name */
    public static final long f3958r = i.b(-4611686018427387903L);

    /* renamed from: s, reason: collision with root package name */
    public static final long f3959s = 9223372036854759646L;

    /* renamed from: d, reason: collision with root package name */
    public final long f3960d;

    public static final long a(long j, long j3) {
        long j10 = 1000000;
        long j11 = j3 / j10;
        long a9 = i.a(j, j11);
        if (-4611686018426L > a9 || a9 >= 4611686018427L) {
            return i.b(a9);
        }
        return i.c((a9 * j10) + (j3 - (j11 * j10)));
    }

    public static final void b(StringBuilder sb2, int i3, int i10, int i11, String str, boolean z10) {
        sb2.append(i3);
        if (i10 != 0) {
            sb2.append('.');
            String t6 = StringsKt.t(i11, String.valueOf(i10));
            int i12 = -1;
            int length = t6.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (t6.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (z10 || i14 >= 3) {
                sb2.append((CharSequence) t6, 0, ((i12 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) t6, 0, i14);
            }
        }
        sb2.append(str);
    }

    public static final int c(long j) {
        if (d(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean d(long j) {
        return j == f3957i || j == f3958r;
    }

    public static final long e(long j, long j3) {
        int i3 = ((int) j) & 1;
        if (i3 != (((int) j3) & 1)) {
            return i3 == 1 ? a(j >> 1, j3 >> 1) : a(j3 >> 1, j >> 1);
        }
        if (i3 == 0) {
            long j10 = (j >> 1) + (j3 >> 1);
            return (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) ? i.b(j10 / 1000000) : i.c(j10);
        }
        long a9 = i.a(j >> 1, j3 >> 1);
        if (a9 != 9223372036854759646L) {
            return (a9 == 4611686018427387903L || a9 == -4611686018427387903L) ? i.b(a9) : (-4611686018426L > a9 || a9 >= 4611686018427L) ? i.b(be.f.d(a9)) : i.c(a9 * 1000000);
        }
        a1.e("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    public static final long f(long j, d dVar) {
        if (j == f3957i) {
            return Long.MAX_VALUE;
        }
        if (j == f3958r) {
            return Long.MIN_VALUE;
        }
        return dVar.f3970d.convert(j >> 1, ((((int) j) & 1) == 0 ? d.NANOSECONDS : d.MILLISECONDS).f3970d);
    }

    public static String g(long j) {
        long j3;
        int f3;
        if (j == 0) {
            return "0s";
        }
        if (j == f3957i) {
            return "Infinity";
        }
        if (j == f3958r) {
            return "-Infinity";
        }
        int i3 = 0;
        boolean z10 = j < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        long h10 = j < 0 ? h(j) : j;
        long f10 = f(h10, d.DAYS);
        int f11 = d(h10) ? 0 : (int) (f(h10, d.HOURS) % 24);
        if (d(h10)) {
            j3 = 0;
            f3 = 0;
        } else {
            j3 = 0;
            f3 = (int) (f(h10, d.MINUTES) % 60);
        }
        int f12 = d(h10) ? 0 : (int) (f(h10, d.SECONDS) % 60);
        int c10 = c(h10);
        boolean z11 = f10 != j3;
        boolean z12 = f11 != 0;
        boolean z13 = f3 != 0;
        boolean z14 = (f12 == 0 && c10 == 0) ? false : true;
        if (z11) {
            sb2.append(f10);
            sb2.append('d');
            i3 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i10 = i3 + 1;
            if (i3 > 0) {
                sb2.append(' ');
            }
            sb2.append(f11);
            sb2.append('h');
            i3 = i10;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i11 = i3 + 1;
            if (i3 > 0) {
                sb2.append(' ');
            }
            sb2.append(f3);
            sb2.append('m');
            i3 = i11;
        }
        if (z14) {
            int i12 = i3 + 1;
            if (i3 > 0) {
                sb2.append(' ');
            }
            if (f12 != 0 || z11 || z12 || z13) {
                b(sb2, f12, c10, 9, "s", false);
            } else if (c10 >= 1000000) {
                b(sb2, c10 / 1000000, c10 % 1000000, 6, "ms", false);
            } else if (c10 >= 1000) {
                b(sb2, c10 / 1000, c10 % 1000, 3, "us", false);
            } else {
                sb2.append(c10);
                sb2.append("ns");
            }
            i3 = i12;
        }
        if (z10 && i3 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long h(long j) {
        long j3 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        f3956e.getClass();
        int i3 = c.f3961a;
        return j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((b) obj).f3960d;
        long j3 = this.f3960d;
        long j10 = j3 ^ j;
        if (j10 < 0 || (((int) j10) & 1) == 0) {
            return Intrinsics.c(j3, j);
        }
        int i3 = (((int) j3) & 1) - (((int) j) & 1);
        return j3 < 0 ? -i3 : i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f3960d == ((b) obj).f3960d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3960d);
    }

    public final String toString() {
        return g(this.f3960d);
    }
}
