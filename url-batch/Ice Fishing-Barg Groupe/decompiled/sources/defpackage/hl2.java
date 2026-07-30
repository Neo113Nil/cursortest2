package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hl2 {
    public final m70 PxuCJdSBwIXG;
    public final Map TSizfFm2Yiuu;
    public final boolean lS5Rgt96tfkO;

    public /* synthetic */ hl2(m70 m70Var, sj0 sj0Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : m70Var, (i & 8) != 0 ? null : sj0Var, (i & 32) == 0, (i & 64) != 0 ? q50.rtx2ld2ELZv4 : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl2)) {
            return false;
        }
        hl2 hl2Var = (hl2) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, hl2Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(null, null) && this.lS5Rgt96tfkO == hl2Var.lS5Rgt96tfkO && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, hl2Var.TSizfFm2Yiuu);
    }

    public final int hashCode() {
        m70 m70Var = this.PxuCJdSBwIXG;
        return this.TSizfFm2Yiuu.hashCode() + o0.Y1f8riQaR6yg((((m70Var == null ? 0 : m70Var.hashCode()) * 29791) + 0) * 961, 31, this.lS5Rgt96tfkO);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.PxuCJdSBwIXG + ", slide=null, changeSize=null, scale=" + ((Object) null) + ", veil=null, hold=" + this.lS5Rgt96tfkO + ", effectsMap=" + this.TSizfFm2Yiuu + ')';
    }

    public hl2(m70 m70Var, sj0 sj0Var, boolean z, Map map) {
        this.PxuCJdSBwIXG = m70Var;
        this.lS5Rgt96tfkO = z;
        this.TSizfFm2Yiuu = map;
    }
}
