package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dj extends fj {
    public final Throwable PxuCJdSBwIXG;

    public dj(Throwable th) {
        this.PxuCJdSBwIXG = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dj) {
            return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ((dj) obj).PxuCJdSBwIXG);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.PxuCJdSBwIXG;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.fj
    public final String toString() {
        return "Closed(" + this.PxuCJdSBwIXG + ')';
    }
}
