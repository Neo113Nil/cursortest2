package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vi1 implements Serializable {
    public final Object OPXfSBeufaJ8;
    public final Object rtx2ld2ELZv4;

    public vi1(Object obj, Object obj2) {
        this.rtx2ld2ELZv4 = obj;
        this.OPXfSBeufaJ8 = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi1)) {
            return false;
        }
        vi1 vi1Var = (vi1) obj;
        return cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, vi1Var.rtx2ld2ELZv4) && cs0.wdg6QnbFHrFF(this.OPXfSBeufaJ8, vi1Var.OPXfSBeufaJ8);
    }

    public final int hashCode() {
        Object obj = this.rtx2ld2ELZv4;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.OPXfSBeufaJ8;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.rtx2ld2ELZv4 + ", " + this.OPXfSBeufaJ8 + ')';
    }
}
