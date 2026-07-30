package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class k implements ze0, Serializable {
    public final Class OPXfSBeufaJ8;
    public final int cpQdD2nAriOS;
    public final String dgRBjINgWbAK;
    public final int r3s1LDPKFs1S;
    public final Object rtx2ld2ELZv4;
    public final String wdg6QnbFHrFF;
    public final boolean x50lh2ztY7Y5 = false;

    public k(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.rtx2ld2ELZv4 = obj;
        this.OPXfSBeufaJ8 = cls;
        this.wdg6QnbFHrFF = str;
        this.dgRBjINgWbAK = str2;
        this.cpQdD2nAriOS = i;
        this.r3s1LDPKFs1S = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.x50lh2ztY7Y5 == kVar.x50lh2ztY7Y5 && this.cpQdD2nAriOS == kVar.cpQdD2nAriOS && this.r3s1LDPKFs1S == kVar.r3s1LDPKFs1S && this.rtx2ld2ELZv4.equals(kVar.rtx2ld2ELZv4) && this.OPXfSBeufaJ8.equals(kVar.OPXfSBeufaJ8) && this.wdg6QnbFHrFF.equals(kVar.wdg6QnbFHrFF) && this.dgRBjINgWbAK.equals(kVar.dgRBjINgWbAK);
    }

    public final int hashCode() {
        return ((((((this.dgRBjINgWbAK.hashCode() + ((this.wdg6QnbFHrFF.hashCode() + ((this.OPXfSBeufaJ8.hashCode() + (this.rtx2ld2ELZv4.hashCode() * 31)) * 31)) * 31)) * 31) + (this.x50lh2ztY7Y5 ? 1231 : 1237)) * 31) + this.cpQdD2nAriOS) * 31) + this.r3s1LDPKFs1S;
    }

    @Override // defpackage.ze0
    public final int lS5Rgt96tfkO() {
        return this.cpQdD2nAriOS;
    }

    public final String toString() {
        bu1.PxuCJdSBwIXG.getClass();
        return cu1.PxuCJdSBwIXG(this);
    }
}
