package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class nv extends j8 {
    public final hv k;

    public nv(hv hvVar) {
        hvVar.getClass();
        this.k = hvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && nv.class == obj.getClass() && op.d(this.k, ((nv) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.k + ", direction=-1)";
    }
}
