package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class yx extends la0 {
    public final tx r;

    public yx(tx txVar) {
        txVar.getClass();
        this.r = txVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && yx.class == obj.getClass() && kr.b(this.r, ((yx) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.r + ", direction=-1)";
    }
}
