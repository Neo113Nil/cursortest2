package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fn0 {
    public final en0 PxuCJdSBwIXG;
    public final int lS5Rgt96tfkO;

    public fn0(en0 en0Var, int i) {
        this.PxuCJdSBwIXG = en0Var;
        this.lS5Rgt96tfkO = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn0)) {
            return false;
        }
        fn0 fn0Var = (fn0) obj;
        return this.PxuCJdSBwIXG.equals(fn0Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == fn0Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.lS5Rgt96tfkO) + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", configFlags=");
        return o0.r3s1LDPKFs1S(sb, this.lS5Rgt96tfkO, ')');
    }
}
