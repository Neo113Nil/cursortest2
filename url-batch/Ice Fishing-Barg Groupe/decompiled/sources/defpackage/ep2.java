package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ep2 implements Comparable, Serializable {
    public static final dp2 Companion = new dp2();
    public static final ep2 wdg6QnbFHrFF = new ep2(0, 0);
    public final long OPXfSBeufaJ8;
    public final long rtx2ld2ELZv4;

    public ep2(long j, long j2) {
        this.rtx2ld2ELZv4 = j;
        this.OPXfSBeufaJ8 = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ep2 ep2Var = (ep2) obj;
        ep2Var.getClass();
        long j = ep2Var.rtx2ld2ELZv4;
        long j2 = this.rtx2ld2ELZv4;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.OPXfSBeufaJ8 ^ Long.MIN_VALUE, ep2Var.OPXfSBeufaJ8 ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep2)) {
            return false;
        }
        ep2 ep2Var = (ep2) obj;
        return this.rtx2ld2ELZv4 == ep2Var.rtx2ld2ELZv4 && this.OPXfSBeufaJ8 == ep2Var.OPXfSBeufaJ8;
    }

    public final int hashCode() {
        return Long.hashCode(this.rtx2ld2ELZv4 ^ this.OPXfSBeufaJ8);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        ni0.RfyTYNmI9Srp(this.rtx2ld2ELZv4, bArr, 0, 0, 4);
        bArr[8] = 45;
        ni0.RfyTYNmI9Srp(this.rtx2ld2ELZv4, bArr, 9, 4, 6);
        bArr[13] = 45;
        ni0.RfyTYNmI9Srp(this.rtx2ld2ELZv4, bArr, 14, 6, 8);
        bArr[18] = 45;
        ni0.RfyTYNmI9Srp(this.OPXfSBeufaJ8, bArr, 19, 0, 2);
        bArr[23] = 45;
        ni0.RfyTYNmI9Srp(this.OPXfSBeufaJ8, bArr, 24, 2, 8);
        return new String(bArr, pj.PxuCJdSBwIXG);
    }
}
