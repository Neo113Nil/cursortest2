package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ri {
    public static final qi Companion = new qi();
    public static final ri TSizfFm2Yiuu = new ri(zk.l(new ArrayList()), null);
    public final Set PxuCJdSBwIXG;
    public final pi lS5Rgt96tfkO;

    public ri(Set set, pi piVar) {
        this.PxuCJdSBwIXG = set;
        this.lS5Rgt96tfkO = piVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ri)) {
            return false;
        }
        ri riVar = (ri) obj;
        return riVar.PxuCJdSBwIXG.equals(this.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(riVar.lS5Rgt96tfkO, this.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        int hashCode = (this.PxuCJdSBwIXG.hashCode() + 1517) * 41;
        pi piVar = this.lS5Rgt96tfkO;
        return hashCode + (piVar != null ? piVar.hashCode() : 0);
    }
}
