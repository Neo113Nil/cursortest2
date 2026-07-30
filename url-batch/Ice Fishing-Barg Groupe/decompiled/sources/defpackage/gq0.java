package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gq0 implements Comparable, Serializable {
    public final int OPXfSBeufaJ8;
    public final long rtx2ld2ELZv4;
    public static final fq0 Companion = new fq0();
    public static final gq0 wdg6QnbFHrFF = new gq0(0, -31557014167219200L);
    public static final gq0 dgRBjINgWbAK = new gq0(999999999, 31556889864403199L);

    public gq0(int i, long j) {
        this.rtx2ld2ELZv4 = j;
        this.OPXfSBeufaJ8 = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            u9.XL4ISE6Oc65B("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        gq0 gq0Var = (gq0) obj;
        gq0Var.getClass();
        int BRwzKIf41E4i = cs0.BRwzKIf41E4i(this.rtx2ld2ELZv4, gq0Var.rtx2ld2ELZv4);
        return BRwzKIf41E4i != 0 ? BRwzKIf41E4i : cs0.gPXPFXrUH4XX(this.OPXfSBeufaJ8, gq0Var.OPXfSBeufaJ8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq0)) {
            return false;
        }
        gq0 gq0Var = (gq0) obj;
        return this.rtx2ld2ELZv4 == gq0Var.rtx2ld2ELZv4 && this.OPXfSBeufaJ8 == gq0Var.OPXfSBeufaJ8;
    }

    public final int hashCode() {
        return (this.OPXfSBeufaJ8 * 51) + Long.hashCode(this.rtx2ld2ELZv4);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        io2.Companion.getClass();
        long j2 = this.rtx2ld2ELZv4;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + (i3 / 10));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        fx1.zf8DYfih6EZu(sb, sb, i4);
        sb.append('-');
        fx1.zf8DYfih6EZu(sb, sb, i5);
        sb.append('T');
        fx1.zf8DYfih6EZu(sb, sb, i7);
        sb.append(':');
        fx1.zf8DYfih6EZu(sb, sb, i9);
        sb.append(':');
        fx1.zf8DYfih6EZu(sb, sb, i10);
        int i12 = this.OPXfSBeufaJ8;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = fx1.lS5Rgt96tfkO;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            String valueOf = String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]);
            valueOf.getClass();
            sb.append(valueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
