package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hm2 implements Serializable {
    public final Object OPXfSBeufaJ8;
    public final Object rtx2ld2ELZv4;
    public final Object wdg6QnbFHrFF;

    public hm2(Object obj, Object obj2, Object obj3) {
        this.rtx2ld2ELZv4 = obj;
        this.OPXfSBeufaJ8 = obj2;
        this.wdg6QnbFHrFF = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm2)) {
            return false;
        }
        hm2 hm2Var = (hm2) obj;
        return cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, hm2Var.rtx2ld2ELZv4) && cs0.wdg6QnbFHrFF(this.OPXfSBeufaJ8, hm2Var.OPXfSBeufaJ8) && cs0.wdg6QnbFHrFF(this.wdg6QnbFHrFF, hm2Var.wdg6QnbFHrFF);
    }

    public final int hashCode() {
        Object obj = this.rtx2ld2ELZv4;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.OPXfSBeufaJ8;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.wdg6QnbFHrFF;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.rtx2ld2ELZv4 + ", " + this.OPXfSBeufaJ8 + ", " + this.wdg6QnbFHrFF + ')';
    }
}
