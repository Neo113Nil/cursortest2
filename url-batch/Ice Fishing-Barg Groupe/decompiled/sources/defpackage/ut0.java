package defpackage;

import kotlinx.serialization.json.Y1f8riQaR6yg;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ut0 extends Y1f8riQaR6yg {
    public final String OPXfSBeufaJ8;
    public final boolean rtx2ld2ELZv4;

    public ut0(String str, boolean z) {
        str.getClass();
        this.rtx2ld2ELZv4 = z;
        this.OPXfSBeufaJ8 = str.toString();
    }

    @Override // kotlinx.serialization.json.Y1f8riQaR6yg
    public final String PxuCJdSBwIXG() {
        return this.OPXfSBeufaJ8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ut0.class != obj.getClass()) {
            return false;
        }
        ut0 ut0Var = (ut0) obj;
        return this.rtx2ld2ELZv4 == ut0Var.rtx2ld2ELZv4 && cs0.wdg6QnbFHrFF(this.OPXfSBeufaJ8, ut0Var.OPXfSBeufaJ8);
    }

    public final int hashCode() {
        return this.OPXfSBeufaJ8.hashCode() + (Boolean.hashCode(this.rtx2ld2ELZv4) * 31);
    }

    @Override // kotlinx.serialization.json.Y1f8riQaR6yg
    public final String toString() {
        boolean z = this.rtx2ld2ELZv4;
        String str = this.OPXfSBeufaJ8;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        ga2.PxuCJdSBwIXG(sb, str);
        return sb.toString();
    }
}
