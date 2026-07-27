package kotlin.time;

import A.AbstractC0017m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class a implements Comparable<a> {

    /* renamed from: e, reason: collision with root package name */
    public static final C0004a f7548e = new C0004a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final long f7549i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f7550j;

    /* renamed from: d, reason: collision with root package name */
    public final long f7551d;

    @Metadata
    /* renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    public static final class C0004a {
        public C0004a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i2 = U2.a.f4129a;
        f7549i = b.b(4611686018427387903L);
        f7550j = b.b(-4611686018427387903L);
    }

    public static final long a(long j4, long j5) {
        long j6 = 1000000;
        long j7 = j5 / j6;
        long j8 = j4 + j7;
        if (-4611686018426L > j8 || j8 >= 4611686018427L) {
            return b.b(kotlin.ranges.b.f(j8, -4611686018427387903L, 4611686018427387903L));
        }
        long j9 = ((j8 * j6) + (j5 - (j7 * j6))) << 1;
        int i2 = U2.a.f4129a;
        return j9;
    }

    public static final void c(StringBuilder sb, int i2, int i4, int i5, String str, boolean z4) {
        CharSequence charSequence;
        sb.append(i2);
        if (i4 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i4);
            Intrinsics.checkNotNullParameter(valueOf, "<this>");
            Intrinsics.checkNotNullParameter(valueOf, "<this>");
            if (i5 < 0) {
                throw new IllegalArgumentException(AbstractC0017m.h(i5, "Desired length ", " is less than zero."));
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
            if (z4 || i9 >= 3) {
                sb.append((CharSequence) obj, 0, ((i7 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) obj, 0, i9);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final boolean e(long j4) {
        return j4 == f7549i || j4 == f7550j;
    }

    public static final long h(long j4, long j5) {
        if (e(j4)) {
            if (!e(j5) || (j5 ^ j4) >= 0) {
                return j4;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (e(j5)) {
            return j5;
        }
        int i2 = ((int) j4) & 1;
        if (i2 != (((int) j5) & 1)) {
            return i2 == 1 ? a(j4 >> 1, j5 >> 1) : a(j5 >> 1, j4 >> 1);
        }
        long j6 = (j4 >> 1) + (j5 >> 1);
        if (i2 != 0) {
            return b.c(j6);
        }
        if (-4611686018426999999L > j6 || j6 >= 4611686018427000000L) {
            return b.b(j6 / 1000000);
        }
        long j7 = j6 << 1;
        int i4 = U2.a.f4129a;
        return j7;
    }

    public static final long j(long j4, U2.b targetUnit) {
        Intrinsics.checkNotNullParameter(targetUnit, "unit");
        if (j4 == f7549i) {
            return Long.MAX_VALUE;
        }
        if (j4 == f7550j) {
            return Long.MIN_VALUE;
        }
        long j5 = j4 >> 1;
        U2.b sourceUnit = (((int) j4) & 1) == 0 ? U2.b.f4130e : U2.b.f4131i;
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.f4137d.convert(j5, sourceUnit.f4137d);
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        long j4 = aVar.f7551d;
        long j5 = this.f7551d;
        long j6 = j5 ^ j4;
        int i2 = 1;
        if (j6 >= 0 && (((int) j6) & 1) != 0) {
            int i4 = (((int) j5) & 1) - (((int) j4) & 1);
            return j5 < 0 ? -i4 : i4;
        }
        if (j5 < j4) {
            i2 = -1;
        } else if (j5 == j4) {
            i2 = 0;
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f7551d == ((a) obj).f7551d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7551d);
    }

    public final String toString() {
        int i2;
        long j4;
        int i4;
        StringBuilder sb;
        int i5;
        long j5 = this.f7551d;
        if (j5 == 0) {
            return "0s";
        }
        if (j5 == f7549i) {
            return "Infinity";
        }
        if (j5 == f7550j) {
            return "-Infinity";
        }
        boolean z4 = j5 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z4) {
            sb2.append('-');
        }
        if (j5 < 0) {
            j5 = (((int) j5) & 1) + ((-(j5 >> 1)) << 1);
            int i6 = U2.a.f4129a;
        }
        long j6 = j(j5, U2.b.f4135m);
        int j7 = e(j5) ? 0 : (int) (j(j5, U2.b.f4134l) % 24);
        int j8 = e(j5) ? 0 : (int) (j(j5, U2.b.f4133k) % 60);
        int j9 = e(j5) ? 0 : (int) (j(j5, U2.b.f4132j) % 60);
        if (e(j5)) {
            j4 = 0;
            i2 = 0;
        } else {
            i2 = (int) ((((int) j5) & 1) == 1 ? ((j5 >> 1) % 1000) * 1000000 : (j5 >> 1) % 1000000000);
            j4 = 0;
        }
        boolean z5 = j6 != j4;
        boolean z6 = j7 != 0;
        boolean z7 = j8 != 0;
        boolean z8 = (j9 == 0 && i2 == 0) ? false : true;
        if (z5) {
            sb2.append(j6);
            sb2.append('d');
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (z6 || (z5 && (z7 || z8))) {
            int i7 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            sb2.append(j7);
            sb2.append('h');
            i4 = i7;
        }
        if (z7 || (z8 && (z6 || z5))) {
            int i8 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            sb2.append(j8);
            sb2.append('m');
            i4 = i8;
        }
        if (z8) {
            i5 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            if (j9 != 0 || z5 || z6 || z7) {
                sb = sb2;
                c(sb, j9, i2, 9, "s", false);
            } else if (i2 >= 1000000) {
                sb = sb2;
                c(sb2, i2 / 1000000, i2 % 1000000, 6, "ms", false);
            } else {
                sb = sb2;
                if (i2 >= 1000) {
                    c(sb, i2 / 1000, i2 % 1000, 3, "us", false);
                } else {
                    sb.append(i2);
                    sb.append("ns");
                }
            }
        } else {
            sb = sb2;
            i5 = i4;
        }
        if (z4 && i5 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
