package defpackage;

import com.ice.fishing.grenza.R;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jv1 implements mb0 {
    public final xc0 PxuCJdSBwIXG;
    public final vc0 lS5Rgt96tfkO;

    public jv1(xc0 xc0Var, vc0 vc0Var) {
        this.PxuCJdSBwIXG = xc0Var;
        this.lS5Rgt96tfkO = vc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv1)) {
            return false;
        }
        jv1 jv1Var = (jv1) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, jv1Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO.equals(jv1Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return this.lS5Rgt96tfkO.PxuCJdSBwIXG.hashCode() + o0.lS5Rgt96tfkO(0, o0.lS5Rgt96tfkO(0, ((R.font.roboto * 31) + this.PxuCJdSBwIXG.rtx2ld2ELZv4) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(R.font.roboto, "ResourceFont(resId=", ", weight=");
        BRwzKIf41E4i.append(this.PxuCJdSBwIXG);
        BRwzKIf41E4i.append(", style=");
        BRwzKIf41E4i.append((Object) "Normal");
        BRwzKIf41E4i.append(", loadingStrategy=Blocking)");
        return BRwzKIf41E4i.toString();
    }
}
