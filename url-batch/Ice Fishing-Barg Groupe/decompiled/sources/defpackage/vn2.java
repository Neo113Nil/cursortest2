package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vn2 implements Comparable {
    public static final un2 Companion = new un2();
    public final long rtx2ld2ELZv4;

    public /* synthetic */ vn2(long j) {
        this.rtx2ld2ELZv4 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return cs0.BRwzKIf41E4i(this.rtx2ld2ELZv4 ^ Long.MIN_VALUE, ((vn2) obj).rtx2ld2ELZv4 ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vn2) {
            return this.rtx2ld2ELZv4 == ((vn2) obj).rtx2ld2ELZv4;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.rtx2ld2ELZv4);
    }

    public final String toString() {
        return jh0.nLZGh9p8gVSu(10, this.rtx2ld2ELZv4);
    }
}
