package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class tv {
    public long PxuCJdSBwIXG;
    public float lS5Rgt96tfkO;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv)) {
            return false;
        }
        tv tvVar = (tv) obj;
        return this.PxuCJdSBwIXG == tvVar.PxuCJdSBwIXG && Float.compare(this.lS5Rgt96tfkO, tvVar.lS5Rgt96tfkO) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.lS5Rgt96tfkO) + (Long.hashCode(this.PxuCJdSBwIXG) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", dataPoint=");
        return o0.cpQdD2nAriOS(sb, this.lS5Rgt96tfkO, ')');
    }
}
