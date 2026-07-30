package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class u30 implements Comparable {
    public final long rtx2ld2ELZv4;
    public static final t30 Companion = new t30();
    public static final long OPXfSBeufaJ8 = mm2.ozEBbv0hFTAB(4611686018427387903L);
    public static final long wdg6QnbFHrFF = mm2.ozEBbv0hFTAB(-4611686018427387903L);
    public static final long dgRBjINgWbAK = 9223372036854759646L;

    public /* synthetic */ u30(long j) {
        this.rtx2ld2ELZv4 = j;
    }

    public static final long PxuCJdSBwIXG(long j, long j2) {
        long j3 = j2 / 1000000;
        long XL4ISE6Oc65B = mm2.XL4ISE6Oc65B(j, j3);
        if (-4611686018426L > XL4ISE6Oc65B || XL4ISE6Oc65B >= 4611686018427L) {
            return mm2.ozEBbv0hFTAB(XL4ISE6Oc65B);
        }
        return mm2.tmVwIGCQF4zR((XL4ISE6Oc65B * 1000000) + (j2 - (j3 * 1000000)));
    }

    public static final long RAsUl2FVSrh6(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        Companion.getClass();
        int i = v30.PxuCJdSBwIXG;
        return j2;
    }

    public static final int TSizfFm2Yiuu(long j) {
        if (Y1f8riQaR6yg(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean Y1f8riQaR6yg(long j) {
        return j == OPXfSBeufaJ8 || j == wdg6QnbFHrFF;
    }

    public static final long a92UlCVFR9N8(long j, x30 x30Var) {
        if (j == OPXfSBeufaJ8) {
            return Long.MAX_VALUE;
        }
        if (j == wdg6QnbFHrFF) {
            return Long.MIN_VALUE;
        }
        return x30Var.rtx2ld2ELZv4.convert(j >> 1, ((((int) j) & 1) == 0 ? x30.NANOSECONDS : x30.MILLISECONDS).rtx2ld2ELZv4);
    }

    public static final long e9gEMXR7LXtO(long j, long j2) {
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? PxuCJdSBwIXG(j >> 1, j2 >> 1) : PxuCJdSBwIXG(j2 >> 1, j >> 1);
        }
        if (i == 0) {
            long j3 = (j >> 1) + (j2 >> 1);
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? mm2.ozEBbv0hFTAB(j3 / 1000000) : mm2.tmVwIGCQF4zR(j3);
        }
        long XL4ISE6Oc65B = mm2.XL4ISE6Oc65B(j >> 1, j2 >> 1);
        if (XL4ISE6Oc65B != 9223372036854759646L) {
            return (XL4ISE6Oc65B == 4611686018427387903L || XL4ISE6Oc65B == -4611686018427387903L) ? mm2.ozEBbv0hFTAB(XL4ISE6Oc65B) : (-4611686018426L > XL4ISE6Oc65B || XL4ISE6Oc65B >= 4611686018427L) ? mm2.ozEBbv0hFTAB(ng0.dgRBjINgWbAK(XL4ISE6Oc65B)) : mm2.tmVwIGCQF4zR(XL4ISE6Oc65B * 1000000);
        }
        u9.XL4ISE6Oc65B("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    public static final void lS5Rgt96tfkO(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String e4HgwifUDUCA = ia2.e4HgwifUDUCA(String.valueOf(i2), i3);
            int i4 = -1;
            int length = e4HgwifUDUCA.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (e4HgwifUDUCA.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) e4HgwifUDUCA, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) e4HgwifUDUCA, 0, i6);
            }
        }
        sb.append(str);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((u30) obj).rtx2ld2ELZv4;
        long j2 = this.rtx2ld2ELZv4;
        long j3 = j2 ^ j;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return cs0.BRwzKIf41E4i(j2, j);
        }
        int i = (((int) j2) & 1) - (((int) j) & 1);
        return j2 < 0 ? -i : i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u30) {
            return this.rtx2ld2ELZv4 == ((u30) obj).rtx2ld2ELZv4;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.rtx2ld2ELZv4);
    }

    public final String toString() {
        long j = this.rtx2ld2ELZv4;
        if (j == 0) {
            return "0s";
        }
        if (j == OPXfSBeufaJ8) {
            return "Infinity";
        }
        if (j == wdg6QnbFHrFF) {
            return "-Infinity";
        }
        int i = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = RAsUl2FVSrh6(j);
        }
        long a92UlCVFR9N8 = a92UlCVFR9N8(j, x30.DAYS);
        int a92UlCVFR9N82 = Y1f8riQaR6yg(j) ? 0 : (int) (a92UlCVFR9N8(j, x30.HOURS) % 24);
        int a92UlCVFR9N83 = Y1f8riQaR6yg(j) ? 0 : (int) (a92UlCVFR9N8(j, x30.MINUTES) % 60);
        int a92UlCVFR9N84 = Y1f8riQaR6yg(j) ? 0 : (int) (a92UlCVFR9N8(j, x30.SECONDS) % 60);
        int TSizfFm2Yiuu = TSizfFm2Yiuu(j);
        boolean z2 = a92UlCVFR9N8 != 0;
        boolean z3 = a92UlCVFR9N82 != 0;
        boolean z4 = a92UlCVFR9N83 != 0;
        boolean z5 = (a92UlCVFR9N84 == 0 && TSizfFm2Yiuu == 0) ? false : true;
        if (z2) {
            sb.append(a92UlCVFR9N8);
            sb.append('d');
            i = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(a92UlCVFR9N82);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(a92UlCVFR9N83);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (a92UlCVFR9N84 != 0 || z2 || z3 || z4) {
                lS5Rgt96tfkO(sb, a92UlCVFR9N84, TSizfFm2Yiuu, 9, "s", false);
            } else if (TSizfFm2Yiuu >= 1000000) {
                lS5Rgt96tfkO(sb, TSizfFm2Yiuu / 1000000, TSizfFm2Yiuu % 1000000, 6, "ms", false);
            } else if (TSizfFm2Yiuu >= 1000) {
                lS5Rgt96tfkO(sb, TSizfFm2Yiuu / 1000, TSizfFm2Yiuu % 1000, 3, "us", false);
            } else {
                sb.append(TSizfFm2Yiuu);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
