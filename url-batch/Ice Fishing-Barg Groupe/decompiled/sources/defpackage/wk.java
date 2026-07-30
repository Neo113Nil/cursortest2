package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wk {
    public final int PxuCJdSBwIXG;
    public final int lS5Rgt96tfkO;

    public wk(int i, int i2) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk)) {
            return false;
        }
        wk wkVar = (wk) obj;
        return this.PxuCJdSBwIXG == wkVar.PxuCJdSBwIXG && this.lS5Rgt96tfkO == wkVar.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.lS5Rgt96tfkO) + (Integer.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", columnCount=");
        return o0.r3s1LDPKFs1S(sb, this.lS5Rgt96tfkO, ')');
    }
}
