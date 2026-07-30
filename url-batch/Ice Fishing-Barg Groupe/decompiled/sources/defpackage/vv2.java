package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vv2 {
    public final j9 PxuCJdSBwIXG;
    public final t70 lS5Rgt96tfkO;

    public /* synthetic */ vv2(j9 j9Var, t70 t70Var) {
        this.PxuCJdSBwIXG = j9Var;
        this.lS5Rgt96tfkO = t70Var;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof vv2)) {
            return false;
        }
        vv2 vv2Var = (vv2) obj;
        return ni0.BRwzKIf41E4i(this.PxuCJdSBwIXG, vv2Var.PxuCJdSBwIXG) && ni0.BRwzKIf41E4i(this.lS5Rgt96tfkO, vv2Var.lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.PxuCJdSBwIXG, this.lS5Rgt96tfkO});
    }

    public final String toString() {
        op0 op0Var = new op0(this);
        op0Var.wdg6QnbFHrFF(this.PxuCJdSBwIXG, "key");
        op0Var.wdg6QnbFHrFF(this.lS5Rgt96tfkO, "feature");
        return op0Var.toString();
    }
}
