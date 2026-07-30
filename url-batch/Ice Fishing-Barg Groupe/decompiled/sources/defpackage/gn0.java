package defpackage;

import android.content.res.Resources;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gn0 {
    public final Resources.Theme PxuCJdSBwIXG;
    public final int lS5Rgt96tfkO;

    public gn0(Resources.Theme theme, int i) {
        this.PxuCJdSBwIXG = theme;
        this.lS5Rgt96tfkO = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn0)) {
            return false;
        }
        gn0 gn0Var = (gn0) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, gn0Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == gn0Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.lS5Rgt96tfkO) + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", id=");
        return o0.r3s1LDPKFs1S(sb, this.lS5Rgt96tfkO, ')');
    }
}
