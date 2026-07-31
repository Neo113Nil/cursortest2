package o2;

import A.k;
import O2.d;
import f2.j;
import n.t0;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0746a implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final long f7440e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f7441f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f7442g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final long f7443d;

    static {
        int i3 = AbstractC0747b.f7444a;
        f7440e = t0.h(4611686018427387903L);
        f7441f = t0.h(-4611686018427387903L);
    }

    public static final long a(long j3, long j4) {
        long j5 = 1000000;
        long j6 = j4 / j5;
        long j7 = j3 + j6;
        if (-4611686018426L > j7 || j7 >= 4611686018427L) {
            return t0.h(d.z(j7, -4611686018427387903L, 4611686018427387903L));
        }
        long j8 = ((j7 * j5) + (j4 - (j6 * j5))) << 1;
        int i3 = AbstractC0747b.f7444a;
        return j8;
    }

    public static final void b(StringBuilder sb, int i3, int i4, int i5, String str, boolean z3) {
        CharSequence charSequence;
        sb.append(i3);
        if (i4 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i4);
            j.f(valueOf, "<this>");
            if (i5 < 0) {
                throw new IllegalArgumentException(k.g(i5, "Desired length ", " is less than zero."));
            }
            if (i5 <= valueOf.length()) {
                charSequence = valueOf.subSequence(0, valueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i5);
                int length = i5 - valueOf.length();
                int i6 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i6 == length) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
                sb2.append((CharSequence) valueOf);
                charSequence = sb2;
            }
            String obj = charSequence.toString();
            int i7 = -1;
            int length2 = obj.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i8 = length2 - 1;
                    if (obj.charAt(length2) != '0') {
                        i7 = length2;
                        break;
                    } else if (i8 < 0) {
                        break;
                    } else {
                        length2 = i8;
                    }
                }
            }
            int i9 = i7 + 1;
            if (z3 || i9 >= 3) {
                sb.append((CharSequence) obj, 0, ((i7 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) obj, 0, i9);
            }
        }
        sb.append(str);
    }

    public static final boolean c(long j3) {
        return j3 == f7440e || j3 == f7441f;
    }

    public static final long d(long j3, long j4) {
        if (c(j3)) {
            if (!c(j4) || (j4 ^ j3) >= 0) {
                return j3;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (c(j4)) {
            return j4;
        }
        int i3 = ((int) j3) & 1;
        if (i3 != (((int) j4) & 1)) {
            return i3 == 1 ? a(j3 >> 1, j4 >> 1) : a(j4 >> 1, j3 >> 1);
        }
        long j5 = (j3 >> 1) + (j4 >> 1);
        if (i3 != 0) {
            return t0.i(j5);
        }
        if (-4611686018426999999L > j5 || j5 >= 4611686018427000000L) {
            return t0.h(j5 / 1000000);
        }
        long j6 = j5 << 1;
        int i4 = AbstractC0747b.f7444a;
        return j6;
    }

    public static final long e(long j3, EnumC0748c enumC0748c) {
        j.f(enumC0748c, "unit");
        if (j3 == f7440e) {
            return Long.MAX_VALUE;
        }
        if (j3 == f7441f) {
            return Long.MIN_VALUE;
        }
        long j4 = j3 >> 1;
        EnumC0748c enumC0748c2 = (((int) j3) & 1) == 0 ? EnumC0748c.NANOSECONDS : EnumC0748c.MILLISECONDS;
        j.f(enumC0748c2, "sourceUnit");
        return enumC0748c.f7452d.convert(j4, enumC0748c2.f7452d);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = ((C0746a) obj).f7443d;
        long j4 = this.f7443d;
        long j5 = j4 ^ j3;
        int i3 = 1;
        if (j5 >= 0 && (((int) j5) & 1) != 0) {
            int i4 = (((int) j4) & 1) - (((int) j3) & 1);
            return j4 < 0 ? -i4 : i4;
        }
        if (j4 < j3) {
            i3 = -1;
        } else if (j4 == j3) {
            i3 = 0;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0746a) {
            return this.f7443d == ((C0746a) obj).f7443d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7443d);
    }

    public final String toString() {
        int i3;
        long j3;
        int i4;
        StringBuilder sb;
        int i5;
        long j4 = this.f7443d;
        if (j4 == 0) {
            return "0s";
        }
        if (j4 == f7440e) {
            return "Infinity";
        }
        if (j4 == f7441f) {
            return "-Infinity";
        }
        boolean z3 = j4 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z3) {
            sb2.append('-');
        }
        if (j4 < 0) {
            j4 = (((int) j4) & 1) + ((-(j4 >> 1)) << 1);
            int i6 = AbstractC0747b.f7444a;
        }
        long e3 = e(j4, EnumC0748c.DAYS);
        int e4 = c(j4) ? 0 : (int) (e(j4, EnumC0748c.HOURS) % 24);
        int e5 = c(j4) ? 0 : (int) (e(j4, EnumC0748c.MINUTES) % 60);
        int e6 = c(j4) ? 0 : (int) (e(j4, EnumC0748c.SECONDS) % 60);
        if (c(j4)) {
            j3 = 0;
            i3 = 0;
        } else {
            i3 = (int) ((((int) j4) & 1) == 1 ? ((j4 >> 1) % 1000) * 1000000 : (j4 >> 1) % 1000000000);
            j3 = 0;
        }
        boolean z4 = e3 != j3;
        boolean z5 = e4 != 0;
        boolean z6 = e5 != 0;
        boolean z7 = (e6 == 0 && i3 == 0) ? false : true;
        if (z4) {
            sb2.append(e3);
            sb2.append('d');
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (z5 || (z4 && (z6 || z7))) {
            int i7 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            sb2.append(e4);
            sb2.append('h');
            i4 = i7;
        }
        if (z6 || (z7 && (z5 || z4))) {
            int i8 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            sb2.append(e5);
            sb2.append('m');
            i4 = i8;
        }
        if (z7) {
            i5 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            if (e6 != 0 || z4 || z5 || z6) {
                sb = sb2;
                b(sb, e6, i3, 9, "s", false);
            } else if (i3 >= 1000000) {
                sb = sb2;
                b(sb2, i3 / 1000000, i3 % 1000000, 6, "ms", false);
            } else {
                sb = sb2;
                if (i3 >= 1000) {
                    b(sb, i3 / 1000, i3 % 1000, 3, "us", false);
                } else {
                    sb.append(i3);
                    sb.append("ns");
                }
            }
        } else {
            sb = sb2;
            i5 = i4;
        }
        if (z3 && i5 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb3 = sb.toString();
        j.e(sb3, "toString(...)");
        return sb3;
    }
}
