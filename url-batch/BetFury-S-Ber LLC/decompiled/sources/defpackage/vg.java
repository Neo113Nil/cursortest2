package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class vg extends j {
    public static final sl h = new sl();
    public final String g;

    public vg() {
        super(h);
        this.g = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vg) && mv.c(this.g, ((vg) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.g + ')';
    }
}
